package workExp;

public class PolarComplNum implements ComplexNum {
    private double magnitude;
    private double phase;

    public PolarComplNum(double magnitude, double phase) {
        this.magnitude = magnitude;
        this.phase = phase;
    }

    public double getRealPart() {
        return magnitude * Math.cos(phase);
    }

    public double getImaginaryPart() {
        return magnitude * Math.sin(phase);
    }
}
