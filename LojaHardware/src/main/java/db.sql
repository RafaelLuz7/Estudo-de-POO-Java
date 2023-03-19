CREATE DATABASE lojahardware;

USE lojahardware;

CREATE TABLE PlacaMae (
	codPlacaMae int  PRIMARY KEY,
	modeloPlacaMae varchar(60) NOT NULL,
	descricaoPlacaMae varchar(200) NOT NULL,
	valorPlacaMae decimal(6,2) 
	);

CREATE TABLE Processador (
	codProcessador int PRIMARY KEY,
	modeloProcessador varchar(60) NOT NULL,
	descricaoProcessador varchar(200) NOT NULL,
	valorProcessador decimal(6,2)
	);

CREATE TABLE MontarPc (
	desconto decimal(5,2),
	valor decimal(7,2),
	codPlacaMae int,
	codProcessador int,
	PRIMARY KEY (codPlacaMae,codProcessador),
	FOREIGN KEY (codPlacaMae) REFERENCES PlacaMae(codPlacaMae),
	FOREIGN KEY (codProcessador) REFERENCES Processador(codProcessador)
	);

INSERT INTO PlacaMae values (101,'ASRock 90-MXB9Y0-A0UAYZ','
CPU:
- Soquete AMD AM4 
- Design Digi Power 
- 6 design de fase de energia
- TDP: 105W
Chipset
- AMD Promontory B450', 729.90),(212,'Gigabyte B450M DS3H V2','CPU:
- Soquete AM4: Suporta AMD Ryzen de 3ª Geração / Ryzen de 2ª Geração / Ryzen de 1ª Geração / Ryzen de 2ª Geração com Gráficos Radeon Vega / Ryzen de 1ª Geração com Gráficos Radeon Vega / Athlon com Processadores Gráficos Radeon Vega
Chipset:
- AMD B450',999.99),(542,'ASUS ROG STRIX Z490-F GAMING','Processadores:
- Intel Socket 1200 para 10a Gen Intel Core, Pentium Gold e Celeron
- Suporta processadores Intel de 14 nm
- Suporta Intel Turbo Boost Technology 2.0 e Intel Turbo Boost Max Technology 3.0**
Chipset:
- Intel Z490',1929.90);

INSERT INTO Processador values (147,'AMD YD1600BBAFBOX','Especificações:
- Séries: Ryzen 5 (1600)
- Processo de fabricação: 12nm
- Socket: Socket AM4
- Núcleos: 6 core
- Threads: 12
- Frequência de Operação: 3.2GHz (Max Turbo 3.6GHz)
- Cache L3: 16MB
- Cache L2: 3MB
- Modo de operação: 64 Bit
- Potência: 65 W',789.90),(254,'AMD 00-100000061WOF','CPU:
- Núcleos de CPU: 12
- Threads: 24
- Clock básico: 3.7GHz
- Clock de Max Boost: Até 4.8GHz
- Cachê L2 total: 6MB
- Cachê L3 total: 64MB
- Desbloqueado
- CMOS: TSMC 7nm FinFET
- Soquete: AM4
- Versão do PCI Express PCIe 4.0
- TDP / TDP Padrão: 105W
');

	