package com.vti.Entity;

public class CategoryQuestion {
	private int categoryID;
	private String categoryName;

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "CategoryQuestion [categoryID=" + categoryID + ", categoryName=" + categoryName + "]";
	}

}
