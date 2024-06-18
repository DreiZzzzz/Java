public class MyDate {
	private int year;
	private int month;
	private int day;

	public MyDate() { // default - January 1 1950
		this.year = 1950;
		this.month = 1;
		this.day = 1;
	}
	public MyDate(int month, int day) { // month day and year is 2000
		this.year = 2000; 
		setMonth(month);
		setDay(day) ;
	}
	public MyDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}

	public void setYear(int year) {
		this.year = year; 
	}
	public void setMonth(String month) {
		String[] monthLists = {"january", "february", "march", "april", "may", "june", 
							  "july", "august", "september", "october", "november", "december"};

		month = month.toLowerCase(); 
		for (int i = 0; i < monthLists.length; i++) {
			if (month.equals(monthLists[i])) {
				setMonth(i + 1); 
			}
		}
	}
	public void setMonth(int month) {
		this.month = month; 
	}
	public void setDay(int day) {
		this.day = day; 
	}

	public boolean isBefore(MyDate x) {

		if (this.year < x.year) {
			return true;
		} else if (this.year == x.year) {
			if (this.month < x.month) {
				return true; 
			} else if (this.month == x.month) {
				if (this.day < x.day) {
					return true; 
				}
			}
		}
		return false; 
	}

}