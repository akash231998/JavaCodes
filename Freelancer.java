package day5;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//Bean class/business model
@XmlRootElement
public class Freelancer implements Serializable,Comparable<Freelancer> {

	/**
	 * @param args
	 */
	private String name,skills;
	private Integer pay,requirement;
	
	@Override
	public int compareTo(Freelancer a) {
		// TODO Auto-generated method stub
		return this.requirement.compareTo(a.requirement);
	}
	public Freelancer(){}
	public Freelancer(String alpha,String beta,Integer cosmo,Integer dono)
	{
		name=alpha;
		skills=beta;
		pay=cosmo;
		requirement=dono;
		
	}
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	@XmlAttribute
	public Integer getPay() {
		return pay;
	}
	public void setPay(Integer pay) {
		this.pay = pay;
	}
	@XmlElement
	public Integer getRequirement() {
		return requirement;
	}
	public void setRequirement(Integer requirement) {
		this.requirement = requirement;
	}
	public String toString()
	{
		return name+" "+skills+" "+pay+" "+requirement;
	}
	
}
