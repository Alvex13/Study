package com.infy.world.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="country4")
@NamedQuery(name="Country.fondNo",query="select c from Country c where no>:number")
@NamedQuery(name="Country.delete2",query = "delete from Country where code=?1" )
public class Country {

	
	
	private int no;
	private String code;
	@Id
	private String name;
	private String continent;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}

	
	
}

