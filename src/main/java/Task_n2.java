import java.util.Scanner;

public class Task_n2 {
    static Scanner scanner = new Scanner(System.in);

    // Main считывает 2 числа (метод getDouble()), считает операцию (метод getOperation(),
    // передает все методу calc() и выводит в консоль округлённый до 4ех знаков после запятой результат

    public static void main(String[] args) {
        char operation = getOperation();
        double num1 = getDouble();
        double num2 = getDouble();
        double result = calc(num1,num2,operation);
        System.out.printf("Ваш результат: " + "%.4f", Math.abs(+result)); // вывод со значениями согласно задаче
    }

    // getDouble считывает с консоли целое или дробное число и возвращает его

    public static double getDouble(){
        System.out.println("Введите число:");
        double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else {
            System.out.println("Допущена ошибка при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    // getOperation считывает с консоли значение и возвращает символ с операцией

    public static char getOperation(){
        System.out.println("Введите тип операции (+ - * /):");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Допущена ошибка при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    // calc выполняет над числами num1 и num2 арифметическую операцию, заданную operation

    public static double calc(double num1, double num2, char operation){
        double result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}