package src_new;

public class Primitive_data_type {

    public static void main(String[] args) {

      //It is an 8-bit signed 2's complement integer. It can have a value of (-128) to 127 ( inclusive). Below are the benefits of using the byte data type:
        //It is useful for saving memory in large Arrays.
        //It can be used instead of int to clarify our code using its limits.
        //It saves memory, too, because it is 4 times smaller than an integer.
        byte age = 100;
        System.out.println(age);
        System.out.println(age + 1);


        //The short data type is also used to store the integer values.
        // It is a 16-bit signed 2's complement integer with a value range of -32,768 to 32,767 (inclusive).
        // It is also used to save memory, just like the byte data type.
        //It is recommended to use the short data type in a large array when memory saving is essential.
        short age2 =10000;
        System.out.println(age2 + 2);

        //The int stands for Integer; it is a 32-bit signed two's complement integer.
        // It's value can be from -2^31 to (2^31-1), which is -32,768 to 32,767 (inclusive). Its default value is zero.
        // It represents an unsigned 32-bit integer, which has a value range from 0 to 32,767.
        //If memory saving is not our primary goal, then the int data type is used to define the integer value.
        int i =1000000;
        System.out.println(i + 3);

        //It is a 64-bit 2's complement integer with a value range of (-2^63) to (2^63 -1) inclusive.
        // It is used for the higher values that can not be handled by the int data type.
       long l =1000000000l;
        System.out.println(l+ 4);

        //The Float data type is used to declare the floating values ( fractional numbers). It is a single-precision 32-bit IEEE 754 floating-point data type
        //Its value range is infinite. While declaring the floating, we must end the value with an f.
        //It is useful for saving memory in large arrays of floating-point numbers.
        // It is recommended to use float data type instead of double while saving the floating numbers in large arrays, and not use it with precise numbers such as currency.
        float f = 115.75f;
        System.out.println(f);


       //The double data type is also used for the floating-point ( Fractional values) number. It is much similar to the float data type.
        // But, generally, it is used for decimal values. Like the float data type, its value range is infinite and also can not be used for precise values such as currency.
        //The default value of the double data type is 0.0d. While declaring the double type values, we must end the value with a d.
        double num= 19.99d;
        System.out.println(num);


        //The short data type is also used to store the integer values.
        // It is a 16-bit signed 2's complement integer with a value range of -32,768 to 32,767 (inclusive).
        // It is also used to save memory, just like the byte data type.
        //It is recommended to use the short data type in a large array when memory saving is essential.
        char Myname= 'h';
        System.out.println(Myname);


        //A boolean data type can have two types of values, which are true and false. It is used to add a simple flag that displays true/false conditions.
        // It represents one bit of information.
        //  It's is not a specific size data type. So, we can not precisely define its size.

        boolean isJtpBest=true;
        boolean isCold = false;
        System.out.println(isJtpBest);
        System.out.println(isCold);
    }

}
