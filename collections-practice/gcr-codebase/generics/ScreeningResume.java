
import java.util.*;

public class ScreeningResume{  // main class
    public static void main(String[] args) {
        Resume<SoftwareEngineer> seResume = new Resume<>(new SoftwareEngineer("Kuldeep"));
        Resume<DataScientist> dsResume = new Resume<>(new DataScientist("Ananya"));
        Resume<ProductManager> pmResume = new Resume<>(new ProductManager("Rohit"));

        List<JobRole> allResumes = new ArrayList<>();
        allResumes.add(seResume.getJobRole());
        allResumes.add(dsResume.getJobRole());
        allResumes.add(pmResume.getJobRole());

        System.out.println("Resume Screening:\n");
        ResumeUtil.screenResumes(allResumes);
    }
}
abstract class JobRole {  // abstract class JobRole
    private String candidateName;

    public JobRole(String candidateName) {  // constructor
        this.candidateName = candidateName;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public abstract String evaluateResume();  // abstract method
}

class SoftwareEngineer extends JobRole {  // class SoftwareEngineer extends abstract JobRole
    public SoftwareEngineer(String name) {
        super(name);
    }

    @Override
    public String evaluateResume() {
        return "Software Engineer Resume Evaluation for " + getCandidateName();
    }
}

class DataScientist extends JobRole {// class DataScientist extends abstract JobRole
    public DataScientist(String name) {
        super(name);
    }

    @Override
    public String evaluateResume() {
        return "Data Scientist Resume Evaluation for " + getCandidateName();
    }
}

class ProductManager extends JobRole {// class ProductManager extends abstract JobRole
    public ProductManager(String name) {
        super(name);
    }

    @Override
    public String evaluateResume() {
        return "Product Manager Resume Evaluation for " + getCandidateName();
    }
}

class Resume<T extends JobRole> { // generic class Resume
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public void process() {
        System.out.println(jobRole.evaluateResume());
    }
}

class ResumeUtil {
    public static void screenResumes(List<? extends JobRole> resumes) { // generic method and use upper bound to read only
        for (JobRole role : resumes) {
            System.out.println(role.evaluateResume());
        }
    }
}


