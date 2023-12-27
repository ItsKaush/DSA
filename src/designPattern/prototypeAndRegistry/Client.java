package designPattern.prototypeAndRegistry;

public class Client {
    //Need method to add acreate a prototype and save in teh registry
    public static void fillRegistry(StudentRegistry registry){
        Student aprilBatch = new Student();
        aprilBatch.setAvgPsp(45.0);
        aprilBatch.setBatchName("April21");

        registry.register("April21", aprilBatch);

        IntelligentStudent april21IntellStudent = new IntelligentStudent();
        april21IntellStudent.setAvgPsp(85.0);
        april21IntellStudent.setBatchName("April21IntelligentStudents");

        registry.register("April21IntellStudents", april21IntellStudent);
    }

    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student naman = registry.get("April22").copy();
        naman.setName("Naman");
        naman.setEmail("n@gmail.com");
        naman.setPsp(57.0);
    }
}
