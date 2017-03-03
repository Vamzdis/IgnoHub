import java.util.Scanner;

/**
 * Created by Ignas on 2017.03.03.
 */
public class Uzduotis6 {
    public static void main(String[] args) {
        System.out.println("Sveiki, iveskite savo varda");
        Scanner sc = new Scanner(System.in);
        String vardas = sc.nextLine();




        System.out.println("Labas, " +vardas+ "iveskite savo ugi ir mase, kad suzinoti jusu KMI");
        System.out.println("Iveskite savo ugi");

        double mase = sc.nextInt();

        System.out.println("Iveskite savo mase");

        float ugis = sc.nextFloat();
        KMIformule((double) mase, (float) ugis);
    }
    public static void KMIformule (double mase, float ugis){

    }
}
