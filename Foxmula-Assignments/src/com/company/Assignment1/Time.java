package com.company.Assignment1;

public class Time {
    private int hour;
    private int minute;
    private int second;
    Time()
    {
        this.hour=0;
        this.minute=0;
        this.second=0;
    }
    Time(int hour,int minute,int second)
    {
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour()
    {
        return hour;
    }
    public int getMinute()
    {
        return minute;
    }
    public int getSecond()
    {
        return second;
    }
    public void setHour(int hour)
    {
        this.hour=hour;
    }
    public void setMinute(int minute)
    {
        this.minute=minute;
    }
    public void setSecond(int second)
    {
        this.second=second;
    }
    public void add(Time t)
    {
        System.out.println("Hours : " +(this.hour+t.getHour()));
        System.out.println("Minutes : "+(this.minute+t.getMinute()));
        System.out.println("Seconds : "+(this.second+t.getSecond()));
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hours : ").append(this.hour).append("\n");
//        sb.append("Minutes : ").append(this.minute).append("\n");
//        sb.append("Seconds : ").append(this.second).append("\n");
//        return sb.toString();
//    }

    public static void main(String args[])
    {
        Time obj1=new Time(8,32,12);
        Time obj2=new Time(1,1,1);
        obj1.add(obj2);
    }
}
