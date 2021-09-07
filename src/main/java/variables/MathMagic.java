package variables;

public class MathMagic {

    int myNumber = 22;
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

    public static void main(String[] args) {
        MathMagic mathMagic = new MathMagic();
        System.out.println(mathMagic.stepSix);
    }
}
