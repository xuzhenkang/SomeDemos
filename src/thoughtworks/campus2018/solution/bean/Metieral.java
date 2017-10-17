package thoughtworks.campus2018.solution.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Metieral {
	public List<CarsListEntry> cars = new ArrayList<>();

	public boolean putCar(Car car) {
		// TODO Auto-generated method stub
		for (CarsListEntry carEntry : cars) {
			if (carEntry.getName().equals(car.getName())) {
				carEntry.putCar(car);
				Collections.sort(cars);
				return true;
			}
		}
		cars.add(new CarsListEntry(car));
		Collections.sort(cars);
		return true;
	}

	public void display() {
		// TODO Auto-generated method stub
		if (cars.size() == 0) {
			return;
		}
		for (int i = 0; i < cars.size(); i++) {
			CarsListEntry carsListEntry = cars.get(i);
			System.out
					.println(carsListEntry.getName() + ": " + carsListEntry.getNum() + " " + carsListEntry.toString());
		}
	}
}