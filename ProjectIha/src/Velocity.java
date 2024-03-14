public class Velocity {
    private double speed; // Hızın büyüklüğü (örneğin, m/s)
    private String unit; // Hızın birimi (örneğin, "m/s")

    public Velocity(double speed, String unit) {
        this.speed = speed;
        this.unit = unit;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


    // Hızı m/s birimine dönüştüren yöntem
    public void convertToMetersPerSecond() {
        if ("km/h".equals(unit)) {
            speed = speed * 1000 / 3600;
            unit = "m/s";
        }
    }

    // Hızı km/h birimine dönüştüren yöntem
    public void convertToKilometersPerHour() {
        if ("m/s".equals(unit)) {
            speed = speed * 3600 / 1000;
            unit = "km/h";
        }
    }

        @Override
        public String toString () {
            return speed + " " + unit;
        }
    }


