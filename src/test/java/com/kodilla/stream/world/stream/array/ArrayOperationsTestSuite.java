package com.kodilla.stream.world.stream.array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite {

   @Test
    public void testGetAverage(){

       //Given

      int[]numbers=new int[20];

       numbers[0]=1;
       numbers[1]=1;
       numbers[2]=1;
       numbers[3]=1;
       numbers[4]=1;
       numbers[5]=1;
       numbers[6]=1;
       numbers[7]=1;
       numbers[8]=1;
       numbers[9]=1;
       numbers[10]=1;
       numbers[11]=1;
       numbers[12]=1;
       numbers[13]=1;
       numbers[14]=1;
       numbers[15]=1;
       numbers[16]=1;
       numbers[17]=1;
       numbers[18]=1;
       numbers[19]=1;

       //When

       double average=ArrayOperations.getAvarage(numbers);

       //Then

       assertEquals(1.0,average,0 );


   }
}
