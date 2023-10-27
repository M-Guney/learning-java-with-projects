package projects;

public class recursiveMethodOzyinelemeli {
    static int faktoriyel(int numb){
        if(numb ==1 || numb==0 ){
            return 1;
        }
        else{
            return numb * faktoriyel(numb-1);
        }
    }

    static int degerAralikTopla(int start,int stop){
        if(stop>start){
            return stop+ degerAralikTopla(start,stop-1);
        }
        else return start;
    }

    public static void main(String[] args) {
        int result = faktoriyel(8);
        System.out.println("faktoriyel sonuc: "+result);

        System.out.println(degerAralikTopla(5,10));
        //                       +5+6+7+8+9+10
    }
}
