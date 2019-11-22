package _01_getters_and_setters;

import javax.swing.JOptionPane;

public class Taco {
private String meat = "";
private String sauce = "";
String getMeat() {
	return this.meat;
}
String getSauce() {
	return this.sauce;
}
void setMeat(String meat) {
	this.meat = meat;
}
void setSauce(String sauce) {
	this.sauce = sauce;
}
}
