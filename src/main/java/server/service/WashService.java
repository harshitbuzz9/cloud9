package server.service;

import org.springframework.stereotype.Service;
import server.dto.WashRequest;
import server.dto.response.WashResponse;
import server.model.WasherModel;
import server.repository.WasherRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class WashService {
    private final WasherRepository washerRepository;

    private WashService(WasherRepository washerRepository) {
        this.washerRepository = washerRepository;
    }

    public String create(WashRequest req) {
        WasherModel model = new WasherModel();
        model.setId(UUID.randomUUID().toString());
        model.setCustomerName(req.getCustomerName());
        model.setVehicleName(req.getVehicleName());
        model.setColour(req.getColour());
        model.setType(req.getType());
        model.setAadhaarNo(req.getAadhaarNumber());
        model.setWashingPackage(req.getWashingPackage());
        WasherModel formDb = washerRepository.save(model);
        return "Data Save With Id.. " + formDb.getId() + " Successfully!.";
    }

    public List<WashResponse> getWasherList(String type) {
        List<WasherModel> fromDb = washerRepository.findAllByType(type).orElseGet(ArrayList::new);
        return fromDb.stream().map(wash -> {
            return WashResponse.builder()
                    .id(wash.getId())
                    .customerName(wash.getCustomerName())
                    .vehicleName(wash.getVehicleName())
                    .aadhaarNumber(wash.getAadhaarNo())
                    .type(wash.getType())
                    .washingPackage(wash.getWashingPackage())
                    .colour(wash.getColour()).build();

        }).toList();
    }


}
