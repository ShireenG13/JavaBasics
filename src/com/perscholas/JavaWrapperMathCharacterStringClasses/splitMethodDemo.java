
package com.perscholas.JavaWrapperMathCharacterStringClasses;
import java.util.Arrays;



public class splitMethodDemo {
    public static void main(String[] args) {
        String vowels = "a::e::i::o::u";
        String [] result = vowels.split("::");
        System.out.println(Arrays.toString(result));
    }
}
