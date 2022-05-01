import java.util.EventObject;

public class DisplayEvent extends EventObject {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int s1;
    private int s2;
    private int s3;
    private int s4;
    private int s5;

    private int m1;
    private int m2;
    private int m3;
    private int m4;
    private int m5;

    private int d1;
    private int d2;
    private int d3;
    private int d4;
    private int d5;


    private int c1;
    private int c2;
    private int  c3;
    private int c4;

    public int getS5() {
        return s5;
    }

    public void setS5(int s5) {
        this.s5 = s5;
    }

    public int getS4() {
        return s4;
    }

    public void setS4(int s4) {
        this.s4 = s4;
    }

    public int getM3() {
        return m3;
    }

    public int getS2() {
        return s2;
    }

    public int getS3() {
        return s3;
    }

    public void setS3(int s3) {
        this.s3 = s3;
    }

    public void setS2(int s2) {
        this.s2 = s2;
    }

    public int getS1() {
        return s1;
    }

    public void setS1(int s1) {
        this.s1 = s1;
    }

    public int getM4() {
        return m4;
    }

    public int getM5() {
        return m5;
    }

    public void setM5(int m5) {
        this.m5 = m5;
    }

    public void setM4(int m4) {
        this.m4 = m4;
    }

    public void setM3(int m3) {
        this.m3 = m3;
    }

    public int getD5() {
        return d5;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public void setD5(int d5) {
        this.d5 = d5;
    }

    public int getD2() {
        return d2;
    }

    public int getD3() {
        return d3;
    }

    public int getD4() {
        return d4;
    }

    public void setD4(int d4) {
        this.d4 = d4;
    }

    public void setD3(int d3) {
        this.d3 = d3;
    }

    public void setD2(int d2) {
        this.d2 = d2;
    }

    public int getC1() {
        return c1;
    }

    public int getC4() {
        return c4;
    }

    public int getD1() {
        return d1;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public int getC5() {
        return c5;
    }

    public void setC5(int c5) {
        this.c5 = c5;
    }

    public void setC4(int c4) {
        this.c4 = c4;
    }

    public int getC3() {
        return c3;
    }

    public void setC3(int c3) {
        this.c3 = c3;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    private int c5;
    public DisplayEvent(Object source, int s1,int s2, int s3, int s4, int s5, int m1,int m2, int m3, int m4, int m5,int d1, int d2, int d3, int d4, int d5, int c1, int c2, int c3, int c4,int c5, int x ) {
        super(source);
        this.s1= s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=s4;
        this.s5=s5;

        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        this.m5=m5;

        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.d4=d4;
        this.d5=d5;

        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.c4=c4;
        this.c5=c5;

        this.x = x;
    }

}