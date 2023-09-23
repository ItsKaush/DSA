package Intermediate.Intermediate_Lec_10_Modular_Arithmetic;

public class DivisibilityBy8 {
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int isDivisibleBy8(){
        //If number is greater than 10 then check only last 2 digits
        if(number.length()>2){
            int num = 100*(int)number.charAt(number.length()-3)  + 10*(int)number.charAt(number.length()-2) + (int)number.charAt(number.length()-1);
            if(num % 8 == 0){
                return 1;
            }
        }

        if(number.length() <= 2) {
            int num = Integer.parseInt(number);
            if(num % 8 == 0){
                return 1;
            }else{
                return 0;
            }
        }
        return 0;
    }
}
