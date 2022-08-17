package MyFunctionalInterface;

import java.util.Optional;
import java.util.function.*;
import java.util.stream.Stream;

/**
 * 函数式编程
 */
public class Test {
    public static void main(String[] args) {
        Consumer<Integer> consumer = System.out::println;
        consumer.accept(134);

        Function<Integer, Integer> function = (i) -> {
            System.out.println("i = " + i);
            return   i ;
        };
       int a= function.apply(1234);
        System.out.println("a = " + a);
        Predicate<Integer> predicate= t->{
            if(t==2) return   true;
            return  false;
        };
        System.out.println(predicate.test(3));

        Supplier<Integer> supplier=()->{
            return   2;
        };
        System.out.println(supplier.get());

        Stream<String> stream=Stream.of("test","zzzzz","aaaaa","adsfwf","2ousf");
        stream.flatMap(n->Stream.of(n.split(""))).forEach(System.out::println);
        Optional<String> optional=Optional.ofNullable("Optional");
        System.out.println(" optional.toString() = " +  optional.toString());

        UnaryOperator<Integer> unaryOperator;
        BinaryOperator<Integer> binaryOperator;
        BiFunction<Integer,Integer,String> biFunction;
    }
}
