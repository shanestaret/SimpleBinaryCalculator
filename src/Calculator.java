public class Calculator {
    public static void main(String[] args) {
 /*       Register A = new Register(8);
        Register B = new Register(8);
        A.clockIt();
        A.setDatalines("00110010");
        A.clockIt();
        B.clockIt();
        B.setDatalines("00001101");
        B.clockIt();
        System.out.printf(" %s (%3d)%n", A, A.toDecimalNumber());
        System.out.printf("+%s (%3d)%n", B, B.toDecimalNumber());
        System.out.printf("---------------------------------%n");
        Register R = Adder.add(A, B);
        System.out.printf(" %s (%3d)%n", R, R.toDecimalNumber());
        System.out.printf("%n");
        System.out.printf("If we had hardware to subtract, here is what it would look like%n");
        System.out.printf(" %s (%3d)%n", A, A.toDecimalNumber());
        System.out.printf("-%s (%3d)%n", B, B.toDecimalNumber());
        System.out.printf("---------------------------------%n");
        // adding the twos complement is how we subtract
        Register C = TwosComplementer.twosComplement(B);
        R = Adder.add(A, C);
        System.out.printf("" + " %s (%3d)%n", R, R.toDecimalNumber());
        System.out.printf("%n");
        System.out.printf("But we don't so we add the twos complement and here is what that would look like%n");
        System.out.printf(" %s (%3d)%n", A, A.toDecimalNumber());
        System.out.printf("+%s (%3d)%n", C, C.toDecimalNumber());
        System.out.printf("---------------------------------%n");
        // adding the twos complement is how we subtract
        System.out.printf("" + " %s (%3d)%n", R, R.toDecimalNumber());*/

        boolean[] register = {true, true, false, true};

        TwosComplementer complementer = new TwosComplementer();
        register = complementer.addOne(register);
        register = complementer.get

        for (int i = 0; i < register.length; i++) {
            System.out.println(register[i]);

        }

    }
}

