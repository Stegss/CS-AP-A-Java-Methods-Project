public class LooneyTune {

    private String fullname; // First Name Last Name (Bugs Bunny) or (Elmer Fudd)
    private String catchphrase;
    private int carrotsEaten;
    private double bounty;
    private boolean isDisguised;

    public LooneyTune(String fullname, String catchphrase) {
        this.fullname = name;
        this.catchphrase = catchphrase;

        int carrotsEaten = 0;
        double bounty = 0.0;
        boolean isDisguised = false;
    }

    public boolean verifyCatchphrase(String checkphrase) {

        return catchphrase.equals(checkphrase);
    
    }

    public String getNickname() {

        int dotindex = fullname.indexOf(" ");
        if (dotindex != -1) {
            return fullname.substring(0, dotindex);
        } else {
            return "Your character does not have a valid nickname.";
        }

    }

    public String toString() {

        return fullname + " " + " (" + getNickname() + ") ";

    }


    public String feedCarrots(int carrots) {

        if (fullname.toLowerCase().contains("bunny")) {
            carrotsEaten += carrots;
            return toString() + " has eaten " + carrotsEaten + " carrots. " ;
        } else {
            return toString() + " is not a bunny. " ;
        }

    } 

    public boolean isHighValueTarget() {
        
        // No idea
        
    }

}
