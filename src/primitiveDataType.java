public class primitiveDataType
{
    public static void main(String[] args)
    {
        //int has a width of 32
        int myMinVal = -2_147_483_648;
        int myMaxVal = 2_147_483_647;
        int myTotal = (myMinVal/2);

        System.out.println(myTotal);

        //byte has a width of 8
        byte myByte = -128; //maximum of byte is 128 and min is -128

        //this calculation will convert to int by default
        // and the var is byte
        //so it get the error. To fix this, please add (byte)
        byte myNewByte = (byte) (myByte/2);
        System.out.println(myNewByte);

        //short has a width of 16
        short myShortVal = 32767; //maximum of short is 32767;
        short myNewShort = (short) (myShortVal/2);
        System.out.println(myNewShort);
        //long has a width of 64
        long myLongVal = 9_223_372_036_854_775_807L;
        System.out.println(myLongVal);

        byte a = 1;
        short b = 222;
        int d = 221;
        long e = 50000 + (a * 10) + b + d;

        System.out.println(e);
    }
}
