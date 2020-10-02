import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;

public class AnnoyingBeep {

    Toolkit toolkit;
    Timer timer;

    public AnnoyingBeep() {
        toolkit = Toolkit.getDefaultToolkit();
        timer = new Timer();
        timer.scheduleAtFixedRate(new RemindTask(), 5, 1 * 1000);
    }

    public class RemindTask extends TimerTask {

        int numWarningBeeps = 3;

        @Override
        public void run() {
            if(numWarningBeeps > 0) {
                toolkit.beep();
                System.out.println("Beep!");
                numWarningBeeps--;
            } else {
                toolkit.beep();
                System.out.println("Time's out");
                System.exit(0);
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("About to schedule task");
        new AnnoyingBeep();
        System.out.println("Task scheduled");
    }
}
