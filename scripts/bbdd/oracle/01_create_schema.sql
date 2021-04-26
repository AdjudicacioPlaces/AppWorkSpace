
    create sequence PBE_PROCEDIMENT_SEQ start with 1 increment by  1;
    create sequence PBE_UNITATORGANICA_SEQ start with 1 increment by  1;

    create table PBE_PROCEDIMENT (
        ID number(19,0) not null,
        CODISIA varchar2(8 char) not null,
        NOM varchar2(50 char) not null,
        UNITATORGANICAID number(19,0) not null
    );

    create table PBE_UNITATORGANICA (
        ID number(19,0) not null,
        CODIDIR3 varchar2(9 char) not null,
        DATACREACIO date not null,
        ESTAT number(10,0) not null,
        NOM varchar2(50 char) not null
    );

    create index PBE_PROCEDIMENT_PK_I on PBE_PROCEDIMENT (ID);
    create index PBE_PROCEDIMENT_CODISIA_UK_I on PBE_PROCEDIMENT (CODISIA);
    create index PBE_PROCEDIMENT_UNITAT_FK_I on PBE_PROCEDIMENT (UNITATORGANICAID);

    alter table PBE_PROCEDIMENT
        add constraint PBE_PROCEDIMENT_PK primary key (ID);

    alter table PBE_PROCEDIMENT
        add constraint PBE_PROCEDIMENT_CODISIA_UK unique (CODISIA);

    create index PBE_UNITAT_PK_I on PBE_UNITATORGANICA (ID);
    create index PBE_UNITAT_CODIDIR3_UK_I on PBE_UNITATORGANICA (CODIDIR3);

    alter table PBE_UNITATORGANICA
        add constraint PBE_UNITAT_PK primary key (ID);

    alter table PBE_UNITATORGANICA
        add constraint PBE_UNITAT_CODIDIR3_UK unique (CODIDIR3);

    alter table PBE_PROCEDIMENT
        add constraint PBE_PROCEDIMENT_UNITAT_FK
        foreign key (UNITATORGANICAID)
        references PBE_UNITATORGANICA;

    -- Grants per l'usuari www_projectebaseexemple
    -- seqüències
    GRANT SELECT, ALTER ON PBE_PROCEDIMENT_SEQ TO WWW_PROJECTEBASEEXEMPLE;
    GRANT SELECT, ALTER ON PBE_UNITATORGANICA_SEQ TO WWW_PROJECTEBASEEXEMPLE;
    -- taules
    GRANT SELECT, INSERT, UPDATE, DELETE ON PBE_PROCEDIMENT TO WWW_PROJECTEBASEEXEMPLE;
    GRANT SELECT, INSERT, UPDATE, DELETE ON PBE_UNITATORGANICA TO WWW_PROJECTEBASEEXEMPLE;


