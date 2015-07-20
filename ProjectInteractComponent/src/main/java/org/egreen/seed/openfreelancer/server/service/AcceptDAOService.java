package org.egreen.seed.openfreelancer.server.service;

import org.egreen.seed.openfreelancer.server.dao.AcceptDAOController;
import org.egreen.seed.openfreelancer.server.entity.Accept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class AcceptDAOService {

@Autowired
private AcceptDAOController acceptDAOController;




public Long save(Accept accept) {
long Accept_id = new Date().getTime();
 accept.setIdAccept(Accept_id);


 Long aLong = acceptDAOController.create(accept);
return aLong;
}


public List<Accept> getAll() {
return acceptDAOController.getAll();
}

public Long edit(Accept accept) {

return  acceptDAOController.update(accept);
}

public int deleteAcceptById(Long AcceptId) {
return 0;
}

public Accept getAcceptById(Long AcceptId) {
return  acceptDAOController.read(AcceptId);
}
}