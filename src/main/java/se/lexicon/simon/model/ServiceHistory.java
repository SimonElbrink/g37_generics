package se.lexicon.simon.model;


import java.time.LocalDateTime;

import java.util.Map;

public class ServiceHistory {

    private int id;
    private Map<LocalDateTime, String> history;

    public ServiceHistory(Map<LocalDateTime, String> history) {
        this.history = history;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<LocalDateTime, String> getHistory() {
        return history;
    }

    public void addToHistory(LocalDateTime localDateTime, String historyToAdd){
        this.history.put(localDateTime,historyToAdd);
    }

    public void setHistory(Map<LocalDateTime, String> history) {
        this.history = history;
    }
}
