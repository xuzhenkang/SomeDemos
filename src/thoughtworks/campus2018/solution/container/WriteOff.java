package thoughtworks.campus2018.solution.container;

import java.util.Date;

import thoughtworks.campus2018.solution.bean.Car;
import thoughtworks.campus2018.solution.bean.Metieral;
import thoughtworks.campus2018.solution.utils.DateUtils;

//��Ҫ���ѱ��ϵĳ���
public class WriteOff extends Metieral implements MetieralOperation {

	@Override
	public boolean isThisCar(Car car, Date currentTime) {
		// TODO Auto-generated method stub
		// �������д��ޣ��������޽�Ϊ3�꣨�ݹ������ڼ�3*365=1095�죩��һ�㳵��6�꣨�ݹ������ڼ�6*365=2190�죩��ʼ����
		Date scrapTime = car.wasRepaired() ? DateUtils.addDate(car.getBuyTime(), 3 * 365)
				: DateUtils.addDate(car.getBuyTime(), 6 * 365);
		if (DateUtils.getMonthDiff(scrapTime, currentTime) <= 1) { // ��ǰһ���¿�ʼ����
			return true;
		}
		return false;
	}

}