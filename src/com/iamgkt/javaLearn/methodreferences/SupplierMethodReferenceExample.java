package com.iamgkt.javaLearn.methodreferences;

import com.iamgkt.javaLearn.data.Student;

import java.util.function.Supplier;

public class SupplierMethodReferenceExample {

    Supplier<Student> studentSupplier = Student::new;

    public static void main(String[] args) {

        System.out.println();

    }
}
