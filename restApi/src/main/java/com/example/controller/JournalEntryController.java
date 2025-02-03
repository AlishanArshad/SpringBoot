package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.JournalEntry;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long, JournalEntry> journalEntries = new ConcurrentHashMap<>();
    // Fetch Data from Server
    @GetMapping
    public List <JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }
    // Add Data to Server
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntries.put(myEntry.getId(), myEntry);
                return true;
    }
    // Search
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId) {
        return journalEntries.get(myId);
    }
    // Remove
    @DeleteMapping("id/{myId}")
    public JournalEntry deleJournalEntryById(@PathVariable Long myId){
        return journalEntries.remove(myId);
    }
    // update
    @PutMapping("id/{myId}")
    public JournalEntry updateJournalEntryById(@PathVariable Long myId, @RequestBody JournalEntry myEntry) {
        return journalEntries.put(myId, myEntry);
    }
    

}
