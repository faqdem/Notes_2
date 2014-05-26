package com.Notes_2.data;

/**
 * Created by student on 5/26/14.
 */
public class Note {
    private String title;
    private String content;
    private long id;
    private static long lastId = 0;


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Note()
    {
        this.id = lastId++;
        this.title = null;
        this.content = null;
    }

    public Note(String t, String c)
    {
        this.id = lastId++;
        this.title = t;
        this.content = c;
    }

    public long getId(){
        return this.id;
    }
}
