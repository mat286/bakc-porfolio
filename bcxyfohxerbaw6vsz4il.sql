-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: bcxyfohxerbaw6vsz4il-mysql.services.clever-cloud.com:3306
-- Generation Time: Jun 17, 2023 at 09:44 PM
-- Server version: 8.0.15-5
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bcxyfohxerbaw6vsz4il`
--

-- --------------------------------------------------------

--
-- Table structure for table `conocimiento`
--

CREATE TABLE `conocimiento` (
  `id` bigint(20) NOT NULL,
  `img` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `porcentaje` bigint(20) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `conocimiento`
--

INSERT INTO `conocimiento` (`id`, `img`, `nombre`, `porcentaje`, `tipo`) VALUES
(52, './assets/fotos/html.avif', 'HTML', 95, 'lenguajeProgrmacion'),
(53, './assets/fotos/css.svg', 'CSS', 80, 'lenguajeProgrmacion'),
(54, './assets/fotos/Bootstrap.svg.png', 'Bootstrap', 80, 'framework'),
(55, './assets/fotos/js.svg.png', 'JavaScript', 90, 'lenguajeProgrmacion'),
(102, './assets/fotos/Typescript.svg', 'TypeScript', 75, 'lenguajeProgrmacion'),
(103, './assets/fotos/Python.svg.png', 'Python', 30, 'lenguajeProgrmacion'),
(104, './assets/fotos/Arduino.svg.png', 'Arduino', 60, 'lenguajeProgrmacion'),
(105, './assets/fotos/github.png', 'GitHub', 60, 'herramientas'),
(106, './assets/fotos/angular.png', 'Angular', 85, 'framework'),
(108, 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/C_Programming_Language.svg/1200px-C_Programming_Language.svg.png', 'Lenguaje C', 15, 'lenguajeProgrmacion'),
(109, 'https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Visual_Studio_Code_1.35_icon.svg/2048px-Visual_Studio_Code_1.35_icon.svg.png', 'Visual Studio Code', 75, 'herramienta'),
(110, 'https://i.blogs.es/8d2420/650_1000_java/1366_2000.png', 'Java', 60, 'lenguajeProgrmacion'),
(111, 'https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Git-logo.svg/1280px-Git-logo.svg.png', 'Git', 55, 'herramienta'),
(113, 'https://upload.wikimedia.org/wikipedia/commons/thumb/9/91/Octicons-mark-github.svg/2048px-Octicons-mark-github.svg.png', 'Github', 55, 'herramienta'),
(114, 'https://blog.irontec.com/wp-content/uploads/2016/01/mysql-logo.png', 'MySQL', 75, 'lenguajeProgrmacion'),
(115, 'https://upload.wikimedia.org/wikipedia/commons/9/95/PhpMyAdmin_logo.png', 'phpmyadmin', 80, 'herramienta'),
(116, 'https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Apache_NetBeans_Logo.svg/1200px-Apache_NetBeans_Logo.svg.png', 'Apache NetBeans', 55, 'herramienta'),
(117, 'https://cursosdedesarrollo.com/wp-content/uploads/2022/03/spring-boot.png', 'Spring Boot', 60, ''),
(118, 'https://cursosdedesarrollo.com/wp-content/uploads/2022/03/spring-boot.png', 'Spring Boot', 60, 'framework'),
(202, 'https://cdn.worldvectorlogo.com/logos/postman.svg', 'Postman', 90, 'herramienta'),
(302, 'https://assets.zabbix.com/img/brands/nodejs.svg', 'Nodejs', 45, 'framework'),
(352, 'https://cdn.icon-icons.com/icons2/1381/PNG/512/xampp_94513.png', 'Xampp', 65, 'herramienta');

-- --------------------------------------------------------

--
-- Table structure for table `conocimiento_seq`
--

CREATE TABLE `conocimiento_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `conocimiento_seq`
--

INSERT INTO `conocimiento_seq` (`next_val`) VALUES
(451),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `educacion`
--

