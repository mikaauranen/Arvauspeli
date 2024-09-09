import java.util.Scanner; 

public class arvauspeli {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in); 

    String nimi = ("Mika");
    String input;
    int arvauksia = 0;

    do {
        System.out.println("Arvaa nimeni tai kirjoita 'lopeta' lopettaaksesi.");
        input = in.nextLine();
        arvauksia++;

        if (input.equalsIgnoreCase("lopeta")) {
            System.out.println("Lopetit pelin.");
            System.out.println("Arvauksia yhteensä: " + arvauksia + ".");
            return;
        }
        } 
        while (!input.equals(nimi));
        System.out.println("Oikein!");
        System.out.println("Arvauksia yhteensä: " + arvauksia + ".");
}
}
