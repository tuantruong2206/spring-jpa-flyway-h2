package com.example.demoflywaypostgresh2.service;

import com.example.demoflywaypostgresh2.controller.rest.vm.ProductCriteria;
import com.example.demoflywaypostgresh2.domain.model.Product;
import com.example.demoflywaypostgresh2.dto.ProductDTO;
import com.example.demoflywaypostgresh2.dto.ProductFullDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {

    ProductDTO updateProduct(ProductDTO product);

    ProductFullDTO getProductById(Long productId);

    void deleteProduct(Long id);

    ProductDTO save(ProductDTO productDTO);

    Product save(Product product);

    Page<Product> findByCriteria(ProductCriteria productCriteria, Pageable pageable);

//    public void doProductOrder(BasketDTO basketDTO);
}
