package fridge.service;

import fridge.domain.Item;
import fridge.domain.repo.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by douglas on 10/3/17.
 */
@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;


    public Item findItem(String name){

        return itemRepository.findItemByName(name);
    }

    public List<Item> findAllItems(){

        return itemRepository.findAll();
    }


    public void createSample() {

        String startDateString = "01-02-2017";
        String validUntilString = "01-03-2017";

        Item sample = new Item("test", startDateString, validUntilString ,true);
        itemRepository.create(sample);

    }

    public void postItem(Item item){

        itemRepository.create(item);
    }

    public Item removeItem(String name){

        return itemRepository.removeItem(name);

    }

    public Item updateItem(Item item){
        return itemRepository.updateItem(item);
    }
}
