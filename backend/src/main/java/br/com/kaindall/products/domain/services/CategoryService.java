package br.com.kaindall.products.domain.services;

import br.com.kaindall.products.domain.gateways.CategoryGateway;
import br.com.kaindall.products.domain.models.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryGateway categoryGateway;

    public CategoryService(CategoryGateway categoryGateway) {
        this.categoryGateway = categoryGateway;
    }

    public Category create(Category category) {
        return categoryGateway.save(category);
    }

    public Category update(Category category) {
        return categoryGateway.save(category);
    }

    public List<Category> retrieveAll() {
        return categoryGateway.findAll();
    }

    public Category retrieve(Long categoryId) {
        return categoryGateway.find(categoryId);
    }

    public Category retrieveByName(String name) {return categoryGateway.findByName(name);}

    public boolean remove(Long categoryId) {
        return categoryGateway.delete(categoryId);
    }
}
