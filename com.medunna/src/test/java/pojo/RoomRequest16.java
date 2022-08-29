package pojo;

public class RoomRequest16 {


   /* {
  "createdBy": "MaviDeniz",
  "createdDate": "2022-08-29T10:59:31.413Z",
  "description": "Oda ferah olmali",
  "price": 750,
  "roomNumber": 4112265,
  "roomType": "DAYCARE",
  "status": true
}*/



    private String createdBy;
    private String createdDate;
    private int id;
    private String description;
    private int price;
    private int roomNumber;
    private String roomType;
    private boolean status;


    public String getCreatedBy() {
        return createdBy;
    }



    public String getCreatedDate() {
        return createdDate;
    }



    public int getId() {
        return id;
    }



    public String getDescription() {
        return description;
    }



    public int getPrice() {
        return price;
    }



    public int getRoomNumber() {
        return roomNumber;
    }



    public String getRoomType() {
        return roomType;
    }



    public boolean getStatus() {
        return status;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "RoomRequest16{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", status=" + status +
                '}';
    }
}
