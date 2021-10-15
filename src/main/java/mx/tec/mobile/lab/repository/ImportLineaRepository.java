package mx.tec.mobile.lab.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.tec.mobile.lab.vo.Linea;

@Repository
public interface ImportLineaRepository extends JpaRepository<Linea, Long> {
	
}

