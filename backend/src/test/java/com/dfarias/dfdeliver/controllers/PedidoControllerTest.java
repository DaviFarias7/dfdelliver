package com.dfarias.dfdeliver.controllers;

import com.dfarias.dfdeliver.dto.PedidoDTO;
import com.dfarias.dfdeliver.services.PedidoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PedidoControllerTest {

    @InjectMocks
    private PedidoController pedidoController;

    @Mock
    private PedidoService pedidoService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testFindAll() {
        List<PedidoDTO> pedidoDTOList = new ArrayList<>();
        pedidoDTOList.add(new PedidoDTO());
        pedidoDTOList.add(new PedidoDTO());

        when(pedidoService.findAll()).thenReturn(pedidoDTOList);

        ResponseEntity<List<PedidoDTO>> responseEntity = pedidoController.findAll();

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(pedidoDTOList, responseEntity.getBody());
    }

    @Test
    void testInsert() {
        PedidoDTO pedidoDTO = new PedidoDTO();
        when(pedidoService.insert(any(PedidoDTO.class))).thenReturn(pedidoDTO);

        ResponseEntity<PedidoDTO> responseEntity = pedidoController.insert(pedidoDTO);

        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
        assertEquals(pedidoDTO, responseEntity.getBody());
    }

    @Test
    void testSetEntregue() {
        Long pedidoId = 1L;
        PedidoDTO pedidoDTO = new PedidoDTO();
        when(pedidoService.setEntregue(pedidoId)).thenReturn(pedidoDTO);

        ResponseEntity<PedidoDTO> responseEntity = pedidoController.setEntrgue(pedidoId);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(pedidoDTO, responseEntity.getBody());
    }
}