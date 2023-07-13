package org.example.dto;

public class MyName {

    private String name;
    private String lastName;


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public  String toString(){
        return "MyName {" +
                "name='" + name + '\'' +
                "lastName='" + lastName + '\'' +
                '}';

    }
}
