public class OddDisplay extends Thread {
    public OddDisplay() {
    }

    @Override
    public void run() {
        System.out.println("Odd Display");
        try {
            for (int i = 1; i < 10; i += 2) {
                System.out.println("Odd number: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Odd Display Finished");
    }
}
