package com.example.requistion.application.business.events;

import com.example.requistion.domain.Requistion;

public class DeleteRequistion extends RequistionEvent{

	private final Requistion requistion;

    public DeleteRequistion(Requistion requistion) {
        this.requistion = requistion;
    }

    public Requistion getRequistion() {
        return requistion;
    }
}
