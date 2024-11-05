package Datenbank;

import Adressen.Adresse;
import java.sql.*;
import java.util.*;

public class DBverwaltung {

   DBZugriff db;

   public DBverwaltung(String datenbank) {
      db = new DBZugriff(datenbank);
   }

   /*
    public String speichern(Messwert einMesswert)
    {
        String sql="INSERT INTO messung (Datum,sensorName,wert) VALUES ('"
                + einMesswert.getDatum() +"', '"
                + einMesswert.getSensorName() +"', '"
                + einMesswert.getMesswert() +"');";
        // System.out.println(sql);
        return db.aendern(sql);
    }

    public String loeschen(Messwert einMesswert)
    {
        String sql ="DELETE FROM messung WHERE id = '"
                    + einMesswert.getMessID() + "';";
        return db.aendern(sql);
    }*/
 /*
    public String aendern(Buchverwaltung einBuchGeaendert)
    {
        String sql = "UPDATE Literaturverzeichnis SET "
                + "Titel = '" + einBuchGeaendert.getTitel() +"',"
                + "Autor = '" + einBuchGeaendert.getAutor() +"',"
                + "Genre = '" + einBuchGeaendert.getGenre() +"',"
                + "Verlag = '" + einBuchGeaendert.getVerlag() +"',"
                + "ISBN = '" + einBuchGeaendert.getIsbn() +"',"
                + "Barcode = '" + einBuchGeaendert.getBarcode() +"',"
                + "Lagerbestand = " + einBuchGeaendert.getLagerBestand() +","
                + "Preis = " + einBuchGeaendert.getPreis() +","
                + "Veroeffentlichung = '" + einBuchGeaendert.getVeroeffentlich() +"',"
                + "Sprache = '" + einBuchGeaendert.getSprache() +"',"
                + "Einkaufspreis = " + einBuchGeaendert.getEinkaufspreis() +","
                + "Buchform = '" + einBuchGeaendert.getBuchform() +"',"
                + "Buchbindungspreis = " + einBuchGeaendert.getBuchbindungspreis() +","
                + "Bild = '" + einBuchGeaendert.getBild() +"',"
                + "Lagerort = '" + einBuchGeaendert.getLagerOrt()
                + "' WHERE buchID = " + einBuchGeaendert.getBuchID() + ";";
        System.out.println(sql);
        return db.aendern(sql);
    }

    public ArrayList<Buchverwaltung> getAlleBuecher()
    {
        ArrayList<Buchverwaltung> buchliste = new ArrayList<Buchverwaltung>();
        try
        {
            ResultSet rs = db.lesen("Select * FROM Literaturverzeichnis;");
            while (rs.next())
            {
    */

 /*
                Buchverwaltung einBuch = new Buchverwaltung(rs.getInt("BuchID"),
                        rs.getString("Titel"),rs.getString("Autor"),rs.getString("Genre"),
                        rs.getString("Verlag"),rs.getString("ISBN"),rs.getString("Barcode"),
                        rs.getInt("Lagerbestand"),
                        rs.getDouble("Preis"),rs.getString("Veroeffentlichung"),
                        rs.getString("Sprache"),rs.getDouble("Einkaufspreis"),
                        rs.getString("Buchform"),rs.getDouble("Buchbindungspreis"),rs.getString("Bild"),
                        rs.getString("Lagerort"));
                buchliste.add(einBuch);
                // System.out.println(einBuch.toString());
            }

            return buchliste;
        } catch (SQLException e) {
            return null;
        }
    }

    public ArrayList<Buchformen> getAlleBuchformen()
    {
        ArrayList<Buchformen> buchformliste = new ArrayList<Buchformen>();
        try
        {
            ResultSet rs = db.lesen("Select * FROM buchformen;");
            while (rs.next())
            {
    */
 /*
                Buchformen eineBuchform = new Buchformen(rs.getInt("buchform_id"),
                        rs.getString("buchform"));
                buchformliste.add(eineBuchform);
                 System.out.println(eineBuchform.toString());
            }

            return buchformliste;
        } catch (SQLException e) {
            return null;
        }
    }
    */
 /*
    public String loescheSpieler(Spieler zuloeschenderSpieler)
    {
        String sql="DELETE FROM spieler WHERE id="+
                    zuloeschenderSpieler.getId()+";";
        System.out.println(sql);
        return db.aendern(sql);
    }


    public String speicherNeuenSpieler(Spieler einNeuerSpieler)
    {//INSERT INTO "main"."spieler" ("name","nickname") VALUES (?1,?2)
        String sql="INSERT INTO spieler (name,nickname) VALUES ('"
                + einNeuerSpieler.getName() + "','"
                + einNeuerSpieler.getNickname()+"');";
        System.out.println(sql);
        return db.aendern(sql);
    }
    */
 /*
    public ArrayList<Kunden> getAlleKundenDaten()
    {
        ArrayList<Kunden> kundenliste = new ArrayList<Kunden>();
        try
        {
            String sql = "SELECT * FROM Kunde;";
            System.out.println(sql);
            ResultSet rs = db.lesen(sql);
            while (rs.next())
            {
                //public Kunden(  int k_id, String vorname, String nachname, double einlage,
                //    double zinssatz)
                Kunden einKunde = new Kunden(   rs.getInt("kid"),
                                                 rs.getString("vorname"),
                                                 rs.getString("nachname"),
                                                 rs.getDouble("einlage"),
                                                 rs.getDouble("zinssatz")
                                           );
                kundenliste.add(einKunde);
                System.out.println(einKunde.toString());
            }

            return kundenliste;
        } catch (SQLException e) {
            return kundenliste;
        }

    } */
   /**
    * @return Alle adressen aus tbl_adressen
    * @throws java.sql.SQLException wenn das Lesen Fehlgeschlagen ist
    */
   public ArrayList<Adresse> getAlleAdressen() throws SQLException {
      ArrayList<Adresse> adressen = new ArrayList<>();

      String query = "SELECT * FROM tbl_adressen;";
      ResultSet rs = db.lesen(query);

      while (rs.next()) {
         Adresse adresse = new Adresse(
                 rs.getInt("uid_nr"),
                 rs.getString("uid"),
                 rs.getString("vorname"),
                 rs.getString("nachname"),
                 rs.getString("stadt"),
                 rs.getString("plz"),
                 rs.getString("strasse"),
                 rs.getString("hausnummer"),
                 rs.getString("telefon"),
                 rs.getString("email")
         );

         adressen.add(adresse);
      }

      return adressen;
   }
}
