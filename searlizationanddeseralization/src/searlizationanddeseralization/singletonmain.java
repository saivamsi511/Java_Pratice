package searlizationanddeseralization;

public class singletonmain {
public static void main(String[] args) {
//	presidentclass pm = new presidentclass("king", 3, "sai"); // this is private so we cant access
	
	presidentclass ans = presidentclass.getInstance("vamsi",5,"kings");
	System.out.println(ans.getName() + " " + ans.getTrem() + " " + ans.getParty());
	System.out.println(ans);

	presidentclass ans1 = presidentclass.getInstance("sai",5,"kings");
	System.out.println(ans.getName() + " " + ans.getTrem() + " " + ans.getParty());
	System.out.println(ans1);
	
//	presidentclass ans1 = presidentclass.getInstance("sai",5,"kings");
//	System.out.println(ans1.name + " " + ans1.trem + " " + ans1.party);
}
}
