package workExp;

import java.util.ArrayList;
import java.util.List;

public class ComplexCalc {
    private List<OperListe> listeners = new ArrayList<>();
    private ComplNumFactory factory;
    private CalcOperation strategy;

    public ComplexCalc(ComplNumFactory factory, CalcOperation strategy) {
        this.factory = factory;
        this.strategy = strategy;
    }



    public ComplexNum add(ComplexNum num1, ComplexNum num2) {
        ComplexNum result = strategy.calculate(num1, num2);
        notifyListeners("сложение: " + num1.toString() + " + " + num2.toString() + " = " + result.toString());
        return result;
    }

    public ComplexNum multiply(ComplexNum num1, ComplexNum num2) {
        ComplexNum result = strategy.calculate(num1, num2);
        notifyListeners("умножение: " + num1.toString() + " * " + num2.toString() + " = " + result.toString());
        return result;
    }

    public ComplexNum divide(ComplexNum num1, ComplexNum num2) {
        ComplexNum result = strategy.calculate(num1, num2);
        notifyListeners("деление: " + num1.toString() + " / " + num2.toString() + " = " + result.toString());
        return result;
    }

    public void addListener(OperListe listener) {
        listeners.add(listener);
    }

    public void removeListener(OperListe listener) {
        listeners.remove(listener);
    }

    private void notifyListeners(String operation) {
        for (OperListe listener : listeners) {
            listener.onOperPerformed(operation);
        }
    }
}