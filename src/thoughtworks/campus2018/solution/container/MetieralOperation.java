package thoughtworks.campus2018.solution.container;

import java.util.Date;

import thoughtworks.campus2018.solution.bean.Car;

public interface MetieralOperation {
	public boolean isThisCar(Car car, Date currentTime);// 判断是否为这一种car
}