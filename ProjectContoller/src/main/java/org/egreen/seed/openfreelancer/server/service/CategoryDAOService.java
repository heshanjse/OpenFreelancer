package org.egreen.seed.openfreelancer.server.service;

import org.egreen.seed.openfreelancer.server.dao.CategoryDAOController;
import org.egreen.seed.openfreelancer.server.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class CategoryDAOService {

@Autowired
private CategoryDAOController categoryDAOController;




public Long save(Category category) {
long Category_id = new Date().getTime();
    category.setIdcategory(Category_id);


Long aLong = categoryDAOController.create(category);
return aLong;
}


public List<Category> getAll() {
return categoryDAOController.getAll();
}

public Long edit(Category category) {

return  categoryDAOController.update(category);
}

public int deleteCategoryById(Long CategoryId) {
return 0;
}

public Category getCategoryById(Long CategoryId) {
return  categoryDAOController.read(CategoryId);
}
}