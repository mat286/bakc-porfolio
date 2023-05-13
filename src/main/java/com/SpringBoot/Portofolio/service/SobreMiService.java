package com.SpringBoot.Portofolio.service;

import com.SpringBoot.Portofolio.model.sobreMi;
import com.SpringBoot.Portofolio.repository.SobreMiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SobreMiService implements ISobreMiService {

    @Autowired
    private SobreMiRepository sobremiRepository;
    @Override
    public List<sobreMi> getSobreMi() {
        List<sobreMi> listaPersonas = sobremiRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void saveSobreMi(sobreMi sobre) {
        sobremiRepository.save(sobre);
    }

    @Override
    public void deleteSobreMi(Long id) {
        sobremiRepository.deleteById(id);
    }

    @Override
    public sobreMi findSobreMi(Long id) {
        sobreMi perso = sobremiRepository.findById(id).orElse(null);
        return perso;
    }

}
