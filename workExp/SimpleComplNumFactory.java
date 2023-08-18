package workExp;

public class SimpleComplNumFactory implements ComplNumFactory {
    public ComplexNum createComplexNum(double realPart, double imaginaryPart) {
        return new SimpleComplNum(realPart, imaginaryPart);
    }
}