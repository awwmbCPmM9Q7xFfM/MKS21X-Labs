public class Tester{
    public static void main(String[] args){
        RealNumber now = new RealNumber(1.2345);
        RealNumber wow = new RealNumber(55.5);
        System.out.println(now.getValue());
        System.out.println(wow.getValue());
        System.out.println(wow.subtract(now));
        System.out.println(wow.divide(now));
        System.out.println(wow.multiply(now));
        System.out.println(wow.add(now));
        RationalNumber naw = new RationalNumber(3, 2);
        RationalNumber waw = new RationalNumber(30, 40);
        System.out.println("rational " + waw.getNumerator());
        System.out.println(waw.getDenominator());
        System.out.println(waw.toString());
        System.out.println(waw.reciprocal().toString());
        System.out.println(waw.equals(naw));
        System.out.println(waw.multiply(naw).toString());






    }
}
