package com.example.requistion.application.business;

import com.example.requistion.application.RequistionApplication;
import com.example.requistion.application.business.event.RequistionAdd;
import com.example.requistion.domain.Requistion;
import com.example.requistion.infrastructure.EventPublisher;
import com.example.requistion.repository.RequistionRepository;

public class StandardRequistionApplication implements RequistionApplication {

	
	 private EventPublisher eventPublisher;
	 private RequistionRepository requistionRepository;
	 
	 

	public StandardRequistionApplication(EventPublisher eventPublisher, RequistionRepository requistionRepository) {
		this.eventPublisher = eventPublisher;
		this.requistionRepository = requistionRepository;
	}



	@Override
	public Requistion requistionAdd(Requistion requistionID) {
		 Requistion addReq = requistionRepository.add(requistionID);
	     var businessEvent = new RequistionAdd(addReq);
	     eventPublisher.publishEvent(businessEvent);
	     return addReq;
	}

}
