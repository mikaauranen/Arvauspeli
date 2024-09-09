import java.util.Scanner; 

public class arvauspeli {
    public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in); 

    String nimi = ("Mika");
    String input;

    System.out.println("Arvaa nimeni!");
    input = in.nextLine();
    if (input.equals(nimi)) {
        System.out.println("Oikein!");
    }
    else {
        System.out.println("Väärin!");
    }
}
}
