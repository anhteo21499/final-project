package com.shopanh.demofillter.services.impl;

import com.shopanh.demofillter.models.entity.Class;
import com.shopanh.demofillter.models.in.ClassFilterSpecification;
import com.shopanh.demofillter.repositories.ClassRepository;
import com.shopanh.demofillter.repositories.specification.ClassSpecification;
import com.shopanh.demofillter.services.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassRepository classRepository;
    @Override
    public List<Class> filterClass(ClassFilterSpecification classFilterSpecification) {
        Specification<Class> specification = ClassSpecification.filters(classFilterSpecification);
        List<Class> list = classRepository.findAll(specification);
        return list;
    }
}
