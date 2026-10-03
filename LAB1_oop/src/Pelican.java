public class Pelican extends Bird{
    private int fishCount;
    private double swimSpeed;
    private double flySpeed;

    public Pelican(String name, int age, int weight, String area, String gender, int wingspan, String plumageColor,
        int flockMembers, int fishcount, double swimSpeed,
        double flySpeed) {
            super(name, age, weight, area, gender, wingspan, plumageColor, flockMembers);

            this.fishCount = fishcount;
            this.swimSpeed = swimSpeed;
            this.flySpeed = flySpeed;
            
        }

    public int getFishCount() {
        return fishCount;
    }

    public void setFishCount(int fishCount) {
        this.fishCount = fishCount;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(double swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public double getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public void carry(int fishCount) {
        System.out.println(getName() + " carries " + fishCount + " fish in his beak");
    }

    public void hunt() {
        System.out.println(getName() + " is hunting fish");
    }

    public void landOnWater(double swimSpeed) {
        System.out.println(getName() + " landed on water." + " Current swimming speed = " + swimSpeed + " km/h");
    }
}