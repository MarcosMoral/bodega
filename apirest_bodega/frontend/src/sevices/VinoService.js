import axios from "axios";

const VINO_BASE_REST_API_URL = "http://localhost:8080/api/v1/vinos";

class VinoService{
    getAllVinos(){
        return axios.get(VINO_BASE_REST_API_URL);
    }
}

export default new VinoService();
