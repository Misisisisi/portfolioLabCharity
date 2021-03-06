package pl.coderslab.charity.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.InstitutionEntity;
import pl.coderslab.charity.repository.InstitutionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultInstitutionService implements InstitutionService {

    private final InstitutionRepository institutionRepository;

    public List<InstitutionEntity> loadInstitutions() {
        return institutionRepository.findAll();
    }
}
