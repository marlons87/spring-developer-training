package com.demo.services;

import com.demo.model.Tarjeta;
import com.demo.repository.TarjetaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TarjetaService {
    private TarjetaRepository tarjetaRepository;

    public void cambiarEstadoTarjetaPorId(int id){
        Tarjeta tarjeta = tarjetaRepository.findById(id).orElseThrow();
        //tarjeta.setEstado();

    }
}
