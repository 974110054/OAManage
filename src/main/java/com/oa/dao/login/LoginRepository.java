package com.oa.dao.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oa.pojo.Userinfo;
@Repository
public interface LoginRepository extends JpaRepository<Userinfo, Integer> {

}
