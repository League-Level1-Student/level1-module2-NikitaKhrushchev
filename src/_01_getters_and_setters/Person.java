package _01_getters_and_setters;

public class Person {
private String name = "";
private String superpower = "";
void setName(String thename) {
	name = thename;
}
void setPower(String power) {
	superpower = power;
}
String getPower() {
	return this.superpower;
}
String getName() {
	return this.name;
}
public String toString () {
	return (this.name+" has the skill " + this.superpower);
}
}
