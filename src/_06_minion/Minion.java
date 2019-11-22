package _06_minion;

public class Minion {
private String name;
private int eyes;
private String colour;
private String master;
Minion(String name,int eyes,String colour, String master){
this.name = name;
this.eyes = eyes;
this.colour= colour;
this.master= master;
}
String getName() {
	return this.name;
}
int getEyes() {
	return this.eyes;
}
String getColour() {
	return this.colour;
}
void setMaster(String master) {
	this.master = master;
}
String getMaster() {
	return this.master;
}
}
