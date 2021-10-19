package com.example.demoflywaypostgresh2.service.impl;

import com.example.demoflywaypostgresh2.controller.rest.vm.ProductCriteria;
import com.example.demoflywaypostgresh2.domain.model.Product;
import com.example.demoflywaypostgresh2.domain.repository.ProductRepository;
import com.example.demoflywaypostgresh2.dto.ProductDTO;
import com.example.demoflywaypostgresh2.dto.ProductFullDTO;
import com.example.demoflywaypostgresh2.dto.mapper.ProductMapper;
import com.example.demoflywaypostgresh2.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public ProductDTO updateProduct(ProductDTO product) {
        return null;
    }

    @Override
    public ProductFullDTO getProductById(Long productId) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {
        Product product = this.productRepository.getOne(productDTO.getId());
        product.setPrice(productDTO.getPrice());
        product = this.productRepository.save(product);
        return this.productMapper.toDto(product);
    }

    @Override
    public Product save(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Page<Product> findByCriteria(ProductCriteria productCriteria, Pageable pageable) {
        return null;
    }
}
