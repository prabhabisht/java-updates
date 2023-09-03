package com.Java8.methodreferences;

import java.util.function.Supplier;

import com.Java8.data.Student;

public class SupplierMethodReferenceExample {

    Supplier<Student> studentSupplier = Student::new;

    public static void main(String[] args) {

        System.out.println();

    }
}
