package server.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "infoinside")
public class WasherModel {
    @Id
    private String id;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "vehicle_name")
    private String vehicleName;
    @Column(name = "colour")
    private String colour;
    @Column(name = "aadhaar_no")
    private String aadhaarNo;
    @Column(name = "package")
    private String washingPackage;
    @Column(name = "type")
    private String type;
}
