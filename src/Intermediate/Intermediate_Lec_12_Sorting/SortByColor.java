package Intermediate.Intermediate_Lec_12_Sorting;

public class SortByColor {
    private int[] A;

    public SortByColor(int[] a) {
        A = a;
    }

    public int[] getSortedColors(){
        int[] sorted_Color = new int[A.length];
        int red_count =0, white_color = 0, blue_color = 0;
        for (int i=0; i<A.length; i++){
            if(A[i] == 0){
                red_count++;
            } else if (A[i] == 1) {
                white_color++;
            }else {
                blue_color++;
            }
        }
        //Iterate for each color count and that in ans
        int i = 0;
        while(red_count > 0){
            sorted_Color[i] = 0;
            red_count--;
            i++;
        }
        while (white_color > 0){
            sorted_Color[i] = 1;
            white_color--;
            i++;
        }
        while (blue_color > 0){
            sorted_Color[i] = 2;
            blue_color--;
            i++;
        }

        return sorted_Color;
    }
}
