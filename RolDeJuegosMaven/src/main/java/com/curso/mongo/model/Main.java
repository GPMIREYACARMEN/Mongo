
package com.curso.mongo.model;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.bson.Document;

public class Main {
    static MongoCollection<Document> collection;
    static MongoDatabase db ;
    static MongoCredential credencial;
    static MongoClient clienteMongo;
    static Document document;
    
    
    
    public static void main(String[] args) {
        
        Conexion();
        
        Crear();
        Mostrar();
        Cerrar();
    }
    public static void Crear(){
         Campeon c = new Campeon("Juan",25,"hombre",2, 2.5,new Date());
        document = new Document("idCampeon",1)
                .append("nombre",c.getNombre())
                .append("Edad",c.getEdad())
                .append("sexo",c.getSexo())
                .append("tipo", c.getTipo())
                .append("precio", c.getPrecio())
                .append("fechaCreacion", c.getFechaCreacion())
                .append("fechaActualización", "")
                .append("fechaEliminacion", "");
        collection.insertOne(document);
        System.out.println("Documento Insertado Correctamente");
    }
    public static void Conexion(){
        clienteMongo= new MongoClient("localhost",27017);
        
        
        credencial = MongoCredential.createCredential("root","JPA","root".toCharArray());
        //DB db= clienteMongo.getDB("JPA");
        db = clienteMongo.getDatabase("RolDeJuegosPrueba");
        
        collection = db.getCollection("campeon");
    }
    
    public static void Mostrar(){
        for (Map.Entry<String, Object> set : document.entrySet()) {
                       
            System.out.format("%s: %s%n", set.getKey(), set.getValue());
        }

    }
    
    public  static void Eliminar(){
        /*for (Map.Entry<String, Object> set : document.remove(db)) {
                       
            System.out.format("%s: %s%n", set.getKey(), set.getValue());
        }*/
    }
    public static void Cerrar(){
        clienteMongo.close(); // cerrar la base de datos
    }
    
    
}
