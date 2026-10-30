public class LooneyTuneTester {
    
    public static void main(String[] args) {

        LooneyTune Bugs = new LooneyTune("Bugs Bunny", "What's up, doc?");
        LooneyTune Elmer = new LooneyTune("Elmer Fudd", "Shh. Be vewy, vewy quiet, I'm hunting wabbits.");
        LooneyTune Daffy = new LooneyTune("Daffy Duck", "You're dethpicable!");

        System.out.println("Expected: ");
        System.out.println(Bugs.toString());
        System.out.println(Elmer.toString());
        System.out.println(Daffy.toString());

        System.out.println(Bugs.verifyCatchphrase("What's up, doc?")); // true
        System.out.println(Bugs.verifyCatchphrase("Ain't I a stinker?")); // false

        System.out.println(Elmer.verifyCatchphrase("Shh. Be vewy, vewy quiet, I'm hunting wabbits.")); // true
        System.out.println(Elmer.verifyCatchphrase("Say your pwayers, wabbit!")); // false

        System.out.println(Daffy.verifyCatchphrase("You're dethpicable!")); // true
        System.out.println(Daffy.verifyCatchphrase("Sufferin' succotash!")); // false

        System.out.println(Bugs.getNickname()); // Bugs
        System.out.println(Elmer.getNickname()); // Elmer
        System.out.println(Daffy.getNickname()); // Daffy

        System.out.println(Bugs.getLastName()); // Bunny
        System.out.println(Elmer.getLastName()); // Fudd
        System.out.println(Daffy.getLastName()); // Duck

        System.out.println(Bugs.feedCarrots(10)); // Bugs Bunny (Bugs) has eaten 10 carrots.
        System.out.println(Elmer.feedCarrots(15)); // Elmer Fudd (Elmer) is not a bunny. They are a Fudd.
        System.out.println(Elmer.feedCarrots(100)); // Daffy Duck (Daffy) is not a bunny. They are a Duck.

        System.out.println(Bugs.addBounty(55.5)); // Bugs Bunny (Bugs) now has a bounty of 55.5.
        System.out.println(Elmer.addBounty(25.5)); // Elmer Fudd (Elmer) now has a bounty of 25.0.
        System.out.println(Daffy.addBounty(75.7)); // Daffy Duck (Daffy) now has a bounty of 75.7.

        System.out.println(Bugs.removeBounty(5.0)); // Bugs Bunny (Bugs) now has a bounty of 50.5.
        System.out.println(Elmer.removeBounty(10.5)); // Elmer Fudd (Elmer) now has a bounty of 15.0.
        System.out.println(Daffy.removeBounty(500.7)); // Daffy Duck (Daffy) now has a bounty of 0.0.

        System.out.println(Bugs.isHighValueTarget()); // true
        System.out.println(Elmer.isHighValueTarget()); // false
        System.out.println(Daffy.isHighValueTarget()); // false

        System.out.println(Bugs.isDisguised()); // true
        System.out.println(Elmer.isDisguised()); // false
        System.out.println(Daffy.isDisguised()); // false

    }

}
