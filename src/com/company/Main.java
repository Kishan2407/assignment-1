package com.company;

import  java.util.*;
public class Main {
    public static void main(String[] args) {
        Address a = new Address("Perumalnagar","Chennai","Tamil Nadu");
        System.out.println(a.getAddressDetails());
        a.updateAddressDetails("PooriNagar @ Chennai @ Tamil Nadu");
        System.out.println(a.getAddressDetails());
        a.updateAddressDetails("Kanchi","Chennai","Tamil Nadu");
        System.out.println(a.getAddressDetails());

        Contact c = new Contact("Kishan","9080903200","srkishan2407@gmail.com");
        System.out.println(c.getContactDetails());
        c.setContactDetails("sameer @ 9734637505 @ sameer973@gmail.com");
        System.out.println(c.getContactDetails());
        c.setContactDetails("hareen","9899654249","hareenssb@gmail.com");
        System.out.println(c.getContactDetails());

        Flight f = new Flight(70," Indigo",200,5);
        System.out.println(f.getFlightDetails());
        System.out.println(f.checkAvailability());
        f.updateBookedSeats(200);
        System.out.println(f.checkAvailability());

        Passenger p = new Passenger(1,"walter","9845655562",
                "guru@gmail.com","Anand street", "Chennai","Tamil Nadu");
        System.out.println(p.getAddress().getAddressDetails());
        System.out.println(p.getContact().getContactDetails());
        System.out.println(p.getId());

        String arrivalTime = "21/01/02 23:23:34";
        String departureTime ="21/01/01 5:23:32";
        RegularTicket rt = new RegularTicket("13243","Bangalore",
                "Chennai",f,
                departureTime,arrivalTime,p,113,6000,false,null);
        System.out.println(rt.checkStatusCancelled());
        System.out.println(rt.getFlightDuration());
        rt.setStatusCancelled();
        System.out.println(rt.checkStatusCancelled());
        System.out.println(rt.getSpecialService());
        rt.updateSpecialService(null);

        String[] touristLocations = {"Agra","Goa","Manali"};
        TouristTicket tt = new TouristTicket("13248","Bangalore",
                "Chennai",f,
                departureTime,arrivalTime,p,113,6000,false,a,touristLocations);
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getFlightDuration());
        tt.setStatusCancelled();
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getHotelAddress().getAddressDetails());
        for (String s: tt.touristLocations){
            System.out.println(s);
        }




    }
}
