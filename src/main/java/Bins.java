import java.util.ArrayList;

public class Bins {
    private Integer first;
    private Integer last;
    private ArrayList<Integer> tracker;

    public Bins(Integer first, Integer last){
        this.first = first;
        this.last = last;
        this.tracker = new ArrayList<>();
        for (int i = 0; i <= last; i++) {
            this.tracker.add(0);
        }
    }

    public Integer getBin(Integer index){
        return tracker.get(index);
    }

    public void incrementBin(Integer index){
        Integer a = tracker.get(index);
        a++;
        tracker.set(index, a);
    }

    public ArrayList<Integer> getTracker() {
        return tracker;
    }

    public Integer getFirst() {
        return first;
    }

    public Integer getLast() {
        return last;
    }
}
    public Integer getBin(int bin) {
        return data.get(bin);
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

}
