import React, { useState } from 'react'
import VinoService from '../sevices/VinoService';
import { Link, useNavigate } from 'react-router-dom';

export const AddVinoComponent = () => {
    const [nombre, setNombre] = useState('');
    const [tipo, setTipo] = useState('');
    const [aniada, setAniada] = useState('');
    const [bodega, setBodega] = useState('');
    const navigate = useNavigate();

    const saveVino = (e) => {
        e.preventDefault();
        const vino = { nombre, tipo, aniada, bodega };
        VinoService.createVino(vino).then((response) => {
            console.log(response.data);
            navigate('/')
        }).catch(error => {
            console.log(error);
        })
    }

  return (
    <div>
        <div className='container'>
            <div className='row'>
                <div className='card col-md-6 offset-md-3 offset-md-3'>
                    <h2 className='text-center'>Registro de Vinitos</h2>
                    <div className='card-body'>
                        <form>
                            <div className='form-group mb-2'>
                                <label className='form-label'>Nombre</label>
                                <input
                                    type='text'
                                    placeholder='Introduzca el nombre'
                                    name='nombre'
                                    className='form-control'
                                    value={ nombre }
                                    onChange={ (e) => setNombre(e.target.value) }
                                    />
                            </div>
                            <div className='form-group mb-2'>
                                <label className='form-label'>Tipo</label>
                                <input
                                    type='text'
                                    placeholder='Introduzca el tipo'
                                    name='tipo'
                                    className='form-control'
                                    value={ tipo }
                                    onChange={ (e) => setTipo(e.target.value) }
                                    />
                            </div>
                            <div className='form-group mb-2'>
                                <label className='form-label'>Añada</label>
                                <input
                                    type='text'
                                    placeholder='Inntroduzca la añada'
                                    name='aniada'
                                    className='form-control'
                                    value={ aniada }
                                    onChange={ (e) => setAniada(e.target.value) }
                                    />
                            </div>
                            <div className='form-group mb-2'>
                                <label className='form-label'>Bodega</label>
                                <input
                                    type='text'
                                    placeholder='Introduzca la bodega'
                                    name='bodega'
                                    className='form-control'
                                    value={ bodega }
                                    onChange={ (e) => setBodega(e.target.value) }
                                    />
                            </div>
                            <button className='btn btn-success' onClick={ (e) => saveVino(e) }>Guardar</button>
                            &nbsp;&nbsp;
                            <Link to='/' className='btn btn-danger'>Cancelar</Link>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
  )
}

export default AddVinoComponent;