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
    *   Método para la obtención de un listado de vinos en la base de datos.
    *   No se debe entregar nungún elemento en el cuerpo de la petición.
    *   El codigo de respuesta es 200 OK con un cuerpo de respuesta de la siuiente froma:
    *       Se obtendrá un elemento lista formada por elementos del tipo vino,
    *       cada uno de ellos con mostrando todos sus datos.
    *   API: http://localhost:8080/api/v1/vinos
    * */
    @GetMapping("/vinos")
    public List<Vino> obtenerVinos(){
        return vinoServicio.ordenarTodo();
    }

    /*
     *   Método para añadir un elemento vino en la base de datos.
     *   En el cuerpo de la petición se debe entregar elemento en el formato deseado (JSON preferiblemente).
     *   El codigo de respuesta es 201 Created con un cuerpo de respuesta donde se encuentra el vino añadido.
     *   API: http://localhost:8080/api/v1/guardar
     * */
    @PostMapping("/guardar")
    public ResponseEntity<Vino> guardarVino(@RequestBody Vino vino){
        Vino nuevo_vino = vinoServicio.guardar(vino);
        return new ResponseEntity<>(nuevo_vino, HttpStatus.CREATED);
    }

    /*
     *   Método para la obtención de un vino concreto con {id} en la base de datos.
     *   No se debe entregar nungún elemento en el cuerpo de la petición.
     *   El codigo de respuesta es 200 OK con un cuerpo de respuesta donde se encuentra el vino seleccionado.
     *   API: http://localhost:8080/api/v1/vino/{id}
     *
     *   Este metodo no se ha podido añadir al frontend por falta de tiempo, pero no debería requerir demasiado.
     * */
    @GetMapping("/vino/{id}")
    public ResponseEntity<Vino> obtenerVinoId(@PathVariable long id){
        Vino vino_por_id = vinoServicio.obtenerPorID(id);
        return ResponseEntity.ok(vino_por_id);
    }

    /*
     *   Método para la modificacion/actualización de un vino concreto con {id} en la base de datos.
     *   En el cuerpo de la petición se debe entregar elemento a actualizar en el formato deseado (JSON preferiblemente).
     *   El codigo de respuesta es 201 Created con un cuerpo de respuesta donde se encuentra el vino actualizado.
     *   API: http://localhost:8080/api/v1/vino/{id}
     *
     *   Este metodo no se ha podido añadir al frontend por falta de tiempo, pero no debería requerir demasiado.
     * */
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

    /*
     *   Método para la eliminación de un vino concreto con {id} en la base de datos.
     *   No se debe entregar nungún elemento en el cuerpo de la petición.
     *   El codigo de respuesta es 200 OK con un cuerpo de respuesta donde se encuentra
     *    un booleano que indica si se ha eliminado o no el vino, tiene la siguiente forma:
     *          {
     *              "eliminado": true/false
     *          }
     *   API: http://localhost:8080/api/v1/vino/{id}
     *
     *   Este metodo no se ha podido añadir al frontend por falta de tiempo, pero no debería requerir demasiado.
     * */
    @DeleteMapping("/vino/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarVino(@PathVariable long id) {
        vinoServicio.eliminar(id);
        HashMap<String, Boolean> estado_Vino_Eliminado = new HashMap<>();
        estado_Vino_Eliminado.put("eliminado",true);
        return ResponseEntity.ok(estado_Vino_Eliminado);
    }
}
