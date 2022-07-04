public class Factorial {
    public long factorial(long value){

        if (value==0)
            return 1;
        return value*factorial(value-1);
    }

    public long factorial1(long value){
        long result=value;
        while (value != 1)
            result *= --value;
        return result;
    }
}
