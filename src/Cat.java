import java.util.Scanner;

public class Cat {
    String name;
    String age;
    String male;
    String breed;

    public void catGenerate(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Придумайте кличку");
        name = scanner.nextLine();


        System.out.println("Укажите возраст");
        age = scanner.nextLine();

        System.out.println("Укажите пол: кот/кошка");
        male = scanner.nextLine();

        System.out.println("Укажите породу");
        breed = scanner.nextLine();

        if (name.equals("") && male.equals("кот")){
            name = "Барсик";

        } else if (name.equals("") && male.equals("кошка")) {
            name = "Мурка";
        }
    }

}
