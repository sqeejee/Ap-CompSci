public class DogTest extends DogHelper {
    public static void main(String [] args){

        /**
         * primative data types, use == (else use .equals)
         */


        Dog goodBoy = new Dog("Truman", "Labradoodle", 7, 8, "Idk");
        Dog goodGirl = new Dog("Penny", "Labadoodle", 1, 7, "what i put here");
        System.out.print(goodBoy.toString());
        System.out.print(goodGirl.toString());
      
        System.out.println(DogHelper.computeDogIDCheck(goodBoy.getDogID()));
        System.out.println(DogHelper.computeDogIDCheck(goodGirl.getDogID()));
      
      System.out.println(DogHelper.checkDogTag(goodBoy.createDogTag()));
      System.out.println(DogHelper.checkDogTag(goodGirl.createDogTag()));
      
      System.out.println(computeDogIDCheck(1));
      System.out.println(checkDogTag("333"));

    }
}

    