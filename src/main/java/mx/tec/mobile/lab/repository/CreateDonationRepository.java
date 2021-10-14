package mx.tec.mobile.lab.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.tec.mobile.lab.vo.Donation;

@Repository
@Transactional
public interface CreateDonationRepository extends JpaRepository<Donation, Long> {
	
}

