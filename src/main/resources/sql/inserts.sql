-- ESSE ARQUIVO SÓ DEVE SER EXECUTADO UMA VEZ (OU EM CASO DE MIGRAÇÃO DE BANCO) --
-- SERVE PARA ADICIONAR AS INFORMAÇÕES  AO BANCO--
--NAO USEI AUTO INCREMENT POIS PRECISARIA SABER O ID PARA COLOCAR AS AULAS--

INSERT INTO Departamento VALUES(1, 'Ciências Humanas e Linguagens');
INSERT INTO Departamento VALUES(2, 'Ciências da Natureza e Matemática');
INSERT INTO Departamento VALUES(3, 'Infraestrutura e Tecnologia');
INSERT INTO Departamento VALUES(4, 'Gestão e Processos Industriais');
INSERT INTO Departamento VALUES(5, 'Saúde');

INSERT INTO Periodo VALUES (default, 'Diurno');
INSERT INTO Periodo VALUES (default, 'Noturno');

INSERT INTO Curso VALUES (1, 'Ensino Médio');
INSERT INTO Curso VALUES (2, 'Técnico em Desenvolvimento de Sistemas');
INSERT INTO Curso VALUES (3, 'Técnico em Edificações');
INSERT INTO Curso VALUES (4, 'Técnico em Geodésia e Cartografia');
INSERT INTO Curso VALUES (5, 'Técnico em Mecânica');
INSERT INTO Curso VALUES (6, 'Técnico em Qualidade");
INSERT INTO Curso VALUES (7, 'Técnico em Enfermagem');

--HUMANAS E LINGUAGEM ENSINO MÉDIO
INSERT INTO Materia VALUES (1, 1, 'Artes');
INSERT INTO Materia VALUES (2, 1, 'Espanhol');
INSERT INTO Materia VALUES (3, 1, 'Língua Portuguesa');
INSERT INTO Materia VALUES (4, 1, 'Inglês');
INSERT INTO Materia VALUES (5, 1, 'Filosofia');
INSERT INTO Materia VALUES (6, 1, 'Sociologia');
INSERT INTO Materia VALUES (7, 1, 'História');
INSERT INTO Materia VALUES (8, 1, 'Geografia');
INSERT INTO Materia VALUES (9, 1, 'Educação Física');
INSERT INTO Materia VALUES (10, 1, 'Literatura');
INSERT INTO Materia VALUES (11, 1, 'Ética');

--NATUREZA E EXATAS ENSINO MÉDIO
INSERT INTO Materia VALUES (12, 2, 'Física');
INSERT INTO Materia VALUES (13, 2, 'Química');
INSERT INTO Materia VALUES (14, 2, 'Biologia');
INSERT INTO Materia VALUES (15, 2, 'Matemática');
INSERT INTO Materia VALUES (16, 2, 'Estatística');

--PD
INSERT INTO Materia VALUES (17, 3, 'Banco de Dados');
INSERT INTO Materia VALUES (18, 3, 'Lógica de Programação');
INSERT INTO Materia VALUES (19, 3, 'Análise de Projetos');
INSERT INTO Materia VALUES (20, 3, 'Sistemas Operacionais e Redes');
INSERT INTO Materia VALUES (21, 3, 'Desenvolvimento de Aplicações Desktop');
INSERT INTO Materia VALUES (22, 3, 'Gestão de TI');
INSERT INTO Materia VALUES (23, 3, 'Sistemas Operacionais');
INSERT INTO Materia VALUES (24, 3, 'Técnicas Digitais e Fundamentos em Eletrônica');
INSERT INTO Materia VALUES (25, 3, 'Desenvolvimento Web');
INSERT INTO Materia VALUES (26, 3, 'Estrutura de Dados');
INSERT INTO Materia VALUES (27, 3, 'Linguagem de Programação Multiplataforma');
INSERT INTO Materia VALUES (28, 3, 'Desenvolvimento de Projetos');
INSERT INTO Materia VALUES (29, 3, 'Desenvolvimento de Sistemas Embarcados');
INSERT INTO Materia VALUES (30, 3, 'Inovação');
INSERT INTO Materia VALUES (31, 3, 'Desenvolvimento para Dispostivos Móveis');

--CCD
INSERT INTO Materia VALUES (32, 3, 'Desenho Técnico');
INSERT INTO Materia VALUES (33, 3, 'Estatica');
INSERT INTO Materia VALUES (34, 3, 'Gestão Ambiental');
INSERT INTO Materia VALUES (35, 3, 'Tecnologia da Construção');
INSERT INTO Materia VALUES (36, 3, 'Materiais de Construção');
INSERT INTO Materia VALUES (37, 3, 'Editoração Gráfica');
INSERT INTO Materia VALUES (38, 3, 'Mecânica de Fluídos');
INSERT INTO Materia VALUES (39, 3, 'Desenho Arquitetônico 2');
INSERT INTO Materia VALUES (40, 3, 'Instalação Elétrica');
INSERT INTO Materia VALUES (41, 3, 'Mecânica dos Solos');
INSERT INTO Materia VALUES (42, 3, 'Topologia 1');
INSERT INTO Materia VALUES (43, 3, 'Segurança no Trabalho');
INSERT INTO Materia VALUES (44, 3, 'Fundações e Elementos Enterrados ');
INSERT INTO Materia VALUES (45, 3, 'Instalações Prediais, Hidráulicas e Sanitárias ');
INSERT INTO Materia VALUES (46, 3, 'Topologia 2');
INSERT INTO Materia VALUES (47, 3, 'ESTRUTUR');
INSERT INTO Materia VALUES (48, 3, 'Planejamento Urbano');
INSERT INTO Materia VALUES (49, 3, 'Desenho Arquitetônico 3');
INSERT INTO Materia VALUES (50, 3, 'Resistência dos Materiais ');
INSERT INTO Materia VALUES (51, 3, 'Técnologia da Construção 2');
INSERT INTO Materia VALUES (52, 3, 'Planejamento de Orçamento');
INSERT INTO Materia VALUES (53, 3, 'Concreto Armado');

--GEO
INSERT INTO Materia VALUES (54, 3, 'Geologia');
INSERT INTO Materia VALUES (55, 3, 'SOLOS');
INSERT INTO Materia VALUES (56, 3, 'DTOP');
INSERT INTO Materia VALUES (57, 3, 'DES ARQ');
INSERT INTO Materia VALUES (58, 3, 'AVAL TER');
INSERT INTO Materia VALUES (59, 3, 'Topologia 1');
INSERT INTO Materia VALUES (60, 3, 'Segurança no Trabalho');
INSERT INTO Materia VALUES (61, 3, 'Cartografia');
INSERT INTO Materia VALUES (62, 3, 'HIDROL');
INSERT INTO Materia VALUES (63, 3, 'GEOCIE');
INSERT INTO Materia VALUES (64, 3, 'S INF GEO');
INSERT INTO Materia VALUES (65, 3, 'CALCULO');
INSERT INTO Materia VALUES (66, 3, 'Topologia 2');
INSERT INTO Materia VALUES (67, 3, 'ESTRADAS');
INSERT INTO Materia VALUES (68, 3, 'AVAL TERR');
INSERT INTO Materia VALUES (69, 3, 'PL URB');
INSERT INTO Materia VALUES (70, 3, 'PEDOLOG');
INSERT INTO Materia VALUES (71, 3, 'Topologia 3');
INSERT INTO Materia VALUES (72, 3, 'GEST AMB');
INSERT INTO Materia VALUES (73, 3, 'SENSORIA');
INSERT INTO Materia VALUES (74, 3, 'LEGISLAÇ');

--MED
INSERT INTO Materia VALUES (75, 3, 'Geologia');
INSERT INTO Materia VALUES (76, 3, 'SOLOS');
INSERT INTO Materia VALUES (78, 3, 'DTOP');
INSERT INTO Materia VALUES (77, 3, 'DES ARQ');
INSERT INTO Materia VALUES (78, 3, 'AVAL TER');
INSERT INTO Materia VALUES (79, 3, 'Topologia 1');
INSERT INTO Materia VALUES (80, 3, 'Segurança no Trabalho');
INSERT INTO Materia VALUES (81, 3, 'Cartografia');
INSERT INTO Materia VALUES (82, 3, 'HIDROL');
INSERT INTO Materia VALUES (83, 3, 'GEOCIE');
INSERT INTO Materia VALUES (84, 3, 'S INF GEO');
INSERT INTO Materia VALUES (85, 3, 'CALCULO');
INSERT INTO Materia VALUES (86, 3, 'Topologia 2');
INSERT INTO Materia VALUES (87, 3, 'ESTRADAS');
INSERT INTO Materia VALUES (88, 3, 'AVAL TERR');
INSERT INTO Materia VALUES (89, 3, 'PL URB');
INSERT INTO Materia VALUES (90, 3, 'PEDOLOG');
INSERT INTO Materia VALUES (91, 3, 'Topologia 3');
INSERT INTO Materia VALUES (92, 3, 'GEST AMB');
INSERT INTO Materia VALUES (93, 3, 'SENSORIA');
INSERT INTO Materia VALUES (94, 3, 'LEGISLAÇ');

