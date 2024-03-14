public class Position {
    private double x;
    private double y;
    private double z;
    private Velocity velocity;

    public Position(double x, double y, double z, Velocity velocity) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.velocity = velocity;
    }


    public Velocity getVelocity() {
        return velocity;
    }

    public void setVelocity(Velocity velocity) {
        this.velocity = velocity;
    }


    public Position(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Belirli bir mesafe kadar ilerleme işlevi
    public void moveBy(double deltaX, double deltaY, double deltaZ) {
        this.x += deltaX;
        this.y += deltaY;
        this.z += deltaZ;
    }

    // Mesafe hesaplama işlevi
    public double distanceTo(Position otherPosition) {
        double dx = this.x - otherPosition.getX();
        double dy = this.y - otherPosition.getY();
        double dz = this.z - otherPosition.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);

    }


    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

}
