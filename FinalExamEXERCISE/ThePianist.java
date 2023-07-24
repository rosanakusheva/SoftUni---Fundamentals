import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPieces = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> piecesMap = new LinkedHashMap<>();

        for (int i = 1; i <= numPieces; i++) {
            String pieceData = scanner.nextLine();

            String pieceName = pieceData.split("\\|")[0];
            String composer = pieceData.split("\\|")[1];
            String key = pieceData.split("\\|")[2];

            List<String> piecesInfo = new ArrayList<>();
            piecesInfo.add(composer);
            piecesInfo.add(key);

            piecesMap.put(pieceName, piecesInfo);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {

            if (command.contains("Add")) {
                String pieceName = command.split("\\|")[1];
                String composer = command.split("\\|")[2];
                String key = command.split("\\|")[3];

                if (piecesMap.containsKey(pieceName)) {
                    System.out.println(pieceName + " is already in the collection!");
                } else {
                    List<String> piecesInfo = new ArrayList<>();
                    piecesInfo.add(composer);
                    piecesInfo.add(key);

                    piecesMap.put(pieceName, piecesInfo);
                    System.out.printf("%s by %s in %s added to the collection!%n", pieceName, composer, key);
                }
            } else if (command.contains("Remove")) {
                String pieceToRemove = command.split("\\|")[1];
                if (piecesMap.containsKey(pieceToRemove)) {
                    piecesMap.remove(pieceToRemove);
                    System.out.printf("Successfully removed %s!%n", pieceToRemove);

                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceToRemove);
                }

            } else if (command.contains("ChangeKey")) {
                String piece = command.split("\\|")[1];
                String newKey = command.split("\\|")[2];

                if (!piecesMap.containsKey(piece)) {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                } else {
                    List<String> pieceInfo = piecesMap.get(piece);
                    pieceInfo.set(1, newKey);

                    piecesMap.put(piece, pieceInfo);
                    System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                }

            }
            command = scanner.nextLine();
        }
        piecesMap.entrySet().forEach(entry -> {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        });
    }
}
