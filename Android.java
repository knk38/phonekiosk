public class Android extends Phone {

	private final String MANUFACTURER = "Samsung";
	private final String BRAND = "Note 8";
	private Carrier carrier;

	@Override
	public void initialize(String carrier, boolean memberCA) {

	}

	public Android(String carrier, boolean memberCA) {
		switch (carrier) {
		case "Verizon": {
			if (memberCA) {
				this.carrier = new Verizon(0, 50);
			} else {
				this.carrier = new Verizon(20, 65);
			}
			break;
		}
		case "AT&T": {
			if (memberCA) {
				this.carrier = new ATandT(0, 50);
			} else {
				this.carrier = new ATandT(20, 60);
			}
			break;
		}
		case "T-Mobile": {
			if (memberCA) {
				this.carrier = new Tmobile(0, 50);
			} else {
				this.carrier = new Tmobile(10, 60);
			}
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
