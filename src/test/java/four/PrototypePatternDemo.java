package four;

import four.cache.ReportCache;
import four.dao.report.Report;
import four.dao.report.WeeklyReport;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ReportCache.loadReports();

        Report clonedReport = ReportCache.getReport("WeeklyReport");
        clonedReport.setReportTitle("Cloned Weekly Report");
        clonedReport.setReportDate("2023-01-01");
        clonedReport.setReportTime("10:00");
        clonedReport.setReportData("Cloned Weekly Report Data");
        clonedReport.printReport();

        Report clonedMothReport = ReportCache.getReport("MothReport");
        clonedMothReport.setReportTitle("Cloned Moth Report");
        clonedMothReport.setReportDate("2023-01-01");
        clonedMothReport.setReportTime("10:00");
        clonedMothReport.setReportData("Cloned Moth Report Data");
        clonedMothReport.printReport();
    }
}
