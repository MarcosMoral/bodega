package com.bodega.apirest_bodega.servicios;

import com.bodega.apirest_bodega.modelos.Vino;

import java.util.List;

public interface IVinoServicio {
    public List<Vino> ordenarTodo();

    public Vino guardar(Vino vino);

    public Vino obtenerPorID(long id);

    public void eliminar(long id);
}
