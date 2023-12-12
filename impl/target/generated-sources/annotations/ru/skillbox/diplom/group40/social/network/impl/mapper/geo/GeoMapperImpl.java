package ru.skillbox.diplom.group40.social.network.impl.mapper.geo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.skillbox.diplom.group40.social.network.api.dto.geo.CityDto;
import ru.skillbox.diplom.group40.social.network.api.dto.geo.CountryDto;
import ru.skillbox.diplom.group40.social.network.domain.geo.City;
import ru.skillbox.diplom.group40.social.network.domain.geo.Country;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-12T16:01:05+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class GeoMapperImpl implements GeoMapper {

    @Override
    public List<CityDto> cityToDto(List<City> cityEntity) {
        if ( cityEntity == null ) {
            return null;
        }

        List<CityDto> list = new ArrayList<CityDto>( cityEntity.size() );
        for ( City city : cityEntity ) {
            list.add( mapCityToDto( city ) );
        }

        return list;
    }

    @Override
    public CityDto mapCityToDto(City city) {
        if ( city == null ) {
            return null;
        }

        CityDto cityDto = new CityDto();

        cityDto.setCountryId( cityCountryId( city ) );
        cityDto.setId( city.getId() );
        cityDto.setIsDeleted( city.getIsDeleted() );
        cityDto.setTitle( city.getTitle() );

        return cityDto;
    }

    @Override
    public List<CountryDto> countryToDto(List<Country> countryEntity) {
        if ( countryEntity == null ) {
            return null;
        }

        List<CountryDto> list = new ArrayList<CountryDto>( countryEntity.size() );
        for ( Country country : countryEntity ) {
            list.add( countryToCountryDto( country ) );
        }

        return list;
    }

    private UUID cityCountryId(City city) {
        if ( city == null ) {
            return null;
        }
        Country country = city.getCountry();
        if ( country == null ) {
            return null;
        }
        UUID id = country.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected CountryDto countryToCountryDto(Country country) {
        if ( country == null ) {
            return null;
        }

        CountryDto countryDto = new CountryDto();

        countryDto.setId( country.getId() );
        countryDto.setIsDeleted( country.getIsDeleted() );
        countryDto.setTitle( country.getTitle() );
        countryDto.setCities( cityToDto( country.getCities() ) );

        return countryDto;
    }
}
