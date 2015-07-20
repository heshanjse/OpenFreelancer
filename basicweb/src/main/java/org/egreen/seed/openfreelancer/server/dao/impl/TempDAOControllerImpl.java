package org.egreen.seed.openfreelancer.server.dao.impl;

import org.egreen.seed.openfreelancer.server.dao.TempDataDAOController;
import org.egreen.seed.openfreelancer.server.entity.Tempdata;
import org.springframework.stereotype.Repository;

/**
 * Created by dewmal on 7/31/14.
 */
@Repository
public class TempDAOControllerImpl extends AbstractDAOController<Tempdata, String> implements TempDataDAOController {

    public TempDAOControllerImpl() {
        super(Tempdata.class, String.class);
    }
}
