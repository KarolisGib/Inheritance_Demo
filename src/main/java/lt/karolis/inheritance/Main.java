package lt.karolis.inheritance;

public class Main {
    public static void main(String[] args) {


        ClassA classA = new ClassA("ccc");
        ClassB classB = new ClassB("bbb", "aaa");
        ClassC classC = new ClassC("aaa", "ddd");
        ClassD classD = new ClassD("aaa", "ccc");

        classA.variableA_A = "";
        classA.doSomethingA_A();

        classB.variableA_A = "sveiki";
        classC.variableA_A = "sveiki";

        System.out.println(classB);
        System.out.println(classB.equals(classC));
        System.out.println(classB.hashCode());

    }
}
