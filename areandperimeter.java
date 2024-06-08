import java.util.*;
class areandperimeter{
    static void check(float l,float w){
        float area = l*w;
        float perimeter = 2*(l+w);
        if(area>perimeter){
            System.out.println("area is "+area+" and area is greater than the perimeter");
        }else{
            System.out.println("perimeter is" + perimeter +"perimeter is greater than the area");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        float l = sc.nextFloat();
        System.out.print("Enter the width : ");
        float w = sc.nextFloat();
        check(l, w);
    }
}