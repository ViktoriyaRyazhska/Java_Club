
public class Task51 extends TaskMain{

	public static void main(String[] args) {
		
	}
	
	
	
	
	public static void noSpace(final String x) {
        String s = "";
      char[] chr = x.toCharArray();
      for(int i = 0; i != chr.length; i++){
        if(chr[i] != ' ') s += chr[i];
      }
      System.out.println(s);
    }
	
	public static void execute() {
	 System.out.print("Enter some text: ");
	 String s = TaskMain.sc.nextLine();
	 noSpace(s);
	}
}
