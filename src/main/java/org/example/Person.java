package org.example;

public class Person {

    //instance variables
    public String firstName;
    public String lastName;
    public int age;
    public String gender;
    public String birthdate;
    public String nationality;

    //constructors
    public Person(String firstName ,String lastName ,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public Person(String gender ,String birthdate ,String nationality){
        this("John","Doe",25);
        gender=this.gender;
        birthdate=this.birthdate;
        nationality=this.nationality;
    }

    //Methods
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        return this.age>=13 && this.age<=19;
    }

}
