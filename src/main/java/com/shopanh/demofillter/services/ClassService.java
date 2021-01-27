package com.shopanh.demofillter.services;

import com.shopanh.demofillter.models.entity.Class;
import com.shopanh.demofillter.models.in.ClassFilterSpecification;

import java.util.List;

public interface ClassService {
    List<Class> filterClass(ClassFilterSpecification classFilterSpecification);

}
