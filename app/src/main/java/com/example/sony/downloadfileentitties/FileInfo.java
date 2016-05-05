package com.example.sony.downloadfileentitties;

import java.io.Serializable;

/**
 * Created by sony on 2016/5/4.
 */
public class FileInfo implements Serializable {
    private int id;
    private String filename;
    private String URL;
    private int filelength;
    private int finished;
    public FileInfo(){

    }
    public FileInfo(int id, String filename, String URL, int filelength, int finished){
        this.id = id;
        this.filename = filename;
        this.URL = URL;

        this.filelength = filelength;
        this.finished = finished;

    }
    public int getFinished() {
        return finished;
    }

    public void setFinished(int finished) {
        this.finished = finished;
    }

    public int getFilelength() {
        return filelength;
    }

    public void setFilelength(int filelength) {
        this.filelength = filelength;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
