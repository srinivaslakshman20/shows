CREATE TABLE `Cinema` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `description` varchar(255),
  `cast_members` varchar(255),
  `languages` varchar(255),
  `genre` varchar(255),
  `duration_in_mins` int
);

CREATE TABLE `Theater` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `description` varchar(255),
  `address_1` varchar(255),
  `address_2` varchar(255),
  `city` varchar(255),
  `state` varchar(255),
  `zip` varchar(255),
  `category` varchar(255),
  `phone` varchar(255)
);

CREATE TABLE `Screen` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `theater_id` int,
  `name` varchar(255),
  `seat_capacity` int
);

CREATE TABLE `Shows` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `cinema_id` int,
  `screen_id` int,
  `show_time` datetime,
  `show_price` int
);

CREATE TABLE `Reservations` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `shows_timings_id` int,
  `user_id` int,
  `status` ENUM ('confirmed', 'in_progress', 'cancelled'),
  `payment_status` bool
);

CREATE TABLE `Reservation_Seats` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `reservation_id` int,
  `seat_id` int
);

CREATE TABLE `Seat_Inventory` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `row_number` int,
  `seat_number` varchar(255),
  `screen_id` int
);

CREATE TABLE `Users` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255)
);

CREATE TABLE `Offers` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `offer_code` varchar(255),
  `offer_description` varchar(255)
);

CREATE TABLE `Shows_Offers` (
  `id` int PRIMARY KEY AUTO_INCREMENT,
  `shows_id` int,
  `offer_id` int
);

ALTER TABLE `Screen` ADD FOREIGN KEY (`theater_id`) REFERENCES `Theater` (`id`);

ALTER TABLE `Shows` ADD FOREIGN KEY (`cinema_id`) REFERENCES `Cinema` (`id`);

ALTER TABLE `Shows` ADD FOREIGN KEY (`screen_id`) REFERENCES `Screen` (`id`);

ALTER TABLE `Reservation_Seats` ADD FOREIGN KEY (`seat_id`) REFERENCES `Seat_Inventory` (`id`);

ALTER TABLE `Reservation_Seats` ADD FOREIGN KEY (`reservation_id`) REFERENCES `Reservations` (`id`);

ALTER TABLE `Reservations` ADD FOREIGN KEY (`shows_timings_id`) REFERENCES `Shows` (`id`);

ALTER TABLE `Seat_Inventory` ADD FOREIGN KEY (`screen_id`) REFERENCES `Screen` (`id`);

ALTER TABLE `Users` ADD FOREIGN KEY (`id`) REFERENCES `Reservations` (`user_id`);

ALTER TABLE `Shows_Offers` ADD FOREIGN KEY (`shows_id`) REFERENCES `Shows` (`id`);

ALTER TABLE `Shows_Offers` ADD FOREIGN KEY (`offer_id`) REFERENCES `Offers` (`id`);

