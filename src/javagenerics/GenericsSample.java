package javagenerics;


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


    }
}
