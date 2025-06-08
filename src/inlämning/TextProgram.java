package inlämning;

import java.util.Scanner;

public class TextProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        TextAnalys analys = new TextAnalys(); //Objekt

        String rad;

        while(true) { // Startar en evig loop
            System.out.println("Skriv in text (Avsluta med ordet Stop ): ");
            rad = scan.nextLine(); // Läser in en rad text
            if (rad.equalsIgnoreCase("stop")) { ///  kolla när användare skriver stop.
                break; // avslut loopen.
            }
            analys.bearbetaRad(rad);
        }
        System.out.println("Antal rader: " + analys.getAntalRader());
        System.out.println("Antal tecken: " + analys.getAntalTecken());
        System.out.println("Programmet avslutas");
    }

}
