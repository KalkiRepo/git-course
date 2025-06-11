import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
 
public class Server{

public static void main(String[] args){

try{
System.setProperty("java.rmi.server.hostname","127.0.0.1");
ProductImp p1 = new ProductImp("laptop","HP",45000.00);
ProductImp p2 = new ProductImp("mobile","OPPO",16500.00);
//Exporting the remote objects

Product stub1 = (Product)UnicastRemoteObject.exportObject(p1,0);
Product stub2 = (Product)UnicastRemoteObject.exportObject(p2,0);

//Register the exported class in RMI registry with name
//Client will use that name to get the reference
Registry registry = LocateRegistry.getRegistry("127.0.0.1",9100);

registry.bind("L",stub1);
registry.bind("m",stub2);

}
catch(Exception e){
System.out.println("Server Error..."+ e.getMessage());
}

}

}


