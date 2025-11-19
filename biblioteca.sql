-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 19/11/2025 às 19:07
-- Versão do servidor: 10.4.32-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `acervos`
--

CREATE TABLE `acervos` (
  `id_acervos` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `titulo1` varchar(50) DEFAULT NULL,
  `titulo2` varchar(50) DEFAULT NULL,
  `autor` varchar(50) DEFAULT NULL,
  `outrosAutores` varchar(100) DEFAULT NULL,
  `edicao` varchar(50) DEFAULT NULL,
  `tipoAcervo` int(11) DEFAULT NULL,
  `codEditora` int(11) DEFAULT NULL,
  `anoEdicao` int(11) DEFAULT NULL,
  `origem` int(11) DEFAULT NULL,
  `categoria` int(11) DEFAULT NULL,
  `numTombo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `acervos`
--

INSERT INTO `acervos` (`id_acervos`, `codigo`, `titulo1`, `titulo2`, `autor`, `outrosAutores`, `edicao`, `tipoAcervo`, `codEditora`, `anoEdicao`, `origem`, `categoria`, `numTombo`) VALUES
(1, 1001, 'O Senhor dos Anéis', 'A Sociedade do Anel', 'J.R.R. Tolkien', 'Christopher Tolkien', '1ª edição', 1, 10, 1954, 2, 3, 12345),
(2, 1002, 'Dom Casmurro', '', 'Machado de Assis', '', '2ª edição', 1, 20, 1899, 1, 4, 12346),
(3, 1003, '1984', '', 'George Orwell', '', '3ª edição', 1, 30, 1949, 3, 5, 12347),
(4, 1004, 'O Pequeno Príncipe', '', 'Antoine de Saint-Exupéry', '', '1ª edição', 1, 40, 1943, 2, 6, 12348),
(5, 1005, 'Cem Anos de Solidão', '', 'Gabriel García Márquez', '', '4ª edição', 1, 50, 1967, 1, 7, 12349);

-- --------------------------------------------------------

--
-- Estrutura para tabela `acervosautor`
--

CREATE TABLE `acervosautor` (
  `id_acervosAutor` int(11) NOT NULL,
  `id_autor` int(11) NOT NULL,
  `id_acervos` int(11) NOT NULL,
  `codAcervos` int(11) DEFAULT NULL,
  `codAutor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `acervosautor`
--

INSERT INTO `acervosautor` (`id_acervosAutor`, `id_autor`, `id_acervos`, `codAcervos`, `codAutor`) VALUES
(21, 1, 5, 5001, 101),
(22, 2, 4, 5002, 102),
(23, 3, 3, 5003, 103),
(24, 4, 2, 5004, 104),
(25, 5, 1, 5005, 105);

-- --------------------------------------------------------

--
-- Estrutura para tabela `autor`
--

CREATE TABLE `autor` (
  `id_autor` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `numAutor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `autor`
--

INSERT INTO `autor` (`id_autor`, `codigo`, `nome`, `numAutor`) VALUES
(1, 101, 'Paulo Coelho', 1),
(2, 102, 'Clarice Lispector', 2),
(3, 103, 'Machado de Assis', 3),
(4, 104, 'J.K. Rowling', 4),
(5, 105, 'George Orwell', 5);

-- --------------------------------------------------------

--
-- Estrutura para tabela `categoria`
--

CREATE TABLE `categoria` (
  `id_categoria` int(11) NOT NULL,
  `id_acervos` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `descricao` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `clientes`
--

CREATE TABLE `clientes` (
  `id_clientes` int(11) NOT NULL,
  `id_acervos` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `endereco` varchar(30) DEFAULT NULL,
  `cidade` varchar(20) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `observacao` varchar(100) DEFAULT NULL,
  `situacao` varchar(100) DEFAULT NULL,
  `codPorCliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `clientes`
--

INSERT INTO `clientes` (`id_clientes`, `id_acervos`, `codigo`, `nome`, `endereco`, `cidade`, `telefone`, `observacao`, `situacao`, `codPorCliente`) VALUES
(56, 1, 101, '2001', 'Ana Silva', 'Rua A, 123', 'São Paulo', '11987654321', 'Cliente regular, pede livros frequentemente.', 0),
(57, 2, 102, '2002', 'Carlos Souza', 'Av. B, 456', 'Campinas', '11991234567', 'Cliente com histórico de devoluções em atraso.', 0),
(58, 3, 103, '2003', 'Juliana Farias', 'Rua C, 789', 'Santos', '11988776655', 'Cliente novo, ainda não realizou empréstimos.', 0),
(59, 4, 104, '2004', 'Rafael Costa', 'Av. D, 101', 'Guarulhos', '11999887766', 'Cliente com interesse em literatura científica.', 0),
(60, 5, 105, '2005', 'Beatriz Novaes', 'Rua E, 202', 'Osasco', '11995544332', 'Cliente com histórico de empréstimos pontuais.', 0);

-- --------------------------------------------------------

--
-- Estrutura para tabela `editora`
--

CREATE TABLE `editora` (
  `id_editora` int(11) NOT NULL,
  `id_acervos` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `descricao` varchar(100) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estrutura para tabela `emprestimo`
--

CREATE TABLE `emprestimo` (
  `id_emprestimo` int(11) NOT NULL,
  `id_clientes` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `dataEntregue` date DEFAULT NULL,
  `codTombo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `emprestimo`
--

INSERT INTO `emprestimo` (`id_emprestimo`, `id_clientes`, `codigo`, `dataEntregue`, `codTombo`) VALUES
(21, 56, 5001, '2025-01-10', 12001),
(22, 57, 5002, '2025-01-12', 12015),
(23, 58, 5003, '2025-01-15', 11987),
(24, 59, 5004, '2025-01-18', 11890),
(25, 60, 5005, '2025-01-20', 12100);

-- --------------------------------------------------------

--
-- Estrutura para tabela `parametrosdabiblioteca`
--

CREATE TABLE `parametrosdabiblioteca` (
  `id_parametrosDaBiblioteca` int(11) NOT NULL,
  `nome` varchar(20) DEFAULT NULL,
  `endereco` varchar(20) DEFAULT NULL,
  `cidade` varchar(20) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `pais` varchar(20) DEFAULT NULL,
  `cep` int(8) DEFAULT NULL,
  `telefone` int(20) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `valor_multa` double(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `parametrosdabiblioteca`
--

INSERT INTO `parametrosdabiblioteca` (`id_parametrosDaBiblioteca`, `nome`, `endereco`, `cidade`, `estado`, `pais`, `cep`, `telefone`, `email`, `valor_multa`) VALUES
(1, 'Biblioteca Central', 'Rua A, 123', 'São Paulo', 'SP', 'Brasil', 12345678, 112233445, 'central@biblioteca.com', 2.50),
(2, 'Biblioteca Norte', 'Av B, 200', 'Campinas', 'SP', 'Brasil', 87654321, 119998877, 'norte@biblioteca.com', 3.00),
(3, 'Biblioteca Sul', 'Rua C, 50', 'Santos', 'SP', 'Brasil', 11223344, 139887766, 'sul@biblioteca.com', 1.75),
(4, 'Biblioteca Leste', 'Av D, 700', 'Guarulhos', 'SP', 'Brasil', 44556677, 119112233, 'leste@biblioteca.com', 2.00),
(5, 'Biblioteca Oeste', 'Rua E, 89', 'Osasco', 'SP', 'Brasil', 55667788, 114445556, 'oeste@biblioteca.com', 2.25);

-- --------------------------------------------------------

--
-- Estrutura para tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuarios` int(11) NOT NULL,
  `codigo` int(11) DEFAULT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `tipo_usuario` varchar(30) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `login` varchar(50) DEFAULT NULL,
  `senha` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Despejando dados para a tabela `usuarios`
--

INSERT INTO `usuarios` (`id_usuarios`, `codigo`, `nome`, `tipo_usuario`, `telefone`, `login`, `senha`) VALUES
(1, 101, 'Ana Ribeiro', 'Administrador', '11987654321', 'anarib', 'senha123'),
(2, 102, 'Carlos Mendes', 'Bibliotecario', '11991234567', 'cmendes', 'livros2024'),
(3, 103, 'Juliana Farias', 'Leitor', '11988776655', 'jufarias', 'ju1234'),
(4, 104, 'Rafael Costa', 'Leitor', '11999887766', 'rafac', 'rcpassword'),
(5, 105, 'Beatriz Novaes', 'Bibliotecario', '11995544332', 'bnov', 'bib2024');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `acervos`
--
ALTER TABLE `acervos`
  ADD PRIMARY KEY (`id_acervos`);

--
-- Índices de tabela `acervosautor`
--
ALTER TABLE `acervosautor`
  ADD PRIMARY KEY (`id_acervosAutor`),
  ADD KEY `id_acervos` (`id_acervos`),
  ADD KEY `id_autor` (`id_autor`);

--
-- Índices de tabela `autor`
--
ALTER TABLE `autor`
  ADD PRIMARY KEY (`id_autor`);

--
-- Índices de tabela `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id_categoria`),
  ADD KEY `id_acervos` (`id_acervos`);

--
-- Índices de tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_clientes`),
  ADD KEY `id_acervos` (`id_acervos`);

--
-- Índices de tabela `editora`
--
ALTER TABLE `editora`
  ADD PRIMARY KEY (`id_editora`),
  ADD KEY `id_acervos` (`id_acervos`);

--
-- Índices de tabela `emprestimo`
--
ALTER TABLE `emprestimo`
  ADD PRIMARY KEY (`id_emprestimo`),
  ADD KEY `id_clientes` (`id_clientes`);

--
-- Índices de tabela `parametrosdabiblioteca`
--
ALTER TABLE `parametrosdabiblioteca`
  ADD PRIMARY KEY (`id_parametrosDaBiblioteca`);

--
-- Índices de tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuarios`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `acervos`
--
ALTER TABLE `acervos`
  MODIFY `id_acervos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `acervosautor`
--
ALTER TABLE `acervosautor`
  MODIFY `id_acervosAutor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de tabela `autor`
--
ALTER TABLE `autor`
  MODIFY `id_autor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id_categoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_clientes` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- AUTO_INCREMENT de tabela `editora`
--
ALTER TABLE `editora`
  MODIFY `id_editora` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `emprestimo`
--
ALTER TABLE `emprestimo`
  MODIFY `id_emprestimo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de tabela `parametrosdabiblioteca`
--
ALTER TABLE `parametrosdabiblioteca`
  MODIFY `id_parametrosDaBiblioteca` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuarios` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `acervosautor`
--
ALTER TABLE `acervosautor`
  ADD CONSTRAINT `acervosautor_ibfk_1` FOREIGN KEY (`id_acervos`) REFERENCES `acervos` (`id_acervos`),
  ADD CONSTRAINT `acervosautor_ibfk_2` FOREIGN KEY (`id_autor`) REFERENCES `autor` (`id_autor`);

--
-- Restrições para tabelas `categoria`
--
ALTER TABLE `categoria`
  ADD CONSTRAINT `categoria_ibfk_1` FOREIGN KEY (`id_acervos`) REFERENCES `acervos` (`id_acervos`);

--
-- Restrições para tabelas `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`id_acervos`) REFERENCES `acervos` (`id_acervos`);

--
-- Restrições para tabelas `editora`
--
ALTER TABLE `editora`
  ADD CONSTRAINT `editora_ibfk_1` FOREIGN KEY (`id_acervos`) REFERENCES `acervos` (`id_acervos`);

--
-- Restrições para tabelas `emprestimo`
--
ALTER TABLE `emprestimo`
  ADD CONSTRAINT `emprestimo_ibfk_1` FOREIGN KEY (`id_clientes`) REFERENCES `clientes` (`id_clientes`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
