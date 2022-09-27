export type Product = {
    id: number;
    nome: string;
    preco: number;
    descricao: string
    imageUri: string;
}

export type OrderLocationData = {
    latitude: number;
    longitude: number;
    address: string;
}

type ProductId = {
    id: number;
}

export type OrderPayload = {
    products: ProductId[];
} & OrderLocationData;


