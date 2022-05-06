package pe.edu.upc.favEat.model.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.favEat.model.entity.FoodsOrder;
import pe.edu.upc.favEat.model.repository.FoodsOrderRepository;

@Named
@ApplicationScoped
public class FoodsOrderRepositoryImpl implements FoodsOrderRepository{

	@PersistenceContext(unitName = "favEatPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public Optional<FoodsOrder> findById(Integer id) throws Exception {
		return findById(id, FoodsOrder.class);
	}

	@Override
	public List<FoodsOrder> findAll() throws Exception {
		String jpql = "SELECT foodsOrder FROM FoodsOrder foodsOrder";	
		return findByQuery(FoodsOrder.class, jpql);
	}

	@Override
	public List<FoodsOrder> findByData(String data) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
