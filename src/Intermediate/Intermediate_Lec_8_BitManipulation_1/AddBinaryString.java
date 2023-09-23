package Intermediate.Intermediate_Lec_8_BitManipulation_1;

public class AddBinaryString {
    private String number1;
    private String number2;

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }
    /*
    Idea1: add the numbers from right to left and store the remainder in result and add quotient to next sum
     */
    public String getSumInBinaryString(){
        String result = "";
        //iterate over both String from right to left
        char[] num1 = number1.toCharArray();
        char[] num2 = number2.toCharArray();
        int i = number1.length()-1, j = number2.length()-1, quotient = 0;
        while (i>=0 || j>=0) {
            //quotient will be added to next sum and remainder will be added to the ans
            int n1 = 0, n2 = 0;
            if(i >= 0){
                n1 = num1[i] - 48;
            }
            if(j >= 0){
                n2 = num2[j] - 48;
            }
            int sum = n1 + n2 + quotient;
            quotient = sum / 2;
            int remainder = sum % 2;
            result = remainder + result;
            i--;
            j--;
        }
        if(quotient == 1){
            result = quotient + result;
        }
        return result;
    }



    /* Idea2: convert binary to decimal, add the numbers and convert the result back to binary
    public String getSumInBinary(){
        int sum = getSum();
        String result = getBinaryFromDecimal(sum);
        return result;
    }

    public String getBinaryFromDecimal(int num){
        String result = "";
        //divide the number by 2 and store the remainder in result
        while(num > 0){
            result += num%2;
            num = num/2;
        }

        //Reverse the characters in string
        String temp = "";
        for(int i=result.length()-1; i>=0; i--){
            temp += result.charAt(i);
        }
        return temp;
    }

    public int getSum(){
        int num1 = getDecimalFromBinary(number1);
        int num2 = getDecimalFromBinary(number2);
        int sum = num1 + num2;
        return sum;
    }

    public int getDecimalFromBinary(String num){
        int result = 0, n = num.length();
        //Iterate from right to left multiply each char with 2^pow where pow goes from 0 to n-1
        for(int i=n-1; i>=0; i--){
            result += ((num.charAt(i)-48) * getPower(n-1-i));
        }
        return result;
    }

    public int getPower(int pow){
        if(pow == 0){
            return 1;
        }
        int result = 1;
        while (pow > 0){
            result *= 2;
            pow--;
        }
        return result;
    }

     */
}
