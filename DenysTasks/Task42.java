
public class Task42 extends TaskMain{
public static void main(String[] args ) {
	execute();
}


public static void TwiceAsOld(int dadYears, int sonYears){
    //TODO: Add code here
	
    int twice = sonYears * 2;
    
    if(twice > dadYears) System.out.println(sonYears - (dadYears - sonYears));
    else System.out.println(sonYears - (dadYears - sonYears));
  
}


public static void execute() {
	 System.out.println("Enter fathers age: ");
	 int dadYears = TaskMain.sc.nextInt();
	 System.out.println("Enter sons age: ");
	 int sonYears = TaskMain.sc.nextInt();
	 TwiceAsOld(dadYears, sonYears);
}
}
