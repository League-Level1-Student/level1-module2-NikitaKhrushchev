package _03_smurf;

public class runner {
public static void main(String[] args) {
	String[] sn = new String[3];
	int[] sn1 = new int[3];
	int[] sn2 = new int[3];
	Smurf[] sl = new Smurf[3];
	sn[0] = "Handy Smurf";
	sn[1] = "Papa Smurf";
	sn[2] = "Smurfette";
	sn1[0] = 1;
	sn1[1] = 1;
	sn1[2] = 0;
	sn2[0] = 1;
	sn2[1] = 0;
	sn2[2] = 1;
	for (int i = 0; i < sn.length; i++) {
		sl[i] = new Smurf(sn1[i],sn2[i]);
		sl[i].setName(sn[i]);
	}
	for (int j = 0; j < sl.length; j++) {
		sl[j].eat();
		System.out.println(sl[j].isGirlOrBoy());
		System.out.println(sl[j].getHatColor());
	}
}
}
