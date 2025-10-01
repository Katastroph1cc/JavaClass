// Brandon Merrell
// IT-145
// Project One
// 9/27/2025


package Java;

public class PetBag {
	
	// Attributes 
	private String petType;
    private String petName;
    private int petAge;
    private int dogSpaces; 
    private int catSpaces; 
    private int lengthOfStay; 
    private double amountDue;

    // Constructor: Sets them to default values
    public PetBag() {
        this.petType = "";
        this.petName = "";
        this.petAge = 0;
        this.dogSpaces = 0;
        this.catSpaces = 0;
        this.lengthOfStay = 0;
        this.amountDue = 0.0;
    }
    
    // Accessors (Getters) 
    public String getPetType() {
        return petType;
    }

    public String getPetName() {
        return petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public int getDogSpaces() {
        return dogSpaces;
    }

    public int getCatSpaces() {
        return catSpaces;
    }

    public int getLengthOfStay() {
        return lengthOfStay;
    }

    public double getAmountDue() {
        return amountDue;
    }

    // Mutators (Setters)
    public void setPetType(String petType) {
        this.petType = petType;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public void setDogSpaces(int dogSpaces) {
        this.dogSpaces = dogSpaces;
    }

    public void setCatSpaces(int catSpaces) {
        this.catSpaces = catSpaces;
    }

    public void setLengthOfStay(int lengthOfStay) {
        this.lengthOfStay = lengthOfStay;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

}
