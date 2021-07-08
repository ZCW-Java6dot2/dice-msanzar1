import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private Integer rolled;

    public Dice(Integer rolled) {
        this.rolled = rolled;
    }

    public Integer tossAndSum(){
        Integer sum = 0;
        Random random = new Random();
        for (int i = 0; i < rolled; i++) {
            sum += random.nextInt(6)+1;
        }
        return sum;
    }

    public Integer getRolled() {
        return rolled;
    }
}