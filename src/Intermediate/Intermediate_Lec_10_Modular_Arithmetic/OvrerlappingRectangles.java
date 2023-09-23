package Intermediate.Intermediate_Lec_10_Modular_Arithmetic;

public class OvrerlappingRectangles {
    private int A , B, C, D, E, F, G, H;

    public int getA() {
        return A;
    }

    public void setA(int a) {
        A = a;
    }

    public int getB() {
        return B;
    }

    public void setB(int b) {
        B = b;
    }

    public int getC() {
        return C;
    }

    public void setC(int c) {
        C = c;
    }

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }

    public int getE() {
        return E;
    }

    public void setE(int e) {
        E = e;
    }

    public int getF() {
        return F;
    }

    public void setF(int f) {
        F = f;
    }

    public int getG() {
        return G;
    }

    public void setG(int g) {
        G = g;
    }

    public int getH() {
        return H;
    }

    public void setH(int h) {
        H = h;
    }

    public OvrerlappingRectangles(int a, int b, int c, int d, int e, int f, int g, int h) {
        A = a;
        B = b;
        C = c;
        D = d;
        E = e;
        F = f;
        G = g;
        H = h;
    }

    public int isRectanglesOverlapping(){
        if((E>=A && E<=C) || (G>=A && G<=C)){
            if((F>=B && F<=D) || (H>=B && H<=D)){
                return 1;
            }
        }
        return 0;
    }
}


