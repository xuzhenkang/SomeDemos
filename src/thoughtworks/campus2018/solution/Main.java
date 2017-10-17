package thoughtworks.campus2018.solution;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import thoughtworks.campus2018.solution.bean.Car;
import thoughtworks.campus2018.solution.bean.Reminder;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner cin = new Scanner(System.in);
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		Date currentTime = format.parse(cin.nextLine().substring(11));
		Reminder reminder = new Reminder(currentTime);

		while (cin.hasNext()) {
			String nextLine = cin.nextLine();
			if (nextLine.trim().equals("EOF"))
				break; // 文件结尾为EOF
			String[] records = nextLine.split("\\|");

			Date buyTime = format.parse(records[1]);
			int currentKMs = Integer.parseInt(records[3]);
			boolean wasRepair = records[4].equals("T");
			Car car = new Car(records[0], buyTime, records[2], currentKMs, wasRepair);
			reminder.readCar(car);
		}
		reminder.remind();
		cin.close();
	}
}
