package com.pong.nattpong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import com.pong.nattpong.entity.Country;
import com.pong.nattpong.sevice.CountryService;

@RestController
@RequestMapping("/api/Country")
public class CountryController {
    @Autowired
    CountryService countryService;

    @GetMapping("/findAll")
    @CrossOrigin(origins = "*")
    public List<Country> findAll(){
        return countryService.findAll();
    } 
     
    @RequestMapping("/save")
    @CrossOrigin(origins = "*")
    public Country save(@RequestBody Country country){
        return countryService.save(country);
    }
    
    @GetMapping("/delete")
    @CrossOrigin(origins =  "*")
    public void delete(Integer contryId){
        countryService.delete(contryId);
    }
    @RequestMapping("/init") 
    @CrossOrigin(origins = "*")
    public void initData(){ 
        List<Country> countryList = new ArrayList<Country>();

        Country country = new Country();
        country.setContryName("Russia");
        country.setArea(17075200);
        country.setPopulation(146989754);
        country.setFlage("https://upload.wikimedia.org/wikipedia/commons/f/f3/Flag_of_Russia.svg");

        countryList.add(country);

        Country country2 = new Country();
        country2.setContryName("Canada");
        country2.setArea(9976140);
        country2.setPopulation(36624199);
        country2.setFlage("https://upload.wikimedia.org/wikipedia/commons/c/cf/Flag_of_Canada.svg");

        countryList.add(country2);

        countryService.saveAll(countryList);
    }
}
