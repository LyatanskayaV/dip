package com.example.sweater.repos;

import com.example.sweater.domain.ImageC;
import org.springframework.data.repository.CrudRepository;

public interface ImageRepo extends CrudRepository<ImageC, Long> {

    @Override
    Iterable<ImageC> findAll();

    ImageC findByPath(String path);


/*
    Iterable<ImageC> findById(int id);
*/


/*
    Iterable<ImageC> findById(int id_image);
*/

    // Iterable<Committee> deleteByTitle(String title);

}