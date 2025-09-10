package atp.tp.math;

public class Complex {
    private int re;
    private int im;

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public Complex(int r) {
        this.re = r;
        this.im = 0;
    }

    public int getRe() {
        return re;
    }

    public void setRe(int re) {
        this.re = re;
    }

    public int getIm() {
        return im;
    }

    public void setIm(int im) {
        this.im = im;
    }

    public Complex conjugate() {
        return new Complex(re, -im);
    }

    public boolean isReal() {
        return im == 0;
    }
}
