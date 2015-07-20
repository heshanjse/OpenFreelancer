package org.egreen.seed.openfreelancer.server.dao.impl;

import org.egreen.seed.openfreelancer.server.dao.AcceptDAOController;
import org.egreen.seed.openfreelancer.server.entity.Accept;
import org.springframework.stereotype.Repository;

/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */

@Repository
public class AcceptDAOControllerImpl extends AbstractDAOController<Accept,Long> implements AcceptDAOController {
    public AcceptDAOControllerImpl() {
        super(Accept.class, Long.class);
    }



}
