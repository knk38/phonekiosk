abstract public class Carrier {

	private String name = "Unknown Carrier";
	private double setupCostBase = 0.00;
	private double monthlyCostBase = 0.00;

	public Carrier(String name, int setupCost, int monthlycost) {
		this.name = name;
		this.setupCostBase = setupCost;
		this.monthlyCostBase = monthlycost;
	}

	@Override
	public String toString() {
		return name;
	}

	public String getFees() {
		return ", Setup Cost: " + setupCostBase + "Monthly Cost: " + monthlyCostBase;
	}//returns fees

	public void setFees(double setupcost, double monthlycost) {
		setupCostBase = setupcost;
		monthlyCostBase = monthlycost;
	}//set fees
}
