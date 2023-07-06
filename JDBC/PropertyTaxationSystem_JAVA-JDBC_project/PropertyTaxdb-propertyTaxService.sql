	create database propertytaxdb;
    
	use propertytaxdb;
    
    show tables;
    
	select * from propertyTax;
    
	delete from propertytax;
    
	create table propertyTax(
	propertyId varchar(20) primary key,
	ownersName varchar(30),
	areaInSqFt float,
	propertyType varchar(30),
	taxAmount float,
	dateOfPyt date,
	dueDate date,
	revisedTaxAmtInRs float
	);
    
	drop table propertytax;