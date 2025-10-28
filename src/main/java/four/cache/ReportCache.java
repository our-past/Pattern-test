package four.cache;

import four.dao.report.MothReport;
import four.dao.report.Report;
import four.dao.report.WeeklyReport;
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
