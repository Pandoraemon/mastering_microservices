package com.packtpub.mmj.mcrsrcv.domain.model;

import java.math.BigInteger;

public class Table extends BaseEntity<BigInteger>
{
    private int capacity;

    public Table(String name, BigInteger id, int capacity)
    {
        super(id, name);
        this.capacity = capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public int getCapacity()
    {
        return capacity;
    }

//    @Override
//    public String toString()
//    {
//        return new StringBuilder("{id: ").append(id).append(", name: ")
//                .append(name).append(", capacity: ").append(capacity).append("}").toString();
//    }
}
