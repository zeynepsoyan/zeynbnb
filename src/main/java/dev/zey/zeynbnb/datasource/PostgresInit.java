package dev.zey.zeynbnb.datasource;

import dev.zey.zeynbnb.dto.CreateHouseRequest;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PostgresInit {

    public List<CreateHouseRequest> housesInit() {

        CreateHouseRequest house_1 = new CreateHouseRequest();
        house_1.setListingTitle("Country house in Tuscany");
        house_1.setCity("Tuscany");
        house_1.setDescription("A beautiful country house with a forest view.");
        house_1.setAmenities("washing machine, drying rack, shampoo and conditioner, wifi");
        house_1.setMaxPeople(8);

        CreateHouseRequest house_2 = new CreateHouseRequest();
        house_2.setListingTitle("Spacious house in the city center");
        house_2.setCity("London");
        house_2.setDescription("Exceeding London's standard for flats, here you'll be buzzing with the city's soul.");
        house_2.setAmenities("shampoo and conditioner, wifi, shared kitchen");
        house_2.setMaxPeople(2);

        CreateHouseRequest house_3 = new CreateHouseRequest();
        house_3.setListingTitle("Flat with Eiffel Tower view");
        house_3.setCity("Paris");
        house_3.setDescription("Imagine waking up to a crisp morning and the first thing you see is the magnificent Eiffel Tower.");
        house_3.setAmenities("wifi, complimentary croissants, unlimited coffee");
        house_3.setMaxPeople(3);

        CreateHouseRequest house_4 = new CreateHouseRequest();
        house_4.setListingTitle("A dreamy house for the book lovers");
        house_4.setCity("Edinburgh");
        house_4.setDescription("A house that feels like it came out of a victorian era romantic novel.");
        house_4.setAmenities("library room, window-side reading couch, reading lamp, plants");
        house_4.setMaxPeople(4);

        CreateHouseRequest house_5 = new CreateHouseRequest();
        house_5.setListingTitle("Soul lightening sea-side house for 2");
        house_5.setCity("Izmir");
        house_5.setDescription("The morning sun, fresh sea smelling air and the sound of the waves will caress your soul and heart while your mind is resting here.");
        house_5.setAmenities("gramophone, lemonade, sunscreen");
        house_5.setMaxPeople(2);

        return new ArrayList<>(Arrays.asList(house_1, house_2, house_3, house_4, house_5));
    }
}