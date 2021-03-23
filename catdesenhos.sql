-- Database: catdesenhos

-- DROP DATABASE catdesenhos;

CREATE DATABASE catdesenhos
    WITH 
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'pt_PT.UTF-8'
    LC_CTYPE = 'pt_PT.UTF-8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
	
	-- Table: public.desenhos

-- DROP TABLE public.desenhos;

CREATE TABLE public.desenhos
(
    iddesenho integer NOT NULL DEFAULT nextval('desenhos_iddesenho_seq'::regclass),
    desenho text COLLATE pg_catalog."default",
    idautor integer,
    titulo character varying COLLATE pg_catalog."default" NOT NULL,
    observacoes character varying COLLATE pg_catalog."default",
    CONSTRAINT desenhos_pk PRIMARY KEY (iddesenho),
    CONSTRAINT desenhos_fk FOREIGN KEY (idautor)
        REFERENCES public.autor (idautor) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE public.desenhos
    OWNER to postgres;
	
	-- Table: public.autor

-- DROP TABLE public.autor;

CREATE TABLE public.autor
(
    idautor integer NOT NULL DEFAULT nextval('autor_idautor_seq'::regclass),
    nome text COLLATE pg_catalog."default",
    pass character varying COLLATE pg_catalog."default",
    CONSTRAINT autor_pk PRIMARY KEY (idautor)
)

TABLESPACE pg_default;

ALTER TABLE public.autor
    OWNER to postgres