
public class Adder {
	
	public static Register add(Register a, Register b) {
		Adder[] adders = new Adder[a.getRegisterValue().length];
        for (int i = 0; i < adders.length; i++) {
            adders[i] = new Adder();
        }
		adders[0].setInput1(a.getRegisterValue()[0]);
		adders[0].setInput2(b.getRegisterValue()[0]);
		for(int i = 1; i < a.getRegisterValue().length; i++){
			adders[i].setCarryIn(adders[i-1].getCarryOut());
			adders[i].setInput1(a.getRegisterValue()[i]);
			adders[i].setInput2(b.getRegisterValue()[i]);
		}
		boolean[] sum = new boolean[adders.length];
		for(int i = 0; i < sum.length; i++){
			sum[i] = adders[i].getOutput();
		}
		Register r = new Register(sum.length);
		r.setRegisterValue(sum);
        return r;
    }
	
	LogicGate xor1 = new LogicGate(3);
	LogicGate xor2 = new LogicGate(3);
	LogicGate and1 = new LogicGate(1);
	LogicGate and2 = new LogicGate(1);
	LogicGate and3 = new LogicGate(1);
	LogicGate or1 = new LogicGate(2);
	LogicGate or2 = new LogicGate(2);
	
	public void setInput1(boolean input){
		xor1.setInput1(input);
		and1.setInput1(input);
		and3.setInput2(input);
	}
	public boolean getInput1(){
		return xor1.getInput1();
	}
	public void setInput2(boolean input){
		xor1.setInput2(input);
		and1.setInput2(input);
		and2.setInput1(input);
	}
	public boolean getInput2(){
		return xor1.getInput2();
	}
	public void setCarryIn(boolean input){
		xor2.setInput2(input);
		and2.setInput2(input);
		and3.setInput1(input);
	}
	public boolean getCarryIn(){
		return xor2.getInput2();
	}
	public boolean getOutput(){
		xor2.setInput1(xor1.getOutput());
		return xor2.getOutput();
	}
	public boolean getCarryOut(){
		or1.setInput1(and1.getOutput());
		or1.setInput2(and2.getOutput());
		or2.setInput1(or1.getOutput());
		or2.setInput2(and3.getOutput());
		return or2.getOutput();
	}
}
