package com.demo.models;
// Generated Jan 20, 2022, 7:37:22 PM by Hibernate Tools 5.1.10.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Category generated by hbm2java
 */
@Entity
@Table(name = "category", catalog = "dbproject4")
public class Category implements java.io.Serializable {

	private Integer categoryId;
	private String title;
	private String description;
	private boolean status;
	private Set<Quiz> quizs = new HashSet<Quiz>(0);

	public Category() {
	}

	public Category(String title, String description, boolean status) {
		this.title = title;
		this.description = description;
		this.status = status;
	}

	public Category(String title, String description, boolean status, Set<Quiz> quizs) {
		this.title = title;
		this.description = description;
		this.status = status;
		this.quizs = quizs;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "category_id", unique = true, nullable = false)
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "title", nullable = false, length = 250)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "description", nullable = false, length = 250)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "status", nullable = false)
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
	public Set<Quiz> getQuizs() {
		return this.quizs;
	}

	public void setQuizs(Set<Quiz> quizs) {
		this.quizs = quizs;
	}

}