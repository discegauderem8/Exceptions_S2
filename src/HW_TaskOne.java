import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class HW_TaskOne {
    //Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
    // Ввод текста вместо числа не должно приводить к падению приложения,
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static float res;
    private static float getFloat() {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите вещественное число: ");
            String text = scanner.next();
            res = Float.parseFloat(text);
        } catch (NumberFormatException e) {
            System.out.println("Введеное вами значение не является вещественным числом");
            getFloat();
        } finally{
            if (res != 0) return res;
            else return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(getFloat());
    }
}
