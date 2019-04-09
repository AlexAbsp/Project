package Lesson11Home;

public class TripAdvisorAPI implements API {

    private Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);

        if(rooms != null)
        {

            int count = 0;
            for (Room room : tripAdvisorAPI.rooms) {
                if (price == room.getPrice() && persons >= room.getPersons() - 1 && persons <= room.getPersons() + 1 && city == room.getCityName() && hotel == room.getHotelName())
                    count++;
            }
            Room[] results = new Room[count];

            int resIndex = 0;
            int index = 0;
            for (Room room : tripAdvisorAPI.rooms) {
                if (price == room.getPrice() && persons >= room.getPersons() - 1 && persons <= room.getPersons() + 1 && city == room.getCityName() && hotel == room.getHotelName()) {
                    results[index] = rooms[resIndex];
                    index++;
                }
                resIndex++;
            }
            return results;
        }
        else
        return null;
    }

    @Override
    public Room[] getAll() {
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms);
        return tripAdvisorAPI.rooms;
    }
}
