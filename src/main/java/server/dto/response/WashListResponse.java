package server.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class WashListResponse {
    List<WashResponse> list;
}
