import java.util.Random;

public class ProbStrategy implements Strategy{
    private Random random;
    private int preHandValue = 0;
    private int currentHandValue = 0;
    private int [][] history = {
            {1, 1, 1, },
            {1, 1, 1, },
            {1, 1, 1, },
    };
    public ProbStrategy(int seed){
        this.random = new Random(seed);
    }
    @Override
    public Hand nextHand() {
        return null;
    }

    @Override
    public void study(boolean win) {

    }
}
