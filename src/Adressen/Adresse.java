package Adressen;

public class Adresse
{
    private String uid;
    private int uid_nr;
    private String vorname;
    private String nachname;
    private String stadt;
    private String plz;
    private String strasse;
    private String hausnummer;
    private String telefon;
    private String email;

    public Adresse(String uid,
            int uid_nr,
            String vorname,
            String nachname,
            String stadt,
            String plz,
            String strasse,
            String hausnummer,
            String telefon,
            String email)
    {
        this.uid = uid;
        this.uid_nr = uid_nr;
        this.vorname = vorname;
        this.nachname = nachname;
        this.stadt = stadt;
        this.plz = plz;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.telefon = telefon;
        this.email = email;
    }
    
    public static Adresse new_empty()
    {
        return new Adresse("", 0, "", "", "", "", "", "", "", "");
    }

    public void setUid(String s)
    {
        uid = s;
    }

    public void setVorname(String s)
    {
        vorname = s;
    }

    public void setNachname(String s)
    {
        nachname = s;
    }

    public void setStadt(String s)
    {
        stadt = s;
    }

    public void setPLZ(String s)
    {
        plz = s;
    }

    public void setStrasse(String s)
    {
        strasse = s;
    }

    public void setHausnummer(String s)
    {
        hausnummer = s;
    }

    public void setTelefon(String s)
    {
        telefon = s;
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public String getUid()
    {
        return uid;
    }

    public int getUid_nr()
    {
        return uid_nr;
    }

    public String getVorname()
    {
        return vorname;
    }

    public String getNachname()
    {
        return nachname;
    }

    public String getStadt()
    {
        return stadt;
    }

    public String getPLZ()
    {
        return plz;
    }

    public String getStrasse()
    {
        return strasse;
    }

    public String getHausnummer()
    {
        return hausnummer;
    }

    public String getTelefon()
    {
        return telefon;
    }

    public String getEmail()
    {
        return email;
    }

    @Override
    public String toString()
    {
        return "uid: " + uid
                + " uid_nr: " + uid_nr
                + " vorname: " + vorname
                + " nachname: " + nachname
                + " stadt: " + stadt
                + " plz: " + plz
                + " strasse: " + strasse
                + " hausnummer: " + hausnummer
                + " telefon: " + telefon
                + " email: " + email;
    }
}
