public class Primitive {
    long primitive(){

        //underflow
        boolean bo = true; //fales

        byte b =1; //int (-128 to 127)

        short s = 1; // int (-32, 768 to 32, 767)

        int i=1;
        // we can store integer in to the long, float and double EG: d=1;

        long lo = 1; //int max=2147483647 if we use more than that we need to add L
        long lo1 = 2147483648L;

        float f = 3.46f;
        // we can store long into float
        f = 2147483648L; //store as 2.14748365E9

        double d = 3.14; //double
        // we can store long into double
        d = 2147483648L; //store as 2.14748365E9
        //we can store float in to double
        d = 3.46f;

        char c = 'a'; //97
        c = 1; //int (0 to 65,535)
        //we can store caractor into the all primitive type data type EG:
        d='a';

        //overflow
        char z= 'a';
        z=(short)1;

        byte b1;
        b1 = (int) 1L;
        b1 = (short) 1L;
        b1 = (byte) 1L;

        b1 =(byte) 11.2f;
        b1 =(short) 11.2f;
        b1 =(int) 11.2f;
        //b1 =(long) 1.2f;

        return 1L;
    }

    public Long wrapper(){
        Boolean bo =false;  //Autoboxing
        boolean boo = Boolean.valueOf(true); //unboxing

        //Before Java 5.0
        bo = Boolean.valueOf(true);
        bo = Boolean.valueOf("FALSE");

        boo = Boolean.parseBoolean("false");

        Byte b = 1; //int
        b='a';

        Short s= 1;
        s='a';

        Integer i =1;
        //i='a';            cannot assign character to integer

        Long lo =1L;

        Float f = 3.15f;

        Double d =3.14;

        Character c='a';
        c = 1; //int (0 to 65,535)


        return 1l;
    }
}
