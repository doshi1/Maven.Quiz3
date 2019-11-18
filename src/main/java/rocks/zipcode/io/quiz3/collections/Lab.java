package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String name;
    private LabStatus labstatus;
    public Lab() { this(null); }

    public Lab(String labName) {
        this.name = labName;
        this.labstatus = LabStatus.COMPLETED;
    }

    public String getName() {
        return name;
    }

    public void setStatus(LabStatus labStatus) { this.labstatus = labStatus;
    }

    public LabStatus getStatus() {
        return labstatus;
    }
}
