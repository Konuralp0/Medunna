package pojo;

public class RoomResponse16 {

    /*{
    "createdBy": "infotech02",
    "createdDate": "2022-08-29T15:48:47.699362Z",
    "id": 245047,
    "roomNumber": 4112265,
    "roomType": "DAYCARE",
    "status": true,
    "price": 750,
    "description": "Oda ferah olmali"
}*/

    private String createdBy;
    private String createdDate;
    private int id;
    private int roomNumber;
    private String roomType;
    private boolean status;
    private int price;
    private String description;

    public String getCreatedBy() {
        return createdBy;
    }
    public boolean getStatus() {
        return status;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RoomResponse16{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", status=" + status +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
