package com.bodega.apirest_bodega.servicios;

import com.bodega.apirest_bodega.modelos.Vino;
import com.bodega.apirest_bodega.repositorios.VinoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VinoServicioImpl implements IVinoServicio {
    @Autowired
    VinoRepositorio vinoRepositorio;
    @Override
    public List<Vino> ordenarTodo() {
        return vinoRepositorio.findAll();
    }

    @Override
    public Vino guardar(Vino vino) {
        return vinoRepositorio.save(vino);
    }

    @Override
    public Vino obtenerPorID(long id) {
        return vinoRepositorio.findById(id).orElse(null);
    }

    @Override
    public void eliminar(long id) {
        vinoRepositorio.deleteById(id);
    }
}
