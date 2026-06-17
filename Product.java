class Product {
    String pid, pname;

    Product(String id, String name) {
        pid = id;
        pname = name;
    }
}

class Demand extends Product {
    int pdemand;

    Demand(String id, String name, int demand) {
        super(id, name);
        pdemand = demand;
    }
}
class Supply extends Demand

{ 
    int pproduced;
    double prate;
    Supply(String id,String name,int demand,int produced,double rate)
    { 
        super(id,name,demand);
        pproduced=produced;
        prate=rate;

    }

    double calculation()
    {
        return (prate*pdemand)-(prate*pproduced);
    }

    void display()
    {
        System.out.println("The product Id: "+pid);
        System.out.println("The product name: "+pname);
        System.out.println("The quantity demanded: "+pdemand);
        System.out.println("The difference in demand and supply is:  "+calculation());
    }

    public static void main ( String args[])
    { 
        Supply obj=new Supply("ES0134","shampoo",34,23,2.13);
        obj.display();

    }
}
