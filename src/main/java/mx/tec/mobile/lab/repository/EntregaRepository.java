package mx.tec.mobile.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.tec.mobile.lab.vo.Entrega;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {
	
}