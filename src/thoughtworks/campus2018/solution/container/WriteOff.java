package thoughtworks.campus2018.solution.container;

import java.util.Date;

import thoughtworks.campus2018.solution.bean.Car;
import thoughtworks.campus2018.solution.bean.Metieral;
import thoughtworks.campus2018.solution.utils.DateUtils;

//需要提醒报废的车辆
public class WriteOff extends Metieral implements MetieralOperation {

	@Override
	public boolean isThisCar(Car car, Date currentTime) {
		// TODO Auto-generated method stub
		// 若车辆有大修，报废年限降为3年（据购买日期加3*365=1095天），一般车辆6年（据购买日期加6*365=2190天）开始报废
		Date scrapTime = car.wasRepaired() ? DateUtils.addDate(car.getBuyTime(), 3 * 365)
				: DateUtils.addDate(car.getBuyTime(), 6 * 365);
		if (DateUtils.getMonthDiff(scrapTime, currentTime) <= 1) { // 提前一个月开始提醒
			return true;
		}
		return false;
	}

}