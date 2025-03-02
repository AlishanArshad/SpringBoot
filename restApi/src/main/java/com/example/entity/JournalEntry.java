package com.example.entity;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "journal_entries")
@Getter
@Setter
public class JournalEntry {
    @Id
    private ObjectId id;
    private String title;
    private String  content;
    private LocalDateTime date;


}
