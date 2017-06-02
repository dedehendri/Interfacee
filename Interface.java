
package pkginterface;

/**
 *
 * @author Dede Hendri
 */
public interface Interface {
   public String nama = "Ben";
   public String Nim = "14111020";

   /*Interface tidak dapat di inisiasi*/
public static void main (String[] Args) {
        Interface In = new Interface();
    
}
    
}

/*class Abstract Dapat mengImplement interface dngan bebas */
public abstract class abstrak implements Interface {
    protected String getNama(){
        return this.nama;
    }
/* implement variable interface */
public class impl implements Interface {
    public static void main (String[] Args) {
        impl pg = new impl();
        pg.nama;
        pg.Nim
    }
    
} 
    
    
}
