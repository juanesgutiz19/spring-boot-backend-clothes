package com.udea.springboot.backend.clothes.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "products")
public class Product implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Size(min = 10, max = 25, message = "The size should be between ")
	@NotEmpty(message = "Name can't be empty")
	@Column(nullable = false)
	private String name;
	
	@NotEmpty(message = "Description can't be empty")
	@Column(nullable = false)
	private String description;
	
	private Double price;
	
	private Integer percentageDiscount;
	
	private Integer numberOfVisits;
				
	@NotEmpty(message = "Frontal image url can't be empty")
	@Column(nullable = false)
	private String frontalImageUrl;
	
	@NotEmpty(message = "Back image url can't be empty")
	@Column(nullable = false)
	private String backImageUrl;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id", nullable = true)
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Country country;
	
	
	@PrePersist
	public void prePersist() {
		this.createAt = new Date();
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Integer getPercentageDiscount() {
		return percentageDiscount;
	}
	
	public void setPercentageDiscount(Integer percentageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}
	
	public Integer getNumberOfVisits() {
		return numberOfVisits;
	}
	
	public void setNumberOfVisits(Integer numberOfVisits) {
		this.numberOfVisits = numberOfVisits;
	}
	
	public String getFrontalImageUrl() {
		return frontalImageUrl;
	}
	
	public void setFrontalImageUrl(String frontalImageUrl) {
		this.frontalImageUrl = frontalImageUrl;
	}
	
	public String getBackImageUrl() {
		return backImageUrl;
	}
	
	public void setBackImageUrl(String backImageUrl) {
		this.backImageUrl = backImageUrl;
	}
	
	
	public Country getCountry() {
		return country;
	}
	
	public void setCountry(Country country) {
		this.country = country;
	}
	
	private static final long serialVersionUID = 1L;
}
