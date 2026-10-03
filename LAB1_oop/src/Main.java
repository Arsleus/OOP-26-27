public class Main {
    public static void main(String[] args) {
        Pelican Bob = new Pelican("Bob", 4, 6, "Croatia", "Male", 280, "White", 12, 5, 3.0, 45.5);

        System.out.println("Pelican's name: " + Bob.getName());
        Bob.grow();
        System.out.println(Bob.getName() + " is " + Bob.getPlumageColor() + " " + Bob.getGender());
        System.out.println(Bob.getName() + " has wingspan " + Bob.getWingspan() + " cm");
        Bob.eat(2);
        System.out.println("-");

        Bob.takeoff();
        Bob.move("Greece");
        System.out.println("Current flying speed: " + Bob.getFlySpeed() + " km/h");
        Bob.landOnWater(Bob.getSwimSpeed());
        System.out.println("-");
        
        Bob.hunt(); 
        Bob.carry(Bob.getFishCount());
        Bob.landing();
        
        System.out.println("-");
        Bob.layEgg(3);
        

    }
    
}

