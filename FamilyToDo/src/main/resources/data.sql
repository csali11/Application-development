INSERT INTO USER(ID, USER_NAME, PASSWORD, ROLE) VALUES(10, 'apa', 'apa', 'ADMIN');
INSERT INTO USER(ID, USER_NAME, PASSWORD, ROLE) VALUES(11, 'kate', 'kate', 'USER');
INSERT INTO USER(ID, USER_NAME, PASSWORD, ROLE) VALUES(12, 'anya', 'anya', 'ADMIN');
INSERT INTO USER(ID, USER_NAME, PASSWORD, ROLE) VALUES(13, 'john', 'john', 'USER');
INSERT INTO USER(ID, USER_NAME, PASSWORD, ROLE) VALUES(14, 'mark', 'mark', 'USER');
INSERT INTO USER(ID, USER_NAME, PASSWORD, ROLE) VALUES(15, 'marry', 'marry', 'USER');

INSERT INTO family(id, name, age, permission)
VALUES 
    (1, 'Ted', 47, 'parent' );
INSERT INTO family(id, name, age, permission)
VALUES 
    (2, 'Eva', 44, 'parent' );
INSERT INTO family(id, name, age, permission)
VALUES 
    (3, 'Kate', 14, 'child' );
    INSERT INTO family(id, name, age, permission)
VALUES 
    (4, 'John', 12, 'child' );
INSERT INTO family(id, name, age, permission)
VALUES 
    (5, 'Mark', 9, 'child' );
INSERT INTO family(id, name, age, permission)
VALUES 
    (6, 'Marry', 4, 'child' );
 
INSERT INTO DESTINATION(id, des)
VALUES 
    (1,'garden');
INSERT INTO DESTINATION(id, des)
VALUES 
    (2,'kitchen');

INSERT INTO todo(id, author, text, family_id,destination_id)
VALUES 
    (1, 'Marry', 'Dad has to chop some logs.', 1 ,1);

INSERT INTO todo(id, author, text, family_id,destination_id)
VALUES 
    (2, 'Eva', 'Ted has to cut some onions.', 1, 2);
INSERT INTO items(id, name)
VALUES 
    (1, 'axe' );
INSERT INTO items(id, name)
VALUES 
    (2, 'knife' );
INSERT INTO TODO_ITEMS(to_do_id, items_id)
VALUES 
    (1,1);
INSERT INTO TODO_ITEMS(to_do_id, items_id)
VALUES 
    (2,2);