import java.util.Scanner;
public class Main {	
	public static void main(String args []) {		
	
		Dice dice = new Dice();
		
		for (int i = 1; i <2; i++){
			Runnable T1 = new Dice();
			Thread dice1 = new Thread(T1);
			dice1.setName("Roll set #" + i);
			dice1.start();
		
		}
	}
}
