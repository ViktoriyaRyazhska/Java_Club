
public class Task49{
public static void main(String[] args) {
	
	
}



	  public static void replaceDots(final String str) {
	    String s = str.replace(".", "-");
	    System.out.println(s);
	  }
	  
	  public static void execute() {
		  System.out.println("Enter something: ");
		  String s = TaskMain.sc.nextLine();
		  replaceDots(s);
	  }
}
