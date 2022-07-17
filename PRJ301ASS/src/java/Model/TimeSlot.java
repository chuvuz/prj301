/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Time;

/**
 *
 * @author vu
 */
public class TimeSlot {

    private String timeslotid;
    private Time start;
    private Time end;

    public TimeSlot() {
    }

    public TimeSlot(String timeslotid, Time start, Time end) {
        this.timeslotid = timeslotid;
        this.start = start;
        this.end = end;
    }

    public String getTimeslotid() {
        return timeslotid;
    }

    public void setTimeslotid(String timeslotid) {
        this.timeslotid = timeslotid;
    }

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "TimeSlot{" + "timeslotid=" + timeslotid + ", start=" + start + ", end=" + end + '}';
    }

}
