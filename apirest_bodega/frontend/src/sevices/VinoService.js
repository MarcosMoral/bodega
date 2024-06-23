import axios from "axios";

const VINO_BASE_REST_API_URL = "http://localhost:8080/api/v1/vinos";

class VinoService{
    getAllVinos(){
        return axios.get("http://localhost:8080/api/v1/vinos");
    }
    createVino(vino){
        return axios.post("http://localhost:8080/api/v1/guardar",vino);
    }
}

export default new VinoService();
