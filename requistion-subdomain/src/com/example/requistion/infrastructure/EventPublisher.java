package com.example.requistion.infrastructure;

import com.example.requistion.application.business.events.AddRequistion;
import com.example.requistion.application.business.events.DeleteRequistion;

public interface EventPublisher {

	void publishEvent(AddRequistion businessEvent);
    void publishEvent(DeleteRequistion businessEvent);
}
