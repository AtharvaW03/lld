package facade;

public class Main {
    public static void main(String[] args) {
        MovieBookingFacade movieBookingFacade = new MovieBookingFacade();
        movieBookingFacade.bookMovieTicket("user123", "Cars", "F1", "johndoe@email.com", 1000);
    }
}
