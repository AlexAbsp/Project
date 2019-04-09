package Lesson11Home;

public class GoogleAPI implements API{
    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        GoogleAPI googleAPI = new GoogleAPI(rooms);
        if (rooms != null) {
            int count = 0;
            for (Room room : googleAPI.rooms) {
                if (price >= room.getPrice() && persons == room.getPersons() && city == room.getCityName() && hotel == room.getHotelName())
                    count++;
            }
            Room[] results = new Room[count];

            int resIndex = 0;
            int index = 0;
            for (Room room : googleAPI.rooms) {
                if (price == room.getPrice() && persons == room.getPersons() && city == room.getCityName() && hotel == room.getHotelName()) {
                    results[index] = rooms[resIndex];
                    index++;
                }
                resIndex++;
            }
            return results;
        }

        return null;
    }

    @Override
    public Room[] getAll() {
        GoogleAPI googleAPI = new GoogleAPI(rooms);
        return googleAPI.rooms;
    }
}
