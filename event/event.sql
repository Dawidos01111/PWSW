-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 18 Cze 2019, 22:28
-- Wersja serwera: 10.1.37-MariaDB
-- Wersja PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `event`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `events`
--

CREATE TABLE `events` (
  `ID` int(11) NOT NULL,
  `Nazwa` text COLLATE utf8_polish_ci NOT NULL,
  `Termin` datetime NOT NULL,
  `Agenda` longtext COLLATE utf8_polish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;

--
-- Zrzut danych tabeli `events`
--

INSERT INTO `events` (`ID`, `Nazwa`, `Termin`, `Agenda`) VALUES
(1, 'Noc w zoo', '2019-06-20 23:00:00', 'Spędzanie czasu ze zwierzętami u Ciebie w mieście w godzinach snu!'),
(2, 'Głaskanie żmii', '2019-06-27 12:30:00', 'Zięć głaskający teściową!');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `registration`
--

CREATE TABLE `registration` (
  `ID` int(11) NOT NULL,
  `firstName` varchar(10) COLLATE utf8_polish_ci DEFAULT NULL,
  `surName` varchar(15) COLLATE utf8_polish_ci DEFAULT NULL,
  `login` varchar(15) COLLATE utf8_polish_ci DEFAULT NULL,
  `mail` varchar(20) COLLATE utf8_polish_ci DEFAULT NULL,
  `password` varchar(15) COLLATE utf8_polish_ci DEFAULT NULL,
  `dateRegistration` date DEFAULT NULL,
  `permissions` varchar(15) COLLATE utf8_polish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_polish_ci;

--
-- Zrzut danych tabeli `registration`
--

INSERT INTO `registration` (`ID`, `firstName`, `surName`, `login`, `mail`, `password`, `dateRegistration`, `permissions`) VALUES
(1, 'Dawid', 'Lepszy', 'dawidos', 'dejw@op.pl', 'abc', '2019-04-10', 'admin'),
(2, 'Aleks', 'Lepsza', 'alekss', 'aleks@op.pl', '123', '2019-04-07', 'admin'),
(12, 'Henryk', 'Rozal', 'Rozal11', 'Hen.Roz@wp.pl', 'okej', '2018-08-15', 'user'),
(13, 'Mateusz', 'Prawowski', 'MatPraw22', 'MMati69@wp.pl', 'qaz', '2019-04-13', 'user'),
(14, 'Adam', 'Kasza', 'szadam', 'adam@sz.pl', 'haha', '2019-04-14', 'user'),
(15, 'Dawid', 'Lewandowski', 'Dawidos2', 'dawidos@gmail.com', 'Qaz@1daw', '2019-04-14', 'user'),
(16, 'Paulina', 'Le?', 'Leniu234', 'Str@op.pl', 'zsmNa100%', '2019-04-14', 'user'),
(17, 'Ola', 'Fasola', 'fasola', 'fa@sol.pl', 'aaa!2A', '2019-04-15', 'user');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `events`
--
ALTER TABLE `events`
  ADD PRIMARY KEY (`ID`);

--
-- Indeksy dla tabeli `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `events`
--
ALTER TABLE `events`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT dla tabeli `registration`
--
ALTER TABLE `registration`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
