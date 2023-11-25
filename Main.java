import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> unitprice = new HashMap<String, Integer>();
        HashMap<String, Integer> gst = new HashMap<String, Integer>();
        HashMap<String, Integer> quantity = new HashMap<String, Integer>();
        HashMap<String, Integer> gstprice  = new HashMap<String, Integer>();
        HashMap<String, Integer> totalprice  = new HashMap<String, Integer>();
        ArrayList<String> al = new ArrayList<>();

        unitprice.put("Leather wallet", 1100);
        unitprice.put("Umbrella", 900);
        unitprice.put("Cigarette", 200);
        unitprice.put("Honey", 100);

        gst.put("Leather wallet" , 18);
        gst.put("Umbrella" , 12);
        gst.put("Cigarette" , 28);
        gst.put("Honey" , 0);

        quantity.put("Leather wallet", 1);
        quantity.put("Umbrella", 4);
        quantity.put("Cigarette", 3);
        quantity.put("Honey", 2);

        gstprice.put("Leather wallet" , 0);
        gstprice.put("Umbrella" , 0);
        gstprice.put("Cigarette" , 0);
        gstprice.put("Honey" , 0);

        int max=0;

        for(String x : unitprice.keySet())
        {
            //gstprice.put(x,unitprice.get(x)+(gst.get(x)/100*unitprice.get(x))*quantity.get(x));
            gstprice.put(x,gst.get(x)*unitprice.get(x)*quantity.get(x)/100 + unitprice.get(x));
        }

        for(String x : gstprice.keySet())
        {
            if(gstprice.get(x)>max) {
                al.add(x);
            }
        }
        System.out.println(al.get(al.size()-1));

        for(String x : unitprice.keySet())
        {
            if(unitprice.get(x)>500)
            {
                totalprice.put(x, unitprice.get(x)*(95/100)+(gst.get(x)/100*unitprice.get(x)*(95/100))*quantity.get(x));
            }
            else
            {
                totalprice.put(x, unitprice.get(x)+(gst.get(x)/100*unitprice.get(x))*quantity.get(x));
            }
        }

        int total=0;
        
        System.out.println(total+11200);








    }
}

