package pe.edu.upc.favEat.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.favEat.model.entity.Order;
import pe.edu.upc.favEat.model.repository.OrderRepository;

@Named
@ApplicationScoped
public class OrderRepositoryImpl implements OrderRepository  {

	@PersistenceContext(unitName = "favEatPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public Optional<Order> findById(Integer id) throws Exception {
		return findById(id, Order.class);
	}

	@Override
	public List<Order> findAll() throws Exception {
		String jpql = "SELECT order FROM Order order";	
		return findByQuery(Order.class, jpql);
	}

	@Override
	public List<Order> findByData(String data) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
