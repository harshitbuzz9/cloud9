package server.dto.response;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WashResponse {
    private String id;
    private String customerName;
    private String vehicleName;
    private String colour;
    private String aadhaarNumber;
    private String washingPackage;
    private String type;
}
