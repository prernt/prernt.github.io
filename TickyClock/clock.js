var date,h,m,s,clock,color;
var day,mon,yr,wkday;

function clocky(){
    date = new Date();
    day = date.getDate();
    mon = date.getMonth();
    yr = date.getFullYear();
    h = date.getHours();
    m = date.getMinutes();
    s = date.getSeconds();
    wkday = date.getDay();
    
    if(h <= 9)
        h = "0" + h;
    
    if(m <= 9)
        m = "0" + m;
    
    if(s <= 9)
        s = "0" + s;
    
    if(wkday == 1)
        wkday = "Mon";
    if(wkday == 2)
        wkday = "Tue";
    if(wkday == 3)
        wkday = "Wed";
    if(wkday == 4)
        wkday = "Thu";
    if(wkday == 5)
        wkday = "Fri";
    if(wkday == 6)
        wkday = "Sat";
    if(wkday == 0)
        wkday = "Sun";

    if(mon == 0)
        mon = "Jan";
    if(mon == 1)
        mon = "Feb";
    if(mon == 2)
        mon = "Mar";
    if(mon == 3)
        mon = "Apr";
    if(mon == 4)
        mon = "May";
    if(mon == 5)
        mon = "Jun";
    if(mon == 6)
        mon = "Jul";
    if(mon == 7)
        mon = "Aug";
    if(mon == 8)
        mon = "Sep";
    if(mon == 9)
        mon = "Oct";
    if(mon == 10)
        mon = "Nov";
    if(mon == 11)
        mon = "Dec";
    
    
    clock = h + ":" + m + ":" + s;
    d = day + " " + mon + "," + yr;
    color =h + m + s;
    
    document.getElementById("clock").innerHTML = clock;
    document.getElementById("day").innerHTML = "(" + wkday + ") " + d;
    document.body.style.background = "#" + color;
    setTimeout(clocky,1000);
    
}

clocky();