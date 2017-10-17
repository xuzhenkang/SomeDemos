package thoughtworks.campus2018.solution.container;

import java.util.Date;

import thoughtworks.campus2018.solution.bean.Car;
import thoughtworks.campus2018.solution.bean.Metieral;
import thoughtworks.campus2018.solution.utils.DateUtils;

//需要提醒定期保养的车辆
public class TimeRelatedMaintenance extends Metieral implements MetieralOperation {

	@Override
	public boolean isThisCar(Car car, Date currentTime) {
		// TODO Auto-generated method stub
		// 3年以下车辆每12个月定期保养一次
		if (DateUtils.getYearDiff(currentTime, car.getBuyTime()) < 3
				&& (DateUtils.getMonthDiff(currentTime, car.getBuyTime()) % 12 == 11
						|| DateUtils.getMonthDiff(currentTime, car.getBuyTime()) % 12 == 0)) {
			return true;
		}
		// 3年及以上车辆每6个月定期保养一次
		if (DateUtils.getYearDiff(currentTime, car.getBuyTime()) >= 3
				&& (DateUtils.getMonthDiff(currentTime, car.getBuyTime()) % 6 == 5
						|| DateUtils.getMonthDiff(currentTime, car.getBuyTime()) % 6 == 0)) {
			return true;
		}
		// 若车辆有大修，则每3个月就需要定期保养一次
		if (car.wasRepaired() && (DateUtils.getMonthDiff(currentTime, car.getBuyTime()) % 3 == 2
				|| DateUtils.getMonthDiff(currentTime, car.getBuyTime()) % 3 == 0)) {
			return true;
		}

		return false;
	}

}
