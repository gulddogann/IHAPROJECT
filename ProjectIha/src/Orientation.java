public class Orientation {
    private double yaw;   // Yatay dönüş açısı (derece)
    private double pitch; // Dikey dönüş açısı (derece)
    private double roll;  // Yan dönüş açısı (derece)

    public Orientation(double yaw, double pitch, double roll) {
        this.yaw = yaw;
        this.pitch = pitch;
        this.roll = roll;
    }

    // Getter ve Setter metotları burada tanımlanabilir.

    public double getYaw() {
        return yaw;
    }

    public void setYaw(double yaw) {
        this.yaw = yaw;
    }

    public double getPitch() {
        return pitch;
    }

    public void setPitch(double pitch) {
        this.pitch = pitch;
    }

    public double getRoll() {
        return roll;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Yaw: " + yaw + "°, Pitch: " + pitch + "°, Roll: " + roll + "°";
    }

    public void resetOrientation() {
        yaw = 0.0;
        pitch = 0.0;
        roll = 0.0;
    }

    public void rotate(double yawChange, double pitchChange, double rollChange) {
        yaw += yawChange;
        pitch += pitchChange;
        roll += rollChange;
    }

    public static Orientation parseOrientation(String orientationStr) {
        String[] parts = orientationStr.split(",");
        if (parts.length == 3) {
            try {
                double yaw = Double.parseDouble(parts[0].trim());
                double pitch = Double.parseDouble(parts[1].trim());
                double roll = Double.parseDouble(parts[2].trim());
                return new Orientation(yaw, pitch, roll);
            } catch (NumberFormatException e) {
                // Hata durumu yönetimi
            }
        }
        return null; // Ayrıştırma hatası durumu yönetimi
    }

    public void rotateYaw(double yawChange) {
        yaw += yawChange;
    }

}
