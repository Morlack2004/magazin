//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.springmodels.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(
        name = "Product"
)
public class Product {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "ID_Product"
    )
    private Long id;
    @Column(
            name = "Name"
    )
    private String name;
    @Column(
            name = "Articul",
            unique = true
    )
    private String articul;
    @Column(
            name = "Avaibale_Quantity"
    )
    private int availableQuantity;
    @Column(
            name = "Price"
    )
    private double price;
    @Column(
            name = "Description"
    )
    private String description;
    @Column(
            name = "Colors"
    )
    private String colors;
    @Column(
            name = "Country"
    )
    private String country;
    @Column(
            name = "Models"
    )
    private String models;
    @Column(
            name = "Marka"
    )
    private String marka;
    @Column(
            name = "Weight"
    )
    private String weight;
    @ManyToOne
    @JoinColumn(
            name = "ID_Categories"
    )
    private Categories category;
    @OneToMany(
            mappedBy = "product",
            cascade = {CascadeType.ALL}
    )
    private List<Photo> photos;
    @OneToMany(
            mappedBy = "order",
            cascade = {CascadeType.ALL}
    )
    private List<ShoppingCart> cartItems;
    @OneToMany(
            mappedBy = "product",
            cascade = {CascadeType.ALL}
    )
    private List<Review> reviews;

    public Product() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticul() {
        return this.articul;
    }

    public void setArticul(String articul) {
        this.articul = articul;
    }

    public int getAvailableQuantity() {
        return this.availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Categories getCategory() {
        return this.category;
    }

    public void setCategory(Categories category) {
        this.category = category;
    }

    public List<Photo> getPhotos() {
        return this.photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColors() {
        return this.colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getModels() {
        return this.models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getMarka() {
        return this.marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getWeight() {
        return this.weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public List<Review> getReviews() {
        return this.reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
