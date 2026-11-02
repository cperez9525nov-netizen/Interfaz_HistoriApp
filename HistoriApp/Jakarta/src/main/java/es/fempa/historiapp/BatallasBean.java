package es.fempa.historiapp;

import jakarta.inject.Named;
import jakarta.enterprise.context.ApplicationScoped; 
import jakarta.annotation.PostConstruct;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ApplicationScoped
public class BatallasBean implements java.io.Serializable {

    // Lista global de batallas
    private List<Batallas> listaBatallas;

    // Constructores + PostConstruct

    public BatallasBean() {
    }

    @PostConstruct
    public void init() {

        listaBatallas = new ArrayList<>();

        listaBatallas.add(new Batallas("Batalla de Cannas", "Romanos contra Cartagineses","Fue una de las derrotas más grandes de la historia de Roma frente al general cartaginés Aníbal Barca durante la segunda guerra púnica.", "216 a.C."));
        listaBatallas.add(new Batallas("Batalla del Metauro", "Romanos contra Cartagineses", "Los romanos, liderados por Cayo Claudio Nerón y Marco Livio Salinator, derrotaron a Asdrúbal Barca, hermano de Aníbal, en la segunda guerra púnica.", "207 a.C."));
        listaBatallas.add(new Batallas("Batalla de Ilipa", "Romanos contra Cartagineses", "Liderada por Escipión el Africano, supuso la pérdida definitiva de Hispania para Cartago.", "206 a.C."));
        listaBatallas.add(new Batallas("Batalla de Farsalia", "Julio César contra Pompeyo", "Julio César derrotó de forma aplastante a Cneo Pompeyo Magno, marcando el principio del fin de la República.", "48 a.C."));
        listaBatallas.add(new Batallas("Batalla de Actium", "Octavio contra Marco Antonio y Cleopatra", "Enfrentamiento naval en el mar Jónico, frente al golo de Ambracia, el cuál fuedecisivo, donde Octavio derrotó a Marco Antonio y Cleopatra, consolidando su poder y marcando el inicio del Imperio Romano.", "31 a.C."));
        listaBatallas.add(new Batallas("Batalla del Puente Milvio", "Constantino I contra Majencio", "Enfrentamiento decisivo donde Constantino I derrotó a Majencio. Marcó el inicio del fin de la Tetrarquía y abrió el camino hacia la adopción del cristianismo en el Imperio.", "312 d.C."));
        listaBatallas.add(new Batallas("Batalla de Tiatira", "Emperador Valente contra Procopio", "El emperador romano de Oriente, Valente, derrotó a las fuerzas del usurpador Procopio, poniendo fin a su rebelión en Lidia.", "366 d.C."));
        listaBatallas.add(new Batallas("Batalla de Solicinium", "Romanos contra Germanos", "Victoria romana bajo el mando de Valentiniano I frente a los alamanes tras sufrir intensas bajas en un asalto frontal.", "367 d.C."));
        listaBatallas.add(new Batallas("Batalla de los Sauces", "Romanos contra Godos", "Combate sangriento e indeciso en la diócesis de Tracia entre el ejército romano y los godos alzados en armas.", "377 d.C."));
        listaBatallas.add(new Batallas("Batalla de Adrianópolis", "Romanos contra Godos", "Derrota cataclísmica romana donde murió el propio emperador Valente. Marcó el inicio de la presión bárbara irrefrenable dentro de las fronteras imperiales.", "378 d.C."));
        listaBatallas.add(new Batallas("Batalla de los Campos Cataláunicos", "Romanos y Visigodos contra Atila", "La alianza entre Flavio Aecio y el rey visigodo Teodorico I detuvo la invasión de Atila el Huno en la Galia.", "451 d.C."));
        listaBatallas.add(new Batallas("Saqueo de Roma", "Vándalos atacan Roma", "Segundo gran saqueo de la capital imperial. Los vándalos de Genserico saquearon de forma metódica las riquezas de la ciudad durante catorce días.", "455 d.C."));
        listaBatallas.add(new Batallas("Caída de Ravena", "Fin del Imperio Romano de Occidente", "Odoacro depuso al joven emperador Rómulo Augústulo en Ravena. Este acontecimiento marca tradicionalmente el fin de la Edad Antigua y el comienzo de la Edad Media.", "476 d.C."));
        
    }

    // Getters y Setters
    public List<Batallas> getListaBatallas() {
        return listaBatallas;
    }

    public void setListaBatallas(List<Batallas> listaBatallas) {
        this.listaBatallas = listaBatallas;
    }

}
