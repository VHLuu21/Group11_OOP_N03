public class Time {
    int hour;
    int minute;
    int second;

    Time() {setTime(0,0,0);}
    Time(int h) {setTime(h,0,0);}
    Time(int h, int m) {setTime(h,m,0);}
    Time(int h, int m, int s) {setTime(h,m,s);}

    Time setTime(int h, int m,int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
        return this;
    }
    Time setHour(int h){
        hour =((h>=0 && h <24)?h:0);
        return this;
    }
    Time setMinute(int m){
        hour =((m>=0 && h <60)?m:0);
        return this;
    }
    Time setSecond(int s){
        hour =((s>=0 && s <60)?h:0);
        return this;
    }
}