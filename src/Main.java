/*        Circle деген класс түзүңүз, анын PI деген свойствасы,
        area жана circumference деген статик методдору болсун.
        areaны табуу үчүн: PI * (radius * radius)
        circumferenceти табуу үчүн PI * 2 * radius деген формулалар колдонулат.*/

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        Circle.area(0);
        System.out.println(Circle.area(5));
        Circle.circumference(0);
        System.out.println(Circle.circumference(5));

    }
}