package one_test.five_Prototype;

import one_test.five_Prototype.cache.PrototypeRegistry;
import one_test.five_Prototype.contact.Prototype;
import one_test.five_Prototype.dao.report.WeeklyReport;

public class PrototypeDemo {
    public static void main(String[] args) {
        // 获取所有已注册的原型类名
        System.out.println("Available prototypes: " + PrototypeRegistry.getAllPrototypeNames());
        
        // 获取WeeklyReport的克隆实例
        Prototype weeklyReport = PrototypeRegistry.getClone("WeeklyReport");
        if (weeklyReport instanceof WeeklyReport report) {
            report.setReportId("WR001");
            report.setReportTitle("Weekly Project Progress");
            report.setReportDate("2023-10-15");
            report.setReportTime("10:00 AM");
            report.setReportData("Weekly project progress summary...");
            report.printReport();
        }
    }
}