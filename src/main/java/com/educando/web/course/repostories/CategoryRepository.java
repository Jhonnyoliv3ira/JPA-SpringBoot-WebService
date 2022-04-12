package com.educando.web.course.repostories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educando.web.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
