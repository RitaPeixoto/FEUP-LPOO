import java.util.Objects;

public class Room extends Facility{
    private Building building;
    private String number;
    private int floor;

    public Room(Building building, String number, int floor) throws  IllegalArgumentException, DuplicateRoomException{
        super(building.getName() + number, 0);
        if(floor > building.getMaxFloor()) throw  new IllegalArgumentException();
        this.building = building;
        this.number = number;
        this.floor = floor;
        this.building.addRoom(this);
    }

    public Room(Building building, String number, int floor, int capacity) throws  IllegalArgumentException,DuplicateRoomException{
        super(building.getName() + number, capacity);
        if(floor > building.getMaxFloor()) throw  new IllegalArgumentException();
        this.building = building;
        this.number = number;
        this.floor = floor;
        this.building.addRoom(this);
    }

    public Building getBuilding() {
        return building;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String getName() {
        return building.getName() + number;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public String toString() {
        return "Room("+building.getName()+","+number+")";
    }

    @Override
    public void authorize(User u) {
        super.authorize(u);
        this.building.authorize(u);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return floor == room.floor &&
                Objects.equals(building, room.building) &&
                Objects.equals(number, room.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(building, number, floor);
    }
}
