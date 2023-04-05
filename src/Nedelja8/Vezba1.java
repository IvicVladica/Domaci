package Nedelja8;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Vezba1 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("email.txt"));
            writer.write("br-stenzel@arvinmeritor.info \n");
            writer.write("umek.mclau@progressenergyinc.info \n");
            writer.write("alde-candl@acusage.net \n");
            writer.write("sterl.alber@diaperstack.com \n");
            writer.write("morriso.hud@consolidated-farm-research.net \n");
            writer.write("polixene.sherrer@arvinmeritor.info \n");
            writer.write("grier.gro@diaperstack.com \n");
            writer.write("su.burns@acusage.net \n");
            writer.write("arvisou@progressenergyinc.info \n");
            writer.write("torme.arc@arketmay.com \n");
            writer.write("salimah-nor@arketmay.com \n");
            writer.write("pat.vict@autozone-inc.info \n");
            writer.write("koobran@consolidated-farm-research.net \n");
            writer.write("ha-di@egl-inc.info \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{
            BufferedReader reader = new BufferedReader(new FileReader("usernames.txt"));
            ArrayList<String> usernames = new ArrayList<>();
            String s;
            while((s = reader.readLine())!=null) {
                usernames.add(s);
            }
            reader.close();
            ArrayList<String> emails = new ArrayList<>();
            BufferedReader readEmail = new BufferedReader(new FileReader("email.txt"));
            String e;
            while((e = reader.readLine())!=null) {
                emails.add(e);
            }
            System.out.println("Email korisnika je: ");
          //  System.out.println(emails.get());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
