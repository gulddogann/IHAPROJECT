import java.lang.annotation.Target;

public class IHA {

    private String name;
    private double xPosition;
    private double yPosition;
    private double zPosition;
    private double xVelocity;
    private double yVelocity;
    private double zVelocity;
    private double yaw;
    private double pitch;
    private double roll;
    private double maxSpeed;
    private double batteryLevel;
    private Sensor[] sensors;
    private Target currentTarget;//hedef
    private Mission[] missions;
    private double Radius;

    public IHA(String name, double xPosition, double yPosition, double zPosition, double xVelocity, double yVelocity, double zVelocity, double yaw, double pitch, double roll, double maxSpeed, double batteryLevel, Sensor[] sensors, Target currentTarget, Mission[] missions, double radius) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.zPosition = zPosition;
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        this.zVelocity = zVelocity;
        this.yaw = yaw;
        this.pitch = pitch;
        this.roll = roll;
        this.maxSpeed = maxSpeed;
        this.batteryLevel = batteryLevel;
        this.sensors = sensors;
        this.currentTarget = currentTarget;
        this.missions = missions;
        Radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getxPosition() {
        return xPosition;
    }

    public void setxPosition(double xPosition) {
        this.xPosition = xPosition;
    }

    public double getyPosition() {
        return yPosition;
    }

    public void setyPosition(double yPosition) {
        this.yPosition = yPosition;
    }

    public double getzPosition() {
        return zPosition;
    }

    public void setzPosition(double zPosition) {
        this.zPosition = zPosition;
    }

    public double getxVelocity() {
        return xVelocity;
    }

    public void setxVelocity(double xVelocity) {
        this.xVelocity = xVelocity;
    }

    public double getyVelocity() {
        return yVelocity;
    }

    public void setyVelocity(double yVelocity) {
        this.yVelocity = yVelocity;
    }

    public double getzVelocity() {
        return zVelocity;
    }

    public void setzVelocity(double zVelocity) {
        this.zVelocity = zVelocity;
    }

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

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Sensor[] getSensors() {
        return sensors;
    }

    public void setSensors(Sensor[] sensors) {
        this.sensors = sensors;
    }

    public Target getCurrentTarget() {
        return currentTarget;
    }

    public void setCurrentTarget(Target currentTarget) {
        this.currentTarget = currentTarget;
    }

    public Mission[] getMissions() {
        return missions;
    }

    public void setMissions(Mission[] missions) {
        this.missions = missions;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public IHA() {

    }
    }