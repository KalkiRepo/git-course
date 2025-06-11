import java.rmi.RemoteException;
public class ProductImp implements Product{

public String name;
public String description;
public double price;

public ProductImp(String newName, String descrip, double newPrice) throws RemoteException{

this.name=newName;
this.description=descrip;
this.price=newPrice;
}

public String getName() throws RemoteException{
return this.name;
}
public String getDescription() throws RemoteException{
return this.description;
}
public double getPrice() throws RemoteException{

return this.price;
}
}