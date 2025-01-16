package com.example.products.entities;

public class Products {
    private Long idProducts;
    private String nameProducts;
    private Double priceProducts;
    private Department department;

    public Products(){

    }
    public Products(Long idProducts, String nameProducts, Double priceProducts, Department department){
        this.idProducts = idProducts;
        this.nameProducts = nameProducts;
        this.priceProducts = priceProducts;
        this.department = department;

    }
    public Long getIdProducts() {
        return idProducts;
    }

    public void setIdProducts(Long idProducts) {
        this.idProducts = idProducts;
    }

    public String getNameProducts() {
        return nameProducts;
    }

    public void setNameProducts(String nameProducts) {
        this.nameProducts = nameProducts;
    }

    public Double getPriceProducts() {
        return priceProducts;
    }

    public void setPriceProducts(Double priceProducts) {
        this.priceProducts = priceProducts;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
