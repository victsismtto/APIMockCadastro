package com.mock.cadastro.mockCadastro.exception;


import com.mock.cadastro.mockCadastro.utils.MessageUtils;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
