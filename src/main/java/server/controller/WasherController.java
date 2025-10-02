package server.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.dto.WashRequest;
import server.dto.response.WashResponse;
import server.service.WashService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/wash")
@CrossOrigin(origins = "*")
public class WasherController {
    private final WashService washService;

    private WasherController(WashService washService) {
        this.washService = washService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody @Valid WashRequest request) {
        return ResponseEntity.ok(washService.create(request));
    }

    @GetMapping("/list")
    public ResponseEntity<List<WashResponse>> getWasherList(@RequestParam String type) {
        return ResponseEntity.ok(washService.getWasherList(type));
    }
}
