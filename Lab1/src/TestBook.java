import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Идиот", "Достоевский М.Ф.", 1, "Проза");
        Book b2 = new Book("Игра престолов", "Д. Мартин", 289, "Проза");

        b2.setPagesCount(100);

        System.out.println(b1);
        System.out.println(b2);
    }
}