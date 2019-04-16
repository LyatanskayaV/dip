package com.example.sweater.repos;

import com.example.sweater.domain.FAQ;
import org.springframework.data.repository.CrudRepository;

public interface FaqRepo extends CrudRepository<FAQ, Long> {
    @Override
    Iterable<FAQ> findAll();
}
