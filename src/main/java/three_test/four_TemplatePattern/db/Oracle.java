package three_test.four_TemplatePattern.db;

import three_test.four_TemplatePattern.dbTemplate.DatabaseTemplate;

public class Oracle extends DatabaseTemplate {
        @Override
        public void connDB() {
            System.out.println("使用Oracle数据库进行连接");
        }
        @Override
        public void startDB() {
            System.out.println("Oracle数据库启动");
        }
        @Override
        public void showDB() {
            System.out.print("Oracle数据库展示");
        }
}
