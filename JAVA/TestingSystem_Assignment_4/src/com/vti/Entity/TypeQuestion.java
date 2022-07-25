package com.vti.Entity;

public class TypeQuestion {
	private int typeID;
	private TypeName typeName;

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public TypeName getTypeName() {
		return typeName;
	}

	public void setTypeName(TypeName typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "TypeQuestion [typeID=" + typeID + ", typeName=" + typeName + "]";
	}

}
