package thoughtworks.campus2018.solution.bean;

import java.util.Date;

import thoughtworks.campus2018.solution.container.DistanceRelatedMaintenance;
import thoughtworks.campus2018.solution.container.Over;
import thoughtworks.campus2018.solution.container.TimeRelatedMaintenance;
import thoughtworks.campus2018.solution.container.WriteOff;

public class Reminder {
	private TimeRelatedMaintenance timeRelatedMaintenanceCars = new TimeRelatedMaintenance();
	private DistanceRelatedMaintenance distanceRelatedMaintenanceCars = new DistanceRelatedMaintenance();
	private WriteOff writeOffCars = new WriteOff();
	private Over over = new Over();
	private Date currentTime; // 当前时间

	public Reminder(Date currentTime) {
		this.currentTime = currentTime;
	}

	public void readCar(Car car) {

		if (over.isThisCar(car, currentTime)) {
			over.putCar(car);
			return;
		}
		if (writeOffCars.isThisCar(car, currentTime)) {
			writeOffCars.putCar(car);
			return;
		}
		if (distanceRelatedMaintenanceCars.isThisCar(car, currentTime)) {
			distanceRelatedMaintenanceCars.putCar(car);
			return;
		}
		if (timeRelatedMaintenanceCars.isThisCar(car, currentTime)) {
			timeRelatedMaintenanceCars.putCar(car);
			return;
		}

	}

	public void remind() {
		System.out.println("Reminder\n==================");
		System.out.println("\n* Time-related maintenance coming soon...");
		timeRelatedMaintenanceCars.display();
		System.out.println("\n* Distance-related maintenance coming soon...");
		distanceRelatedMaintenanceCars.display();
		System.out.println("\n* Write-off coming soon...");
		writeOffCars.display();
	}

}