package hotel_reservation;

import java.util.ArrayList;

public class Reservation {

    public static final String ROOM_STANDARD = "Room Standard";
    public static final String ROOM_WITH_A_VIEW = "Room with a view";
    public static final String ROOM_DUPLEX = "Room duplex";
    public static final String BREAKFAST = "Breakfast included";
    public static final String LATE_CHECKOUT = "Late checkout";
    private int amountOfNights;


    public Reservation(int amountOfNights) {
        this.amountOfNights = amountOfNights;
    }

    public int totalPrice() {
        if (amountOfNights == 0) return 0;
        int price = 0;
        int priceBreakfast = 20;
        int roomPriceStandard = 200;
        int roomPriceWithView = 230;
        int roomPriceDuplex = 300;

        for (String room : list) {
            if (room.equals(ROOM_STANDARD)) {
                price += roomPriceStandard * amountOfNights;
            } else if (room.equals(ROOM_STANDARD) && room.equals(BREAKFAST)) {
                price += (roomPriceStandard * amountOfNights) + (priceBreakfast * amountOfNights);
            } else if (room.equals(ROOM_WITH_A_VIEW)) {
                price += roomPriceWithView * amountOfNights;
            } else if (room.equals(ROOM_WITH_A_VIEW) && room.equals(BREAKFAST)) {
                price += (roomPriceWithView * amountOfNights) + (priceBreakfast * amountOfNights);
            } else if (room.equals(ROOM_DUPLEX)) {
                price += roomPriceDuplex * amountOfNights;
            } else if (room.equals(ROOM_DUPLEX) && room.equals(BREAKFAST)) {
                price += (roomPriceDuplex * amountOfNights) + (priceBreakfast * amountOfNights);
            }
        }
        return price;
    }


    ArrayList<String> list = new ArrayList<>();

    public void addToOrder(String product) {
        if (!product.equals(ROOM_STANDARD) && !product.equals(ROOM_WITH_A_VIEW) && !product.equals(ROOM_DUPLEX) && !product.equals(BREAKFAST) && product.equals(LATE_CHECKOUT)) {
            throw new IllegalArgumentException("This product does not exist!");
        } else {
            list.add(product);
        }

    }

}
