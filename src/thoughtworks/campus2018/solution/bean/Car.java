package thoughtworks.campus2018.solution.bean;

import java.util.Date;

//汽车类
public class Car {
	private String carID;// 车牌号
	private Date buyTime;// 购买日期
	private String name;// 产品名称
	private int currentKMs;// 目前运行公里数
	private boolean repaired;// 有无大修 true表示有，false表示无

	public Car(String carID, Date buyTime, String name, int currentKMs, boolean repaired) {
		this.carID = carID;
		this.buyTime = buyTime;
		this.name = name;
		this.currentKMs = currentKMs;
		this.repaired = repaired;
	}

	public String getCarID() {
		return carID;
	}

	public void setCarID(String carID) {
		this.carID = carID;
	}

	public Date getBuyTime() {
		return buyTime;
	}

	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentKMs() {
		return currentKMs;
	}

	public void setCurrentKMs(int currentKMs) {
		this.currentKMs = currentKMs;
	}

	public boolean wasRepaired() {
		return repaired;
	}

	public void setRepaired(boolean repaired) {
		this.repaired = repaired;
	}

}
