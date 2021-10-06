package mx.tec.mobile.lab.tools;
import java.util.Date;

import mx.tec.mobile.lab.vo.Donation;

public class CreateDonation {

	public CreateDonation() {
		// TODO Auto-generated constructor stub
	}
	
	public Donation create(Donation donation) {
		return new Donation(donation.getDonador(), donation.getTienda(), donation.getKilos(), donation.getFecha());
	}

}
