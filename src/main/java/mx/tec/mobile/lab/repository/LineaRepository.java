package mx.tec.mobile.lab.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.tec.mobile.lab.vo.Linea;

@Repository
public interface LineaRepository extends JpaRepository<Linea, Long> {
	
	// Get all donation products by given Donation id
	// Set up sql query
	@Query(value = "SELECT * FROM linea WHERE donacion_id = ?1", nativeQuery = true)
	// Define type returned and function name and parameters
	Optional<List<Linea>> getProductsByDonationId(long id);

	
	//Update a product by given product id
	@Transactional
	@Modifying
	@Query(value = "UPDATE linea l set l.destino = ?2, l.status = ?3  WHERE l.id = ?1", nativeQuery = true)
    void updateLinea(long id, String destino, String status);
}


