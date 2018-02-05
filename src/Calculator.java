public class Calculator {
    public static void main(String[] args) {
        Register A = new Register(8);
        Register B = new Register(8);
        boolean[] regAVal = new boolean[]{false, false, true, true, false, false, true, false};
        boolean[] regBVal = new boolean[]{false, false, false, false, true, true, false, true};
        A.setRegisterValue(regAVal);
        B.setRegisterValue(regBVal);

        System.out.printf(" %s %s", A, A);
        System.out.printf("+%s %s", B, B);
        System.out.printf("---------------------------------%n");
        Register R = Adder.add(A, B);
        System.out.printf(" %s (%3d)%n", R, R);
        System.out.printf("%n");
        System.out.printf("If we had hardware to subtract, here is what it would look like%n");
        System.out.printf(" %s (%3d)%n", A, A);
        System.out.printf("-%s (%3d)%n", B, B);
        System.out.printf("---------------------------------%n");
        // adding the twos complement is how we subtract
        Register C = TwosComplementer.twosComplement(B);
        R = Adder.add(A, C);
        System.out.printf("" + " %s (%3d)%n", R, R);
        System.out.printf("%n");
        System.out.printf("But we don't so we add the twos complement and here is what that would look like%n");
        System.out.printf(" %s (%3d)%n", A, A);
        System.out.printf("+%s (%3d)%n", C, C);
        System.out.printf("---------------------------------%n");
        // adding the twos complement is how we subtract
        System.out.printf("" + " %s (%3d)%n", R, R);

    }
}

