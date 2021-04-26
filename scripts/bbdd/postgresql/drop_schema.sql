
    alter table PBE_PROCEDIMENT 
       drop constraint PBE_PROCEDIMENT_UNITAT_FK;

    drop table if exists PBE_PROCEDIMENT cascade;

    drop table if exists PBE_UNITATORGANICA cascade;

    drop sequence if exists PBE_PROCEDIMENT_SEQ;

    drop sequence if exists PBE_UNITATORGANICA_SEQ;
