package AOP.annotation.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class ALogUtil {

    @Pointcut("execution(public Integer AOP.annotation.service.MyCalculator.add(..) )")
    public void myPointCut(){}

    @Around("myPointCut()")

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        Object[] args = pjp.getArgs();
        Object result = null;
        try {
            System.out.println("ALogUtil---环绕通知start："+signature.getName()+"方法开始执行，参数为："+Arrays.asList(args));
            result = pjp.proceed(args);
        } catch (Throwable throwable) {
            System.out.println("ALogUtil---环绕异常通知："+signature.getName()+"出现异常");
            throw throwable;
        }finally {
            System.out.println("ALogUtil---环绕返回stop："+signature.getName()+"方法返回结果是："+result);
        }
        return result;
    }

    @Before(value = "myPointCut()")
    private int start(JoinPoint joinPoint){
        //获取方法签名
        Signature signature = joinPoint.getSignature();
        //获取参数信息
        Object[] args = joinPoint.getArgs();
        System.out.println("ALogUtil---@Before方法开始执行：参数是"+Arrays.asList(args));
        return 100;
    }

    @After("myPointCut()")
    public static void logFinally(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        System.out.println("ALogUtil---@After方法执行结束。。。。。over");
    }


    @AfterReturning(value = "myPointCut()",returning = "result")
    public static void stop(JoinPoint joinPoint,Object result){
        Signature signature = joinPoint.getSignature();
        System.out.println("ALogUtil---@AfterReturning方法执行结束，结果是："+result);
    }

    /**
     * <ul>在 AspectJ 语义中，仅当抛出的异常是给定抛出类型的子类型时，才会调用指定抛出子句的抛出后通知</ul>
     * @param joinPoint
     * @param e
     */
    @AfterThrowing(value = "myPointCut()",throwing = "e")
    public static void logException(JoinPoint joinPoint,Exception e){
        Signature signature = joinPoint.getSignature();
        System.out.println("ALogUtil---@AfterThrowing方法抛出异常："+e.getMessage());
    }
}
