package com.shopanh.demofillter.models.in;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassFilterSpecification {
    private LocalDate toDate;
    private LocalDate endDate;
    private String nameFaculty;
}
