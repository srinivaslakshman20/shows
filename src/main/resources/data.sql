
INSERT INTO Cinema(name, description, cast_members, languages, genre, duration_in_mins) VALUES
        ('Mission Impossible 6', 'A group of terrorists plans to detonate three plutonium cores for a simultaneous nuclear attack on different cities. Ethan Hunt, along with his IMF team, sets out to stop the carnage.',
        'Tom Cruise, Rebecca Ferguson, Henry Cavill', 'English', 'Thriller', 125);

INSERT INTO Cinema(name, description, cast_members, languages, genre, duration_in_mins) VALUES
        ('Dune', 'Dune is based on the fictional universe created by Frank Herbert in his 1965 classic sci-fi novel by the same name',
        'Timothée Chalamet, Paul Atreides, Zendaya, Rebecca Ferguson, Jason Momoa', 'English', 'Science Fiction', 132);

INSERT INTO Cinema(name, description, cast_members, languages, genre, duration_in_mins) VALUES
        ('The Suicide Squad','Combining whimsical fantasy, ample heart, and wit, along with bloody yet creative gore, James Gunn proves yet again why he’s amongst the best comic book storytellers working today.',
        'Margot robbie, Joel Kinnaman, Jai Courtney, Viola Davis', 'English', 'Action', 118);

INSERT INTO Cinema(name, description, cast_members, languages, genre, duration_in_mins) VALUES
        ('Bhavai', 'Bhavai also has some old-world charm and special mention must also be made of the treatment of the opening credits, with a golden touch to the black-and-white animation and ear-pleasing classical score.',
        'Pratik Gandhi, Aindrita Ray, Rajesh Sharma, Rajendra Gupta', 'Hindi', 'Drama', 177);

INSERT INTO Cinema(name, description, cast_members, languages, genre, duration_in_mins) VALUES
        ('Manasvi', 'The movie is directed by Manoj Thakkar and featured Ravi Mittal, Shashank Chaturvedi and Vishal Chaudhary as lead characters.',
        'Ravi Mittal, Shashank Chaturvedi, Vishal Chaudhary', 'Hindi', 'Drama', 198);

INSERT INTO Cinema(name, description, cast_members, languages, genre, duration_in_mins) VALUES
        ('Salaga', 'The filmmaker has maintained how hes tried to narrate a story of the side of Bengaluru that not many are privy to like he was.',
        'Duniya Vijay, Dhananjaya, Sanjana Anand, Achyuth Kumar', 'Kannada', 'Action', 178);


INSERT INTO Theater(name, description, address_1, address_2, city, state, zip, category, phone) VALUES
        ('PVR Cinemas', 'PVR Cinemas is a film entertainment company in India. The company started as a joint venture agreement between Priya Exhibitors Private Limited and Village Roadshow Limited in 1995 with 60:40 ratio',
         'No 92', ' GT World Mall', 'Bengaluru', 'Karnataka', '560023', 'Multiplex', '088009 00009');

INSERT INTO Theater(name, description, address_1, address_2, city, state, zip, category, phone) VALUES
        ('PVR Cinemas', 'PVR Cinemas is a film entertainment company in India. The company started as a joint venture agreement between Priya Exhibitors Private Limited and Village Roadshow Limited in 1995 with 60:40 ratio',
         'No 49 Bannerghatta Main Rd', 'Dollar Layout', 'Bengaluru', 'Karnataka', '560076', 'Multiplex', '088009 00009');

INSERT INTO Theater(name, description, address_1, address_2, city, state, zip, category, phone) VALUES
        ('Gopalan Cinemas', 'Located in Gopalan Innovation Mall',
        'No-22, Bannerghatta Main Rd', 'Weavers Colony, JP Nagar, 3rd Phase', 'Bengaluru', 'Karnataka', '560076', 'Multiplex', '080 2659 0111');

INSERT INTO Theater(name, description, address_1, address_2, city, state, zip, category, phone) VALUES
        ('Urvashi Theater', 'This digital cinema has seating for over 1,150 and shows all of the latest Bollywood releases.',
        '40, Siddaiah Rd, Near MTR', 'Doddamavalli, Sudhama Nagar', 'Bengaluru', 'Karnataka', '560002', 'Single Screen', '080 4347 4347');


