package MyFactoryBean;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyFactoryBean implements FactoryBean<User> {

    //返回对象实例
    @Override
    public User getObject() throws Exception {
        //任何创建对象的操作
        return new User("zhangsan");
    }
    //返回对象类型
    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    //返回管理的对象是否单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
