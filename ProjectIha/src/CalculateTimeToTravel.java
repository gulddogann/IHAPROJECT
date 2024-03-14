public class CalculateTimeToTravel {
        public static double calculateTimeToTravel(double initialVelocity, double distance, double acceleration) {
            // Hızın Değişimi hesaplanır: Son Hız - Başlangıç Hızı
            double velocityChange = acceleration * distance;

            // Son Hız hesaplanır: Başlangıç Hızı + Hızın Değişimi
            double finalVelocity = initialVelocity + velocityChange;

            // Süre hesaplanır
            // İkinci dereceden denklemin köklerini kullanabiliriz.
            // Mesafe = Başlangıç Hızı * Zaman + 0.5 * İvme * Zaman^2
            // Bu ikinci dereceden denklemi çözmek için kuadratik denklemin çözümü kullanılır:
            // a * t^2 + b * t + c = 0
            // a = 0.5 * İvme
            // b = Başlangıç Hızı
            // c = -Mesafe

            double a = 0.5 * acceleration;
            double b = initialVelocity;
            double c = -distance;

            // İkinci dereceden denklemin kökleri hesaplanır (discriminant kullanarak)
            double discriminant = b * b - 4 * a * c;

            if (discriminant >= 0) {
                // İkinci dereceden denklemin iki gerçek kökü var
                double t1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double t2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                // Pozitif olan kökü kullanarak süreyi döndürülür
                double time = (t1 >= 0) ? t1 : t2;
                return time;
            } else {
                // İkinci dereceden denklemin gerçek kökü yok.
                // Bu, belirli bir ivme ve başlangıç hızı ile verilen mesafenin ulaşılamayacağı anlamına gelir
                // İvme ve başlangıç hızı uygunsa ve mesafe ulaşılabilirse, negatif kök olmaz.
                return -1.0; // Hatalı sonuç (-1) döndürülebilir veya başka bir işlem yapılabilir
            }
        }

    }


