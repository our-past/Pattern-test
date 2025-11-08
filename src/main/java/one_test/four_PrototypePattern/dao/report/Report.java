package one_test.four_PrototypePattern.dao.report;

import one_test.four_PrototypePattern.contact.Prototype;
import lombok.Data;

@Data
public abstract class Report implements Prototype<Report> {

    String reportId;
    String type;
    String reportTitle;
    String reportDate;
    String reportTime;
    String reportData;

    @Override
    public Report clone(){
        Report cloneObj = null;
        try {
            cloneObj = (Report) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloneObj;
    }

    @Override
    public String getId(){
        return reportId;
    }

    public abstract void printReport();
}
