import java.util.Scanner;

public class Dog {
    String name;
    String  age;
    String male;
    String breed;

    public void dogGenerate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Придумайте кличку");
        name = scanner.nextLine();


        System.out.println("Укажите возраст");
        age = scanner.nextLine();

        System.out.println("Укажите пол: кабель/сучка");
        male = scanner.nextLine();

        System.out.println("Укажите породу");
        breed = scanner.nextLine();

        if (name.equals("") && male.equals("кабель")) {
            name = "Бобик";

        } else if (name.equals("") && male.equals("сучка")) {
            name = "Найда";
        }
    }
}
