
public class Task55 extends TaskMain{
public static void main(String[] args) {
	
	execute();
}


public static void howOld(final String herOld) {

	  //your code here, return correct age as int ; )
	    char[] chr = herOld.toCharArray();
	    String s = "" +chr[0];
	    System.out.println(s);
	  
	  }
public static void execute() {
	System.out.println("how old is her ");
	String h = TaskMain.sc.nextLine();
	howOld(h);
}
}
