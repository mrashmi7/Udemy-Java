package Scope;

/**
 * Created by Programming on 31-7-2017.
 */
public class Main {
    public static void main(String[] args) {
        String varFour = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstace private varOne is " + scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.timesTwo();
        System.out.println("***********************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
