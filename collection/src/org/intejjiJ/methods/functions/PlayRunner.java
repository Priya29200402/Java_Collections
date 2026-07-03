package org.intejjiJ.methods.functions;

import java.util.function.*;

public class PlayRunner {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biConsumer = (name, age) ->
                System.out.println(name + " is " + age + " years old");

        biConsumer.accept("Rahul", 25);
        System.out.println("===============");

        BiFunction<Integer, String, Boolean> biFunction = (age, name) -> age > 18;

        System.out.println("====================");

        BinaryOperator<Long> binaryOperator = (adhaarNO, MobileNo) -> {
            System.out.println("Aadhaar NO:" + adhaarNO + "Mobile NO:" + MobileNo);
            return adhaarNO;
        };

        System.out.println("================");

        BiPredicate<Integer, Integer> biPredicate = (mobileNo, telephoneNo) ->
        {
            System.out.println("Mobile NO:" + mobileNo + "Telephone Number:" + telephoneNo);
            return mobileNo.equals(telephoneNo);
        };

        System.out.println("================================");

        BooleanSupplier booleanSupplier = () -> biPredicate.test(1234567890, 1234567890);
        System.out.println(booleanSupplier.getAsBoolean());

        System.out.println("================================");
        Consumer<Boolean> consumer = (result) -> System.out.println("Result: " + result);
        consumer.accept(booleanSupplier.getAsBoolean());

        System.out.println("================================");
        DoubleBinaryOperator doubleBinaryOperator = (mobileNo1, mobileNo2) -> {
            System.out.println("Mobile NO1:" + mobileNo1 + "Mobile NO2:" + mobileNo2);
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
        DoublePredicate doublePredicate = (mobileNo) -> mobileNo > 18;
        System.out.println(doublePredicate.test(1234567890.0));

        System.out.println("================================");
        DoubleSupplier doubleSupplier = () -> 1234567890.0;
        System.out.println(doubleSupplier.getAsDouble());

        System.out.println("================================");
        DoubleToIntFunction doubleToIntFunction = (mobileNo) -> (int) mobileNo;
        System.out.println(doubleToIntFunction.applyAsInt(1234567890.0));

        System.out.println("================================");
        DoubleToLongFunction doubleToLongFunction = (mobileNo) -> (long) mobileNo;
        System.out.println(doubleToLongFunction.applyAsLong(1234567890.0));

        System.out.println("================================");
        DoubleUnaryOperator doubleUnaryOperator = (mobileNo) -> mobileNo * 2;
        System.out.println(doubleUnaryOperator.applyAsDouble(1234567890.0));

        System.out.println("================================");
        Function<Integer, String> function = (mobileNo) -> "Mobile NO: " + mobileNo;
        System.out.println(function.apply(1234567890));

        System.out.println("================================");
        IntBinaryOperator intBinaryOperator = (mobileNo1, mobileNo2) -> mobileNo1 + mobileNo2;
        System.out.println(intBinaryOperator.applyAsInt(1234567890, 1234567890));

        System.out.println("================================");
        IntConsumer intConsumer = (mobileNo) -> System.out.println("Mobile NO: " + mobileNo);
        intConsumer.accept(1234567890);

        System.out.println("================================");
        IntFunction<String> intFunction = (sim) -> "Sim: " + sim;
        System.out.println(intFunction.apply(1234567890));

        System.out.println("================================");
        IntPredicate intPredicate = (mobileNo) -> mobileNo > 18;
        System.out.println(intPredicate.test(1234567890));

        System.out.println("================================");
        IntSupplier intSupplier = () -> 1234567890;
        System.out.println(intSupplier.getAsInt());

        System.out.println("================================");
        IntToDoubleFunction intToDoubleFunction = (mobileNo) -> (double) mobileNo;
        System.out.println(intToDoubleFunction.applyAsDouble(1234567890));

        System.out.println("================================");
        IntToLongFunction intToLongFunction = (mobileNo) -> (long) mobileNo;
        System.out.println(intToLongFunction.applyAsLong(1234567890));

        System.out.println("================================");
        IntUnaryOperator intUnaryOperator = (mobileNo) -> mobileNo * 2;
        System.out.println(intUnaryOperator.applyAsInt(1234567890));

        System.out.println("================================");
        LongBinaryOperator longBinaryOperator = (mobileNo1, mobileNo2) -> mobileNo1 + mobileNo2;
        System.out.println(longBinaryOperator.applyAsLong(1234567890L, 1234567890L));

        System.out.println("================================");
        LongConsumer longConsumer = (mobileNo) -> System.out.println("Mobile NO: " + mobileNo);
        longConsumer.accept(1234567890L);

        System.out.println("================================");
        LongFunction<String> longFunction = (sim) -> "Sim: " + sim;
        System.out.println(longFunction.apply(1234567890L));

        System.out.println("================================");
        LongPredicate longPredicate = (mobileNo) -> mobileNo > 18;
        System.out.println(longPredicate.test(1234567890L));

        System.out.println("================================");
        LongSupplier longSupplier = () -> 1234567890L;
        System.out.println(longSupplier.getAsLong());

        System.out.println("================================");
        LongToDoubleFunction longToDoubleFunction = (mobileNo) -> (double) mobileNo;
        System.out.println(longToDoubleFunction.applyAsDouble(1234567890L));

        System.out.println("================================");
        LongToIntFunction longToIntFunction = (mobileNo) -> (int) mobileNo;
        System.out.println(longToIntFunction.applyAsInt(1234567890L));

        LongUnaryOperator longUnaryOperator = (mobileNo) -> mobileNo * 2;
        System.out.println(longUnaryOperator.applyAsLong(1234567890L));

        System.out.println("================================");
        ObjDoubleConsumer<String> objDoubleConsumer = (name, age) -> System.out.println(name + " is " + age + " years old");
        objDoubleConsumer.accept("Rahul", 25);

        System.out.println("================================");
        ObjIntConsumer<String> objIntConsumer = (name, age) -> System.out.println(name + " is " + age + " years old");
        objIntConsumer.accept("Rahul", 25);

        System.out.println("================================");
        ObjLongConsumer<String> objLongConsumer = (name, age) -> System.out.println(name + " is " + age + " years old");
        objLongConsumer.accept("Rahul", 25);

        System.out.println("================================");
        Predicate<String> predicate = (name) -> name.length() > 5;
        System.out.println(predicate.test("Rahul"));

        System.out.println("================================");
        Supplier<String> supplier = () -> "Hello I am Priyanka Software Developer!";
        System.out.println(supplier.get());

        System.out.println("================================");
        ToDoubleBiFunction<String, Integer> toDoubleBiFunction = (name, age) -> name.length() + age;
        System.out.println(toDoubleBiFunction.applyAsDouble("Priyanka", 22));

        System.out.println("================================");
        ToIntBiFunction<String, Integer> toIntBiFunction = (name, age) -> name.length() + age;
        System.out.println(toIntBiFunction.applyAsInt("Prema", 22));

        System.out.println("================================");
        ToLongBiFunction<String, Integer> toLongBiFunction = (name, age) -> name.length() + age;
        System.out.println(toLongBiFunction.applyAsLong("Priyanka", 22));

        System.out.println("================================");
        ToLongFunction<String> toLongFunction = (name) -> name.length();
        System.out.println(toLongFunction.applyAsLong("Priyanka"));

        System.out.println("================================");
        UnaryOperator<String> unaryOperator = (name) -> name;
        System.out.println(unaryOperator.apply("Priyanka"));

    }
}
