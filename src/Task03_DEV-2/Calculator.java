package main;


import static java.lang.Math.pow;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import static jdk.nashorn.internal.objects.NativeMath.pow;

/**
 *
 * @author 0mainPC
 */
class Calculator {

    void Calculate(String line) {
        String[] numbers = new String[line.length()];
        String[] operations = new String[line.length()];
        int lengthOfLine = 0;
        int length = 0;
        int numberOfMass = 0;
        for(int i = 0; i< line.length();i++)
        {
            if(((((line.charAt(i))=='+')&&((line.charAt(i-1))!='e'))||((line.charAt(i))=='-')||((line.charAt(i))=='*')||((line.charAt(i))=='/'))||(i+1)==line.length())
            {
                if ((i+1)==line.length()) length++;
                StringBuilder stringBuilder = new StringBuilder();
                for(int j = 0; j< length; j++) {
                    stringBuilder.append(line.charAt(lengthOfLine+j));
                }
                numbers[numberOfMass]=stringBuilder.toString();
                if (!((i+1)==line.length())) operations[numberOfMass]=String.valueOf(line.charAt(i));
                numberOfMass++;
                lengthOfLine=lengthOfLine+length+1;
                length=0;
            }
            else
            {
                length++;
            }
        }
        //for(int i = 0; i<numberOfMass; i++)
        //{
        //    for (int j = 0; j < numbers[i].length(); j++){
        //        if(numbers[i].charAt(j)=='e')
        //        {
        //            StringBuilder stringBuilder1 = new StringBuilder();
        //            for(int k = 0; k< j; k++) {
        //                stringBuilder1.append(numbers[i].charAt(k));
	//	    }
        //            StringBuilder stringBuilder2 = new StringBuilder();
        //            System.out.println(stringBuilder2.toString());
        //            for(int k = j+2; k< numbers[i].length(); k++) {
        //                System.out.println(k);
        //                {
        //                    stringBuilder2.append(numbers[i].charAt(k));
        //                    System.out.println(stringBuilder1.toString());
        //                    System.out.println(stringBuilder2.toString());
        //                }
        //            }
	//	    BigDecimal B = new BigDecimal(stringBuilder1.toString());
        //            System.out.println(stringBuilder2.toString());
	//	    BigDecimal C = new BigDecimal(stringBuilder2.toString());
        //            StringBuilder stringBuilder3 = new StringBuilder();
        //            stringBuilder3.append('1');
        //            
	//	    for(BigInteger k = new BigInteger("0"); !k.equals(C);k=k.add(new BigInteger("1")))
        //            {
        //                stringBuilder3.append('0');
        //            }
        //            BigInteger D = new BigInteger(stringBuilder3.toString());
	//				
	//	if(numbers[i].charAt(j+1)=='+')
	//	{
        //            B=B.multiply(new BigDecimal(D));
	//	}
	//	else
	//	{
	//	    B=B.divide(new BigDecimal(D));
	//	}
	//	numbers[i]=B.toString();
        //        }
        //    }
        //}
        System.out.println(Arrays.toString(numbers));
        BigDecimal[] A = new BigDecimal[numberOfMass];
        for(int i = 0; i < numberOfMass;i++)
        {
            A[i]=new BigDecimal(numbers[i]);//работаект все кроме е
        }
        int LengthOfB = 0;
        for(int i = 0; i<(numberOfMass-1);i++)
        {
            switch(operations[i]){
                case "*":
                {
                    A[i]=A[i].multiply(A[i+1]);
                    for(int j = i;j<(numberOfMass-2);j++)
                    {
                        operations[j]=operations[j+1];
                        A[j+1]=A[j+2];                
                    }
                    break;
                }
                case "/":
                    A[i]=A[i].divide(A[i+1]);
                    for(int j = i;j<(numberOfMass);j++)
                    {
                        operations[j]=operations[j+1];
                        A[j+1]=A[j+2];                
                    }
                    break;
                default:
                    break;
        }
                System.out.println(Arrays.toString(A));
                System.out.println(Arrays.toString(operations));
        }
    }
    
}
