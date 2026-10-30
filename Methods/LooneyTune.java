public class LooneyTune {

    private String fullname; // First Name Last Name (Bugs Bunny) or (Elmer Fudd)
    private String catchphrase;
    private int carrotsEaten;
    private double bounty;
    private boolean isDisguised;

    public LooneyTune(String fullname, String catchphrase) {
        this.fullname = fullname;
        this.catchphrase = catchphrase;

        carrotsEaten = 0;
        bounty = 0.0;
        isDisguised = false;
    }

    public boolean verifyCatchphrase(String checkphrase) {

        return catchphrase.equals(checkphrase);
    
    }

    public String getNickname() {

        int dotindex = fullname.indexOf(" ");
        if (dotindex != -1) {
            return fullname.substring(0, dotindex);
        } else {
            return fullname;
        }

    }

        public String getLastName() {

        int dotindex = fullname.indexOf(" ");
        if (dotindex != -1) {
            return fullname.substring(dotindex + 1, fullname.length());
        } else {
            return "Your character does not have a valid last name.";
        }

    }

    public String toString() {

        return fullname + " (" + getNickname() + ")";

    }


    public String feedCarrots(int carrots) {

        if (fullname.toLowerCase().contains("bunny")) {
            carrotsEaten += carrots;
            return toString() + " has eaten " + carrotsEaten + " carrots. " ;
        } else {
            return toString() + " is not a bunny. They are a " + getLastName();
        }

    } 

    public String addBounty(double amt) {
        bounty += amt;
        return toString() + " now has a bounty of " + bounty;
    }

    public String removeBounty(double amt) {
        bounty -= amt;
        if (bounty < 0) {
            bounty = 0;
        }
        return toString() + " now has a bounty of " + bounty;
    }

    public boolean isHighValueTarget() {
        
        if (bounty >= 50) {
            isDisguised = true;
            return true;
        } else {
            isDisguised = false;
            return false;
        }
        
    }

    public boolean isDisguised() {
        return isDisguised;
    }

}
