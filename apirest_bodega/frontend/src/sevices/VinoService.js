import axios from "axios";

const VINO_BASE_REST_API_URL = "http://localhost:8080/api/v1/";

class VinoService{
    getAllVinos(){
        return axios.get(VINO_BASE_REST_API_URL + "vinos");
    }
    createVino(vino){
        return axios.post(VINO_BASE_REST_API_URL + "guardar",vino);
    }
    getVinoById(vinoId){
        return axios.get(VINO_BASE_REST_API_URL + "vino/" + vinoId);
    }
    updateVino(vinoId,vino){
        return axios.put(VINO_BASE_REST_API_URL + "vino/" + vinoId,vino);
    }
    deleteVino(vinoId){
        return axios.delete(VINO_BASE_REST_API_URL + "vino/" + vinoId);
    }
}

export default new VinoService();
