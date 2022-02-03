package com.example.requistion.repository;

import com.example.requistion.domain.Requistion;

public interface RequistionRepository {

	Requistion add(Requistion requistionID);

    Requistion delete(Requistion requistionID);
}
