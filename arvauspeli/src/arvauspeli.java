import java.util.Scanner; 

public class arvauspeli {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in); 

    String nimi = ("Mika");
    String input;

    do {
    System.out.println("Arvaa nimeni!");
    input = in.nextLine();
    System.out.println("Väärin! Yritä uudelleen.");
    } while (!input.equals(nimi));
    System.out.println("Oikein!");

}
}
