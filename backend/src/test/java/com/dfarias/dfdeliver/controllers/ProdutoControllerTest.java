package com.dfarias.dfdeliver.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dfarias.dfdeliver.dto.ProdutoDTO;
import com.dfarias.dfdeliver.services.ProdutoService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class ProdutoControllerTest {
    @InjectMocks
    private ProdutoController produtoController;

    @Mock
    private ProdutoService produtoService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testFindAll() {
        List<ProdutoDTO> produtoDTOList = new ArrayList<>();
        produtoDTOList.add(new ProdutoDTO());
        produtoDTOList.add(new ProdutoDTO());

        when(produtoService.findAll()).thenReturn(produtoDTOList);

        ResponseEntity<List<ProdutoDTO>> responseEntity = produtoController.findAll();

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(produtoDTOList, responseEntity.getBody());
    }
}