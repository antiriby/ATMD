package com.example.amtvregistrationdemo;

import java.util.ArrayList;

public class Household {
    private User adminUser;
    private ArrayList<User> members;
    private ArrayList<Task> tasks;
    private String householdName,familyPassword;

    private Household() {}

    public Household(String  householdName, String familyPassword, User adminUser) {
        this.householdName = householdName;
        this.familyPassword = familyPassword;
        this.adminUser = adminUser;

        members = new ArrayList<User>();
        tasks = new ArrayList<Task>();
        members.add(adminUser);
    }

    public ArrayList<User> getMembers() {
        return members;
    }

    public String getHouseholdName() {
        return householdName;
    }

    public String getFamilyPassword() {
        return familyPassword;
    }


}
