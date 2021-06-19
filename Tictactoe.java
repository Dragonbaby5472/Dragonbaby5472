import java.util.*;
class Chess{//遊戲配件
    Scanner sc = new Scanner(System.in);
    public int n,w = 1;
    public String a = "   ",//預設為空格
                  b = "   ",
                  c = "   ",
                  d = "   ",
                  e = "   ",
                  f = "   ",
                  g = "   ",
                  h = "   ",
                  i = "   ",
                  in;
    void play(String p){//讀取輸入代號將空格改成OX
        switch(p){
            case "A":
            if(a=="   "){
                if(n%2==0){
                    a = " X ";
                }else {
                    a = " O ";
                }
            }
            else n--;
            break;
            case "B":
            if(b=="   "){
                if(n%2==0){
                    b = " X ";
                }else {
                    b = " O ";
                }
            }
            else n--;
            break;
            case "C":
            if(c=="   "){
                if(n%2==0){
                    c = " X ";
                }else {
                    c = " O ";
                }
            }
            else n--;
            break;
            case "D":
            if(d=="   "){
                if(n%2==0){
                    d = " X ";
                }else {
                    d = " O ";
                }
            }
            else n--;
            break;
            case "E":
            if(e=="   "){
                if(n%2==0){
                    e = " X ";
                }else {
                    e = " O ";
                }
            }
            else n--;
            break;
            case "F":
            if(f=="   "){
                if(n%2==0){
                    f = " X ";
                }else {
                    f = " O ";
                }
            }
            else n--;
            break;
            case "G":
            if(g=="   "){
                if(n%2==0){
                    g = " X ";
                }else {
                    g = " O ";
                }
            }
            else n--;
            break;
            case "H":
            if(h=="   "){
                if(n%2==0){
                    h = " X ";
                }else {
                    h = " O ";
                }
            }
            else n--;
            break;
            case "I":
            if(i=="   "){
                if(n%2==0){
                    i = " X ";
                }else {
                    i = " O ";
                }
            }
            else n--;
            break;
            default://例外
            System.out.println("請輸入大寫A~I");
            keyIn();
            play(in);
            break;
        }
    }
    void boardType(){//棋盤代號
        System.out.println("-------------");
        System.out.println("| A | B | C |");
        System.out.println("-------------");
        System.out.println("| D | E | F |");
        System.out.println("-------------");
        System.out.println("| G | H | I |");
        System.out.println("-------------");
        if(n==1) System.out.println("O先，請選擇欲下之位置");
        else if(n%2==1){
            System.out.println("輪到O，請選擇欲下之位置");
        }
        else if(n%2==0){
            System.out.println("輪到X，請選擇欲下之位置");
        }
    }
    void showBoard(){//展示棋盤
        System.out.println("-------------");
        System.out.println("|"+a+"|"+b+"|"+c+"|");
        System.out.println("-------------");
        System.out.println("|"+d+"|"+e+"|"+f+"|");
        System.out.println("-------------");
        System.out.println("|"+g+"|"+h+"|"+i+"|");
        System.out.println("-------------");
    }
    void win(){//判斷勝利條件
        if((a==" O "&b==" O "&c==" O ")||(d==" O "&e==" O "&f==" O ")||(g==" O "&h==" O "&i==" O ")||
           (a==" O "&d==" O "&g==" O ")||(b==" O "&e==" O "&h==" O ")||(c==" O "&f==" O "&i==" O ")||
           (a==" O "&e==" O "&i==" O ")||(c==" O "&e==" O "&g==" O ")){
               System.out.println("O勝利!!!");
               w = 0;
           }
        else if((a==" X "&b==" X "&c==" X ")||(d==" X "&e==" X "&f==" X ")||(g==" X "&h==" X "&i==" X ")||
                (a==" X "&d==" X "&g==" X ")||(b==" X "&e==" X "&h==" X ")||(c==" X "&f==" X "&i==" X ")||
                (a==" X "&e==" X "&i==" X ")||(c==" X "&e==" X "&g==" X ")){
                System.out.println("X勝利!!!");
                w = 0;
            }
    }
    void game(String q){//處理回合進行的方法
        play(q);
        showBoard();
        win();
    }
    void keyIn(){//讀取輸入
        in = sc.next();
    }
}
public class Tictactoe{
    public static void main(String[] args) {
        Chess u = new Chess();
        for(u.n=1;u.n<10;u.n++){
            u.boardType();
            u.keyIn();
            u.game(u.in);
            if(u.w == 0){
                break;
            }
        }
    }
}            
