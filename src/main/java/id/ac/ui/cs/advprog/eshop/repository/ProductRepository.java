package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Repository
public class ProductRepository {
    private List<Product> productData = new ArrayList<>();

    public Product create(Product product){
        String productId = String.valueOf(UUID.randomUUID());
        product.setProductId(productId);
        productData.add(product);
        return product;
    }

    public Iterator<Product> findAll(){
        return productData.iterator();
    }

    public Product edit(Product editProduct) {
        for (Product initialProduct : productData) {
            if (initialProduct.getProductId().equals(editProduct.getProductId())) {
                initialProduct.setProductName(editProduct.getProductName());
                initialProduct.setProductQuantity(editProduct.getProductQuantity());
                return initialProduct;
            }
        }
        return null;
    }

    public boolean delete(String productId) {
        Iterator<Product> productIterator = productData.iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getProductId().equals(productId)) {
                productIterator.remove();
                return true;
            }
        }
        return false;
    }

}