package com.example.ECommerceMicroservice2.Domain;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Entity
@Table (name = "items")

public class Item {
	
    @Override
	public int hashCode() {
		return Objects.hash(id, orders, product, quantity, subTotal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return Objects.equals(id, other.id) && Objects.equals(orders, other.orders)
				&& Objects.equals(product, other.product) && quantity == other.quantity
				&& Objects.equals(subTotal, other.subTotal);
	}

	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @Column (name = "quantity")
    @NotNull
    private int quantity;

    @Column (name = "subtotal")
    @NotNull
    private BigDecimal subTotal;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "product_id")
    private Product product;

    @ManyToMany (mappedBy = "items")
    @JsonIgnore
    private List<Order> orders;
    
    public Item() {
    	
    }

    public Item(@NotNull int quantity, Product product, BigDecimal subTotal) {
        this.quantity = quantity;
        this.product = product;
        this.subTotal = subTotal;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}