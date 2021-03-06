package com.app.km.entity;

import javax.persistence.*;

/**
 * Created by Kamil-PC on 17.05.2017.
 */
@Entity
@Table(name = "car", schema = "mydb", catalog = "")
public class CarEntity {
    private int idcar;
    private String brand;
    private String model;
    private boolean available;

    @Id
    @Column(name = "idcar")
    public int getIdcar() {
        return idcar;
    }

    public void setIdcar(int idcar) {
        this.idcar = idcar;
    }

    @Basic
    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Basic
    @Column(name = "model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "available")
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CarEntity carEntity = (CarEntity) o;

        if (idcar != carEntity.idcar) return false;
        if (available != carEntity.available) return false;
        if (brand != null ? !brand.equals(carEntity.brand) : carEntity.brand != null) return false;
        return model != null ? model.equals(carEntity.model) : carEntity.model == null;
    }

    @Override
    public int hashCode() {
        int result = idcar;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (available ? 1 : 0);
        return result;
    }
}
