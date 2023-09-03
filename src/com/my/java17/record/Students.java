//package com.my.java17.record;
//
//import java.util.List;
//import java.util.Optional;
//
//
//public record Students(String name, int gradeLevel, double gpa, String gender, int notebooks,List<String> activities) { 
//
////    private String name;
////    private int gradeLevel;
////    private double gpa;
////    private String gender;
////    private int noteBooks;
//	
//	
//    private static Optional<Bikes> bike;
//
//    public Optional<Bikes> getBike() {
//        return bike;
//    }
////
//    public void setBike(Optional<Bikes> bike) {
//        this.bike = bike;
//    }
//    
////
////    public Students(){
////
////    }
////
////    public Students(String name, int gradeLevel, double gpa, String gender, int noteBooks, List<String> activities) {
////        this.name = name;
////        this.gradeLevel = gradeLevel;
////        this.gpa = gpa;
////        this.gender = gender;
////        this.noteBooks = noteBooks;
////        this.activities = activities;
////    }
////
////    public int getNoteBooks() {
////
////        return noteBooks;
////    }
////
////    public void setNoteBooks(int noteBooks) {
////        this.noteBooks = noteBooks;
////    }
////
////    public Students(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
////        this.name = name;
////        this.gradeLevel = gradeLevel;
////        this.gpa = gpa;
////        this.gender = gender;
////        this.activities = activities;
////    }
////
////    public Students(String s) {
////        this.name = s;
////    }
////
////    public String getGender() {
////        return gender;
////    }
////
////    public void setGender(String gender) {
////        this.gender = gender;
////    }
////
////    public String getName() {
////        return name;
////    }
////
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    public int getGradeLevel() {
////        return gradeLevel;
////    }
////
////    public void setGradeLevel(int gradeLevel) {
////        this.gradeLevel = gradeLevel;
////    }
////
////    public double getGpa() {
////        return gpa;
////    }
////
////    public void setGpa(double gpa) {
////        this.gpa = gpa;
////    }
////
////    List<String> activities = new ArrayList<>();
////
////    public  List<String> getActivities() {
////        return this.activities;
////    }
////
////    public void setActivities(List<String> activities) {
////        this.activities = activities;
////    }
////
////    public void printListOfActivities(){
////
////        System.out.println("List of Activities are : " + this.activities);
////    }
////
//////    @Override
//////    public String toString() {
//////        return "Student{" +
//////                "name='" + name + '\'' +
//////                ", gradeLevel=" + gradeLevel +
//////                ", gpa=" + gpa +
//////                ", gender='" + gender + '\'' +
//////                ", activities=" + activities +
//////                '}';
//////    }
////
//
//}
