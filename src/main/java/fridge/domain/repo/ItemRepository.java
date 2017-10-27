package fridge.domain.repo;

import fridge.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by douglas on 10/3/17.
 */

@Repository
public class ItemRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    final String ITEM_COLLECTION = "item";

    public void create(Item item){

        mongoTemplate.save(item);
    }

    public Item findItemByName(String name){
        Query query = new Query(Criteria.where("name").is(name));

        return mongoTemplate.findOne(query, Item.class, ITEM_COLLECTION);
    }

    public List<Item> findAll(){

        return (List<Item>) mongoTemplate.findAll(Item.class);
    }

    public Item removeItem(String name){
        Query query = new Query(Criteria.where("name").is(name));
        return mongoTemplate.findAndRemove(query, Item.class, ITEM_COLLECTION);

    }

}
