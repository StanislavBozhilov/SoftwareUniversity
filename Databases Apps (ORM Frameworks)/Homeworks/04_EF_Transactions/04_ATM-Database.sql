CREATE DATABASE ATM
GO

USE ATM
GO

CREATE TABLE CardAccounts(
	Id int PRIMARY KEY IDENTITY,
	CardNumber nvarchar(10) UNIQUE NOT NULL,
	CardPIN nvarchar(4) NOT NULL,
	CardCash money NOT NULL
)
GO

INSERT INTO CardAccounts(CardNumber, CardPIN, CardCash)
VALUES('7894789512', '1234', 10000),
	('7894787426', '1111', 100)