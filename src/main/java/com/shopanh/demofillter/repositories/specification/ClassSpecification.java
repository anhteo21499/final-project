package com.shopanh.demofillter.repositories.specification;

import com.shopanh.demofillter.models.entity.Class;
import com.shopanh.demofillter.models.entity.Faculty;
import com.shopanh.demofillter.models.in.ClassFilterSpecification;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ClassSpecification {
    public static Specification<Class> filters(ClassFilterSpecification classFilterSpecification){
        return Specification.where(withDate(classFilterSpecification.getToDate(),classFilterSpecification.getEndDate())
                );
    }
    public static Specification<Class> withDate(LocalDate toTime, LocalDate endTime){
        return (root, query, criteriaBuilder) ->criteriaBuilder.between(root.get("createDate"), toTime, endTime);
    }
//    public static Specification<Class> withNameFaculty(String name){
//        EntityManager em = null;
//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<Faculty> cq = cb.createQuery(Faculty.class);
//        Root<Faculty> faculty = cq.from(Faculty.class);
//        return (root, query, criteriaBuilder) -> query.multiselect();
//    }

//    public static Specification<Employee> getEmployeesByNameSpec(Sring name) {
//        return new Specification<Employee>() {
//            @Override
//            public Predicate toPredicate(Root<Employee> root,
//                                         CriteriaQuery<?> query,
//                                         CriteriaBuilder criteriaBuilder) {
//                Predicate equalPredicate = criteriaBuilder.equal(root.get(Employee_.name), name);
//                return equalPredicate;
//            }
//        };
//    }
}
