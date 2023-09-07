package com.dev.OnlineStampComminSoon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.OnlineStampComminSoon.model.EventParticipant;

@Repository
public interface EventParticipantRepository extends JpaRepository<EventParticipant, Long>{

}
