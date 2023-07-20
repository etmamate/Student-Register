public class Students {
    String name;
    float media;

    public Students() {
        // blank line
    }

    public Students(String name, float media) {
        this.name = name;
        this.media = media;
    }

    public String getNome() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    void ListAll() {
        System.out.println("\nNome: " + this.name);
        System.out.println("Media: " + this.media);
    }

    void Approved() {
        if (media >= 60) {
            System.out.println("\n Nome: " + this.name + "Approved");
        }
    }

    public void Disapproved() {
        if (media < 60) {
            System.out.println("\nNome: " + this.name + "Disapproved");
        }
    }
}
