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
('WorkerID06', 'Iasonas', 'Pavlopoulos', 776.2, 6),
('WorkerID07', 'Andreas', 'Andreadis', 1500.32, 7),
('WorkerID08', 'Meletios', 'Polidouris', 1222.44, 8),
('WorkerID09', 'Loukas', 'Ramakis', 1000.1, 9),
('WorkerID10', 'Axilleas', 'Patroklos', 1022.3, 10),
('WorkerID11', 'Roumpini', 'Aggoura', 1120.7, 1),
('WorkerID12', 'Maria', 'Louloudi', 433.5, 2),
('WorkerID13', 'Prigkipissa', 'Vasilissa', 655.2, 3),
('WorkerID14', 'Katerina', 'Papaflessa', 836.44, 4),
('WorkerID15', 'Eleni', 'Oikonomakou', 988.2, 5),
('WorkerID16', 'Maritimi', 'Petroula', 2500.21, 5),
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
('WorkerID27', 'Rashad', 'Noble', 911.6, 7),
('WorkerID28', 'Krista', 'Romero', 1422.61, 8);

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
('WorkerID01', 'C', 'LOCAL', 12),
('WorkerID12', 'B', 'LOCAL', 11),
('WorkerID25', 'C', 'ABROAD', 28),
('WorkerID07', 'D', 'LOCAL', 43),
('WorkerID13', 'A', 'LOCAL', 1),
('WorkerID26', 'B', 'ABROAD', 2),
('WorkerID04', 'C', 'ABROAD', 7),
('WorkerID28', 'D', 'ABROAD', 32),
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
('1234567890', 'LOGISTICS', 'Logistics Diploma'),
('6789012345', 'LOGISTICS', 'Economics Diploma'),
('1098765432', 'LOGISTICS', 'Economics Diploma'),
('2104319253', 'ADMINISTRATIVE', 'Computer Engineer Diploma'),
('9876543210', 'ADMINISTRATIVE', 'Mechanical Engineer Diploma'),
('9012345678', 'ADMINISTRATIVE', 'Chemical Engineer Diploma'),
('9012345678', 'ADMINISTRATIVE', 'Chemical Engineer Diploma'),
('9012345678', 'ADMINISTRATIVE', 'Chemical Engineer Diploma'),
('9012345678', 'ADMINISTRATIVE', 'Chemical Engineer Diploma'),
('9012345678', 'ADMINISTRATIVE', 'Chemical Engineer Diploma'),
('7890123456', 'ADMINISTRATIVE', 'Computer Engineer Diploma');

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
('1234567890', 1),
('6789012345', 2),
('1098765432', 3),
('2104319253', 4),
('9876543210', 5);
('9012345678', )

