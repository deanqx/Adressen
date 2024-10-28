CREATE TABLE IF NOT EXISTS adressen (
    uid_nr INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    uid TEXT NOT NULL,
    vorname TEXT NOT NULL,
    nachname TEXT NOT NULL,
    stadt TEXT,
    plz TEXT,
    strasse TEXT,
    hausnummer TEXT,
    telefon TEXT,
    email TEXT
);
