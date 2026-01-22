package com.nizam.restful.service;

import com.nizam.restful.config.CapitalCityConfig;
import com.nizam.restful.entity.PersonData;
import com.nizam.restful.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

//    private final PersonRepository repo;
//    private final Map<String, String> capitalMap;

    private final CapitalCityConfig capitalCityConfig;
    private final PersonRepository repository;

    public PersonService(PersonRepository repository,
                         CapitalCityConfig capitalCityConfig) {
        this.repository = repository;
        this.capitalCityConfig = capitalCityConfig;
    }

    public void process(String input) {

        StringBuilder name = new StringBuilder();
        StringBuilder city = new StringBuilder();

        int age = 0;
        int multiplier = 1;

        int stage = 0; // 0=city, 1=age, 2=name
        boolean ketemu = false;

        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);

            if (stage == 0) {
                if (c == ' ') {
                    stage = 1;
                    continue;
                }
                city.append(c);
            }

            else if (stage == 1) {
                if (c >= '0' && c <= '9') {
                    age += (c - '0') * multiplier;
                    multiplier *= 10;
                    ketemu = true;
                } else {
                    if (ketemu && c == ' ') {
                        stage = 2;
                    }
                }
            }

            else {
                name.append(c);
            }
        }

        String finalName = padRight(name.reverse().toString().toUpperCase(), 30);
        String finalAge  = padLeft(String.valueOf(age), 3);
        String finalCity = padRight(resolveCity(city.reverse().toString().toUpperCase()), 20);

        PersonData p = new PersonData();
        p.setName(finalName);
        p.setAge(finalAge);
        p.setCity(finalCity);

        repository.save(p);
    }

    private String resolveCity(String city) {
        String province = capitalCityConfig.getCities().get(city);
        return province != null ? city + " " + province : city;
    }

    private String padRight(String s, int n) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() < n) sb.append(" ");
        return sb.substring(0, n);
    }

    private String padLeft(String s, int n) {
        StringBuilder sb = new StringBuilder();
        while (sb.length() + s.length() < n) sb.append(" ");
        return (sb + s).substring(0, n);
    }
}
