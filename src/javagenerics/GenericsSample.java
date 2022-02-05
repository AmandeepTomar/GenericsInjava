package javagenerics;


import java.util.ArrayList;
import java.util.List;

public class GenericsSample {

    public static void main(String[] args) {
        Example1 example1=new Example1();
        example1.checkExample1();

        MultipleParameters.getMultipleGenericsExample();

        GenericMethods genericMethods=new GenericMethods();
        genericMethods.returnValue(12);
        genericMethods.returnValue(12.0);
        genericMethods.returnValue(12L);
        System.out.println(genericMethods.returnValue("Return value"));

        genericMethods.printValue(12);
        genericMethods.printValue(12.0);
        genericMethods.printValue(12f);
        genericMethods.printValue(345L);
        genericMethods.printValue("VALUE IS");

        genericMethods.printValues("Name",31);
        genericMethods.printValues("Name",31L);
        Integer [] array=new Integer[]{1,2,3,4,5,6};
        genericMethods.printValuesAsArray(array);

        String [] names=new String[]{"name1","name2","name3","name4","name5"};
        genericMethods.printValuesAsArray(names);

        System.out.println("===========Bound Generics================");

        BoundGenerics boundGenerics=new BoundGenerics();
        System.out.println(boundGenerics.calculateMin(10,15));
        System.out.println(boundGenerics.calculateMin(55,10));

        System.out.println(boundGenerics.calculateMin(new Person(70,"Name"),new Person(10,"Name2")));
        System.out.println(boundGenerics.addTwoNumber(10,20));
        System.out.println(boundGenerics.addTwoNumber(10.5,20.5));
        System.out.println(boundGenerics.addTwoNumber(10.4,20));
        System.out.println(boundGenerics.addTwoNumber(10f,20.56));
        System.out.println(boundGenerics.addTwoNumber(10f,20f));

        System.out.println("=========== Type inference =============");
        Bucket<String> bucket=new Bucket<>("Bucket");
        List<Bucket<String>> list=new ArrayList<>();
        TypeInferenceExample.addStore(bucket.getItem(),list);
        // type witness
        // Here we tell the compiler that this one is going to String
        TypeInferenceExample.<String>addStore("Telling Complier",list);




    }
}
