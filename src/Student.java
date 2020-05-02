import java.util.Random;

public class Student {

    private float intelligence;
    private float cleverness;
    private float laziness;
    private static int pointsToGive=5;
    private Random random= new Random();
    public Student() {
        intelligence=random.nextInt(10-pointsToGive)+1;
        cleverness=random.nextInt(10-pointsToGive)+1;
        laziness=random.nextInt(10-pointsToGive)+1;

    }
    public float getCleverness() {
        return cleverness;
    }

    public float getIntelligence() {
        return intelligence;
    }

    public float getLaziness() {
        return laziness;
    }
}
