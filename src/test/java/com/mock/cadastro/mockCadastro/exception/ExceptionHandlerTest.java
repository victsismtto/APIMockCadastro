package com.mock.cadastro.mockCadastro.exception;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ExceptionHandlerTest {

    @InjectMocks ExceptionsHandler exceptionsHandler;

    @Test
    void handleSecurityNotFoundTest() {
        exceptionsHandler.handleSecurity(new NotFoundException());
    }
}
