package com.example.requistion.application.business;

import com.example.requistion.application.RequistionApplication;
import com.example.requistion.application.business.events.AddRequistion;
import com.example.requistion.application.business.events.DeleteRequistion;
import com.example.requistion.domain.Requistion;
import com.example.requistion.infrastructure.EventPublisher;
import com.example.requistion.repository.RequistionRepository;

public class StandardRequistionApplication implements RequistionApplication{

	private EventPublisher eventPublisher;
    private RequistionRepository requistionRepository;

    public StandardRequistionApplication(EventPublisher eventPublisher, RequistionRepository requistionRepository) {
        this.eventPublisher = eventPublisher;
        this.requistionRepository = requistionRepository;
    }
   
    @Override
    public Requistion requistionAdd(Requistion requistionID) {
        Requistion addReq = requistionRepository.add(requistionID);
        var businessEvent = new AddRequistion(addReq);
        eventPublisher.publishEvent(businessEvent);
        return addReq;
    }

    @Override
    public Requistion requistionDelete(Requistion requistionID) {
        eventPublisher.publishEvent(new DeleteRequistion(requistionID));
        return requistionID;
    }
}
