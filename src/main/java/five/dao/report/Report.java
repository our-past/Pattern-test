package five.dao.report;

import five.contact.Prototype;
import lombok.Data;

@Data
public abstract class Report implements Prototype {

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
    public String getType(){
        return type;
    }

    public abstract void printReport();
}
