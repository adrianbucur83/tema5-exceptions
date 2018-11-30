package exceptions;

import java.time.LocalDate;


class Student {


    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String gender;
    private int cnp;

    Student(String name, String surname, LocalDate dateOfBirth, String gender, int cnp) {


        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;


        if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Gender must be M (male) or F (female).");
        }

        this.cnp = cnp;
    }

    boolean validateNames() {

        return name.length() >= 1 && surname.length() >= 1;
    }

    boolean validateBirthDate() {

        return (dateOfBirth.isAfter(LocalDate.parse("1900-01-01")) || (dateOfBirth.isBefore(LocalDate.parse("2018-01-01"))));
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", cnp=" + cnp +
                '}';
    }
/*

    The following validations are expected:
            - date of birth between 1900 and current year - 18
            - first name and last name should not be empty
- gender should be male or female (or M and F), upper/lower case should both be accepted

*/

}
