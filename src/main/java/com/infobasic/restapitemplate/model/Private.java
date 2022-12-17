package com.infobasic.restapitemplate.model;

public class Private {

    private int id;
    private String name; 
    private String surname;
    private int age; 
    private String tel;
    private String email;
    private String iban;
    private String country;

    
    public Private(int id, String name, String surname, int age, String tel, String email, String iban,
            String country) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.tel = tel;
        this.email = email;
        this.iban = iban;
        this.country = country;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    @Override
    public String toString() {
        return "Private [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", tel=" + tel
                + ", email=" + email + ", iban=" + iban + ", country=" + country + "]";
    }


    
}
