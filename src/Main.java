public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int ticketPrice = 1200;
        int every20Rubles = 20;
        int bonusMiles = ticketPrice / every20Rubles;
        System.out.println("Бонусных миллей:" + bonusMiles);
    }
}