public class VelocityCalculator {

    public static double calculateAverageVelocity(double initialPosition, double finalPosition, double time) {
        // initialPosition: Başlangıç pozisyonu (metre)
        // finalPosition: Bitiş pozisyonu (metre)
        // time: Harcanan süre (saniye)

        // Ortalama hız hesaplama formülü: Hız = Mesafe / Süre
        double distance = finalPosition - initialPosition;
        double velocity = distance / time;

        return velocity;
    }


}


