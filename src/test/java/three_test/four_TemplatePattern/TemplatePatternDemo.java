package three_test.four_TemplatePattern;

import three_test.four_TemplatePattern.db.Oracle;
import three_test.four_TemplatePattern.db.SQLServer;
import three_test.four_TemplatePattern.dbTemplate.DatabaseTemplate;

public class TemplatePatternDemo {
        public static void main(String[] args) {
            System.out.println("使用模板模式进行数据库操作");
            System.out.println("使用SQLServer数据库进行操作");
            DatabaseTemplate sqlServer = new SQLServer();
            sqlServer.runDB();
            System.out.println("使用Oracle数据库进行操作");
            DatabaseTemplate oracle = new Oracle();
            oracle.runDB();
        }
}
