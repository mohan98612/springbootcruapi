package in.bushansirgur.springbootcrud.springbootcrudapi.model;
 
import java.sql.Date;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "tbl_medicine")
public class Medicine {
	
	@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Integer id;
	//@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private String name;
	@Column
	private Integer cost;
	@Column
	private Integer quantity;
	@Column
	private Date doe;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getcost() {
		return cost;
	}
	public void setcost(Integer cost) {
		this.cost = cost;
	}

	public void setquantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getquantity() {
		return quantity;
	}

	public Date getDoe() {
		return doe;
	}
	public void setDoe(Date doe) {
		this.doe = doe;
	}
	@Override
	public String toString() {
		return "medicine [id=" + id + ", name=" + name + ", cost=" + cost + ", quantity=" + quantity + ", doe"
				+ doe + "]";
	}
	
}