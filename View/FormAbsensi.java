package View;

import java.util.Scanner;

public class FormAbsensi {
    static Scanner input = new Scanner(System.in);

    public static String form() {
        System.out.println("");
        System.out.println("Silahkan Absen");
        System.out.print("Email Anda : ");
        String email = input.nextLine();

        return email;
    }
}
