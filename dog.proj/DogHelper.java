public class DogHelper
{
     public static char computeDogIDCheck(int dogID)
    {
        return (char)( (70 + ((dogID / 100) + ((dogID % 100)/10) + (dogID % 10))));
    }
    public static boolean checkDogTag (String dogTag)
    {
        return computeDogIDCheck(Integer.parseInt(dogTag.substring(0, 2))) == dogTag.charAt(2);
    }
}