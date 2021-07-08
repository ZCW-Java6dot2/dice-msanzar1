import java.util.logging.Logger;

public class Simulation {
    private Integer numberOfDies;
    private Integer numberOfTosses;
    private Integer binLow;
    private Integer binHigh;
    private Bins bin;
    private static final Logger LOGGER = Logger.getLogger(Simulation.class.getName());

    public Simulation(Integer numberOfDies, Integer numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.binLow = numberOfDies;
        this.binHigh = numberOfDies * 6;
        this.bin = new Bins(binLow, binHigh);
    }
    public static void main(String[] args){
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();
    }

    public void runSimulation() {
        Dice dice = new Dice(this.numberOfDies);
        for (int i = 0; i < this.numberOfTosses; i++) {
            bin.incrementBin(dice.tossAndSum());
        }
    }

    public void printResults() {
        LOGGER.info("\n***\nSimulation of "+ this.numberOfDies+
                " dice tossed for "+numberOfTosses+" times.\n***\n");
        String stringy = "\n";
        for (int i = numberOfDies; i <= numberOfDies * 6; i++) {
            double percentage =  bin.getBin(i) / (double) numberOfTosses;
            int starCount = bin.getBin(i) / 10000;
            Integer occurences = bin.getBin(i);
            String stars = "";
            for(int j = 0; j < starCount; j++){
                stars+= "*";
            }
            //String format for Logger
            stringy += String.format("%3d  : %6d: %.2f %s\n", i, occurences, percentage,stars);

        }
        LOGGER.info(stringy);

    }
}
