package com.example.sweater.repos;

import com.example.sweater.domain.Quest;
import org.springframework.data.repository.CrudRepository;

public interface QuestRepo extends CrudRepository<Quest, Long> {

        @Override
        Iterable<Quest> findAll();
    }
