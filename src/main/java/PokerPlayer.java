import java.util.ArrayList;

public class PokerPlayer extends Player implements Gambling {
    private Hand hand = new PokerHand();
    private Boolean folded = false;
    private Chips chips;

    public PokerPlayer(Person p) {
        super(p);
        chips = new Chips(1000.0);
    }


    public void leaveGame(){}
    public Integer call(Integer lastPlayerBet) {return 0;}
    public Integer check() {return 0;}
    public void fold() {}
    public Integer raise(Integer lastPlayerBetInteger, Integer amountToRaise) {return 0;}
    public Integer smallBlind() {return 1;}
    public Integer bigBlind() {return 2;}
    public Boolean isFolded() {return folded;}
    @Override
    public Integer bet() {
        return null;
    }
    public Chips getChip() {return chips;};
}
