package com.bodega.apirest_bodega.repositorios;

import com.bodega.apirest_bodega.modelos.Vino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VinoRepositorio extends JpaRepository<Vino, Long> {

}
