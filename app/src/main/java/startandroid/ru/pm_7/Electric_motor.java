package startandroid.ru.pm_7;

 class Electric_motor {

private String Descript;
private String posit;
private double pow;
private int row;
private int volt;
private double amper;
private String loc;
private String mark;
private String type;
private String mMethod;
private String fBearing;
private String sBearing;

 Electric_motor(String p,String d,double po, int r, int v, double a,String l,
                      String m,String t, String mm, String fb,String sb){

    Descript = d;
    posit = p;
    pow = po;
    row = r;
    volt = v;
    amper = a;
    loc = l;
    mark = m;
    type = t;
    mMethod = mm;
    fBearing = fb;
    sBearing = sb;
}
 String getDescript(){return Descript;}
 String getPosit(){return posit;}
 double getPow(){return pow;}
 int getRow(){return  row;}
 int getVolt(){return  volt;}
 double getAmper(){return  amper;}
 String getLoc(){return loc;}
 String getMark(){return mark;}
 String getType(){return type;}
 String getMethod(){return mMethod;}
 String getfBearing(){return  fBearing;}
 String getsBearing(){return  sBearing;}
}
