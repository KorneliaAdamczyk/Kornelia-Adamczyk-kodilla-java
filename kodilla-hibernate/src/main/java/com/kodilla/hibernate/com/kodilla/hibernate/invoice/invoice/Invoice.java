package com.kodilla.hibernate.com.kodilla.hibernate.invoice.invoice;

import com.kodilla.hibernate.com.kodilla.hibernate.invoice.item.Item;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="INVOICE")
public final class Invoice {

    private int id;
    private String number;
    private List<Item> item;

    public Invoice(){
    }

    public Invoice(String number) {
        this.number = number;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name="NUMBER")
    public String getNumber() {
        return number;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItem() {
        return item;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNumber(String number) {
        this.number = number;
    }

    private void setItem(List<Item> item) {
        this.item = item;
    }
}
