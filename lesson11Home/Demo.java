package Lesson11Home;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Room room1 = new Room(123451, 149, 1, new Date(), "Carlton", "Funchal" );
        Room room2 = new Room(123452, 100, 1, new Date(), "Carlton2", "Madrid" );
        Room room3 = new Room(123453, 150, 2, new Date(), "Carlton3", "Barcelona" );
        Room room4 = new Room(123454, 200, 3, new Date(), "Carlton4", "Kiev" );
        Room room5 = new Room(123465, 40, 1, new Date(), "Carlton5", "Praga" );
        Room room6 = new Room(123456, 50, 1, new Date(), "Carlton", "Funchal" );
        Room room7 = new Room(123457, 50, 2, new Date(), "Carlton", "Funchal" );
        Room room8 = new Room(123458, 150, 2, new Date(), "Carlton8", "Barcelona" );
        Room room9 = new Room(123459, 200, 3, new Date(), "Carlton9", "Kiev" );
        Room room10 = new Room(123460, 40, 1, new Date(), "Carlton10", "Praga" );

        Room[] rooms1 = {room1, room2, room3, room4};
        Room[] rooms2 = {room1, room2, room5, null, room3};
        Room[] rooms3 = {room1, room2, room3, room4, room8, room9, room10};

        BookingComAPI bookingComAPI = new BookingComAPI(rooms1);
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI(rooms2);
        GoogleAPI googleAPI = new GoogleAPI(rooms3);

        API[] apis = {bookingComAPI, tripAdvisorAPI, googleAPI};

        Controller controller = new Controller(apis);

        bookingComAPI.findRooms(50, 1, "Funchal", "Carlton");
       tripAdvisorAPI.findRooms(50, 1, "Funchal", "Carlton");
        bookingComAPI.getAll();
        controller.check(bookingComAPI, tripAdvisorAPI);



    }
}
