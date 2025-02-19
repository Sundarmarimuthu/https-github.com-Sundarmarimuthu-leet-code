class Solution {
    public int dayOfYear(String date) {
        String [] s=date.split("-");
         int year=Integer.parseInt(s[0]);
         int month=Integer.parseInt(s[1]);
         int day=Integer.parseInt(s[2]);
         int[] m={31,28,31,30,31,30,31,31,30,31,30,31};
         if((year%4==0)&&((year%100!=0)||(year%400==0))) m[1]=29;
         int dl=0;
         for(int i=0;i<month-1;i++){
            dl+=m[i];

         } 
         return dl+day;    




    }
}