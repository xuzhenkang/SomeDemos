package thoughtworks.campus2018.solution.container;

import java.util.Date;

import thoughtworks.campus2018.solution.bean.Car;
import thoughtworks.campus2018.solution.bean.Metieral;
import thoughtworks.campus2018.solution.utils.DateUtils;

//已经报废的车
public class Over extends Metieral implements MetieralOperation {

	@Override
	public boolean isThisCar(Car car, Date currentTime) {
		// TODO Auto-generated method stub
		// 若车辆有大修，报废年限降为3年（据购买日期加3*365=1095天），一般车辆6年（据购买日期加6*365=2190天）开始报废
		Date scrapTime = car.wasRepaired() ? DateUtils.addDate(car.getBuyTime(), 3 * 365)
				: DateUtils.addDate(car.getBuyTime(), 6 * 365);
		if (scrapTime.before(currentTime) || scrapTime.equals(currentTime)) { // 报废时间在当前时间之前，或当前时间就是报废时间，则为报废车辆
			return true;
		}
		return false;
	}

}