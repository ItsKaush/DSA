package designPattern.Builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder().setName("Kaush").setAge(30).setEmail("k@gmail").setPsp(10).build();

        System.out.println(student + " Student Name: " + student.getName() + " Student age: " + student.getAge());

    }
}
