import hotel_reservation.Reservation;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReservationTest {


    @Test
    void amountOfNights0_Returns0() {
        Reservation r = new Reservation(0);
        assertEquals(0, r.totalPrice());
    }

    @Test
    void amountOfNights0_StandardRoom() {
        Reservation r = new Reservation(0);
        r.addToOrder(Reservation.ROOM_STANDARD);
        assertEquals(0, r.totalPrice());
    }

    @Test
    void amountOfNights1_StandardRoom() {
        Reservation r = new Reservation(1);
        r.addToOrder(Reservation.ROOM_STANDARD);
        assertEquals(200, r.totalPrice());
    }

    @Test
    void amountOfNights2_StandardRoom() {
        Reservation r = new Reservation(2);
        r.addToOrder(Reservation.ROOM_STANDARD);
        assertEquals(400, r.totalPrice());
    }

    @Test
    void amountOfNights1_StandardRoom_Breakfast() {
        Reservation r = new Reservation(1);
        r.addToOrder(Reservation.ROOM_STANDARD);
        assertEquals(220, r.totalPrice());
    }

    @Test
    void amountOfNights0_ViewRoom() {
        Reservation r = new Reservation(0);
        r.addToOrder(Reservation.ROOM_WITH_A_VIEW);
        assertEquals(0, r.totalPrice());
    }

    @Test
    void amountOfNights1_ViewRoom() {
        Reservation r = new Reservation(1);
        r.addToOrder(Reservation.ROOM_WITH_A_VIEW);
        assertEquals(230, r.totalPrice());
    }

    @Test
    void amountOfNights1_ViewRoom_Breakfast() {
        Reservation r = new Reservation(1);
        r.addToOrder(Reservation.ROOM_WITH_A_VIEW);
        assertEquals(250, r.totalPrice());
    }

    @Test
    void amountOfNights2_ViewRoom() {
        Reservation r = new Reservation(2);
        r.addToOrder(Reservation.ROOM_WITH_A_VIEW);
        assertEquals(460, r.totalPrice());
    }

    @Test
    void amountOfNights0_DuplexRoom() {
        Reservation r = new Reservation(0);
        r.addToOrder(Reservation.ROOM_DUPLEX);
        assertEquals(0, r.totalPrice());
    }

    @Test
    void amountOfNights1_DuplexRoom() {
        Reservation r = new Reservation(1);
        r.addToOrder(Reservation.ROOM_DUPLEX);
        assertEquals(300, r.totalPrice());
    }

    @Test
    void amountOfNights2_DuplexRoom() {
        Reservation r = new Reservation(2);
        r.addToOrder(Reservation.ROOM_DUPLEX);
        assertEquals(600, r.totalPrice());
    }

    @Test
    void amountOfNights1_DuplexRoom_Breakfast() {
        Reservation r = new Reservation(1);
        r.addToOrder(Reservation.ROOM_DUPLEX);
        assertEquals(320, r.totalPrice());
    }
}
