package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.entity.Associate;
@Repository
public interface AssociateDaoInterface extends JpaRepository<Associate, Integer>{

}