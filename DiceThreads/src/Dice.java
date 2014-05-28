public class Dice implements Runnable {	
	public int Throw(){
		int total = 0;
			for (int k = 1; k <=25; k++) {
				int die = (int) (1 + (Math.random() * 6));
				System.out.printf("Dice %d = %d\n", k , die);
				total =die;
			}		
			return total;
		}
	@Override
	public void run() {

		for (long i = 1; i <= 2; i++) {
			long sum = Throw();
			System.out.printf("Set %d\n\n\n", i);
		}
	}	
}
		