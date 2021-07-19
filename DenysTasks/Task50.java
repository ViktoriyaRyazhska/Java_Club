
public class Task50 extends TaskMain{
public static void main(String[] args) {
	
}


public static void areYouPlayingBanjo(String name) {
    // Program me!
    char[] chr = name.toCharArray();
    if(chr[0] == 'r' || chr[0] == 'R') System.out.println(name + " plays banjo");
    else System.out.println(name + " does not play banjo");
    
}

public static void execute() {
	System.out.print("Enter your name: ");
	String s = TaskMain.sc.nextLine();
	areYouPlayingBanjo(s);
}
}
