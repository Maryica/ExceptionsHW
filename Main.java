import myExceptions.UserException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        InputFromUser inputFromUser = new InputFromUser(scanner);
        WriteUserToFile writeUserToFile = new WriteUserToFile();

        try {
            User user = inputFromUser.inputFromUser();
            writeUserToFile.writeUserToFile(user);
        } catch (UserException | IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Проверьте файл, данные записаны.");
    }
}