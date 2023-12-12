package br.com.nfdeveloper.cousethymeleaf.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.nfdeveloper.cousethymeleaf.model.Telefone;


@Repository
@Transactional
public interface TelefoneRepository extends CrudRepository<Telefone, Long>{

}
