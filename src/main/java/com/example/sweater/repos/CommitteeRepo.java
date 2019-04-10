package com.example.sweater.repos;

import com.example.sweater.domain.Committee;
import org.springframework.data.repository.CrudRepository;


public interface CommitteeRepo extends CrudRepository<Committee, Long> {

    @Override
    Iterable<Committee> findAll();

    Iterable<Committee> findById(int id);

    Iterable<Committee> deleteByTitle(String title);

}
