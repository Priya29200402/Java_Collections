import os

output = '''package in.xworkz.iterator.runner;

import in.xworkz.iterator.dto.SpaceProbeDTO;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SpaceProbeRunnerNoLoop {
    private static final List<SpaceProbeDTO> SPACE_PROBES = new ArrayList<>();
    
    static {
'''

bodies = ['Jupiter', 'Saturn', 'Mars', 'Venus', 'Mercury', 'Moon', 'Europa', 'Titan', 'Enceladus', 'Neptune']
mfg = ['NASA', 'ESA', 'ISRO', 'CNSA', 'Roscosmos', 'SpaceX', 'Blue Origin', 'JAXA']
propulsion = ['Ion Drive', 'Chemical Rocket', 'Solar Sail', 'Nuclear', 'Plasma Thruster', 'Hybrid']
instruments = ['Spectrometer', 'Camera', 'Radar', 'Magnetometer', 'Particle Detector', 'Seismometer', 'Radiometer', 'Lidar', 'Gravimeter', 'Analyzer']
statuses = ['Active', 'Inactive', 'Dormant', 'Operational', 'Maintenance', 'Transmitting']

for i in range(1, 501):
    probe_id = 'SP-' + str(i).zfill(3)
    mission_name = 'Mission-' + str(i)
    body = bodies[(i-1) % len(bodies)]
    manufacturer = mfg[(i-1) % len(mfg)]
    launch_mass = 2500.0 + (i * 10.5)
    power_output = 5000.0 + (i * 15.75)
    comm_freq = 'X-Band-' + str(8400 + i) + 'MHz'
    distance = i * 1000000.0 + 50000000.0
    velocity = 15.5 + (i * 0.025)
    mission_days = 365 * ((i % 10) + 1)
    is_active = 'true' if (i % 3 != 0) else 'false'
    status = statuses[(i-1) % len(statuses)]
    fuel = 100.0 - (i * 0.15)
    trajectory = 'Path-' + str(i % 50) + '-Stable-Orbit'
    
    year = 2020 + (i // 100)
    month = ((i % 12) + 1)
    day = ((i % 28) + 1)
    
    output += f'        SPACE_PROBES.add(new SpaceProbeDTO("{probe_id}", "{mission_name}", "{body}", "{manufacturer}", {launch_mass}, LocalDateTime.of({year}, {month}, {day}, 10, 30), LocalDateTime.of({year+2}, {month}, {day}, 14, 45), "{propulsion[(i-1) % len(propulsion)]}", {power_output}, "{comm_freq}", {distance}, {velocity}, "{instruments[(i-1) % len(instruments)]}", "{instruments[i % len(instruments)]}", {mission_days}, {is_active}, "{status}", {fuel}, "{trajectory}"));\n'

output += '''
    }
    
    public static List<SpaceProbeDTO> getAllSpaceProbes() {
        return new ArrayList<>(SPACE_PROBES);
    }
    
    public static int getTotalProbes() {
        return SPACE_PROBES.size();
    }
    
    public static void main(String[] args) {
        System.out.println("========== Space Probe Inventory (No Loop) ==========");
        System.out.println("Total Space Probes Created: " + getTotalProbes());
        System.out.println();
        
        List<SpaceProbeDTO> probes = getAllSpaceProbes();
        
        System.out.println("--- First 5 Probes ---");
        for (int i = 0; i < 5 && i < probes.size(); i++) {
            System.out.println(probes.get(i));
        }
        
        System.out.println();
        System.out.println("--- Last 5 Probes ---");
        int size = probes.size();
        for (int i = size - 5; i < size; i++) {
            if (i >= 0) {
                System.out.println(probes.get(i));
            }
        }
        
        System.out.println();
        System.out.println("========== Summary ==========");
        System.out.println("ArrayList Implementation: " + probes.size() + " probes");
    }
}
'''

with open('src/in/xworkz/iterator/runner/SpaceProbeRunnerNoLoop.java', 'w', encoding='utf-8') as f:
    f.write(output)
print('File created successfully!')
