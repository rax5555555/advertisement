package servise;


import dto.AdvertisementDto;
import mapper.AdvertisementMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.AdvertisementRepository;

@Service
@Transactional(readOnly = true)
public class AdvertisementService {
    private final AdvertisementRepository advertisementRepository;

    public AdvertisementService(AdvertisementRepository advertisementRepository) {
        this.advertisementRepository = advertisementRepository;
    }


    @Transactional
    public AdvertisementDto create(AdvertisementDto advertisementDto) {
        return AdvertisementMapper.toAdvertisementDto(advertisementRepository.save(AdvertisementMapper.toAdvertisement(advertisementDto)));
    }


}
