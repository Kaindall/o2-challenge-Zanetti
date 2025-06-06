package br.com.kaindall.products.domain.gateways;

import br.com.kaindall.products.domain.models.Category;

import java.util.List;

public interface CategoryGateway {
    Category save(Category category);

    Category find(Long id);

    boolean delete(Long categoryId);

    List<Category> findAll();

    Category findByName(String name);
}
