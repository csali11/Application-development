INSERT INTO family(id, name, age, premission)
VALUES 
    (1, 'Ted', 47, 'parent' );
INSERT INTO family(id, name, age, premission)
VALUES 
    (2, 'Eva', 44, 'parent' );
INSERT INTO family(id, name, age, premission)
VALUES 
    (3, 'Kate', 14, 'child' );
    INSERT INTO family(id, name, age, premission)
VALUES 
    (4, 'John', 12, 'child' );
INSERT INTO family(id, name, age, premission)
VALUES 
    (5, 'Mark', 9, 'child' );
INSERT INTO family(id, name, age, premission)
VALUES 
    (6, 'Marry', 4, 'child' );
 
INSERT INTO todo(id, author, text, family_id)
VALUES 
    (1, 'Marry', 'Dad has to chop some logs.', 1 );

INSERT INTO todo(id, author, text, family_id)
VALUES 
    (2, 'Eva', 'Ted has to cut some onions.', 1 );
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

