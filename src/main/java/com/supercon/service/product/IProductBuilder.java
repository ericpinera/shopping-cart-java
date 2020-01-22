package com.supercon.service.product;

import com.supercon.model.Product;

public interface IProductBuilder {
    IProductBuilder setProductCode(String productCode);
    IProductBuilder setName(String name);
    IProductBuilder setPrice(double price);
    Product build();
}
