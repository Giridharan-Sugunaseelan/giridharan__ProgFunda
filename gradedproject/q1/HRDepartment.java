package com.gradedproject.q1;

public class HRDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "HR Department";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    @Override
    public String getTodaysWork() {
        return "Fill today’s timesheet and mark your attendance";
    }

    public String doActivity() {
        return "Team Lunch";
    }
}