package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Kuznetcov Stanislav");
        student.setGroup("IB243");
        student.setReceiptDate(new Date());

        System.out.println("Student: " +
                "fullName= '" + student.getFullName() + '\'' +
                ", group= '" + student.getGroup() + '\'' +
                ", receiptDate= " + student.getReceiptDate());
    }
}
