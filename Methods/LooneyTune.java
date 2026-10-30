public class LooneyTune {

    private String name;
    private String catchphrase;
    private int carrotsEaten;
    private double bounty;
    private boolean isDisguised;

    public LooneyTune(String name, String catchphrase) {
        this.name = name;
        this.catchphrase = catchphrase;

        int carrotsEaten = 0;
        double bounty = 0.0;
        boolean isDisguised = false;
    }

    public boolean verifyCatchphrase(String checkphrase) {

        return catchphrase.equals(checkphrase);
    
    }

    public String getNickname(String divider) {

        // Takes the divider ( space for example ) and checks to see if there is one
        // Means there is a first and last name (Porky Pig for example)
        // Will find the space / divider and take off the first part of the name (Porky) and print it

    }

    public String feedCarrots(int carrots) {

        // Use index of to see if Bunny is in the name somewhere?
        // If so, then feed carrots.

    }

    public boolean isHighValueTarget() {
        
        // No idea
        
    }

}
