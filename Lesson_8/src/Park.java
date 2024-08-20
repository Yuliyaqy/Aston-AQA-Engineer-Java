
public class Park {
    public static void main(String[] args) {
        Park park = new Park(3);

        Park.Attraction attraction1 = park.new Attraction("Attraction 1", "9am-9pm", 10);
        park.addAttraction(attraction1);

        Park.Attraction attraction2 = park.new Attraction("Attraction 2", "8am-8pm", 9);
        park.addAttraction(attraction2);

        Park.Attraction attraction3 = park.new Attraction("Attraction 3", "10am-10pm", 11);
        park.addAttraction(attraction3);

        Park.Attraction attraction4 = park.new Attraction("Attraction 4", "11am-7pm", 7);
        park.addAttraction(attraction4);

        park.displayAttractions();
    }

    private Attraction[] attractions;
    private int countAttractions;

    public Park(int count) {
        attractions = new Attraction[count];
        countAttractions = 0;
    }

    public void addAttraction(Attraction attraction) {
        if (countAttractions < attractions.length) {
            attractions[countAttractions] = attraction;
            countAttractions++;
        } else {
            System.out.println("Нет возможности добавить еще один аттракцион");
        }
    }

    public void displayAttractions() {
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                System.out.println(attraction);
            }

        }
    }

    public class Attraction {
        String nameAttraction;
        String workTimeAttraction;
        int costAttraction;

        public Attraction(String nameAttraction, String workTimeAttraction, int costAttraction) {
            this.nameAttraction = nameAttraction;
            this.workTimeAttraction = workTimeAttraction;
            this.costAttraction = costAttraction;
        }

        @Override
        public String toString() {
            return String.format("Название атракциона: %s \t Время работы: %s \n Стоимость: %d", nameAttraction, workTimeAttraction, costAttraction);
        }

    }


}
