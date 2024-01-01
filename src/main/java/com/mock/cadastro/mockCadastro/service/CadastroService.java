package com.mock.cadastro.mockCadastro.service;

import com.mock.cadastro.mockCadastro.model.dto.RequestCadastroDTO;
import com.mock.cadastro.mockCadastro.model.dto.ResponseCadastroDTO;

public interface CadastroService {

    ResponseCadastroDTO consultBalance(RequestCadastroDTO requestDTO) throws Exception;
}
