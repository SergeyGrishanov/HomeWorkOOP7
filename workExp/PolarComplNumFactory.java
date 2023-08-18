package workExp;

public class PolarComplNumFactory implements ComplNumFactory {
    public ComplexNum createComplexNum(double realPart, double imaginaryPart) {
        double magnitude = Math.sqrt(realPart * realPart + imaginaryPart * imaginaryPart);
        double phase = Math.atan2(imaginaryPart, realPart);
        return new PolarComplNum(magnitude, phase);
    }
}
