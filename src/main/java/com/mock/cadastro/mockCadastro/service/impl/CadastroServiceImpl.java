package com.mock.cadastro.mockCadastro.service.impl;

import com.mock.cadastro.mockCadastro.exception.NotFoundException;
import com.mock.cadastro.mockCadastro.mapper.CadastroMapper;
import com.mock.cadastro.mockCadastro.model.dto.CadastroEntity;
import com.mock.cadastro.mockCadastro.model.dto.RequestCadastroDTO;
import com.mock.cadastro.mockCadastro.model.dto.ResponseCadastroDTO;
import com.mock.cadastro.mockCadastro.repository.CadastroConsultRepository;
import com.mock.cadastro.mockCadastro.service.CadastroService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Log4j2
@Service
public class CadastroServiceImpl implements CadastroService {

    @Autowired private CadastroMapper accountMapper;

    @Autowired
    private CadastroConsultRepository consultRepository;

    @Override
    public ResponseCadastroDTO consultBalance(RequestCadastroDTO requestDTO) throws Exception {
        log.info("Entering in the service - Balance Consult");

        Optional<CadastroEntity> balanceConsultEntity = consultRepository.findByIdBank(requestDTO.getIdBank());
        if (balanceConsultEntity.isEmpty()) {
            throw new NotFoundException();
        }
        ResponseCadastroDTO responseBalanceConsultDTO = accountMapper.toBalanceConsultResponse(balanceConsultEntity.get());

        log.info("Leaving in the service - Balance Consult");
        return responseBalanceConsultDTO;
    }
}
