public class TwosComplementer {
    private static LogicGate notGate = new LogicGate(0); //NOT gate that we use to perform one's complement on all binary digits
    private static LogicGate andGate = new LogicGate(1); //XOR gate that we use to calculate the "sum" part of two's complement
    private static LogicGate xorGate = new LogicGate(3); //AND gate that we use to calculate the "carry" part of two's complement
    private static boolean input; //the first input we send to XOR and AND, and also the only input we send to NOT; boolean value determined by the value of the "digit" integer
    private static boolean input2; //the second input we send to XOR and AND; boolean value determined by the value of the "carry" integer
    private static boolean carry = true; //the output of the AND gate; default set to 1 since we always have to set the "carry" equal to perform two's complement with a half adder only

    public static boolean[] twosComplement(boolean[] register) {
    	/* --Performs ones compliment-- */
        for(int i = 0; i < register.length; i++) { //loops through individual digits within the orignal binary number given
            notGate.setInput1(register[i]);
            register[i] = notGate.getOutput();
        }
        
        /* --Add one to ones compliment-- */
        for (int i = (register.length - 1); i >= 0; i--) {        	
            xorGate.setInput1(register[i]); //giving first input for XOR gate
            xorGate.setInput2(carry); //giving second input for XOR gate
            andGate.setInput1(register[i]); //giving first input for AND gate
            andGate.setInput2(carry); //giving second input for AND gate
            
            register[i] = xorGate.getOutput();
            carry = andGate.getOutput();
        }
        
        return register;
    }
}
