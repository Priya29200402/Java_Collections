package org.intejjiJ.methods.functions;

import java.util.function.*;

public class PlayRunner {
    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer = (name,age)->
            System.out.println(name+" is " +age+" years old");

        biConsumer.accept("Rahul",25);

        System.out.println("===============");

        BiFunction<Integer,String,Boolean> biFunction = (age,name)->  age>18;

        System.out.println("====================");

        BinaryOperator<Long> binaryOperator = (adhaarNO,MobileNo)-> {
            System.out.println("Aadhaar NO:"+adhaarNO+"Mobile NO:"+MobileNo);
            return adhaarNO;
        };

        System.out.println("================");

        BiPredicate<Integer,Integer> biPredicate=(mobileNo,telephoneNo)->
        {
            System.out.println("Mobile NO:"+mobileNo+"Telephone Number:"+telephoneNo);
            return mobileNo.equals(telephoneNo);
        };

        System.out.println("================================");

        BooleanSupplier booleanSupplier = () -> biPredicate.test(1234567890, 1234567890);

        System.out.println(booleanSupplier.getAsBoolean());

        System.out.println("================================");
        Consumer<Boolean> consumer = (result) -> System.out.println("Result: " + result);
        consumer.accept(booleanSupplier.getAsBoolean());

        System.out.println("================================");
        DoubleBinaryOperator doubleBinaryOperator = (mobileNo1,mobileNo2)->{
            System.out.println("Mobile NO1:"+mobileNo1+"Mobile NO2:"+mobileNo2);
            return mobileNo1;
        };

        System.out.println("================");
        DoubleConsumer doubleConsumer = (result) -> System.out.println("Result: " + result);
        doubleConsumer.accept(doubleBinaryOperator.applyAsDouble(1234567890.0, 1234567890.0));

        System.out.println("================================");
        DoubleFunction<String> doubleFunction = (work) -> {
            System.out.println("Work: " + work);
            return "Work:" + work;
        };
        System.out.println("================================");

    }
}