INSERT INTO Screen(theater_id, name, seat_capacity) VALUES (1, 'Screen_1', 200);
INSERT INTO Screen(theater_id, name, seat_capacity) VALUES (1, 'Screen_2', 150);
INSERT INTO Screen(theater_id, name, seat_capacity) VALUES (1, 'Screen_3', 100);
INSERT INTO Screen(theater_id, name, seat_capacity) VALUES (2, 'Screen_1', 100);
INSERT INTO Screen(theater_id, name, seat_capacity) VALUES (2, 'Screen_2', 100);
INSERT INTO Screen(theater_id, name, seat_capacity) VALUES (3, 'Screen_1', 100);
INSERT INTO Screen(theater_id, name, seat_capacity) VALUES (3, 'Screen_2', 150);
INSERT INTO Screen(theater_id, name, seat_capacity) VALUES (4, 'Screen_1', 1000);

INSERT INTO SHOWS(Cinema_id, Screen_id, show_time, show_price) VALUES (1, 1, '2020-09-17 08:45:00', 175);
INSERT INTO SHOWS(Cinema_id, Screen_id, show_time, show_price) VALUES (2, 2, '2021-10-25 10:45:00', 125);

INSERT INTO OFFERS(id, offer_code, offer_description) VALUES (1, 'OFFER-3TICKET', '50% discount on the third ticket');
INSERT INTO OFFERS(id, offer_code, offer_description) VALUES (2, 'OFFER-20TICKET', 'Tickets booked for the afternoon show get a 20% discount');

INSERT INTO SHOWS_OFFERS(shows_id, offer_id) VALUES (1, 1);
INSERT INTO SHOWS_OFFERS(shows_id, offer_id) VALUES (2, 2);


INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 1, '1A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 1, '1B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 1, '1C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 1, '1D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 1, '1E');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 2, '2A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 2, '2B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 2, '2C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 2, '2D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 2, '2E');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 3, '3A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 3, '3B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 3, '3C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 3, '3D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (1, 3, '3E');

INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 1, '1A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 1, '1B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 1, '1C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 1, '1D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 1, '1E');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 2, '2A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 2, '2B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 2, '2C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 2, '2D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 2, '2E');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 3, '3A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 3, '3B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 3, '3C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 3, '3D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (2, 3, '3E');

INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 1, '1A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 1, '1B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 1, '1C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 1, '1D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 1, '1E');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 2, '2A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 2, '2B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 2, '2C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 2, '2D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 2, '2E');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 3, '3A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 3, '3B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 3, '3C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 3, '3D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (3, 3, '3E');


INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (4, 1, '1A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (4, 1, '1B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (4, 1, '1C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (4, 1, '1D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (4, 1, '1E');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (4, 2, '2A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (4, 2, '2B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (4, 2, '2C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (4, 2, '2D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (4, 2, '2E');


INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (5, 1, '1A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (5, 1, '1B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (5, 1, '1C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (5, 1, '1D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (5, 1, '1E');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (5, 2, '2A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (5, 2, '2B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (5, 2, '2C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (5, 2, '2D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (5, 2, '2E');


INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (6, 1, '1A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (6, 1, '1B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (6, 1, '1C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (6, 1, '1D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (6, 1, '1E');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (6, 2, '2A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (6, 2, '2B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (6, 2, '2C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (6, 2, '2D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (6, 2, '2E');


INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (7, 1, '1A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (7, 1, '1B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (7, 1, '1C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (7, 1, '1D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (7, 1, '1E');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (7, 2, '2A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (7, 2, '2B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (7, 2, '2C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (7, 2, '2D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (7, 2, '2E');


INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (8, 1, '1A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (8, 1, '1B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (8, 1, '1C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (8, 1, '1D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (8, 1, '1E');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (8, 2, '2A');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (8, 2, '2B');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (8, 2, '2C');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (8, 2, '2D');
INSERT INTO SEAT_INVENTORY(screen_id, row_number, seat_number) VALUES (8, 2, '2E');