CREATE TABLE guide(
    gui_AT CHAR(10) NOT NULL,
    gui_cv TEXT,
    PRIMARY KEY(gui_AT),
    CONSTRAINT guide1 FOREIGN KEY (gui_AT) REFERENCES worker(wrk_AT)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO guide VALUES
('2345678901', 'Worked as a guide at the Acropolis site for 10 years'),
('4567890123', 'Worked as a guide at the Santorini island for 5 years'),
('8901234567', 'Worked as a guide at the Mykonos island for 7 years'),
('0123456789', 'Worked as a guide at the Acropolis site for 5 years'),
('7654321098', 'Worked as a guide at the Monemvasia castle for 20 years'),
('5432109876', 'Worked as a guide at the Acropolis site for 15 years'),
('3210987654', 'Worked as a guide at the Acropolis site for 1 year');

CREATE TABLE languages(
    lng_gui_AT CHAR(10) NOT NULL,
    lng_language VARCHAR(30) DEFAULT 'Uknown' NOT NULL,
    PRIMARY KEY(lng_language, lng_gui_AT),
    CONSTRAINT languages1 FOREIGN KEY (lng_gui_AT) REFERENCES guide(gui_AT)
    ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO languages VALUES
('2345678901','Greek'),
('4567890123','Greek'),
('8901234567','Greek'),
('0123456789','Greek'),
('7654321098','Greek'),
('5432109876','Greek'),
('3210987654','Greek'),
('2345678901','English'),
('4567890123','English'),
('8901234567','English'),
('0123456789','English'),
('2345678901','German'),
('4567890123','German'),
('2345678901','French'),
('0123456789','French'),
('7654321098','Chinese'),
('5432109876','Chinese');

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
(null, '1992-12-29 15:30:00', '1992-12-30 15:30:00', 20, 25.1, 1, '2345678901', '3456789012'),
(null, '1992-12-25 15:30:00', '1992-12-26 15:30:00', 2, 23.1, 2, '8901234567', '6543210987'),
(null, '1992-12-29 11:00:00', '1992-12-30 18:30:00', 22, 23.1, 3, '5432109876', '0987654321'),
(null, '1993-11-29 15:30:00', '1993-11-30 15:00:00', 21, 21.1, 4, '0123456789', '2109876543'),
(null, '1992-12-29 15:30:00', '1992-12-30 15:30:00', 22, 20.1, 5, '2345678901', '5678901234'),
(null, '1992-12-29 15:30:00', '1992-12-30 15:30:00', 25, 23.2, 6, '5432109876', '5678901234'),
(null, '1996-09-15 15:30:00', '1996-09-17 15:30:00', 26, 28.1, 7, '0123456789', '8765432109'),
(null, '1994-12-22 15:30:00', '1994-12-28 15:30:00', 27, 29.1, 8, '4567890123', '2109876543'),
(null, '1992-10-29 10:30:00', '1992-10-30 11:30:00', 27, 24.5, 9, '2345678901', '8765432109'),
(null, '1992-12-29 15:30:00', '1992-12-30 15:30:00', 27, 23.1, 10, '7654321098', '0987654321');

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
(1, '1992-12-29 15:30:00', '1992-12-30 15:30:00', 'Beautiful trip and lunch at local restaurant'),
(2, '1992-11-29 15:30:00', '1992-11-30 15:30:00', 'Beautiful trip and dinner at local restaurant'),
(3, '1992-10-29 15:30:00', '1992-10-30 15:30:00', 'Cruise and activities on the ship'),
(4, '1992-09-29 15:30:00', '1992-09-30 15:30:00', 'Cruise and activities on the ship'),
(5, '1992-08-29 15:30:00', '1992-08-30 15:30:00', 'Museum Visit and sightseeing'),
(6, '1992-07-29 15:30:00', '1992-07-30 15:30:00', 'Museum Visit and sightseeing'),
(7, '1992-06-29 15:30:00', '1992-06-30 15:30:00', 'Museum Visit and sightseeing'),
(8, '1992-05-29 15:30:00', '1992-05-30 15:30:00', 'Beautiful trip and dinner at local restaurant'),
(9, '1992-04-29 15:30:00', '1992-04-30 15:30:00', 'Visiting an Island and dinner at local restaurant'),
(10, '1992-03-29 15:30:00', '1992-03-30 15:30:00', 'Cruise and activities on the ship');

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
(null, 'Patra', 'It is a trully beautiful destination with a University campus', 'Local', 'Greek', 1),
(null, 'Athena', 'The Capital city of Greece. It has a breathtaking view.', 'Local', 'Greek', 2),
(null, 'Kerkyra', 'Greek Island with a Breathtaking view.', 'Local', 'Greek', 3),
(null, 'Thessaloniki', 'Second biggest city in Greece. The subway just opened.', 'Local', 'Greek', 4),
(null, 'Kalamata', 'Majestic city in the South of Greece with a lot of beaches.', 'Local', 'Greek', 5),
(null, 'Santorini', 'Amzing Greek Island. Part of Kyklades', 'Local', 'Greek', 6),
(null, 'Mykonos', 'The most famous Greek Island. It has a wild night life', 'Local', 'Greek', 7),
(null, 'Paris', 'The most Romantic place anyone could visit', 'Abroad', 'French', 8),
(null, 'Rome', 'Famous sites: Colloseum, Fontana di Trevi, Pantheon', 'Abroad', 'Italian', 9),
(null, 'New York', 'The city who never sleeps.', 'Abroad', 'English', 10);

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
(1, 1, '1993-12-29 15:30:00', '1993-12-30 15:30:00'),
(2, 2, '1994-12-29 15:30:00', '1994-12-30 15:30:00'),
(3, 3, '1995-12-29 15:30:00', '1995-12-30 15:30:00'),
(4, 4, '1996-12-29 15:30:00', '1996-12-30 15:30:00'),
(5, 5, '1997-12-29 15:30:00', '1997-12-30 15:30:00'),
(6, 6, '1998-12-29 15:30:00', '1998-12-30 15:30:00'),
(7, 7, '1999-12-29 15:30:00', '1999-12-30 15:30:00'),
(8, 8, '1992-11-29 15:30:00', '1992-11-30 15:30:00'),
(9, 9, '1992-12-29 15:30:00', '1992-12-30 15:30:00'),
(10, 10, '1992-12-29 15:30:00', '1992-12-30 15:30:00');

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