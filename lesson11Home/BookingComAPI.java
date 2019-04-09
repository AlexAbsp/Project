package Lesson11Home;

public class BookingComAPI implements API{

    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

   // BookingComAPI bookingComAPI = new BookingComAPI(rooms);

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        BookingComAPI bookingComAPI = new BookingComAPI(rooms);
        int count = 0;

        if (rooms != null)
        {
            for (Room room : bookingComAPI.rooms) {
                if ((room != null && price >= room.getPrice() - 100 && price <= room.getPrice() + 100) && persons == room.getPersons() && city == room.getCityName() && hotel == room.getHotelName())
                    count++;
            }
            Room[] results = new Room[count];

            int resIndex = 0;
            int index = 0;
            for (Room room : bookingComAPI.rooms) {
                if ((room != null && price >= room.getPrice() - 100 && price <= room.getPrice() + 100) && persons == room.getPersons() && city == room.getCityName() && hotel == room.getHotelName()) {
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
        BookingComAPI bookingComAPI = new BookingComAPI(rooms);
       // System.out.println(bookingComAPI.rooms.length);
        return bookingComAPI.rooms;
    }
}
