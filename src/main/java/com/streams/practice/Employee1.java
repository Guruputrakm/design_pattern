package com.streams.practice;

import java.util.List;

class Employee1 {
    String name;
    List<String> skills;

    Employee1(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public String getName() { return name; }
    public List<String> getSkills() { return skills; }
}