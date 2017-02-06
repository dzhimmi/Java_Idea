package com.dzhimmi.src;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Clara", "Prue", "Cunningham", 1998, "Female");
        System.out.println(patient1.getAge());
        System.out.println(patient1.getName());
        System.out.println(patient1.getMiddleName());
        System.out.println(patient1.getSurname());
        System.out.println(patient1.getFullName());
        System.out.println(patient1.getGender());
    }
}
