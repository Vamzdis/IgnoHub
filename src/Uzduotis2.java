import java.util.Scanner;

/**
 * Created by Ignas on 2017.03.03.
 */
public class Uzduotis2 {
    public static void main(String[] args){
        System.out.println("Iveskite zodi");

        Scanner sc = new Scanner(System.in);
        String vardas = sc.nextLine();
        int ilgis = vardas.length();
        System.out.print(ilgis);
    }
}
