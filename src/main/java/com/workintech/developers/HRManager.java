package com.workintech.developers;

import java.sql.Array;

public class HRManager extends Employee {
    JuniorDeveloper[] junArr = new JuniorDeveloper[5];
    MidDeveloper[] midArr = new MidDeveloper[5];
    SeniorDeveloper[] senArr = new SeniorDeveloper[5];

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    public void addEmployee(int index, JuniorDeveloper employee) {
        if (junArr.length <= index || index < 0) {
            System.out.println("Atama yapmak istediğin yer yok! (1)");
            return;
        }
        if (junArr[index] != null) {
            System.out.println("Atama yapmak istediğin yer dolu! (2)");
            return;
        }
        junArr[index] = employee;
    }

    public void addEmployee(int index, MidDeveloper employee) {
        if (midArr.length <= index || index < 0) {
            System.out.println("Atama yapmak istediğin yer yok! (1)");
            return;
        }
        if (midArr[index] != null) {
            System.out.println("Atama yapmak istediğin yer dolu! (2)");
            return;
        }
        midArr[index] = employee;
    }

    public void addEmployee(int index, SeniorDeveloper employee) {
        if (senArr.length <= index || index < 0) {
            System.out.println("Atama yapmak istediğin yer yok! (1)");
            return;
        }
        if (senArr[index] != null) {
            System.out.println("Atama yapmak istediğin yer dolu! (2)");
            return;
        }
        senArr[index] = employee;
    }


    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
    }
}
