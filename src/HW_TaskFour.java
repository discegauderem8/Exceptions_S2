import java.util.NoSuchElementException;
import java.util.Scanner;

public class HW_TaskFour {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите текст: ");
            String text = scanner.next();
            System.out.println(text);
        }
        catch (NoSuchElementException e){
            System.out.println("Пустые строки вводить нельзя.");;
        }
    }
}
