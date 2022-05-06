package pe.edu.upc.favEat.model.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	/*
	@OneToOne(mappedBy = "order")
	private Customer customer;
	
	@OneToOne(mappedBy = "order")
	private Restaurant restaurant;
	*/
	
	@Column(name = "customer_id", columnDefinition = "NUMERIC(4)")
	private Integer customer;
	
	@Column(name = "restaurant_id", columnDefinition = "NUMERIC(4)")
	private Integer restaurant;
	
	@Column(name="delivery_order")
	private Boolean delivery;
	
	@OneToMany(mappedBy = "order", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<FoodsOrder> foddsOrder;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCustomer() {
		return customer;
	}

	public void setCustomer(Integer customer) {
		this.customer = customer;
	}

	public Integer getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Integer restaurant) {
		this.restaurant = restaurant;
	}

	public Boolean getDelivery() {
		return delivery;
	}

	public void setDelivery(Boolean delivery) {
		this.delivery = delivery;
	}

	public List<FoodsOrder> getFoddsOrder() {
		return foddsOrder;
	}

	public void setFoddsOrder(List<FoodsOrder> foddsOrder) {
		this.foddsOrder = foddsOrder;
	}
	
}
