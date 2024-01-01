package com.mock.cadastro.mockCadastro.mapper;

import com.mock.cadastro.mockCadastro.model.dto.CadastroEntity;
import com.mock.cadastro.mockCadastro.model.dto.ResponseCadastroDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class CadastroMapper {

    public ResponseCadastroDTO toBalanceConsultResponse(CadastroEntity entity) {
        return ResponseCadastroDTO.builder()
                .name(entity.getName())
                .build();
    }
}
