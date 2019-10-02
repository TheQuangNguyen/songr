package com.code401.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository takes in a Type and an id <Type, Identifier Type>
public interface AlbumRepository extends JpaRepository<Album, Long> {

}
