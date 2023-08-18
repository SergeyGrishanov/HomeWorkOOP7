package workExp;

public class SimpleComplNum implements ComplexNum {
    private double realPart;
    private double imaginaryPart;

    public SimpleComplNum(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}