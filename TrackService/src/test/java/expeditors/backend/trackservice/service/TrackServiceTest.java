package expeditors.backend.trackservice.service;

import expeditors.backend.dao.ArtistRepo;
import expeditors.backend.dao.TrackRepo;
import expeditors.backend.domain.Artist;
import expeditors.backend.domain.MediaType;
import expeditors.backend.domain.Track;
import expeditors.backend.service.ArtistService;
import expeditors.backend.service.TrackService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@ActiveProfiles("localprice")
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class TrackServiceTest {

    @Autowired
    private TrackService trackService;

    @Autowired
    private ArtistRepo artistRepo;

    @Autowired
    private TrackRepo trackRepo;

    @BeforeEach
    public void clearTracks(){
        trackService.deleteAllTracks();
    }

    @Test
    public void testCreateDatabase(){

    }


//    @Test
//    public void testPrint(){
//
//    }
//    @Test
//    public void testGetAllTracks(){
//
//        Track track = new Track("Standing Next to You", "COMING HOME",
//                List.of( new Artist.ArtistBuilder().id(1).name("JungKook").build(), new Artist.ArtistBuilder().id(2).name("Usher").build()),
//                LocalDate.of(2024,2,9), Duration.ofMinutes(3).plusSeconds(35), MediaType.MP3);
//        trackService.addTrack(track);
//        List<Track> tracks = trackService.getAllTracks();
//        assertEquals(1, tracks.size());
//        tracks.forEach(System.out::println);
//    }
//
//    @Test
//    public void testGetExistingTrack(){
//        Track track = new Track("Standing Next to You", "COMING HOME",
//                List.of( new Artist.ArtistBuilder().id(1).name("JungKook").build(), new Artist.ArtistBuilder().id(2).name("Usher").build()),
//                LocalDate.of(2024,2,9), Duration.ofMinutes(3).plusSeconds(35), MediaType.MP3);
//        trackService.addTrack(track);
//        Track addedTrack = trackService.getTrack(1);
//        assertNotNull(addedTrack);
//    }
//
//    @Test
//    public void testGetNonExistingTrack(){
//        Track track = trackService.getTrack(2);
//        assertNull(track);
//    }
//
    @Test
    public void testInsertTrack(){
//        Track track = new Track("Standing Next to You", "COMING HOME",
//                List.of( new Artist.ArtistBuilder().id(1).name("JungKook").build(), new Artist.ArtistBuilder().id(2).name("Usher").build()),
//                LocalDate.of(2024,2,9), Duration.ofMinutes(3).plusSeconds(35), MediaType.MP3);
        Track track1 = new Track();
        track1.setTitle("Standing Next to You");
        trackRepo.save(track1);
        System.out.println(track1);

//        assertNotNull(trackRepo.findById(1));
//        List<Artist> artistList = artistRepo.findAll();
//        artistList.forEach(System.out :: println);
//        Artist artist1 = new Artist();
//        artist1.setName("JungKook");
//        artistRepo.save(artist1);
//        System.out.println(artist1);

//
//
//        track1.getArtists().add(artist1);

        //trackService.addTrack(track1);


//        System.out.println(track1);
    }
//
//    @Test
//    public void testUpdateTrack(){
//        Track track = new Track("Standing Next to You", "COMING HOME",
//                List.of( new Artist.ArtistBuilder().id(1).name("JungKook").build(), new Artist.ArtistBuilder().id(2).name("Usher").build()),
//                LocalDate.of(2024,2,9), Duration.ofMinutes(3).plusSeconds(35), MediaType.MP3);
//        trackService.addTrack(track);
//        track.setTitle("New Title");
//        assertTrue(trackService.updateTrack(track));
//    }
//    @Test
//    public void testUpdateNonExistingTrack(){
//        Track track = new Track("Standing Next to You", "COMING HOME",
//                List.of( new Artist.ArtistBuilder().id(1).name("JungKook").build(), new Artist.ArtistBuilder().id(2).name("Usher").build()),
//                LocalDate.of(2024,2,9), Duration.ofMinutes(3).plusSeconds(35), MediaType.MP3);
//        trackService.addTrack(track);
//        track.setId(2);
//        assertFalse(trackService.updateTrack(track));
//
//    }
//    @Test
//    public void testDeleteTrack(){
//        Track track = new Track("Standing Next to You", "COMING HOME",
//                List.of( new Artist.ArtistBuilder().id(1).name("JungKook").build(), new Artist.ArtistBuilder().id(2).name("Usher").build()),
//                LocalDate.of(2024,2,9), Duration.ofMinutes(3).plusSeconds(35), MediaType.MP3);
//        trackService.addTrack(track);
//        assertTrue(trackService.deleteTrack(1));
//    }
//
//    @Test
//    public void testDeleteNonExistingTrack(){
//        assertFalse(trackService.deleteTrack(1));
//    }
}
