package Scope;

/**
 * Created by Programming on 31-7-2017.
 */
public class ScopeCheck  {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck.ScopeCheck");
        System.out.println("publicVar = " + publicVar);
        System.out.println("varOne = " + varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        int varTwo = 2;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * varTwo);
        }
    }

    public class InnerClass {
        public int varThree = 3;

        public InnerClass() {
            System.out.println("ScopeCheck.ScopeCheck");
            System.out.println("publicVar = " + publicVar);
            System.out.println("varOne = " + varThree);
        }

        public void timesTwo() {
            System.out.println("varOne = " + varOne);
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " times two is " + i * varThree);
            }
        }

    }
}
