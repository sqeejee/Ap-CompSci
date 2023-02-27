public class GradeTester
{
    public static void main(String[] args)
    {
        Grade[] scores = new Grade[5];
        scores[0] = new Grade(50);
        scores[1] = new Grade(60);
        scores[2] = new Grade(70);
        scores[3] = new Grade(80);
        scores[4] = new Grade(100);

        for(int i = 0; i < scores.length; i++)
        {
            scores[i].getLetter();
            scores[i].toString();
        }

        for (Grade grade : scores)
        {
            grade.getLetter();
            grade.toString();
        }
        
        for (Grade grade : scores)
        {
            grade.setGrade(85);
        }
        
        for (Grade grade : scores)
        {
            grade.toString();
        }
        
        for (Grade grade : scores)
        {
            grade = null;
        }
        
        for (Grade grade : scores)
        {
            grade.toString();
        }
        
        
        for(int i = 0; i < scores.length; i++)
        {
            scores[i] = null;
        }
        
        for(int i = 0; i < scores.length; i++)
        {
            System.out.println("" + scores[i]);
        }
    }
}
