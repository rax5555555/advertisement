package mapper;

import dto.AdvertisementDto;
import lombok.experimental.UtilityClass;
import model.Advertisement;

@UtilityClass
public class AdvertisementMapper {
    public static Advertisement toAdvertisement(AdvertisementDto advertisementDto) {
        return Advertisement.builder()
                .id(advertisementDto.getId())
                .name(advertisementDto.getName())
                .description(advertisementDto.getDescription())
                .contact(advertisementDto.getContact())
                .status(advertisementDto.getStatus())
                .imageFileName(advertisementDto.getImageFileName())
                .build();
    }

    public static AdvertisementDto toAdvertisementDto(Advertisement advertisement) {
        return AdvertisementDto.builder()
                .id(advertisement.getId())
                .name(advertisement.getName())
                .description(advertisement.getDescription())
                .contact(advertisement.getContact())
                .status(advertisement.getStatus())
                .imageFileName(advertisement.getImageFileName())
                .build();
    }
}
