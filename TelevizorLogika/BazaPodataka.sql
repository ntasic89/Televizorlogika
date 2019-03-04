USE [master]
GO

CREATE DATABASE [RADNJA]
GO

USE [RADNJA]
GO

CREATE TABLE [DBO].[RACUN](
[OznakaRacuna] int not null primary key,
[DatumProdaje] [nvarchar] (60) not null,
[SifraRobe] int not null,
[NazivRobe] [nvarchar] (60) not null
)

GO