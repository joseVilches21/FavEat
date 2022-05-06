/*package pe.edu.upc.favEat.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.favEat.business.crud.CrudService;
import pe.edu.upc.favEat.business.crud.FoodsOrderService;
import pe.edu.upc.favEat.model.entity.FoodsOrder;

@Named("foodsorderView")
@ViewScoped
public class FoodsOrderView implements Serializable, EntityView<FoodsOrder, Integer>{

	private static final long serialVersionUID = 1L;

	private List<FoodsOrder> entities;
	private FoodsOrder entitySelected;
	private List<FoodsOrder> entitiesSelected;
	private FoodsOrder entitySearch;
	
	@Inject
	private FoodsOrderService entityService;
	
	@PostConstruct
	public void init() {
		this.entitiesSelected = new ArrayList<>();
		this.entitySearch = new FoodsOrder();
		getAllEntities();
	}
	
	@Override
	public CrudService<FoodsOrder, Integer> getCrudService() {
		return this.entityService;
	}

	@Override
	public void createNew() {
		this.entitySelected = new FoodsOrder();		
	}

	@Override
	public Integer getIdFromEntitySelected() {
		return this.entitySelected.getId();
	}

	/*
	@Override
	public void searchEntity() {
		try {	// Modificar de acuerdo al atributo a buscar
			this.entities = this.entityService.search(this.entitySearch.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<FoodsOrder> getEntities() {
		return entities;
	}

	public void setEntities(List<FoodsOrder> entities) {
		this.entities = entities;
	}

	public FoodsOrder getEntitySelected() {
		return entitySelected;
	}

	public void setEntitySelected(FoodsOrder entitySelected) {
		this.entitySelected = entitySelected;
	}

	public List<FoodsOrder> getEntitiesSelected() {
		return entitiesSelected;
	}

	public void setEntitiesSelected(List<FoodsOrder> entitiesSelected) {
		this.entitiesSelected = entitiesSelected;
	}

	public FoodsOrder getEntitySearch() {
		return entitySearch;
	}

	public void setEntitySearch(FoodsOrder entitySearch) {
		this.entitySearch = entitySearch;
	}

	public FoodsOrderService getEntityService() {
		return entityService;
	}

	public void setEntityService(FoodsOrderService entityService) {
		this.entityService = entityService;
	}

	@Override
	public void searchEntity() {
		// TODO Auto-generated method stub
		
	}

	
	

	

	

	

	
}*/

