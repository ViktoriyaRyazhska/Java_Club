
public class Task52 extends TaskMain{
public static void main(String[] args) {
	
}
	
	
	
	public static void tripleTrouble(String s1, String s2, String s3) {
	    StringBuilder sb = new StringBuilder(s1.length()*3);
	    for (int i=0; i<s1.length(); i++) {
	      sb.append(s1.charAt(i)).append(s2.charAt(i)).append(s3.charAt(i));
	    }
	    String s = sb.toString();
	    System.out.println(s);
}
	
	public static void execute() {
		System.out.println("Enter three words: ");
		String s1 = TaskMain.sc.nextLine();
		String s2 = TaskMain.sc.nextLine();
		String s3 = TaskMain.sc.nextLine();
		tripleTrouble(s1, s2, s3);
	}
}
