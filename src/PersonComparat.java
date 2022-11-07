import java.util.Comparator;

public class PersonComparat implements Comparator<Person> {
    private int maxWords;

    public PersonComparat(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        //  int p1 = o1.getSurname().length();
        // int p2 = o2.getSurname().length();
        //int result = (p1 != p2) ? Integer.compare(p2, p1) : Integer.compare(o2.getAge(), o1.getAge());
        //return result;
        int words1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
        int words2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;
        int result = (words1 >= maxWords && words2 >= maxWords) ? 0 : Integer.compare(words2, words1);
        return result == 0 ? Integer.compare(o2.getAge(), o1.getAge()) : result;
    }
}