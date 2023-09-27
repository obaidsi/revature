package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.AssociateDaoInterface;
import com.revature.entity.Associate;

@Service
public class AssociateService implements AssociateInterfaceService{

    @Autowired(required = true)
    private AssociateDaoInterface associateDaoInterface;
    
    
    @Override
    public int addAssociateService(Associate associate) {
        associateDaoInterface.save(associate);
        return 1;
    }

    @Override
    public List<Associate> showAssociateService() {
        return associateDaoInterface.findAll() ;
    }

    @Override
    public int updateAssociateService(Associate associate) { 
        associateDaoInterface.saveAndFlush(associate);
        return 1;
    }

    @Override
    public void deleteAssociateService(Associate de) {
        associateDaoInterface.delete(de);
    }   
}