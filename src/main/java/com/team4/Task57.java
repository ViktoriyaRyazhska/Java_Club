
public class Task57 extends TaskMain{

	public static void main(String[] args) {
		
	}
	public static void abbrevName(String name) {
	    String s = (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();
	    System.out.println(s);
	  }
	public static void execute() {
		System.out.println("Enter your name: "); String name = TaskMain.sc.nextLine();
		abbrevName(name);
	}
}
