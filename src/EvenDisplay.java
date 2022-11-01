public class EvenDisplay extends Thread{
    public EvenDisplay() {
    }

    @Override
    public void run() {
        System.out.println("Even Display");
        try {
            for (int i = 0; i <= 10; i += 2) {
                System.out.println("Even number: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Even Display Finished");
    }
}
