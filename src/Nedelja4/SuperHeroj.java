package Nedelja4;

public class SuperHeroj extends OsobaA {
    static {
        System.out.println("Osoba je super heroj");
    }
    String SuperMoc;
    String superHerojIme;
    SuperHeroj(String ime, String prezime, int godRodjenja, String zanimanje, String SuperMoc, String superHerojIme){
        super(ime, prezime, godRodjenja, zanimanje);
        this.SuperMoc = SuperMoc;
        this.superHerojIme= superHerojIme;
    }
    public String getSuperMoc() {return SuperMoc;}
    public String getSuperHerojIme() {return superHerojIme;}

    public void setSuperMoc(String superMoc) {this.SuperMoc = SuperMoc;}
    public void setSuperHerojIme(String superHerojIme) {this.superHerojIme = superHerojIme;}

    @Override
    public String toString() {
        return super.toString() + " " + getSuperMoc() + " " + getSuperHerojIme();
    }

}
