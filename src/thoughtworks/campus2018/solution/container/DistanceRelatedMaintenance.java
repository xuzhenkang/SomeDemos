package thoughtworks.campus2018.solution.container;

import java.util.Date;

import thoughtworks.campus2018.solution.bean.Car;
import thoughtworks.campus2018.solution.bean.Metieral;

//��Ҫ����ÿ1���ﱣ���ĳ���
public class DistanceRelatedMaintenance extends Metieral implements MetieralOperation {

	@Override
	public boolean isThisCar(Car car, Date currentTime) {
		// TODO Auto-generated method stub
		if (car.getCurrentKMs() % 10000 >= 9500 || car.getCurrentKMs() % 10000 == 0 && car.getCurrentKMs() != 0)
			return true;
		return false;
	}

}