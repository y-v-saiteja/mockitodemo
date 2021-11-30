package com.coforge.training.mockitoDemo;

public class RecordService {
	//dependencies
	DatabaseDAO database;
	NetworkDAO network;
	public DatabaseDAO getDatabase() {
		return database;
	}
	public void setDatabase(DatabaseDAO database) {
		this.database = database;
	}
	public NetworkDAO getNetwork() {
		return network;
	}
	public void setNetwork(NetworkDAO network) {
		this.network = network;
	}
	public boolean save(String fileName)
	{
	database.save(fileName);
	System.out.println("Saved in database in Main class");

	network.save(fileName);
	System.out.println("Saved in network in Main class");

	return true;
	}
	

}
