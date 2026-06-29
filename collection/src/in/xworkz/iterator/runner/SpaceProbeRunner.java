package in.xworkz.iterator.runner;

import in.xworkz.iterator.dto.SpaceProbeDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SpaceProbeRunner {
    public static void main(String[] args) {
        SpaceProbeDTO probe1 = new SpaceProbeDTO("SP-001", "Voyager 1", "Jupiter", "NASA", 825.5,
                LocalDateTime.of(1977, 9, 5, 12, 0), LocalDateTime.of(1979, 3, 5, 10, 30),
                "Chemical", 420.0, "S-Band", 159000000000.0, 17.0, "Imaging System", "Spectrometer", 18000, true, "Active", 15.5, "Heliocentric");

        SpaceProbeDTO probe2 = new SpaceProbeDTO("SP-002", "Voyager 2", "Saturn", "NASA", 825.5,
                LocalDateTime.of(1977, 8, 20, 14, 0), LocalDateTime.of(1981, 8, 25, 16, 45),
                "Chemical", 420.0, "S-Band", 132000000000.0, 15.5, "Imaging System", "Plasma Detector", 18000, true, "Active", 18.2, "Heliocentric");

        SpaceProbeDTO probe3 = new SpaceProbeDTO("SP-003", "Pioneer 10", "Jupiter", "NASA", 258.0,
                LocalDateTime.of(1972, 3, 3, 1, 0), LocalDateTime.of(1973, 12, 4, 8, 0),
                "Chemical", 155.0, "S-Band", 18300000000.0, 12.0, "Photopolarimeter", "Radiation Detector", 15000, false, "Inactive", 0.0, "Interstellar");

        SpaceProbeDTO probe4 = new SpaceProbeDTO("SP-004", "Pioneer 11", "Saturn", "NASA", 258.0,
                LocalDateTime.of(1973, 4, 6, 2, 0), LocalDateTime.of(1979, 9, 1, 12, 0),
                "Chemical", 155.0, "S-Band", 15000000000.0, 11.5, "Photopolarimeter", "Infrared Radiometer", 15000, false, "Inactive", 0.0, "Interstellar");

        SpaceProbeDTO probe5 = new SpaceProbeDTO("SP-005", "Galileo", "Jupiter", "NASA", 2222.0,
                LocalDateTime.of(1989, 10, 18, 16, 0), LocalDateTime.of(1995, 12, 7, 14, 30),
                "Chemical", 580.0, "X-Band", 965000000.0, 13.0, "Solid State Imager", "NIMS", 8000, false, "Destroyed", 0.0, "Jupiter Orbit");

        SpaceProbeDTO probe6 = new SpaceProbeDTO("SP-006", "Cassini", "Saturn", "NASA", 5712.0,
                LocalDateTime.of(1997, 10, 15, 8, 0), LocalDateTime.of(2004, 7, 1, 10, 0),
                "Chemical", 885.0, "X-Band", 1500000000.0, 9.7, "ISS", "CASSINI RADAR", 20000, false, "Destroyed", 0.0, "Saturn Orbit");

        SpaceProbeDTO probe7 = new SpaceProbeDTO("SP-007", "New Horizons", "Pluto", "NASA", 478.0,
                LocalDateTime.of(2006, 1, 19, 19, 0), LocalDateTime.of(2015, 7, 14, 11, 50),
                "Chemical", 228.0, "X-Band", 8000000000.0, 16.0, "LORRI", "RALPH", 5856, true, "Active", 25.0, "Kuiper Belt");

        SpaceProbeDTO probe8 = new SpaceProbeDTO("SP-008", "Juno", "Jupiter", "NASA", 3625.0,
                LocalDateTime.of(2011, 8, 5, 16, 25), LocalDateTime.of(2016, 7, 4, 8, 0),
                "Chemical", 450.0, "X-Band", 868000000.0, 42.0, "JIRAM", "MWR", 5000, true, "Active", 30.0, "Jupiter Orbit");

        SpaceProbeDTO probe9 = new SpaceProbeDTO("SP-009", "Rosetta", "Comet 67P", "ESA", 2900.0,
                LocalDateTime.of(2004, 3, 2, 7, 0), LocalDateTime.of(2014, 8, 6, 9, 0),
                "Chemical", 850.0, "X-Band", 755000000.0, 28.0, "OSIRIS", "ROSINA", 4500, false, "Inactive", 0.0, "Comet Orbit");

        SpaceProbeDTO probe10 = new SpaceProbeDTO("SP-010", "Philae", "Comet 67P", "ESA", 100.0,
                LocalDateTime.of(2014, 11, 12, 9, 0), LocalDateTime.of(2014, 11, 12, 16, 0),
                "None", 32.0, "X-Band", 755000000.0, 0.1, "COSAC", "ROLIS", 60, false, "Inactive", 0.0, "Comet Surface");

        SpaceProbeDTO probe11 = new SpaceProbeDTO("SP-011", "Mars Reconnaissance Orbiter", "Mars", "NASA", 2180.0,
                LocalDateTime.of(2005, 8, 12, 11, 0), LocalDateTime.of(2006, 3, 10, 21, 0),
                "Chemical", 2000.0, "X-Band", 225000000.0, 3.4, "HiRISE", "CRISM", 6500, true, "Active", 45.0, "Mars Orbit");

        SpaceProbeDTO probe12 = new SpaceProbeDTO("SP-012", "Curiosity Rover", "Mars", "NASA", 899.0,
                LocalDateTime.of(2011, 11, 26, 15, 0), LocalDateTime.of(2012, 8, 6, 5, 0),
                "Chemical", 125.0, "X-Band", 225000000.0, 0.0, "MastCam", "ChemCam", 5000, true, "Active", 12.0, "Mars Surface");

        SpaceProbeDTO probe13 = new SpaceProbeDTO("SP-013", "Perseverance Rover", "Mars", "NASA", 1025.0,
                LocalDateTime.of(2020, 7, 30, 11, 0), LocalDateTime.of(2021, 2, 18, 20, 0),
                "Chemical", 110.0, "X-Band", 225000000.0, 0.0, "MastCam-Z", "SuperCam", 3000, true, "Active", 35.0, "Mars Surface");

        SpaceProbeDTO probe14 = new SpaceProbeDTO("SP-014", "InSight", "Mars", "NASA", 358.0,
                LocalDateTime.of(2018, 5, 5, 11, 0), LocalDateTime.of(2018, 11, 26, 19, 0),
                "Chemical", 600.0, "X-Band", 225000000.0, 0.0, "SEIS", "HP3", 2000, false, "Inactive", 0.0, "Mars Surface");

        SpaceProbeDTO probe15 = new SpaceProbeDTO("SP-015", "MAVEN", "Mars", "NASA", 2454.0,
                LocalDateTime.of(2013, 11, 18, 18, 0), LocalDateTime.of(2014, 9, 22, 10, 0),
                "Chemical", 1135.0, "X-Band", 225000000.0, 4.0, "NGIMS", "IUVS", 4000, true, "Active", 55.0, "Mars Orbit");

        SpaceProbeDTO probe16 = new SpaceProbeDTO("SP-016", "ExoMars Trace Gas Orbiter", "Mars", "ESA", 3132.0,
                LocalDateTime.of(2016, 3, 14, 9, 0), LocalDateTime.of(2016, 10, 19, 15, 0),
                "Chemical", 2000.0, "X-Band", 225000000.0, 3.6, "ACS", "NOMAD", 3500, true, "Active", 40.0, "Mars Orbit");

        SpaceProbeDTO probe17 = new SpaceProbeDTO("SP-017", "Hope Mars Mission", "Mars", "UAE", 1350.0,
                LocalDateTime.of(2020, 7, 19, 21, 0), LocalDateTime.of(2021, 2, 9, 10, 0),
                "Chemical", 1800.0, "X-Band", 225000000.0, 4.0, "EMIRS", "EMUS", 2000, true, "Active", 38.0, "Mars Orbit");

        SpaceProbeDTO probe18 = new SpaceProbeDTO("SP-018", "Tianwen-1", "Mars", "CNSA", 5290.0,
                LocalDateTime.of(2020, 7, 23, 12, 0), LocalDateTime.of(2021, 2, 10, 11, 0),
                "Chemical", 2600.0, "X-Band", 225000000.0, 3.5, "MOC", "Mars Magnetometer", 3000, true, "Active", 42.0, "Mars Orbit");

        SpaceProbeDTO probe19 = new SpaceProbeDTO("SP-019", "Chang'e 5", "Moon", "CNSA", 8200.0,
                LocalDateTime.of(2020, 11, 23, 20, 0), LocalDateTime.of(2020, 12, 1, 15, 0),
                "Chemical", 2500.0, "X-Band", 384400000.0, 1.0, "LMS", "LRF", 23, false, "Completed", 0.0, "Moon Surface");

        SpaceProbeDTO probe20 = new SpaceProbeDTO("SP-020", "LRO", "Moon", "NASA", 1916.0,
                LocalDateTime.of(2009, 6, 18, 21, 0), LocalDateTime.of(2009, 6, 23, 9, 0),
                "Chemical", 1130.0, "X-Band", 384400000.0, 1.6, "LROC", "Diviner", 5000, true, "Active", 28.0, "Moon Orbit");

        SpaceProbeDTO probe21 = new SpaceProbeDTO("SP-021", "GRAIL-A", "Moon", "NASA", 202.0,
                LocalDateTime.of(2011, 9, 10, 13, 0), LocalDateTime.of(2012, 1, 1, 14, 0),
                "Chemical", 700.0, "X-Band", 384400000.0, 1.6, "Ka-Band Ranging", "Radio Science", 390, false, "Crashed", 0.0, "Moon Orbit");

        SpaceProbeDTO probe22 = new SpaceProbeDTO("SP-022", "GRAIL-B", "Moon", "NASA", 202.0,
                LocalDateTime.of(2011, 9, 10, 13, 0), LocalDateTime.of(2012, 1, 1, 14, 0),
                "Chemical", 700.0, "X-Band", 384400000.0, 1.6, "Ka-Band Ranging", "Radio Science", 390, false, "Crashed", 0.0, "Moon Orbit");

        SpaceProbeDTO probe23 = new SpaceProbeDTO("SP-023", "LADEE", "Moon", "NASA", 383.0,
                LocalDateTime.of(2013, 9, 7, 11, 0), LocalDateTime.of(2013, 10, 6, 10, 0),
                "Chemical", 295.0, "X-Band", 384400000.0, 1.6, "LDEX", "UVS", 200, false, "Crashed", 0.0, "Moon Orbit");

        SpaceProbeDTO probe24 = new SpaceProbeDTO("SP-024", "Chandrayaan-2", "Moon", "ISRO", 3850.0,
                LocalDateTime.of(2019, 7, 22, 14, 0), LocalDateTime.of(2019, 9, 7, 7, 0),
                "Chemical", 1000.0, "X-Band", 384400000.0, 1.7, "OHRC", "IIRS", 365, true, "Active", 22.0, "Moon Orbit");

        SpaceProbeDTO probe25 = new SpaceProbeDTO("SP-025", "Vikram Lander", "Moon", "ISRO", 1471.0,
                LocalDateTime.of(2019, 7, 22, 14, 0), LocalDateTime.of(2019, 9, 7, 7, 0),
                "Chemical", 650.0, "X-Band", 384400000.0, 0.0, "Laser Altimeter", "Seismometer", 14, false, "Crashed", 0.0, "Moon Surface");

        SpaceProbeDTO probe26 = new SpaceProbeDTO("SP-026", "Parker Solar Probe", "Sun", "NASA", 685.0,
                LocalDateTime.of(2018, 8, 12, 7, 0), LocalDateTime.of(2018, 11, 1, 10, 0),
                "Chemical", 1700.0, "X-Band", 20000000.0, 192.0, "FIELDS", "WISPR", 3000, true, "Active", 50.0, "Solar Orbit");

        SpaceProbeDTO probe27 = new SpaceProbeDTO("SP-027", "Solar Orbiter", "Sun", "ESA", 1850.0,
                LocalDateTime.of(2020, 2, 9, 10, 0), LocalDateTime.of(2025, 12, 5, 8, 0),
                "Ion", 1500.0, "X-Band", 20000000.0, 47.0, "EUI", "SPICE", 4000, true, "Active", 60.0, "Solar Orbit");

        SpaceProbeDTO probe28 = new SpaceProbeDTO("SP-028", "BepiColombo", "Mercury", "ESA", 4100.0,
                LocalDateTime.of(2018, 10, 20, 1, 0), LocalDateTime.of(2025, 12, 5, 8, 0),
                "Ion", 1500.0, "X-Band", 91000000.0, 47.0, "MERTIS", "PHEBUS", 4000, true, "Active", 60.0, "Mercury Transfer");

        SpaceProbeDTO probe29 = new SpaceProbeDTO("SP-029", "MESSENGER", "Mercury", "NASA", 485.0,
                LocalDateTime.of(2004, 8, 3, 6, 0), LocalDateTime.of(2011, 3, 18, 0, 0),
                "Chemical", 600.0, "X-Band", 91000000.0, 47.0, "MDIS", "MASCS", 4000, false, "Crashed", 0.0, "Mercury Orbit");

        SpaceProbeDTO probe30 = new SpaceProbeDTO("SP-030", "Akatsuki", "Venus", "JAXA", 640.0,
                LocalDateTime.of(2010, 5, 20, 21, 0), LocalDateTime.of(2015, 12, 7, 8, 0),
                "Chemical", 1200.0, "X-Band", 260000000.0, 35.0, "IR2", "UVI", 5000, true, "Active", 25.0, "Venus Orbit");

        SpaceProbeDTO probe31 = new SpaceProbeDTO("SP-031", "Magellan", "Venus", "NASA", 3450.0,
                LocalDateTime.of(1989, 5, 4, 18, 0), LocalDateTime.of(1990, 8, 10, 10, 0),
                "Chemical", 300.0, "X-Band", 260000000.0, 35.0, "SAR", "Altimeter", 1500, false, "Destroyed", 0.0, "Venus Orbit");

        SpaceProbeDTO probe32 = new SpaceProbeDTO("SP-032", "Venus Express", "Venus", "ESA", 1270.0,
                LocalDateTime.of(2005, 11, 9, 6, 0), LocalDateTime.of(2006, 4, 11, 8, 0),
                "Chemical", 1200.0, "X-Band", 260000000.0, 35.0, "VIRTIS", "ASPERA", 3000, false, "Destroyed", 0.0, "Venus Orbit");

        SpaceProbeDTO probe33 = new SpaceProbeDTO("SP-033", "Hayabusa2", "Asteroid Ryugu", "JAXA", 609.0,
                LocalDateTime.of(2014, 12, 3, 13, 0), LocalDateTime.of(2018, 6, 27, 9, 0),
                "Ion", 1200.0, "X-Band", 340000000.0, 30.0, "ONC-T", "NIRS3", 3500, true, "Active", 20.0, "Earth Return");

        SpaceProbeDTO probe34 = new SpaceProbeDTO("SP-034", "OSIRIS-REx", "Asteroid Bennu", "NASA", 2110.0,
                LocalDateTime.of(2016, 9, 8, 19, 0), LocalDateTime.of(2018, 12, 3, 12, 0),
                "Chemical", 1220.0, "X-Band", 334000000.0, 27.0, "OCAMS", "OTES", 2500, true, "Active", 35.0, "Earth Return");

        SpaceProbeDTO probe35 = new SpaceProbeDTO("SP-035", "Lucy", "Trojan Asteroids", "NASA", 1550.0,
                LocalDateTime.of(2021, 10, 16, 9, 0), LocalDateTime.of(2025, 4, 20, 14, 0),
                "Chemical", 800.0, "X-Band", 800000000.0, 13.0, "L'LORRI", "L'Ralph", 4000, true, "Active", 55.0, "Asteroid Tour");

        SpaceProbeDTO probe36 = new SpaceProbeDTO("SP-036", "Psyche", "Asteroid Psyche", "NASA", 2608.0,
                LocalDateTime.of(2023, 10, 13, 14, 0), LocalDateTime.of(2029, 8, 1, 10, 0),
                "Solar Electric", 2100.0, "X-Band", 500000000.0, 20.0, "Imager", "Gamma Ray Spectrometer", 4500, true, "Active", 70.0, "Asteroid Transfer");

        SpaceProbeDTO probe37 = new SpaceProbeDTO("SP-037", "DART", "Asteroid Dimorphos", "NASA", 610.0,
                LocalDateTime.of(2021, 11, 24, 6, 0), LocalDateTime.of(2022, 9, 26, 23, 0),
                "Chemical", 75.0, "X-Band", 11000000000.0, 24.0, "DRACO", "None", 300, false, "Destroyed", 0.0, "Impact Trajectory");

        SpaceProbeDTO probe38 = new SpaceProbeDTO("SP-038", "LICIACube", "Asteroid Dimorphos", "ASI", 14.0,
                LocalDateTime.of(2021, 11, 24, 6, 0), LocalDateTime.of(2022, 9, 26, 23, 0),
                "None", 15.0, "X-Band", 11000000000.0, 24.0, "LICIACube", "None", 300, true, "Active", 8.0, "Flyby");

        SpaceProbeDTO probe39 = new SpaceProbeDTO("SP-039", "Hubble Space Telescope", "Earth Orbit", "NASA", 11110.0,
                LocalDateTime.of(1990, 4, 24, 8, 0), LocalDateTime.of(1990, 4, 25, 10, 0),
                "None", 2800.0, "S-Band", 540000.0, 7.5, "WFC3", "COS", 12000, true, "Active", 150.0, "LEO");

        SpaceProbeDTO probe40 = new SpaceProbeDTO("SP-040", "James Webb Space Telescope", "L2 Point", "NASA", 6200.0,
                LocalDateTime.of(2021, 12, 25, 12, 0), LocalDateTime.of(2022, 1, 24, 14, 0),
                "None", 2000.0, "Ka-Band", 1500000000.0, 0.2, "NIRCam", "MIRI", 10000, true, "Active", 120.0, "L2 Halo");

        SpaceProbeDTO probe41 = new SpaceProbeDTO("SP-041", "Chandra X-ray Observatory", "Earth Orbit", "NASA", 4800.0,
                LocalDateTime.of(1999, 7, 23, 12, 0), LocalDateTime.of(1999, 7, 23, 12, 0),
                "None", 2100.0, "S-Band", 100000.0, 8.0, "ACIS", "HRC", 9000, true, "Active", 95.0, "HEO");

        SpaceProbeDTO probe42 = new SpaceProbeDTO("SP-042", "Spitzer Space Telescope", "Earth Orbit", "NASA", 950.0,
                LocalDateTime.of(2003, 8, 25, 5, 0), LocalDateTime.of(2003, 8, 25, 5, 0),
                "None", 400.0, "S-Band", 150000000.0, 30.0, "IRAC", "MIPS", 6000, false, "Inactive", 0.0, "Heliocentric");

        SpaceProbeDTO probe43 = new SpaceProbeDTO("SP-043", "Kepler Space Telescope", "Earth Orbit", "NASA", 1039.0,
                LocalDateTime.of(2009, 3, 7, 3, 0), LocalDateTime.of(2009, 3, 7, 3, 0),
                "None", 550.0, "X-Band", 150000000.0, 30.0, "Photometer", "None", 4000, false, "Inactive", 0.0, "Heliocentric");

        SpaceProbeDTO probe44 = new SpaceProbeDTO("SP-044", "TESS", "Earth Orbit", "NASA", 362.0,
                LocalDateTime.of(2018, 4, 18, 18, 0), LocalDateTime.of(2018, 4, 18, 18, 0),
                "None", 350.0, "X-Band", 150000000.0, 28.0, "CCD Cameras", "None", 2000, true, "Active", 45.0, "HEO");

        SpaceProbeDTO probe45 = new SpaceProbeDTO("SP-045", "Gaia", "L2 Point", "ESA", 2130.0,
                LocalDateTime.of(2013, 12, 19, 9, 0), LocalDateTime.of(2014, 1, 8, 10, 0),
                "None", 1800.0, "X-Band", 1500000000.0, 0.2, "Astrometer", "Spectrometer", 5000, true, "Active", 85.0, "L2 Halo");

        SpaceProbeDTO probe46 = new SpaceProbeDTO("SP-046", "Euclid", "L2 Point", "ESA", 2160.0,
                LocalDateTime.of(2023, 7, 1, 11, 0), LocalDateTime.of(2023, 8, 15, 12, 0),
                "None", 1500.0, "X-Band", 1500000000.0, 0.2, "VIS", "NISP", 6000, true, "Active", 75.0, "L2 Halo");

        SpaceProbeDTO probe47 = new SpaceProbeDTO("SP-047", "PLATO", "L2 Point", "ESA", 2300.0,
                LocalDateTime.of(2026, 12, 1, 10, 0), LocalDateTime.of(2027, 3, 1, 12, 0),
                "None", 1600.0, "X-Band", 1500000000.0, 0.2, "24 Cameras", "None", 4000, false, "Scheduled", 100.0, "L2 Halo");

        SpaceProbeDTO probe48 = new SpaceProbeDTO("SP-048", "IXPE", "Earth Orbit", "NASA", 325.0,
                LocalDateTime.of(2021, 12, 9, 6, 0), LocalDateTime.of(2021, 12, 9, 6, 0),
                "None", 400.0, "X-Band", 600000.0, 7.5, "X-ray Polarimeters", "None", 2000, true, "Active", 30.0, "LEO");

        SpaceProbeDTO probe49 = new SpaceProbeDTO("SP-049", "XRISM", "Earth Orbit", "JAXA", 2300.0,
                LocalDateTime.of(2023, 9, 6, 8, 0), LocalDateTime.of(2023, 9, 6, 8, 0),
                "None", 1500.0, "X-Band", 600000.0, 7.5, "Resolve", "Xtend", 3000, true, "Active", 40.0, "LEO");

        SpaceProbeDTO probe50 = new SpaceProbeDTO("SP-050", "Luna 25", "Moon", "Roscosmos", 1750.0,
                LocalDateTime.of(2023, 8, 11, 23, 0), LocalDateTime.of(2023, 8, 16, 12, 0),
                "Chemical", 1200.0, "X-Band", 384400000.0, 1.0, "LIDAR", "Landing Camera", 50, false, "Crashed", 0.0, "Moon Surface");

        SpaceProbeDTO probe51 = new SpaceProbeDTO("SP-051", "Chang'e 6", "Moon", "CNSA", 8200.0,
                LocalDateTime.of(2024, 5, 3, 17, 0), LocalDateTime.of(2024, 6, 2, 14, 0),
                "Chemical", 2500.0, "X-Band", 384400000.0, 1.0, "LMS", "LRF", 53, true, "Active", 20.0, "Moon Surface");

        SpaceProbeDTO probe52 = new SpaceProbeDTO("SP-052", "SLIM", "Moon", "JAXA", 590.0,
                LocalDateTime.of(2023, 9, 7, 8, 0), LocalDateTime.of(2024, 1, 20, 0, 0),
                "Chemical", 700.0, "X-Band", 384400000.0, 1.6, "Landing Camera", "Spectrometer", 14, true, "Active", 10.0, "Moon Surface");

        SpaceProbeDTO probe53 = new SpaceProbeDTO("SP-053", "Artemis I", "Moon", "NASA", 2698.0,
                LocalDateTime.of(2022, 11, 16, 6, 0), LocalDateTime.of(2022, 11, 21, 12, 0),
                "Chemical", 2000.0, "S-Band", 384400000.0, 39.0, "Orion Cameras", "BioSentinel", 25, false, "Completed", 0.0, "Moon Orbit");

        SpaceProbeDTO probe54 = new SpaceProbeDTO("SP-054", "CAPSTONE", "Moon", "NASA", 25.0,
                LocalDateTime.of(2022, 6, 28, 9, 0), LocalDateTime.of(2022, 11, 14, 10, 0),
                "Chemical", 30.0, "X-Band", 384400000.0, 0.5, "Navigation", "None", 6, true, "Active", 5.0, "NRHO");

        SpaceProbeDTO probe55 = new SpaceProbeDTO("SP-055", "LunaH-Map", "Moon", "NASA", 14.0,
                LocalDateTime.of(2022, 6, 28, 9, 0), LocalDateTime.of(2022, 11, 13, 12, 0),
                "Chemical", 5.0, "X-Band", 384400000.0, 0.5, "Neutron Spectrometer", "None", 6, false, "Lost", 0.0, "NRHO");

        SpaceProbeDTO probe56 = new SpaceProbeDTO("SP-056", "CubeQ", "Moon", "NASA", 8.0,
                LocalDateTime.of(2022, 6, 28, 9, 0), LocalDateTime.of(2022, 11, 14, 12, 0),
                "Chemical", 3.0, "X-Band", 384400000.0, 0.5, "Radiation Detector", "None", 6, true, "Active", 2.0, "NRHO");

        SpaceProbeDTO probe57 = new SpaceProbeDTO("SP-057", "Lunar IceCube", "Moon", "NASA", 14.0,
                LocalDateTime.of(2022, 11, 12, 8, 0), LocalDateTime.of(2022, 11, 13, 10, 0),
                "Chemical", 5.0, "X-Band", 384400000.0, 0.5, "IR Spectrometer", "None", 6, false, "Lost", 0.0, "NRHO");

        SpaceProbeDTO probe58 = new SpaceProbeDTO("SP-058", "OMOTENASHI", "Moon", "JAXA", 12.0,
                LocalDateTime.of(2022, 11, 16, 8, 0), LocalDateTime.of(2022, 11, 21, 12, 0),
                "Chemical", 3.0, "X-Band", 384400000.0, 0.5, "Landing Camera", "None", 6, false, "Lost", 0.0, "Moon Transfer");

        SpaceProbeDTO probe59 = new SpaceProbeDTO("SP-059", "EQUULEUS", "Moon", "JAXA", 6.0,
                LocalDateTime.of(2022, 11, 16, 8, 0), LocalDateTime.of(2022, 11, 21, 12, 0),
                "Chemical", 2.0, "X-Band", 384400000.0, 0.5, "UV Camera", "None", 6, true, "Active", 3.0, "Moon Orbit");

        SpaceProbeDTO probe60 = new SpaceProbeDTO("SP-060", "Danuri", "Moon", "KARI", 678.0,
                LocalDateTime.of(2022, 8, 5, 7, 0), LocalDateTime.of(2022, 12, 17, 14, 0),
                "Chemical", 400.0, "X-Band", 384400000.0, 1.6, "ShadowCam", "PolCam", 365, true, "Active", 25.0, "Moon Orbit");

        SpaceProbeDTO probe61 = new SpaceProbeDTO("SP-061", "Rashid Rover", "Moon", "UAE", 10.0,
                LocalDateTime.of(2022, 12, 11, 7, 0), LocalDateTime.of(2023, 4, 25, 15, 0),
                "None", 5.0, "X-Band", 384400000.0, 0.0, "Cameras", "LXRF", 14, false, "Lost", 0.0, "Moon Surface");

        SpaceProbeDTO probe62 = new SpaceProbeDTO("SP-062", "Yutu-2", "Moon", "CNSA", 140.0,
                LocalDateTime.of(2018, 12, 8, 2, 0), LocalDateTime.of(2019, 1, 3, 10, 0),
                "None", 120.0, "X-Band", 384400000.0, 0.0, "VNIS", "LPR", 1800, true, "Active", 15.0, "Moon Surface");

        SpaceProbeDTO probe63 = new SpaceProbeDTO("SP-063", "Chang'e 4 Lander", "Moon", "CNSA", 1200.0,
                LocalDateTime.of(2018, 12, 8, 2, 0), LocalDateTime.of(2019, 1, 3, 10, 0),
                "Chemical", 800.0, "X-Band", 384400000.0, 0.0, "Landing Camera", "LFS", 1800, true, "Active", 20.0, "Moon Surface");

        SpaceProbeDTO probe64 = new SpaceProbeDTO("SP-064", "Queqiao Relay", "Moon", "CNSA", 450.0,
                LocalDateTime.of(2018, 5, 21, 21, 0), LocalDateTime.of(2018, 6, 14, 8, 0),
                "Chemical", 300.0, "X-Band", 450000000.0, 0.2, "Antenna", "None", 3650, true, "Active", 25.0, "L2 Halo");

        SpaceProbeDTO probe65 = new SpaceProbeDTO("SP-065", "Chang'e 5 T1", "Moon", "CNSA", 2400.0,
                LocalDateTime.of(2014, 10, 24, 2, 0), LocalDateTime.of(2014, 10, 27, 12, 0),
                "Chemical", 1200.0, "X-Band", 384400000.0, 11.0, "Test Camera", "None", 8, false, "Completed", 0.0, "Moon Flyby");

        SpaceProbeDTO probe66 = new SpaceProbeDTO("SP-066", "LADEE", "Moon", "NASA", 383.0,
                LocalDateTime.of(2013, 9, 7, 11, 0), LocalDateTime.of(2013, 10, 6, 10, 0),
                "Chemical", 295.0, "X-Band", 384400000.0, 1.6, "LDEX", "UVS", 200, false, "Crashed", 0.0, "Moon Orbit");

        SpaceProbeDTO probe67 = new SpaceProbeDTO("SP-067", "LCROSS", "Moon", "NASA", 620.0,
                LocalDateTime.of(2009, 6, 18, 21, 0), LocalDateTime.of(2009, 10, 9, 11, 0),
                "Chemical", 900.0, "S-Band", 384400000.0, 2.4, "Spectrometers", "Cameras", 112, false, "Impacted", 0.0, "Moon Impact");

        SpaceProbeDTO probe68 = new SpaceProbeDTO("SP-068", "LRO", "Moon", "NASA", 1916.0,
                LocalDateTime.of(2009, 6, 18, 21, 0), LocalDateTime.of(2009, 6, 23, 9, 0),
                "Chemical", 1130.0, "X-Band", 384400000.0, 1.6, "LROC", "Diviner", 5000, true, "Active", 28.0, "Moon Orbit");

        SpaceProbeDTO probe69 = new SpaceProbeDTO("SP-069", "Chandrayaan-1", "Moon", "ISRO", 1380.0,
                LocalDateTime.of(2008, 10, 22, 0, 0), LocalDateTime.of(2008, 11, 8, 12, 0),
                "Chemical", 690.0, "S-Band", 384400000.0, 1.6, "M3", "Mini-SAR", 312, false, "Lost", 0.0, "Moon Orbit");

        SpaceProbeDTO probe70 = new SpaceProbeDTO("SP-070", "Kaguya", "Moon", "JAXA", 3000.0,
                LocalDateTime.of(2007, 9, 14, 1, 0), LocalDateTime.of(2007, 10, 4, 12, 0),
                "Chemical", 2100.0, "S-Band", 384400000.0, 1.6, "Spectral Imager", "Terrain Camera", 540, false, "Crashed", 0.0, "Moon Orbit");

        SpaceProbeDTO probe71 = new SpaceProbeDTO("SP-071", "SELENE-2", "Moon", "JAXA", 1800.0,
                LocalDateTime.of(2025, 4, 1, 10, 0), LocalDateTime.of(2025, 5, 15, 14, 0),
                "Chemical", 1200.0, "X-Band", 384400000.0, 1.6, "Lander", "Rover", 365, false, "Scheduled", 100.0, "Moon Surface");

        SpaceProbeDTO probe72 = new SpaceProbeDTO("SP-072", "VIPER", "Moon", "NASA", 450.0,
                LocalDateTime.of(2024, 11, 1, 8, 0), LocalDateTime.of(2025, 3, 1, 12, 0),
                "Solar Electric", 350.0, "X-Band", 384400000.0, 0.0, "Drill", "Spectrometer", 100, false, "Scheduled", 50.0, "Moon Surface");

        SpaceProbeDTO probe73 = new SpaceProbeDTO("SP-073", "Lunar Trailblazer", "Moon", "NASA", 200.0,
                LocalDateTime.of(2025, 3, 1, 10, 0), LocalDateTime.of(2025, 4, 15, 14, 0),
                "Chemical", 150.0, "X-Band", 384400000.0, 1.6, "HVM", "LWIR", 365, false, "Scheduled", 40.0, "Moon Orbit");

        SpaceProbeDTO probe74 = new SpaceProbeDTO("SP-074", "Lunar Vertex", "Moon", "NASA", 50.0,
                LocalDateTime.of(2025, 6, 1, 10, 0), LocalDateTime.of(2025, 7, 15, 14, 0),
                "Chemical", 30.0, "X-Band", 384400000.0, 0.0, "Seismometer", "None", 14, false, "Scheduled", 15.0, "Moon Surface");

        SpaceProbeDTO probe75 = new SpaceProbeDTO("SP-075", "MoonRanger", "Moon", "NASA", 20.0,
                LocalDateTime.of(2025, 3, 1, 10, 0), LocalDateTime.of(2025, 4, 15, 14, 0),
                "Solar", 15.0, "X-Band", 384400000.0, 0.0, "Rover", "Cameras", 14, false, "Scheduled", 10.0, "Moon Surface");

        SpaceProbeDTO probe76 = new SpaceProbeDTO("SP-076", "LUVOIR", "Space", "NASA", 15000.0,
                LocalDateTime.of(2039, 5, 1, 10, 0), LocalDateTime.of(2039, 8, 1, 12, 0),
                "None", 5000.0, "Ka-Band", 1500000000.0, 0.1, "Coronagraph", "Spectrograph", 10000, false, "Proposed", 200.0, "L2 Halo");

        SpaceProbeDTO probe77 = new SpaceProbeDTO("SP-077", "HabEx", "Space", "NASA", 12000.0,
                LocalDateTime.of(2035, 5, 1, 10, 0), LocalDateTime.of(2035, 8, 1, 12, 0),
                "None", 4000.0, "Ka-Band", 1500000000.0, 0.1, "Starshade", "Spectrograph", 8000, false, "Proposed", 180.0, "L2 Halo");

        SpaceProbeDTO probe78 = new SpaceProbeDTO("SP-078", "OST", "Space", "NASA", 8000.0,
                LocalDateTime.of(2040, 5, 1, 10, 0), LocalDateTime.of(2040, 8, 1, 12, 0),
                "None", 3000.0, "Ka-Band", 1500000000.0, 0.1, "X-ray", "Spectrograph", 6000, false, "Proposed", 150.0, "L2 Halo");

        SpaceProbeDTO probe79 = new SpaceProbeDTO("SP-079", "Lynx", "Space", "NASA", 5000.0,
                LocalDateTime.of(2035, 5, 1, 10, 0), LocalDateTime.of(2035, 8, 1, 12, 0),
                "None", 2000.0, "Ka-Band", 1500000000.0, 0.1, "X-ray", "Spectrograph", 4000, false, "Proposed", 120.0, "L2 Halo");

        SpaceProbeDTO probe80 = new SpaceProbeDTO("SP-080", "Nancy Grace Roman", "Space", "NASA", 4400.0,
                LocalDateTime.of(2027, 5, 1, 10, 0), LocalDateTime.of(2027, 7, 1, 12, 0),
                "None", 1800.0, "Ka-Band", 1500000000.0, 0.2, "Wide Field", "Coronagraph", 5000, false, "Scheduled", 110.0, "L2 Halo");

        SpaceProbeDTO probe81 = new SpaceProbeDTO("SP-081", "SPHEREx", "Space", "NASA", 400.0,
                LocalDateTime.of(2025, 4, 1, 10, 0), LocalDateTime.of(2025, 6, 1, 12, 0),
                "None", 350.0, "X-Band", 1500000000.0, 0.2, "Spectrometer", "None", 2500, false, "Scheduled", 45.0, "LEO");

        SpaceProbeDTO probe82 = new SpaceProbeDTO("SP-082", "WFIRST", "Space", "NASA", 4400.0,
                LocalDateTime.of(2027, 5, 1, 10, 0), LocalDateTime.of(2027, 7, 1, 12, 0),
                "None", 1800.0, "Ka-Band", 1500000000.0, 0.2, "Wide Field", "Coronagraph", 5000, false, "Scheduled", 110.0, "L2 Halo");

        SpaceProbeDTO probe83 = new SpaceProbeDTO("SP-083", "Athena", "Space", "ESA", 5000.0,
                LocalDateTime.of(2037, 5, 1, 10, 0), LocalDateTime.of(2037, 8, 1, 12, 0),
                "None", 2000.0, "Ka-Band", 1500000000.0, 0.1, "X-ray", "Spectrograph", 4000, false, "Proposed", 120.0, "L2 Halo");

        SpaceProbeDTO probe84 = new SpaceProbeDTO("SP-084", "LISA", "Space", "ESA", 2200.0,
                LocalDateTime.of(2034, 5, 1, 10, 0), LocalDateTime.of(2034, 8, 1, 12, 0),
                "None", 1500.0, "Ka-Band", 1500000000.0, 0.2, "Gravitational Wave", "None", 4000, false, "Proposed", 80.0, "L2 Halo");

        SpaceProbeDTO probe85 = new SpaceProbeDTO("SP-085", "EnVision", "Venus", "ESA", 2500.0,
                LocalDateTime.of(2031, 11, 1, 10, 0), LocalDateTime.of(2032, 6, 1, 12, 0),
                "Chemical", 1500.0, "X-Band", 260000000.0, 35.0, "VenSAR", "Spectrometer", 4000, false, "Scheduled", 60.0, "Venus Orbit");

        SpaceProbeDTO probe86 = new SpaceProbeDTO("SP-086", "DAVINCI", "Venus", "NASA", 900.0,
                LocalDateTime.of(2029, 6, 1, 10, 0), LocalDateTime.of(2030, 6, 1, 12, 0),
                "Chemical", 600.0, "X-Band", 260000000.0, 35.0, "Descent Probe", "Orbiter", 2000, false, "Scheduled", 40.0, "Venus Orbit");

        SpaceProbeDTO probe87 = new SpaceProbeDTO("SP-087", "VERITAS", "Venus", "NASA", 2200.0,
                LocalDateTime.of(2028, 5, 1, 10, 0), LocalDateTime.of(2028, 11, 1, 12, 0),
                "Chemical", 1400.0, "X-Band", 260000000.0, 35.0, "SAR", "Spectrometer", 3500, false, "Scheduled", 55.0, "Venus Orbit");

        SpaceProbeDTO probe88 = new SpaceProbeDTO("SP-088", "Shukrayaan-2", "Venus", "ISRO", 2500.0,
                LocalDateTime.of(2025, 12, 1, 10, 0), LocalDateTime.of(2026, 3, 1, 12, 0),
                "Chemical", 1500.0, "X-Band", 260000000.0, 35.0, "SAR", "Spectrometer", 4000, false, "Scheduled", 60.0, "Venus Orbit");

        SpaceProbeDTO probe89 = new SpaceProbeDTO("SP-089", "Comet Interceptor", "Comet", "ESA", 1000.0,
                LocalDateTime.of(2029, 5, 1, 10, 0), LocalDateTime.of(2030, 1, 1, 12, 0),
                "Chemical", 600.0, "X-Band", 755000000.0, 28.0, "Cameras", "Spectrometer", 3000, false, "Scheduled", 35.0, "Comet Intercept");

        SpaceProbeDTO probe90 = new SpaceProbeDTO("SP-090", "JUICE", "Jupiter", "ESA", 6000.0,
                LocalDateTime.of(2023, 4, 14, 12, 0), LocalDateTime.of(2031, 7, 1, 10, 0),
                "Chemical", 2800.0, "X-Band", 965000000.0, 13.0, "JANUS", "MAJIS", 8000, true, "Active", 65.0, "Jupiter Orbit");

        SpaceProbeDTO probe91 = new SpaceProbeDTO("SP-091", "Europa Clipper", "Jupiter", "NASA", 6000.0,
                LocalDateTime.of(2024, 10, 1, 10, 0), LocalDateTime.of(2030, 4, 1, 12, 0),
                "Chemical", 2800.0, "X-Band", 965000000.0, 13.0, "EIS", "MASPEX", 8000, true, "Active", 65.0, "Jupiter Orbit");

        SpaceProbeDTO probe92 = new SpaceProbeDTO("SP-092", "Tianwen-2", "Asteroid", "CNSA", 3000.0,
                LocalDateTime.of(2025, 5, 1, 10, 0), LocalDateTime.of(2026, 6, 1, 12, 0),
                "Chemical", 1500.0, "X-Band", 500000000.0, 20.0, "Cameras", "Spectrometer", 4500, false, "Scheduled", 70.0, "Asteroid Transfer");

        SpaceProbeDTO probe93 = new SpaceProbeDTO("SP-093", "Tianwen-3", "Mars", "CNSA", 8000.0,
                LocalDateTime.of(2028, 7, 1, 10, 0), LocalDateTime.of(2030, 8, 1, 12, 0),
                "Chemical", 4000.0, "X-Band", 225000000.0, 4.0, "Lander", "Rover", 5000, false, "Scheduled", 80.0, "Mars Surface");

        SpaceProbeDTO probe94 = new SpaceProbeDTO("SP-094", "Tianwen-4", "Jupiter", "CNSA", 5000.0,
                LocalDateTime.of(2029, 9, 1, 10, 0), LocalDateTime.of(2035, 3, 1, 12, 0),
                "Chemical", 2500.0, "X-Band", 965000000.0, 13.0, "Cameras", "Spectrometer", 6000, false, "Scheduled", 60.0, "Jupiter Orbit");

        SpaceProbeDTO probe95 = new SpaceProbeDTO("SP-095", "MMX", "Mars", "JAXA", 3000.0,
                LocalDateTime.of(2024, 9, 1, 10, 0), LocalDateTime.of(2025, 9, 1, 12, 0),
                "Chemical", 1500.0, "X-Band", 225000000.0, 4.0, "Cameras", "Spectrometer", 4500, true, "Active", 55.0, "Mars Orbit");

        SpaceProbeDTO probe96 = new SpaceProbeDTO("SP-096", "Mars Sample Return", "Mars", "NASA", 4000.0,
                LocalDateTime.of(2028, 6, 1, 10, 0), LocalDateTime.of(2033, 7, 1, 12, 0),
                "Chemical", 2000.0, "X-Band", 225000000.0, 4.0, "Sample Cache", "Ascent Vehicle", 5000, false, "Scheduled", 75.0, "Mars Surface");

        SpaceProbeDTO probe97 = new SpaceProbeDTO("SP-097", "ExoMars Rover", "Mars", "ESA", 2000.0,
                LocalDateTime.of(2028, 7, 1, 10, 0), LocalDateTime.of(2030, 6, 1, 12, 0),
                "Chemical", 1000.0, "X-Band", 225000000.0, 0.0, "Drill", "Spectrometer", 3000, false, "Scheduled", 40.0, "Mars Surface");

        SpaceProbeDTO probe98 = new SpaceProbeDTO("SP-098", "Dragonfly", "Titan", "NASA", 450.0,
                LocalDateTime.of(2028, 6, 1, 10, 0), LocalDateTime.of(2034, 8, 1, 12, 0),
                "Nuclear", 350.0, "X-Band", 1200000000.0, 6.0, "Rotorcraft", "Spectrometer", 2000, false, "Scheduled", 45.0, "Titan Surface");

        SpaceProbeDTO probe99 = new SpaceProbeDTO("SP-099", "Titan Saturn System Mission", "Titan", "NASA", 5000.0,
                LocalDateTime.of(2035, 5, 1, 10, 0), LocalDateTime.of(2040, 8, 1, 12, 0),
                "Nuclear", 3000.0, "X-Band", 1200000000.0, 6.0, "Orbiter", "Balloon", 6000, false, "Proposed", 80.0, "Titan Orbit");

        SpaceProbeDTO probe100 = new SpaceProbeDTO("SP-100", "Starshot", "Alpha Centauri", "Breakthrough", 0.001,
                LocalDateTime.of(2050, 1, 1, 0, 0), LocalDateTime.of(2060, 1, 1, 0, 0),
                "Laser Sail", 0.01, "Optical", 40000000000000.0, 20000.0, "Camera", "None", 1, false, "Proposed", 0.0, "Interstellar");

        SpaceProbeDTO probe101 = new SpaceProbeDTO("SP-101", "Breakthrough Starshot", "Alpha Centauri", "Breakthrough", 0.001,
                LocalDateTime.of(2050, 1, 1, 0, 0), LocalDateTime.of(2060, 1, 1, 0, 0),
                "Laser Sail", 0.01, "Optical", 40000000000000.0, 20000.0, "Camera", "None", 1, false, "Proposed", 0.0, "Interstellar");

        SpaceProbeDTO probe102 = new SpaceProbeDTO("SP-102", "Voyager 1 Extended", "Interstellar", "NASA", 825.5,
                LocalDateTime.of(1977, 9, 5, 12, 0), LocalDateTime.of(2030, 1, 1, 0, 0),
                "Chemical", 420.0, "S-Band", 200000000000.0, 17.0, "Plasma", "Cosmic Ray", 25000, true, "Active", 5.0, "Interstellar");

        SpaceProbeDTO probe103 = new SpaceProbeDTO("SP-103", "Voyager 2 Extended", "Interstellar", "NASA", 825.5,
                LocalDateTime.of(1977, 8, 20, 14, 0), LocalDateTime.of(2030, 1, 1, 0, 0),
                "Chemical", 420.0, "S-Band", 200000000000.0, 15.5, "Plasma", "Cosmic Ray", 25000, true, "Active", 8.0, "Interstellar");

        SpaceProbeDTO probe104 = new SpaceProbeDTO("SP-104", "New Horizons Extended", "Kuiper Belt", "NASA", 478.0,
                LocalDateTime.of(2006, 1, 19, 19, 0), LocalDateTime.of(2035, 1, 1, 0, 0),
                "Chemical", 228.0, "X-Band", 9000000000.0, 16.0, "LORRI", "RALPH", 8000, true, "Active", 15.0, "Kuiper Belt");

        SpaceProbeDTO probe105 = new SpaceProbeDTO("SP-105", "Deep Space Gateway", "Moon Orbit", "NASA", 40000.0,
                LocalDateTime.of(2027, 5, 1, 10, 0), LocalDateTime.of(2028, 1, 1, 12, 0),
                "Solar Electric", 5000.0, "Ka-Band", 384400000.0, 1.0, "Habitation", "Lab", 10000, false, "Scheduled", 200.0, "NRHO");

        SpaceProbeDTO probe106 = new SpaceProbeDTO("SP-106", "Lunar Gateway", "Moon Orbit", "NASA", 40000.0,
                LocalDateTime.of(2027, 5, 1, 10, 0), LocalDateTime.of(2028, 1, 1, 12, 0),
                "Solar Electric", 5000.0, "Ka-Band", 384400000.0, 1.0, "Habitation", "Lab", 10000, false, "Scheduled", 200.0, "NRHO");

        SpaceProbeDTO probe107 = new SpaceProbeDTO("SP-107", "Artemis II", "Moon", "NASA", 2698.0,
                LocalDateTime.of(2025, 9, 1, 10, 0), LocalDateTime.of(2025, 11, 1, 12, 0),
                "Chemical", 2000.0, "S-Band", 384400000.0, 39.0, "Orion", "Crew", 25, false, "Scheduled", 0.0, "Moon Flyby");

        SpaceProbeDTO probe108 = new SpaceProbeDTO("SP-108", "Artemis III", "Moon", "NASA", 2698.0,
                LocalDateTime.of(2026, 9, 1, 10, 0), LocalDateTime.of(2026, 11, 1, 12, 0),
                "Chemical", 2000.0, "S-Band", 384400000.0, 39.0, "Orion", "Lander", 25, false, "Scheduled", 0.0, "Moon Landing");

        SpaceProbeDTO probe109 = new SpaceProbeDTO("SP-109", "Artemis IV", "Moon", "NASA", 2698.0,
                LocalDateTime.of(2028, 9, 1, 10, 0), LocalDateTime.of(2028, 11, 1, 12, 0),
                "Chemical", 2000.0, "S-Band", 384400000.0, 39.0, "Orion", "Gateway", 25, false, "Scheduled", 0.0, "Moon Landing");

        SpaceProbeDTO probe110 = new SpaceProbeDTO("SP-110", "Starship HLS", "Moon", "SpaceX", 100000.0,
                LocalDateTime.of(2026, 9, 1, 10, 0), LocalDateTime.of(2026, 11, 1, 12, 0),
                "Chemical", 12000.0, "Ka-Band", 384400000.0, 10.0, "Lander", "Cargo", 50000, false, "Scheduled", 500.0, "Moon Surface");

        SpaceProbeDTO probe111 = new SpaceProbeDTO("SP-111", "Blue Moon", "Moon", "Blue Origin", 45000.0,
                LocalDateTime.of(2027, 5, 1, 10, 0), LocalDateTime.of(2027, 8, 1, 12, 0),
                "Hydrogen", 8000.0, "Ka-Band", 384400000.0, 10.0, "Lander", "Cargo", 20000, false, "Scheduled", 300.0, "Moon Surface");

        SpaceProbeDTO probe112 = new SpaceProbeDTO("SP-112", "Prospector", "Moon", "Intuitive Machines", 2000.0,
                LocalDateTime.of(2025, 3, 1, 10, 0), LocalDateTime.of(2025, 5, 1, 12, 0),
                "Chemical", 1000.0, "X-Band", 384400000.0, 1.0, "Drill", "Spectrometer", 100, false, "Scheduled", 50.0, "Moon Surface");

        SpaceProbeDTO probe113 = new SpaceProbeDTO("SP-113", "Nova-C", "Moon", "Intuitive Machines", 2000.0,
                LocalDateTime.of(2025, 3, 1, 10, 0), LocalDateTime.of(2025, 5, 1, 12, 0),
                "Chemical", 1000.0, "X-Band", 384400000.0, 1.0, "Lander", "Cargo", 100, false, "Scheduled", 50.0, "Moon Surface");

        SpaceProbeDTO probe114 = new SpaceProbeDTO("SP-114", "Peregrine", "Moon", "Astrobotic", 1200.0,
                LocalDateTime.of(2025, 1, 1, 10, 0), LocalDateTime.of(2025, 3, 1, 12, 0),
                "Chemical", 800.0, "X-Band", 384400000.0, 1.0, "Lander", "Cargo", 90, false, "Scheduled", 40.0, "Moon Surface");

        SpaceProbeDTO probe115 = new SpaceProbeDTO("SP-115", "Griffin", "Moon", "Astrobotic", 3500.0,
                LocalDateTime.of(2026, 3, 1, 10, 0), LocalDateTime.of(2026, 6, 1, 12, 0),
                "Chemical", 2000.0, "X-Band", 384400000.0, 1.0, "Lander", "Rover", 200, false, "Scheduled", 80.0, "Moon Surface");

        SpaceProbeDTO probe116 = new SpaceProbeDTO("SP-116", "Z-01", "Moon", "ispace", 1000.0,
                LocalDateTime.of(2025, 4, 1, 10, 0), LocalDateTime.of(2025, 6, 1, 12, 0),
                "Chemical", 600.0, "X-Band", 384400000.0, 1.0, "Lander", "Rover", 50, false, "Scheduled", 30.0, "Moon Surface");

        SpaceProbeDTO probe117 = new SpaceProbeDTO("SP-117", "Z-02", "Moon", "ispace", 1000.0,
                LocalDateTime.of(2026, 4, 1, 10, 0), LocalDateTime.of(2026, 6, 1, 12, 0),
                "Chemical", 600.0, "X-Band", 384400000.0, 1.0, "Lander", "Rover", 50, false, "Scheduled", 30.0, "Moon Surface");

        SpaceProbeDTO probe118 = new SpaceProbeDTO("SP-118", "Rashid 2", "Moon", "UAE", 15.0,
                LocalDateTime.of(2025, 4, 1, 10, 0), LocalDateTime.of(2025, 6, 1, 12, 0),
                "None", 10.0, "X-Band", 384400000.0, 0.0, "Rover", "Cameras", 14, false, "Scheduled", 5.0, "Moon Surface");

        SpaceProbeDTO probe119 = new SpaceProbeDTO("SP-119", "Yutu-3", "Moon", "CNSA", 200.0,
                LocalDateTime.of(2026, 5, 1, 10, 0), LocalDateTime.of(2026, 7, 1, 12, 0),
                "None", 150.0, "X-Band", 384400000.0, 0.0, "Rover", "Spectrometer", 2000, false, "Scheduled", 20.0, "Moon Surface");

        SpaceProbeDTO probe120 = new SpaceProbeDTO("SP-120", "Chang'e 7", "Moon", "CNSA", 8000.0,
                LocalDateTime.of(2026, 11, 1, 10, 0), LocalDateTime.of(2027, 2, 1, 12, 0),
                "Chemical", 4000.0, "X-Band", 384400000.0, 1.0, "Orbiter", "Lander", 365, false, "Scheduled", 50.0, "Moon South Pole");

        SpaceProbeDTO probe121 = new SpaceProbeDTO("SP-121", "Chang'e 8", "Moon", "CNSA", 8000.0,
                LocalDateTime.of(2028, 5, 1, 10, 0), LocalDateTime.of(2028, 8, 1, 12, 0),
                "Chemical", 4000.0, "X-Band", 384400000.0, 1.0, "Orbiter", "Lander", 365, false, "Scheduled", 50.0, "Moon South Pole");

        SpaceProbeDTO probe122 = new SpaceProbeDTO("SP-122", "ILRS Base", "Moon", "CNSA", 15000.0,
                LocalDateTime.of(2030, 5, 1, 10, 0), LocalDateTime.of(2035, 5, 1, 12, 0),
                "Nuclear", 8000.0, "Ka-Band", 384400000.0, 1.0, "Habitation", "Lab", 20000, false, "Proposed", 500.0, "Moon South Pole");

        SpaceProbeDTO probe123 = new SpaceProbeDTO("SP-123", "Artemis Base Camp", "Moon", "NASA", 20000.0,
                LocalDateTime.of(2030, 5, 1, 10, 0), LocalDateTime.of(2035, 5, 1, 12, 0),
                "Nuclear", 10000.0, "Ka-Band", 384400000.0, 1.0, "Habitation", "Lab", 25000, false, "Proposed", 600.0, "Moon South Pole");

        SpaceProbeDTO probe124 = new SpaceProbeDTO("SP-124", "LunaNet", "Moon", "NASA", 500.0,
                LocalDateTime.of(2026, 5, 1, 10, 0), LocalDateTime.of(2026, 8, 1, 12, 0),
                "Solar", 300.0, "X-Band", 384400000.0, 0.2, "Communication", "Navigation", 365, false, "Scheduled", 25.0, "Moon Orbit");

        SpaceProbeDTO probe125 = new SpaceProbeDTO("SP-125", "Mars 2020", "Mars", "NASA", 1025.0,
                LocalDateTime.of(2020, 7, 30, 11, 0), LocalDateTime.of(2021, 2, 18, 20, 0),
                "Chemical", 110.0, "X-Band", 225000000.0, 0.0, "MastCam-Z", "SuperCam", 3000, true, "Active", 35.0, "Mars Surface");

        SpaceProbeDTO probe126 = new SpaceProbeDTO("SP-126", "Ingenuity", "Mars", "NASA", 1.8,
                LocalDateTime.of(2021, 2, 18, 12, 0), LocalDateTime.of(2021, 4, 19, 7, 0),
                "None", 0.5, "X-Band", 225000000.0, 0.0, "Camera", "None", 30, false, "Completed", 0.0, "Mars Surface");

        SpaceProbeDTO probe127 = new SpaceProbeDTO("SP-127", "ExoMars 2022", "Mars", "ESA", 4300.0,
                LocalDateTime.of(2022, 9, 1, 10, 0), LocalDateTime.of(2023, 6, 1, 12, 0),
                "Chemical", 2000.0, "X-Band", 225000000.0, 4.0, "Rover", "Lander", 5000, false, "Cancelled", 0.0, "Mars Surface");

        SpaceProbeDTO probe128 = new SpaceProbeDTO("SP-128", "Mangalyaan 2", "Mars", "ISRO", 2500.0,
                LocalDateTime.of(2024, 7, 1, 10, 0), LocalDateTime.of(2025, 2, 1, 12, 0),
                "Chemical", 1500.0, "X-Band", 225000000.0, 4.0, "Orbiter", "None", 3650, false, "Scheduled", 40.0, "Mars Orbit");

        SpaceProbeDTO probe129 = new SpaceProbeDTO("SP-129", "Mars Life Explorer", "Mars", "NASA", 4500.0,
                LocalDateTime.of(2035, 5, 1, 10, 0), LocalDateTime.of(2036, 8, 1, 12, 0),
                "Chemical", 2000.0, "X-Band", 225000000.0, 4.0, "Lander", "Drill", 5000, false, "Proposed", 60.0, "Mars Surface");

        SpaceProbeDTO probe130 = new SpaceProbeDTO("SP-130", "Icebreaker Life", "Mars", "NASA", 4000.0,
                LocalDateTime.of(2038, 5, 1, 10, 0), LocalDateTime.of(2039, 8, 1, 12, 0),
                "Chemical", 1800.0, "X-Band", 225000000.0, 4.0, "Drill", "Spectrometer", 4500, false, "Proposed", 55.0, "Mars Surface");

        SpaceProbeDTO probe131 = new SpaceProbeDTO("SP-131", "NeMO", "Mars", "NASA", 3500.0,
                LocalDateTime.of(2033, 5, 1, 10, 0), LocalDateTime.of(2034, 8, 1, 12, 0),
                "Chemical", 1500.0, "X-Band", 225000000.0, 4.0, "Drill", "Spectrometer", 4000, false, "Proposed", 50.0, "Mars Surface");

        SpaceProbeDTO probe132 = new SpaceProbeDTO("SP-132", "Cautio", "Mars", "ESA", 3000.0,
                LocalDateTime.of(2032, 5, 1, 10, 0), LocalDateTime.of(2033, 8, 1, 12, 0),
                "Chemical", 1200.0, "X-Band", 225000000.0, 4.0, "Rover", "Drill", 3500, false, "Proposed", 45.0, "Mars Surface");

        SpaceProbeDTO probe133 = new SpaceProbeDTO("SP-133", "Fobos-Grunt 2", "Phobos", "Roscosmos", 4000.0,
                LocalDateTime.of(2030, 5, 1, 10, 0), LocalDateTime.of(2032, 8, 1, 12, 0),
                "Chemical", 2000.0, "X-Band", 225000000.0, 4.0, "Lander", "Return", 5000, false, "Proposed", 60.0, "Phobos Surface");

        SpaceProbeDTO probe134 = new SpaceProbeDTO("SP-134", "MMX Sample Return", "Phobos", "JAXA", 3000.0,
                LocalDateTime.of(2024, 9, 1, 10, 0), LocalDateTime.of(2029, 9, 1, 12, 0),
                "Chemical", 1500.0, "X-Band", 225000000.0, 4.0, "Lander", "Return", 4500, true, "Active", 55.0, "Phobos Surface");

        SpaceProbeDTO probe135 = new SpaceProbeDTO("SP-135", "Hera", "Dimorphos", "ESA", 1100.0,
                LocalDateTime.of(2024, 10, 1, 10, 0), LocalDateTime.of(2026, 12, 1, 12, 0),
                "Chemical", 800.0, "X-Band", 500000000.0, 20.0, "Camera", "Lander", 3000, true, "Active", 35.0, "Asteroid Orbit");

        SpaceProbeDTO probe136 = new SpaceProbeDTO("SP-136", "Janus", "Asteroid", "NASA", 500.0,
                LocalDateTime.of(2025, 8, 1, 10, 0), LocalDateTime.of(2027, 8, 1, 12, 0),
                "Chemical", 300.0, "X-Band", 500000000.0, 20.0, "Camera", "Spectrometer", 2000, false, "Scheduled", 25.0, "Asteroid Tour");

        SpaceProbeDTO probe137 = new SpaceProbeDTO("SP-137", "NEA Scout", "Asteroid", "NASA", 14.0,
                LocalDateTime.of(2022, 11, 16, 8, 0), LocalDateTime.of(2023, 11, 1, 12, 0),
                "Solar Sail", 5.0, "X-Band", 500000000.0, 20.0, "Camera", "None", 6, false, "Lost", 2.0, "Asteroid Intercept");

        SpaceProbeDTO probe138 = new SpaceProbeDTO("SP-138", "LightSail 2", "Earth Orbit", "Planetary Society", 5.0,
                LocalDateTime.of(2019, 6, 25, 14, 0), LocalDateTime.of(2019, 7, 23, 10, 0),
                "Solar Sail", 2.0, "X-Band", 42000000.0, 7.5, "Camera", "None", 365, false, "Deorbited", 0.0, "LEO");

        SpaceProbeDTO probe139 = new SpaceProbeDTO("SP-139", "IKAROS", "Venus", "JAXA", 315.0,
                LocalDateTime.of(2010, 5, 21, 0, 0), LocalDateTime.of(2010, 12, 8, 12, 0),
                "Solar Sail", 100.0, "X-Band", 260000000.0, 35.0, "Camera", "None", 180, false, "Completed", 0.0, "Venus Flyby");

        SpaceProbeDTO probe140 = new SpaceProbeDTO("SP-140", "NanoSail-D2", "Earth Orbit", "NASA", 4.0,
                LocalDateTime.of(2010, 12, 8, 0, 0), LocalDateTime.of(2011, 1, 17, 12, 0),
                "Solar Sail", 1.0, "X-Band", 42000000.0, 7.5, "Camera", "None", 240, false, "Deorbited", 0.0, "LEO");

        SpaceProbeDTO probe141 = new SpaceProbeDTO("SP-141", "OSIRIS-APEX", "Asteroid Apophis", "NASA", 2110.0,
                LocalDateTime.of(2029, 9, 1, 10, 0), LocalDateTime.of(2030, 4, 13, 12, 0),
                "Chemical", 1220.0, "X-Band", 334000000.0, 27.0, "OCAMS", "OTES", 2500, false, "Scheduled", 35.0, "Asteroid Orbit");

        SpaceProbeDTO probe142 = new SpaceProbeDTO("SP-142", "Destiny+", "Asteroid", "NASA", 1000.0,
                LocalDateTime.of(2026, 5, 1, 10, 0), LocalDateTime.of(2029, 5, 1, 12, 0),
                "Solar Electric", 600.0, "X-Band", 500000000.0, 20.0, "Camera", "Spectrometer", 3000, false, "Scheduled", 40.0, "Asteroid Tour");

        SpaceProbeDTO probe143 = new SpaceProbeDTO("SP-143", "Janus 2", "Asteroid", "NASA", 500.0,
                LocalDateTime.of(2027, 5, 1, 10, 0), LocalDateTime.of(2029, 5, 1, 12, 0),
                "Chemical", 300.0, "X-Band", 500000000.0, 20.0, "Camera", "Spectrometer", 2000, false, "Scheduled", 25.0, "Asteroid Tour");

        SpaceProbeDTO probe144 = new SpaceProbeDTO("SP-144", "Camille", "Asteroid", "NASA", 600.0,
                LocalDateTime.of(2028, 5, 1, 10, 0), LocalDateTime.of(2030, 5, 1, 12, 0),
                "Solar Electric", 350.0, "X-Band", 500000000.0, 20.0, "Camera", "Spectrometer", 2500, false, "Scheduled", 30.0, "Asteroid Tour");

        SpaceProbeDTO probe145 = new SpaceProbeDTO("SP-145", "Synthetic Aperture Radar", "Asteroid", "NASA", 800.0,
                LocalDateTime.of(2029, 5, 1, 10, 0), LocalDateTime.of(2031, 5, 1, 12, 0),
                "Solar Electric", 450.0, "X-Band", 500000000.0, 20.0, "SAR", "Spectrometer", 3000, false, "Scheduled", 35.0, "Asteroid Tour");

        SpaceProbeDTO probe146 = new SpaceProbeDTO("SP-146", "M-Cubed", "Asteroid", "NASA", 400.0,
                LocalDateTime.of(2027, 5, 1, 10, 0), LocalDateTime.of(2029, 5, 1, 12, 0),
                "Solar Electric", 250.0, "X-Band", 500000000.0, 20.0, "Camera", "Spectrometer", 2000, false, "Scheduled", 20.0, "Asteroid Tour");

        SpaceProbeDTO probe147 = new SpaceProbeDTO("SP-147", "NEOCam", "Earth Orbit", "NASA", 1200.0,
                LocalDateTime.of(2025, 5, 1, 10, 0), LocalDateTime.of(2025, 7, 1, 12, 0),
                "None", 800.0, "X-Band", 150000000.0, 28.0, "IR Telescope", "None", 2500, false, "Scheduled", 45.0, "L2 Halo");

        SpaceProbeDTO probe148 = new SpaceProbeDTO("SP-148", "NEO Surveyor", "Earth Orbit", "NASA", 1300.0,
                LocalDateTime.of(2028, 5, 1, 10, 0), LocalDateTime.of(2028, 8, 1, 12, 0),
                "None", 900.0, "X-Band", 150000000.0, 28.0, "IR Telescope", "None", 3000, false, "Scheduled", 50.0, "L2 Halo");

        SpaceProbeDTO probe149 = new SpaceProbeDTO("SP-149", "DART 2", "Asteroid", "NASA", 800.0,
                LocalDateTime.of(2030, 5, 1, 10, 0), LocalDateTime.of(2032, 5, 1, 12, 0),
                "Chemical", 100.0, "X-Band", 500000000.0, 20.0, "Camera", "None", 500, false, "Proposed", 15.0, "Asteroid Impact");

        SpaceProbeDTO probe150 = new SpaceProbeDTO("SP-150", "AIM", "Asteroid", "ESA", 900.0,
                LocalDateTime.of(2024, 10, 1, 10, 0), LocalDateTime.of(2026, 12, 1, 12, 0),
                "Chemical", 500.0, "X-Band", 500000000.0, 20.0, "Camera", "Lander", 3000, false, "Cancelled", 25.0, "Asteroid Orbit");

        SpaceProbeDTO probe151 = new SpaceProbeDTO("SP-151", "Don Quijote", "Asteroid", "ESA", 600.0,
                LocalDateTime.of(2027, 5, 1, 10, 0), LocalDateTime.of(2029, 5, 1, 12, 0),
                "Chemical", 300.0, "X-Band", 500000000.0, 20.0, "Impactor", "Orbiter", 2000, false, "Proposed", 20.0, "Asteroid Impact");

        SpaceProbeDTO probe152 = new SpaceProbeDTO("SP-152", "AIDA", "Asteroid", "NASA/ESA", 700.0,
                LocalDateTime.of(2024, 10, 1, 10, 0), LocalDateTime.of(2026, 12, 1, 12, 0),
                "Chemical", 400.0, "X-Band", 500000000.0, 20.0, "Impactor", "Orbiter", 2500, true, "Active", 25.0, "Asteroid Impact");

        SpaceProbeDTO probe153 = new SpaceProbeDTO("SP-153", "Smart-1", "Moon", "ESA", 367.0,
                LocalDateTime.of(2003, 9, 27, 23, 0), LocalDateTime.of(2004, 11, 15, 12, 0),
                "Ion", 120.0, "S-Band", 384400000.0, 1.6, "Camera", "Spectrometer", 365, false, "Impacted", 0.0, "Moon Orbit");

        SpaceProbeDTO probe154 = new SpaceProbeDTO("SP-154", "Lunar Reconnaissance Orbiter", "Moon", "NASA", 1916.0,
                LocalDateTime.of(2009, 6, 18, 21, 0), LocalDateTime.of(2009, 6, 23, 9, 0),
                "Chemical", 1130.0, "X-Band", 384400000.0, 1.6, "LROC", "Diviner", 5000, true, "Active", 28.0, "Moon Orbit");

        SpaceProbeDTO probe155 = new SpaceProbeDTO("SP-155", "GRAIL", "Moon", "NASA", 202.0,
                LocalDateTime.of(2011, 9, 10, 13, 0), LocalDateTime.of(2012, 1, 1, 14, 0),
                "Chemical", 700.0, "X-Band", 384400000.0, 1.6, "Ka-Band Ranging", "Radio Science", 390, false, "Crashed", 0.0, "Moon Orbit");

        SpaceProbeDTO probe156 = new SpaceProbeDTO("SP-156", "Artemis V", "Moon", "NASA", 2698.0,
                LocalDateTime.of(2029, 9, 1, 10, 0), LocalDateTime.of(2029, 11, 1, 12, 0),
                "Chemical", 2000.0, "S-Band", 384400000.0, 39.0, "Orion", "Gateway", 25, false, "Scheduled", 0.0, "Moon Landing");

        SpaceProbeDTO probe157 = new SpaceProbeDTO("SP-157", "Artemis VI", "Moon", "NASA", 2698.0,
                LocalDateTime.of(2030, 9, 1, 10, 0), LocalDateTime.of(2030, 11, 1, 12, 0),
                "Chemical", 2000.0, "S-Band", 384400000.0, 39.0, "Orion", "Gateway", 25, false, "Scheduled", 0.0, "Moon Landing");

        SpaceProbeDTO probe158 = new SpaceProbeDTO("SP-158", "Artemis VII", "Moon", "NASA", 2698.0,
                LocalDateTime.of(2031, 9, 1, 10, 0), LocalDateTime.of(2031, 11, 1, 12, 0),
                "Chemical", 2000.0, "S-Band", 384400000.0, 39.0, "Orion", "Gateway", 25, false, "Scheduled", 0.0, "Moon Landing");

        SpaceProbeDTO probe159 = new SpaceProbeDTO("SP-159", "Artemis VIII", "Moon", "NASA", 2698.0,
                LocalDateTime.of(2032, 9, 1, 10, 0), LocalDateTime.of(2032, 11, 1, 12, 0),
                "Chemical", 2000.0, "S-Band", 384400000.0, 39.0, "Orion", "Gateway", 25, false, "Scheduled", 0.0, "Moon Landing");

        SpaceProbeDTO probe160 = new SpaceProbeDTO("SP-160", "SpaceX Starship", "Mars", "SpaceX", 100000.0,
                LocalDateTime.of(2029, 5, 1, 10, 0), LocalDateTime.of(2030, 2, 1, 12, 0),
                "Chemical", 12000.0, "Ka-Band", 225000000.0, 10.0, "Starship", "Cargo", 100000, false, "Scheduled", 1000.0, "Mars Surface");

        SpaceProbeDTO probe161 = new SpaceProbeDTO("SP-161", "SpaceX Starship 2", "Mars", "SpaceX", 100000.0,
                LocalDateTime.of(2031, 5, 1, 10, 0), LocalDateTime.of(2032, 2, 1, 12, 0),
                "Chemical", 12000.0, "Ka-Band", 225000000.0, 10.0, "Starship", "Cargo", 100000, false, "Scheduled", 1000.0, "Mars Surface");

        SpaceProbeDTO probe162 = new SpaceProbeDTO("SP-162", "SpaceX Starship 3", "Mars", "SpaceX", 100000.0,
                LocalDateTime.of(2033, 5, 1, 10, 0), LocalDateTime.of(2034, 2, 1, 12, 0),
                "Chemical", 12000.0, "Ka-Band", 225000000.0, 10.0, "Starship", "Cargo", 100000, false, "Scheduled", 1000.0, "Mars Surface");

        SpaceProbeDTO probe163 = new SpaceProbeDTO("SP-163", "SpaceX Starship 4", "Mars", "SpaceX", 100000.0,
                LocalDateTime.of(2035, 5, 1, 10, 0), LocalDateTime.of(2036, 2, 1, 12, 0),
                "Chemical", 12000.0, "Ka-Band", 225000000.0, 10.0, "Starship", "Cargo", 100000, false, "Scheduled", 1000.0, "Mars Surface");

        SpaceProbeDTO probe164 = new SpaceProbeDTO("SP-164", "SpaceX Starship 5", "Mars", "SpaceX", 100000.0,
                LocalDateTime.of(2037, 5, 1, 10, 0), LocalDateTime.of(2038, 2, 1, 12, 0),
                "Chemical", 12000.0, "Ka-Band", 225000000.0, 10.0, "Starship", "Cargo", 100000, false, "Scheduled", 1000.0, "Mars Surface");

        SpaceProbeDTO probe165 = new SpaceProbeDTO("SP-165", "Blue Origin New Glenn", "Mars", "Blue Origin", 50000.0,
                LocalDateTime.of(2032, 5, 1, 10, 0), LocalDateTime.of(2033, 2, 1, 12, 0),
                "Chemical", 8000.0, "Ka-Band", 225000000.0, 10.0, "New Glenn", "Cargo", 50000, false, "Scheduled", 500.0, "Mars Surface");

        SpaceProbeDTO probe166 = new SpaceProbeDTO("SP-166", "Blue Origin New Armstrong", "Moon", "Blue Origin", 45000.0,
                LocalDateTime.of(2029, 5, 1, 10, 0), LocalDateTime.of(2029, 8, 1, 12, 0),
                "Hydrogen", 8000.0, "Ka-Band", 384400000.0, 10.0, "New Armstrong", "Cargo", 20000, false, "Proposed", 300.0, "Moon Surface");

        SpaceProbeDTO probe167 = new SpaceProbeDTO("SP-167", "ULA Vulcan", "Mars", "ULA", 25000.0,
                LocalDateTime.of(2028, 5, 1, 10, 0), LocalDateTime.of(2029, 2, 1, 12, 0),
                "Chemical", 5000.0, "Ka-Band", 225000000.0, 10.0, "Vulcan", "Cargo", 25000, false, "Scheduled", 250.0, "Mars Surface");

        SpaceProbeDTO probe168 = new SpaceProbeDTO("SP-168", "SLS Block 1", "Moon", "NASA", 95000.0,
                LocalDateTime.of(2024, 11, 1, 10, 0), LocalDateTime.of(2025, 2, 1, 12, 0),
                "Chemical", 15000.0, "S-Band", 384400000.0, 39.0, "Orion", "Cargo", 95000, false, "Scheduled", 500.0, "Moon Orbit");

        SpaceProbeDTO probe169 = new SpaceProbeDTO("SP-169", "SLS Block 1B", "Moon", "NASA", 105000.0,
                LocalDateTime.of(2026, 5, 1, 10, 0), LocalDateTime.of(2026, 8, 1, 12, 0),
                "Chemical", 18000.0, "S-Band", 384400000.0, 39.0, "Orion", "Cargo", 105000, false, "Scheduled", 600.0, "Moon Orbit");

        SpaceProbeDTO probe170 = new SpaceProbeDTO("SP-170", "SLS Block 2", "Moon", "NASA", 130000.0,
                LocalDateTime.of(2029, 5, 1, 10, 0), LocalDateTime.of(2029, 8, 1, 12, 0),
                "Chemical", 25000.0, "S-Band", 384400000.0, 39.0, "Orion", "Cargo", 130000, false, "Proposed", 800.0, "Moon Orbit");

        SpaceProbeDTO probe171 = new SpaceProbeDTO("SP-171", "Long March 5", "Mars", "CNSA", 8700.0,
                LocalDateTime.of(2020, 7, 23, 12, 0), LocalDateTime.of(2021, 2, 10, 11, 0),
                "Chemical", 2600.0, "X-Band", 225000000.0, 3.5, "Tianwen-1", "Orbiter", 3000, true, "Active", 42.0, "Mars Orbit");

        SpaceProbeDTO probe172 = new SpaceProbeDTO("SP-172", "Long March 9", "Mars", "CNSA", 150000.0,
                LocalDateTime.of(2033, 5, 1, 10, 0), LocalDateTime.of(2034, 2, 1, 12, 0),
                "Chemical", 30000.0, "Ka-Band", 225000000.0, 10.0, "Long March 9", "Cargo", 150000, false, "Proposed", 1500.0, "Mars Surface");

        SpaceProbeDTO probe173 = new SpaceProbeDTO("SP-173", "Ariane 6", "Mars", "ESA", 23000.0,
                LocalDateTime.of(2027, 5, 1, 10, 0), LocalDateTime.of(2028, 2, 1, 12, 0),
                "Chemical", 5000.0, "Ka-Band", 225000000.0, 10.0, "Ariane 6", "Cargo", 23000, false, "Scheduled", 250.0, "Mars Surface");

        SpaceProbeDTO probe174 = new SpaceProbeDTO("SP-174", "H3", "Mars", "JAXA", 14000.0,
                LocalDateTime.of(2026, 5, 1, 10, 0), LocalDateTime.of(2027, 2, 1, 12, 0),
                "Chemical", 3000.0, "X-Band", 225000000.0, 10.0, "H3", "Cargo", 14000, false, "Scheduled", 150.0, "Mars Surface");

        SpaceProbeDTO probe175 = new SpaceProbeDTO("SP-175", "GSLV Mk III", "Mars", "ISRO", 4000.0,
                LocalDateTime.of(2025, 5, 1, 10, 0), LocalDateTime.of(2026, 2, 1, 12, 0),
                "Chemical", 1500.0, "X-Band", 225000000.0, 10.0, "GSLV", "Cargo", 4000, false, "Scheduled", 50.0, "Mars Orbit");

        SpaceProbeDTO probe176 = new SpaceProbeDTO("SP-176", "Angara A5", "Mars", "Roscosmos", 25000.0,
                LocalDateTime.of(2028, 5, 1, 10, 0), LocalDateTime.of(2029, 2, 1, 12, 0),
                "Chemical", 5000.0, "X-Band", 225000000.0, 10.0, "Angara", "Cargo", 25000, false, "Proposed", 250.0, "Mars Surface");

        SpaceProbeDTO probe177 = new SpaceProbeDTO("SP-177", "Proton-M", "Mars", "Roscosmos", 22000.0,
                LocalDateTime.of(2026, 5, 1, 10, 0), LocalDateTime.of(2027, 2, 1, 12, 0),
                "Chemical", 4500.0, "X-Band", 225000000.0, 10.0, "Proton", "Cargo", 22000, false, "Scheduled", 220.0, "Mars Surface");

        SpaceProbeDTO probe178 = new SpaceProbeDTO("SP-178", "Soyuz 2", "Mars", "Roscosmos", 7000.0,
                LocalDateTime.of(2025, 5, 1, 10, 0), LocalDateTime.of(2026, 2, 1, 12, 0),
                "Chemical", 1500.0, "X-Band", 225000000.0, 10.0, "Soyuz", "Cargo", 7000, false, "Scheduled", 70.0, "Mars Orbit");

        SpaceProbeDTO probe179 = new SpaceProbeDTO("SP-179", "Falcon Heavy", "Mars", "SpaceX", 64000.0,
                LocalDateTime.of(2024, 5, 1, 10, 0), LocalDateTime.of(2025, 2, 1, 12, 0),
                "Chemical", 10000.0, "Ka-Band", 225000000.0, 10.0, "Falcon Heavy", "Cargo", 64000, false, "Scheduled", 640.0, "Mars Surface");

        SpaceProbeDTO probe180 = new SpaceProbeDTO("SP-180", "Falcon 9", "Mars", "SpaceX", 5500.0,
                LocalDateTime.of(2024, 5, 1, 10, 0), LocalDateTime.of(2025, 2, 1, 12, 0),
                "Chemical", 1000.0, "X-Band", 225000000.0, 10.0, "Falcon 9", "Cargo", 5500, false, "Scheduled", 55.0, "Mars Orbit");

        SpaceProbeDTO probe181 = new SpaceProbeDTO("SP-181", "Electron", "Mars", "Rocket Lab", 300.0,
                LocalDateTime.of(2025, 5, 1, 10, 0), LocalDateTime.of(2026, 2, 1, 12, 0),
                "Chemical", 100.0, "X-Band", 225000000.0, 10.0, "Electron", "Cargo", 300, false, "Scheduled", 5.0, "Mars Orbit");

        SpaceProbeDTO probe182 = new SpaceProbeDTO("SP-182", "Neutron", "Mars", "Rocket Lab", 8000.0,
                LocalDateTime.of(2026, 5, 1, 10, 0), LocalDateTime.of(2027, 2, 1, 12, 0),
                "Chemical", 2000.0, "X-Band", 225000000.0, 10.0, "Neutron", "Cargo", 8000, false, "Scheduled", 80.0, "Mars Surface");

        SpaceProbeDTO probe183 = new SpaceProbeDTO("SP-183", "Terran 1", "Mars", "Relativity Space", 1200.0,
                LocalDateTime.of(2025, 5, 1, 10, 0), LocalDateTime.of(2026, 2, 1, 12, 0),
                "Chemical", 300.0, "X-Band", 225000000.0, 10.0, "Terran 1", "Cargo", 1200, false, "Scheduled", 15.0, "Mars Orbit");

        SpaceProbeDTO probe184 = new SpaceProbeDTO("SP-184", "Terran R", "Mars", "Relativity Space", 20000.0,
                LocalDateTime.of(2027, 5, 1, 10, 0), LocalDateTime.of(2028, 2, 1, 12, 0),
                "Chemical", 4000.0, "Ka-Band", 225000000.0, 10.0, "Terran R", "Cargo", 20000, false, "Scheduled", 200.0, "Mars Surface");

        SpaceProbeDTO probe185 = new SpaceProbeDTO("SP-185", "Starship HLS Crew", "Moon", "SpaceX", 100000.0,
                LocalDateTime.of(2027, 9, 1, 10, 0), LocalDateTime.of(2027, 11, 1, 12, 0),
                "Chemical", 12000.0, "Ka-Band", 384400000.0, 10.0, "Starship", "Crew", 100000, false, "Scheduled", 1000.0, "Moon Surface");

        SpaceProbeDTO probe186 = new SpaceProbeDTO("SP-186", "Orion Crew", "Moon", "NASA", 2698.0,
                LocalDateTime.of(2025, 9, 1, 10, 0), LocalDateTime.of(2025, 11, 1, 12, 0),
                "Chemical", 2000.0, "S-Band", 384400000.0, 39.0, "Orion", "Crew", 25, false, "Scheduled", 0.0, "Moon Flyby");

        SpaceProbeDTO probe187 = new SpaceProbeDTO("SP-187", "Crew Dragon", "Moon", "SpaceX", 12000.0,
                LocalDateTime.of(2026, 9, 1, 10, 0), LocalDateTime.of(2026, 11, 1, 12, 0),
                "Chemical", 1500.0, "Ka-Band", 384400000.0, 10.0, "Dragon", "Crew", 7000, false, "Scheduled", 100.0, "Moon Flyby");

        SpaceProbeDTO probe188 = new SpaceProbeDTO("SP-188", "Starliner", "Moon", "Boeing", 13000.0,
                LocalDateTime.of(2027, 9, 1, 10, 0), LocalDateTime.of(2027, 11, 1, 12, 0),
                "Chemical", 1600.0, "Ka-Band", 384400000.0, 10.0, "Starliner", "Crew", 7500, false, "Scheduled", 110.0, "Moon Flyby");

        SpaceProbeDTO probe189 = new SpaceProbeDTO("SP-189", "Dream Chaser", "Moon", "Sierra Nevada", 11000.0,
                LocalDateTime.of(2026, 9, 1, 10, 0), LocalDateTime.of(2026, 11, 1, 12, 0),
                "Chemical", 1400.0, "Ka-Band", 384400000.0, 10.0, "Dream Chaser", "Crew", 6500, false, "Scheduled", 90.0, "Moon Flyby");

        SpaceProbeDTO probe190 = new SpaceProbeDTO("SP-190", "Gaganyaan", "Moon", "ISRO", 8000.0,
                LocalDateTime.of(2025, 5, 1, 10, 0), LocalDateTime.of(2025, 8, 1, 12, 0),
                "Chemical", 2000.0, "X-Band", 384400000.0, 10.0, "Gaganyaan", "Crew", 4000, false, "Scheduled", 50.0, "LEO");

        SpaceProbeDTO probe191 = new SpaceProbeDTO("SP-191", "Shenzhou", "Moon", "CNSA", 8500.0,
                LocalDateTime.of(2028, 5, 1, 10, 0), LocalDateTime.of(2028, 8, 1, 12, 0),
                "Chemical", 2200.0, "X-Band", 384400000.0, 10.0, "Shenzhou", "Crew", 4500, false, "Scheduled", 55.0, "Moon Orbit");

        SpaceProbeDTO probe192 = new SpaceProbeDTO("SP-192", "Crew Space Transportation System", "Moon", "CNSA", 9000.0,
                LocalDateTime.of(2030, 5, 1, 10, 0), LocalDateTime.of(2030, 8, 1, 12, 0),
                "Chemical", 2500.0, "X-Band", 384400000.0, 10.0, "CSTS", "Crew", 5000, false, "Proposed", 60.0, "Moon Surface");

        SpaceProbeDTO probe193 = new SpaceProbeDTO("SP-193", "Orel", "Moon", "Roscosmos", 14000.0,
                LocalDateTime.of(2030, 5, 1, 10, 0), LocalDateTime.of(2030, 8, 1, 12, 0),
                "Chemical", 3000.0, "X-Band", 384400000.0, 10.0, "Orel", "Crew", 7000, false, "Proposed", 70.0, "Moon Orbit");

        SpaceProbeDTO probe194 = new SpaceProbeDTO("SP-194", "PPTS", "Moon", "Roscosmos", 15000.0,
                LocalDateTime.of(2032, 5, 1, 10, 0), LocalDateTime.of(2032, 8, 1, 12, 0),
                "Chemical", 3500.0, "X-Band", 384400000.0, 10.0, "PPTS", "Crew", 7500, false, "Proposed", 75.0, "Moon Surface");

        SpaceProbeDTO probe195 = new SpaceProbeDTO("SP-195", "Crewed Starship", "Mars", "SpaceX", 100000.0,
                LocalDateTime.of(2035, 5, 1, 10, 0), LocalDateTime.of(2036, 2, 1, 12, 0),
                "Chemical", 12000.0, "Ka-Band", 225000000.0, 10.0, "Starship", "Crew", 100000, false, "Proposed", 1000.0, "Mars Surface");

        SpaceProbeDTO probe196 = new SpaceProbeDTO("SP-196", "Mars Direct", "Mars", "NASA", 50000.0,
                LocalDateTime.of(2035, 5, 1, 10, 0), LocalDateTime.of(2037, 2, 1, 12, 0),
                "Chemical", 8000.0, "Ka-Band", 225000000.0, 10.0, "Hab", "Return Vehicle", 25000, false, "Proposed", 500.0, "Mars Surface");

        SpaceProbeDTO probe197 = new SpaceProbeDTO("SP-197", "Mars Colonial Transporter", "Mars", "SpaceX", 100000.0,
                LocalDateTime.of(2035, 5, 1, 10, 0), LocalDateTime.of(2036, 2, 1, 12, 0),
                "Chemical", 12000.0, "Ka-Band", 225000000.0, 10.0, "MCT", "Crew", 100000, false, "Proposed", 1000.0, "Mars Surface");

        SpaceProbeDTO probe198 = new SpaceProbeDTO("SP-198", "Interplanetary Transport System", "Mars", "SpaceX", 100000.0,
                LocalDateTime.of(2035, 5, 1, 10, 0), LocalDateTime.of(2036, 2, 1, 12, 0),
                "Chemical", 12000.0, "Ka-Band", 225000000.0, 10.0, "ITS", "Crew", 100000, false, "Proposed", 1000.0, "Mars Surface");

        SpaceProbeDTO probe199 = new SpaceProbeDTO("SP-199", "Red Dragon", "Mars", "SpaceX", 10000.0,
                LocalDateTime.of(2028, 5, 1, 10, 0), LocalDateTime.of(2029, 2, 1, 12, 0),
                "Chemical", 2000.0, "Ka-Band", 225000000.0, 10.0, "Dragon", "Cargo", 10000, false, "Proposed", 100.0, "Mars Surface");

        SpaceProbeDTO probe200 = new SpaceProbeDTO("SP-200", "Mars Base Alpha", "Mars", "NASA", 50000.0,
                LocalDateTime.of(2040, 5, 1, 10, 0), LocalDateTime.of(2045, 5, 1, 12, 0),
                "Nuclear", 10000.0, "Ka-Band", 225000000.0, 10.0, "Habitation", "Lab", 50000, false, "Proposed", 2000.0, "Mars Surface");

        SpaceProbeDTO probe201 = new SpaceProbeDTO("SP-201", "Mars Base Beta", "Mars", "SpaceX", 60000.0,
                LocalDateTime.of(2042, 5, 1, 10, 0), LocalDateTime.of(2047, 5, 1, 12, 0),
                "Nuclear", 12000.0, "Ka-Band", 225000000.0, 10.0, "Habitation", "Lab", 60000, false, "Proposed", 2500.0, "Mars Surface");

        SpaceProbeDTO probe202 = new SpaceProbeDTO("SP-202", "Mars Base Gamma", "Mars", "Blue Origin", 55000.0,
                LocalDateTime.of(2044, 5, 1, 10, 0), LocalDateTime.of(2049, 5, 1, 12, 0),
                "Nuclear", 11000.0, "Ka-Band", 225000000.0, 10.0, "Habitation", "Lab", 55000, false, "Proposed", 2200.0, "Mars Surface");

        SpaceProbeDTO probe203 = new SpaceProbeDTO("SP-203", "Mars Base Delta", "Mars", "ESA", 45000.0,
                LocalDateTime.of(2046, 5, 1, 10, 0), LocalDateTime.of(2051, 5, 1, 12, 0),
                "Nuclear", 9000.0, "Ka-Band", 225000000.0, 10.0, "Habitation", "Lab", 45000, false, "Proposed", 1800.0, "Mars Surface");

        SpaceProbeDTO probe204 = new SpaceProbeDTO("SP-204", "Mars Base Epsilon", "Mars", "CNSA", 50000.0,
                LocalDateTime.of(2048, 5, 1, 10, 0), LocalDateTime.of(2053, 5, 1, 12, 0),
                "Nuclear", 10000.0, "Ka-Band", 225000000.0, 10.0, "Habitation", "Lab", 50000, false, "Proposed", 2000.0, "Mars Surface");

        SpaceProbeDTO probe205 = new SpaceProbeDTO("SP-205", "Lunar Base Alpha", "Moon", "NASA", 30000.0,
                LocalDateTime.of(2035, 5, 1, 10, 0), LocalDateTime.of(2040, 5, 1, 12, 0),
                "Nuclear", 6000.0, "Ka-Band", 384400000.0, 1.0, "Habitation", "Lab", 30000, false, "Proposed", 1200.0, "Moon South Pole");

        SpaceProbeDTO probe206 = new SpaceProbeDTO("SP-206", "Lunar Base Beta", "Moon", "SpaceX", 35000.0,
                LocalDateTime.of(2037, 5, 1, 10, 0), LocalDateTime.of(2042, 5, 1, 12, 0),
                "Nuclear", 7000.0, "Ka-Band", 384400000.0, 1.0, "Habitation", "Lab", 35000, false, "Proposed", 1400.0, "Moon South Pole");

        SpaceProbeDTO probe207 = new SpaceProbeDTO("SP-207", "Lunar Base Gamma", "Moon", "Blue Origin", 32000.0,
                LocalDateTime.of(2039, 5, 1, 10, 0), LocalDateTime.of(2044, 5, 1, 12, 0),
                "Nuclear", 6500.0, "Ka-Band", 384400000.0, 1.0, "Habitation", "Lab", 32000, false, "Proposed", 1300.0, "Moon South Pole");

        SpaceProbeDTO probe208 = new SpaceProbeDTO("SP-208", "Lunar Base Delta", "Moon", "ESA", 28000.0,
                LocalDateTime.of(2041, 5, 1, 10, 0), LocalDateTime.of(2046, 5, 1, 12, 0),
                "Nuclear", 5600.0, "Ka-Band", 384400000.0, 1.0, "Habitation", "Lab", 28000, false, "Proposed", 1100.0, "Moon South Pole");

        SpaceProbeDTO probe209 = new SpaceProbeDTO("SP-209", "Lunar Base Epsilon", "Moon", "CNSA", 30000.0,
                LocalDateTime.of(2043, 5, 1, 10, 0), LocalDateTime.of(2048, 5, 1, 12, 0),
                "Nuclear", 6000.0, "Ka-Band", 384400000.0, 1.0, "Habitation", "Lab", 30000, false, "Proposed", 1200.0, "Moon South Pole");

        SpaceProbeDTO probe210 = new SpaceProbeDTO("SP-210", "Gateway Station", "Moon Orbit", "NASA", 45000.0,
                LocalDateTime.of(2028, 5, 1, 10, 0), LocalDateTime.of(2029, 1, 1, 12, 0),
                "Solar Electric", 6000.0, "Ka-Band", 384400000.0, 1.0, "Habitation", "Lab", 10000, false, "Scheduled", 250.0, "NRHO");

        SpaceProbeDTO probe211 = new SpaceProbeDTO("SP-211", "Gateway Station Expansion", "Moon Orbit", "NASA", 55000.0,
                LocalDateTime.of(2030, 5, 1, 10, 0), LocalDateTime.of(2031, 1, 1, 12, 0),
                "Solar Electric", 7000.0, "Ka-Band", 384400000.0, 1.0, "Habitation", "Lab", 15000, false, "Proposed", 300.0, "NRHO");

        SpaceProbeDTO probe212 = new SpaceProbeDTO("SP-212", "L2 Gateway", "L2 Point", "ESA", 40000.0,
                LocalDateTime.of(2032, 5, 1, 10, 0), LocalDateTime.of(2033, 1, 1, 12, 0),
                "Solar Electric", 5500.0, "Ka-Band", 1500000000.0, 0.2, "Habitation", "Lab", 12000, false, "Proposed", 280.0, "L2 Halo");

        SpaceProbeDTO probe213 = new SpaceProbeDTO("SP-213", "Deep Space Habitat", "L2 Point", "NASA", 50000.0,
                LocalDateTime.of(2034, 5, 1, 10, 0), LocalDateTime.of(2035, 1, 1, 12, 0),
                "Solar Electric", 6500.0, "Ka-Band", 1500000000.0, 0.2, "Habitation", "Lab", 14000, false, "Proposed", 320.0, "L2 Halo");

        SpaceProbeDTO probe214 = new SpaceProbeDTO("SP-214", "Asteroid Mining Station", "Asteroid Belt", "Planetary Resources", 8000.0,
                LocalDateTime.of(2045, 5, 1, 10, 0), LocalDateTime.of(2047, 5, 1, 12, 0),
                "Nuclear", 2000.0, "Ka-Band", 500000000.0, 20.0, "Mining", "Processing", 5000, false, "Proposed", 400.0, "Asteroid Orbit");

        SpaceProbeDTO probe215 = new SpaceProbeDTO("SP-215", "Ceres Outpost", "Ceres", "NASA", 12000.0,
                LocalDateTime.of(2050, 5, 1, 10, 0), LocalDateTime.of(2055, 5, 1, 12, 0),
                "Nuclear", 3000.0, "Ka-Band", 450000000.0, 18.0, "Habitation", "Lab", 8000, false, "Proposed", 600.0, "Ceres Orbit");

        SpaceProbeDTO probe216 = new SpaceProbeDTO("SP-216", "Vesta Station", "Vesta", "ESA", 10000.0,
                LocalDateTime.of(2048, 5, 1, 10, 0), LocalDateTime.of(2053, 5, 1, 12, 0),
                "Nuclear", 2500.0, "Ka-Band", 480000000.0, 19.0, "Habitation", "Lab", 7000, false, "Proposed", 500.0, "Vesta Orbit");

        SpaceProbeDTO probe217 = new SpaceProbeDTO("SP-217", "Pallas Observatory", "Pallas", "JAXA", 8000.0,
                LocalDateTime.of(2052, 5, 1, 10, 0), LocalDateTime.of(2057, 5, 1, 12, 0),
                "Nuclear", 2000.0, "Ka-Band", 470000000.0, 18.5, "Observatory", "Lab", 6000, false, "Proposed", 450.0, "Pallas Orbit");

        SpaceProbeDTO probe218 = new SpaceProbeDTO("SP-218", "Hygiea Research Base", "Hygiea", "ISRO", 9000.0,
                LocalDateTime.of(2054, 5, 1, 10, 0), LocalDateTime.of(2059, 5, 1, 12, 0),
                "Nuclear", 2200.0, "Ka-Band", 460000000.0, 18.0, "Research", "Lab", 6500, false, "Proposed", 480.0, "Hygiea Orbit");

        SpaceProbeDTO probe219 = new SpaceProbeDTO("SP-219", "Europa Lander", "Europa", "NASA", 3500.0,
                LocalDateTime.of(2035, 5, 1, 10, 0), LocalDateTime.of(2036, 8, 1, 12, 0),
                "Nuclear", 1500.0, "X-Band", 965000000.0, 13.0, "Lander", "Drill", 3000, false, "Proposed", 80.0, "Europa Surface");

        SpaceProbeDTO probe220 = new SpaceProbeDTO("SP-220", "Ganymede Orbiter", "Ganymede", "ESA", 4000.0,
                LocalDateTime.of(2038, 5, 1, 10, 0), LocalDateTime.of(2040, 8, 1, 12, 0),
                "Nuclear", 1800.0, "X-Band", 965000000.0, 13.0, "Orbiter", "Spectrometer", 3500, false, "Proposed", 90.0, "Ganymede Orbit");

        SpaceProbeDTO probe221 = new SpaceProbeDTO("SP-221", "Callisto Explorer", "Callisto", "NASA", 3800.0,
                LocalDateTime.of(2040, 5, 1, 10, 0), LocalDateTime.of(2042, 8, 1, 12, 0),
                "Nuclear", 1700.0, "X-Band", 965000000.0, 13.0, "Orbiter", "Radar", 3400, false, "Proposed", 85.0, "Callisto Orbit");

        SpaceProbeDTO probe222 = new SpaceProbeDTO("SP-222", "Io Volcano Observer", "Io", "NASA", 3200.0,
                LocalDateTime.of(2037, 5, 1, 10, 0), LocalDateTime.of(2039, 8, 1, 12, 0),
                "Nuclear", 1400.0, "X-Band", 965000000.0, 13.0, "Orbiter", "Spectrometer", 3000, false, "Proposed", 75.0, "Io Orbit");

        SpaceProbeDTO probe223 = new SpaceProbeDTO("SP-223", "Titan Dragonfly 2", "Titan", "NASA", 600.0,
                LocalDateTime.of(2040, 5, 1, 10, 0), LocalDateTime.of(2046, 8, 1, 12, 0),
                "Nuclear", 400.0, "X-Band", 1200000000.0, 6.0, "Rotorcraft", "Spectrometer", 3000, false, "Proposed", 50.0, "Titan Surface");

        SpaceProbeDTO probe224 = new SpaceProbeDTO("SP-224", "Enceladus Life Finder", "Enceladus", "NASA", 2500.0,
                LocalDateTime.of(2042, 5, 1, 10, 0), LocalDateTime.of(2045, 8, 1, 12, 0),
                "Nuclear", 1200.0, "X-Band", 1200000000.0, 6.0, "Orbiter", "Mass Spectrometer", 2500, false, "Proposed", 70.0, "Enceladus Orbit");

        SpaceProbeDTO probe225 = new SpaceProbeDTO("SP-225", "Saturn Atmospheric Probe", "Saturn", "ESA", 3000.0,
                LocalDateTime.of(2045, 5, 1, 10, 0), LocalDateTime.of(2048, 8, 1, 12, 0),
                "Nuclear", 1500.0, "X-Band", 1200000000.0, 6.0, "Probe", "Atmosphere", 3000, false, "Proposed", 80.0, "Saturn Atmosphere");

        SpaceProbeDTO probe226 = new SpaceProbeDTO("SP-226", "Uranus Orbiter", "Uranus", "NASA", 5000.0,
                LocalDateTime.of(2050, 5, 1, 10, 0), LocalDateTime.of(2058, 8, 1, 12, 0),
                "Nuclear", 2500.0, "X-Band", 3000000000.0, 4.0, "Orbiter", "Spectrometer", 5000, false, "Proposed", 120.0, "Uranus Orbit");

        SpaceProbeDTO probe227 = new SpaceProbeDTO("SP-227", "Neptune Trident", "Neptune", "NASA", 4500.0,
                LocalDateTime.of(2055, 5, 1, 10, 0), LocalDateTime.of(2063, 8, 1, 12, 0),
                "Nuclear", 2200.0, "X-Band", 4500000000.0, 3.0, "Orbiter", "Spectrometer", 4500, false, "Proposed", 110.0, "Neptune Orbit");

        SpaceProbeDTO probe228 = new SpaceProbeDTO("SP-228", "Pluto Express", "Pluto", "NASA", 4000.0,
                LocalDateTime.of(2060, 5, 1, 10, 0), LocalDateTime.of(2068, 8, 1, 12, 0),
                "Nuclear", 2000.0, "X-Band", 6000000000.0, 2.5, "Orbiter", "Spectrometer", 4000, false, "Proposed", 100.0, "Pluto Orbit");

        SpaceProbeDTO probe229 = new SpaceProbeDTO("SP-229", "Kuiper Belt Explorer", "Kuiper Belt", "NASA", 3500.0,
                LocalDateTime.of(2065, 5, 1, 10, 0), LocalDateTime.of(2075, 8, 1, 12, 0),
                "Nuclear", 1800.0, "X-Band", 8000000000.0, 2.0, "Orbiter", "Camera", 3500, false, "Proposed", 90.0, "Kuiper Belt");

        SpaceProbeDTO probe230 = new SpaceProbeDTO("SP-230", "Interstellar Probe", "Interstellar", "NASA", 2000.0,
                LocalDateTime.of(2070, 5, 1, 10, 0), LocalDateTime.of(2090, 8, 1, 12, 0),
                "Nuclear", 1000.0, "X-Band", 100000000000.0, 15.0, "Probe", "Spectrometer", 2000, false, "Proposed", 50.0, "Interstellar");

        SpaceProbeDTO probe231 = new SpaceProbeDTO("SP-231", "Solar Polar Imager", "Sun", "ESA", 1500.0,
                LocalDateTime.of(2045, 5, 1, 10, 0), LocalDateTime.of(2050, 8, 1, 12, 0),
                "Solar Sail", 800.0, "X-Band", 20000000.0, 192.0, "Camera", "Spectrometer", 1500, false, "Proposed", 40.0, "Solar Polar");

        SpaceProbeDTO probe232 = new SpaceProbeDTO("SP-232", "Solar Probe Extreme", "Sun", "NASA", 1000.0,
                LocalDateTime.of(2048, 5, 1, 10, 0), LocalDateTime.of(2055, 8, 1, 12, 0),
                "Solar Shield", 500.0, "X-Band", 10000000.0, 300.0, "Instruments", "Spectrometer", 1000, false, "Proposed", 30.0, "Solar Corona");

        SpaceProbeDTO probe233 = new SpaceProbeDTO("SP-233", "Heliosphere Explorer", "Heliosphere", "NASA", 2500.0,
                LocalDateTime.of(2055, 5, 1, 10, 0), LocalDateTime.of(2070, 8, 1, 12, 0),
                "Nuclear", 1200.0, "X-Band", 50000000000.0, 20.0, "Probe", "Spectrometer", 2500, false, "Proposed", 60.0, "Heliosphere");

        SpaceProbeDTO probe234 = new SpaceProbeDTO("SP-234", "Oort Cloud Surveyor", "Oort Cloud", "ESA", 3000.0,
                LocalDateTime.of(2075, 5, 1, 10, 0), LocalDateTime.of(2100, 8, 1, 12, 0),
                "Nuclear", 1500.0, "X-Band", 200000000000.0, 10.0, "Telescope", "Camera", 3000, false, "Proposed", 70.0, "Oort Cloud");

        SpaceProbeDTO probe235 = new SpaceProbeDTO("SP-235", "Exoplanet Hunter", "Space", "NASA", 8000.0,
                LocalDateTime.of(2045, 5, 1, 10, 0), LocalDateTime.of(2050, 8, 1, 12, 0),
                "None", 4000.0, "Ka-Band", 1500000000.0, 0.2, "Coronagraph", "Spectrograph", 8000, false, "Proposed", 160.0, "L2 Halo");

        SpaceProbeDTO probe236 = new SpaceProbeDTO("SP-236", "Habitable Worlds Observatory", "Space", "NASA", 10000.0,
                LocalDateTime.of(2050, 5, 1, 10, 0), LocalDateTime.of(2055, 8, 1, 12, 0),
                "None", 5000.0, "Ka-Band", 1500000000.0, 0.2, "Coronagraph", "Spectrograph", 10000, false, "Proposed", 200.0, "L2 Halo");

        SpaceProbeDTO probe237 = new SpaceProbeDTO("SP-237", "Origins Space Telescope", "Space", "NASA", 9000.0,
                LocalDateTime.of(2055, 5, 1, 10, 0), LocalDateTime.of(2060, 8, 1, 12, 0),
                "None", 4500.0, "Ka-Band", 1500000000.0, 0.2, "Spectrograph", "Camera", 9000, false, "Proposed", 180.0, "L2 Halo");

        SpaceProbeDTO probe238 = new SpaceProbeDTO("SP-238", "Large UV/Optical/IR Surveyor", "Space", "NASA", 12000.0,
                LocalDateTime.of(2060, 5, 1, 10, 0), LocalDateTime.of(2065, 8, 1, 12, 0),
                "None", 6000.0, "Ka-Band", 1500000000.0, 0.2, "Spectrograph", "Camera", 12000, false, "Proposed", 240.0, "L2 Halo");

        SpaceProbeDTO probe239 = new SpaceProbeDTO("SP-239", "Far-IR Surveyor", "Space", "ESA", 7000.0,
                LocalDateTime.of(2055, 5, 1, 10, 0), LocalDateTime.of(2060, 8, 1, 12, 0),
                "None", 3500.0, "Ka-Band", 1500000000.0, 0.2, "Telescope", "Spectrometer", 7000, false, "Proposed", 140.0, "L2 Halo");

        SpaceProbeDTO probe240 = new SpaceProbeDTO("SP-240", "X-ray Surveyor", "Space", "NASA", 6000.0,
                LocalDateTime.of(2050, 5, 1, 10, 0), LocalDateTime.of(2055, 8, 1, 12, 0),
                "None", 3000.0, "Ka-Band", 1500000000.0, 0.2, "X-ray", "Spectrograph", 6000, false, "Proposed", 120.0, "L2 Halo");

        SpaceProbeDTO probe241 = new SpaceProbeDTO("SP-241", "Lynx X-ray", "Space", "NASA", 5500.0,
                LocalDateTime.of(2048, 5, 1, 10, 0), LocalDateTime.of(2053, 8, 1, 12, 0),
                "None", 2800.0, "Ka-Band", 1500000000.0, 0.2, "X-ray", "Spectrograph", 5500, false, "Proposed", 110.0, "L2 Halo");

        SpaceProbeDTO probe242 = new SpaceProbeDTO("SP-242", "Athena X-ray", "Space", "ESA", 5800.0,
                LocalDateTime.of(2050, 5, 1, 10, 0), LocalDateTime.of(2055, 8, 1, 12, 0),
                "None", 2900.0, "Ka-Band", 1500000000.0, 0.2, "X-ray", "Spectrograph", 5800, false, "Proposed", 115.0, "L2 Halo");

        SpaceProbeDTO probe243 = new SpaceProbeDTO("SP-243", "LISA Pathfinder 2", "Space", "ESA", 2500.0,
                LocalDateTime.of(2045, 5, 1, 10, 0), LocalDateTime.of(2050, 8, 1, 12, 0),
                "None", 1300.0, "Ka-Band", 1500000000.0, 0.2, "Gravitational Wave", "None", 2500, false, "Proposed", 50.0, "L2 Halo");

        SpaceProbeDTO probe244 = new SpaceProbeDTO("SP-244", "LISA Mission", "Space", "ESA", 3000.0,
                LocalDateTime.of(2050, 5, 1, 10, 0), LocalDateTime.of(2055, 8, 1, 12, 0),
                "None", 1500.0, "Ka-Band", 1500000000.0, 0.2, "Gravitational Wave", "None", 3000, false, "Proposed", 60.0, "L2 Halo");

        SpaceProbeDTO probe245 = new SpaceProbeDTO("SP-245", "DECIGO", "Space", "JAXA", 2800.0,
                LocalDateTime.of(2055, 5, 1, 10, 0), LocalDateTime.of(2060, 8, 1, 12, 0),
                "None", 1400.0, "Ka-Band", 1500000000.0, 0.2, "Gravitational Wave", "None", 2800, false, "Proposed", 55.0, "L2 Halo");

        SpaceProbeDTO probe246 = new SpaceProbeDTO("SP-246", "Big Bang Observer", "Space", "NASA", 4000.0,
                LocalDateTime.of(2065, 5, 1, 10, 0), LocalDateTime.of(2075, 8, 1, 12, 0),
                "None", 2000.0, "Ka-Band", 1500000000.0, 0.2, "Gravitational Wave", "None", 4000, false, "Proposed", 80.0, "L2 Halo");

        SpaceProbeDTO probe247 = new SpaceProbeDTO("SP-247", "Cosmic Dawn Explorer", "Space", "NASA", 3500.0,
                LocalDateTime.of(2060, 5, 1, 10, 0), LocalDateTime.of(2070, 8, 1, 12, 0),
                "None", 1800.0, "Ka-Band", 1500000000.0, 0.2, "Radio", "Spectrometer", 3500, false, "Proposed", 70.0, "L2 Halo");

        SpaceProbeDTO probe248 = new SpaceProbeDTO("SP-248", "Primordial Inflation Explorer", "Space", "NASA", 3200.0,
                LocalDateTime.of(2058, 5, 1, 10, 0), LocalDateTime.of(2068, 8, 1, 12, 0),
                "None", 1600.0, "Ka-Band", 1500000000.0, 0.2, "Polarimeter", "Spectrometer", 3200, false, "Proposed", 65.0, "L2 Halo");

        SpaceProbeDTO probe249 = new SpaceProbeDTO("SP-249", "Dark Energy Surveyor", "Space", "ESA", 4500.0,
                LocalDateTime.of(2055, 5, 1, 10, 0), LocalDateTime.of(2065, 8, 1, 12, 0),
                "None", 2200.0, "Ka-Band", 1500000000.0, 0.2, "Telescope", "Spectrometer", 4500, false, "Proposed", 90.0, "L2 Halo");

        SpaceProbeDTO probe250 = new SpaceProbeDTO("SP-250", "Dark Matter Particle Explorer", "Space", "NASA", 3800.0,
                LocalDateTime.of(2052, 5, 1, 10, 0), LocalDateTime.of(2062, 8, 1, 12, 0),
                "None", 1900.0, "Ka-Band", 1500000000.0, 0.2, "Detector", "Spectrometer", 3800, false, "Proposed", 75.0, "L2 Halo");

        SpaceProbeDTO probe251 = new SpaceProbeDTO("SP-251", "Neutrino Observatory", "Space", "ESA", 4200.0,
                LocalDateTime.of(2055, 5, 1, 10, 0), LocalDateTime.of(2065, 8, 1, 12, 0),
                "None", 2100.0, "Ka-Band", 1500000000.0, 0.2, "Neutrino Detector", "Spectrometer", 4200, false, "Proposed", 85.0, "L2 Halo");

        SpaceProbeDTO probe252 = new SpaceProbeDTO("SP-252", "Cosmic Ray Observatory", "Space", "JAXA", 3600.0,
                LocalDateTime.of(2053, 5, 1, 10, 0), LocalDateTime.of(2063, 8, 1, 12, 0),
                "None", 1800.0, "Ka-Band", 1500000000.0, 0.2, "Cosmic Ray Detector", "Spectrometer", 3600, false, "Proposed", 72.0, "L2 Halo");

        SpaceProbeDTO probe253 = new SpaceProbeDTO("SP-253", "Gamma Ray Burst Hunter", "Space", "NASA", 4000.0,
                LocalDateTime.of(2054, 5, 1, 10, 0), LocalDateTime.of(2064, 8, 1, 12, 0),
                "None", 2000.0, "Ka-Band", 1500000000.0, 0.2, "Gamma Ray Detector", "Spectrometer", 4000, false, "Proposed", 80.0, "L2 Halo");

        SpaceProbeDTO probe254 = new SpaceProbeDTO("SP-254", "Fast Radio Burst Observatory", "Space", "ESA", 3800.0,
                LocalDateTime.of(2056, 5, 1, 10, 0), LocalDateTime.of(2066, 8, 1, 12, 0),
                "None", 1900.0, "Ka-Band", 1500000000.0, 0.2, "Radio Telescope", "Spectrometer", 3800, false, "Proposed", 76.0, "L2 Halo");

        SpaceProbeDTO probe255 = new SpaceProbeDTO("SP-255", "Gravitational Lens Observatory", "Space", "NASA", 4500.0,
                LocalDateTime.of(2058, 5, 1, 10, 0), LocalDateTime.of(2068, 8, 1, 12, 0),
                "None", 2200.0, "Ka-Band", 1500000000.0, 0.2, "Gravitational Lens", "Spectrometer", 4500, false, "Proposed", 90.0, "L2 Halo");

        SpaceProbeDTO probe256 = new SpaceProbeDTO("SP-256", "Solar System Mapper", "Space", "ESA", 5000.0,
                LocalDateTime.of(2060, 5, 1, 10, 0), LocalDateTime.of(2070, 8, 1, 12, 0),
                "None", 2500.0, "Ka-Band", 1500000000.0, 0.2, "Mapper", "Spectrometer", 5000, false, "Proposed", 100.0, "L2 Halo");

        SpaceProbeDTO probe257 = new SpaceProbeDTO("SP-257", "Exoplanet Atmosphere Characterizer", "Space", "NASA", 5500.0,
                LocalDateTime.of(2062, 5, 1, 10, 0), LocalDateTime.of(2072, 8, 1, 12, 0),
                "None", 2700.0, "Ka-Band", 1500000000.0, 0.2, "Spectrograph", "Camera", 5500, false, "Proposed", 110.0, "L2 Halo");

        SpaceProbeDTO probe258 = new SpaceProbeDTO("SP-258", "Biosignature Detector", "Space", "ESA", 5200.0,
                LocalDateTime.of(2064, 5, 1, 10, 0), LocalDateTime.of(2074, 8, 1, 12, 0),
                "None", 2600.0, "Ka-Band", 1500000000.0, 0.2, "Biosignature", "Spectrometer", 5200, false, "Proposed", 105.0, "L2 Halo");

        SpaceProbeDTO probe259 = new SpaceProbeDTO("SP-259", "Technosignature Hunter", "Space", "NASA", 4800.0,
                LocalDateTime.of(2066, 5, 1, 10, 0), LocalDateTime.of(2076, 8, 1, 12, 0),
                "None", 2400.0, "Ka-Band", 1500000000.0, 0.2, "Technosignature", "Spectrometer", 4800, false, "Proposed", 95.0, "L2 Halo");

        SpaceProbeDTO probe260 = new SpaceProbeDTO("SP-260", "Interstellar Mapper", "Space", "ESA", 6000.0,
                LocalDateTime.of(2070, 5, 1, 10, 0), LocalDateTime.of(2080, 8, 1, 12, 0),
                "None", 3000.0, "Ka-Band", 1500000000.0, 0.2, "Mapper", "Spectrometer", 6000, false, "Proposed", 120.0, "L2 Halo");

        SpaceProbeDTO probe261 = new SpaceProbeDTO("SP-261", "Galactic Center Explorer", "Space", "NASA", 6500.0,
                LocalDateTime.of(2075, 5, 1, 10, 0), LocalDateTime.of(2085, 8, 1, 12, 0),
                "None", 3200.0, "Ka-Band", 1500000000.0, 0.2, "X-ray", "Spectrometer", 6500, false, "Proposed", 130.0, "L2 Halo");

        SpaceProbeDTO probe262 = new SpaceProbeDTO("SP-262", "Black Hole Imager", "Space", "ESA", 7000.0,
                LocalDateTime.of(2080, 5, 1, 10, 0), LocalDateTime.of(2090, 8, 1, 12, 0),
                "None", 3500.0, "Ka-Band", 1500000000.0, 0.2, "Event Horizon", "Spectrometer", 7000, false, "Proposed", 140.0, "L2 Halo");

        SpaceProbeDTO probe263 = new SpaceProbeDTO("SP-263", "Dark Energy Mapper", "Space", "NASA", 7500.0,
                LocalDateTime.of(2085, 5, 1, 10, 0), LocalDateTime.of(2095, 8, 1, 12, 0),
                "None", 3700.0, "Ka-Band", 1500000000.0, 0.2, "Dark Energy", "Spectrometer", 7500, false, "Proposed", 150.0, "L2 Halo");

        SpaceProbeDTO probe264 = new SpaceProbeDTO("SP-264", "Quantum Gravity Experiment", "Space", "ESA", 8000.0,
                LocalDateTime.of(2090, 5, 1, 10, 0), LocalDateTime.of(2100, 8, 1, 12, 0),
                "None", 4000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum", "Spectrometer", 8000, false, "Proposed", 160.0, "L2 Halo");

        SpaceProbeDTO probe265 = new SpaceProbeDTO("SP-265", "String Theory Tester", "Space", "NASA", 8500.0,
                LocalDateTime.of(2095, 5, 1, 10, 0), LocalDateTime.of(2105, 8, 1, 12, 0),
                "None", 4200.0, "Ka-Band", 1500000000.0, 0.2, "String Theory", "Spectrometer", 8500, false, "Proposed", 170.0, "L2 Halo");

        SpaceProbeDTO probe266 = new SpaceProbeDTO("SP-266", "Multiverse Detector", "Space", "ESA", 9000.0,
                LocalDateTime.of(2100, 5, 1, 10, 0), LocalDateTime.of(2110, 8, 1, 12, 0),
                "None", 4500.0, "Ka-Band", 1500000000.0, 0.2, "Multiverse", "Spectrometer", 9000, false, "Proposed", 180.0, "L2 Halo");

        SpaceProbeDTO probe267 = new SpaceProbeDTO("SP-267", "Time Dilation Experiment", "Space", "NASA", 9500.0,
                LocalDateTime.of(2105, 5, 1, 10, 0), LocalDateTime.of(2115, 8, 1, 12, 0),
                "None", 4700.0, "Ka-Band", 1500000000.0, 0.2, "Time Dilation", "Spectrometer", 9500, false, "Proposed", 190.0, "L2 Halo");

        SpaceProbeDTO probe268 = new SpaceProbeDTO("SP-268", "Wormhole Explorer", "Space", "ESA", 10000.0,
                LocalDateTime.of(2110, 5, 1, 10, 0), LocalDateTime.of(2120, 8, 1, 12, 0),
                "None", 5000.0, "Ka-Band", 1500000000.0, 0.2, "Wormhole", "Spectrometer", 10000, false, "Proposed", 200.0, "L2 Halo");

        SpaceProbeDTO probe269 = new SpaceProbeDTO("SP-269", "Dimensional Portal Scanner", "Space", "NASA", 10500.0,
                LocalDateTime.of(2115, 5, 1, 10, 0), LocalDateTime.of(2125, 8, 1, 12, 0),
                "None", 5200.0, "Ka-Band", 1500000000.0, 0.2, "Dimensional", "Spectrometer", 10500, false, "Proposed", 210.0, "L2 Halo");

        SpaceProbeDTO probe270 = new SpaceProbeDTO("SP-270", "Consciousness Explorer", "Space", "ESA", 11000.0,
                LocalDateTime.of(2120, 5, 1, 10, 0), LocalDateTime.of(2130, 8, 1, 12, 0),
                "None", 5500.0, "Ka-Band", 1500000000.0, 0.2, "Consciousness", "Spectrometer", 11000, false, "Proposed", 220.0, "L2 Halo");

        SpaceProbeDTO probe271 = new SpaceProbeDTO("SP-271", "Reality Simulator", "Space", "NASA", 12000.0,
                LocalDateTime.of(2125, 5, 1, 10, 0), LocalDateTime.of(2135, 8, 1, 12, 0),
                "None", 6000.0, "Ka-Band", 1500000000.0, 0.2, "Reality", "Spectrometer", 12000, false, "Proposed", 240.0, "L2 Halo");

        SpaceProbeDTO probe272 = new SpaceProbeDTO("SP-272", "Simulation Theory Tester", "Space", "ESA", 13000.0,
                LocalDateTime.of(2130, 5, 1, 10, 0), LocalDateTime.of(2140, 8, 1, 12, 0),
                "None", 6500.0, "Ka-Band", 1500000000.0, 0.2, "Simulation", "Spectrometer", 13000, false, "Proposed", 260.0, "L2 Halo");

        SpaceProbeDTO probe273 = new SpaceProbeDTO("SP-273", "Information Theory Probe", "Space", "NASA", 14000.0,
                LocalDateTime.of(2135, 5, 1, 10, 0), LocalDateTime.of(2145, 8, 1, 12, 0),
                "None", 7000.0, "Ka-Band", 1500000000.0, 0.2, "Information", "Spectrometer", 14000, false, "Proposed", 280.0, "L2 Halo");

        SpaceProbeDTO probe274 = new SpaceProbeDTO("SP-274", "Entropy Analyzer", "Space", "ESA", 15000.0,
                LocalDateTime.of(2140, 5, 1, 10, 0), LocalDateTime.of(2150, 8, 1, 12, 0),
                "None", 7500.0, "Ka-Band", 1500000000.0, 0.2, "Entropy", "Spectrometer", 15000, false, "Proposed", 300.0, "L2 Halo");

        SpaceProbeDTO probe275 = new SpaceProbeDTO("SP-275", "Chaos Theory Experiment", "Space", "NASA", 16000.0,
                LocalDateTime.of(2145, 5, 1, 10, 0), LocalDateTime.of(2155, 8, 1, 12, 0),
                "None", 8000.0, "Ka-Band", 1500000000.0, 0.2, "Chaos", "Spectrometer", 16000, false, "Proposed", 320.0, "L2 Halo");

        SpaceProbeDTO probe276 = new SpaceProbeDTO("SP-276", "Complexity Explorer", "Space", "ESA", 17000.0,
                LocalDateTime.of(2150, 5, 1, 10, 0), LocalDateTime.of(2160, 8, 1, 12, 0),
                "None", 8500.0, "Ka-Band", 1500000000.0, 0.2, "Complexity", "Spectrometer", 17000, false, "Proposed", 340.0, "L2 Halo");

        SpaceProbeDTO probe277 = new SpaceProbeDTO("SP-277", "Emergence Detector", "Space", "NASA", 18000.0,
                LocalDateTime.of(2155, 5, 1, 10, 0), LocalDateTime.of(2165, 8, 1, 12, 0),
                "None", 9000.0, "Ka-Band", 1500000000.0, 0.2, "Emergence", "Spectrometer", 18000, false, "Proposed", 360.0, "L2 Halo");

        SpaceProbeDTO probe278 = new SpaceProbeDTO("SP-278", "Self-Organization Observer", "Space", "ESA", 19000.0,
                LocalDateTime.of(2160, 5, 1, 10, 0), LocalDateTime.of(2170, 8, 1, 12, 0),
                "None", 9500.0, "Ka-Band", 1500000000.0, 0.2, "Self-Organization", "Spectrometer", 19000, false, "Proposed", 380.0, "L2 Halo");

        SpaceProbeDTO probe279 = new SpaceProbeDTO("SP-279", "Pattern Recognizer", "Space", "NASA", 20000.0,
                LocalDateTime.of(2165, 5, 1, 10, 0), LocalDateTime.of(2175, 8, 1, 12, 0),
                "None", 10000.0, "Ka-Band", 1500000000.0, 0.2, "Pattern", "Spectrometer", 20000, false, "Proposed", 400.0, "L2 Halo");

        SpaceProbeDTO probe280 = new SpaceProbeDTO("SP-280", "Fractal Analyzer", "Space", "ESA", 21000.0,
                LocalDateTime.of(2170, 5, 1, 10, 0), LocalDateTime.of(2180, 8, 1, 12, 0),
                "None", 10500.0, "Ka-Band", 1500000000.0, 0.2, "Fractal", "Spectrometer", 21000, false, "Proposed", 420.0, "L2 Halo");

        SpaceProbeDTO probe281 = new SpaceProbeDTO("SP-281", "Network Explorer", "Space", "NASA", 22000.0,
                LocalDateTime.of(2175, 5, 1, 10, 0), LocalDateTime.of(2185, 8, 1, 12, 0),
                "None", 11000.0, "Ka-Band", 1500000000.0, 0.2, "Network", "Spectrometer", 22000, false, "Proposed", 440.0, "L2 Halo");

        SpaceProbeDTO probe282 = new SpaceProbeDTO("SP-282", "System Dynamics Probe", "Space", "ESA", 23000.0,
                LocalDateTime.of(2180, 5, 1, 10, 0), LocalDateTime.of(2190, 8, 1, 12, 0),
                "None", 11500.0, "Ka-Band", 1500000000.0, 0.2, "System Dynamics", "Spectrometer", 23000, false, "Proposed", 460.0, "L2 Halo");

        SpaceProbeDTO probe283 = new SpaceProbeDTO("SP-283", "Cybernetics Observer", "Space", "NASA", 24000.0,
                LocalDateTime.of(2185, 5, 1, 10, 0), LocalDateTime.of(2195, 8, 1, 12, 0),
                "None", 12000.0, "Ka-Band", 1500000000.0, 0.2, "Cybernetics", "Spectrometer", 24000, false, "Proposed", 480.0, "L2 Halo");

        SpaceProbeDTO probe284 = new SpaceProbeDTO("SP-284", "Artificial Life Creator", "Space", "ESA", 25000.0,
                LocalDateTime.of(2190, 5, 1, 10, 0), LocalDateTime.of(2200, 8, 1, 12, 0),
                "None", 12500.0, "Ka-Band", 1500000000.0, 0.2, "Artificial Life", "Spectrometer", 25000, false, "Proposed", 500.0, "L2 Halo");

        SpaceProbeDTO probe285 = new SpaceProbeDTO("SP-285", "Evolution Simulator", "Space", "NASA", 26000.0,
                LocalDateTime.of(2195, 5, 1, 10, 0), LocalDateTime.of(2205, 8, 1, 12, 0),
                "None", 13000.0, "Ka-Band", 1500000000.0, 0.2, "Evolution", "Spectrometer", 26000, false, "Proposed", 520.0, "L2 Halo");

        SpaceProbeDTO probe286 = new SpaceProbeDTO("SP-286", "Genetic Code Analyzer", "Space", "ESA", 27000.0,
                LocalDateTime.of(2200, 5, 1, 10, 0), LocalDateTime.of(2210, 8, 1, 12, 0),
                "None", 13500.0, "Ka-Band", 1500000000.0, 0.2, "Genetic Code", "Spectrometer", 27000, false, "Proposed", 540.0, "L2 Halo");

        SpaceProbeDTO probe287 = new SpaceProbeDTO("SP-287", "Protein Structure Mapper", "Space", "NASA", 28000.0,
                LocalDateTime.of(2205, 5, 1, 10, 0), LocalDateTime.of(2215, 8, 1, 12, 0),
                "None", 14000.0, "Ka-Band", 1500000000.0, 0.2, "Protein", "Spectrometer", 28000, false, "Proposed", 560.0, "L2 Halo");

        SpaceProbeDTO probe288 = new SpaceProbeDTO("SP-288", "Metabolism Explorer", "Space", "ESA", 29000.0,
                LocalDateTime.of(2210, 5, 1, 10, 0), LocalDateTime.of(2220, 8, 1, 12, 0),
                "None", 14500.0, "Ka-Band", 1500000000.0, 0.2, "Metabolism", "Spectrometer", 29000, false, "Proposed", 580.0, "L2 Halo");

        SpaceProbeDTO probe289 = new SpaceProbeDTO("SP-289", "Cellular Automata Simulator", "Space", "NASA", 30000.0,
                LocalDateTime.of(2215, 5, 1, 10, 0), LocalDateTime.of(2225, 8, 1, 12, 0),
                "None", 15000.0, "Ka-Band", 1500000000.0, 0.2, "Cellular Automata", "Spectrometer", 30000, false, "Proposed", 600.0, "L2 Halo");

        SpaceProbeDTO probe290 = new SpaceProbeDTO("SP-290", "Neural Network Observer", "Space", "ESA", 31000.0,
                LocalDateTime.of(2220, 5, 1, 10, 0), LocalDateTime.of(2230, 8, 1, 12, 0),
                "None", 15500.0, "Ka-Band", 1500000000.0, 0.2, "Neural Network", "Spectrometer", 31000, false, "Proposed", 620.0, "L2 Halo");

        SpaceProbeDTO probe291 = new SpaceProbeDTO("SP-291", "Machine Learning Trainer", "Space", "NASA", 32000.0,
                LocalDateTime.of(2225, 5, 1, 10, 0), LocalDateTime.of(2235, 8, 1, 12, 0),
                "None", 16000.0, "Ka-Band", 1500000000.0, 0.2, "Machine Learning", "Spectrometer", 32000, false, "Proposed", 640.0, "L2 Halo");

        SpaceProbeDTO probe292 = new SpaceProbeDTO("SP-292", "Deep Space AI", "Space", "ESA", 33000.0,
                LocalDateTime.of(2230, 5, 1, 10, 0), LocalDateTime.of(2240, 8, 1, 12, 0),
                "None", 16500.0, "Ka-Band", 1500000000.0, 0.2, "AI", "Spectrometer", 33000, false, "Proposed", 660.0, "L2 Halo");

        SpaceProbeDTO probe293 = new SpaceProbeDTO("SP-293", "Quantum Computer", "Space", "NASA", 34000.0,
                LocalDateTime.of(2235, 5, 1, 10, 0), LocalDateTime.of(2245, 8, 1, 12, 0),
                "None", 17000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum", "Spectrometer", 34000, false, "Proposed", 680.0, "L2 Halo");

        SpaceProbeDTO probe294 = new SpaceProbeDTO("SP-294", "Quantum Communication", "Space", "ESA", 35000.0,
                LocalDateTime.of(2240, 5, 1, 10, 0), LocalDateTime.of(2250, 8, 1, 12, 0),
                "None", 17500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Comm", "Spectrometer", 35000, false, "Proposed", 700.0, "L2 Halo");

        SpaceProbeDTO probe295 = new SpaceProbeDTO("SP-295", "Quantum Encryption", "Space", "NASA", 36000.0,
                LocalDateTime.of(2245, 5, 1, 10, 0), LocalDateTime.of(2255, 8, 1, 12, 0),
                "None", 18000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Encrypt", "Spectrometer", 36000, false, "Proposed", 720.0, "L2 Halo");

        SpaceProbeDTO probe296 = new SpaceProbeDTO("SP-296", "Quantum Sensing", "Space", "ESA", 37000.0,
                LocalDateTime.of(2250, 5, 1, 10, 0), LocalDateTime.of(2260, 8, 1, 12, 0),
                "None", 18500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Sense", "Spectrometer", 37000, false, "Proposed", 740.0, "L2 Halo");

        SpaceProbeDTO probe297 = new SpaceProbeDTO("SP-297", "Quantum Metrology", "Space", "NASA", 38000.0,
                LocalDateTime.of(2255, 5, 1, 10, 0), LocalDateTime.of(2265, 8, 1, 12, 0),
                "None", 19000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Metro", "Spectrometer", 38000, false, "Proposed", 760.0, "L2 Halo");

        SpaceProbeDTO probe298 = new SpaceProbeDTO("SP-298", "Quantum Imaging", "Space", "ESA", 39000.0,
                LocalDateTime.of(2260, 5, 1, 10, 0), LocalDateTime.of(2270, 8, 1, 12, 0),
                "None", 19500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Image", "Spectrometer", 39000, false, "Proposed", 780.0, "L2 Halo");

        SpaceProbeDTO probe299 = new SpaceProbeDTO("SP-299", "Quantum Radar", "Space", "NASA", 40000.0,
                LocalDateTime.of(2265, 5, 1, 10, 0), LocalDateTime.of(2275, 8, 1, 12, 0),
                "None", 20000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Radar", "Spectrometer", 40000, false, "Proposed", 800.0, "L2 Halo");

        SpaceProbeDTO probe300 = new SpaceProbeDTO("SP-300", "Quantum Navigation", "Space", "ESA", 41000.0,
                LocalDateTime.of(2270, 5, 1, 10, 0), LocalDateTime.of(2280, 8, 1, 12, 0),
                "None", 20500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Nav", "Spectrometer", 41000, false, "Proposed", 820.0, "L2 Halo");

        SpaceProbeDTO probe301 = new SpaceProbeDTO("SP-301", "Quantum Clock", "Space", "NASA", 42000.0,
                LocalDateTime.of(2275, 5, 1, 10, 0), LocalDateTime.of(2285, 8, 1, 12, 0),
                "None", 21000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Clock", "Spectrometer", 42000, false, "Proposed", 840.0, "L2 Halo");

        SpaceProbeDTO probe302 = new SpaceProbeDTO("SP-302", "Quantum Magnetometer", "Space", "ESA", 43000.0,
                LocalDateTime.of(2280, 5, 1, 10, 0), LocalDateTime.of(2290, 8, 1, 12, 0),
                "None", 21500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Mag", "Spectrometer", 43000, false, "Proposed", 860.0, "L2 Halo");

        SpaceProbeDTO probe303 = new SpaceProbeDTO("SP-303", "Quantum Thermometer", "Space", "NASA", 44000.0,
                LocalDateTime.of(2285, 5, 1, 10, 0), LocalDateTime.of(2295, 8, 1, 12, 0),
                "None", 22000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Temp", "Spectrometer", 44000, false, "Proposed", 880.0, "L2 Halo");

        SpaceProbeDTO probe304 = new SpaceProbeDTO("SP-304", "Quantum Barometer", "Space", "ESA", 45000.0,
                LocalDateTime.of(2290, 5, 1, 10, 0), LocalDateTime.of(2300, 8, 1, 12, 0),
                "None", 22500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Bar", "Spectrometer", 45000, false, "Proposed", 900.0, "L2 Halo");

        SpaceProbeDTO probe305 = new SpaceProbeDTO("SP-305", "Quantum Hygrometer", "Space", "NASA", 46000.0,
                LocalDateTime.of(2295, 5, 1, 10, 0), LocalDateTime.of(2305, 8, 1, 12, 0),
                "None", 23000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Hum", "Spectrometer", 46000, false, "Proposed", 920.0, "L2 Halo");

        SpaceProbeDTO probe306 = new SpaceProbeDTO("SP-306", "Quantum Anemometer", "Space", "ESA", 47000.0,
                LocalDateTime.of(2300, 5, 1, 10, 0), LocalDateTime.of(2310, 8, 1, 12, 0),
                "None", 23500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Wind", "Spectrometer", 47000, false, "Proposed", 940.0, "L2 Halo");

        SpaceProbeDTO probe307 = new SpaceProbeDTO("SP-307", "Quantum Pyrometer", "Space", "NASA", 48000.0,
                LocalDateTime.of(2305, 5, 1, 10, 0), LocalDateTime.of(2315, 8, 1, 12, 0),
                "None", 24000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Heat", "Spectrometer", 48000, false, "Proposed", 960.0, "L2 Halo");

        SpaceProbeDTO probe308 = new SpaceProbeDTO("SP-308", "Quantum Photometer", "Space", "ESA", 49000.0,
                LocalDateTime.of(2310, 5, 1, 10, 0), LocalDateTime.of(2320, 8, 1, 12, 0),
                "None", 24500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Light", "Spectrometer", 49000, false, "Proposed", 980.0, "L2 Halo");

        SpaceProbeDTO probe309 = new SpaceProbeDTO("SP-309", "Quantum Spectrometer", "Space", "NASA", 50000.0,
                LocalDateTime.of(2315, 5, 1, 10, 0), LocalDateTime.of(2325, 8, 1, 12, 0),
                "None", 25000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Spec", "Spectrometer", 50000, false, "Proposed", 1000.0, "L2 Halo");

        SpaceProbeDTO probe310 = new SpaceProbeDTO("SP-310", "Quantum Chromatograph", "Space", "ESA", 51000.0,
                LocalDateTime.of(2320, 5, 1, 10, 0), LocalDateTime.of(2330, 8, 1, 12, 0),
                "None", 25500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Chrom", "Spectrometer", 51000, false, "Proposed", 1020.0, "L2 Halo");

        SpaceProbeDTO probe311 = new SpaceProbeDTO("SP-311", "Quantum Electrometer", "Space", "NASA", 52000.0,
                LocalDateTime.of(2325, 5, 1, 10, 0), LocalDateTime.of(2335, 8, 1, 12, 0),
                "None", 26000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Elec", "Spectrometer", 52000, false, "Proposed", 1040.0, "L2 Halo");

        SpaceProbeDTO probe312 = new SpaceProbeDTO("SP-312", "Quant Voltmeter", "Space", "ESA", 53000.0,
                LocalDateTime.of(2330, 5, 1, 10, 0), LocalDateTime.of(2340, 8, 1, 12, 0),
                "None", 26500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Volt", "Spectrometer", 53000, false, "Proposed", 1060.0, "L2 Halo");

        SpaceProbeDTO probe313 = new SpaceProbeDTO("SP-313", "Quantum Ammeter", "Space", "NASA", 54000.0,
                LocalDateTime.of(2335, 5, 1, 10, 0), LocalDateTime.of(2345, 8, 1, 12, 0),
                "None", 27000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Amp", "Spectrometer", 54000, false, "Proposed", 1080.0, "L2 Halo");

        SpaceProbeDTO probe314 = new SpaceProbeDTO("SP-314", "Quantum Ohmmeter", "Space", "ESA", 55000.0,
                LocalDateTime.of(2340, 5, 1, 10, 0), LocalDateTime.of(2350, 8, 1, 12, 0),
                "None", 27500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Ohm", "Spectrometer", 55000, false, "Proposed", 1100.0, "L2 Halo");

        SpaceProbeDTO probe315 = new SpaceProbeDTO("SP-315", "Quantum Wattmeter", "Space", "NASA", 56000.0,
                LocalDateTime.of(2345, 5, 1, 10, 0), LocalDateTime.of(2355, 8, 1, 12, 0),
                "None", 28000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Watt", "Spectrometer", 56000, false, "Proposed", 1120.0, "L2 Halo");

        SpaceProbeDTO probe316 = new SpaceProbeDTO("SP-316", "Quantum Frequency Counter", "Space", "ESA", 57000.0,
                LocalDateTime.of(2350, 5, 1, 10, 0), LocalDateTime.of(2360, 8, 1, 12, 0),
                "None", 28500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Freq", "Spectrometer", 57000, false, "Proposed", 1140.0, "L2 Halo");

        SpaceProbeDTO probe317 = new SpaceProbeDTO("SP-317", "Quantum Oscilloscope", "Space", "NASA", 58000.0,
                LocalDateTime.of(2355, 5, 1, 10, 0), LocalDateTime.of(2365, 8, 1, 12, 0),
                "None", 29000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Osc", "Spectrometer", 58000, false, "Proposed", 1160.0, "L2 Halo");

        SpaceProbeDTO probe318 = new SpaceProbeDTO("SP-318", "Quantum Logic Analyzer", "Space", "ESA", 59000.0,
                LocalDateTime.of(2360, 5, 1, 10, 0), LocalDateTime.of(2370, 8, 1, 12, 0),
                "None", 29500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Logic", "Spectrometer", 59000, false, "Proposed", 1180.0, "L2 Halo");

        SpaceProbeDTO probe319 = new SpaceProbeDTO("SP-319", "Quantum Signal Generator", "Space", "NASA", 60000.0,
                LocalDateTime.of(2365, 5, 1, 10, 0), LocalDateTime.of(2375, 8, 1, 12, 0),
                "None", 30000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Signal", "Spectrometer", 60000, false, "Proposed", 1200.0, "L2 Halo");

        SpaceProbeDTO probe320 = new SpaceProbeDTO("SP-320", "Quantum Network Analyzer", "Space", "ESA", 61000.0,
                LocalDateTime.of(2370, 5, 1, 10, 0), LocalDateTime.of(2380, 8, 1, 12, 0),
                "None", 30500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Net", "Spectrometer", 61000, false, "Proposed", 1220.0, "L2 Halo");

        SpaceProbeDTO probe321 = new SpaceProbeDTO("SP-321", "Quantum Spectrum Analyzer", "Space", "NASA", 62000.0,
                LocalDateTime.of(2375, 5, 1, 10, 0), LocalDateTime.of(2385, 8, 1, 12, 0),
                "None", 31000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Spec", "Spectrometer", 62000, false, "Proposed", 1240.0, "L2 Halo");

        SpaceProbeDTO probe322 = new SpaceProbeDTO("SP-322", "Quantum Vector Network Analyzer", "Space", "ESA", 63000.0,
                LocalDateTime.of(2380, 5, 1, 10, 0), LocalDateTime.of(2390, 8, 1, 12, 0),
                "None", 31500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum VNA", "Spectrometer", 63000, false, "Proposed", 1260.0, "L2 Halo");

        SpaceProbeDTO probe323 = new SpaceProbeDTO("SP-323", "Quantum Time Domain Reflectometer", "Space", "NASA", 64000.0,
                LocalDateTime.of(2385, 5, 1, 10, 0), LocalDateTime.of(2395, 8, 1, 12, 0),
                "None", 32000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum TDR", "Spectrometer", 64000, false, "Proposed", 1280.0, "L2 Halo");

        SpaceProbeDTO probe324 = new SpaceProbeDTO("SP-324", "Quantum Optical Time Domain Reflectometer", "Space", "ESA", 65000.0,
                LocalDateTime.of(2390, 5, 1, 10, 0), LocalDateTime.of(2400, 8, 1, 12, 0),
                "None", 32500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum OTDR", "Spectrometer", 65000, false, "Proposed", 1300.0, "L2 Halo");

        SpaceProbeDTO probe325 = new SpaceProbeDTO("SP-325", "Quantum Optical Spectrum Analyzer", "Space", "NASA", 66000.0,
                LocalDateTime.of(2395, 5, 1, 10, 0), LocalDateTime.of(2405, 8, 1, 12, 0),
                "None", 33000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum OSA", "Spectrometer", 66000, false, "Proposed", 1320.0, "L2 Halo");

        SpaceProbeDTO probe326 = new SpaceProbeDTO("SP-326", "Quantum Optical Power Meter", "Space", "ESA", 67000.0,
                LocalDateTime.of(2400, 5, 1, 10, 0), LocalDateTime.of(2410, 8, 1, 12, 0),
                "None", 33500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum OPM", "Spectrometer", 67000, false, "Proposed", 1340.0, "L2 Halo");

        SpaceProbeDTO probe327 = new SpaceProbeDTO("SP-327", "Quantum Optical Network Analyzer", "Space", "NASA", 68000.0,
                LocalDateTime.of(2405, 5, 1, 10, 0), LocalDateTime.of(2415, 8, 1, 12, 0),
                "None", 34000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum ONA", "Spectrometer", 68000, false, "Proposed", 1360.0, "L2 Halo");

        SpaceProbeDTO probe328 = new SpaceProbeDTO("SP-328", "Quantum Bit Error Rate Tester", "Space", "ESA", 69000.0,
                LocalDateTime.of(2410, 5, 1, 10, 0), LocalDateTime.of(2420, 8, 1, 12, 0),
                "None", 34500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum BERT", "Spectrometer", 69000, false, "Proposed", 1380.0, "L2 Halo");

        SpaceProbeDTO probe329 = new SpaceProbeDTO("SP-329", "Quantum Protocol Analyzer", "Space", "NASA", 70000.0,
                LocalDateTime.of(2415, 5, 1, 10, 0), LocalDateTime.of(2425, 8, 1, 12, 0),
                "None", 35000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum PA", "Spectrometer", 70000, false, "Proposed", 1400.0, "L2 Halo");

        SpaceProbeDTO probe330 = new SpaceProbeDTO("SP-330", "Quantum Traffic Generator", "Space", "ESA", 71000.0,
                LocalDateTime.of(2420, 5, 1, 10, 0), LocalDateTime.of(2430, 8, 1, 12, 0),
                "None", 35500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum TG", "Spectrometer", 71000, false, "Proposed", 1420.0, "L2 Halo");

        SpaceProbeDTO probe331 = new SpaceProbeDTO("SP-331", "Quantum Packet Generator", "Space", "NASA", 72000.0,
                LocalDateTime.of(2425, 5, 1, 10, 0), LocalDateTime.of(2435, 8, 1, 12, 0),
                "None", 36000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum PG", "Spectrometer", 72000, false, "Proposed", 1440.0, "L2 Halo");

        SpaceProbeDTO probe332 = new SpaceProbeDTO("SP-332", "Quantum Packet Analyzer", "Space", "ESA", 73000.0,
                LocalDateTime.of(2430, 5, 1, 10, 0), LocalDateTime.of(2440, 8, 1, 12, 0),
                "None", 36500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum PA", "Spectrometer", 73000, false, "Proposed", 1460.0, "L2 Halo");

        SpaceProbeDTO probe333 = new SpaceProbeDTO("SP-333", "Quantum Network Performance Monitor", "Space", "NASA", 74000.0,
                LocalDateTime.of(2435, 5, 1, 10, 0), LocalDateTime.of(2445, 8, 1, 12, 0),
                "None", 37000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum NPM", "Spectrometer", 74000, false, "Proposed", 1480.0, "L2 Halo");

        SpaceProbeDTO probe334 = new SpaceProbeDTO("SP-334", "Quantum Network Security Scanner", "Space", "ESA", 75000.0,
                LocalDateTime.of(2440, 5, 1, 10, 0), LocalDateTime.of(2450, 8, 1, 12, 0),
                "None", 37500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum NSS", "Spectrometer", 75000, false, "Proposed", 1500.0, "L2 Halo");

        SpaceProbeDTO probe335 = new SpaceProbeDTO("SP-335", "Quantum Network Intrusion Detection", "Space", "NASA", 76000.0,
                LocalDateTime.of(2445, 5, 1, 10, 0), LocalDateTime.of(2455, 8, 1, 12, 0),
                "None", 38000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum NID", "Spectrometer", 76000, false, "Proposed", 1520.0, "L2 Halo");

        SpaceProbeDTO probe336 = new SpaceProbeDTO("SP-336", "Quantum Network Firewall", "Space", "ESA", 77000.0,
                LocalDateTime.of(2450, 5, 1, 10, 0), LocalDateTime.of(2460, 8, 1, 12, 0),
                "None", 38500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum FW", "Spectrometer", 77000, false, "Proposed", 1540.0, "L2 Halo");

        SpaceProbeDTO probe337 = new SpaceProbeDTO("SP-337", "Quantum Network Load Balancer", "Space", "NASA", 78000.0,
                LocalDateTime.of(2455, 5, 1, 10, 0), LocalDateTime.of(2465, 8, 1, 12, 0),
                "None", 39000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum LB", "Spectrometer", 78000, false, "Proposed", 1560.0, "L2 Halo");

        SpaceProbeDTO probe338 = new SpaceProbeDTO("SP-338", "Quantum Network Switch", "Space", "ESA", 79000.0,
                LocalDateTime.of(2460, 5, 1, 10, 0), LocalDateTime.of(2470, 8, 1, 12, 0),
                "None", 39500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Switch", "Spectrometer", 79000, false, "Proposed", 1580.0, "L2 Halo");

        SpaceProbeDTO probe339 = new SpaceProbeDTO("SP-339", "Quantum Network Router", "Space", "NASA", 80000.0,
                LocalDateTime.of(2465, 5, 1, 10, 0), LocalDateTime.of(2475, 8, 1, 12, 0),
                "None", 40000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Router", "Spectrometer", 80000, false, "Proposed", 1600.0, "L2 Halo");

        SpaceProbeDTO probe340 = new SpaceProbeDTO("SP-340", "Quantum Network Gateway", "Space", "ESA", 81000.0,
                LocalDateTime.of(2470, 5, 1, 10, 0), LocalDateTime.of(2480, 8, 1, 12, 0),
                "None", 40500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Gateway", "Spectrometer", 81000, false, "Proposed", 1620.0, "L2 Halo");

        SpaceProbeDTO probe341 = new SpaceProbeDTO("SP-341", "Quantum Network Bridge", "Space", "NASA", 82000.0,
                LocalDateTime.of(2475, 5, 1, 10, 0), LocalDateTime.of(2485, 8, 1, 12, 0),
                "None", 41000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Bridge", "Spectrometer", 82000, false, "Proposed", 1640.0, "L2 Halo");

        SpaceProbeDTO probe342 = new SpaceProbeDTO("SP-342", "Quantum Network Repeater", "Space", "ESA", 83000.0,
                LocalDateTime.of(2480, 5, 1, 10, 0), LocalDateTime.of(2490, 8, 1, 12, 0),
                "None", 41500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Repeater", "Spectrometer", 83000, false, "Proposed", 1660.0, "L2 Halo");

        SpaceProbeDTO probe343 = new SpaceProbeDTO("SP-343", "Quantum Network Hub", "Space", "NASA", 84000.0,
                LocalDateTime.of(2485, 5, 1, 10, 0), LocalDateTime.of(2495, 8, 1, 12, 0),
                "None", 42000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Hub", "Spectrometer", 84000, false, "Proposed", 1680.0, "L2 Halo");

        SpaceProbeDTO probe344 = new SpaceProbeDTO("SP-344", "Quantum Network Modem", "Space", "ESA", 85000.0,
                LocalDateTime.of(2490, 5, 1, 10, 0), LocalDateTime.of(2500, 8, 1, 12, 0),
                "None", 42500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Modem", "Spectrometer", 85000, false, "Proposed", 1700.0, "L2 Halo");

        SpaceProbeDTO probe345 = new SpaceProbeDTO("SP-345", "Quantum Network Transceiver", "Space", "NASA", 86000.0,
                LocalDateTime.of(2495, 5, 1, 10, 0), LocalDateTime.of(2505, 8, 1, 12, 0),
                "None", 43000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Transceiver", "Spectrometer", 86000, false, "Proposed", 1720.0, "L2 Halo");

        SpaceProbeDTO probe346 = new SpaceProbeDTO("SP-346", "Quantum Network Antenna", "Space", "ESA", 87000.0,
                LocalDateTime.of(2500, 5, 1, 10, 0), LocalDateTime.of(2510, 8, 1, 12, 0),
                "None", 43500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Antenna", "Spectrometer", 87000, false, "Proposed", 1740.0, "L2 Halo");

        SpaceProbeDTO probe347 = new SpaceProbeDTO("SP-347", "Quantum Network Amplifier", "Space", "NASA", 88000.0,
                LocalDateTime.of(2505, 5, 1, 10, 0), LocalDateTime.of(2515, 8, 1, 12, 0),
                "None", 44000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Amp", "Spectrometer", 88000, false, "Proposed", 1760.0, "L2 Halo");

        SpaceProbeDTO probe348 = new SpaceProbeDTO("SP-348", "Quantum Network Filter", "Space", "ESA", 89000.0,
                LocalDateTime.of(2510, 5, 1, 10, 0), LocalDateTime.of(2520, 8, 1, 12, 0),
                "None", 44500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Filter", "Spectrometer", 89000, false, "Proposed", 1780.0, "L2 Halo");

        SpaceProbeDTO probe349 = new SpaceProbeDTO("SP-349", "Quantum Network Multiplexer", "Space", "NASA", 90000.0,
                LocalDateTime.of(2515, 5, 1, 10, 0), LocalDateTime.of(2525, 8, 1, 12, 0),
                "None", 45000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Mux", "Spectrometer", 90000, false, "Proposed", 1800.0, "L2 Halo");

        SpaceProbeDTO probe350 = new SpaceProbeDTO("SP-350", "Quantum Network Demultiplexer", "Space", "ESA", 91000.0,
                LocalDateTime.of(2520, 5, 1, 10, 0), LocalDateTime.of(2530, 8, 1, 12, 0),
                "None", 45500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Demux", "Spectrometer", 91000, false, "Proposed", 1820.0, "L2 Halo");

        SpaceProbeDTO probe351 = new SpaceProbeDTO("SP-351", "Quantum Network Encoder", "Space", "NASA", 92000.0,
                LocalDateTime.of(2525, 5, 1, 10, 0), LocalDateTime.of(2535, 8, 1, 12, 0),
                "None", 46000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Encoder", "Spectrometer", 92000, false, "Proposed", 1840.0, "L2 Halo");

        SpaceProbeDTO probe352 = new SpaceProbeDTO("SP-352", "Quantum Network Decoder", "Space", "ESA", 93000.0,
                LocalDateTime.of(2530, 5, 1, 10, 0), LocalDateTime.of(2540, 8, 1, 12, 0),
                "None", 46500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Decoder", "Spectrometer", 93000, false, "Proposed", 1860.0, "L2 Halo");

        SpaceProbeDTO probe353 = new SpaceProbeDTO("SP-353", "Quantum Network Modulator", "Space", "NASA", 94000.0,
                LocalDateTime.of(2535, 5, 1, 10, 0), LocalDateTime.of(2545, 8, 1, 12, 0),
                "None", 47000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Modulator", "Spectrometer", 94000, false, "Proposed", 1880.0, "L2 Halo");

        SpaceProbeDTO probe354 = new SpaceProbeDTO("SP-354", "Quantum Network Demodulator", "Space", "ESA", 95000.0,
                LocalDateTime.of(2540, 5, 1, 10, 0), LocalDateTime.of(2550, 8, 1, 12, 0),
                "None", 47500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Demodulator", "Spectrometer", 95000, false, "Proposed", 1900.0, "L2 Halo");

        SpaceProbeDTO probe355 = new SpaceProbeDTO("SP-355", "Quantum Network Equalizer", "Space", "NASA", 96000.0,
                LocalDateTime.of(2545, 5, 1, 10, 0), LocalDateTime.of(2555, 8, 1, 12, 0),
                "None", 48000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Equalizer", "Spectrometer", 96000, false, "Proposed", 1920.0, "L2 Halo");

        SpaceProbeDTO probe356 = new SpaceProbeDTO("SP-356", "Quantum Network Compressor", "Space", "ESA", 97000.0,
                LocalDateTime.of(2550, 5, 1, 10, 0), LocalDateTime.of(2560, 8, 1, 12, 0),
                "None", 48500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Compressor", "Spectrometer", 97000, false, "Proposed", 1940.0, "L2 Halo");

        SpaceProbeDTO probe357 = new SpaceProbeDTO("SP-357", "Quantum Network Decompressor", "Space", "NASA", 98000.0,
                LocalDateTime.of(2555, 5, 1, 10, 0), LocalDateTime.of(2565, 8, 1, 12, 0),
                "None", 49000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Decompressor", "Spectrometer", 98000, false, "Proposed", 1960.0, "L2 Halo");

        SpaceProbeDTO probe358 = new SpaceProbeDTO("SP-358", "Quantum Network Encryptor", "Space", "ESA", 99000.0,
                LocalDateTime.of(2560, 5, 1, 10, 0), LocalDateTime.of(2570, 8, 1, 12, 0),
                "None", 49500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Encryptor", "Spectrometer", 99000, false, "Proposed", 1980.0, "L2 Halo");

        SpaceProbeDTO probe359 = new SpaceProbeDTO("SP-359", "Quantum Network Decryptor", "Space", "NASA", 100000.0,
                LocalDateTime.of(2565, 5, 1, 10, 0), LocalDateTime.of(2575, 8, 1, 12, 0),
                "None", 50000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Decryptor", "Spectrometer", 100000, false, "Proposed", 2000.0, "L2 Halo");

        SpaceProbeDTO probe360 = new SpaceProbeDTO("SP-360", "Quantum Network Authenticator", "Space", "ESA", 101000.0,
                LocalDateTime.of(2570, 5, 1, 10, 0), LocalDateTime.of(2580, 8, 1, 12, 0),
                "None", 50500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Auth", "Spectrometer", 101000, false, "Proposed", 2020.0, "L2 Halo");

        SpaceProbeDTO probe361 = new SpaceProbeDTO("SP-361", "Quantum Network Verifier", "Space", "NASA", 102000.0,
                LocalDateTime.of(2575, 5, 1, 10, 0), LocalDateTime.of(2585, 8, 1, 12, 0),
                "None", 51000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Verify", "Spectrometer", 102000, false, "Proposed", 2040.0, "L2 Halo");

        SpaceProbeDTO probe362 = new SpaceProbeDTO("SP-362", "Quantum Network Validator", "Space", "ESA", 103000.0,
                LocalDateTime.of(2580, 5, 1, 10, 0), LocalDateTime.of(2590, 8, 1, 12, 0),
                "None", 51500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Validate", "Spectrometer", 103000, false, "Proposed", 2060.0, "L2 Halo");

        SpaceProbeDTO probe363 = new SpaceProbeDTO("SP-363", "Quantum Network Certifier", "Space", "NASA", 104000.0,
                LocalDateTime.of(2585, 5, 1, 10, 0), LocalDateTime.of(2595, 8, 1, 12, 0),
                "None", 52000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Certify", "Spectrometer", 104000, false, "Proposed", 2080.0, "L2 Halo");

        SpaceProbeDTO probe364 = new SpaceProbeDTO("SP-364", "Quantum Network Authorizer", "Space", "ESA", 105000.0,
                LocalDateTime.of(2590, 5, 1, 10, 0), LocalDateTime.of(2600, 8, 1, 12, 0),
                "None", 52500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Authorize", "Spectrometer", 105000, false, "Proposed", 2100.0, "L2 Halo");

        SpaceProbeDTO probe365 = new SpaceProbeDTO("SP-365", "Quantum Network Logger", "Space", "NASA", 106000.0,
                LocalDateTime.of(2595, 5, 1, 10, 0), LocalDateTime.of(2605, 8, 1, 12, 0),
                "None", 53000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Log", "Spectrometer", 106000, false, "Proposed", 2120.0, "L2 Halo");

        SpaceProbeDTO probe366 = new SpaceProbeDTO("SP-366", "Quantum Network Auditor", "Space", "ESA", 107000.0,
                LocalDateTime.of(2600, 5, 1, 10, 0), LocalDateTime.of(2610, 8, 1, 12, 0),
                "None", 53500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Audit", "Spectrometer", 107000, false, "Proposed", 2140.0, "L2 Halo");

        SpaceProbeDTO probe367 = new SpaceProbeDTO("SP-367", "Quantum Network Monitor", "Space", "NASA", 108000.0,
                LocalDateTime.of(2605, 5, 1, 10, 0), LocalDateTime.of(2615, 8, 1, 12, 0),
                "None", 54000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Monitor", "Spectrometer", 108000, false, "Proposed", 2160.0, "L2 Halo");

        SpaceProbeDTO probe368 = new SpaceProbeDTO("SP-368", "Quantum Network Controller", "Space", "ESA", 109000.0,
                LocalDateTime.of(2610, 5, 1, 10, 0), LocalDateTime.of(2620, 8, 1, 12, 0),
                "None", 54500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Control", "Spectrometer", 109000, false, "Proposed", 2180.0, "L2 Halo");

        SpaceProbeDTO probe369 = new SpaceProbeDTO("SP-369", "Quantum Network Manager", "Space", "NASA", 110000.0,
                LocalDateTime.of(2615, 5, 1, 10, 0), LocalDateTime.of(2625, 8, 1, 12, 0),
                "None", 55000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Manage", "Spectrometer", 110000, false, "Proposed", 2200.0, "L2 Halo");

        SpaceProbeDTO probe370 = new SpaceProbeDTO("SP-370", "Quantum Network Orchestrator", "Space", "ESA", 111000.0,
                LocalDateTime.of(2620, 5, 1, 10, 0), LocalDateTime.of(2630, 8, 1, 12, 0),
                "None", 55500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Orchestrate", "Spectrometer", 111000, false, "Proposed", 2220.0, "L2 Halo");

        SpaceProbeDTO probe371 = new SpaceProbeDTO("SP-371", "Quantum Network Coordinator", "Space", "NASA", 112000.0,
                LocalDateTime.of(2625, 5, 1, 10, 0), LocalDateTime.of(2635, 8, 1, 12, 0),
                "None", 56000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Coordinate", "Spectrometer", 112000, false, "Proposed", 2240.0, "L2 Halo");

        SpaceProbeDTO probe372 = new SpaceProbeDTO("SP-372", "Quantum Network Scheduler", "Space", "ESA", 113000.0,
                LocalDateTime.of(2630, 5, 1, 10, 0), LocalDateTime.of(2640, 8, 1, 12, 0),
                "None", 56500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Schedule", "Spectrometer", 113000, false, "Proposed", 2260.0, "L2 Halo");

        SpaceProbeDTO probe373 = new SpaceProbeDTO("SP-373", "Quantum Network Dispatcher", "Space", "NASA", 114000.0,
                LocalDateTime.of(2635, 5, 1, 10, 0), LocalDateTime.of(2645, 8, 1, 12, 0),
                "None", 57000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Dispatch", "Spectrometer", 114000, false, "Proposed", 2280.0, "L2 Halo");

        SpaceProbeDTO probe374 = new SpaceProbeDTO("SP-374", "Quantum Network Allocator", "Space", "ESA", 115000.0,
                LocalDateTime.of(2640, 5, 1, 10, 0), LocalDateTime.of(2650, 8, 1, 12, 0),
                "None", 57500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Allocate", "Spectrometer", 115000, false, "Proposed", 2300.0, "L2 Halo");

        SpaceProbeDTO probe375 = new SpaceProbeDTO("SP-375", "Quantum Network Provisioner", "Space", "NASA", 116000.0,
                LocalDateTime.of(2645, 5, 1, 10, 0), LocalDateTime.of(2655, 8, 1, 12, 0),
                "None", 58000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Provision", "Spectrometer", 116000, false, "Proposed", 2320.0, "L2 Halo");

        SpaceProbeDTO probe376 = new SpaceProbeDTO("SP-376", "Quantum Network Configurator", "Space", "ESA", 117000.0,
                LocalDateTime.of(2650, 5, 1, 10, 0), LocalDateTime.of(2660, 8, 1, 12, 0),
                "None", 58500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Configure", "Spectrometer", 117000, false, "Proposed", 2340.0, "L2 Halo");

        SpaceProbeDTO probe377 = new SpaceProbeDTO("SP-377", "Quantum Network Deployer", "Space", "NASA", 118000.0,
                LocalDateTime.of(2655, 5, 1, 10, 0), LocalDateTime.of(2665, 8, 1, 12, 0),
                "None", 59000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Deploy", "Spectrometer", 118000, false, "Proposed", 2360.0, "L2 Halo");

        SpaceProbeDTO probe378 = new SpaceProbeDTO("SP-378", "Quantum Network Installer", "Space", "ESA", 119000.0,
                LocalDateTime.of(2660, 5, 1, 10, 0), LocalDateTime.of(2670, 8, 1, 12, 0),
                "None", 59500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Install", "Spectrometer", 119000, false, "Proposed", 2380.0, "L2 Halo");

        SpaceProbeDTO probe379 = new SpaceProbeDTO("SP-379", "Quantum Network Upgrader", "Space", "NASA", 120000.0,
                LocalDateTime.of(2665, 5, 1, 10, 0), LocalDateTime.of(2675, 8, 1, 12, 0),
                "None", 60000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Upgrade", "Spectrometer", 120000, false, "Proposed", 2400.0, "L2 Halo");

        SpaceProbeDTO probe380 = new SpaceProbeDTO("SP-380", "Quantum Network Patcher", "Space", "ESA", 121000.0,
                LocalDateTime.of(2670, 5, 1, 10, 0), LocalDateTime.of(2680, 8, 1, 12, 0),
                "None", 60500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Patch", "Spectrometer", 121000, false, "Proposed", 2420.0, "L2 Halo");

        SpaceProbeDTO probe381 = new SpaceProbeDTO("SP-381", "Quantum Network Maintainer", "Space", "NASA", 122000.0,
                LocalDateTime.of(2675, 5, 1, 10, 0), LocalDateTime.of(2685, 8, 1, 12, 0),
                "None", 61000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Maintain", "Spectrometer", 122000, false, "Proposed", 2440.0, "L2 Halo");

        SpaceProbeDTO probe382 = new SpaceProbeDTO("SP-382", "Quantum Network Repairer", "Space", "ESA", 123000.0,
                LocalDateTime.of(2680, 5, 1, 10, 0), LocalDateTime.of(2690, 8, 1, 12, 0),
                "None", 61500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Repair", "Spectrometer", 123000, false, "Proposed", 2460.0, "L2 Halo");

        SpaceProbeDTO probe383 = new SpaceProbeDTO("SP-383", "Quantum Network Restorer", "Space", "NASA", 124000.0,
                LocalDateTime.of(2685, 5, 1, 10, 0), LocalDateTime.of(2695, 8, 1, 12, 0),
                "None", 62000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Restore", "Spectrometer", 124000, false, "Proposed", 2480.0, "L2 Halo");

        SpaceProbeDTO probe384 = new SpaceProbeDTO("SP-384", "Quantum Network Recoverer", "Space", "ESA", 125000.0,
                LocalDateTime.of(2690, 5, 1, 10, 0), LocalDateTime.of(2700, 8, 1, 12, 0),
                "None", 62500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Recover", "Spectrometer", 125000, false, "Proposed", 2500.0, "L2 Halo");

        SpaceProbeDTO probe385 = new SpaceProbeDTO("SP-385", "Quantum Network Backuper", "Space", "NASA", 126000.0,
                LocalDateTime.of(2695, 5, 1, 10, 0), LocalDateTime.of(2705, 8, 1, 12, 0),
                "None", 63000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Backup", "Spectrometer", 126000, false, "Proposed", 2520.0, "L2 Halo");

        SpaceProbeDTO probe386 = new SpaceProbeDTO("SP-386", "Quantum Network Archiver", "Space", "ESA", 127000.0,
                LocalDateTime.of(2700, 5, 1, 10, 0), LocalDateTime.of(2710, 8, 1, 12, 0),
                "None", 63500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Archive", "Spectrometer", 127000, false, "Proposed", 2540.0, "L2 Halo");

        SpaceProbeDTO probe387 = new SpaceProbeDTO("SP-387", "Quantum Network Retriever", "Space", "NASA", 128000.0,
                LocalDateTime.of(2705, 5, 1, 10, 0), LocalDateTime.of(2715, 8, 1, 12, 0),
                "None", 64000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Retrieve", "Spectrometer", 128000, false, "Proposed", 2560.0, "L2 Halo");

        SpaceProbeDTO probe388 = new SpaceProbeDTO("SP-388", "Quantum Network Indexer", "Space", "ESA", 129000.0,
                LocalDateTime.of(2710, 5, 1, 10, 0), LocalDateTime.of(2720, 8, 1, 12, 0),
                "None", 64500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Index", "Spectrometer", 129000, false, "Proposed", 2580.0, "L2 Halo");

        SpaceProbeDTO probe389 = new SpaceProbeDTO("SP-389", "Quantum Network Searcher", "Space", "NASA", 130000.0,
                LocalDateTime.of(2715, 5, 1, 10, 0), LocalDateTime.of(2725, 8, 1, 12, 0),
                "None", 65000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Search", "Spectrometer", 130000, false, "Proposed", 2600.0, "L2 Halo");

        SpaceProbeDTO probe390 = new SpaceProbeDTO("SP-390", "Quantum Network Querier", "Space", "ESA", 131000.0,
                LocalDateTime.of(2720, 5, 1, 10, 0), LocalDateTime.of(2730, 8, 1, 12, 0),
                "None", 65500.0, "Ka-Band", 150000000000.0, 0.2, "Quantum Query", "Spectrometer", 131000, false, "Proposed", 2620.0, "L2 Halo");

        SpaceProbeDTO probe391 = new SpaceProbeDTO("SP-391", "Quantum Network Analyzer", "Space", "NASA", 132000.0,
                LocalDateTime.of(2725, 5, 1, 10, 0), LocalDateTime.of(2735, 8, 1, 12, 0),
                "None", 66000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Analyze", "Spectrometer", 132000, false, "Proposed", 2640.0, "L2 Halo");

        SpaceProbeDTO probe392 = new SpaceProbeDTO("SP-392", "Quantum Network Reporter", "Space", "ESA", 133000.0,
                LocalDateTime.of(2730, 5, 1, 10, 0), LocalDateTime.of(2740, 8, 1, 12, 0),
                "None", 66500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Report", "Spectrometer", 133000, false, "Proposed", 2660.0, "L2 Halo");

        SpaceProbeDTO probe393 = new SpaceProbeDTO("SP-393", "Quantum Network Visualizer", "Space", "NASA", 134000.0,
                LocalDateTime.of(2735, 5, 1, 10, 0), LocalDateTime.of(2745, 8, 1, 12, 0),
                "None", 67000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Visualize", "Spectrometer", 134000, false, "Proposed", 2680.0, "L2 Halo");

        SpaceProbeDTO probe394 = new SpaceProbeDTO("SP-394", "Quantum Network Simulator", "Space", "ESA", 135000.0,
                LocalDateTime.of(2740, 5, 1, 10, 0), LocalDateTime.of(2750, 8, 1, 12, 0),
                "None", 67500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Simulate", "Spectrometer", 135000, false, "Proposed", 2700.0, "L2 Halo");

        SpaceProbeDTO probe395 = new SpaceProbeDTO("SP-395", "Quantum Network Emulator", "Space", "NASA", 136000.0,
                LocalDateTime.of(2745, 5, 1, 10, 0), LocalDateTime.of(2755, 8, 1, 12, 0),
                "None", 68000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Emulate", "Spectrometer", 136000, false, "Proposed", 2720.0, "L2 Halo");

        SpaceProbeDTO probe396 = new SpaceProbeDTO("SP-396", "Quantum Network Tester", "Space", "ESA", 137000.0,
                LocalDateTime.of(2750, 5, 1, 10, 0), LocalDateTime.of(2760, 8, 1, 12, 0),
                "None", 68500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Test", "Spectrometer", 137000, false, "Proposed", 2740.0, "L2 Halo");

        SpaceProbeDTO probe397 = new SpaceProbeDTO("SP-397", "Quantum Network Debugger", "Space", "NASA", 138000.0,
                LocalDateTime.of(2755, 5, 1, 10, 0), LocalDateTime.of(2765, 8, 1, 12, 0),
                "None", 69000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Debug", "Spectrometer", 138000, false, "Proposed", 2760.0, "L2 Halo");

        SpaceProbeDTO probe398 = new SpaceProbeDTO("SP-398", "Quantum Network Profiler", "Space", "ESA", 139000.0,
                LocalDateTime.of(2760, 5, 1, 10, 0), LocalDateTime.of(2770, 8, 1, 12, 0),
                "None", 69500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Profile", "Spectrometer", 139000, false, "Proposed", 2780.0, "L2 Halo");

        SpaceProbeDTO probe399 = new SpaceProbeDTO("SP-399", "Quantum Network Optimizer", "Space", "NASA", 140000.0,
                LocalDateTime.of(2765, 5, 1, 10, 0), LocalDateTime.of(2775, 8, 1, 12, 0),
                "None", 70000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Optimize", "Spectrometer", 140000, false, "Proposed", 2800.0, "L2 Halo");

        SpaceProbeDTO probe400 = new SpaceProbeDTO("SP-400", "Quantum Network Tuner", "Space", "ESA", 141000.0,
                LocalDateTime.of(2770, 5, 1, 10, 0), LocalDateTime.of(2780, 8, 1, 12, 0),
                "None", 70500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Tune", "Spectrometer", 141000, false, "Proposed", 2820.0, "L2 Halo");

        SpaceProbeDTO probe401 = new SpaceProbeDTO("SP-401", "Quantum Network Calibrator", "Space", "NASA", 142000.0,
                LocalDateTime.of(2775, 5, 1, 10, 0), LocalDateTime.of(2785, 8, 1, 12, 0),
                "None", 71000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Calibrate", "Spectrometer", 142000, false, "Proposed", 2840.0, "L2 Halo");

        SpaceProbeDTO probe402 = new SpaceProbeDTO("SP-402", "Quantum Network Synchronizer", "Space", "ESA", 143000.0,
                LocalDateTime.of(2780, 5, 1, 10, 0), LocalDateTime.of(2790, 8, 1, 12, 0),
                "None", 71500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Sync", "Spectrometer", 143000, false, "Proposed", 2860.0, "L2 Halo");

        SpaceProbeDTO probe403 = new SpaceProbeDTO("SP-403", "Quantum Network Desynchronizer", "Space", "NASA", 144000.0,
                LocalDateTime.of(2785, 5, 1, 10, 0), LocalDateTime.of(2795, 8, 1, 12, 0),
                "None", 72000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Desync", "Spectrometer", 144000, false, "Proposed", 2880.0, "L2 Halo");

        SpaceProbeDTO probe404 = new SpaceProbeDTO("SP-404", "Quantum Network Aligner", "Space", "ESA", 145000.0,
                LocalDateTime.of(2790, 5, 1, 10, 0), LocalDateTime.of(2800, 8, 1, 12, 0),
                "None", 72500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Align", "Spectrometer", 145000, false, "Proposed", 2900.0, "L2 Halo");

        SpaceProbeDTO probe405 = new SpaceProbeDTO("SP-405", "Quantum Network Misaligner", "Space", "NASA", 146000.0,
                LocalDateTime.of(2795, 5, 1, 10, 0), LocalDateTime.of(2805, 8, 1, 12, 0),
                "None", 73000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Misalign", "Spectrometer", 146000, false, "Proposed", 2920.0, "L2 Halo");

        SpaceProbeDTO probe406 = new SpaceProbeDTO("SP-406", "Quantum Network Realigner", "Space", "ESA", 147000.0,
                LocalDateTime.of(2800, 5, 1, 10, 0), LocalDateTime.of(2810, 8, 1, 12, 0),
                "None", 73500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Realign", "Spectrometer", 147000, false, "Proposed", 2940.0, "L2 Halo");

        SpaceProbeDTO probe407 = new SpaceProbeDTO("SP-407", "Quantum Network Tracker", "Space", "NASA", 148000.0,
                LocalDateTime.of(2805, 5, 1, 10, 0), LocalDateTime.of(2815, 8, 1, 12, 0),
                "None", 74000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Track", "Spectrometer", 148000, false, "Proposed", 2960.0, "L2 Halo");

        SpaceProbeDTO probe408 = new SpaceProbeDTO("SP-408", "Quantum Network Tracer", "Space", "ESA", 149000.0,
                LocalDateTime.of(2810, 5, 1, 10, 0), LocalDateTime.of(2820, 8, 1, 12, 0),
                "None", 74500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Trace", "Spectrometer", 149000, false, "Proposed", 2980.0, "L2 Halo");

        SpaceProbeDTO probe409 = new SpaceProbeDTO("SP-409", "Quantum Network Follower", "Space", "NASA", 150000.0,
                LocalDateTime.of(2815, 5, 1, 10, 0), LocalDateTime.of(2825, 8, 1, 12, 0),
                "None", 75000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Follow", "Spectrometer", 150000, false, "Proposed", 3000.0, "L2 Halo");

        SpaceProbeDTO probe410 = new SpaceProbeDTO("SP-410", "Quantum Network Leader", "Space", "ESA", 151000.0,
                LocalDateTime.of(2820, 5, 1, 10, 0), LocalDateTime.of(2830, 8, 1, 12, 0),
                "None", 75500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Lead", "Spectrometer", 151000, false, "Proposed", 3020.0, "L2 Halo");

        SpaceProbeDTO probe411 = new SpaceProbeDTO("SP-411", "Quantum Network Director", "Space", "NASA", 152000.0,
                LocalDateTime.of(2825, 5, 1, 10, 0), LocalDateTime.of(2835, 8, 1, 12, 0),
                "None", 76000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Direct", "Spectrometer", 152000, false, "Proposed", 3040.0, "L2 Halo");

        SpaceProbeDTO probe412 = new SpaceProbeDTO("SP-412", "Quantum Network Guide", "Space", "ESA", 153000.0,
                LocalDateTime.of(2830, 5, 1, 10, 0), LocalDateTime.of(2840, 8, 1, 12, 0),
                "None", 76500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Guide", "Spectrometer", 153000, false, "Proposed", 3060.0, "L2 Halo");

        SpaceProbeDTO probe413 = new SpaceProbeDTO("SP-413", "Quantum Network Navigator", "Space", "NASA", 154000.0,
                LocalDateTime.of(2835, 5, 1, 10, 0), LocalDateTime.of(2845, 8, 1, 12, 0),
                "None", 77000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Navigate", "Spectrometer", 154000, false, "Proposed", 3080.0, "L2 Halo");

        SpaceProbeDTO probe414 = new SpaceProbeDTO("SP-414", "Quantum Network Pilot", "Space", "ESA", 155000.0,
                LocalDateTime.of(2840, 5, 1, 10, 0), LocalDateTime.of(2850, 8, 1, 12, 0),
                "None", 77500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Pilot", "Spectrometer", 155000, false, "Proposed", 3100.0, "L2 Halo");

        SpaceProbeDTO probe415 = new SpaceProbeDTO("SP-415", "Quantum Network Driver", "Space", "NASA", 156000.0,
                LocalDateTime.of(2845, 5, 1, 10, 0), LocalDateTime.of(2855, 8, 1, 12, 0),
                "None", 78000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Drive", "Spectrometer", 156000, false, "Proposed", 3120.0, "L2 Halo");

        SpaceProbeDTO probe416 = new SpaceProbeDTO("SP-416", "Quantum Network Rider", "Space", "ESA", 157000.0,
                LocalDateTime.of(2850, 5, 1, 10, 0), LocalDateTime.of(2860, 8, 1, 12, 0),
                "None", 78500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Ride", "Spectrometer", 157000, false, "Proposed", 3140.0, "L2 Halo");

        SpaceProbeDTO probe417 = new SpaceProbeDTO("SP-417", "Quantum Network Passenger", "Space", "NASA", 158000.0,
                LocalDateTime.of(2855, 5, 1, 10, 0), LocalDateTime.of(2865, 8, 1, 12, 0),
                "None", 79000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Passenger", "Spectrometer", 158000, false, "Proposed", 3160.0, "L2 Halo");

        SpaceProbeDTO probe418 = new SpaceProbeDTO("SP-418", "Quantum Network Crew", "Space", "ESA", 159000.0,
                LocalDateTime.of(2860, 5, 1, 10, 0), LocalDateTime.of(2870, 8, 1, 12, 0),
                "None", 79500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Crew", "Spectrometer", 159000, false, "Proposed", 3180.0, "L2 Halo");

        SpaceProbeDTO probe419 = new SpaceProbeDTO("SP-419", "Quantum Network Staff", "Space", "NASA", 160000.0,
                LocalDateTime.of(2865, 5, 1, 10, 0), LocalDateTime.of(2875, 8, 1, 12, 0),
                "None", 80000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Staff", "Spectrometer", 160000, false, "Proposed", 3200.0, "L2 Halo");

        SpaceProbeDTO probe420 = new SpaceProbeDTO("SP-420", "Quantum Network Team", "Space", "ESA", 161000.0,
                LocalDateTime.of(2870, 5, 1, 10, 0), LocalDateTime.of(2880, 8, 1, 12, 0),
                "None", 80500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Team", "Spectrometer", 161000, false, "Proposed", 3220.0, "L2 Halo");

        SpaceProbeDTO probe421 = new SpaceProbeDTO("SP-421", "Quantum Network Group", "Space", "NASA", 162000.0,
                LocalDateTime.of(2875, 5, 1, 10, 0), LocalDateTime.of(2885, 8, 1, 12, 0),
                "None", 81000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Group", "Spectrometer", 162000, false, "Proposed", 3240.0, "L2 Halo");

        SpaceProbeDTO probe422 = new SpaceProbeDTO("SP-422", "Quantum Network Squad", "Space", "ESA", 163000.0,
                LocalDateTime.of(2880, 5, 1, 10, 0), LocalDateTime.of(2890, 8, 1, 12, 0),
                "None", 81500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Squad", "Spectrometer", 163000, false, "Proposed", 3260.0, "L2 Halo");

        SpaceProbeDTO probe423 = new SpaceProbeDTO("SP-423", "Quantum Network Unit", "Space", "NASA", 164000.0,
                LocalDateTime.of(2885, 5, 1, 10, 0), LocalDateTime.of(2895, 8, 1, 12, 0),
                "None", 82000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Unit", "Spectrometer", 164000, false, "Proposed", 3280.0, "L2 Halo");

        SpaceProbeDTO probe424 = new SpaceProbeDTO("SP-424", "Quantum Network Division", "Space", "ESA", 165000.0,
                LocalDateTime.of(2890, 5, 1, 10, 0), LocalDateTime.of(2900, 8, 1, 12, 0),
                "None", 82500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Division", "Spectrometer", 165000, false, "Proposed", 3300.0, "L2 Halo");

        SpaceProbeDTO probe425 = new SpaceProbeDTO("SP-425", "Quantum Network Department", "Space", "NASA", 166000.0,
                LocalDateTime.of(2895, 5, 1, 10, 0), LocalDateTime.of(2905, 8, 1, 12, 0),
                "None", 83000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Department", "Spectrometer", 166000, false, "Proposed", 3320.0, "L2 Halo");

        SpaceProbeDTO probe426 = new SpaceProbeDTO("SP-426", "Quantum Network Section", "Space", "ESA", 167000.0,
                LocalDateTime.of(2900, 5, 1, 10, 0), LocalDateTime.of(2910, 8, 1, 12, 0),
                "None", 83500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Section", "Spectrometer", 167000, false, "Proposed", 3340.0, "L2 Halo");

        SpaceProbeDTO probe427 = new SpaceProbeDTO("SP-427", "Quantum Network Branch", "Space", "NASA", 168000.0,
                LocalDateTime.of(2905, 5, 1, 10, 0), LocalDateTime.of(2915, 8, 1, 12, 0),
                "None", 84000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Branch", "Spectrometer", 168000, false, "Proposed", 3360.0, "L2 Halo");

        SpaceProbeDTO probe428 = new SpaceProbeDTO("SP-428", "Quantum Network Office", "Space", "ESA", 169000.0,
                LocalDateTime.of(2910, 5, 1, 10, 0), LocalDateTime.of(2920, 8, 1, 12, 0),
                "None", 84500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Office", "Spectrometer", 169000, false, "Proposed", 3380.0, "L2 Halo");

        SpaceProbeDTO probe429 = new SpaceProbeDTO("SP-429", "Quantum Network Bureau", "Space", "NASA", 170000.0,
                LocalDateTime.of(2915, 5, 1, 10, 0), LocalDateTime.of(2925, 8, 1, 12, 0),
                "None", 85000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Bureau", "Spectrometer", 170000, false, "Proposed", 3400.0, "L2 Halo");

        SpaceProbeDTO probe430 = new SpaceProbeDTO("SP-430", "Quantum Network Agency", "Space", "ESA", 171000.0,
                LocalDateTime.of(2920, 5, 1, 10, 0), LocalDateTime.of(2930, 8, 1, 12, 0),
                "None", 85500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Agency", "Spectrometer", 171000, false, "Proposed", 3420.0, "L2 Halo");

        SpaceProbeDTO probe431 = new SpaceProbeDTO("SP-431", "Quantum Network Organization", "Space", "NASA", 172000.0,
                LocalDateTime.of(2925, 5, 1, 10, 0), LocalDateTime.of(2935, 8, 1, 12, 0),
                "None", 86000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Organization", "Spectrometer", 172000, false, "Proposed", 3440.0, "L2 Halo");

        SpaceProbeDTO probe432 = new SpaceProbeDTO("SP-432", "Quantum Network Institution", "Space", "ESA", 173000.0,
                LocalDateTime.of(2930, 5, 1, 10, 0), LocalDateTime.of(2940, 8, 1, 12, 0),
                "None", 86500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Institution", "Spectrometer", 173000, false, "Proposed", 3460.0, "L2 Halo");

        SpaceProbeDTO probe433 = new SpaceProbeDTO("SP-433", "Quantum Network Establishment", "Space", "NASA", 174000.0,
                LocalDateTime.of(2935, 5, 1, 10, 0), LocalDateTime.of(2945, 8, 1, 12, 0),
                "None", 87000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Establishment", "Spectrometer", 174000, false, "Proposed", 3480.0, "L2 Halo");

        SpaceProbeDTO probe434 = new SpaceProbeDTO("SP-434", "Quantum Network Foundation", "Space", "ESA", 175000.0,
                LocalDateTime.of(2940, 5, 1, 10, 0), LocalDateTime.of(2950, 8, 1, 12, 0),
                "None", 87500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Foundation", "Spectrometer", 175000, false, "Proposed", 3500.0, "L2 Halo");

        SpaceProbeDTO probe435 = new SpaceProbeDTO("SP-435", "Quantum Network Association", "Space", "NASA", 176000.0,
                LocalDateTime.of(2945, 5, 1, 10, 0), LocalDateTime.of(2955, 8, 1, 12, 0),
                "None", 88000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Association", "Spectrometer", 176000, false, "Proposed", 3520.0, "L2 Halo");

        SpaceProbeDTO probe436 = new SpaceProbeDTO("SP-436", "Quantum Network Federation", "Space", "ESA", 177000.0,
                LocalDateTime.of(2950, 5, 1, 10, 0), LocalDateTime.of(2960, 8, 1, 12, 0),
                "None", 88500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Federation", "Spectrometer", 177000, false, "Proposed", 3540.0, "L2 Halo");

        SpaceProbeDTO probe437 = new SpaceProbeDTO("SP-437", "Quantum Network Confederation", "Space", "NASA", 178000.0,
                LocalDateTime.of(2955, 5, 1, 10, 0), LocalDateTime.of(2965, 8, 1, 12, 0),
                "None", 89000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Confederation", "Spectrometer", 178000, false, "Proposed", 3560.0, "L2 Halo");

        SpaceProbeDTO probe438 = new SpaceProbeDTO("SP-438", "Quantum Network Alliance", "Space", "ESA", 179000.0,
                LocalDateTime.of(2960, 5, 1, 10, 0), LocalDateTime.of(2970, 8, 1, 12, 0),
                "None", 89500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Alliance", "Spectrometer", 179000, false, "Proposed", 3580.0, "L2 Halo");

        SpaceProbeDTO probe439 = new SpaceProbeDTO("SP-439", "Quantum Network Coalition", "Space", "NASA", 180000.0,
                LocalDateTime.of(2965, 5, 1, 10, 0), LocalDateTime.of(2975, 8, 1, 12, 0),
                "None", 90000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Coalition", "Spectrometer", 180000, false, "Proposed", 3600.0, "L2 Halo");

        SpaceProbeDTO probe440 = new SpaceProbeDTO("SP-440", "Quantum Network Partnership", "Space", "ESA", 181000.0,
                LocalDateTime.of(2970, 5, 1, 10, 0), LocalDateTime.of(2980, 8, 1, 12, 0),
                "None", 90500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Partnership", "Spectrometer", 181000, false, "Proposed", 3620.0, "L2 Halo");

        SpaceProbeDTO probe441 = new SpaceProbeDTO("SP-441", "Quantum Network Consortium", "Space", "NASA", 182000.0,
                LocalDateTime.of(2975, 5, 1, 10, 0), LocalDateTime.of(2985, 8, 1, 12, 0),
                "None", 91000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Consortium", "Spectrometer", 182000, false, "Proposed", 3640.0, "L2 Halo");

        SpaceProbeDTO probe442 = new SpaceProbeDTO("SP-442", "Quantum Network Syndicate", "Space", "ESA", 183000.0,
                LocalDateTime.of(2980, 5, 1, 10, 0), LocalDateTime.of(2990, 8, 1, 12, 0),
                "None", 91500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Syndicate", "Spectrometer", 183000, false, "Proposed", 3660.0, "L2 Halo");

        SpaceProbeDTO probe443 = new SpaceProbeDTO("SP-443", "Quantum Network Cartel", "Space", "NASA", 184000.0,
                LocalDateTime.of(2985, 5, 1, 10, 0), LocalDateTime.of(2995, 8, 1, 12, 0),
                "None", 92000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Cartel", "Spectrometer", 184000, false, "Proposed", 3680.0, "L2 Halo");

        SpaceProbeDTO probe444 = new SpaceProbeDTO("SP-444", "Quantum Network Guild", "Space", "ESA", 185000.0,
                LocalDateTime.of(2990, 5, 1, 10, 0), LocalDateTime.of(3000, 8, 1, 12, 0),
                "None", 92500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Guild", "Spectrometer", 185000, false, "Proposed", 3700.0, "L2 Halo");

        SpaceProbeDTO probe445 = new SpaceProbeDTO("SP-445", "Quantum Network Union", "Space", "NASA", 186000.0,
                LocalDateTime.of(2995, 5, 1, 10, 0), LocalDateTime.of(3005, 8, 1, 12, 0),
                "None", 93000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Union", "Spectrometer", 186000, false, "Proposed", 3720.0, "L2 Halo");

        SpaceProbeDTO probe446 = new SpaceProbeDTO("SP-446", "Quantum Network League", "Space", "ESA", 187000.0,
                LocalDateTime.of(3000, 5, 1, 10, 0), LocalDateTime.of(3010, 8, 1, 12, 0),
                "None", 93500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum League", "Spectrometer", 187000, false, "Proposed", 3740.0, "L2 Halo");

        SpaceProbeDTO probe447 = new SpaceProbeDTO("SP-447", "Quantum Network Conference", "Space", "NASA", 188000.0,
                LocalDateTime.of(3005, 5, 1, 10, 0), LocalDateTime.of(3015, 8, 1, 12, 0),
                "None", 94000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Conference", "Spectrometer", 188000, false, "Proposed", 3760.0, "L2 Halo");

        SpaceProbeDTO probe448 = new SpaceProbeDTO("SP-448", "Quantum Network Summit", "Space", "ESA", 189000.0,
                LocalDateTime.of(3010, 5, 1, 10, 0), LocalDateTime.of(3020, 8, 1, 12, 0),
                "None", 94500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Summit", "Spectrometer", 189000, false, "Proposed", 3780.0, "L2 Halo");

        SpaceProbeDTO probe449 = new SpaceProbeDTO("SP-449", "Quantum Network Forum", "Space", "NASA", 190000.0,
                LocalDateTime.of(3015, 5, 1, 10, 0), LocalDateTime.of(3025, 8, 1, 12, 0),
                "None", 95000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Forum", "Spectrometer", 190000, false, "Proposed", 3800.0, "L2 Halo");

        SpaceProbeDTO probe450 = new SpaceProbeDTO("SP-450", "Quantum Network Congress", "Space", "ESA", 191000.0,
                LocalDateTime.of(3020, 5, 1, 10, 0), LocalDateTime.of(3030, 8, 1, 12, 0),
                "None", 95500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Congress", "Spectrometer", 191000, false, "Proposed", 3820.0, "L2 Halo");

        SpaceProbeDTO probe451 = new SpaceProbeDTO("SP-451", "Quantum Network Parliament", "Space", "NASA", 192000.0,
                LocalDateTime.of(3025, 5, 1, 10, 0), LocalDateTime.of(3035, 8, 1, 12, 0),
                "None", 96000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Parliament", "Spectrometer", 192000, false, "Proposed", 3840.0, "L2 Halo");

        SpaceProbeDTO probe452 = new SpaceProbeDTO("SP-452", "Quantum Network Assembly", "Space", "ESA", 193000.0,
                LocalDateTime.of(3030, 5, 1, 10, 0), LocalDateTime.of(3040, 8, 1, 12, 0),
                "None", 96500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Assembly", "Spectrometer", 193000, false, "Proposed", 3860.0, "L2 Halo");

        SpaceProbeDTO probe453 = new SpaceProbeDTO("SP-453", "Quantum Network Council", "Space", "NASA", 194000.0,
                LocalDateTime.of(3035, 5, 1, 10, 0), LocalDateTime.of(3045, 8, 1, 12, 0),
                "None", 97000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Council", "Spectrometer", 194000, false, "Proposed", 3880.0, "L2 Halo");

        SpaceProbeDTO probe454 = new SpaceProbeDTO("SP-454", "Quantum Network Board", "Space", "ESA", 195000.0,
                LocalDateTime.of(3040, 5, 1, 10, 0), LocalDateTime.of(3050, 8, 1, 12, 0),
                "None", 97500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Board", "Spectrometer", 195000, false, "Proposed", 3900.0, "L2 Halo");

        SpaceProbeDTO probe455 = new SpaceProbeDTO("SP-455", "Quantum Network Committee", "Space", "NASA", 196000.0,
                LocalDateTime.of(3045, 5, 1, 10, 0), LocalDateTime.of(3055, 8, 1, 12, 0),
                "None", 98000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Committee", "Spectrometer", 196000, false, "Proposed", 3920.0, "L2 Halo");

        SpaceProbeDTO probe456 = new SpaceProbeDTO("SP-456", "Quantum Network Commission", "Space", "ESA", 197000.0,
                LocalDateTime.of(3050, 5, 1, 10, 0), LocalDateTime.of(3060, 8, 1, 12, 0),
                "None", 98500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Commission", "Spectrometer", 197000, false, "Proposed", 3940.0, "L2 Halo");

        SpaceProbeDTO probe457 = new SpaceProbeDTO("SP-457", "Quantum Network Tribunal", "Space", "NASA", 198000.0,
                LocalDateTime.of(3055, 5, 1, 10, 0), LocalDateTime.of(3065, 8, 1, 12, 0),
                "None", 99000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Tribunal", "Spectrometer", 198000, false, "Proposed", 3960.0, "L2 Halo");

        SpaceProbeDTO probe458 = new SpaceProbeDTO("SP-458", "Quantum Network Court", "Space", "ESA", 199000.0,
                LocalDateTime.of(3060, 5, 1, 10, 0), LocalDateTime.of(3070, 8, 1, 12, 0),
                "None", 99500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Court", "Spectrometer", 199000, false, "Proposed", 3980.0, "L2 Halo");

        SpaceProbeDTO probe459 = new SpaceProbeDTO("SP-459", "Quantum Network Judiciary", "Space", "NASA", 200000.0,
                LocalDateTime.of(3065, 5, 1, 10, 0), LocalDateTime.of(3075, 8, 1, 12, 0),
                "None", 100000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Judiciary", "Spectrometer", 200000, false, "Proposed", 4000.0, "L2 Halo");

        SpaceProbeDTO probe460 = new SpaceProbeDTO("SP-460", "Quantum Network Executive", "Space", "ESA", 201000.0,
                LocalDateTime.of(3070, 5, 1, 10, 0), LocalDateTime.of(3080, 8, 1, 12, 0),
                "None", 100500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Executive", "Spectrometer", 201000, false, "Proposed", 4020.0, "L2 Halo");

        SpaceProbeDTO probe461 = new SpaceProbeDTO("SP-461", "Quantum Network Administration", "Space", "NASA", 202000.0,
                LocalDateTime.of(3075, 5, 1, 10, 0), LocalDateTime.of(3085, 8, 1, 12, 0),
                "None", 101000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Administration", "Spectrometer", 202000, false, "Proposed", 4040.0, "L2 Halo");

        SpaceProbeDTO probe462 = new SpaceProbeDTO("SP-462", "Quantum Network Management", "Space", "ESA", 203000.0,
                LocalDateTime.of(3080, 5, 1, 10, 0), LocalDateTime.of(3090, 8, 1, 12, 0),
                "None", 101500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Management", "Spectrometer", 203000, false, "Proposed", 4060.0, "L2 Halo");

        SpaceProbeDTO probe463 = new SpaceProbeDTO("SP-463", "Quantum Network Governance", "Space", "NASA", 204000.0,
                LocalDateTime.of(3085, 5, 1, 10, 0), LocalDateTime.of(3095, 8, 1, 12, 0),
                "None", 102000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Governance", "Spectrometer", 204000, false, "Proposed", 4080.0, "L2 Halo");

        SpaceProbeDTO probe464 = new SpaceProbeDTO("SP-464", "Quantum Network Leadership", "Space", "ESA", 205000.0,
                LocalDateTime.of(3090, 5, 1, 10, 0), LocalDateTime.of(3100, 8, 1, 12, 0),
                "None", 102500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Leadership", "Spectrometer", 205000, false, "Proposed", 4100.0, "L2 Halo");

        SpaceProbeDTO probe465 = new SpaceProbeDTO("SP-465", "Quantum Network Command", "Space", "NASA", 206000.0,
                LocalDateTime.of(3095, 5, 1, 10, 0), LocalDateTime.of(3105, 8, 1, 12, 0),
                "None", 103000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Command", "Spectrometer", 206000, false, "Proposed", 4120.0, "L2 Halo");

        SpaceProbeDTO probe466 = new SpaceProbeDTO("SP-466", "Quantum Network Control", "Space", "ESA", 207000.0,
                LocalDateTime.of(3100, 5, 1, 10, 0), LocalDateTime.of(3110, 8, 1, 12, 0),
                "None", 103500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Control", "Spectrometer", 207000, false, "Proposed", 4140.0, "L2 Halo");

        SpaceProbeDTO probe467 = new SpaceProbeDTO("SP-467", "Quantum Network Authority", "Space", "NASA", 208000.0,
                LocalDateTime.of(3105, 5, 1, 10, 0), LocalDateTime.of(3115, 8, 1, 12, 0),
                "None", 104000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Authority", "Spectrometer", 208000, false, "Proposed", 4160.0, "L2 Halo");

        SpaceProbeDTO probe468 = new SpaceProbeDTO("SP-468", "Quantum Network Power", "Space", "ESA", 209000.0,
                LocalDateTime.of(3110, 5, 1, 10, 0), LocalDateTime.of(3120, 8, 1, 12, 0),
                "None", 104500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Power", "Spectrometer", 209000, false, "Proposed", 4180.0, "L2 Halo");

        SpaceProbeDTO probe469 = new SpaceProbeDTO("SP-469", "Quantum Network Influence", "Space", "NASA", 210000.0,
                LocalDateTime.of(3115, 5, 1, 10, 0), LocalDateTime.of(3125, 8, 1, 12, 0),
                "None", 105000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Influence", "Spectrometer", 210000, false, "Proposed", 4200.0, "L2 Halo");

        SpaceProbeDTO probe470 = new SpaceProbeDTO("SP-470", "Quantum Network Impact", "Space", "ESA", 211000.0,
                LocalDateTime.of(3120, 5, 1, 10, 0), LocalDateTime.of(3130, 8, 1, 12, 0),
                "None", 105500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Impact", "Spectrometer", 211000, false, "Proposed", 4220.0, "L2 Halo");

        SpaceProbeDTO probe471 = new SpaceProbeDTO("SP-471", "Quantum Network Effect", "Space", "NASA", 212000.0,
                LocalDateTime.of(3125, 5, 1, 10, 0), LocalDateTime.of(3135, 8, 1, 12, 0),
                "None", 106000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Effect", "Spectrometer", 212000, false, "Proposed", 4240.0, "L2 Halo");

        SpaceProbeDTO probe472 = new SpaceProbeDTO("SP-472", "Quantum Network Outcome", "Space", "ESA", 213000.0,
                LocalDateTime.of(3130, 5, 1, 10, 0), LocalDateTime.of(3140, 8, 1, 12, 0),
                "None", 106500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Outcome", "Spectrometer", 213000, false, "Proposed", 4260.0, "L2 Halo");

        SpaceProbeDTO probe473 = new SpaceProbeDTO("SP-473", "Quantum Network Result", "Space", "NASA", 214000.0,
                LocalDateTime.of(3135, 5, 1, 10, 0), LocalDateTime.of(3145, 8, 1, 12, 0),
                "None", 107000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Result", "Spectrometer", 214000, false, "Proposed", 4280.0, "L2 Halo");

        SpaceProbeDTO probe474 = new SpaceProbeDTO("SP-474", "Quantum Network Consequence", "Space", "ESA", 215000.0,
                LocalDateTime.of(3140, 5, 1, 10, 0), LocalDateTime.of(3150, 8, 1, 12, 0),
                "None", 107500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Consequence", "Spectrometer", 215000, false, "Proposed", 4300.0, "L2 Halo");

        SpaceProbeDTO probe475 = new SpaceProbeDTO("SP-475", "Quantum Network Implication", "Space", "NASA", 216000.0,
                LocalDateTime.of(3145, 5, 1, 10, 0), LocalDateTime.of(3155, 8, 1, 12, 0),
                "None", 108000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Implication", "Spectrometer", 216000, false, "Proposed", 4320.0, "L2 Halo");

        SpaceProbeDTO probe476 = new SpaceProbeDTO("SP-476", "Quantum Network Ramification", "Space", "ESA", 217000.0,
                LocalDateTime.of(3150, 5, 1, 10, 0), LocalDateTime.of(3160, 8, 1, 12, 0),
                "None", 108500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Ramification", "Spectrometer", 217000, false, "Proposed", 4340.0, "L2 Halo");

        SpaceProbeDTO probe477 = new SpaceProbeDTO("SP-477", "Quantum Network Repercussion", "Space", "NASA", 218000.0,
                LocalDateTime.of(3155, 5, 1, 10, 0), LocalDateTime.of(3165, 8, 1, 12, 0),
                "None", 109000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Repercussion", "Spectrometer", 218000, false, "Proposed", 4360.0, "L2 Halo");

        SpaceProbeDTO probe478 = new SpaceProbeDTO("SP-478", "Quantum Network Aftermath", "Space", "ESA", 219000.0,
                LocalDateTime.of(3160, 5, 1, 10, 0), LocalDateTime.of(3170, 8, 1, 12, 0),
                "None", 109500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Aftermath", "Spectrometer", 219000, false, "Proposed", 4380.0, "L2 Halo");

        SpaceProbeDTO probe479 = new SpaceProbeDTO("SP-479", "Quantum Network Legacy", "Space", "NASA", 219500.0,
                LocalDateTime.of(3165, 5, 1, 10, 0), LocalDateTime.of(3175, 8, 1, 12, 0),
                "None", 109750.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Legacy", "Spectrometer", 219500, false, "Proposed", 4390.0, "L2 Halo");

        SpaceProbeDTO probe480 = new SpaceProbeDTO("SP-480", "Quantum Network Heritage", "Space", "ESA", 220000.0,
                LocalDateTime.of(3170, 5, 1, 10, 0), LocalDateTime.of(3180, 8, 1, 12, 0),
                "None", 110000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Heritage", "Spectrometer", 220000, false, "Proposed", 4400.0, "L2 Halo");

        SpaceProbeDTO probe481 = new SpaceProbeDTO("SP-481", "Quantum Network Tradition", "Space", "NASA", 221000.0,
                LocalDateTime.of(3175, 5, 1, 10, 0), LocalDateTime.of(3185, 8, 1, 12, 0),
                "None", 110500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Tradition", "Spectrometer", 221000, false, "Proposed", 4420.0, "L2 Halo");

        SpaceProbeDTO probe482 = new SpaceProbeDTO("SP-482", "Quantum Network Custom", "Space", "ESA", 222000.0,
                LocalDateTime.of(3180, 5, 1, 10, 0), LocalDateTime.of(3190, 8, 1, 12, 0),
                "None", 111000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Custom", "Spectrometer", 222000, false, "Proposed", 4440.0, "L2 Halo");

        SpaceProbeDTO probe483 = new SpaceProbeDTO("SP-483", "Quantum Network Practice", "Space", "NASA", 223000.0,
                LocalDateTime.of(3185, 5, 1, 10, 0), LocalDateTime.of(3195, 8, 1, 12, 0),
                "None", 111500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Practice", "Spectrometer", 223000, false, "Proposed", 4460.0, "L2 Halo");

        SpaceProbeDTO probe484 = new SpaceProbeDTO("SP-484", "Quantum Network Routine", "Space", "ESA", 224000.0,
                LocalDateTime.of(3190, 5, 1, 10, 0), LocalDateTime.of(3200, 8, 1, 12, 0),
                "None", 112000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Routine", "Spectrometer", 224000, false, "Proposed", 4480.0, "L2 Halo");

        SpaceProbeDTO probe485 = new SpaceProbeDTO("SP-485", "Quantum Network Habit", "Space", "NASA", 225000.0,
                LocalDateTime.of(3195, 5, 1, 10, 0), LocalDateTime.of(3205, 8, 1, 12, 0),
                "None", 112500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Habit", "Spectrometer", 225000, false, "Proposed", 4500.0, "L2 Halo");

        SpaceProbeDTO probe486 = new SpaceProbeDTO("SP-486", "Quantum Network Pattern", "Space", "ESA", 226000.0,
                LocalDateTime.of(3200, 5, 1, 10, 0), LocalDateTime.of(3210, 8, 1, 12, 0),
                "None", 113000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Pattern", "Spectrometer", 226000, false, "Proposed", 4520.0, "L2 Halo");

        SpaceProbeDTO probe487 = new SpaceProbeDTO("SP-487", "Quantum Network Model", "Space", "NASA", 227000.0,
                LocalDateTime.of(3205, 5, 1, 10, 0), LocalDateTime.of(3215, 8, 1, 12, 0),
                "None", 113500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Model", "Spectrometer", 227000, false, "Proposed", 4540.0, "L2 Halo");

        SpaceProbeDTO probe488 = new SpaceProbeDTO("SP-488", "Quantum Network Framework", "Space", "ESA", 228000.0,
                LocalDateTime.of(3210, 5, 1, 10, 0), LocalDateTime.of(3220, 8, 1, 12, 0),
                "None", 114000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Framework", "Spectrometer", 228000, false, "Proposed", 4560.0, "L2 Halo");

        SpaceProbeDTO probe489 = new SpaceProbeDTO("SP-489", "Quantum Network Structure", "Space", "NASA", 229000.0,
                LocalDateTime.of(3215, 5, 1, 10, 0), LocalDateTime.of(3225, 8, 1, 12, 0),
                "None", 114500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Structure", "Spectrometer", 229000, false, "Proposed", 4580.0, "L2 Halo");

        SpaceProbeDTO probe490 = new SpaceProbeDTO("SP-490", "Quantum Network Architecture", "Space", "ESA", 230000.0,
                LocalDateTime.of(3220, 5, 1, 10, 0), LocalDateTime.of(3230, 8, 1, 12, 0),
                "None", 115000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Architecture", "Spectrometer", 230000, false, "Proposed", 4600.0, "L2 Halo");

        SpaceProbeDTO probe491 = new SpaceProbeDTO("SP-491", "Quantum Network Design", "Space", "NASA", 231000.0,
                LocalDateTime.of(3225, 5, 1, 10, 0), LocalDateTime.of(3235, 8, 1, 12, 0),
                "None", 115500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Design", "Spectrometer", 231000, false, "Proposed", 4620.0, "L2 Halo");

        SpaceProbeDTO probe492 = new SpaceProbeDTO("SP-492", "Quantum Network Blueprint", "Space", "ESA", 232000.0,
                LocalDateTime.of(3230, 5, 1, 10, 0), LocalDateTime.of(3240, 8, 1, 12, 0),
                "None", 116000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Blueprint", "Spectrometer", 232000, false, "Proposed", 4640.0, "L2 Halo");

        SpaceProbeDTO probe493 = new SpaceProbeDTO("SP-493", "Quantum Network Plan", "Space", "NASA", 233000.0,
                LocalDateTime.of(3235, 5, 1, 10, 0), LocalDateTime.of(3245, 8, 1, 12, 0),
                "None", 116500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Plan", "Spectrometer", 233000, false, "Proposed", 4660.0, "L2 Halo");

        SpaceProbeDTO probe494 = new SpaceProbeDTO("SP-494", "Quantum Network Strategy", "Space", "ESA", 234000.0,
                LocalDateTime.of(3240, 5, 1, 10, 0), LocalDateTime.of(3250, 8, 1, 12, 0),
                "None", 117000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Strategy", "Spectrometer", 234000, false, "Proposed", 4680.0, "L2 Halo");

        SpaceProbeDTO probe495 = new SpaceProbeDTO("SP-495", "Quantum Network Tactic", "Space", "NASA", 235000.0,
                LocalDateTime.of(3245, 5, 1, 10, 0), LocalDateTime.of(3255, 8, 1, 12, 0),
                "None", 117500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Tactic", "Spectrometer", 235000, false, "Proposed", 4700.0, "L2 Halo");

        SpaceProbeDTO probe496 = new SpaceProbeDTO("SP-496", "Quantum Network Method", "Space", "ESA", 236000.0,
                LocalDateTime.of(3250, 5, 1, 10, 0), LocalDateTime.of(3260, 8, 1, 12, 0),
                "None", 118000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Method", "Spectrometer", 236000, false, "Proposed", 4720.0, "L2 Halo");

        SpaceProbeDTO probe497 = new SpaceProbeDTO("SP-497", "Quantum Network Technique", "Space", "NASA", 237000.0,
                LocalDateTime.of(3255, 5, 1, 10, 0), LocalDateTime.of(3265, 8, 1, 12, 0),
                "None", 118500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Technique", "Spectrometer", 237000, false, "Proposed", 4740.0, "L2 Halo");

        SpaceProbeDTO probe498 = new SpaceProbeDTO("SP-498", "Quantum Network Approach", "Space", "ESA", 238000.0,
                LocalDateTime.of(3260, 5, 1, 10, 0), LocalDateTime.of(3270, 8, 1, 12, 0),
                "None", 119000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Approach", "Spectrometer", 238000, false, "Proposed", 4760.0, "L2 Halo");

        SpaceProbeDTO probe499 = new SpaceProbeDTO("SP-499", "Quantum Network Solution", "Space", "NASA", 239000.0,
                LocalDateTime.of(3265, 5, 1, 10, 0), LocalDateTime.of(3275, 8, 1, 12, 0),
                "None", 119500.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Solution", "Spectrometer", 239000, false, "Proposed", 4780.0, "L2 Halo");

        SpaceProbeDTO probe500 = new SpaceProbeDTO("SP-500", "Quantum Network Answer", "Space", "ESA", 240000.0,
                LocalDateTime.of(3270, 5, 1, 10, 0), LocalDateTime.of(3280, 8, 1, 12, 0),
                "None", 120000.0, "Ka-Band", 1500000000.0, 0.2, "Quantum Answer", "Spectrometer", 240000, false, "Proposed", 4800.0, "L2 Halo");

        List<SpaceProbeDTO> spaceProbes = new ArrayList<>();
        spaceProbes.add(probe1);
        spaceProbes.add(probe2);
        spaceProbes.add(probe3);
        spaceProbes.add(probe4);
        spaceProbes.add(probe5);
        spaceProbes.add(probe6);
        spaceProbes.add(probe7);
        spaceProbes.add(probe8);
        spaceProbes.add(probe9);
        spaceProbes.add(probe10);
        spaceProbes.add(probe11);
        spaceProbes.add(probe12);
        spaceProbes.add(probe13);
        spaceProbes.add(probe14);
        spaceProbes.add(probe15);
        spaceProbes.add(probe16);
        spaceProbes.add(probe17);
        spaceProbes.add(probe18);
        spaceProbes.add(probe19);
        spaceProbes.add(probe20);
        spaceProbes.add(probe21);
        spaceProbes.add(probe22);
        spaceProbes.add(probe23);
        spaceProbes.add(probe24);
        spaceProbes.add(probe25);
        spaceProbes.add(probe26);
        spaceProbes.add(probe27);
        spaceProbes.add(probe28);
        spaceProbes.add(probe29);
        spaceProbes.add(probe30);
        spaceProbes.add(probe31);
        spaceProbes.add(probe32);
        spaceProbes.add(probe33);
        spaceProbes.add(probe34);
        spaceProbes.add(probe35);
        spaceProbes.add(probe36);
        spaceProbes.add(probe37);
        spaceProbes.add(probe38);
        spaceProbes.add(probe39);
        spaceProbes.add(probe40);
        spaceProbes.add(probe41);
        spaceProbes.add(probe42);
        spaceProbes.add(probe43);
        spaceProbes.add(probe44);
        spaceProbes.add(probe45);
        spaceProbes.add(probe46);
        spaceProbes.add(probe47);
        spaceProbes.add(probe48);
        spaceProbes.add(probe49);
        spaceProbes.add(probe50);
        spaceProbes.add(probe51);
        spaceProbes.add(probe52);
        spaceProbes.add(probe53);
        spaceProbes.add(probe54);
        spaceProbes.add(probe55);
        spaceProbes.add(probe56);
        spaceProbes.add(probe57);
        spaceProbes.add(probe58);
        spaceProbes.add(probe59);
        spaceProbes.add(probe60);
        spaceProbes.add(probe61);
        spaceProbes.add(probe62);
        spaceProbes.add(probe63);
        spaceProbes.add(probe64);
        spaceProbes.add(probe65);
        spaceProbes.add(probe66);
        spaceProbes.add(probe67);
        spaceProbes.add(probe68);
        spaceProbes.add(probe69);
        spaceProbes.add(probe70);
        spaceProbes.add(probe71);
        spaceProbes.add(probe72);
        spaceProbes.add(probe73);
        spaceProbes.add(probe74);
        spaceProbes.add(probe75);
        spaceProbes.add(probe76);
        spaceProbes.add(probe77);
        spaceProbes.add(probe78);
        spaceProbes.add(probe79);
        spaceProbes.add(probe80);
        spaceProbes.add(probe81);
        spaceProbes.add(probe82);
        spaceProbes.add(probe83);
        spaceProbes.add(probe84);
        spaceProbes.add(probe85);
        spaceProbes.add(probe86);
        spaceProbes.add(probe87);
        spaceProbes.add(probe88);
        spaceProbes.add(probe89);
        spaceProbes.add(probe90);
        spaceProbes.add(probe91);
        spaceProbes.add(probe92);
        spaceProbes.add(probe93);
        spaceProbes.add(probe94);
        spaceProbes.add(probe95);
        spaceProbes.add(probe96);
        spaceProbes.add(probe97);
        spaceProbes.add(probe98);
        spaceProbes.add(probe99);
        spaceProbes.add(probe100);
        spaceProbes.add(probe101);
        spaceProbes.add(probe102);
        spaceProbes.add(probe103);
        spaceProbes.add(probe104);
        spaceProbes.add(probe105);
        spaceProbes.add(probe106);
        spaceProbes.add(probe107);
        spaceProbes.add(probe108);
        spaceProbes.add(probe109);
        spaceProbes.add(probe110);
        spaceProbes.add(probe111);
        spaceProbes.add(probe112);
        spaceProbes.add(probe113);
        spaceProbes.add(probe114);
        spaceProbes.add(probe115);
        spaceProbes.add(probe116);
        spaceProbes.add(probe117);
        spaceProbes.add(probe118);
        spaceProbes.add(probe119);
        spaceProbes.add(probe120);
        spaceProbes.add(probe121);
        spaceProbes.add(probe122);
        spaceProbes.add(probe123);
        spaceProbes.add(probe124);
        spaceProbes.add(probe125);
        spaceProbes.add(probe126);
        spaceProbes.add(probe127);
        spaceProbes.add(probe128);
        spaceProbes.add(probe129);
        spaceProbes.add(probe130);
        spaceProbes.add(probe131);
        spaceProbes.add(probe132);
        spaceProbes.add(probe133);
        spaceProbes.add(probe134);
        spaceProbes.add(probe135);
        spaceProbes.add(probe136);
        spaceProbes.add(probe137);
        spaceProbes.add(probe138);
        spaceProbes.add(probe139);
        spaceProbes.add(probe140);
        spaceProbes.add(probe141);
        spaceProbes.add(probe142);
        spaceProbes.add(probe143);
        spaceProbes.add(probe144);
        spaceProbes.add(probe145);
        spaceProbes.add(probe146);
        spaceProbes.add(probe147);
        spaceProbes.add(probe148);
        spaceProbes.add(probe149);
        spaceProbes.add(probe150);
        spaceProbes.add(probe151);
        spaceProbes.add(probe152);
        spaceProbes.add(probe153);
        spaceProbes.add(probe154);
        spaceProbes.add(probe155);
        spaceProbes.add(probe156);
        spaceProbes.add(probe157);
        spaceProbes.add(probe158);
        spaceProbes.add(probe159);
        spaceProbes.add(probe160);
        spaceProbes.add(probe161);
        spaceProbes.add(probe162);
        spaceProbes.add(probe163);
        spaceProbes.add(probe164);
        spaceProbes.add(probe165);
        spaceProbes.add(probe166);
        spaceProbes.add(probe167);
        spaceProbes.add(probe168);
        spaceProbes.add(probe169);
        spaceProbes.add(probe170);
        spaceProbes.add(probe171);
        spaceProbes.add(probe172);
        spaceProbes.add(probe173);
        spaceProbes.add(probe174);
        spaceProbes.add(probe175);
        spaceProbes.add(probe176);
        spaceProbes.add(probe177);
        spaceProbes.add(probe178);
        spaceProbes.add(probe179);
        spaceProbes.add(probe180);
        spaceProbes.add(probe181);
        spaceProbes.add(probe182);
        spaceProbes.add(probe183);
        spaceProbes.add(probe184);
        spaceProbes.add(probe185);
        spaceProbes.add(probe186);
        spaceProbes.add(probe187);
        spaceProbes.add(probe188);
        spaceProbes.add(probe189);
        spaceProbes.add(probe190);
        spaceProbes.add(probe191);
        spaceProbes.add(probe192);
        spaceProbes.add(probe193);
        spaceProbes.add(probe194);
        spaceProbes.add(probe195);
        spaceProbes.add(probe196);
        spaceProbes.add(probe197);
        spaceProbes.add(probe198);
        spaceProbes.add(probe199);
        spaceProbes.add(probe200);
        spaceProbes.add(probe201);
        spaceProbes.add(probe202);
        spaceProbes.add(probe203);
        spaceProbes.add(probe204);
        spaceProbes.add(probe205);
        spaceProbes.add(probe206);
        spaceProbes.add(probe207);
        spaceProbes.add(probe208);
        spaceProbes.add(probe209);
        spaceProbes.add(probe210);
        spaceProbes.add(probe211);
        spaceProbes.add(probe212);
        spaceProbes.add(probe213);
        spaceProbes.add(probe214);
        spaceProbes.add(probe215);
        spaceProbes.add(probe216);
        spaceProbes.add(probe217);
        spaceProbes.add(probe218);
        spaceProbes.add(probe219);
        spaceProbes.add(probe220);
        spaceProbes.add(probe221);
        spaceProbes.add(probe222);
        spaceProbes.add(probe223);
        spaceProbes.add(probe224);
        spaceProbes.add(probe225);
        spaceProbes.add(probe226);
        spaceProbes.add(probe227);
        spaceProbes.add(probe228);
        spaceProbes.add(probe229);
        spaceProbes.add(probe230);
        spaceProbes.add(probe231);
        spaceProbes.add(probe232);
        spaceProbes.add(probe233);
        spaceProbes.add(probe234);
        spaceProbes.add(probe235);
        spaceProbes.add(probe236);
        spaceProbes.add(probe237);
        spaceProbes.add(probe238);
        spaceProbes.add(probe239);
        spaceProbes.add(probe240);
        spaceProbes.add(probe241);
        spaceProbes.add(probe242);
        spaceProbes.add(probe243);
        spaceProbes.add(probe244);
        spaceProbes.add(probe245);
        spaceProbes.add(probe246);
        spaceProbes.add(probe247);
        spaceProbes.add(probe248);
        spaceProbes.add(probe249);
        spaceProbes.add(probe250);
        spaceProbes.add(probe251);
        spaceProbes.add(probe252);
        spaceProbes.add(probe253);
        spaceProbes.add(probe254);
        spaceProbes.add(probe255);
        spaceProbes.add(probe256);
        spaceProbes.add(probe257);
        spaceProbes.add(probe258);
        spaceProbes.add(probe259);
        spaceProbes.add(probe260);
        spaceProbes.add(probe261);
        spaceProbes.add(probe262);
        spaceProbes.add(probe263);
        spaceProbes.add(probe264);
        spaceProbes.add(probe265);
        spaceProbes.add(probe266);
        spaceProbes.add(probe267);
        spaceProbes.add(probe268);
        spaceProbes.add(probe269);
        spaceProbes.add(probe270);
        spaceProbes.add(probe271);
        spaceProbes.add(probe272);
        spaceProbes.add(probe273);
        spaceProbes.add(probe274);
        spaceProbes.add(probe275);
        spaceProbes.add(probe276);
        spaceProbes.add(probe277);
        spaceProbes.add(probe278);
        spaceProbes.add(probe279);
        spaceProbes.add(probe280);
        spaceProbes.add(probe281);
        spaceProbes.add(probe282);
        spaceProbes.add(probe283);
        spaceProbes.add(probe284);
        spaceProbes.add(probe285);
        spaceProbes.add(probe286);
        spaceProbes.add(probe287);
        spaceProbes.add(probe288);
        spaceProbes.add(probe289);
        spaceProbes.add(probe290);
        spaceProbes.add(probe291);
        spaceProbes.add(probe292);
        spaceProbes.add(probe293);
        spaceProbes.add(probe294);
        spaceProbes.add(probe295);
        spaceProbes.add(probe296);
        spaceProbes.add(probe297);
        spaceProbes.add(probe298);
        spaceProbes.add(probe299);
        spaceProbes.add(probe300);
        spaceProbes.add(probe301);
        spaceProbes.add(probe302);
        spaceProbes.add(probe303);
        spaceProbes.add(probe304);
        spaceProbes.add(probe305);
        spaceProbes.add(probe306);
        spaceProbes.add(probe307);
        spaceProbes.add(probe308);
        spaceProbes.add(probe309);
        spaceProbes.add(probe310);
        spaceProbes.add(probe311);
        spaceProbes.add(probe312);
        spaceProbes.add(probe313);
        spaceProbes.add(probe314);
        spaceProbes.add(probe315);
        spaceProbes.add(probe316);
        spaceProbes.add(probe317);
        spaceProbes.add(probe318);
        spaceProbes.add(probe319);
        spaceProbes.add(probe320);
        spaceProbes.add(probe321);
        spaceProbes.add(probe322);
        spaceProbes.add(probe323);
        spaceProbes.add(probe324);
        spaceProbes.add(probe325);
        spaceProbes.add(probe326);
        spaceProbes.add(probe327);
        spaceProbes.add(probe328);
        spaceProbes.add(probe329);
        spaceProbes.add(probe330);
        spaceProbes.add(probe331);
        spaceProbes.add(probe332);
        spaceProbes.add(probe333);
        spaceProbes.add(probe334);
        spaceProbes.add(probe335);
        spaceProbes.add(probe336);
        spaceProbes.add(probe337);
        spaceProbes.add(probe338);
        spaceProbes.add(probe339);
        spaceProbes.add(probe340);
        spaceProbes.add(probe341);
        spaceProbes.add(probe342);
        spaceProbes.add(probe343);
        spaceProbes.add(probe344);
        spaceProbes.add(probe345);
        spaceProbes.add(probe346);
        spaceProbes.add(probe347);
        spaceProbes.add(probe348);
        spaceProbes.add(probe349);
        spaceProbes.add(probe350);
        spaceProbes.add(probe351);
        spaceProbes.add(probe352);
        spaceProbes.add(probe353);
        spaceProbes.add(probe354);
        spaceProbes.add(probe355);
        spaceProbes.add(probe356);
        spaceProbes.add(probe357);
        spaceProbes.add(probe358);
        spaceProbes.add(probe359);
        spaceProbes.add(probe360);
        spaceProbes.add(probe361);
        spaceProbes.add(probe362);
        spaceProbes.add(probe363);
        spaceProbes.add(probe364);
        spaceProbes.add(probe365);
        spaceProbes.add(probe366);
        spaceProbes.add(probe367);
        spaceProbes.add(probe368);
        spaceProbes.add(probe369);
        spaceProbes.add(probe370);
        spaceProbes.add(probe371);
        spaceProbes.add(probe372);
        spaceProbes.add(probe373);
        spaceProbes.add(probe374);
        spaceProbes.add(probe375);
        spaceProbes.add(probe376);
        spaceProbes.add(probe377);
        spaceProbes.add(probe378);
        spaceProbes.add(probe379);
        spaceProbes.add(probe380);
        spaceProbes.add(probe381);
        spaceProbes.add(probe382);
        spaceProbes.add(probe383);
        spaceProbes.add(probe384);
        spaceProbes.add(probe385);
        spaceProbes.add(probe386);
        spaceProbes.add(probe387);
        spaceProbes.add(probe388);
        spaceProbes.add(probe389);
        spaceProbes.add(probe390);
        spaceProbes.add(probe391);
        spaceProbes.add(probe392);
        spaceProbes.add(probe393);
        spaceProbes.add(probe394);
        spaceProbes.add(probe395);
        spaceProbes.add(probe396);
        spaceProbes.add(probe397);
        spaceProbes.add(probe398);
        spaceProbes.add(probe399);
        spaceProbes.add(probe400);
        spaceProbes.add(probe401);
        spaceProbes.add(probe402);
        spaceProbes.add(probe403);
        spaceProbes.add(probe404);
        spaceProbes.add(probe405);
        spaceProbes.add(probe406);
        spaceProbes.add(probe407);
        spaceProbes.add(probe408);
        spaceProbes.add(probe409);
        spaceProbes.add(probe410);
        spaceProbes.add(probe411);
        spaceProbes.add(probe412);
        spaceProbes.add(probe413);
        spaceProbes.add(probe414);
        spaceProbes.add(probe415);
        spaceProbes.add(probe416);
        spaceProbes.add(probe417);
        spaceProbes.add(probe418);
        spaceProbes.add(probe419);
        spaceProbes.add(probe420);
        spaceProbes.add(probe421);
        spaceProbes.add(probe422);
        spaceProbes.add(probe423);
        spaceProbes.add(probe424);
        spaceProbes.add(probe425);
        spaceProbes.add(probe426);
        spaceProbes.add(probe427);
        spaceProbes.add(probe428);
        spaceProbes.add(probe429);
        spaceProbes.add(probe430);
        spaceProbes.add(probe431);
        spaceProbes.add(probe432);
        spaceProbes.add(probe433);
        spaceProbes.add(probe434);
        spaceProbes.add(probe435);
        spaceProbes.add(probe436);
        spaceProbes.add(probe437);
        spaceProbes.add(probe438);
        spaceProbes.add(probe439);
        spaceProbes.add(probe440);
        spaceProbes.add(probe441);
        spaceProbes.add(probe442);
        spaceProbes.add(probe443);
        spaceProbes.add(probe444);
        spaceProbes.add(probe445);
        spaceProbes.add(probe446);
        spaceProbes.add(probe447);
        spaceProbes.add(probe448);
        spaceProbes.add(probe449);
        spaceProbes.add(probe450);
        spaceProbes.add(probe451);
        spaceProbes.add(probe452);
        spaceProbes.add(probe453);
        spaceProbes.add(probe454);
        spaceProbes.add(probe455);
        spaceProbes.add(probe456);
        spaceProbes.add(probe457);
        spaceProbes.add(probe458);
        spaceProbes.add(probe459);
        spaceProbes.add(probe460);
        spaceProbes.add(probe461);
        spaceProbes.add(probe462);
        spaceProbes.add(probe463);
        spaceProbes.add(probe464);
        spaceProbes.add(probe465);
        spaceProbes.add(probe466);
        spaceProbes.add(probe467);
        spaceProbes.add(probe468);
        spaceProbes.add(probe469);
        spaceProbes.add(probe470);
        spaceProbes.add(probe471);
        spaceProbes.add(probe472);
        spaceProbes.add(probe473);
        spaceProbes.add(probe474);
        spaceProbes.add(probe475);
        spaceProbes.add(probe476);
        spaceProbes.add(probe477);
        spaceProbes.add(probe478);
        spaceProbes.add(probe479);
        spaceProbes.add(probe480);
        spaceProbes.add(probe481);
        spaceProbes.add(probe482);
        spaceProbes.add(probe483);
        spaceProbes.add(probe484);
        spaceProbes.add(probe485);
        spaceProbes.add(probe486);
        spaceProbes.add(probe487);
        spaceProbes.add(probe488);
        spaceProbes.add(probe489);
        spaceProbes.add(probe490);
        spaceProbes.add(probe491);
        spaceProbes.add(probe492);
        spaceProbes.add(probe493);
        spaceProbes.add(probe494);
        spaceProbes.add(probe495);
        spaceProbes.add(probe496);
        spaceProbes.add(probe497);
        spaceProbes.add(probe498);
        spaceProbes.add(probe499);
        spaceProbes.add(probe500);

        System.out.println("Total Space Probes: " + spaceProbes.size());
        for (SpaceProbeDTO probe : spaceProbes) {
            System.out.println(probe);
        }
    }

}
