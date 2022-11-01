public class Main {
    public static void main(String[] args) {
        try{
            OddDisplay oddDisplay = new OddDisplay();
            EvenDisplay evenDisplay = new EvenDisplay();
            oddDisplay.start();
            oddDisplay.join();
            evenDisplay.start();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}