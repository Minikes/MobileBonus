public class Main {
    public static void main(String[] args) {

        int check = 300;
        int replenishment = 1200;
        int bonus = replenishment / 100;

        int finalCheck;
        if (replenishment >= 1000) {
            finalCheck = bonus + check + replenishment;
        } else {
            finalCheck = replenishment + check;
        }
        System.out.println("на счету " + finalCheck + " рубля/рублей");
    }
}
