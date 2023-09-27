package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entity.Associate;
import com.revature.service.AssociateInterfaceService;

@RestController
public class AssociateController {

    @Autowired
    AssociateInterfaceService associateinterfaceservice;

    @PostMapping("/AddAssociate")
    public String addAssociate(@RequestBody Associate associate) {

        int i = associateinterfaceservice.addAssociateService(associate);
        if (i > 0) {
            return " Associate Added Successfully";
        } else {
            return "could not Add Associate";
        }
    }

    @GetMapping("/ShowAssociate")
    public List<Associate> showAssociate() {
        List<Associate> ll = associateinterfaceservice.showAssociateService();
        return ll;
    }

    @PutMapping("UpdateAssociate/{a_id}")
    public String updateAssociate(@PathVariable("a_id") int userid, @RequestBody Associate associate) {
        associate.setAid(userid);
        int i = associateinterfaceservice.updateAssociateService(associate);
        return "Updated Associate Details";
    }

    @DeleteMapping("deleteStudent/{a_id}")
    public String deleteStudent(@PathVariable("a_id") int userid) {
        Associate de = new Associate();
        de.setAid(userid);
        associateinterfaceservice.deleteAssociateService(de);
        return "Associate deleted";
    }
}