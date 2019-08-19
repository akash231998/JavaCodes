package day5;

import java.io.Serializable;

//import javax.xml.bind.annotation.XmlRootElement;


public class Company implements Serializable,Comparable<Company> {

	/**
	 * @param args
	 */
	private String name;
	private Integer id,quantity,cost;
	@Override
	public int compareTo(Company a) {
		// TODO Auto-generated method stub
		return this.cost.compareTo(a.cost);
	}
	public Company(){}
	public Company(String alpha,Integer beta,Integer cosmo,Integer dono)
	{
		name=alpha;
		id=beta;
		quantity=cosmo;
		cost=dono;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public String toString()
	{
		return name+" "+id+" "+quantity+" "+cost;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
