package com.dzhimmi.src;

class Patient {
    private enum Injury{
        sprain,brokenBone,fracturedBone,concussion,stroke,organFailure,cancer,thrombus
    }
    private enum InjuryPlace{
        general,foot,leg,knee,arm,shoulder,hand,elbow,crotch,bottom,liver,kidney,heart,stomach,intestines,lungs,trachea,mouth,nose,eye,brain
    }
    private enum InjurySide{
        right,left
    }

    private String name;
    private String middleName;
    private String surname;
    private int yearOfBirth;
    private String gender;

    Patient(String name, String middleName, String surname, int yearOfBirth, String gender){
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }

    private int calcAge(){
        return 2017-yearOfBirth;
    }
    private String calcFullName(){
        return name+" "+middleName+" "+surname;
    }

    int getAge(){
        return calcAge();
    }
    String getFullName(){
        return calcFullName();
    }
    String getName() {
        return name;
    }
    String getMiddleName() {
        return middleName;
    }
    String getSurname() {
        return surname;
    }
    String getGender(){
        return gender;
    }

    void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    void setName(String name) {
        this.name = name;
    }
    void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    void setSurname(String surname) {
        this.surname = surname;
    }
    void setGender(String gender) {
        this.gender = gender;
    }
}
