public class LogicGate {
    public static final String[] gateNames = {"NOT", "AND", "OR", "XOR", "NAND", "NOR"};
    // These aren't used....
    public static final int NOT = 0;
    public static final int AND = 1;
    public static final int OR = 2;
    public static final int XOR = 3;
    public static final int NAND = 4;
    public static final int NOR = 5;

    boolean one;
    boolean two;
    int gateId;

    public LogicGate(int logic) {
        this.gateId = logic;
    }

    public boolean getInput1() {
        return one;
    }

    public void setInput1(boolean one) {
        this.one = one;
    }

    public boolean getInput2() {
        return two;
    }

    public void setInput2(boolean two) {
        this.two = two;
    }

    public String getGateName() {
        return gateNames[gateId];
    }

    public String toString() {
        return getGateName();
    }

    public boolean getOutput() {
        switch (gateId) {
            case 0:
                return !(one);         // break;  will be unreachable
            case 1:
                return (one && two);   // break;  will be unreachable
            case 2:
                return (one || two);   // break;  will be unreachable
            case 3:
                return (one ^ two);    // break;  will be unreachable
            case 4:
                return !(one && two);  // break;  will be unreachable
            case 5:
                return !(one || two);  // break;  will be unreachable
            default:
                break;
        }
        return false;
    }
}