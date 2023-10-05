package edu.uc.cech.soit.myclassjournal.dto;

import lombok.Data;

public @Data class JournalEntry {
    public int entryId;
    public String notes;
    public String date;
}
