import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Nursery {
    ArrayList<String> petCat = new ArrayList<String>();
    ArrayList<String> petDog = new ArrayList<String>();
    String name = "АТТ";
    int d = 0;
    int c = 0;
    Dog dog = new Dog();
    Cat cat = new Cat();
    int dogCounter = 0;
    int catCounter = 0;
    public void petsGenerator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите животное" + "\n" + "1.Кошка" + " " + "2.Собака");
        String chosenPet;
        chosenPet = scanner.nextLine();
        if (chosenPet.equals("1") || chosenPet.equals("Кошка")){
            catCounter++;
            cat.catGenerate();
            petCat.add(cat.name);
            petCat.add(cat.age);
            petCat.add(cat.male);
            petCat.add(cat.breed);
            c++;
        }
        if (chosenPet.equals("2") || chosenPet.equals("Собака")){
            dogCounter++;
            dog.dogGenerate();
            petDog.add(dog.name);
            petDog.add(dog.age);
            petDog.add(dog.male);
            petDog.add(dog.breed);
            d++;
        }
        System.out.println("Добавить питомца ?");
        String answer = scanner.nextLine();
        if (answer.equals("да")) {
            petsGenerator();
        }
        if (answer.equals("нет")){
            sout();
        }
    }
    public void sout(){
        System.out.println("Здравствуйте, вы посетили питомник " + name + " В данный момент в питомнике " + c + " кошек "
        + d + "собак");
        System.out.println(" ");
        System.out.println("Собаки");

        int j = 1;

        for (int i = 0; i < petDog.size(); i++){
            System.out.println(j + " Имя: " + petDog.get(i++) + " возраст: " + petDog.get(i++) + " пол: " + petDog.get(i++));
            j = j + 1;
        }

        System.out.println("Кошки");
        int k = 1;

        for (int i = 0; i < petCat.size(); i++){
            System.out.println(k + " Имя: " + petCat.get(i++) + " возраст: " + petCat.get(i++) + " пол: " + petCat.get(i++));
            k = j +1;
        }
    }
}
