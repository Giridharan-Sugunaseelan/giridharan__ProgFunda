package com.gradedproject.q1;

public class TechDepartment extends SuperDepartment {
    public String getStackInformation() {
        return "Core Java";
    }

    @Override
    public String departmentName() {
        return "Tech Department";
    }

    @Override
    public String getTodaysWork() {
        return "Complete coding of Module 1";
    }
    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }
}
