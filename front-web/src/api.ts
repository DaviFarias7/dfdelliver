import axios from "axios";
import { OrderPayload } from "./Orders/Types";

const API_URL = 'https://dfdeliver.herokuapp.com'; /*http://localhost:8080*/
const mapboxToken = process.env.REACT_APP_ACCESS_TOKEN_MAP_BOX;

export function fetchProducts() {
    return axios(`${API_URL}/produtos`)
}

export function fetchLocalMapbox(local: string) {
    return axios(`https://api.mapbox.com/geocoding/v5/mapbox.places/${local}.json?access_token=${mapboxToken}`)
}

export function saveOrder(payload: OrderPayload) {
    return axios.post(`${API_URL}/pedidos`, payload);
}