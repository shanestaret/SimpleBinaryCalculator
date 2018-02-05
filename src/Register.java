
public class Register {

	boolean[] Register = new boolean[8];	
	
	public boolean[] getRegisterValue() {
		return Register;
	}
	
	public void setRegisterValue(boolean[] value) {
		for (int i = 1; i < 8; i++)
			Register[i] = value[i];
	}	
}
