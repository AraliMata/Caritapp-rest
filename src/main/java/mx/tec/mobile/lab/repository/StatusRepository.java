package mx.tec.mobile.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.tec.mobile.lab.vo.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, Long> {
	
}
