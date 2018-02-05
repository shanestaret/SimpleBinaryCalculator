
public class Register {
    boolean[] register;

    public Register(int size){
        register = new boolean[size];

    }

    public Register(){
        register = new boolean[8];

    }


	public boolean[] getRegisterValue() {
		return register;
	}
	
	public void setRegisterValue(boolean[] value) {
		for (int i = 1; i < 8; i++)
			register[i] = value[i];
	}

	public String toString(){
        String tempString = "";
        for (int i = 0; i < register.length; i++) {
            if(register[i]){
                tempString += "1";
            }
            else{
                tempString += "0";
            }

        }
        return tempString;
    }
}
