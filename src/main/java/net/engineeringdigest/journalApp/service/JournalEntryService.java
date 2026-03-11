package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class JournalEntryService {

    @Autowired
    private JournalRepository journalRepository;

    public List<JournalEntry> getAll(){
        return journalRepository.findAll();
    }

    public void saveEntry(JournalEntry journalEntry){
        journalRepository.save(journalEntry);
    }

    public Optional<JournalEntry> getEntryById(ObjectId myid){
        return journalRepository.findById(myid);
    }


}
