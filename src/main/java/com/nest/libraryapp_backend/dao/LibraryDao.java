package com.nest.libraryapp_backend.dao;

import com.nest.libraryapp_backend.model.Library;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface LibraryDao extends CrudRepository<Library,Integer> {

    @Query(value = "SELECT `id`, `author`, `description`, `img`, `price`, `title` FROM `library` WHERE `title`= :title",nativeQuery = true)
    List<Library>SearchBook(@Param("title")String title);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `library` WHERE `id`=:id",nativeQuery = true)
    void DeleteBook(@Param("id")Integer id);
}
