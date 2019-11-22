package _01_getters_and_setters;

public class Runner {
public static void main(String[] args) {
	Person[] people = new Person[3];
	for (int i = 0; i < 3; i++) {
	//	String name = "person"+i;
		Person person = new Person();
		people[i] = person;
	}
	for (int i = 0; i < 3; i++) {
		people[i].setName("person " + (i+1));
		people[i].setPower("power "+(i+1));
	}
	for (int i = 0; i < 3; i++) {
		System.out.println(people[i].getName());
		System.out.println(people[i].getPower());
	}
}
}
