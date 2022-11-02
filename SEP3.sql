drop schema if exists sep3 cascade;
create schema sep3;
set schema 'sep3';


create table Role
(
    id       serial PRIMARY KEY,
    roleName varchar(50)
);
create table Users
(
    id       serial PRIMARY KEY,
    username varchar(50),
    password varchar(50),
    role     int,
    FOREIGN KEY (role) references Role (id)
);
create table WaterUsage
(
    id     serial PRIMARY KEY,
    amount double precision,
    month  int,
    year   int,
    userId int references Users (id)
);
create table ElectricityUsage
(
    id     serial PRIMARY KEY,
    amount double precision,
    month  int,
    year   int,
    userId int references Users (id)
);
create table WaterUsageAdvice
(
    id   serial PRIMARY KEY,
    text varchar
);
create table UserHasWaterUsageAdvice
(
    userId             int references Users (id),
    waterUsageAdviceId int references WaterUsageAdvice (id)
);
create table ElectricityUsageAdvice
(
    id   serial PRIMARY KEY,
    text varchar
);
create table UserHasElectricityUsageAdvice
(
    userId                   int references Users (id),
    electricityUsageAdviceId int references ElectricityUsageAdvice (id)
);


insert into ElectricityUsageAdvice
values (1,
        'Hey guys, did you know that in terms of male human and female Pokémon breeding, Vaporeon is the most compatible Pokémon for humans? Not only are they in the field egg group, which is mostly comprised of mammals, Vaporeon are an average of 3”03’ tall and 63.9 pounds, this means they’re large enough to be able handle human dicks, and with their impressive Base Stats for HP and access to Acid Armor, you can be rough with one. Due to their mostly water based biology, there’s no doubt in my mind that an aroused Vaporeon would be incredibly wet, so wet that you could easily have sex with one for hours without getting sore. They can also learn the moves Attract, Baby-Doll Eyes, Captivate, Charm, and Tail Whip, along with not having fur to hide nipples, so it’d be incredibly easy for one to get you in the mood. With their abilities Water Absorb and Hydration, they can easily recover from fatigue with enough water. No other Pokémon comes close to this level of compatibility. Also, fun fact, if you pull out enough, you can make your Vaporeon turn white. Vaporeon is literally built for human dick. Ungodly defense stat+high HP pool+Acid Armor means it can take cock all day, all shapes and sizes and still come for more');
insert into WaterUsageAdvice
values (1,
        'Hey guys, did you know that in tewms of mawe human and femawe Pokémon bweeding, Vapoweon is the most compatibwe Pokémon fow humans? Not onwy awe they in the fiewd egg gwoup, which is mostwy compwised of mammaws, Vapoweon awe an avewage of 3”03’ taww and 63.9 pounds, this means they’we wawge enough to be abwe handwe human dicks, and with theiw impwessive Base Stats fow HP and access to Acid Awmow, you can be wough with one. Due to theiw mostwy watew based biowogy, thewe’s no doubt in my mind that an awoused Vapoweon wouwd be incwedibwy wet, so wet that you couwd easiwy have sex with one fow houws without getting sowe. They can awso weawn the moves Attwact, Baby-Doww Eyes, Captivate, Chawm, and Taiw Whip, awong with not having fuw to hide nippwes, so it’d be incwedibwy easy fow one to get you in the mood. With theiw abiwities Watew Absowb and Hydwation, they can easiwy wecovew fwom fatigue with enough watew. No othew Pokémon comes cwose to this wevew of compatibiwity. Awso, fun fact, if you puww out enough, you can make youw Vapoweon tuwn white. Vapoweon is witewawwy buiwt fow human dick. Ungodwy defense stat+high HP poow+Acid Awmow means it can take cock aww day, aww shapes and sizes and stiww come fow mowe');
insert into Role
values (1, 'user'),
       (2, 'manager'),
       (3, 'admin')
;
insert into Users values
(1, 'jakub', 'jakub', 3),
(2, 'filip', 'filip', 2),
(3, 'daniel', 'daniel', 1);
insert into WaterUsage
values (1, 21.37, 7, 2020, 1),
       (2, 13.12, 9, 2021, 2),
       (3, 9.11, 8, 2020, 1);
insert into ElectricityUsage
values (1, 13, 8, 2020, 1),
       (2, 18, 9, 2021, 3),
       (3, 19, 10, 2021, 3);
insert into UserHasWaterUsageAdvice
values (1, 1);
insert into UserHasElectricityUsageAdvice
values (3, 1);

select * from Users;
select *from Users where id=1;
select * from WaterUsage;
select *from WaterUsage where userId=1;
select * from ElectricityUsage;
select * from WaterUsageAdvice;
select * from ElectricityUsageAdvice;

