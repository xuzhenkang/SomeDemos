package thoughtworks.campus2018.solution.bean;

import java.util.ArrayList;

//�����б��ʵ��
public class CarsListEntry implements Comparable<CarsListEntry> {
	private String name;// ��ǰentry����������
	private ArrayList<Car> carList = new ArrayList<>(); // ��ǰentry�������б�

	public CarsListEntry(Car car) {
		this.name = car.getName();
		putCar(car);
	}

	public void putCar(Car car) {
		if (this.name == null) {
			this.setName(car.getName());
			carList.add(car);
		} else if (this.name != null && car.getName().equals(this.name)) {
			carList.add(car);
		} else {
			System.out.println("putCar��ʱ�������car�����е�car���Ʋ�һ��");
		}
	}

	public String getName() {
		return name;
	}

	// nameֻ�ܱ���ֵһ��
	public boolean setName(String name) {
		if (this.name == null) {
			this.name = name;
			return true;
		} else
			return false;
	}

	public ArrayList<Car> getCarIdList() {
		return carList;
	}

	public int getNum() {
		return this.carList.size();
	}

	@Override
	public int compareTo(CarsListEntry o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name); // �����ֵ��������
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("(");
		for (int i = 0; i < carList.size(); i++) {
			sb.append(carList.get(i).getCarID());
			if (i < carList.size() - 1)
				sb.append(", ");
		}
		sb.append(")");
		return sb.toString();
	}

}