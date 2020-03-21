import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Patient implements Comparable<Patient> {
    private String FIO;
    private String gender;
    private Integer age;


    public Patient(String FIO, String gender, int age) {
        this.FIO = FIO;
        this.gender = gender;
        this.age = age;

    }

    public Patient() {
    }

    public int compareTo(Patient o) {
        if (this.age >= 60) {
            return -1;
        } else if (this.age < 60) ;
        {
            return 0;
        }
    }

    public String toString() {
        return (String) FIO + " " + gender + " " + age;
    }

    public static Patient patient1 = new Patient(" Васькина Галина Петровна", "       женский ", 61);
    public static Patient patient2 = new Patient(" Степашкина Зинаида Валерьевна", "  женский ", 30);
    public static Patient patient3 = new Patient(" Каренина Анна Аркадьевна", "       женский ", 35);
    public static Patient patient4 = new Patient(" Гагарин Юрий Алексеевич", "        мужской ", 86);
    public static Patient patient5 = new Patient(" Кантария Мелитон Варламович", "    мужской ", 99);
    public static Patient patient6 = new Patient(" Егоров Василий Максимович", "      мужской ", 19);
    public static Patient patient7 = new Patient(" Бакушина Клавдия Степановна", "    женский ", 24);
    public static Patient patient8 = new Patient(" Захаркин Павел Анатольевич", "     мужской ", 45);
    public static Patient patient9 = new Patient(" Емельяненко Фёдор Владимирович", " мужской ", 43);
    public static Patient patient10 = new Patient("Путин Владимир Владимирович", "    мужской ", 67);
    public static Patient patient11 = new Patient("Орлова Анастасия Васильевна", "    женский ", 20);
    public static Patient patient12 = new Patient("Попов Иван Геннадьевич", "         мужской ", 29);

    public void myList() {
        List<Patient> list = new ArrayList<>();
        list.add(Patient.patient1);
        list.add(Patient.patient2);
        list.add(Patient.patient3);
        list.add(Patient.patient4);
        list.add(Patient.patient5);
        list.add(Patient.patient6);
        list.add(Patient.patient7);
        list.add(Patient.patient8);
        list.add(Patient.patient9);
        list.add(Patient.patient10);
        list.add(Patient.patient11);
        list.add(Patient.patient12);

        // Я понимаю, что 4 строчки ниже выглядят смешно, но ничего лучше придумать не получилось.
        Collections.reverse(list);
        Collections.sort(list);
        Collections.reverse(list);
        Collections.sort(list);

        for (Patient u : list) {
            System.out.println(u);
        }
    }
}