package com.djamware.springangularauth.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.djamware.springangularauth.facade.Facade;

public abstract class BaseController {

	@Autowired
	private Facade facade;

	public Facade getFacade() {
		return facade;
	}

	public void setFacade(Facade facade) {
		this.facade = facade;
	}

}
