package lt.karolis.inheritance;

public class ClassD extends ClassB {

    String variableD_A;
    String variableD_B;

    public void doSomethingD_A() {
        this.variableD_A = "";
        this.variableD_B = "";
        super.variableA_A = "";
        super.variableA_B = "";
        super.variableB_A = "";
        super.variableB_B = "";
    }

    public void doSomethingD_B() {

    }
}
