package _02_sea_creature;

public class Runner {
public static void main(String[] args) {
	SeaCreature[] s = new SeaCreature[3];
	String[] a = new String[3];
	a[0] = "spongebob";
	a[1] = "patrick";
	a[2] = "squidward";
	for (int i = 0; i < s.length; i++) {
		s[i] = new SeaCreature(a[i]);
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(s[i].getName());
		s[i].eat();
		s[i].laugh();
	}
	//SeaCreature s = new SeaCreature("Spongebob");
}
}
