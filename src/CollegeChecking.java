/**
 *
 * @author Alvin Alex, Vinayak Talla
 */
public class CollegeChecking extends Checking {
    private static final double YEARLYINTERESTRATE = 0.25;
    private String campusCode;

    public CollegeChecking(Profile profile, double balance, int campusCode){
        this.holder = profile;
        this.balance = balance;
        this.closed = false;
        if(campusCode == 0){
            this.campusCode = "NEW_BRUNSWICK";
        }
        else if(campusCode == 1){
            this.campusCode = "NEWARK";
        }
        else if(campusCode == 2){
            this.campusCode = "CAMDEN";
        }
    }

    public double monthlyInterest() {
        return (YEARLYINTERESTRATE/12) * balance;
    }

    public double fee() {
        return 0;
    }

    public String toString(){
        return getType() + "::" + holder + "::Balance $" + balance + "::" + campusCode;
    }

    public String getType() {
        return "College Checking";
    }

    public static void main(String[] args){
        CollegeChecking checking1 = new CollegeChecking(new Profile("Jane", "Doe", new Date("6/07/2002")), 0.0, 0);
        CollegeChecking checking2 = new CollegeChecking(new Profile("Alvin", "Alex", new Date("7/06/2002")), 100.0, 0);
        System.out.println(checking1);
        System.out.println(checking2);
    }
}
