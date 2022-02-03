package com.example.domain.infrastructure;

import com.example.domain.application.business.events.CategoryEvent;

public interface EventPublisher {
    void publishEvent(CategoryEvent businessEvent);
}