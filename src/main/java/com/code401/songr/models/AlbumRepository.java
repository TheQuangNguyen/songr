package com.code401.songr.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

// JpaRepository takes in a Type and an id <Type, Identifier Type>
public interface AlbumRepository extends JpaRepository<Album, Long> {
    @Query(value="SELECT * FROM album u WHERE u.id = ?1", nativeQuery = true)
    Album findAlbumById(long id);
}
