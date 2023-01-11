package com.example.aplikacja.student.dto;

import com.example.aplikacja.student.entity.Exam;
import com.example.aplikacja.student.entity.Klasa;
import com.example.aplikacja.student.enums.Align;
import com.example.aplikacja.student.enums.LanguagePolish;
import com.example.aplikacja.student.enums.Sex;
import com.example.aplikacja.student.enums.Skills;
import lombok.Data;

import java.util.List;

@Data
public class StudentDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private Sex sex;
    private Align align;
    private LanguagePolish languagePolish;
    private Double points;
}