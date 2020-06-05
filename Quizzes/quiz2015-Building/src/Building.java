import java.util.HashSet;
import java.util.Set;

public class Building extends Facility {
    private int minFloor;
    private int maxFloor;
    private Set<Room> rooms;

    public Building(String name, int min, int max) throws IllegalArgumentException{
        super(name,0);
        if(min > max) throw new IllegalArgumentException();
        this.minFloor = min;
        this.maxFloor = max;
        this.rooms = new HashSet<>();
    }
    public Building(String name, int min, int max, int capacity) throws IllegalArgumentException{
        super(name,capacity);
        if(min > max) throw new IllegalArgumentException();
        this.minFloor = min;
        this.maxFloor = max;
    }

    public int getMinFloor() {
        return minFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public void addRoom(Room room) throws DuplicateRoomException{
        if(!rooms.add(room)) throw new DuplicateRoomException();
        setCapacity(getCapacity()+room.getCapacity());
    }



    @Override
    public String toString() {
        return "Building("+getName()+")";
    }


}
