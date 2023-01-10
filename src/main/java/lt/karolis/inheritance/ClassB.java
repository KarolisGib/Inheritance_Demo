package lt.karolis.inheritance;

public class ClassB extends ClassA {

    String variableB_A;
    String variableB_B;


    public void doSomethingB_A() {
        this.variableB_A = "";
        this.variableB_B = "";
        super.variableA_A = "";
        super.variableA_B = "";
        super.doSomethingA_A();
        super.doSomethingA_B();
    }

    public void doSomethingB_B() {

    }

    @Override
    public void doSomethingA_A() {
        super.doSomethingA_A();
    }

    @Override
    public void doSomethingA_B() {
        super.doSomethingA_B();
    }
}
