package com.mock.cadastro.mockCadastro.controller;

import com.mock.cadastro.mockCadastro.model.dto.RequestCadastroDTO;
import com.mock.cadastro.mockCadastro.service.CadastroService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CadastroControllerTest {

    @InjectMocks
    private CadastroController controller;
    @Mock
    private CadastroService service;

    @Test
    void testShouldConsultBalance() {

        RequestCadastroDTO requestDTO = RequestCadastroDTO.builder()
                .IdBank("1")
                .build();

        Assertions.assertDoesNotThrow(
                () -> controller.consultBalance(requestDTO));
    }
}
