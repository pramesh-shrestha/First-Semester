package ApartmentComplex;

public class Test
{
  public static void main(String[] args)
  {

    try{
        MyDate date = new MyDate(15,2,2022);
        Tenant tenant = new Tenant("Pramesh");
        tenant.setRentedFrom(date);

        Residence r1 = new Room(1,50);
        Residence r2 = new Room(2,58);

        ApartmentComplex complex = new ApartmentComplex("Kolding");
        r1.rentTo(tenant,date);
        complex.add(r1);
        complex.add(r2);

        System.out.println(complex.getResidence(0));

    }
    catch (RuntimeException e)
    {
      System.out.println(e.getMessage());
    }


  }
}
