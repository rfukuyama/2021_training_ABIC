package selflearning;

class Activity {
	private double hours;

	public void setHours(double aHours) {
		hours = aHours;
	}

	public double getHours() {
		return hours;
	}

	public double calcAvailability(int total) {
		return getHours() / total;
	}
}

class ActivityDemo {
	public static void main(String[] args) {
		Activity obj = new Activity();
		obj.setHours(140);
		System.out.println(obj.calcAvailability(150));
	}
}