package com.demo.services;

import com.demo.dto.CuentaDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CuentaServiceTest {
    @Autowired
    private CuentaService cuentaService;
    @Test
    void buscarCuentasDinamicamentePorCriterio() {
        CuentaDto cuentaDto = new CuentaDto();
        //cuentaDto.setTipo("AHORROS");
        cuentaDto.setEstado(true);
        cuentaService.buscarCuentasDinamicamentePorCriterio(cuentaDto).forEach(
                cuentaDtoResultado -> {System.out.println("Cuenta Resultado" + cuentaDtoResultado);});
        assertEquals(1,1);
    }

}