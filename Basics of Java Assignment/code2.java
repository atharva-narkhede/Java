public class code2 {
    public static void main(String args[]){
        double birthinsecond = 7;
        double deathinsecond = 13;
        double newinsecond = 45;
        double currentpopulation = 312032486;
        double secondsinayear = 60 * 60 * 24 * 365;

        double numberofbirth = secondsinayear / birthinsecond;
        double numberofdeath = secondsinayear / deathinsecond;
        double numberofimmigrant = secondsinayear / newinsecond;

        for (int i = 1; i <= 5; i++) 
        {
            currentpopulation = currentpopulation + numberofbirth + numberofimmigrant - numberofdeath;
            System.out.println("For Year " + i + " = " + (int) currentpopulation);
        }
}
}
