/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author vu
 */
public class Room {
    private String roomid;

    public Room() {
    }

    public Room(String roomid) {
        this.roomid = roomid;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    @Override
    public String toString() {
        return "Room{" + "roomid=" + roomid + '}';
    }
    
}
