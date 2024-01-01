package com.mock.cadastro.mockCadastro.repository;

import com.mock.cadastro.mockCadastro.model.dto.CadastroEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CadastroConsultRepository extends MongoRepository<CadastroEntity, String> {

    Optional<CadastroEntity> findByIdBank(String idBank);

}
