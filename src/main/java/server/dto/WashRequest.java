package server.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WashRequest {
    @NotBlank(message = "Customer name is required")
    private String customerName;

    @NotBlank(message = "Vehicle name is required")
    private String vehicleName;

    @NotBlank(message = "Colour is required")
    private String colour;

    @NotBlank(message = "Aadhaar number is required")
    private String aadhaarNumber;

    @NotBlank(message = "Washing package is required")
    private String washingPackage;

    @NotBlank(message = "Type is required")
    private String type;
}
