import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Solution {

    static Object[][] data = {
            {1, "Root", "Products", -1},
            {2, "Furniture", "Furniture", 1},
            {3, "Electronics", "Electronics, Gadgets", 1},
            {4, "Home Appliances", "Home, Appliances", 1},
            {5, "Major Appliances", "", 4},
            {6, "Minor Appliances", "", 4},
            {7, "Lawn & Garden", "Lawn, Garden", 4},
            {8, "Kitchen Appliances", "", 5},
            {9, "General Appliances", "", 5}
    };
    // Define a Category class to hold each category's information
    private static class Category {
        public int id;
        public String name;
        public Set<String> keywords;
        public int parentId;
        public int level;

        public Category(int id, String name, String keywords, int parentId) {
            this.id = id;
            this.name = name;
            this.keywords = new HashSet<String>(Arrays.asList(keywords.split(", ")));
            this.parentId = parentId;
            this.level = 0;
        }
    }

    public static void main(String[] args) {
        solution(1);
    }

    public static String[] solution(int categoryId) {
        Category[] categories = new Category[data.length];
        for (int i = 0; i < data.length; i++) {
            categories[i] = new Category((int)data[i][0], (String)data[i][1], (String)data[i][2], (int)data[i][3]);
        }

        // Assign levels to each category starting from the root
        Queue<Category> queue = new LinkedList<Category>();
        queue.offer(categories[0]);
        while (!queue.isEmpty()) {
            Category category = queue.poll();
            for (Category child : categories) {
                if (child.parentId == category.id) {
                    child.level = category.level + 1;
                    queue.offer(child);
                }
            }
        }


        Category category = categories[categoryId - 1];
        String[] results = new String[category.keywords.size() + 1];
        results[0] = Integer.toString(category.level);
        int i = 1;
        for (String keyword : category.keywords) {
            results[i] = keyword;
            i++;
        }
        return results;
    }

}

