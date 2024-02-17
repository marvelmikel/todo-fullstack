import axios from "axios";

const REST_API_BASE_URL = 'http://localhost:8080/api/todos';

// export function getAllTodos(){
//     return axios.get(REST_API_BASE_URL);
// }

export const getAllTodos = () => axios.get(REST_API_BASE_URL);