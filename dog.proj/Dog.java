public class Dog{
    private String name, breed;
    private int age;
    public int dogID;
    public char dogIDCheck;
    public String dogTag;

    public Dog (String name, String breed, int age, int dogID, String dogTag){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.dogID =  dogID;
        this.dogTag = dogTag;
    }

    //toString
    //equals
    //converttohumanYears
    
    public String createDogTag(){
       int h = dogID / 100;
        int t = (dogID - (h*100)) / 10;
        int o = ((dogID - (h*100)) - t*10);
        int uni = h + t + o;
        char id = (char)(70+((h+t+o) % 10));
        return (dogID + "" + (int) (id));
    }

    public char computeDogIDCheck(int dogID){
        int h = dogID / 100;
        int t = (dogID - (h*100)) / 10;
        int o = ((dogID - (h*100)) - t*10);
        int uni = h + t + o;
        char id = (char)(70+((h+t+o) % 10));
        return (id);
    }

    public int converttohumanYears(){
        return(age*7);
    }

    public boolean equals(Dog otherDog)
    {
        return(this.name == name && this.breed == breed && this.age == age);
    }

    public String toStirng()
    {
        return("This dog named " + name + " is a " + breed + " and is " + age + " years old!");

    }

    public void setDogID(int dogID) {
        this.dogID = dogID;
    }

    public int getDogID(){
        return dogID;
    }

    public String getName() {
        return name;
    }

    public char getDogIDCheck(){
        return dogIDCheck;
    }

    public void setDogIDCheck(char dogIDCheck) {
        this.dogIDCheck = dogIDCheck;
    }

    public String getBreed() {
        return breed;
    }

    public int getage() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setDogTag(String dogTag){
        this.dogTag = dogTag;
    }

    public String getDogTag(){
        return dogTag;
    }

}