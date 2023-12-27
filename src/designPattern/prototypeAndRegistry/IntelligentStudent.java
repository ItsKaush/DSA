package designPattern.prototypeAndRegistry;

public class IntelligentStudent extends Student{
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }


    @Override
    public IntelligentStudent copy() {
        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setName(this.getName());
        intelligentStudent.setAvgPsp(this.getAvgPsp());
        intelligentStudent.setPsp(this.getPsp());
        intelligentStudent.setEmail(this.getEmail());
        intelligentStudent.setBatchName(this.getBatchName());
        intelligentStudent.iq = this.iq;

        return intelligentStudent;
    }
}
