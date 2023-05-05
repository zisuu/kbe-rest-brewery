package ch.finecloud.sfgrestbrewery.web.mappers;

import ch.finecloud.sfgrestbrewery.domain.Beer;
import ch.finecloud.sfgrestbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    BeerDto beerToBeerDtoWithInventory(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
