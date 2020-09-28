package com.del.DAO;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.del.command.Contact;

public interface ContactDAOImpl extends JpaRepository<ContactDetailsEntity,Serializable>  {

	}
