package com.paul.roomwordssample;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WordDao {

    @Insert
    void insert(Word word);

    @Query("DELETE FROM Word")
    void deleteAll();

    @Query("SELECT * from Word ORDER BY word ASC")
    LiveData<List<Word>> getAllWords();

}
