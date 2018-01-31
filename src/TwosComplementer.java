public class TwosComplementer {

    public static Register twosComplement(Register register) {

        //Get register value
        boolean[] registerVal = register.getRegisterValue();
        //Get complement
        registerVal = getComplement(registerVal);
        //Add one

        return new Register(0);

    }

    private static boolean[] getComplement(boolean[] complement) {
        for (int i = 0; i < complement.length; i++) {
            LogicGate notGate = new LogicGate(LogicGate.NOT);
            notGate.setInput1(complement[i]);
            complement[i] = notGate.getOutput();
        }
        return complement;

    }


    public static boolean[] addOne(boolean[] addend) {
        //Add one to value
        LogicGate xorGate = new LogicGate(LogicGate.XOR);
        LogicGate andGate = new LogicGate(LogicGate.AND);
        boolean carry = false;
        //Add 1
        boolean a = true;
        xorGate.setInput1(a);
        andGate.setInput1(a);
        xorGate.setInput2(addend[addend.length - 1]);
        andGate.setInput2(addend[addend.length - 1]);
        //Set new values
        addend[addend.length - 1] = xorGate.getOutput();
        carry = andGate.getOutput();

        //No carry, done adding
        if (carry == false) {
            return addend;
        }
        //Carry out carry
        for (int i = addend.length - 1; i > -1; i--) {
            xorGate.setInput1(carry);
            andGate.setInput1(carry);
            xorGate.setInput2(addend[i]);
            andGate.setInput2(addend[i]);
            //Set new values
            addend[i] = xorGate.getOutput();
            carry = andGate.getOutput();

        }
        return addend;
    }
}
