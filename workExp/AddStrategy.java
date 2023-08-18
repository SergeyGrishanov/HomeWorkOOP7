package workExp;

public class AddStrategy implements CalcOperation {
    public ComplexNum calculate(ComplexNum num1, ComplexNum num2) {
        double real = num1.getRealPart() + num2.getRealPart();
        double imaginary = num1.getImaginaryPart() + num2.getImaginaryPart();
        return new SimpleComplNum(real, imaginary);
    }

}
