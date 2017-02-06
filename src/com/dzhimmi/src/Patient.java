package com.dzhimmi.src;

class Patient {
    enum Injury{
        SPRAIN("Sprain"),BROKENBONE("Broken Bone"),FRACTUREDBONE("Fractured Bone"),CONCUSSION("Concussion"),STROKE("Stroke"),ORGANFAILURE("Organ Failure"),CANCER("Cancer"),THROMBUS("Thrombus");
        private String injuryName;
        Injury(String injuryName){
            this.injuryName = injuryName;
        }
        String getInjuryName(){
            return injuryName;
        }
        String HurDur(){
            return SPRAIN.getInjuryName();
        }
    }
    private enum InjuryPlace{
        GENERAL,FOOT,LEG,KNEE,ARM,SHOULDER,HAND,ELBOW,CROTCH,BOTTOM,LIVER,KIDNEY,HEART,STOMACH,INTESTINES,LUNGS,TRACHEA,MOUTH,NOSE,EYE,BRAIN
    }
    private enum InjurySide{
        RIGHT,LEFT
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
