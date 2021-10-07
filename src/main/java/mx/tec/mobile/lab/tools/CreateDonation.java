package mx.tec.mobile.lab.tools;

import org.springframework.stereotype.Service;

import mx.tec.mobile.lab.vo.Donation;

@Service
public class CreateDonation {

	public Donation create(Donation donation) {
		return new Donation(donation.getDonador(), donation.getTienda(), donation.getKilos(), donation.getFecha());
	}

}
