package three_test.four_TemplatePattern.db;

import three_test.four_TemplatePattern.dbTemplate.DatabaseTemplate;

public class SQLServer extends DatabaseTemplate {
        @Override
        public void connDB() {
            System.out.println("使用SQLServer数据库进行连接");
        }
        @Override
        public void startDB() {
            System.out.println("SQLServer数据库启动");
        }
        @Override
        public void showDB() {
            System.out.print("SQLServer数据库展示");
        }
}
