package imports;

public enum Direction {
	NORTH("north"),
	SOUTH("south"),
	EAST("east"),
	WEST("west");
	private String name;
	Direction(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public Direction left() {
		switch(this) {
		case NORTH:
            return WEST;
        case WEST:
            return SOUTH;
        case SOUTH:
            return EAST;
        case EAST:
            return NORTH;
        default:
            return this;
		}
	}
	public Direction right() {
        switch (this) {
            case NORTH:
                return EAST;
            case EAST:
                return SOUTH;
            case SOUTH:
                return WEST;
            case WEST:
                return NORTH;
            default:
                return this;
        }
	}
	

public static void main(String[] args) {
	Direction dir = Direction.NORTH;
	System.out.println(dir.left().getName());
	
}
}
