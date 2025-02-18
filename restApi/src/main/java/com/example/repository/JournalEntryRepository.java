package com.example.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.entity.JournalEntry;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, String> {

}
