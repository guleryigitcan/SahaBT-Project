package com.example.requistion.application.business.events;

import java.util.UUID;

import com.example.requistion.domain.Requistion;

public class RequistionEvent {

	private final String eventId;

	public RequistionEvent(Requistion eventId) {
		this.eventId = String.valueOf(eventId);
	}

	public RequistionEvent() {
		this.eventId = UUID.randomUUID().toString();
	}

	public String getEventId() {
		return eventId;
	}
}
