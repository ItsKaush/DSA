package designPattern.prototypeAndRegistry;

public class Student implements Prototype<Student> {
    private String name;
    private String email;
    private double psp;
    private double avgPsp;
    private String batchName;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getPsp() {
        return psp;
    }

    public double getAvgPsp() {
        return avgPsp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setAvgPsp(double avgPsp) {
        this.avgPsp = avgPsp;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Override
    public Student copy() {
        Student student = new Student();
        student.batchName = this.batchName;
        student.avgPsp = this.avgPsp;
        student.name = this.name;
        student.email = this.email;
        student.psp = this.psp;

        return student;
    }
}
