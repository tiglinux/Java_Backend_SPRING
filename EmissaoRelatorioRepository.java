package moduloImovel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import moduloImovel.model.EmissaoRelatorio;

@Repository
public interface EmissaoRelatorioRepository extends JpaRepository<EmissaoRelatorio, String>{
	
}
