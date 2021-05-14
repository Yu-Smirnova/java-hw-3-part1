public class Main {
    public static void main(String[] args) {
        double ticketPrice = 13_852.38;
        int bonusMilePrice = 20;

        int totalBonusMiles = (int) (ticketPrice / bonusMilePrice);
        System.out.println("Вам начислено " + totalBonusMiles + " бонусных миль");
    }
}
