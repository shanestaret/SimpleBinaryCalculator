public class TwosComplementer {

    public static Register twosComplement(Register register) {

        //Get register value
        boolean[] registerVal = register.getRegisterValue();
        //Get complement
        registerVal = getComplement(registerVal);
        //Add one
        addOne(registerVal);
        //Create new register and return
        //@// TODO: 2/5/2018 update this to support N sized registers
        Register tempRegister = new Register(8);
        tempRegister.setRegisterValue(registerVal);
        return tempRegister;

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

        //Proccess carry
        //Must length - 2 because we already modified the last bit in the array(least significant)
        for (int i = addend.length - 2; i > -1; i--) {
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
