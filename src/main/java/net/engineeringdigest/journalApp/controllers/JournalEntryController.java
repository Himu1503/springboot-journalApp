package net.engineeringdigest.journalApp.controllers;


import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getEntry(){
        return journalEntryService.getAll();
    }

    @PostMapping
    public boolean saveEntry(@RequestBody JournalEntry journalEntry){
        journalEntryService.saveEntry(journalEntry);
        return true;
    }

    @GetMapping("/id/{myId}")
    public Optional<JournalEntry> getJournalEntryById(@PathVariable ObjectId myId){
        return journalEntryService.getEntryById(myId);
    }
}
