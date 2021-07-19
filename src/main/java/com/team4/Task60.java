
public class Task60 extends TaskMain{

	public static void main(String[] args) {
		
	}
	
	public static void remove(String s, int n){
		  
	    while(n-->0)
	      s  = s.replaceFirst("!","");   
	    System.out.println(s);    
	  }
	public static void execute() {
		System.out.println("Enter a text");
		String s = TaskMain.sc.nextLine();
		System.out.println("Print a number");
		int n = TaskMain.sc.nextInt();
		remove(s, n);
	}
	
}
