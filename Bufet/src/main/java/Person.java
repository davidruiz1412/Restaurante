public class Person {
    public static final long HIGH_VELOCITY_COOKER= (long) Math.random()*2000+1000;
    public static final long LOW_VELOCITY_COOKER= (long) Math.random()*2000+3500;

    public void regulateVelocity(Table table, long ifMore , long ifLess ){
        if(table.getNumBurgers()>table.getNumBurgers()/2) {
            try {
                Thread.sleep(ifMore);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            try {
                Thread.sleep(ifLess);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
