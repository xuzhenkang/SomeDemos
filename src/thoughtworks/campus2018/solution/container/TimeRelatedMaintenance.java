package thoughtworks.campus2018.solution.container;

import java.util.Date;

import thoughtworks.campus2018.solution.bean.Car;
import thoughtworks.campus2018.solution.bean.Metieral;
import thoughtworks.campus2018.solution.utils.DateUtils;

//��Ҫ���Ѷ��ڱ����ĳ���
public class TimeRelatedMaintenance extends Metieral implements MetieralOperation {

	@Override
	public boolean isThisCar(Car car, Date currentTime) {
		// TODO Auto-generated method stub
		// 3�����³���ÿ12���¶��ڱ���һ��
		if (DateUtils.getYearDiff(currentTime, car.getBuyTime()) < 3
				&& (DateUtils.getMonthDiff(currentTime, car.getBuyTime()) % 12 == 11
						|| DateUtils.getMonthDiff(currentTime, car.getBuyTime()) % 12 == 0)) {
			return true;
		}
		// 3�꼰���ϳ���ÿ6���¶��ڱ���һ��
		if (DateUtils.getYearDiff(currentTime, car.getBuyTime()) >= 3
				&& (DateUtils.getMonthDiff(currentTime, car.getBuyTime()) % 6 == 5
						|| DateUtils.getMonthDiff(currentTime, car.getBuyTime()) % 6 == 0)) {
			return true;
		}
		// �������д��ޣ���ÿ3���¾���Ҫ���ڱ���һ��
		if (car.wasRepaired() && (DateUtils.getMonthDiff(currentTime, car.getBuyTime()) % 3 == 2
				|| DateUtils.getMonthDiff(currentTime, car.getBuyTime()) % 3 == 0)) {
			return true;
		}

		return false;
	}

}
