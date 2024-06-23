import React, { useEffect, useState } from 'react'
import VinoService from '../sevices/VinoService';
import { Link } from 'react-router-dom';

export const ListVinosComponent = () => {

    const [vinos,setvinos] = useState([]);

    useEffect(() => {
        VinoService.getAllVinos().then(response => {
            setvinos(response.data);
            console.log(response.data);
        }).catch(error => {
            console.log(error);
        })
    },[])

return (
    <div className='container'>
        <h2 className='text-center'>Lista de vinitos</h2>
        <Link to='add-vino' className='btn btn-primary mb-2'>Agregar vino</Link>
        <table className='table table-bordered table-striped'>
            <thead>
                <th>ID</th>
                <th>Nombre</th>
                <th>Tipo</th>
                <th>Añada</th>
                <th>Bodega</th>
            </thead>
            <tbody>
                {
                    vinos.map(
                        vino =>
                        <tr key={ vino.id }>
                            <td>{ vino.id }</td>
                            <td>{ vino.nombre }</td>
                            <td>{ vino.tipo }</td>
                            <td>{ vino.aniada }</td>
                            <td>{ vino.bodega }</td>
                        </tr>
                    )
                }
            </tbody>
        </table>
    </div>
  )
}

export default ListVinosComponent;