package rocks.zipcode.io.quiz3.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private Map<String, Lab> labMap;
    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
        labMap = new HashMap<>();
        if(labs != null) {
            for (Lab lab : labs) {
                labMap.put(lab.getName(), lab);
            }
        }
    }
    public Lab getLab(String labName) {
        return labMap.get(labName);
    }

    public void setLabStatus(String labName, LabStatus labStatus) {

        Lab lab = labMap.get(labName);
        if(lab != null)
            lab.setStatus(labStatus);
        else{
            throw new UnsupportedOperationException();
        }
    }

    public void forkLab(Lab lab) {
        lab.setStatus(LabStatus.PENDING);
        labMap.put(lab.getName(), lab);
    }

    public LabStatus getLabStatus(String labName) {

        return labMap.getOrDefault(labName, new Lab("default")).getStatus();
    }
}
