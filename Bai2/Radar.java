package Bai2;

public class Radar {
    public double Analyze(int n) {
       if(n >= 0 && n <= 15){
            return 1 - (n / 15);
       }else{
            return 0;
       }
    } 
}