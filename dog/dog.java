public class Dog(){
    private String name, breed;
    private int age;
    


    public Dog (String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;



        //toString
        //equals
        //converttohumanYears


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

        public 
    }
}