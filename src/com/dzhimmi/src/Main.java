package com.dzhimmi.src;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Clara", "Prue", "Cunningham", 1998, "Female");
        System.out.println(Patient.Injury.CONCUSSION.getInjuryName());
        System.out.println(Patient.InjuryPlace.HEAD.getInjuryPlace());
        System.out.println(Patient.InjurySide.NONE.getInjurySide());
    }
}
