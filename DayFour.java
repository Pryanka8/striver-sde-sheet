// Greedy : Minimum number of platforms required for the trains to arrive and depart safely
// Given arrival and departure times of all trains that reach a railway station, find the minimum number

import java.util.Arrays;

class DayFour {
    public int minPlatform(int arr[], int dep[]) {
        // code here
        int platformOccupied = 1;
        int totalPlatform = 1;
        int latestDeparture = 0;

        // getting both arrays sorted to understand arrival dep as events occuring with
        // passing of time
        Arrays.sort(arr);
        Arrays.sort(dep);

        for (int i = 1; i < arr.length; i++) {

            while (dep[latestDeparture] < arr[i]) {
                latestDeparture++;
                platformOccupied--;
            }

            platformOccupied++;

            if (platformOccupied > totalPlatform) {
                totalPlatform++;
            }
        }
        return totalPlatform;
    }
}
