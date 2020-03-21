import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static final String Welcome = "\nДобро пожаловать в поликлинику! ";
    private static final String Enter_Command = "Для осуществления дальнейших действий введите необходимую цифру: ";
    private static final String Registration = "[1]: Регистрация";
    private static final String Reception = "[2]: Запись на прием";
    private static final String Exit = "[3]: Выход из  поликлиники";
    private Scanner in = new Scanner(System.in);
    private int command;

    public void window() throws InputMismatchException {
        System.out.println(Welcome);
        System.out.println(Enter_Command);
        System.out.println(Registration);
        System.out.println(Reception);
        System.out.println(Exit);
        command = 500;
        try {
            while (command != 3) {
                command = in.nextInt();
                if (command == 1) {
                    Registration reg = new Registration();//создаем экземпляр класса данных о пациенте
                    reg.myMap();// Выводим созданный нами список
                } else if (command == 2) {
                    Patient r = new Patient();
                    r.myList();
                } else if (command == 3) {
                    System.out.println("Желаем Вам здоровья!");

                    System.exit(0);// Завершаем выполнение программы
                } else {
                    System.out.println("Будте внимательнее, введите число от 1 до 3");
                }
            }
        } catch (InputMismatchException e) {
        } finally {
            System.out.println(" Нужно вводить буквы!");
        }
    }
}
