package lt.karolis.inheritance;

public class ClassC extends ClassA {
    String variableC_A;
    String variableC_B;

    public void doSomethingC_A() {
        this.variableC_A = "";
        this.variableC_B = "";
        super.variableA_A = "";
        super.variableA_B = "";
    }

    public void doSomethingC_B() {

    }
}
