package mx.tec.mobile.lab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import mx.tec.mobile.lab.vo.Donation;

@Repository
public interface CalendarRepository extends JpaRepository<Donation, Long> {
	@Query(value = "SELECT * FROM events WHERE event_date Like %?1%", nativeQuery = true)
	List<Donation> findByDate(@Param ("eventDate") String eventDate);
	
}