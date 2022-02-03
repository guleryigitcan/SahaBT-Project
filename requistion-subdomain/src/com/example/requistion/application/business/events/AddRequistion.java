package com.example.requistion.application.business.events;

import com.example.requistion.domain.Requistion;

public class AddRequistion {

	private final Requistion requistion;

    public AddRequistion(Requistion requistion) {
        this.requistion = requistion;
    }

    public Requistion getRequistion() {
        return requistion;
    }
}
