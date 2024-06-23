package com.bodega.apirest_bodega.controladores;

import com.bodega.apirest_bodega.modelos.Vino;
import com.bodega.apirest_bodega.servicios.VinoServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class VinoControlador {
    @Autowired
    VinoServicioImpl vinoServicio;

    /*
    *
    * */
    @GetMapping("/vinos")
    public List<Vino> obtenerVinos(){
        return vinoServicio.ordenarTodo();
    }

    @PostMapping("/guardar")
    public ResponseEntity<Vino> guardarVino(@RequestBody Vino vino){
        Vino nuevo_vino = vinoServicio.guardar(vino);
        return new ResponseEntity<>(nuevo_vino, HttpStatus.CREATED);
    }

    @GetMapping("/vino/{id}")
    public ResponseEntity<Vino> obtenerVinoId(@PathVariable long id){
        Vino vino_por_id = vinoServicio.obtenerPorID(id);
        return ResponseEntity.ok(vino_por_id);
    }

    @PutMapping("/vino/{id}")
    public ResponseEntity<Vino> actualzarVino(@PathVariable long id, @RequestBody Vino vino) {
        Vino vino_por_id = vinoServicio.obtenerPorID(id);
        vino_por_id.setNombre(vino.getNombre());
        vino_por_id.setTipo(vino.getTipo());
        vino_por_id.setAniada(vino.getAniada());
        vino_por_id.setBodega(vino.getBodega());

        Vino vino_actualzado = vinoServicio.guardar(vino_por_id);
        return new ResponseEntity<>(vino_actualzado, HttpStatus.CREATED);
    }
    @DeleteMapping("/vino/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarVino(@PathVariable long id) {
        vinoServicio.eliminar(id);
        HashMap<String, Boolean> estado_Vino_Eliminado = new HashMap<>();
        estado_Vino_Eliminado.put("eliminado",true);
        return ResponseEntity.ok(estado_Vino_Eliminado);
    }
}
