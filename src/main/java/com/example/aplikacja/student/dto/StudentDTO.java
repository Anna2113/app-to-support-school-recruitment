package com.example.aplikacja.student.dto;

import com.example.aplikacja.student.entity.Exam;
import com.example.aplikacja.student.entity.Klasa;
import com.example.aplikacja.student.enums.*;
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
    private Double pointsMatGeoInf;
    private Double pointsHuman;
    private Double pointsBiolChemAng;
    private Double pointsMatAngNiem;
    private Double pointsMuzyczna;
    private Double pointsAktorska;
    private Double pointsSportowa;
    private NameOfClass classForStudent;
}
