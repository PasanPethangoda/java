public class Company {
    String brandname;
    int price;
    Company (){
        brandname = "Apple";
        price = 400000;
    }

    public static void main(String[] args) {
        Company c = new Company();
        System.out.println(c.brandname);
        System.out.println(c.price);


    }
}
