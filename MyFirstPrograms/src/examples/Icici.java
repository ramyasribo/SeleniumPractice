package examples;

import practicePrograms.Rbi;

public class Icici implements Rbi {

	@Override
	public void WithDraw() {
		System.out.println("This is over ride method of with draw in Hdfc bank");
		
	}

	@Override
	public void Deposit() {
		System.out.println("This is over ride method of deposit in Hdfc bank");
		
	}

}
