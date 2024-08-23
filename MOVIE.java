/*Progammed by:Rishav Bairagya
 *Class :X     Sec:'C'*/
import java.util.*;
public class MOVIE{
    //declaring all global variables
    static float price;
    static Scanner sc=new Scanner(System.in);
    static Scanner sc1=new Scanner(System.in);
    static String name,cod,ID,mo="",pswd="",dur="",sp="",svp="",gen="",da="",tim="",x3;
    static int c=0,j,w,y,z,i,x,x2,sn,svpn,cvv,a,sea=0,svpa=0,p,h;
    static String hm[]={"Manikarnika:The Queen of Jhansi","Total Dhamaal","Uri: The Surgical Strike","Kalank","Gully Boy","Student of the year 2","MS Dhoni:the untold story"};
    static String hcode[]={"ZYQA","JHGG","UTUY","CNHF","UTIR","JFDS","DJKD"};
    static int hsa[]={70,65,32,45,67,70,65};
    static int hvsa[]={15,12,07,15,8,15,5};
    static String hpn[]={"150","160","160","150","165","150","160"};
    static String hpvm[]={"350","360","360","350","365","150","160"};
    static String hdur[]={"2h 28m","2h 20m","2h 18m","2h 50m","2h 33m","150","160"};
    static String htime[]={"3:00","6:30","10:00","3:00","6:30","10:00","3:00"};
    static String day[]={"MON","TUE","WED","THUR","FRI","SAT","SUN"};
    static String bm[]={"Haami","Laathi","Mahalaya","Pather Pachali","Chader pahar","Gupi gaen Bhaga baen","Biday bomkesh"};
    static String bcode[]={"NTSY","USTY","VCHS","IYTI","HFSD","AGFD","NMEW"};
    static int bsa[]={76,75,59,76,75,59,76};
    static int bvsa[]={10,12,07,8,15,11,13};
    static String bdur[]={"2h 13m","2h 4m","1h 48m","2h 13m","2h 4m","1h 48m","2h 13m"};
    static String bpn[]={"100","110","110","100","110","110","100"};
    static String bpvm[]={"300","310","310","300","310","310","300"};
    static String btime[]={"6:30","10:00","3:00","6:30","10:00","3:00","6:30"};
    static String em[]={"Captain America:Civil War","Titanic","Toy Story 4","Avengers: Infinity War","Spider-Man:Far From Home","Avengers: Endgame","JOKER"};
    static String ecode[]={"RIRO","SNRI","RTIS","ARDI","BCVX","ASRI","SANI"};
    static int esa[]={55,63,68,32,25,10,40};
    static int evsa[]={15,15,7,15,8,5,11};
    static String edur[]={"3h 2m","1h 44m","1h 29m","3h 2m","1h 44m","1h 29m","3h 2m"};
    static String epn[]={"200","210","215","500","410","615","500"};
    static String epvm[]={"350","370","370","350","470","670","350"};
    static String etime[]={"10:00","3:00","6:30","10:00","3:00","6:30","10:00"};
    static char type,mop,yn;
    public static void main(String[] args){
        mainMovie();
    }
    public static void mainMovie(){//this is the main interface of the program where user can select various options
        MOVIE ob=new MOVIE();System.out.println("\f");ob.nl(4);
        ob.space(25);System.out.println("***************************************************************************************************************");
        ob.space(25);System.out.println("         _       _    _______   _    _   _______      _    _     ___     _     _  ______    _____  ");
        ob.space(25);System.out.println("        | |     | |  | ______| | |  | | |__   __|    | |  | |   |   |   | |   | | | ____|  | ____| ");
        ob.space(25);System.out.println("        | |     | | | |        | |  | |    | |       | |__| |  |  _  |  | |   | | | |____  ||__    ");
        ob.space(25);System.out.println("        | |     | | | |    __  |  __  |    | |       |  __  | |  | |  | | |   | | |____  | | __|   ");
        ob.space(25);System.out.println("        | |     | | | |   |_ | | |  | |    | |       | |  | | |  |_|  | | |   | |      | | ||      ");
        ob.space(25);System.out.println("        | |___  | |  | |____|| | |  | |    | |       | |  | |  |     |  \\  \\_/  /  ____| | ||___   ");    
        ob.space(25);System.out.println("        |_____| |_|   |______| |_|  |_|    |_|       |_|  |_|   |___|    \\_____/  |______| |_____| ");
        ob.space(25);System.out.println("****************************************************************************************************************");
        ob.space(25);System.out.println();
        ob.space(25);System.out.println("                                       1...ABOUT US");
        ob.space(25);System.out.println("                                       2...MOVIE DETAILS");
        ob.space(25);System.out.println("                                       3...TICKET BOOKING");
        ob.space(25);System.out.println("                                       4...EXIT");
        ob.space(25);System.out.print("                                         enter your choice:");
        x=sc.nextInt();
        switch(x){//this switch() can access the 4 options selected by user
            case 1:
            ob.aboutus();break;
            case 2:
            ob.genere();break;
            case 3:
            ob.booking();break;
            case 4:
            ob.exit();break;
            default:
            ob.mainMovie();break;}
    }
    public void aboutus(){//user can know few details about the program
        System.out.println("\f");nl(3);
        space(30);System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@**********About us**********@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        space(30);System.out.println("@   This Lighthouse movie hall is very prestigious cinema hall since 1970's, here you can feel every movie   @");
        space(30);System.out.println("@   you watch real and our owner,Rishav Bairagya is still developing this hall to make it better             @");
        space(30);System.out.println("@                                                                                                            @");
        space(30);System.out.println("@   This website helps you to book tickets and also know movie details,for better help of our customers      @");
        space(30);System.out.println("@   for more details contact helpline +91 9477455599(helpline available 7pm to 9pm,!Saturday closed!         @");
        space(30);System.out.println("@   programmer :Rishav Bairagya                                                                              @");
        space(30);System.out.println("@   class :'X'                                                                                               @");
        space(30);System.out.println("@   sec   :'C'                                                                                               @");
        space(30);System.out.println("@   roll  : 18                                                                                               @");
        space(30);System.out.println("@   School:Assembly of angels                                                                                @");
        space(30);System.out.println("@                                         press enter to continue                                           @");
        space(30);System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        x3=sc1.nextLine();mainMovie();
    }
    public void genere(){//user can select the desired genere of the film
        System.out.println("\f");nl(3);
        space(30);System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        space(30);System.out.println("@                                     Enter film genere:                                               @");
        space(30);System.out.println("@                                          1.HINDI                                                     @");
        space(30);System.out.println("@                                         2.BENGALI                                                    @");
        space(30);System.out.println("@                                         3.ENGLISH                                                    @");
        space(30);System.out.println("@                      *USE THE PROVIDED CODE IN THE LIST TO BOOK TICKETS*                             @");
        space(30);System.out.println("@                                  PRESS 4 TO GO BACK TO MENU                                          @");
        space(30);System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        space(30);System.out.print("=>>>ENTER CHOICE :");x2=sc.nextInt();
        switch(x2){//this switch can access three display options
            case 1:
            hindi();break;
            case 2:
            bengali();break;
            case 3:
            english();break;
            case 4:
            mainMovie();break;
            default:
            genere();break;
        }
    }
    public void hindi(){//this displays the *Hindi* films showing in this week
        System.out.println("\f");nl(3);
        space(30);System.out.println("**HINDI**                                                        SEATS AVAILABLE:");
        space(30);System.out.println("NAME                         \t\tDAY\tTIMINGS\t\tNORMAL\tV.I.P\t\tCODE");
        space(30);System.out.println("__________________________________________________________________________________________________");
        for(i=0;i<7;i++){
            space(30);System.out.print(hm[i]);space(hm[i]);System.out.print("\t\t"+day[i]+"\t"+htime[i]+"\t\t"+hsa[i]+"\t"+hvsa[i]+"\t\t"+hcode[i]);System.out.println();}
        nl(1);space(30);System.out.println("                                   press any key to continue");
        x3=sc1.nextLine(); genere();}
    public void bengali(){//this displays the *Bengali* films showing in this week
        System.out.println("\f");nl(3);
        space(30);System.out.println("**BENGALI**                                                      SEATS AVAILABLE:");
        space(30);System.out.println("NAME                         \t\tDAY\tTIMINGS\t\tNORMAL\tV.I.P\t\tCODE");
        space(30);System.out.println("__________________________________________________________________________________________________");
        for(i=0;i<7;i++){
            space(30);System.out.print(bm[i]);space(bm[i]);System.out.print("\t\t"+day[i]+"\t"+btime[i]+"\t\t"+bsa[i]+"\t"+bvsa[i]+"\t\t"+bcode[i]);System.out.println();}
        nl(1);space(30);System.out.println("                                   press any key to continue");
        x3=sc1.nextLine(); genere();}
    public void english(){//this displays the *English* films showing in this week
        System.out.println("\f");nl(3);
        space(30);System.out.println("**ENGLISH**                                                      SEATS AVAILABLE:");
        space(30);System.out.println("NAME                         \t\tDAY\tTIMINGS\t\tNORMAL\tV.I.P\t\tCODE");
        space(30);System.out.println("__________________________________________________________________________________________________");
        for(i=0;i<7;i++){
            space(30);System.out.print(em[i]);space(em[i]);System.out.print("\t\t"+day[i]+"\t"+etime[i]+"\t\t"+esa[i]+"\t"+evsa[i]+"\t\t"+ecode[i]);System.out.println();}
        nl(1);space(30);System.out.println("                                   press any key to continue");
        x3=sc1.nextLine(); genere();}
    public void booking(){//from this function user can book tickets
        System.out.println("\f");space(30);System.out.println("****TICKET BOOKING ***************************");
        space(30);System.out.println("****for selecting type option enter the letter in the bracket( )");
        space(30);System.out.print("Enter movie code:");cod=sc1.nextLine();
        check(cod);nl(1);
        space(30);System.out.println("Flim :"+mo);
        sc.nextLine();//shows details of film
        space(30);System.out.println("Seat price normal:"+sp+"\tSeats availabe :"+sea);
        space(30);System.out.println("Seat price V.I.P:"+svp+"\tSeats availabe :"+svpa);
        space(30);System.out.println("Days available :"+da+" ....Timings :"+tim);
        nl(1);space(30);System.out.print("Do you want to continue booking enter (y/n):");
        yn=sc.next().charAt(0);
        if(yn=='n')
        mainMovie();
        else if(yn!='y' && yn!='n')
        {
            nl(1);space(30);System.out.print("PRESS \"Y\" TO CONTINUE BOOKING OR \"N\" TO EXIT BOOKING:");
            yn=sc.next().charAt(0);
            if(yn=='n')
            mainMovie();
            else if(yn!='y' && yn!='n')
            booking();
        }
        nl(1);space(30);System.out.print("Enter your name:");name=sc1.nextLine();
        space(30);System.out.print("Enter seat type(vip(v)/normal(n)):");type=sc1.next().charAt(0);
        if(type=='v'|| type=='V')
        {space(30);System.out.print("Enter no. of seats:");svpn=sc.nextInt();check(svpn,1);}
        else if(type=='n'|| type=='N')
        {space(30);System.out.print("Enter no. of seats:");sn=sc.nextInt();check(sn,2);}
        else{
            nl(1);
            sc1.nextLine();space(30);System.out.println("PLEASE ENTER \"V\" FOR V.I.P BOOKING OR \"N\" FOR NORMAL BOOKING");
            space(30);System.out.println("press any key to continue");
            x3=sc1.nextLine();booking();}
        space(30);System.out.print("Enter mode of payment(credit(c)/debit(d)/net banking(n)):");mop=sc1.next().charAt(0);
        if(mop=='c'|| mop=='C'|| mop=='d'|| mop=='D'){//check any sort of error input
            sc1.nextLine();
            space(30);System.out.print("Enter card holder name:");
            ID=sc1.nextLine();
            space(30);System.out.print("Enter serial no.:");
            pswd=sc1.nextLine();
            space(30);System.out.print("Enter cvv no.:");
            cvv=sc.nextInt();
            ticket(type);}
        else if(mop=='n' || mop=='N'){//check any sort of error input
            sc1.nextLine();
            space(30);System.out.print("Enter User I.D:");
            ID=sc1.nextLine();
            space(30);System.out.print("Enter password:");
            pswd=sc1.nextLine();
            ticket(type);}
        else{
            sc1.nextLine();nl(1);
            space(30);sc.nextLine();System.out.println("PLEASE ENTER \"C\" FOR CREDIT CARD OR \"D\" FOR DEBIT CARD OR \"N\" FOR NET BANKING");
            if(h==1)
            {
                for(j=1;j<=3;j++){
                    if(j==a && j==1)
                    hvsa[p]+=svpn;
                    if(j==a && j==2)
                    bvsa[p]+=svpn;
                    if(j==a && j==3)
                    evsa[p]+=svpn;
                }    
            }
            else if(h==2)
            {
                for(j=1;j<=3;j++){
                    if(j==a && j==1)
                    hsa[p]+=sn;
                    if(j==a && j==2)
                    bsa[p]+=sn;
                    if(j==a && j==3)
                    esa[p]+=sn;
                }
            }
            space(30);System.out.println("press any key to continue");x3=sc1.nextLine();booking();
        }
    }
    public void ticket(char type){//displays the details in ticket manner
        if(type=='v' || type=='V')price=Float.parseFloat(svp); else price=Float.parseFloat(sp);//converts the price of vip and normal seats to int from string
        if(h==1)price=svpn*(price+(24/100.0f)*price);else if(h==2)price=sn*(price+(24/100.0f)*price);
        System.out.println("\f");nl(2);  
        space(10);System.out.println("TICKET______________________________________________________________________________________________________________");        
        space(10);System.out.println("NAME                         \tMOVIE                         TIMINGS\tDURATION\tDAY\tNO OF SEATS ");
        space(10);System.out.println("____________________________________________________________________________________________________________________");
        space(10);System.out.print(name);space(name);System.out.print(mo);space(mo);System.out.print(tim+"\t"+dur+"\t\t"+da+"\t\t");if(h==1)System.out.print(svpn);else if(h==2)System.out.print(sn);nl(1);
        if(price>=1000 && price<=9999)
        {space(10);System.out.println("PRICE Incl. GST(24%):Rs."+(int)price/1000+","+(int)price%1000+Float.toString(price).substring(Float.toString(price).lastIndexOf('.')));}
        else
        {space(10);System.out.println("PRICE Incl. GST(24%):Rs."+price);}
        space(10);System.out.println("____________________________________________________________________________________________________________________");
        space(10);System.out.println("                                 press any key to continue");
        x3=sc1.nextLine(); mainMovie();}
    public void exit(){//displays exit message
        System.out.println("\f");nl(2);
        space(60);System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        space(60);System.out.println("@                  ___   __     __  _____        ______      @");
        space(60);System.out.println("@                 | _ \\  \\ \\   / / |  ___|      |      |     @");
        space(60);System.out.println("@                 ||_\\ \\  \\ \\ / /  | |         |        |    @");
        space(60);System.out.println("@                 |    /   \\   /   | |__      |  /\\  /\\  |   @");
        space(60);System.out.println("@                 | __ \\    | |    |  __|     |          |   @");
        space(60);System.out.println("@                 ||  \\ \\   | |    | |         |  \\__/  |    @");
        space(60);System.out.println("@                 ||__/ /   | |    | |___       |______|     @");
        space(60);System.out.println("@                 |____/    |_|    |_____|                   @");
        space(60);System.out.println("@                                                            @");
        space(60);System.out.println("@       _______   _    _      ___     _      _   _    _      @");
        space(60);System.out.println("@      |__   __| | |  | |    / _ \\   |  \\   | | | | / /      @");
        space(60);System.out.println("@         | |    | |  | |   / / \\ \\  |   \\  | | | |/ /       @");
        space(60);System.out.println("@         | |    | |__| |  | /   \\ | | |\\ \\ | | |   /        @");
        space(60);System.out.println("@         | |    |  __  |  | |___| | | | \\ \\| | |   \\        @");
        space(60);System.out.println("@         | |    | |  | |  |  ___  | | |  \\   | | |\\ \\       @");
        space(60);System.out.println("@         | |    | |  | |  | |   | | | |   \\  | | | \\ \\      @");
        space(60);System.out.println("@         |_|    |_|  |_|  |_|   |_| |_|    \\_| |_|  \\_\\     @");
        space(60);System.out.println("@                                                            @");
        space(60);System.out.println("@                 _      _     __     _     _                @");
        space(60);System.out.println("@                 \\ \\   / /   |  |   | |   | |               @");
        space(60);System.out.println("@                  \\ \\ / /   | __ |  | |   | |               @");
        space(60);System.out.println("@                   \\   /   | |  | | | |   | |               @");
        space(60);System.out.println("@                    | |    | |  | | | |   | |               @");
        space(60);System.out.println("@                    | |    | |__| | | |   | |               @");
        space(60);System.out.println("@                    | |     |    |   \\ \\_/ /                @");
        space(60);System.out.println("@                    |_|      |__|     \\___/                 @");
        space(60);System.out.println("@                                                            @");
        space(60);System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        space(10);System.out.println("                                                                   *****PRESS ENTER TO EXIT*****");
        x3=sc1.nextLine();System.exit(1);}
    public void space(String s){//calculates the length of the string passed and prints suitable spaces after that string
        int xx=31,xy;xy=xx-s.length();
        for(int j=0;j<xy;j++)
            System.out.print(" ");}
    public void check(String s){/*checks the movie code and store its details*/a=0;
        for(i=0;i<7;i++){
            if(hcode[i].equalsIgnoreCase(s)){
                if(a==0){a=1;p=i;}}
            if(bcode[i].equalsIgnoreCase(s)){
                if(a==0){a=2;p=i;}}
            if(ecode[i].equalsIgnoreCase(s)){
                if(a==0){a=3;p=i;}}}
        if(a==1){
            mo=hm[p];dur=hdur[p];sea=hsa[p];svpa=hvsa[p];sp=hpn[p];svp=hpvm[p];tim=htime[p];da=day[p];}
        else if(a==2){
            mo=bm[p];dur=bdur[p];sea=bsa[p];svpa=bvsa[p];sp=bpn[p];svp=bpvm[p];tim=btime[p];da=day[p];}
        else if(a==3){
            mo=em[p];dur=edur[p];sea=esa[p];svpa=evsa[p];sp=epn[p];svp=epvm[p];tim=etime[p];da=day[p];}
        if(a==0){
            nl(1);space(30);System.out.println("PLEASE ENTER CORRECT MOVIE CODE(CHECK THE DETAILS HUB FOR CODE)");
            space(30);System.out.println("press any key to continue");
            x3=sc1.nextLine();mainMovie();}
    }
    public void check(int seat,int g)/*checks seat availablity*/{
        h=g;if(h==1){
            if(svpa-seat<0){
                nl(1);sc1.nextLine();space(30);System.out.println("SORRY only "+svpa+" SEATS AVAILABE");space(30);System.out.println("PLEASE RE-ENTER DETAILS");
                space(30);System.out.print("press any key to continue");
                x3=sc1.nextLine();i=0;cod="";c=0; booking();}                  
            else{
                for(j=1;j<=3;j++){
                    if(j==a && j==1)
                    hvsa[p]-=svpn;
                    if(j==a && j==2)
                    bvsa[p]-=svpn;
                    if(j==a && j==3)
                    evsa[p]-=svpn;}}}
        else if(h==2){
            if(sea-seat<0){
                nl(1);sc1.nextLine();space(30);System.out.println("SORRY only "+sea+" SEATS AVAILABE");space(30);System.out.println("PLEASE RE-ENTER DETAILS");
                space(30);System.out.println("press any key to continue");
                x3=sc1.nextLine();i=0;cod="";c=0; booking();}                  
            else{
                for(j=1;j<=3;j++){
                    if(j==a && j==1)
                    hsa[p]-=sn;
                    if(j==a && j==2)
                    bsa[p]-=sn;
                    if(j==a && j==3)
                    esa[p]-=sn;}}}
    }    
    public void space(int b){//prints number of spaces side by side
        for(int xyx=1;xyx<=b;xyx++)
        System.out.print(" ");}
    public void nl(int b){//prints a number of new line
        for(int xyx=1;xyx<=b;xyx++)
        System.out.println();}
}