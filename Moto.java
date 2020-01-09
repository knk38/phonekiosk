
public class Moto extends Phone {
	private final String MANUFACTURER = "Moto";
	private final String BRAND = "Flip Phone";
	private Carrier carrier;

	@Override
	public void initialize(String carrier, boolean memberCA) {

	}

	public Moto(String carrier, boolean memberCA) {
		switch (carrier) {
		case "Verizon": {

			this.carrier = new Verizon(20, 70);

			break;
		}
		case "AT&T": {
			this.carrier = new ATandT(20, 70);
			break;
		}
		case "T-Mobile": {
			this.carrier = new Tmobile(20, 70);
			break;
		}
		default: {
			System.out.println("Unknown Carrier.  Try Again.%n");
			break;
		}
		}

	}

	@Override
	public String toString() {
		return MANUFACTURER + " " + BRAND + " on " + carrier.toString() + carrier.getFees();
	}

}
