public class Esquiador {
    // Designamos la posición de un esquiador en un momento dado
    private int x = 0;
    private int y = 0;


    public int downTheSlope(char[][] slopeMap, int right, int down) {
        x = 0;
        y = 0;
        int count = 0;
        int sizeY = slopeMap.length;
        int sizeX = slopeMap[0].length;
        while (y < sizeY) { // Mientras estemos en la montaña
            for (int i = 0; i < right; i++) {
                x = (x + 1) % sizeX;
                if (slopeMap[y][x] == '#') {
                    count++;
                }
            }
            for (int j = 0; j < down; j++) {
                y++;
                if (y >= sizeY) break;
                if (slopeMap[y][x] == '#') {
                    count++;
                }
            }
        }
        return count;
    }

    public int jumpTheSlope(char[][] slopeMap, int right, int down){
        x = 0;
        y = 0;
        int count = 0;
        int sizeY = slopeMap.length;
        int sizeX = slopeMap[0].length;
        while((y+down) < sizeY){
            x = (x+right)%sizeX;
            y +=down;
            if(slopeMap[y][x] == '#'){
                count++;
            }
            System.out.println("Hemos pisado (" + y + ", " + x + ")");
        }
        return count;
    }
}

