import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        Comparator<Person> comparator = (p1, p2) -> {
            int words1 = p1.getSurname().split("\\P{IsAlphabetic}+").length;
            int words2 = p2.getSurname().split("\\P{IsAlphabetic}+").length;
            int result = (words1 >= 3 && words2 >= 3) ? 0 : Integer.compare(words2, words1);
            return result == 0 ? Integer.compare(p2.getAge(), p1.getAge()) : result;
        };
        Collections.sort(people, comparator);

        System.out.println("Список людей в порядке знатности:\n" + people);
    }
}
