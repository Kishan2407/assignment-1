import  java.util.*;
public class Main {
    public static void main(String[] args) {

        Flight f = new Flight(70,"Indigo",200,5);
        System.out.println(f.getFlightDetails());
        System.out.println(f.checkAvailability());
        f.updateBookedSeats(200);
        System.out.println(f.checkAvailability());

        Passenger p = new Passenger("walter","9845655562",
                "guru@gmail.com","Anand street", "Chennai","Tamil Nadu");
        System.out.println("Address :"+p.getAddress());
        System.out.println("Contact :"+p.getContact());
        System.out.println("Id :"+p.getId());
        System.out.println(Passenger.getIdCounter());
        System.out.println(Passenger.getPassengerCount());
        p.setAddress("kik","gagba","ywa");
        p.setContact("mko","9879874563","hfunfs@gmail.com");

        Passenger p1 = new Passenger("harry","8736827645",
                "kikhsga@gmail.com","Nehru street", "Chennai","Tamil Nadu");
        System.out.println(p1.getAddress());
        System.out.println(p1.getContact());
        System.out.println(p1.getId());
        System.out.println(Passenger.getIdCounter());
        System.out.println(Passenger.getPassengerCount());

        String arrivalTime = "21/01/01 18:23:34";
        String departureTime ="21/01/01 10:23:32";
        RegularTicket rt = new RegularTicket("13248","Bangalore",
                "Chennai",f,
                departureTime,arrivalTime,p,213,6000,false,null);
        System.out.println(rt.checkStatusCancelled());
        System.out.println(rt.getFlightDuration());
        rt.setStatusCancelled();
        System.out.println(rt.checkStatusCancelled());
        System.out.println(rt.getSpecialService());
        rt.updateSpecialService(null);

        String[] touristLocations = {"Agra","Goa","Goa"};
        TouristTicket tt = new TouristTicket("14325","Bangalore",
                "Chennai",f,
                departureTime,arrivalTime,p,113,6000,false,
                "",touristLocations);
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getFlightDuration());
        tt.setStatusCancelled();
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getHotelAddress());
        for (String s: tt.touristLocations){
            System.out.println(s);
        }




    }
}
