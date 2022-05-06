package pe.edu.upc.favEat.model.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "foods_orders")
public class FoodsOrder {
	
	@Id
	@Column(name="food_order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id")
	private Order order;
	/*
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "food_id")
	private Food food;*/
	
	@Column(name = "customer_id", columnDefinition = "NUMERIC(4)") 
	private Integer customer;
	
	@Column(name = "restaurant_id", columnDefinition = "NUMERIC(4)")
	private Integer restaurant;
	
	@Column(name = "food_id", columnDefinition = "NUMERIC(4)")
	private Integer food;
	
	@Column(name = "quantity_food", columnDefinition = "NUMERIC(4)")
	private Integer quantityFood;
	
	@Column(name = "cost_total", columnDefinition = "DECIMAL(8,2)")
	private Float  costTotal;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
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

	public Integer getFood() {
		return food;
	}

	public void setFood(Integer food) {
		this.food = food;
	}

	public Integer getQuantityFood() {
		return quantityFood;
	}

	public void setQuantityFood(Integer quantityFood) {
		this.quantityFood = quantityFood;
	}

	public Float getCostTotal() {
		return costTotal;
	}

	public void setCostTotal(Float costTotal) {
		this.costTotal = costTotal;
	}
	
	
	
}
