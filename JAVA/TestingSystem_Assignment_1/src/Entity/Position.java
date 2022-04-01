package Entity;

public class Position {
	public int positionID;
	public PositionName positionName;
	
	public enum PositionName{
		Dev, Test, Scrum_Master, PM;
	}
}
