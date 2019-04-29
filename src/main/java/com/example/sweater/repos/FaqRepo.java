package com.example.sweater.repos;

import com.example.sweater.domain.FAQ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface FaqRepo extends JpaRepository<FAQ, Long> {
    @Override
    List<FAQ> findAll();

    @Modifying
    @Transactional
    @Query("delete from FAQ where id_faq = " + "'id_faq'")
    void delete(@Param("id_faq") Long id_faq);




}
