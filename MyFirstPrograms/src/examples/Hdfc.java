package examples;

import practicePrograms.Rbi;

public class Hdfc implements Rbi{

	@Override
	public void WithDraw() {
		System.out.println("This is over ride method of with draw in Icic bank");
	}

	@Override
	public void Deposit() {
		System.out.println("This is over ride method of deposit in Icic bank");
		
	}

}
