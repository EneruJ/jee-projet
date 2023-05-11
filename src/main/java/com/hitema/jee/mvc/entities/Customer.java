package com.hitema.jee.mvc.entities;
import jakarta.persistence.*;


@Entity
    @Table(name="customer")
public class Customer {
    @Id
        @Column(name="customer_id")
            @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
        @JoinColumn(name = "address_id")
    private Address address;

    public Long getId() {
        return id;
    }
    private Boolean active;
    private String last_name;
    private String first_name;
    private String email;

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public Address getAddress() {
        return address;
    }

    public Customer setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", active=" + active +
                ", last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }
}
