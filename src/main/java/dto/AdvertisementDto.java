package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Status;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AdvertisementDto {
    private Long id;
    private String name;
    private String description;
    private String contact;
    private Status status;
    private String userId;
    private String imageFileName;
}
