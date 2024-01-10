import dao.InMemoryWorldDao;
import domain.City;
import domain.Country;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance ();
        Set<String> allContinents = worldDao.getContinents ();
        //System.out.println(allContinents);
        Map<String, Country> allCountries = worldDao.getCountries ();
        Map<String, List<City>> citiesByCountryCode = allCountries.values()
                .stream()
                .flatMap(country -> country.getCities().stream().map(city -> new AbstractMap.SimpleEntry<>(country.getCode(), city)))
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
        Map<String, City> mx = citiesByCountryCode.entrySet().stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> entry.getValue().stream()
                        .max(Comparator.comparing(City::getPopulation))
                        .orElse(null)
        ));
        //Map<String,Country> CityforContent = mx.values().stream().collect(Collectors.toMap(City::getCountryCode, Function.identity()))
        System.out.println(mx);
        Map<Integer, City> allCities = worldDao.getCities ();
        //System.out.println(allCities.values());
        worldDao.writeCountriesToFile (allCountries, "Countries.txt");
        worldDao.writeCitiesToFile (allCities, "Cities.txt");
    }
}