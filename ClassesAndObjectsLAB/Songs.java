package ClassesAndObjectsLAB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Songs {
    static class Song {
        String listType;
        String name;
        String time;

        public Song(String listType, String name, String time) {
            this.listType = listType;
            this.name = name;
            this.time = time;

        }

        public String getName() {
            return this.name;
        }

        public String getListType() {
            return this.listType;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String[] inputSongsArr = input.split("_");
            String listTypeInput = inputSongsArr[0];
            String nameInput = inputSongsArr[1];
            String timeInput = inputSongsArr[2];

            Song currentSong = new Song(listTypeInput, nameInput, timeInput);

            songList.add(currentSong);

        }
        String command = scanner.nextLine();
        if (command.equals("all")) {
            for (Song item : songList) {
                System.out.println(item.getName());
            }
        } else {
            for (Song song : songList) {
                String currentListType = song.getListType();
                if (currentListType.equals(command)) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
