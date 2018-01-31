public class TwosComplementer {

    public static Register twosComplement(Register register) {

        //Get register value
        boolean[] registerVal = register.getRegisterValue();
        //Get complement
        registerVal = getComplement(registerVal);
        //Add one



    }

    private static boolean[] getComplement(boolean[] complement) {
        for (int i = 0; i < complement.length; i++) {
            LogicGate notGate = new LogicGate(LogicGate.NOT);
            notGate.setInput1(complement[i]);
            complement[i] = notGate.getOutput();
        }
        return complement;

    }

    private static boolean[] addOne(boolean[] addend){
        //Add one to value
        LogicGate xorGate = new LogicGate(LogicGate.XOR);
        LogicGate andGate = new LogicGate(LogicGate.AND);
        for (int i = 0; i < addend.length; i++) {
            //Our "1" to add
            boolean a = true;
            xorGate.setInput1(a);
            andGate.setInput1(a);
            xorGate.setInput2(addend[i]);
            andGate.setInput2(addend[i]);

            //Set new values
            addend[i] = xorGate.getOutput();
        }

    }


}
