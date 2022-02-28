import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MultipleVariables {
    void sandFence(){
        String s1,s2;
        String s3 = "yes", s4="no";
        //System.out.println(s1.toString());       cannot (not assign value)
    }

    void paintFence() {
        int i1, i2, i3 =0;
        //int num, String value;    cannot
    }

    void legalDeclaration(){
        boolean b1,b2;
        String s1 ="1", s2;
        // double d1, double d2;    cannot
        double d1; double d2;
        // int i1; i4;              cannot
        //System.out.println(d1);   cannot (not assign value)
    }
}
