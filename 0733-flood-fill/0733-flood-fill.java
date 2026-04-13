class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       
        int originalColor = image[sr][sc];
        
        // If the starting pixel already has the target color
        if (originalColor == color) {
            return image;
        }
        
        dfs(image, sr, sc, originalColor, color);
        return image;
    }

    private void dfs(int[][] image, int r, int c, int originalColor, int newColor) {
        // Check boundaries
        if (r < 0 || r >= image.length || c < 0 || c >= image[0].length) {
            return;
        }
        
        // Stop if current pixel is not the original color
        if (image[r][c] != originalColor) {
            return;
        }
        
        // Change color
        image[r][c] = newColor;
        
        // Visit 4 neighbors
        dfs(image, r + 1, c, originalColor, newColor); // down
        dfs(image, r - 1, c, originalColor, newColor); // up
        dfs(image, r, c + 1, originalColor, newColor); // right
        dfs(image, r, c - 1, originalColor, newColor); // left
    }
}