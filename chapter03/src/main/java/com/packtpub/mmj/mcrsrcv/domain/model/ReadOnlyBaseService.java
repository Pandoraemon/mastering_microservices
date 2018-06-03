package com.packtpub.mmj.mcrsrcv.domain.model;

public abstract class ReadOnlyBaseService<TE, T> {
    private Repository<TE, T> repository;

    ReadOnlyBaseService(Repository<TE, T> repository) {
        this.repository = repository;
    }
}
