package examples;

public class PrivateVariables {
	private String minimumBalance="$100";
	public String getMinimumBalance(){
		return minimumBalance;
	}
	public void setminimumBalance(String minBal){
		this.minimumBalance = minBal;
	}
}
