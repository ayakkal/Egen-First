package Carpet;

public class RoomCarpet {
	
	private RoomDimension roomDimension;
	
	private int costPerSquare;
	
	
	public RoomCarpet(RoomDimension roomDimension, int costPerSquare) {
		super();
		this.roomDimension = roomDimension;
		this.costPerSquare = costPerSquare;
	}


	public int totalCost() {
		return roomDimension.area() * costPerSquare;	
	}

}
