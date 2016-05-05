package com.example.sony.downloadfileentitties;

/**
 * Created by sony on 2016/5/4.
 */
public class ThreadInfo {
    private int id;
    private String URL;
    private int start;
    private int stop;
    private int finished;
    public ThreadInfo(){

    }
    public ThreadInfo(int id, String url, int start, int stop, int finished) {
        this.id = id;
        URL = url;
        this.start = start;
        this.stop = stop;
        this.finished = finished;
    }

    public int getFinished() {
        return finished;
    }

    public void setFinished(int finished) {
        this.finished = finished;
    }

    public int getStop() {
        return stop;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
