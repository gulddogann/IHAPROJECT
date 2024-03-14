public class Main {
    public static void main(String[] args) {
        Position position = new Position(10.0, 14.0, 2.0);
        System.out.println("Başlangıç Pozisyonu: " + position);

        position.moveBy(8.0, -2.0, 44.0);
        System.out.println("Yeni Pozisyon: " + position);

        Position anotherPosition = new Position(15.0, 3.0, 3.0);
        double distance = position.distanceTo(anotherPosition);
        System.out.println("İki pozisyon arasındaki mesafe: " + distance);

        Velocity velocity = new Velocity(10.0, "m/s");
        System.out.println("Hız: " + velocity);

        velocity.convertToKilometersPerHour();
        System.out.println("Hız: " + velocity);


        double initialPosition = 10.0; // Başlangıç pozisyonu (metre)
        double finalPosition = 30.0; // Bitiş pozisyonu (metre)
        double time = 5.0; // Harcanan süre (saniye)

        double averageVelocity = VelocityCalculator.calculateAverageVelocity(initialPosition, finalPosition, time);
        System.out.println("Ortalama Hız: " + averageVelocity + " m/s");

        double initialVelocity = 10.0; // Başlangıç hızı (m/s)
        double finalVelocity = 20.0; // Bitiş hızı (m/s)

        double velocityChange = VelocityChangeCalculator.calculateVelocityChange(initialVelocity, finalVelocity);
        System.out.println("Hızın Değişimi: " + velocityChange + " m/s");


        double acceleration = 2.0; // İvme (m/s^2)

        double calculatedTime = CalculateTimeToTravel.calculateTimeToTravel(initialVelocity, distance, acceleration);

        if (calculatedTime >= 0) {
            System.out.println("İki pozisyon  arasındaki süre: " + calculatedTime + " saniye");
        } else {
            System.out.println("Hesaplama geçersiz. Mesafe ulaşılamayacak.");
        }


        Orientation orientation = new Orientation(4.0, 7.0, 9.0);
        System.out.println("Başlangıçtaki Yönelim: " + orientation);

        // Orientation nesnesini sıfırla
        orientation.resetOrientation();
        System.out.println("Sıfırlanan Yönelim: " + orientation);

        // Yaw, pitch ve roll açılarını döndür
        orientation.rotate(45.0, 10.0, -5.0);
        System.out.println("Döndürülen Yönelim: " + orientation);

        // Metin olarak verilen yönelimi ayrıştır
        String orientationStr = "30.0, 15.0, -7.5";
        Orientation parsedOrientation = Orientation.parseOrientation(orientationStr);
        if (parsedOrientation != null) {
            System.out.println("Ayrıştırılan Yönelim: " + parsedOrientation);
        } else {
            System.out.println("Yönelim ayrıştırılamadı.");
        }
    }


}
