public class Blackjack {

    public int parseCard(String card) {
        switch(card) {
            case "ace": return 11;
			case "two": return 2;
			case "three": return 3;
			case "four": return 4;
			case "five": return 5;
			case "six": return 6;
			case "seven": return 7;
			case "eight": return 8;
			case "nine": return 9;
			case "ten": return 10;
			case "jack": return 10;
			case "queen": return 10;
			case "king": return 10;
			default: return 0;
            }
        }
    

    public boolean isBlackjack(String card1, String card2) {
        int handScore = parseCard(card1) + parseCard(card2);
        if(handScore == 21){
            return true;
        } else {
            return false;
        }
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
        if(!isBlackjack){
            return "P";
        } else if (isBlackjack && dealerScore < 10) {
            return "W";
        } else {
            return "S";
        }
    }

    public String smallHand(int handScore, int dealerScore) {
        if ((handScore >= 17) || (handScore > 11 && dealerScore < 7)) {
            return "S";
        } else {
            return "H";
        }
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
