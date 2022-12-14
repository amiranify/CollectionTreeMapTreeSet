import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Иван", "Иванов", 15));
        people.add(new Person("Пётр", "Петров", 20));
        people.add(new Person("Василий", "Гасан Абдурахман ибн Хоттаб", 19));
        people.add(new Person("Барон", "фон Трипербах Лепёхин", 25));
        people.add(new Person("Михаил", "Салтыков-Щедрин", 24));
        System.out.println(people);
        Collections.sort(people, new PersonComparat(3));
        System.out.println("Список людей в порядке знатности:\n" + people);
    }
}
