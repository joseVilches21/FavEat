package pe.edu.upc.favEat.model.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "restaurants")
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "administrator_id", columnDefinition = "NUMERIC(4)")
	private Integer administrador;
	
	@Column(name = "categoria_id", columnDefinition = "NUMERIC(2)")
	private Integer categoria;
	
	@Column(name = "name", length = 100, nullable = false)
	private String name;
	
	@Column(name = "location", length = 100, nullable = false)
	private String location;
	
	@Column(name = "capacity", columnDefinition = "NUMERIC(5)")
	private Integer capacity;
	
	@Column(name = "phone", length = 9, nullable = false)
	private String phone;
	
	@Column(name = "protocol", length = 200, nullable = false)
	private String protocol;
	
	@Column(name = "service_start")
	@Temporal(TemporalType.DATE)
	private Date serviceStart;
	
	@Column(name = "service_end")
	@Temporal(TemporalType.DATE)
	private Date serviceEnd;
	
	@Column(name = "qualification", columnDefinition = "NUMERIC(1)")
	private Integer qualification;
	
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name = "restaurant_id")
	private Order order;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Integer administrador) {
		this.administrador = administrador;
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public Date getServiceStart() {
		return serviceStart;
	}

	public void setServiceStart(Date serviceStart) {
		this.serviceStart = serviceStart;
	}

	public Date getServiceEnd() {
		return serviceEnd;
	}

	public void setServiceEnd(Date serviceEnd) {
		this.serviceEnd = serviceEnd;
	}

	public Integer getQualification() {
		return qualification;
	}

	public void setQualification(Integer qualification) {
		this.qualification = qualification;
	}
	
	
	
	
	
	
}
