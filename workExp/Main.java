package workExp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComplNumFactory factory = new SimpleComplNumFactory();
        CalcOperation strategy = new AddStrategy();
        ComplexCalc calculator = new ComplexCalc(factory, strategy);
        System.out.println("Добро пожаловать в калькулятор!");
        calculator.addListener(new LogOperListe());
        String choice = "";
        while (!choice.equals("4")) {
            ComplexNum num1 = readComplexNumber1(scanner);
            ComplexNum num2 = readComplexNumber2(scanner);
            
            System.out.println("Выберите операцию: ");
            System.out.println("1 - сложение\n2 - умножение\n3 - деление\n4 - выход");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":

                    ComplexNum resultAddtion = calculator.add(num1, num2);
                    System.out.println("Результат: " + resultAddtion.getRealPart() + " + " + resultAddtion.getImaginaryPart() + "i");
                    System.out.println();
                    break;
                case "2":
                    ComplexNum resultMultiplication = calculator.multiply(num1, num2);
                    System.out.println("Результат: " + resultMultiplication.getRealPart() + " * " + resultMultiplication.getImaginaryPart() + "i");
                    System.out.println();
                    break;
                case "3":
                    ComplexNum resultDivision = calculator.divide(num1, num2);
                    System.out.println("Результат: " + resultDivision.getRealPart() + " / " + resultDivision.getImaginaryPart() + "i");
                    System.out.println();
                    break;
                case "4":
                    System.out.println("Завершение операции.");
                    System.out.println("Возращайтесь снова!");
                    break;
                default:
                    System.out.println("Некорректный ввод");
                    continue;
            }

        }
    }

    private static ComplexNum readComplexNumber1(Scanner scanner) {      
        System.out.println("Введите действительную и мнимую часть первого комплексного числа через пробел:");
        double realPart = scanner.nextDouble();
        double imaginaryPart = scanner.nextDouble();
        scanner.nextLine();
        ComplNumFactory factory = new SimpleComplNumFactory();
        return factory.createComplexNum(realPart, imaginaryPart);
    }
    private static ComplexNum readComplexNumber2(Scanner scanner) {
        System.out.println("Введите действительную и мнимую часть второго комплексного числа через пробел:");
        double realPart = scanner.nextDouble();
        double imaginaryPart = scanner.nextDouble();
        scanner.nextLine();
        ComplNumFactory factory = new SimpleComplNumFactory();
        return factory.createComplexNum(realPart, imaginaryPart);
    }
}