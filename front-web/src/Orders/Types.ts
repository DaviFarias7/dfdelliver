export type Product = {
    id: number;
    nome: string;
    preco: number;
    descricao: string
    imageUri: string;
}

export type OrderLocariondata = {
    latitude: number;
    longitude: number;
    address: string;
}