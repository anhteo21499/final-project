package com.shopanh.demofillter.controllers;

import com.shopanh.demofillter.models.entity.Class;
import com.shopanh.demofillter.models.in.ClassFilterSpecification;
import com.shopanh.demofillter.services.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping("/classes/filter")
    public ResponseEntity<?> filterClass(@RequestParam(value = "toTime",required = false) LocalDate toTime,@RequestParam(value = "endTime" , required = false) LocalDate endTime ){
        List<Class> list = classService.filterClass(new ClassFilterSpecification(LocalDate.of(2017, 2, 15),LocalDate.of(2017, 3, 15),"anhteo"));
        return ResponseEntity.ok(list);
    }
}
