package three_test.four_TemplatePattern.dbTemplate;

public abstract class DatabaseTemplate {

    public  abstract void connDB();
    public  abstract void startDB();
    public abstract void showDB();

    public final void openDB() {
        showDB();
        System.out.println("打开数据库连接");
    }

    public final void useDB() {
        showDB();
        System.out.println("使用数据库");
    }

    public final void closeDB() {
        showDB();
        System.out.println("关闭数据库连接");
    }

    public final void runDB() {
        startDB();
        connDB();
        openDB();
        useDB();
        closeDB();
    }
}
