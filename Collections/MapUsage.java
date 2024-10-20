import java.util.*;
class MapOperation{
    LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();
    public void mapPut(int roll_num, String name){
        hm.put(roll_num,name);
    }
    public HashMap<Integer,String> mapPrint(){
        return hm;
    }
}
public class MapUsage {

    public static void main(String[] args) {
        MapOperation mo= new MapOperation();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students do you want to add? : ");
        int lim = sc.nextInt();
        for(int i=1;i<=lim;i++){
            System.out.printf("Enter the Roll No of %d : ",i);
            int roll_num = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter your name : ");
            String name = sc.nextLine();
            mo.mapPut(roll_num,name);
        }
        System.out.println(mo.mapPrint());
    }
}