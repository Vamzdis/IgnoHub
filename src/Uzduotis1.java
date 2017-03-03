import java.util.Scanner;

/**
 * Created by Ignas on 2017.03.03.
 */
public class Uzduotis1 {
    public static void main(String[] args) {

        System.out.println("Iveskite savo varda ir jis bus atspausdintas 5 kartus");

        Scanner sc = new Scanner(System.in);
        String vardas = sc.nextLine();

        for (int i = 0; i < 5; i++) {


            System.out.println(vardas);

        }
    }
}
