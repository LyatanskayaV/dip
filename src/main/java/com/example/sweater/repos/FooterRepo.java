package com.example.sweater.repos;

import com.example.sweater.domain.Footer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface FooterRepo extends CrudRepository<Footer, Long> {

    @Override
    Iterable<Footer> findAll();

    Iterable<Footer> findById(int id);

  /*  @Query("SELECT id, title_footer, img\n" +
                "FROM Footer ")
    Collection<Footer> findAll1();
*/
   // Iterable<Committee> deleteByTitle(String title);

}