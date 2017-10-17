package thoughtworks.campus2018.solution.bean;

import java.util.Date;

//������
public class Car {
	private String carID;// ���ƺ�
	private Date buyTime;// ��������
	private String name;// ��Ʒ����
	private int currentKMs;// Ŀǰ���й�����
	private boolean repaired;// ���޴��� true��ʾ�У�false��ʾ��

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
