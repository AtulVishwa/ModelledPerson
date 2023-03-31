package Model;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!\nNice to meet you");

        Person tom = new Person("Tom","Smith", LocalDate.of(1984,6,15));
        Person janet = new Person("Janet","Jackson", LocalDate.of(2000,8,19));

        tom.setSpouse(janet);

        Dog fido = new Dog("Fido",LocalDate.of(2019,1,28));
        fido.bark();
        tom.setPet(fido);

        System.out.println(tom);
    }
}
