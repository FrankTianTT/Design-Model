import java.util.Random;

public class WinningStrategy implements Strategy{
    private Random random;
    private boolean won = false;
    private Hand preHand;

    public WinningStrategy(int seed){
        this.random = new Random(seed);
    }
    @Override
    public Hand nextHand() {
        if(this.won){
            return preHand;
        }
        else{
            return Hand.getHand(random.nextInt(3));
        }
    }

    @Override
    public void study(boolean win) {
        this.won = win;
    }
}
