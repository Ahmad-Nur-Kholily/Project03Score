package tebakangkascore;
import java.util.Random;
import java.util.Scanner;
public class TebakScore {
    int tebakan;
    int jawaban;
    int score=100;
    int coba=1;
    void guess(){
        Random x = new Random();
        this.jawaban = x.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.println(this.jawaban);
        do{
            System.out.println("Coba tebak : ");
            this.tebakan = input.nextInt();
            if (this.tebakan > this.jawaban){
                System.out.println("Tebakanmu lebih besar dari jawaban");
                this.score -= 2;
                System.out.println("Score kamu saat ini : "+ this.score);
            }else if (this.tebakan < this.jawaban){
                System.out.println("Tebakanmu lebih kecil dari jawaban");
                this.score -= 2;
                System.out.println("Score kamu saat ini : "+ this.score);
            }else{
                System.out.println("WAOW, tebakanmu benar!!!");
                System.out.println("Score akhir kamu : "+ this.score);
                if (this.coba <= 5 ){
                    this.score += 50;
                    System.out.println("Karena kamu dapat menebak angka tidak lebih dari 5 kali, \naku kasih bonus score 50 deh :D");
                    System.out.println("Jadi score akhir kamu : "+ this.score);
                }
            }this.coba +=1;
        }while (this.tebakan != this.jawaban);
    }
}