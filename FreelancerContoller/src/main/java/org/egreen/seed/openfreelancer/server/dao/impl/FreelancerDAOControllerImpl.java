package org.egreen.seed.openfreelancer.server.dao.impl;

import org.egreen.seed.openfreelancer.server.dao.FreelancerDAOController;
import org.egreen.seed.openfreelancer.server.entity.Freelancer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

/**
 * Created by Heshan Jayasinghe on 6/23/15.
 */

@Repository
public class FreelancerDAOControllerImpl extends AbstractDAOController<Freelancer,Long> implements FreelancerDAOController {
    public FreelancerDAOControllerImpl() {
        super(Freelancer.class, Long.class);
    }


    @Override
    public Boolean checklogin(String user, String pass) {
        Session session=getSession();
        String hql = "SELECT f FROM Freelancer f where f.username =:user and f.password =:pass";
        Query query = session.createQuery(hql);
        query.setString("user",user);
        query.setString("pass",pass);
        Object o = query.uniqueResult();
        if (o!=null){
            return true;
        }else{
            return false;
        }

    }
}
