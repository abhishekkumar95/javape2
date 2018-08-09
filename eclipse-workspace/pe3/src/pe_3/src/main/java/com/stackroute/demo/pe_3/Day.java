package com.stackroute.demo.pe_3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
public class Day
{
 public ArrayList<String> isDay()
 {
	ArrayList<String> str=new ArrayList<String>();
    Date d=new Date();
    Date d1=new Date(d.getTime()-3*(24*3600*1000));
    String pattern="E dd/MM/yyyy";
    SimpleDateFormat f=new SimpleDateFormat(pattern);
    String s1=f.format(d1);
    System.out.println(s1);
    Date d2=new Date(d.getTime()+3*(24*3600*1000));
    String s2=f.format(d2);
    System.out.println(s2);
    str.add(s1);
    str.add(s2);
    return str;
 }
}
