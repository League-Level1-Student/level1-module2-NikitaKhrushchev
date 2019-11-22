package _07_tea_party;

public class TeaParty {
		String a = "";
        public String welcome(String name, boolean isWoman, boolean isKnighted) {
        	if (isKnighted == true) {
        		if (isWoman == false) {
            		a = "Sir";
            		}
            		else {
            			a = "Lady";
            		}
        	}
        	else {
        		if (isWoman == false) {
            		a = "Mr.";
            		}
            		else {
            			a = "Mrs.";
            		}
        	}
        return "Welcome, " + a + name;
        }

}
