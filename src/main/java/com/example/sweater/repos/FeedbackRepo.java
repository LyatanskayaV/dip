package com.example.sweater.repos;

import com.example.sweater.domain.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepo extends CrudRepository<Feedback, Long> {
    @Override
    Iterable<Feedback> findAll();
}
