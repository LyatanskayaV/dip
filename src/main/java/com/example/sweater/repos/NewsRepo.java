package com.example.sweater.repos;

import com.example.sweater.domain.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepo extends CrudRepository<News, Long> {
    @Override
    Iterable<News> findAll();
}