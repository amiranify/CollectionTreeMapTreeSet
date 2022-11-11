import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Иванов", 15));
        people.add(new Person("Пётр", "Петров", 20));
        people.add(new Person("Василий", "Гасан Абдурахман ибн Хоттаб", 19));
        people.add(new Person("Барон", "фон Трипербах Лепёхин", 25));
        people.add(new Person("Михаил", "Салтыков-Щедрин", 24));
        people.add(new Person("Маша", "Сидорова", 12));
        System.out.println(people);

        Collections.sort(people, new PersonComparat(3));
        System.out.println(people);

        people.removeIf(person -> person.getAge() < 18 );
        System.out.println(people);
    }
}