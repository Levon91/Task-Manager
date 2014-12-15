package am.iguan.taskmanager.test;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * Created by Admin on 13.12.2014.
 */
public class Test {



    public static void main(String[] args) {
        System.out.println("test");
        try {
            DB db = (new MongoClient("localhost", 27017)).getDB("task_manager");
            DBCollection collection = db.getCollection("task");
            BasicDBObject object = new BasicDBObject();
            for (int i = 1; i < 10; i++) {
                object.put("id", i);
                collection.insert(object);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
            System.out.println("error e texi unecel.");
        }

    }
}
