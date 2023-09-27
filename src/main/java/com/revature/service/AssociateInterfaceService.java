package com.revature.service;

import java.util.List;


import com.revature.entity.Associate;


public interface AssociateInterfaceService {

    int addAssociateService(Associate associate);

    List<Associate> showAssociateService();

    int updateAssociateService(Associate associate);

    void deleteAssociateService(Associate de);

}