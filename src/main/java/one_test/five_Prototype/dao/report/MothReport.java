package one_test.five_Prototype.dao.report;

public class MothReport extends Report {

    public MothReport(){
        type = "MothReport";
    }

    @Override
    public void printReport() {
        System.out.println("MothReport: "+ "\n" +
                "Report ID: " + reportId + "\n" +
                "Report Title: " + reportTitle + "\n" +
                "Report Date: " + reportDate + "\n" +
                "Report Time: " + reportTime + "\n" +
                "Report Data: " + reportData);
    }
}
