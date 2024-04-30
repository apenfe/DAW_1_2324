CREATE TABLE Alumnos (
    id_alumno INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    apellidos VARCHAR(50)
);

CREATE TABLE Modulos (
    id_modulo INT AUTO_INCREMENT PRIMARY KEY,
    nombre_modulo VARCHAR(50)
);

CREATE TABLE Modulos_Alumnos (
    id_alumno INT,
    id_modulo INT,
    FOREIGN KEY (id_alumno) REFERENCES Alumnos(id_alumno),
    FOREIGN KEY (id_modulo) REFERENCES Modulos(id_modulo)
);