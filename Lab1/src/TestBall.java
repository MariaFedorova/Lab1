import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(25.5, "red", "volleyball", 2500);
        Ball b2 = new Ball(23.5, "orange", "football", 2500);
        Ball b3 = new Ball(22.5, "yellow", "football", 3000);

        b3.setColor("red");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}