package one_test.four_PrototypePattern.cache;

import one_test.four_PrototypePattern.dao.report.MothReport;
import one_test.four_PrototypePattern.dao.report.Report;
import one_test.four_PrototypePattern.dao.report.WeeklyReport;
import lombok.Data;

@Data
public class ReportCache {

    public static void addReport(Report report){
        Cache.addPrototype(report);
    }

    public static Report getReport(String reportId){
        return Cache.getPrototype(reportId, Report.class);
    }

    public static void loadReports(){
        MothReport mothReport = new MothReport();
        mothReport.setReportId("MothReport");
        addReport(mothReport);

        WeeklyReport weeklyReport = new WeeklyReport();
        weeklyReport.setReportId("WeeklyReport");
        addReport(weeklyReport);
    }
}
