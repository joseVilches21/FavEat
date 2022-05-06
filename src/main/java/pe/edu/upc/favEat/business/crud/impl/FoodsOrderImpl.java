package pe.edu.upc.favEat.business.crud.impl;

import javax.inject.Inject;

import pe.edu.upc.favEat.business.crud.FoodsOrderService;
import pe.edu.upc.favEat.model.entity.FoodsOrder;
import pe.edu.upc.favEat.model.repository.FoodsOrderRepository;
import pe.edu.upc.favEat.model.repository.JpaRepository;
public class FoodsOrderImpl implements FoodsOrderService {

	@Inject
	private FoodsOrderRepository foodsOrderRepository;
	
	@Override
	public JpaRepository<FoodsOrder, Integer> getJpaRepository() {
		return this.foodsOrderRepository;
	}

}
