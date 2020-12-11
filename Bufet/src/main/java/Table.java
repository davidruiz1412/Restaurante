public class Table {
    private int numBurgers;
    private int maxBurgers;

    public Table(){
        this.numBurgers = 0;
        this.maxBurgers = 5;
    }

    public int getNumBurgers() {
        return numBurgers;
    }

    synchronized public void setNumBurgers(int numBurgers) {
        this.numBurgers = numBurgers;
    }

    public int getMaxBurgers() {
        return maxBurgers;
    }

    public void setMaxBurgers(int maxBurgers) {
        this.maxBurgers = maxBurgers;
    }
}
