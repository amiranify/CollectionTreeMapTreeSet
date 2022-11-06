import java.util.Comparator;

public class PersonComparat implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int p1 = o1.getSurname().length();
        int p2 = o2.getSurname().length();
        if (p1 != p2) {
            return Integer.compare(p2, p1);
        }
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
