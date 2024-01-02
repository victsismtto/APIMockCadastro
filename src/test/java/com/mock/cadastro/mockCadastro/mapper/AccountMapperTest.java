package com.mock.cadastro.mockCadastro.mapper;

import com.mock.cadastro.mockCadastro.model.dto.CadastroEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AccountMapperTest {

    @InjectMocks
    private CadastroMapper mapper;

    @Test
    void toBalanceConsultResponse() {
        CadastroEntity responseCadastroDTO = CadastroEntity.builder()
                .name("Client_1")
                .build();
        Assertions.assertDoesNotThrow(
                () -> mapper.toBalanceConsultResponse(responseCadastroDTO));
    }
}
