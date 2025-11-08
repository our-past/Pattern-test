package one_test.four_PrototypePattern;

import one_test.four_PrototypePattern.cache.ReportCache;
import one_test.four_PrototypePattern.dao.report.Report;

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
