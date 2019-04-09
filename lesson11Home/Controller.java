package Lesson11Home;

public class Controller {
   public API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel){
        Controller controller = new Controller(apis);
        int count = 0;
        for (API apis : controller.apis){
            for(Room room : apis.getAll()){
                if(price >= room.getPrice() && persons == room.getPersons() && city == room.getCityName() && hotel == room.getHotelName())
                    count++;
            }
        }
        Room[] results = new Room[count];

         int resIndex = 0;
         int index = 0;
        for (API apis : controller.apis){
            for (Room room : apis.getAll()){
                if(price >= room.getPrice() && persons == room.getPersons() && city == room.getCityName() && hotel == room.getHotelName()){
                    results[index] = apis.getAll()[resIndex];
                    index++;
                }
                    resIndex++;
            }
        }
     return results;
    }
    public Room[] check(API api1, API api2){
        if(api1.getAll() != null && api2.getAll() != null)
        {
            int count = 0;
            for (Room roomApi1 : api1.getAll()) {
                for (Room roomApi2 : api2.getAll()) {
                    if (roomApi1 != null && roomApi2 !=null && roomApi1.getPrice() == roomApi2.getPrice() && roomApi1.getPersons() == roomApi2.getPersons() && roomApi1.getHotelName() == roomApi2.getHotelName() && roomApi1.getCityName() == roomApi2.getCityName()) {
                        count++;
                    }

                }
            }
            Room[] results = new Room[count];

            int index = 0;
            for (Room roomApi1 : api1.getAll()) {
                for (Room roomApi2 : api2.getAll()) {
                    if ( roomApi1 != null && roomApi2 != null && roomApi1.getPrice() == roomApi2.getPrice() && roomApi1.getPersons() == roomApi2.getPersons() && roomApi1.getHotelName() == roomApi2.getHotelName() && roomApi1.getCityName() == roomApi2.getCityName()) {
                        results[index] = api1.getAll()[index];
                        index++;
                    }

                }

            }
            return results;
        }
        else
        return null;
    }
    public Room cheapestRoom(){
       Controller controller = new Controller(apis);
        Room roomChipest = apis[0].getAll()[0];
        for (API apis : controller.apis){
            for(Room room : apis.getAll()){
                if(room.getPrice() < roomChipest.getPrice())
                    roomChipest = room;
            }
        }

     return roomChipest;
    }
}
