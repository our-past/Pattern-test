package one_test.two_AbstractFactoryPattern.factory.produceer;

import one_test.two_AbstractFactoryPattern.factory.AbstractFactory;
import one_test.two_AbstractFactoryPattern.factory.MysqlFactory;
import one_test.two_AbstractFactoryPattern.factory.OracleFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Oracle")){
            System.out.println("创建Oracle工厂");
            return new OracleFactory();
        } else if(choice.equalsIgnoreCase("Mysql")){
            System.out.println("创建Mysql工厂");
            return new MysqlFactory();
        }
        return null;
    }
}
