package com.codegym;

public class DemoEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(05,"Thầy Tuyên","Phòng đào tạo học sinh đi thi môn Hóa cấp quốc tế");
//        employee.setId(05);
//        employee.setName("Thầy Tuyên");
//        employee.setRoom("0520");
        System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getDepartment());
    }
}
