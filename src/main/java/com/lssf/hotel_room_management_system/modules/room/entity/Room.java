package com.lssf.hotel_room_management_system.modules.room.entity;

import java.sql.Timestamp;

/**
 * @Desciption: Room
 * @Autor ChenYang
 * @Date 2020/10/6    11:54
 */

public class Room {
    String roomId;
    String roomType;
    String floor;
    String price;
    String guestsId;
    String reservation;
    Timestamp checkInTime;
    Timestamp checkOutTime;
    String clean;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getGuestsId() {
        return guestsId;
    }

    public void setGuestsId(String guestsId) {
        this.guestsId = guestsId;
    }

    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    public Timestamp getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Timestamp checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Timestamp getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Timestamp checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public String getClean() {
        return clean;
    }

    public void setClean(String clean) {
        this.clean = clean;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", roomType='" + roomType + '\'' +
                ", floor='" + floor + '\'' +
                ", price='" + price + '\'' +
                ", guestsId='" + guestsId + '\'' +
                ", reservation='" + reservation + '\'' +
                ", checkInTime=" + checkInTime +
                ", checkOutTime=" + checkOutTime +
                ", clean='" + clean + '\'' +
                '}';
    }
}
