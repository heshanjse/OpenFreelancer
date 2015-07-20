package org.egreen.seed.openfreelancer.server.dao.impl;

import org.egreen.seed.openfreelancer.server.dao.ProjectDAOController;
import org.egreen.seed.openfreelancer.server.entity.Project;
import org.springframework.stereotype.Repository;

/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */

@Repository
public class ProjectDAOControllerImpl extends AbstractDAOController<Project,Long> implements ProjectDAOController {
    public ProjectDAOControllerImpl() {
        super(Project.class, Long.class);
    }



}
