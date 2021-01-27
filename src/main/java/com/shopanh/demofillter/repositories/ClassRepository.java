package com.shopanh.demofillter.repositories;


import com.shopanh.demofillter.models.entity.Class;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ClassRepository extends JpaRepository<Class, Long>, JpaSpecificationExecutor<Class> {
    @Query(value = "select c from Class c inner join Faculty f on c.faculty_id = f.id where f.id = ?1  ")
    List<Class> filterClass(long id);
}
