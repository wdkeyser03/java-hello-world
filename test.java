import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) {
        int counter = 0;
		System.out.println("Start Java Hello World!");
        System.out.println("-----------------------");
        while(true) {
            counter++;
			System.out.println(counter + " Hello World!");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
		}
    }
}