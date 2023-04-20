package fr.diginamic.automates;

public class Grid {
    public int width = GameOfLife.WIDTH;
    public int height = GameOfLife.HEIGHT;
    public boolean[][] grid;

    public Grid(int width, int height) {
        this.width = width;
        this.height = height;
        this.grid = new boolean[width][height];

        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                if(Math.random() < .5) grid[i][j] = true;
            }
        }
    }

    public int getNeighbors(final int x, final int y) {
        int count = 0;
        int i = x - 1;
        int j = y - 1;
        int maxI = x + 1;
        int maxJ = y + 1;

        if(x == 0) i = 0;
        else if(x == width - 1) maxI = 0;

        if(y == 0) j = 0;
        else if(y == height - 1) maxJ = 0;
        
        for(; i <= maxI; i++){
            for(int k = j;k <= maxJ; k++){
                if(x == i && y == k) continue;
                if(grid[i][k]) count++;
            }
        }

        return count; 
    }

    public boolean leaveOrDie(int x, boolean cellValue){
        if(cellValue){
            if(x < 2 || x >= 4) return false;
            return true;
        } else {
            if(x == 3) return true;
            return false;
        }
    }

}
