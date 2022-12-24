DROP database travel_agency;
CREATE DATABASE travel_agency;

USE travel_agency;

CREATE TABLE branch(
    br_code INT(11) NOT NULL AUTO_INCREMENT,
    br_street VARCHAR(30) DEFAULT 'UNKNOWN' NOT NULL,
    br_num INT(4) NOT NULL,
    br_city VARCHAR(30) DEFAULT 'UNKNOWN' NOT NULL,
    PRIMARY KEY(br_code)
);

INSERT INTO branch VALUES
(null, 'Karaiskaki', 13, 'Patra'),
(null, 'Kanakari', 10, 'Patra'),
(null, 'Korinthou', 27, 'Patra'),
(null, 'Zaimi', 30, 'Patra'),
(null, 'Maizonos', 115, 'Patra'),
(null, 'Gounari', 86, 'Patra'),
(null, 'Panourgia', 54, 'Patra'),
(null, 'Aretha', 57, 'Patra'),
(null, 'Ag. Nikolaou', 73, 'Patra'),
(null, 'Kolokotroni', 163, 'Patra');

CREATE TABLE phones(
    ph_br_code INT(11) NOT NULL,
    ph_number CHAR(10) NOT NULL,
    PRIMARY KEY(ph_br_code, ph_number),
    CONSTRAINT phones1 FOREIGN KEY (ph_br_code) REFERENCES branch(br_code)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO phones VALUES
(1, '1234567890'),
(2, '2345678901'),
(3, '3456789012'),
(4, '4567890123'),
(5, '5678901234'),
(6, '6789012345'),
(7, '7890123456'),
(8, '8901234567'),
(9, '9012345678'),
(10, '0123456789');

CREATE TABLE worker(
    wrk_AT CHAR(10) NOT NULL,
    wrk_name VARCHAR(20) DEFAULT 'UNKNOWN' NOT NULL,
    wrk_lname VARCHAR(20) DEFAULT 'UNKNOWN' NOT NULL,
    wrk_salary FLOAT(7,2) NOT NULL,
    wrk_br_code INT(11) NOT NULL,
    PRIMARY KEY(wrk_AT),
    CONSTRAINT worker1 FOREIGN KEY(wrk_br_code) REFERENCES branch(br_code)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO worker VALUES
('WorkerID01', 'Petros', 'Giorgos', 568.1, 1),
('WorkerID02', 'Mario', 'Luigi', 874.7, 2),
('WorkerID03', 'Andreas', 'Oikonomou', 1233.2, 3),
('WorkerID04', 'Ektoras', 'Samouil', 820.6, 4),
('WorkerID05', 'Konstantinos', 'Kostantinou', 889.1, 5),
('WorkerID06', 'Iasonas', 'Pavlopoulos', 2776.2, 6),
('WorkerID07', 'Andreas', 'Andreadis', 1500.32, 7),
('WorkerID08', 'Meletios', 'Polidouris', 1222.44, 8),
('WorkerID09', 'Loukas', 'Ramakis', 1000.1, 9),
('WorkerID10', 'Axilleas', 'Patroklos', 1022.3, 10),
('WorkerID11', 'Roumpini', 'Aggoura', 2620.7, 1),
('WorkerID12', 'Maria', 'Louloudi', 433.5, 2),
('WorkerID13', 'Prigkipissa', 'Vasilissa', 655.2, 3),
('WorkerID14', 'Katerina', 'Papaflessa', 836.44, 4),
('WorkerID15', 'Eleni', 'Oikonomakou', 988.2, 5),
('WorkerID16', 'Maritini', 'Petroula', 2500.21, 5),
('WorkerID17', 'Sevi', 'Papadopoulou', 547.2, 6),
('WorkerID18', 'Vasiliki', 'Malama', 766.5, 8),
('WorkerID19', 'Danae', 'Kathariou', 1923.9, 7),
('WorkerID20', 'Anastasia', 'Petropoulou', 957.2, 1),
('WorkerID21', 'Paris', 'Pettas', 1120.1, 9),
('WorkerID22', 'Dimitris', 'Petreas', 1200.3, 10),
('WorkerID23', 'Efi', 'Persikou', 942.3, 3),
('WorkerID24', 'Davon', 'Sampson', 977.53, 4),
('WorkerID25', 'Declan', 'Kelly', 1024.82, 5),
('WorkerID26', 'Donavan', 'Osborn', 845.9, 6),
('WorkerID27', 'Rashad', 'Noble', 1230.23, 7),
('WorkerID28', 'Eleni', 'Papadaki', 1422.61, 1),
('WorkerID29', 'Dionissis', 'Trivizas', 873.21, 2),
('WorkerID30', 'Xristos', 'Petropoulos', 965.22, 3),
('WorkerID31', 'Xaralampos', 'Xristidis', 743.1, 9),
('WorkerID32', 'Andreas', 'Protopsaltis', 1247.91, 8),
('WorkerID33', 'Aggeliki', 'Reka', 998.91, 10),
('WorkerID34', 'Zaxarias', 'Michalainas', 1123.9, 7),
('WorkerID35', 'Maria', 'Neokosmidi', 1273.85, 10);

CREATE TABLE driver(
    drv_AT CHAR(10) NOT NULL,
    drv_license ENUM('A', 'B', 'C', 'D') NOT NULL,
    drv_route ENUM('LOCAL', 'ABROAD') NOT NULL,
    drv_experience TINYINT(4) NOT NULL,
    PRIMARY KEY(drv_AT), 
    CONSTRAINT driver1 FOREIGN KEY(drv_AT) REFERENCES worker(wrk_AT)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO driver VALUES
('WorkerID28', 'C', 'LOCAL', 12),
('WorkerID12', 'B', 'LOCAL', 11),
('WorkerID25', 'C', 'ABROAD', 28),
('WorkerID07', 'D', 'LOCAL', 43),
('WorkerID13', 'A', 'LOCAL', 1),
('WorkerID26', 'B', 'ABROAD', 2),
('WorkerID04', 'C', 'ABROAD', 7),
('WorkerID32', 'D', 'ABROAD', 32),
('WorkerID09', 'C', 'LOCAL', 15),
('WorkerID10', 'D', 'LOCAL', 23);

CREATE TABLE admin(
    adm_AT CHAR(10) NOT NULL,
    adm_type ENUM('LOGISTICS', 'ADMINISTRATIVE', 'ACCOUNTING') NOT NULL,
    adm_diploma VARCHAR(200) DEFAULT 'UNKNOWN' NOT NULL,
    PRIMARY KEY(adm_AT),
    CONSTRAINT admin1 FOREIGN KEY(adm_AT) REFERENCES worker(wrk_AT)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO admin VALUES
('WorkerID20', 'LOGISTICS', 'Logistics Diploma'),
('WorkerID05', 'LOGISTICS', 'Economics Diploma'),
('WorkerID23', 'ACCOUNTING', 'Mathematical Engineer Diploma Diploma'),
('WorkerID34', 'LOGISTICS', 'Logistics Diploma'),
('WorkerID35', 'ACCOUNTING', 'Economics Diploma'),
('WorkerID11', 'ADMINISTRATIVE', 'Computer Engineer Diploma'),
('WorkerID02', 'ADMINISTRATIVE', 'Mechanical Engineer Diploma'),
('WorkerID03', 'ADMINISTRATIVE', 'Chemical Engineer Diploma'),
('WorkerID24', 'ADMINISTRATIVE', 'Chemical Engineer Diploma'),
('WorkerID16', 'ADMINISTRATIVE', 'Buisness Managment Diploma'),
('WorkerID19', 'ADMINISTRATIVE', 'Mathematical Engineer Diploma'),
('WorkerID08', 'ADMINISTRATIVE', 'Chemical Engineer Diploma'),
('WorkerID06', 'ADMINISTRATIVE', 'Computer Engineer Diploma'),
('WorkerID21', 'ADMINISTRATIVE', 'Buisness Management Diploma'),
('WorkerID22', 'ADMINISTRATIVE', 'Computer Engineer Diploma');

CREATE TABLE manages(
    mng_adm_AT CHAR(10) NOT NULL,
    mng_br_code INT(11) NOT NULL,
    PRIMARY KEY(mng_adm_AT,mng_br_code),
    CONSTRAINT manages1 FOREIGN KEY (mng_adm_AT) REFERENCES admin(adm_AT)
    ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT manages2 FOREIGN KEY (mng_br_code) REFERENCES branch(br_code)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO manages VALUES
('WorkerID20', 1),
('WorkerID05', 5),
('WorkerID23', 3),
('WorkerID34', 7),
('WorkerID35', 10),
('WorkerID11', 1),
('WorkerID02', 2),
('WorkerID03', 3),
('WorkerID24', 4),
('WorkerID16', 5),
('WorkerID19', 7),
('WorkerID08', 8),
('WorkerID06', 6),
('WorkerID21', 9),
('WorkerID22', 10);

CREATE TABLE guide(
    gui_AT CHAR(10) NOT NULL,
    gui_cv TEXT,
    PRIMARY KEY(gui_AT),
    CONSTRAINT guide1 FOREIGN KEY (gui_AT) REFERENCES worker(wrk_AT)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO guide VALUES
('WorkerID01', 'Worked as a guide at the Acropolis site for 10 years'),
('WorkerID14', 'Worked as a guide at the Santorini island for 5 years'),
('WorkerID15', 'Worked as a guide at the Mykonos island for 7 years'),
('WorkerID17', 'Worked as a guide at the Acropolis site for 5 years'),
('WorkerID18', 'Worked as a guide at the Monemvasia castle for 20 years'),
('WorkerID27', 'Worked as a guide at the Acropolis site for 15 years'),
('WorkerID29', 'Worked as a guide at the Acropolis site for 1 year'),
('WorkerID30', 'Worked as a guide at the Acropolis site for 1 year'),
('WorkerID31', 'Worked as a guide at the Acropolis site for 1 year'),
('WorkerID33', 'Worked as a guide at the Acropolis site for 1 year');

CREATE TABLE languages(
    lng_gui_AT CHAR(10) NOT NULL,
    lng_language VARCHAR(30) DEFAULT 'Uknown' NOT NULL,
    PRIMARY KEY(lng_language, lng_gui_AT),
    CONSTRAINT languages1 FOREIGN KEY (lng_gui_AT) REFERENCES guide(gui_AT)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO languages VALUES
('WorkerID01', 'English'),
('WorkerID01', 'Greek'),
('WorkerID14', 'English'),
('WorkerID14', 'Greek'),
('WorkerID15', 'English'),
('WorkerID15', 'Greek'),
('WorkerID17', 'English'),
('WorkerID17', 'Greek'),
('WorkerID18', 'English'),
('WorkerID18', 'Greek'),
('WorkerID27', 'English'),
('WorkerID27', 'Spanish'),
('WorkerID27', 'French'),
('WorkerID29', 'English'),
('WorkerID29', 'Greek'),
('WorkerID30', 'English'),
('WorkerID30', 'Greek'),
('WorkerID30', 'Italian'),
('WorkerID30', 'German'),
('WorkerID31', 'English'),
('WorkerID31', 'Greek'),
('WorkerID33', 'English'),
('WorkerID33', 'Greek'),
('WorkerID33', 'Spanish'),
('WorkerID33', 'French');

CREATE TABLE trip(
    tr_id INT(11) NOT NULL AUTO_INCREMENT,
    tr_departure DATETIME,
    tr_return DATETIME,
    tr_maxseats TINYINT(4),
    tr_cost FLOAT(7,2),
    tr_br_code INT(11) NOT NULL,
    tr_gui_AT CHAR (10),
    tr_drv_AT CHAR (10),
    PRIMARY KEY(tr_id),
    CONSTRAINT trip1 FOREIGN KEY (tr_br_code) REFERENCES branch(br_code)
    ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT trip2 FOREIGN KEY (tr_drv_AT) REFERENCES driver(drv_AT)
    ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT trip3 FOREIGN KEY (tr_gui_AT) REFERENCES guide(gui_AT)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO trip VALUES 
(null, '2023-01-29 11:00:00', '2023-02-08 18:00:00', 20, 1023.11, 1, 'WorkerID01', 'WorkerID28'),
(null, '2023-11-25 10:30:00', '2023-11-30 17:30:00', 5, 361.21, 2, 'WorkerID29', 'WorkerID12'),
(null, '2023-10-12 11:00:00', '2023-10-16 18:30:00', 15, 451.76, 7, 'WorkerID27', 'WorkerID07'),
(null, '2023-06-03 12:30:00', '2023-06-15 16:00:00', 6, 842.54, 4, 'WorkerID14', 'WorkerID04'),
(null, '2023-05-09 11:30:00', '2023-05-20 17:30:00', 9, 822,97, 10, 'WorkerID33', 'WorkerID10'),
(null, '2023-08-13 11:30:00', '2023-08-23 18:00:00', 50, 677.91, 6, 'WorkerID17', 'WorkerID26'),
(null, '2023-09-12 12:30:00', '2023-09-17 19:30:00', 30, 532.12, 3, 'WorkerID30', 'WorkerID13'),
(null, '2023-12-12 10:30:00', '2023-12-20 17:30:00', 15, 742.23, 8, 'WorkerID18', 'WorkerID32'),
(null, '2023-01-27 12:30:00', '2023-01-30 20:30:00', 17, 352.11, 5, 'WorkerID15', 'WorkerID25'),
(null, '2023-02-18 11:30:00', '2023-02-28 21:00:00', 20, 874.44, 9, 'WorkerID31', 'WorkerID09'),
(null, '2023-05-23 11:00:00', '2023-05-30 17:30:00', 10, 858.31, 1, 'WorkerID01', 'WorkerID28'),
(null, '2023-07-04 12:30:00', '2023-07-17 18:30:00', 4, 923.55, 2, 'WorkerID29', 'WorkerID12'),
(null, '2023-03-02 12:00:00', '2023-03-08 19:30:00', 22, 690.69, 7, 'WorkerID27', 'WorkerID07'),
(null, '2023-04-01 11:30:00', '2023-04-06 21:00:00', 14, 570.09, 4, 'WorkerID14', 'WorkerID04'),
(null, '2023-07-22 12:30:00', '2023-07-28 19:30:00', 5, 700.99, 10, 'WorkerID33', 'WorkerID10'),
(null, '2023-09-09 11:30:00', '2023-09-15 18:30:00', 4, 790.89, 6, 'WorkerID17', 'WorkerID26'),
(null, '2023-09-15 10:30:00', '2023-09-19 19:30:00', 7, 350.99, 3, 'WorkerID30', 'WorkerID13'),
(null, '2023-12-12 11:30:00', '2023-12-17 17:00:00', 10, 500.34, 8, 'WorkerID18', 'WorkerID32'),
(null, '2023-10-07 12:30:00', '2023-10-10 17:00:00', 30, 357.10, 5, 'WorkerID15', 'WorkerID25'),
(null, '2023-12-04 10:30:00', '2023-12-15 18:00:00', 45, 1289.99, 9, 'WorkerID31', 'WorkerID09');

CREATE TABLE event(
    ev_tr_id INT(11) NOT NULL,
    ev_start DATETIME NOT NULL,
    ev_end DATETIME NOT NULL,
    ev_descr TEXT,
    PRIMARY KEY(ev_tr_id, ev_start),
    CONSTRAINT event1 FOREIGN KEY(ev_tr_id) REFERENCES trip(tr_id)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO event VALUES
(1, '2023-01-31 12:00:00', '2023-01-31 14:00:00', 'Visiting The Louvre Museum.'),
(2, '2023-11-27 11:30:00', '2023-11-27 14:30:00', 'Learning about the prosperous history of Kalambaka.'),
(3, '2023-10-13 13:00:00', '2023-10-13 15:30:00', 'Doing a tour of the villages of the island of Crete!'),
(4, '2023-06-07 13:30:00', '2023-06-07 16:00:00', 'Visiting the Colloseum and the Ancient Market'),
(5, '2023-05-13 15:30:00', '2023-05-13 17:30:00', 'Exploring the canals of the city.'),
(6, '2023-08-15 12:30:00', '2023-08-15 13:30:00', 'Visiting the Acropolis and The Acropolis Museum'),
(7, '2023-09-13 17:30:00', '2023-09-13 19:30:00', 'Visiting the old part of Kalamata and watching a play at the Castle of Isabeau.'),
(8, '2023-12-16 12:30:00', '2023-12-16 15:30:00', 'Visiting the White Tower Of Thessaloniki.'),
(9, '2023-01-28 12:30:00', '2023-01-28 14:30:00', 'Eating at a local Restaurant.'),
(10, '2023-02-23 16:30:00', '2023-02-23 18:00:00', 'Visiting the Barcelona FC Stadium.'),
(11, '2023-05-24 15:00:00', '2023-05-24 17:30:00', 'Visiting a Spectacular small town close to Amsterdam, Delft.'),
(12, '2023-07-10 16:30:00', '2023-07-10 18:30:00', 'Visiting the Big Ben'),
(13, '2023-03-03 12:00:00', '2023-03-03 14:30:00', 'Visiting the old part of Kalamata and watching a play at the Castle of Isabeau.'),
(14, '2023-04-02 11:30:00', '2023-04-02 13:00:00', 'Doing a tour of the villages of the island of Crete!'),
(15, '2023-07-24 15:30:00', '2023-07-24 19:30:00', 'Swimming in the Local Beaches of the Island.'),
(16, '2023-09-11 13:30:00', '2023-09-11 15:30:00', 'Visiting the Berlin Television Tower which is the tallest building in Berlin.'),
(17, '2023-09-16 15:30:00', '2023-09-16 18:30:00', 'Taking a tour around this amazing island.'),
(18, '2023-12-13 16:30:00', '2023-12-13 18:00:00', 'Learning about the prosperous history of Kalambaka.'),
(19, '2023-10-08 12:30:00', '2023-10-08 15:00:00', 'Eating at a local Restaurant.'),
(20, '2023-12-08 12:30:00', '2023-12-15 15:00:00', 'Visiting The Louvre Museum.');

CREATE TABLE destination(
    dst_id INT(11) NOT NULL AUTO_INCREMENT,
    dst_name VARCHAR(50) DEFAULT 'Uknown' NOT NULL,
    dst_descr TEXT,
    dst_rtype ENUM('LOCAL', 'ABROAD'),
    dst_language VARCHAR(30) DEFAULT 'Uknown' NOT NULL,
    dst_location INT(11) NOT NULL,
    PRIMARY KEY(dst_id),
    CONSTRAINT destination1 FOREIGN KEY (dst_location) REFERENCES destination(dst_id)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO destination VALUES
(null, 'Kalamata', 'Great place for fans of theatre and the arts to visit. The main draw here is the Castle of Isabeau.', 'LOCAL', 'Greek', 1),
(null, 'Nafpaktos', 'A stunning little port town across the Rio-Antirrio Bridge from Patras. Great place for a weekend trip away from Athens.', 'LOCAL', 'Greek', 2),
(null, 'Corfu', 'It boasts some of the most beautiful beaches in all of Europe.', 'LOCAL', 'Greek', 3),
(null, 'Kalambaka', ' This town is located in Meteora, giving it a stunning landscape as a backdrop to this picturesque city.', 'LOCAL', 'Greek', 4),
(null, 'Heraklion', 'Heraklion, capital of the largest Greek islands, is a great place for those interested in Ancient Greek history.', 'LOCAL', 'Greek', 5),
(null, 'Thessaloniki', 'Thessaloniki, known as the cultural capital of Greece, is also the second-largest city in Greece.', 'LOCAL', 'Greek', 6),
(null, 'Rhodes', 'For those interested in Medieval history. This city is also a UNESCO World Heritage Site.', 'LOCAL', 'Greek', 7),
(null, 'Athens', 'Lots of sightseeing here, especially for those interested in Ancient Greek history', 'LOCAL', 'Greek', 8),
(null, 'Venice', 'Save this one for your one true love, it’s a magic spot to share with that special someone.', 'ABROAD', 'Italian', 9),
(null, 'Amsterdam', 'This city is not only one of the most charming cities due to its character and being positioned on the canals, but it is also incredibly fun.', 'ABROAD', 'Dutch', 10),
(null, 'Barcelona', 'It is a hub of new trends in the world of culture, fashion and cuisine.', 'ABROAD', 'Spanish', 11),
(null, 'Rome', 'There’s no place like Rome and of course when in Rome, do as the Romans do.', 'ABROAD', 'Italian', 12),
(null, 'Berlin', 'Germany’s capital has more history than you can comprehend even after spending weeks in the city.', 'ABROAD', 'German', 13),
(null, 'London', 'There’s no other city quite like London and it should go without saying that you simply must visit once in your lifetime.', 'ABROAD', 'English', 14);
(null, 'Paris', 'Paris... a girl’s dream. The croissants, crepes, baguettes… yes, this is Paris. You will be in love.', 'ABROAD', 'French', 15);

CREATE TABLE travel_to(
    to_tr_id INT(11) NOT NULL,
    to_dst_id INT(11) NOT NULL,
    to_arrival DATETIME,
    to_departure DATETIME,
    PRIMARY KEY(to_tr_id, to_dst_id),
    CONSTRAINT travel_to1 FOREIGN KEY (to_tr_id) REFERENCES trip(tr_id)
    ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT travel_to2 FOREIGN KEY (to_dst_id) REFERENCES destination(dst_id)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO travel_to VALUES


CREATE TABLE reservation(
    res_tr_id INT(11) NOT NULL,
    res_seatnum TINYINT(4) NOT NULL,
    res_name VARCHAR(20) DEFAULT 'Uknown' NOT NULL,
    res_lname VARCHAR(20) DEFAULT 'Uknown' NOT NULL,
    res_isadult ENUM('ADULT', 'MINOR'),
    PRIMARY KEY(res_tr_id, res_seatnum),
    CONSTRAINT reservation1 FOREIGN KEY (res_tr_id) REFERENCES trip(tr_id)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO reservation VALUES
(1, 24, 'Giorgos', 'Papadopoulos', 'ADULT'),
(2, 30, 'Giannis', 'Dimitriadis', 'MINOR'),
(2, 20, 'Leonidas', 'Asimakopoulos', 'ADULT'),
(4, 3, 'Babis', 'Papageorgiou', 'MINOR'),
(7, 4, 'Roula', 'Andreadi', 'ADULT'),
(6, 10, 'Giorgia', 'Dourou', 'ADULT'),
(5, 6, 'Maria', 'Papadopoulou', 'MINOR'),
(1, 11, 'Eleni', 'Dimoula', 'ADULT'),
(9, 15, 'Iasonas', 'Stamoulis', 'ADULT'),
(10, 3, 'Roubini', 'Louloudi', 'MINOR');


DROP PROCEDURE IF EXISTS seats_trip;
DELIMITER $
CREATE PROCEDURE seats_trip(IN res_id INT, OUT res TINYINT)
BEGIN
	DECLARE currentSeats TINYINT;
    DECLARE rsvid INT;
    DECLARE not_found INT;
    DECLARE max TINYINT;
    
    DECLARE tripcursor CURSOR FOR 
    SELECT res_tr_id FROM reservation WHERE res_tr_id=res_id;
    
    DECLARE CONTINUE HANDLER FOR NOT FOUND
    SET not_found=1;
    
    SELECT tr_maxseats INTO max FROM trip WHERE tr_id=res_id;
    
    SET not_found=0;
    OPEN tripcursor;
    REPEAT
		FETCH tripcursor INTO rsvid;
        IF(not_found=0)
        THEN 
			SELECT COUNT(*) INTO currentSeats FROM reservation WHERE res_tr_id=rsvid;
        END IF;
        UNTIL(not_found=1)
	END REPEAT;
IF (currentSeats < max)
	THEN SET res=1;
	ELSE SET res=0;
END IF;
END$
DELIMITER ;

DROP TRIGGER IF EXISTS capacity;
DELIMITER $

CREATE TRIGGER capacity BEFORE INSERT ON reservation
FOR EACH ROW
BEGIN
	CALL seats_trip(NEW.res_tr_id, @res);
    IF(@res=0)
    THEN SIGNAL SQLSTATE VALUE '45000'
	SET MESSAGE_TEXT = 'The maximum amount of seats have been Reached.';
    END IF;
END$
DELIMITER ;

SELECT * FROM reservation;

INSERT INTO reservation VALUES
(1, 25, 'Giannis', 'Papadopoulos', 'ADULT');

SELECT * FROM reservation;

INSERT INTO reservation VALUES
(2, 24, 'Giorgos', 'Papadopoulos', 'ADULT');