package com.payilagam.demoapplication.dao;


import org.springframework.data.repository.CrudRepository;

import com.payilagam.demoapplication.model.User;

public interface Userdao extends CrudRepository<User, Integer> {

}
