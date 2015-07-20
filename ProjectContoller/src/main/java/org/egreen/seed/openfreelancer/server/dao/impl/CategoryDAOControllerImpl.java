package org.egreen.seed.openfreelancer.server.dao.impl;

import org.egreen.seed.openfreelancer.server.dao.CategoryDAOController;
import org.egreen.seed.openfreelancer.server.entity.Category;
import org.springframework.stereotype.Repository;

/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */

@Repository
public class CategoryDAOControllerImpl extends AbstractDAOController<Category,Long> implements CategoryDAOController {
    public CategoryDAOControllerImpl() {
        super(Category.class, Long.class);
    }



}
