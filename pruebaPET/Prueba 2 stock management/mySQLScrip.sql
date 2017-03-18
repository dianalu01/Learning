CREATE DATABASE stockdb;

use stockdb;

CREATE TABLE item
(
indexItem int primary key not null AUTO_INCREMENT,
idItem varchar(7) not null,
nameItem varchar(30),
descriptionItem varchar(100),
amountItem bigint
);

-- Insert values in item

INSERT INTO item (idItem,nameItem,descriptionItem,amountItem)
VALUES ("ART0001", "Detergente", "Detergente marca Ariel 200 gr",3);
INSERT INTO item (idItem,nameItem,descriptionItem,amountItem)
VALUES ("ART0002", "Comida Enlatada", "Atun 100 gr",4);
INSERT INTO item (idItem,nameItem,descriptionItem,amountItem)
VALUES ("ART0003", "Jabon", "Javon con aroma a eucalipto",5);
INSERT INTO item (idItem,nameItem,descriptionItem,amountItem)
VALUES ("ART0004", "Shampoo", "Shampoo Dove para cabello ondulado 200 ml",1);
INSERT INTO item (idItem,nameItem,descriptionItem,amountItem)
VALUES ("ART0005", "Gaseosa", "Gaseosa Fanta de 100 ml",6);
INSERT INTO item (idItem,nameItem,descriptionItem,amountItem)
VALUES ("ART0006", "Cereal", "Cereal de chocolare 100 gr",7);
INSERT INTO item (idItem,nameItem,descriptionItem,amountItem)
VALUES ("ART0007", "Arroz", "Arroz del Sur 100 gr",8);
INSERT INTO item (idItem,nameItem,descriptionItem,amountItem)
VALUES ("ART0008", "Avena", "Avena tres ositos 80 gr",4);
INSERT INTO item (idItem,nameItem,descriptionItem,amountItem)
VALUES ("ART0009", "Pan", "Pan de mantequilla",3);
INSERT INTO item (idItem,nameItem,descriptionItem,amountItem)
VALUES ("ART0010", "Mantequilla", "Sello de Oro 90 gr",1);

select * from item

