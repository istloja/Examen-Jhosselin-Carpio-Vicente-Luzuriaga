/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISTLOJJA
 */
public class horasminutossegundos {
    public static void main(String[] args) {
        int h;
        int m;
        int s;
        h =0;
        m=0;
        s=0;
        while (h<=+24){
            System.out.println((h<10?"0"+h:h)+":"+(m<10?"0"+m:m)+":"+(s<10?"0"+s:s));
            s= s+1;
                  if (s==60) {
                      m=m+1;
                      s = 0;
                  }
                  if (m==60){
                      h=h+1;
                      m=0;
                  }
        }
    }
}
