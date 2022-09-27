import { formatPrice } from "./helpers";
import { Product } from "./Types";

type Props = {
    product: Product;
    onSelectProduct: (product: Product) => void;
    isSelected: boolean;
}

function ProductCard({ product, onSelectProduct, isSelected }: Props) {
    return (
        <div
            className={`order-card-container ${isSelected ? 'selected' : ''}`}
            onClick={() => onSelectProduct(product)}
        >
            <h3 className="order-card-title">
                {product.nome}
            </h3>
            <img src={product.imageUri} className='order-card-image' alt={product.nome} />
            <h3 className='order-card-price'>{formatPrice(product.preco)}</h3>
            <div className="order-card-description">
                <h3>Descrição</h3>
                {product.descricao}
            </div>
        </div>
    )
}

export default ProductCard;