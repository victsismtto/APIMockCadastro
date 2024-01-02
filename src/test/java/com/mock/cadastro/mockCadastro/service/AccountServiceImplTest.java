package com.mock.cadastro.mockCadastro.service;

import com.mock.cadastro.mockCadastro.exception.NotFoundException;
import com.mock.cadastro.mockCadastro.mapper.CadastroMapper;
import com.mock.cadastro.mockCadastro.model.dto.CadastroEntity;
import com.mock.cadastro.mockCadastro.model.dto.RequestCadastroDTO;
import com.mock.cadastro.mockCadastro.repository.CadastroConsultRepository;
import com.mock.cadastro.mockCadastro.service.impl.CadastroServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class AccountServiceImplTest {

    @Mock
    private CadastroConsultRepository transferAndBalanceRepository;

    @Mock
    private CadastroMapper accountMapper;

    @InjectMocks
    private CadastroServiceImpl service;


    @Test
    void consultBalance() throws Exception {

        RequestCadastroDTO requestDTO = RequestCadastroDTO.builder()
                .IdBank("1")
                .build();

        Optional<CadastroEntity> transferEntity = Optional.ofNullable(CadastroEntity.builder()
                .name("Client_1")
                .build());

        Mockito.when(transferAndBalanceRepository.findByIdBank(requestDTO.getIdBank())).thenReturn(transferEntity);

        Assertions.assertDoesNotThrow(
                () -> service.consultBalance(requestDTO));
    }

    @Test
    void consultBalanceError() throws Exception {

        RequestCadastroDTO requestDTO = RequestCadastroDTO.builder()
                .IdBank("1")
                .build();

        Mockito.when(transferAndBalanceRepository.findByIdBank(requestDTO.getIdBank())).thenReturn(Optional.empty());

        Assertions.assertThrows(NotFoundException.class,
                () -> service.consultBalance(requestDTO));
    }
}
