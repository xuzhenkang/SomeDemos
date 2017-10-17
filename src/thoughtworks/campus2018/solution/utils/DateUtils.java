package thoughtworks.campus2018.solution.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {
	private static int year1;
	private static int year2;
	private static int month1;
	private static int month2;
	private static int day1;
	private static int day2;

	private static int yearInterval;
	private static int monthInterval;

	public static int getMonth(Date d1) {
		Calendar c = Calendar.getInstance();
		c.setTime(d1);
		return c.get(Calendar.MONTH) + 1;

	}

	private static boolean setTime(Date d1, Date d2) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(d1);
		c2.setTime(d2);
		if (c1.getTimeInMillis() < c2.getTimeInMillis())
			return false;
		year1 = c1.get(Calendar.YEAR);
		year2 = c2.get(Calendar.YEAR);
		month1 = c1.get(Calendar.MONTH);
		month2 = c2.get(Calendar.MONTH);
		day1 = c1.get(Calendar.DAY_OF_MONTH);
		day2 = c2.get(Calendar.DAY_OF_MONTH);
		// ��ȡ��Ĳ�ֵ ���� d1 = 2015-8-16 d2 = 2015-7-30
		yearInterval = year1 - year2;
		// ��ȡ������ֵ
		monthInterval = month1 - month2;
		monthInterval = yearInterval * 12 + monthInterval;
		return true;
	}

	/**
	 * ��ȡ����������������
	 * 
	 * @param d1
	 *            �ϴ������
	 * @param d2
	 *            ��С������
	 * @return ���d1>d2���� ������ ���򷵻�0
	 */
	public static int getMonthDiff(Date d1, Date d2) {

		if (!setTime(d1, d2))
			return 0;
		return monthInterval;
	}

	/**
	 * ��ȡ����������������
	 * 
	 * @param d1
	 *            �ϴ������
	 * @param d2
	 *            ��С������
	 * @return ���d1>d2���� ������ ���򷵻�0
	 */
	public static int getYearDiff(Date d1, Date d2) {
		if (!setTime(d1, d2))
			return 0;
		return yearInterval;
	}

	// ����d1��dateNum�����������
	public static Date addDate(Date d, int dateNum) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(d);
		gc.add(5, +dateNum);
		gc.set(gc.get(Calendar.YEAR), gc.get(Calendar.MONTH), gc.get(Calendar.DATE));
		return gc.getTime();
	}

	// ����d1��MonthNum����֮�����õ�����
	public static Date addMonth(Date d, int MonthNum) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(d);
		gc.add(2, +MonthNum);
		gc.set(gc.get(Calendar.YEAR), gc.get(Calendar.MONTH), gc.get(Calendar.DATE));
		return gc.getTime();
	}

}