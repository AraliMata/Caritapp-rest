package mx.tec.mobile.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.tec.mobile.lab.vo.Donation;
import mx.tec.mobile.lab.vo.Product;

@Repository
public interface ImportProductRepository extends JpaRepository<Product, Long> {
	
}

