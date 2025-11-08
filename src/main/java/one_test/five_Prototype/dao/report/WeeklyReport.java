package one_test.five_Prototype.dao.report;

public class WeeklyReport extends Report {

    public WeeklyReport(){
        type = "WeeklyReport";
    }

    @Override
    public void printReport() {
        System.out.println("WeeklyReport: "+ "\n" +
                "Report ID: " + reportId + "\n" +
                "Report Title: " + reportTitle + "\n" +
                "Report Date: " + reportDate + "\n" +
                "Report Time: " + reportTime + "\n" +
                "Report Data: " + reportData);
    }
}
