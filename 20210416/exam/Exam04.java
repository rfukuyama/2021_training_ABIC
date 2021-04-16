package exam;

import java.util.ArrayList;
import java.util.List;

class Exam04 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Employee emp1 = new Employee("田中太郎", 20);
		Employee emp2 = new Employee("鈴木一郎", 30);
		Employee emp3 = new Employee("佐藤花子", 25);
		List<Employee> members = new ArrayList<Employee>();

		members.add(emp1);
		members.add(emp2);
		members.add(emp3);

		for (Employee item : members) {
			item.introduce();
		}
	}
}

class Employee {
	private String name;
	private int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void introduce() {
		System.out.println(name + "さんは" + age + "歳です");
	}

}