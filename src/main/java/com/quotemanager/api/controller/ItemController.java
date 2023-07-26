package com.quotemanager.api.controller;

import com.quotemanager.api.controller.template.CRUDController;
import com.quotemanager.api.model.Item;
import com.quotemanager.api.service.ItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/item")
public class ItemController extends CRUDController<Item, ItemService> {
    public ItemController(ItemService service) {
        super(service);
    }
}
