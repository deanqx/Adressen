CREATE TABLE IF NOT EXISTS schueler (
    Nr INTEGER PRIMARY KEY,
    Name TEXT NOT NULL,
    Vorname TEXT,
    Geschlecht TEXT,
    GebDatum TEXT,
    Strasse TEXT,
    Hausnummer TEXT,
    Plz TEXT,
    Ort TEXT,
    NotTelefon TEXT,
    Telefon TEXT,
    Essen TEXT,
    Klasse TEXT
);
