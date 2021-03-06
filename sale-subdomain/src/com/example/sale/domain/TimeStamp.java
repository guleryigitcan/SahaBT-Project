package com.example.sale.domain;

import java.time.LocalDateTime;
import java.util.Objects;

public class TimeStamp {

	private final LocalDateTime timeStamp;

    public TimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeStamp timeStamp1 = (TimeStamp) o;
        return timeStamp.equals(timeStamp1.timeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeStamp);
    }

    @Override
    public String toString() {
        return "TimeStamp{" +
                "timeStamp=" + timeStamp +
                '}';
    }
}
