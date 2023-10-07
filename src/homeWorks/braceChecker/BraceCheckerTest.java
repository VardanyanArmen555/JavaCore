package homeWorks.braceChecker;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String text = "H[[e{l[lo (Jav}}a}";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();

    }

}
