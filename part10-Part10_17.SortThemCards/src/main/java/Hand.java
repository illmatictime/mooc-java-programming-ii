import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        this.hand.add(card);
    }

    public void print() {
        this.hand.stream().forEach(x -> System.out.println(x));
    }

    public void sort() {
        Collections.sort(hand);

    }

    public void sortBySuit() {
        Collections.sort(hand, new BySuitInValueOrder());
    }

    public int totalValue() {
        int totalValue = 0;
        for (Card card : hand) {
            totalValue += card.getValue();
        }
        return totalValue;
    }

    @Override
    public int compareTo(Hand x) {
        return this.totalValue() - x.totalValue();
    }
}
