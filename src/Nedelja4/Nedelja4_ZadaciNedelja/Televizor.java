package Nedelja4.Nedelja4_ZadaciNedelja;//1. U postojecu klasu Nedelja4_Vezbe.Nedelja4_ZadaciNedelja.Televizor dodati sledece metode:
//        Metodu promeniProgramNavise koja povecava vrednost atributa trenutniProgram za jedan.
//        Metodu promeniProgramNanize koja smanjuje vrednost atributa trenutniProgram za jedan.
//        Metodu vratiTrenutniProgram koja vraca vrednost atributa trenutniProgram.
//        Metodu vratiJacinuTona koja vraca trenutnu vrednost atributa jacinaTona.
//        Metodu daLiJeUkljucen koja vraca trenutnu vrednost atributa ukljucen.
//        Metodu ispisiParametre koja ispisuje na ekranu trenutne vrednosti svih
//        atributa televizora uz odgovarajucu poruku.


public class Televizor {
    int jacinaTona = 0;
    int trenutniProgram = 1;
    boolean ukljucen = false;
    void ukljuci(){
        ukljucen = true;
    }
    void iskljuci(){
        ukljucen = false;
    }
    void pojacajTon(){
        if (ukljucen) {jacinaTona = jacinaTona + 1;}
    }
    void smanjiTon(){
        if (ukljucen) {jacinaTona = jacinaTona - 1;}
    }
    void iskljuciTon(){
        jacinaTona = 0;
    }
    void promeniProgramNavise(){
        if (ukljucen) {trenutniProgram = trenutniProgram + 1;}
    }
    void promeniProgramNanize(){
        if (ukljucen) {trenutniProgram = trenutniProgram - 1;}
    }
    public int vratiTrenutniProgram(){
        return trenutniProgram;
    }
    public int vratiJacinuTona(){
        return jacinaTona;
    }
    public boolean daLiJeUkljucen(){
        return ukljucen;
    }
    public void ispisiParametre(){
        if (!ukljucen) {
            System.out.println("TV je iskljucen!");
        }
        else {
            System.out.println("TV je ukljucen");
            System.out.println("Trenutni program: " + vratiTrenutniProgram());
            System.out.println("Jacina zvuka: " + vratiJacinuTona());
        }
    }

}
