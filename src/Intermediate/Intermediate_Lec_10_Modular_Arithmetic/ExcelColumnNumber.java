package Intermediate.Intermediate_Lec_10_Modular_Arithmetic;

public class ExcelColumnNumber {
    private String column;

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public int getColumnNumber(){
        //Iterate on string from left to right
        int result = 0;
        for(int i= column.length()-1; i>=0; i--){
            int power = getPower(26, column.length()-1-i);
            result += power * ((int)column.charAt(i) - 64);
        }
        return result;
    }

    public int getPower(int base, int power){
        int ans = 1;
        while(power > 0){
            ans *= base;
            power--;
        }
        return ans;
    }
}
