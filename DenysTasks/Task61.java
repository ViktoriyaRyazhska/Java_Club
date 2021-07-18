
public class Task61 {

	public static void main(String[] args) {
		
	}
	public static void correct(String string) {
	    String s = string.replace("5","S").replace("0", "O").replace("1","I");
	    System.out.println(s);
	  }
	
	public static void execute() {
		System.out.print("Enter a text: ");
		String s = TaskMain.sc.nextLine();
		correct(s);
	}
	
}
