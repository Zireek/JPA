CREATE TABLE jugadores
(
  id_jugadores integer NOT NULL PRIMARY KEY,
  nom character varying(30) NOT NULL,
  any_naixement character(4),
  nacionalitat character varying(12),
  equipo_juegan character varying(30) REFERENCES equipos(nombre_equipos)
);



CREATE TABLE equipos
(
  id_equipos serial NOT NULL PRIMARY KEY,
  nombre_equipos character varying(30) NOT NULL,
  ciudad character varying(30) NOT NULL,
  pais character varying(30) NOT NULL,
);

