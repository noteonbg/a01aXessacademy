package a20project.location.service;



import a20project.location.model.Location;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LocationService {
    private final List<Location> locations = new ArrayList<>();
    private int nextId = 1;

    public List<Location> getAll() {
        return locations;
    }

    public Optional<Location> getById(int id) {
        return locations.stream().filter(loc -> loc.getId() == id).findFirst();
    }

    public Location add(Location location) {
        location.setId(nextId++);
        locations.add(location);
        return location;
    }

    public Optional<Location> update(int id, Location updatedLocation) {
        return getById(id).map(location -> {
            location.setCity(updatedLocation.getCity());
            location.setPincode(updatedLocation.getPincode());
            return location;
        });
    }

    public boolean delete(int id) {
        return locations.removeIf(location -> location.getId() == id);
    }
}
