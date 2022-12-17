package com.infobasic.restapitemplate.model;

public class Company {

    @Override
    public String toString() {
        return "Company [id=" + id + ", name=" + name + ", country=" + country + ", iban=" + iban + ", email=" + email
                + ", employees_n=" + employees_n + ", site=" + site + ", renderCell=" + renderCell + "]";
    }



    private int id;
    private String name; 
    private String country;
    private String iban;
    private String email;
    private int employees_n; 
    private String site;
    private String renderCell;
    
    
    

    public Company(int id, int employees_n, String name, String country, String site, String iban, String email, String renderCell) {
        this.id = id;
        this.employees_n = employees_n;
        this.name = name;
        this.country = country;
        this.site = site;
        this.iban = iban;
        this.email = email;
        this.renderCell = renderCell;
    }

    

    public int getEmployees_n() {
        return employees_n;
    }

    public void setEmployees_n(int employees_n) {
        this.employees_n = employees_n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




    public String getRenderCell() {
        return renderCell;
    }



    public void setRenderCell(String renderCell) {
        this.renderCell = renderCell;
    }
    
}
