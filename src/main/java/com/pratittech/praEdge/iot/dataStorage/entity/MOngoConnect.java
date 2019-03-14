/*package com.pratittech.praEdge.iot.dataStorage.entity;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoDatabase;

public class MOngoConnect {
    public static void main( String args[] ) {

        // Creating a Mongo client
        MongoClient mongo = new MongoClient( "localhost" , 27017 );

        // Creating Credentials
        MongoCredential credential;
        credential = MongoCredential.createCredential("root", "praEdge",
                "megha".toCharArray());
        System.out.println("Connected to the database successfully");

        // Accessing the database
        MongoDatabase database = mongo.getDatabase("praEdge");
        System.out.println("Credentials ::"+ credential);
        System.out.println(database);
    }
}
*/