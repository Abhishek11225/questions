class Solution {
    public String convert(String s, int numRows) {
          if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        // Har row ke liye StringBuilder
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        boolean down = true;

        for (int i = 0; i < s.length(); i++) {

            // Character ko current row mein daalo
            rows[row].append(s.charAt(i));

            // Direction change
            if (row == numRows - 1) {
                down = false;
            }
            else if (row == 0) {
                down = true;
            }

            // Next row
            if (down) {
                row++;
            } else {
                row--;
            }
        }

        // Sab rows ko combine karo
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            ans.append(rows[i]);
        }

        return ans.toString();
    
}
}