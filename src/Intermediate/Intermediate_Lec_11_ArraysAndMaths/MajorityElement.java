package Intermediate.Intermediate_Lec_11_ArraysAndMaths;

public class MajorityElement {
    private int[] A;

    public int[] getA() {
        return A;
    }

    public void setA(int[] a) {
        A = a;
    }

    public int getMajorityElement(){
        int element = A[0];
        int freq = 1;
        for(int i=1; i<A.length; i++){
            if(freq == 0){
                element = A[i];
                freq = 1;
            } else if (element != A[i]) {
                freq--;
            }else{
                freq++;
            }

        }
        return element;
    }
}
