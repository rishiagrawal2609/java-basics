package Lecture3;


class Hosteler{
    int money;

    public Hosteler(){
        this.money = 1000;
    }

    public void party(){
        this.money-=100;
    }

    public void partyRule(){
        if (this.money <100){
            System.out.println("Can not Party!");
        }else {
            System.out.println("Party party party");
            this.money-=100;
        }
    }

    public void loan(int amount, Hosteler provider){
        if (provider.money >= amount){
            provider.money-= amount;
            this.money+= amount;
        }else {
            System.out.println("Loan rejected- insufficient balance with provider");
        }
    }

}
public class HostelStory {
    public static void main(String[] args) {
        Hosteler neha = new Hosteler();
        System.out.println(neha.money);
        for (int i = 0; i < 10; i++) {
            //neha.party();
            neha.partyRule();
        }
        System.out.println(neha.money);

        Hosteler ganga = new Hosteler();
        System.out.println(ganga.money);
        for (int i = 0; i < 14; i++) {
            //ganga.party();
            ganga.partyRule();
        }
        System.out.println(ganga.money);
        Hosteler soumya = new Hosteler();
        System.out.println(soumya.money);
        Hosteler preet = new Hosteler();
        System.out.println(preet.money);
        neha.loan(500,soumya);
        System.out.println(neha.money);
        System.out.println(soumya.money);
    }
}
