package com.example.requistion.application.business.event;

import com.example.requistion.domain.Requistion;

public class RequistionAdd {

    private final Requistion requistion;

    public RequistionAdd(Requistion requistion) {
        this.requistion = requistion;
    }

    public Requistion getRequistion() {
        return requistion;
    }

}
