-- 7. Работа с MySQL
-- 7.1. После создания диаграммы классов в 6 пункте, в 7 пункте база данных "Human Friends" должна быть структурирована в соответствии с этой диаграммой.
-- Например, можно создать таблицы, которые будут соответствовать классам "Pets" и "Pack animals",
-- и в этих таблицах будут поля, которые характеризуют каждый тип животных (например, имена, даты рождения, выполняемые команды и т.д.).
-- 7.2   - В ранее подключенном MySQL создать базу данных с названием "Human Friends".
CREATE SCHEMA HumanFriends;

--    - Создать таблицы, соответствующие иерархии из вашей диаграммы классов.
CREATE TABLE Dogs (
    Name VARCHAR(30) NOT NULL,
    BirthDate DATE,
    Commands VARCHAR(255),
    Type VARCHAR(30),
    Condition VARCHAR(30),
    Breed VARCHAR(70),
    HomeOrStreet BOOLEAN
);

CREATE TABLE Cats (
    Name VARCHAR(30) NOT NULL,
    BirthDate DATE,
    Commands VARCHAR(255),
    Type VARCHAR(30),
    Condition VARCHAR(30),
    Breed VARCHAR(70)
);

CREATE TABLE Hamsters (
    Name VARCHAR(30) NOT NULL,
    BirthDate DATE,
    Commands VARCHAR(255),
    Type VARCHAR(30),
    Condition VARCHAR(30),
    Color VARCHAR(30)
);

CREATE TABLE Horses (
    Name VARCHAR(30) NOT NULL,
    BirthDate DATE,
    Commands VARCHAR(255),
    Type VARCHAR(30),
    Workload INT,
    Breed VARCHAR(70)
);

CREATE TABLE Camels (
    Name VARCHAR(30) NOT NULL,
    BirthDate DATE,
    Commands VARCHAR(255),
    Type VARCHAR(30),
    Workload INT,
    Humps INT
);

CREATE TABLE Donkeys (
    Name VARCHAR(30) NOT NULL,
    BirthDate DATE,
    Commands VARCHAR(255),
    Type VARCHAR(30),
    Workload INT,
    Color VARCHAR(30)
);

--    - Заполнить таблицы данными о животных, их командах и датами рождения.
INSERT INTO
    Dogs (Name, BirthDate, Commands, Type, Condition, Breed, HomeOrStreet)
VALUES
    ('Fido', '2020-01-01', 'Sit, Stay, Fetch', 'Dog', 'Freedom', 'Sheepdog', false),
    ('Buddy', '2018-12-10', 'Sit, Paw, Bark', 'Dog', 'Freedom', 'Bulldog', true),
    ('Bella', '2019-11-11', 'Sit, Stay, Roll', 'Dog', 'Freedom', 'Pomeranian', true);

INSERT INTO
    Cats (Name, BirthDate, Commands, Type, Condition, Breed)
VALUES
    ('Whiskers', '2019-05-15', 'Sit, Pounce', 'Cat', 'Freedom', 'Scottish fold'),
    ('Smudge', '2020-02-20', 'Sit, Pounce, Scratch', 'Cat', 'Freedom', 'Siberian'),
    ('Oliver', '2020-06-30', 'Meow, Scratch, Jump', 'Cat', 'Freedom', 'Siamese');

INSERT INTO
    Hamsters (Name, BirthDate, Commands, Type, Condition, Color)
VALUES
    ('Hammy', '2021-03-10', 'Roll, Hide', 'Hamster', 'Cage', 'red'),
    ('Peanut', '2021-08-01', 'Roll, Spin', 'Hamster', 'Cage', 'brown');

INSERT INTO
    Horses (Name, BirthDate, Commands, Type, Workload, Breed)
VALUES
    ('Thunder', '2015-07-21', 'Trot, Canter, Gallop', 'Horse', 80, 'Arabic'),
    ('Storm', '2014-05-05', 'Trot, Canter', 'Horse', 110, 'Vladimirskaya'),
    ('Blaze', '2016-02-29', 'Trot, Jump, Gallop', 'Horse', 90, 'Akhaltekinskaya');

INSERT INTO
    Camels (Name, BirthDate, Commands, Type, Workload, Humps)
VALUES
    ('Sandy', '2016-11-03', 'Walk, Carry Load', 'Camel', 100, 2),
    ('Dune', '2018-12-12', 'Walk, Sit', 'Camel', 90, 1),
    ('Sahara', '2015-08-14', 'Walk, Run', 'Camel', 120, 2);

INSERT INTO
    Donkeys (Name, BirthDate, Commands, Type, Workload, Color)
VALUES
    ('Eeyore', '2017-09-18', 'Walk, Carry Load, Bray', 'Donkey', 50, 'brown'),
    ('Burro', '2019-01-23', 'Walk, Bray, Kick', 'Donkey', 55, 'grey');

--    - Удалить записи о верблюдах и объединить таблицы лошадей и ослов.
TRUNCATE TABLE Camels;

SELECT
    Name,
    BirthDate,
    Commands,
    Type,
    Workload
FROM
    Horses
UNION
SELECT
    Name,
    BirthDate,
    Commands,
    Type,
    Workload
FROM
    Donkeys;

--    - Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст с точностью до месяца.
CREATE TEMPORARY TABLE AllAnimals
SELECT * FROM Dogs
UNION
SELECT * FROM Cats
UNION
SELECT * FROM Hamsters
UNION
SELECT * FROM Horses
UNION
SELECT * FROM Donkeys;

CREATE TABLE young_animals
SELECT
    Name,
    BirthDate,
    Commands,
    Type,
    TIMESTAMPDIFF(MONTH, BirthDate, CURDATE()) AS AgeInMonth
FROM AllAnimals
WHERE BirthDate BETWEEN ADDDATE(CURDATE(), INTERVAL -3 YEAR) AND ADDDATE(CURDATE(), INTERVAL -1 YEAR);

--    - Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам.
SELECT
    Name,
    BirthDate,
    Commands,
    Type
FROM
    Dogs
UNION
SELECT
    Name,
    BirthDate,
    Commands,
    Type
FROM
    Cats
UNION
SELECT
    Name,
    BirthDate,
    Commands,
    Type
FROM
    Hamsters
UNION
SELECT
    Name,
    BirthDate,
    Commands,
    Type
FROM
    Horses
UNION
SELECT
    Name,
    BirthDate,
    Commands,
    Type
FROM
    Donkeys;