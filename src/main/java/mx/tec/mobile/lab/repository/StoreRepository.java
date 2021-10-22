package mx.tec.mobile.lab.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.tec.mobile.lab.vo.Tienda;

@Repository
public interface StoreRepository extends JpaRepository<Tienda, Long> {
	//Select a store by given donor id
	@Query(value = "SELECT * FROM tienda where donador_id = ?1", nativeQuery = true)
	Optional<List<Tienda>> getTiendasByDonador(long donador_id);
	
}
