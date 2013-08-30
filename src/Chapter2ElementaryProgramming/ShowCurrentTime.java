package Chapter2ElementaryProgramming;
import javax.swing.JOptionPane;
public class ShowCurrentTime {
	public static void main(String[] arg){
		String timeZoneString = JOptionPane.showInputDialog("Enter your time zone: ");
		long timeZone = Long.parseLong(timeZoneString);
		long totalMilis = System.currentTimeMillis();
		long totalSeconds = totalMilis / 1000;
		long currentSeconds = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHoursGMT = totalHours % 24;		
		int currentHours = ((int)(currentHoursGMT + timeZone) + 24) % 24;
		String output = "";
		if(currentHours < 12){
			output = "The current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " AM";
		}else{
			currentHours = currentHours % 12;			
			output = "The current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " PM";
		}
		
		JOptionPane.showMessageDialog(null,output);
	}
}
