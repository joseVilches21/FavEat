package pe.edu.upc.favEat.business.crud.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.favEat.business.crud.OrderService;
import pe.edu.upc.favEat.model.entity.Order;
import pe.edu.upc.favEat.model.repository.JpaRepository;
import pe.edu.upc.favEat.model.repository.OrderRepository;

@Named
@ApplicationScoped
public class OrderServiceImpl implements OrderService {

	@Inject
	private OrderRepository orderRepository;
	
	@Override
	public JpaRepository<Order, Integer> getJpaRepository() {
		return this.orderRepository;
	}

}
