
    create sequence PBE_PROCEDIMENT_SEQ start 1 increment 1;
    create sequence PBE_UNITATORGANICA_SEQ start 1 increment 1;

    create table PBE_PROCEDIMENT (
       ID int8 not null,
        CODISIA varchar(8) not null,
        NOM varchar(50) not null,
        UNITATORGANICAID int8 not null,
        constraint PBE_PROCEDIMENT_PK primary key (ID)
    );

    create table PBE_UNITATORGANICA (
       ID int8 not null,
        CODIDIR3 varchar(9) not null,
        DATACREACIO date not null,
        ESTAT int4 not null,
        NOM varchar(50) not null,
        constraint PBE_UNITAT_PK primary key (ID)
    );

    create index PBE_PROCEDIMENT_PK_I on PBE_PROCEDIMENT (ID);
    create index PBE_PROCEDIMENT_CODISIA_UK_I on PBE_PROCEDIMENT (CODISIA);
    create index PBE_PROCEDIMENT_UNITAT_FK_I on PBE_PROCEDIMENT (UNITATORGANICAID);

    alter table PBE_PROCEDIMENT 
       add constraint PBE_PROCEDIMENT_CODISIA_UK unique (CODISIA);

    create index PBE_UNITAT_PK_I on PBE_UNITATORGANICA (ID);
    create index PBE_UNITAT_CODIDIR3_UK_I on PBE_UNITATORGANICA (CODIDIR3);

    alter table PBE_UNITATORGANICA 
       add constraint PBE_UNITAT_CODIDIR3_UK unique (CODIDIR3);

    alter table PBE_PROCEDIMENT 
       add constraint PBE_PROCEDIMENT_UNITAT_FK 
       foreign key (UNITATORGANICAID) 
       references PBE_UNITATORGANICA;
