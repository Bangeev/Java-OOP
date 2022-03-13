package CardSuits;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");


        for (CardSuits suit : CardSuits.values()) {

            System.out.printf("Ordinal value: %d; Name value: %s%n",suit.ordinal(), suit.toString());

        }


    }
}
