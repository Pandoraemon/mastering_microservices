package com.packtpub.mmj.mcrsrcv.domain.model;

public interface RestaurantRepository<Restaurant, String> extends
        Repository<Restaurant, String>{
    boolean ContainsName(String name);
}
