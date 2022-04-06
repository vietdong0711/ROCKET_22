package Entity;

public class TypeQuestion {
	public int typeID;
	public TypeName typeName;
	
	public enum TypeName{
		Essay, Multiple_Choice;
	}

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
	
	
}
