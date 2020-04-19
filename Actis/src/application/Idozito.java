package application;

import java.util.Timer;
import java.util.TimerTask;

public class Idozito {
	//időzitőért felelős osztály
	public void idoMero(int szam) {
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			int counter = szam;
			@Override
			public void run() {
				System.out.println(counter);
				counter--;

				if (counter == -1) {
					timer.cancel();
				}
			}
		};
		timer.scheduleAtFixedRate(task, 1000, 1000);
	}

}