CREATE TABLE `educacion` (
  `id` bigint(20) NOT NULL,
  `fin` varchar(255) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `info` varchar(2500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `inicio` varchar(255) DEFAULT NULL,
  `institucion` varchar(255) DEFAULT NULL,
  `tipo` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `educacion`
--

INSERT INTO `educacion` (`id`, `fin`, `img`, `info`, `inicio`, `institucion`, `tipo`, `titulo`) VALUES
(3, '', './assets/fotos/utn.jpg', 'Actualmente estoy estudiando Ingeniería Electrónica en la Universidad Tecnológica Nacional (UTN). La carrera proporciona una base sólida en los fundamentos de la electrónica, incluyendo circuitos eléctricos, sistemas digitales, análisis de señales y sistemas, comunicaciones y electrónica analógica y digital. Además, se cubren temas más avanzados, como la instrumentación electrónica, el procesamiento de señales, la ingeniería de control, la microelectrónica y la robótica. Este conocimiento puede ser útil en una variedad de áreas, como la electrónica de consumo, la industria de la tecnología y la investigación y desarrollo de productos electrónicos.', '2023-03-01', 'Universidad Tecnológica Nacional', 'Universitario', 'Ingenieria Electronica'),
(4, '2020-12-11', './assets/fotos/aprende programando.png', 'Obtuve un título en robótica e impresión 3D a través del programa ´Aprende Programando Virtual 3.0´, el cual proporciona conocimientos teóricos y prácticos en diseño e impresión 3D, robótica, automatización, sensores y actuadores, interfaz humano-robot y seguridad. En este curso, se utiliza la plataforma Arduino para programar y controlar los dispositivos robóticos e impresoras 3D. Este conocimiento puede ser útil en áreas como la ingeniería, la investigación y el desarrollo de productos.', '2020-08-24', 'Aprende Programando Virtual 3.0', 'Universitario', 'Robótica e impresión 3D'),
(52, '2023-05-15', './assets/fotos/seProgramar.png', 'Obtuve un título en Programación Full Stack Jr a través del programa Argentina Programa 4.0. El curso proporciona conocimientos teóricos y prácticos en el desarrollo de aplicaciones web, utilizando lenguajes de programación como HTML, CSS, JavaScript, TypeScript, Angular, Java y SQL. Además, se cubren temas como DevOps, control de versiones, metodologías ágiles y desarrollo de aplicaciones móviles. Este conocimiento puede ser útil en áreas como el desarrollo de aplicaciones web y móviles, la creación de productos digitales y la ingeniería de software.', '2022-10-18', 'Argentina Programa 4.0.', 'Curso', '#YoProgramo'),
(53, '2021-06-01', './assets/fotos/itba_logo.jpg', 'Obtuve un título introductorio en Python a través del programa de formación del IEEE - ITBA. El curso proporciona una introducción a los conceptos básicos de programación en Python, incluyendo variables, operadores, estructuras de control de flujo, funciones, módulos y manejo de excepciones. También se cubren temas más avanzados, como programación orientada a objetos, uso de librerías y módulos de Python para aplicaciones científicas y de datos, y desarrollo web con Python. Este conocimiento puede ser útil en una variedad de áreas, como la ingeniería, la ciencia de datos, la programación de aplicaciones y el desarrollo web.', '2021-05-02', 'IEEE - ITBA.', 'Curso', 'Curso introductorio de python'),
(54, '2020-12-15', 'https://billetto.imgix.net/m8pscns05rgmi906m3klf6ow62gv?s=8d15e8dc4759e53666153ba644c2910e', 'Obtuve un título de Técnico en Diseño de Interiores en la Escuela Técnica Nº6 Fernando Fader. El programa de estudio proporcionó conocimientos en áreas como el diseño de espacios interiores, la elección de materiales y acabados, la iluminación, la planificación de proyectos y la presentación de proyectos a clientes. También se cubrieron temas como la historia del diseño de interiores y la teoría del color. Este conocimiento puede ser útil en una variedad de áreas, como el diseño de interiores para viviendas, negocios, oficinas y otros espacios comerciales.', '2015-03-01', 'Escuela Técnica Nº6 Fernando Fader', 'Secundario', 'Tecnico en diseño de interior');

-- --------------------------------------------------------

--
-- Table structure for table `educacion_seq`
--

CREATE TABLE `educacion_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `educacion_seq`
--

INSERT INTO `educacion_seq` (`next_val`) VALUES
(201),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `experiencia`
--

CREATE TABLE `experiencia` (
  `id` bigint(20) NOT NULL,
  `fin` varchar(255) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `info` varchar(2500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `inicio` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `puesto` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experiencia`
--

INSERT INTO `experiencia` (`id`, `fin`, `img`, `info`, `inicio`, `nombre`, `puesto`) VALUES
(5, '', 'https://upload.wikimedia.org/wikipedia/commons/e/e2/Ministerio_de_Econom%C3%ADa_arg.png', 'Trabajo en la coordinación de sistemas operativos en el departamento de Presupuesto del Ministerio de Economía. Garantizo que los sistemas operativos trabajen juntos de manera eficiente y he liderado proyectos de desarrollo de software para mejorar el funcionamiento del departamento. Mi trabajo implica estar al tanto de soluciones tecnológicas para mejorar la eficiencia del departamento. En resumen, mi trabajo es esencial para asegurar que el departamento de presupuesto tenga los recursos tecnológicos necesarios para llevar a cabo su trabajo de manera efectiva.', '2023-02-01', 'Ministerio de Economia', 'Coordinacion de Sistemas Operativos');

-- --------------------------------------------------------

--
-- Table structure for table `experiencia_seq`
--

CREATE TABLE `experiencia_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experiencia_seq`
--

INSERT INTO `experiencia_seq` (`next_val`) VALUES
(301),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `herramientas`
--

CREATE TABLE `herramientas` (
  `id` bigint(20) NOT NULL,
  `id_proyecto` bigint(20) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `herramientas`
--

INSERT INTO `herramientas` (`id`, `id_proyecto`, `nombre`) VALUES
(352, 202, 'MySQL'),
(353, 202, 'HTML'),
(354, 202, 'Angular'),
(355, 202, 'CSS'),
(356, 202, 'Java');

-- --------------------------------------------------------

--
-- Table structure for table `herramientas_seq`
--

CREATE TABLE `herramientas_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `herramientas_seq`
--

INSERT INTO `herramientas_seq` (`next_val`) VALUES
(551),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE `persona` (
  `id` bigint(20) NOT NULL,
  `foto_persona` varchar(255) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `url_github` varchar(255) DEFAULT NULL,
  `url_instagram` varchar(255) DEFAULT NULL,
  `url_linkedin` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona`
--

INSERT INTO `persona` (`id`, `foto_persona`, `info`, `url_github`, `url_instagram`, `url_linkedin`) VALUES
(1, './assets/fotos/IMG-20220215-WA0096.jpg', '2023-05-21T03:04:29.484Z', 'https://github.com/mat286', 'https://www.instagram.com/_mate__o/', 'https://www.linkedin.com/in/mateo-rivera-8b3811265/');

-- --------------------------------------------------------

--
-- Table structure for table `persona_seq`
--

CREATE TABLE `persona_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona_seq`
--

INSERT INTO `persona_seq` (`next_val`) VALUES
(101),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `proyectos`
--

CREATE TABLE `proyectos` (
  `id` bigint(20) NOT NULL,
  `fecha` varchar(255) DEFAULT NULL,
  `img` varchar(255) DEFAULT NULL,
  `info` varchar(2500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `puesto` varchar(255) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyectos`
--

INSERT INTO `proyectos` (`id`, `fecha`, `img`, `info`, `nombre`, `puesto`, `url`) VALUES
(202, '2023-05-01', 'https://img.freepik.com/vector-premium/portafolio_9206-678.jpg', 'Un portafolio web es una colección de trabajos, proyectos y logros profesionales presentados en un sitio web. Generalmente, está diseñado para demostrar tus habilidades, conocimientos y experiencia en un área específica y permite a los posibles empleadores o clientes ver tu trabajo y habilidades de una manera visualmente atractiva e interactiva. Un portafolio web puede incluir proyectos, diseños, habilidades técnicas y certificaciones, además de información personal y de contacto.', 'Portafolio Web', NULL, 'https://porfolio-784e6.web.app/');

-- --------------------------------------------------------

--
-- Table structure for table `proyectos_seq`
--

CREATE TABLE `proyectos_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyectos_seq`
--

INSERT INTO `proyectos_seq` (`next_val`) VALUES
(501),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `sobre_mi`
--

CREATE TABLE `sobre_mi` (
  `id` bigint(20) NOT NULL,
  `img` varchar(255) DEFAULT NULL,
  `info` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `url_cv` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sobre_mi`
--

INSERT INTO `sobre_mi` (`id`, `img`, `info`, `url_cv`) VALUES
(2, './assets/fotos/Black Professional Resume (3).jpg', '¡Hola! Soy Facundo Mateo Rivera, un apasionado de la programación y el diseño, actualmente trabajando en el Ministerio de Economía en el área de Coordinación de Sistemas Operativos del departamento de presupuesto. Nací en Argentina el 13 de Febrero de 2002 y estoy estudiando Ingeniería Electrónica en la Universidad Tecnológica Nacional (UTN). Fuera del trabajo y los estudios, dedico mi tiempo libre a estar al día con las tecnologías emergentes como criptomonedas, blockchain y web3, siempre en busca de aprender nuevos lenguajes de programación y ampliar mis habilidades en el campo de la programación. Para mí, el aprendizaje continuo es fundamental para el crecimiento profesional y personal. Siempre estoy en busca de nuevos desafíos y oportunidades para aprender y mejorar mis habilidades, lo que me ha permitido desarrollar soluciones innovadoras para enfrentar los retos del mundo actual. Me encantaría compartir mis habilidades y conocimientos contigo, y trabajar juntos para encontrar soluciones creativas a cualquier problema que puedas tener. ¡Gracias por conocer un poco más sobre mí!', 'https://www.canva.com/design/DAEUkK7gW1Y/kUAPFA5k9EADCkHgpMkWeg/view?utm_content=DAEUkK7gW1Y&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton');

-- --------------------------------------------------------

--
-- Table structure for table `sobre_mi_seq`
--

CREATE TABLE `sobre_mi_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sobre_mi_seq`
--

INSERT INTO `sobre_mi_seq` (`next_val`) VALUES
(101),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `admin` bit(1) DEFAULT NULL,
  `contrasena` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `admin`, `contrasena`, `nombre`) VALUES
(1, b'1', '12345678', 'mateo');

-- --------------------------------------------------------

--
-- Table structure for table `user_seq`
--

CREATE TABLE `user_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user_seq`
--

INSERT INTO `user_seq` (`next_val`) VALUES
(51),
(1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `conocimiento`
--
ALTER TABLE `conocimiento`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `educacion`
--
ALTER TABLE `educacion`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `experiencia`
--
ALTER TABLE `experiencia`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `herramientas`
--
ALTER TABLE `herramientas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `proyectos`
--
ALTER TABLE `proyectos`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sobre_mi`
--
ALTER TABLE `sobre_mi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
