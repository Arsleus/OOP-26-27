public class Bird extends Animal {
    private int wingspan;
    private String plumageColor;
    private int flockMembers;

    public Bird(String name, int age, int weight, String area, String gender, int wingspan, String plumageColor, int flockMembers) {
        super(name, age, weight, area, gender);
        this.wingspan = wingspan;
        this.plumageColor = plumageColor;
        this.flockMembers = flockMembers;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public String getPlumageColor() {
        return plumageColor;
    }

    public void setPlumageColor(String plumageColor) {
        this.plumageColor = plumageColor;
    }

    public int getFlockMembers() {
        return flockMembers;
    }

    public void setFlockMembers(int flockMembers) {
        this.flockMembers = flockMembers;
    }

    public void layEgg(int eggCount) {
        if (getGender().equalsIgnoreCase("Female")) {
            System.out.println(getName() + " laid " + eggCount + " eggs");
        } else {
        System.out.println(getName() + " can't lay eggs (he tried!)");
        }
    }

    @Override 
    public void move(String newArea) {
        super.move(newArea);
        System.out.println(getName() + " is flying to " + newArea);
    }

    public void takeoff() {
        System.out.println(getName() + " took off");
    }

    public void landing() {
        System.out.println(getName() + " landed");
    }
}
