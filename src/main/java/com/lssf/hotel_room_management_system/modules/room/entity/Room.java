package com.lssf.hotel_room_management_system.modules.room.entity;

/**
 * @Desciption: Room
 * @Autor ChenYang
 * @Date 2020/10/6    11:54
 */

public class Room {
    String roomId;
    String roomType;

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

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", roomType='" + roomType + '\'' +
                '}';
    }
}
