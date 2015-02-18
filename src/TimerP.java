import java.util.Timer;
import java.util.TimerTask;

public class TimerP  {
  Mathtimed MT = new Mathtimed();
  // Private timer object
  private Timer timer;

  // Constructor which sets up the timer and schedules the instance of our TimerTask called "EndTask"
  public TimerP(int seconds) {
    timer = new Timer();
    timer.schedule(new EndTask(), seconds*1000);
  }

  // Inner class that when it is showtime, it executes the run function and ends our timer.
  public class EndTask extends TimerTask  {
    public void run() {
      MT.setPlay();
      timer.cancel();
      }
    }
  }
