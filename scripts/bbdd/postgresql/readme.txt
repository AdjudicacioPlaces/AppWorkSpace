Es recomana llevar permisos sobre l'schema public i crear-ne un amb el nom d'usuari:

    REVOKE CREATE ON SCHEMA public FROM PUBLIC;
    CREATE SCHEMA projectebaseexemple AUTHORIZATION projectebaseexemple;

Veure: https://www.postgresql.org/docs/10/ddl-schemas.html
