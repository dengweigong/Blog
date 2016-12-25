package com.blog.entity;

import java.util.Set;

public class Manager {
	private Integer id;
	private String account;
	private String password;
	private Integer role;
	private String notice;
	private Set<Album> albums;
	private Set<Article> articles;
	public Set<Article> getArticles() {
		return articles;
	}
	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}
	public Set<Album> getAlbums() {
		return albums;
	}
	public void setAlbums(Set<Album> albums) {
		this.albums = albums;
	}
	public Manager() {
		super();
	}
	public Manager(String account, String password, Integer role, String notice) {
		super();
		this.account = account;
		this.password = password;
		this.role = role;
		this.notice = notice;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	
}
