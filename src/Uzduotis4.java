import java.util.Scanner;

/**
 * Created by Ignas on 2017.03.03.
 */
public class Uzduotis4 {
    public static void main(String[] args) {
            System.out.println("Sveiki, iveskite 2 skaicius, kad suzinoti ju skirtuma ir suma");

            Scanner sc = new Scanner(System.in);
            System.out.print("Iveskite pirma skaiciu");
            int skaicius1 = sc.nextInt();
            System.out.println("iveskite antra skaiciu");
            int skaicius2 = sc.nextInt();
            Atimtis(skaicius1,skaicius2);
            Sudetis(skaicius1,skaicius2);
        }


    public static void Atimtis (int skaicius1,int skaicius2)
    {
        int skirtumas = skaicius1 - skaicius2;
        System.out.println("Skirtumas yra: " +skirtumas);
    }
    public static void Sudetis(int skaicius1, int skaicius2)
    {
        int suma = skaicius1 + skaicius2;
        System.out.println("Suma yra: " +suma);
    }

}
