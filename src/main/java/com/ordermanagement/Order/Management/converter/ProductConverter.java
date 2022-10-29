package com.ordermanagement.Order.Management.converter;

import com.ordermanagement.Order.Management.dto.ProductDto;
import com.ordermanagement.Order.Management.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter implements Converter<Product, ProductDto> {

    @Override
    public ProductDto fromEntityToDto(Product entity) {
        return new ProductDto(entity.getId(),
                entity.getName(),
                entity.getSkuCode(),
                entity.getUnitPrice());
    }

    @Override
    public Product fromDtoToEntity(ProductDto dto) {
        return new Product(dto.id(),
                dto.name(),
                dto.skuCode(),
                dto.unitPrice());
    }
}

