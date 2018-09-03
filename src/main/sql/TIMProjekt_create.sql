-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2018-08-30 14:39:03.59

-- tables
-- Table: Obiekty
CREATE TABLE Obiekty (
    IdObiektu   serial NOT NULL,
    NazwaObiektu varchar(50)  NOT NULL,
    CONSTRAINT Obiekty_ak_1 UNIQUE (IdObiektu) NOT DEFERRABLE  INITIALLY IMMEDIATE,
    CONSTRAINT Obiekty_pk PRIMARY KEY (IdObiektu)
);

CREATE UNIQUE INDEX Obiekty_idx_1 on Obiekty (IdObiektu ASC);

-- Table: StatusObiektow
CREATE TABLE StatusObiektow (
    IdStatusu  serial  NOT NULL,
    Status varchar(50)  NOT NULL,
    AktynoscOd timestamp  NOT NULL,
    AktywnoscDo timestamp  NOT NULL,
    Obiekty_IdObiektu int  NOT NULL,
    CONSTRAINT StatusObiektu_pk PRIMARY KEY (IdStatusu)
);

CREATE UNIQUE INDEX StatusObiektu_idx_1 on StatusObiektow (IdStatusu ASC);

-- foreign keys
-- Reference: StatusObiektu_Obiekty (table: StatusObiektu)
ALTER TABLE StatusObiektow ADD CONSTRAINT StatusObiektu_Obiekty
    FOREIGN KEY (Obiekty_IdObiektu)
    REFERENCES Obiekty (IdObiektu)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

