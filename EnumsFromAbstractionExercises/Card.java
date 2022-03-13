package EnumsFromAbstractionExercises;

public class Card {

    private CardSuits cardSuit;
    private CardRanks cardRank;
    private int power;

    public Card (CardSuits cardSuit, CardRanks cardRank){
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;

    }




    public  int getPower(){
        return this.cardSuit.getSuitPower() + this.cardRank.getPowerRank();

    }

    public CardRanks getCardRank() {
        return cardRank;
    }

    public CardSuits getCardSuit() {
        return cardSuit;
    }
}
