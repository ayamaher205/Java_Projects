import dao.InMemoryWorldDao;
import domain.City;
import domain.Country;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance ();
        Set<String> allContinents = worldDao.getContinents ();
        //System.out.println(allContinents);
        Map<String, Country> allCountries = worldDao.getCountries ();
        Map<String,List<City>> MapCity  = allCountries.values().stream().collect(Collectors.toMap(
                Country::getCode,
                Country::getCities
        ));
        Map<String,City> HighestPopulated = MapCity.entrySet().stream().filter(entry -> !entry.getValue().isEmpty()).collect(Collectors.toMap(
                entry ->entry.getKey(),entry->entry.getValue().stream().
                        max(Comparator.comparing(City::getPopulation)).orElse(null)));
        //System.out.println(HighestPopulated);
        Map<String,List<Country>> countryCont=allCountries.values().stream().collect(Collectors.groupingBy(Country::getContinent));
        Map<String, String> highestCityByContinent = countryCont.entrySet().stream().collect(Collectors.toMap(
                e->e.getKey(),
                e-> {
                    List<City> allCities = new ArrayList<>();
                    e.getValue().forEach((c) -> {
                        allCities.addAll(c.getCities());
                    });
                    return allCities.stream().max(Comparator.comparing(City::getPopulation))
                            .map(City::getName).orElse("");
                }
        ));
                    System.out.println(highestCityByContinent);
                   // System.out.println(HighestPopulated);
        //System.out.println(Highestcont.keySet());
        Map<String,Integer> MapCapital  = allCountries.values().stream().collect(Collectors.toMap(
                Country::getCode,
                Country::getCapital
        ));
        Map<String,City> HighestPopulatedCapital = MapCity.entrySet().stream().filter(entry -> !entry.getValue().isEmpty()).collect(Collectors.toMap(
                entry ->entry.getKey(),entry->entry.getValue().stream().
                        max(Comparator.comparing(City::getPopulation)).orElse(null)));
         System.out.println(MapCapital.values());

    }
}