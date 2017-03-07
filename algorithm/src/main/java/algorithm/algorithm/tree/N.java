package algorithm.algorithm.tree;

import java.util.HashMap;
import java.util.Map;

import javax.naming.RefAddr;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class N {

    
    public static void main(String[] args) {
        N n = null;
        n(n);
        System.out.println(n==null);
        
        Map<String,String> map = null;
        map(map);
        System.out.println(map==null);
        map = mapV();
        System.out.println(map==null);
    }
    
    public static void n(N n){
        n = new N();
    }
    
    public static Map<String,String> mapV(){
         Map<String,String>map = new HashMap<String, String>();
         return map;
    }
    
    public static   void map(Map<String,String> map){
        map = new HashMap<String, String>();
   }
}
