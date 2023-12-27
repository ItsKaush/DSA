package designPattern.Builder;

public class Student {
    private String name;
    private String email;
    private int age;
    private double psp;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public double getPsp() {
        return psp;
    }

    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.psp = builder.psp;
        this.email = builder.email;

    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private String name;
        private String email;
        private int age;
        private double psp;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setPsp(double psp){
            this.psp = psp;
            return this;
        }


        public Student build(){
            //Here will have all the validations on the attributes of the student and create an object of the student
            if (!isAgeValid(age)){
                throw new RuntimeException("Age can not be less than 20");
            }

            if (!isPspValid(psp)){
                throw new RuntimeException("Psp can not be negative or more than 100");
            }

            return new Student(this);
        }

        public boolean isAgeValid(int age){
            if(age > 20){
                return true;
            }
            return false;
        }

        public boolean isPspValid(double psp){
            if (psp < 0 || psp > 100){
                return false;
            }
            return true;
        }
    }
}
