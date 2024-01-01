package com.mock.cadastro.mockCadastro.controller;

import com.mock.cadastro.mockCadastro.model.dto.RequestCadastroDTO;
import com.mock.cadastro.mockCadastro.model.dto.ResponseCadastroDTO;
import com.mock.cadastro.mockCadastro.service.CadastroService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping(value = "/cadastro")
public class CadastroController {

    @Autowired
    private CadastroService service;

    @GetMapping("/consult/{bankId}")
    public ResponseEntity<ResponseCadastroDTO> consultBalance(@PathVariable("bankId") RequestCadastroDTO requestDTO) throws Exception {
        log.info("Entering in the controller - Balance Account");
        ResponseCadastroDTO response = service.consultBalance(requestDTO);
        log.info("leaving in the controller - Balance Account");
        return ResponseEntity.ok().body(response);
    }
}
