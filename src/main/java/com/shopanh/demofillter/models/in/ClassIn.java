package com.shopanh.demofillter.models.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassIn {
    private long id;
    private String name;
    private LocalDate createDate;
    private long faculty_id;
}
