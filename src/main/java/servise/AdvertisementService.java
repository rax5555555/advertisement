package servise;


import dto.AdvertisementDto;
import exeption.AdvertisementNotFoundException;
import exeption.UserNotFoundException;
import mapper.AdvertisementMapper;
import model.Advertisement;
import model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.AdvertisementRepository;
import repository.UserRepository;

@Service
@Transactional(readOnly = true)
public class AdvertisementService {
    private final AdvertisementRepository advertisementRepository;
    private final UserRepository userRepository;
    public AdvertisementService(AdvertisementRepository advertisementRepository, UserRepository userRepository) {
        this.advertisementRepository = advertisementRepository;
        this.userRepository = userRepository;
    }

    @Transactional
    public AdvertisementDto create(AdvertisementDto advertisementDto) {
        return AdvertisementMapper.toAdvertisementDto(advertisementRepository
                .save(AdvertisementMapper.toAdvertisement(advertisementDto)));
    }

    public AdvertisementDto getAdvertisementById(long advertisementId) {
        Advertisement advertisement = advertisementRepository.findById(advertisementId)
                .orElseThrow(() -> new AdvertisementNotFoundException("Advertisement not found"));
        return AdvertisementMapper.toAdvertisementDto(advertisement);
    }

    public AdvertisementDto update(long userId, long advertisementId, AdvertisementDto advertisementDto) {
        User owner = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User not found"));
        Advertisement advertisement = advertisementRepository.findById(advertisementId)
                .orElseThrow(() -> new AdvertisementNotFoundException("Advertisement not found"));
        if (!owner.equals(advertisement.getUser())) {
            throw new UserNotFoundException("You're trying to change someone else's thing");
        }
        return AdvertisementMapper.toAdvertisementDto(advertisementRepository
                .save(AdvertisementMapper.toAdvertisement(advertisementDto)));
    }
}
