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

    // Variable para que se tenga control sobre el siglo
    private String sigloSeleccionado = "III";

    // Lista global de batallas
    private List<Batallas> listaBatallas;

    // Constructores + PostConstruct

    public BatallasBean() {
    }

    @PostConstruct
    public void init() {

        listaBatallas = new ArrayList<>();

        listaBatallas.add(new Batallas("Batalla de Cannas", "Romanos contra Cartagineses","Fue una de las derrotas más grandes de la historia de Roma frente al general cartaginés Aníbal Barca durante la segunda guerra púnica.", "216 a.C.", 41.287753928564996, 16.152014065364252, "III a.C."));
        listaBatallas.add(new Batallas("Batalla del Metauro", "Romanos contra Cartagineses", "Los romanos, liderados por Cayo Claudio Nerón y Marco Livio Salinator, derrotaron a Asdrúbal Barca, hermano de Aníbal, en la segunda guerra púnica.", "207 a.C.", 43.745799859321714, 12.923835983387804, "III a.C."));
        listaBatallas.add(new Batallas("Batalla de Ilipa", "Romanos contra Cartagineses", "Liderada por Escipión el Africano, supuso la pérdida definitiva de Hispania para Cartago.", "206 a.C.", 37.52698621959929, -5.946813388758184, "III a.C."));
        listaBatallas.add(new Batallas("Batalla del Aoo", "Romanos contra Macedonios", "Las legiones romanas lideradas por Tito Quincio Flaminino derrotaron a Filipo V de Macedonia, marcando el inicio del dominio romano en Grecia.", "198 a.C.", 40.30224907786934, 20.077241938543278, "II a.C."));
        listaBatallas.add(new Batallas("Batalla de las Termópilas", "Romanos contra Cartagineses", "Victoria romana bajo el mando del Quinto Fabio Máximo frente a Aníbal, que se vio obligado a retirarse de la Península Itálica.", "191 a.C.", 38.800369993600484, 22.53434889277133, "II a.C."));
        listaBatallas.add(new Batallas("Guerras Celtíberas y Asedio de Numancia", "Romanos contra Celtíberos", "Serie de conflictos entre la República Romana y los pueblos celtíberos de Hispania que acaban con la ocupación de Numancia por la rendición de los celtíberos.", "133 a.C.", 41.81076630280414, -2.441906507979073, "II a.C."));
        listaBatallas.add(new Batallas("Guerra de Alesia", "Romanos contra Galos", "Enfrentamiento entre las fuerzas de Julio César y las tribus galas lideradas por Vercingétorix, que culminó con la victoria romana y la consolidación del control romano sobre la Galia.", "52 a.C.", 47.53705557960892, 4.504785185332769, "I a.C."));
        listaBatallas.add(new Batallas("Batalla de Farsalia", "Julio César contra Pompeyo", "Julio César derrotó de forma aplastante a Cneo Pompeyo Magno, marcando el principio del fin de la República.", "48 a.C.", 39.288860179110436, 22.38701973899544, "I a.C."));
        listaBatallas.add(new Batallas("Batalla de Actium", "Octavio contra Marco Antonio y Cleopatra", "Enfrentamiento naval en el mar Jónico, frente al golo de Ambracia, el cuál fuedecisivo, donde Octavio derrotó a Marco Antonio y Cleopatra, consolidando su poder y marcando el inicio del Imperio Romano.", "31 a.C.", 38.948551, 20.580256, "I a.C."));
        listaBatallas.add(new Batallas("Batalla del Bosque de Teutoburgo", "Germanos contra Romanos", "Derrota romana frente a las tribus germánicas lideradas por Arminio, que detuvo la expansión romana hacia el norte de Germania.", "9 d.C.", 52.41383939692664, 8.098927628068706, "I d.C."));
        listaBatallas.add(new Batallas("Batalla del río Medway", "Romanos contra Britanos", "Victoria romana bajo el mando de Cneo Julio Agrícola frente a las tribus britanas, consolidando el control romano sobre Britania.", "43 d.C.", 51.3804059618426, 0.48573871121084145, "I d.C."));
        listaBatallas.add(new Batallas("Sitio de Jerusalén", "Romanos contra Judíos", "El general romano Tito sitió y destruyó Jerusalén, poniendo fin a la Primera Guerra Judeo-Romana y marcando el inicio de la diáspora judía.", "70 d.C.", 31.781409002187132, 35.238870805280975, "I d.C."));
        listaBatallas.add(new Batallas("Segunda Batalla de Tapae", "Romanos contra Dacios", "Victoria romana bajo el mando del Domicio Ulpio Trajano frente a los dacios, consolidando el control romano sobre la región y allanando el camino para la conquista de Dacia.", "101 d.C.", 45.49854510908365, 22.356649958750076, "II d.C."));
        listaBatallas.add(new Batallas("El Milagro de la Lluvia", "Romanos contra Sármatas", "Durante la batalla, una repentina tormenta de lluvia y granizo ayudó a los romanos a derrotar a los sármatas, lo que fue interpretado como un milagro por los soldados romanos.", "173 d.C.", 48.59888347552075, 18.941249236103868, "II d.C."));
        listaBatallas.add(new Batallas("Campañas en el Frente del Danubio", "Romanos contra Marcomanos y Quados", "Serie de conflictos entre el Imperio Romano y las tribus germánicas de los Marcomanos y Quados, que culminaron con la victoria romana y la consolidación del control romano sobre la región del Danubio.", "170 d.C.", 48.43012478910879, 13.880767657287832, "II d.C."));
        listaBatallas.add(new Batallas("Batalla de Abrito", "Romanos contra Godos", "Fue una derrota catastrófica para Roma. El ejército romano quedó atrapado en un terreno pantanoso y fue completamente aniquilado. Decio y su hijo murieron en combate, convirtiéndose en los primeros emperadores romanos de la historia en caer en batalla contra un enemigo extranjero.", "251 d.C.", 43.576802809051216, 26.45749516818694, "III d.C."));
        listaBatallas.add(new Batallas("Batalla de Edesa", "Romanos contra Persas", "Representa la mayor humillación militar en la historia de Roma. Tras ser derrotado, el emperador Valeriano fue capturado vivo por los persas.", "260 d.C.", 37.16676969938311, 38.789305084267504, "III d.C."));
        listaBatallas.add(new Batallas("Batalla de Naissus", "Romanos contra Godos", "Esta gran victoria contuvo la presión germánica en Occidente por décadas y dio el respiro necesario para que emperadores posteriores (como Aureliano y Diocleciano) reunificaran y estabilizaran el Imperio.", "268 d.C.", 43.32251867831683, 21.89618753056331, "III d.C."));
        listaBatallas.add(new Batallas("Batalla del Puente Milvio", "Constantino I contra Majencio", "Enfrentamiento decisivo donde Constantino I derrotó a Majencio. Marcó el inicio del fin de la Tetrarquía y abrió el camino hacia la adopción del cristianismo en el Imperio.", "312 d.C.", 41.891934, 12.477348, "IV d.C."));
        listaBatallas.add(new Batallas("Batalla de Tiatira", "Emperador Valente contra Procopio", "El emperador romano de Oriente, Valente, derrotó a las fuerzas del usurpador Procopio, poniendo fin a su rebelión en Lidia.", "366 d.C.", 38.917429068611234, 27.836438564173047, "IV d.C."));
        listaBatallas.add(new Batallas("Batalla de Solicinium", "Romanos contra Germanos", "Victoria romana bajo el mando de Valentiniano I frente a los alamanes tras sufrir intensas bajas en un asalto frontal.", "367 d.C.", 48.413345226225154, 8.970330214601683, "IV d.C."));
        listaBatallas.add(new Batallas("Batalla de los Sauces", "Romanos contra Godos", "Combate sangriento e indeciso en la diócesis de Tracia entre el ejército romano y los godos alzados en armas.", "377 d.C.", 43.36061005258889, 27.593186152338944, "IV d.C."));
        listaBatallas.add(new Batallas("Batalla de Adrianópolis", "Romanos contra Godos", "Derrota cataclísmica romana donde murió el propio emperador Valente. Marcó el inicio de la presión bárbara irrefrenable dentro de las fronteras imperiales.", "378 d.C.", 41.71537015857721, 26.56686346181222, "IV d.C."));
        listaBatallas.add(new Batallas("Batalla de los Campos Cataláunicos", "Romanos y Visigodos contra Atila", "La alianza entre Flavio Aecio y el rey visigodo Teodorico I detuvo la invasión de Atila el Huno en la Galia.", "451 d.C.", 49.03975473356211, 4.3589632210995, "IV d.C."));
        listaBatallas.add(new Batallas("Saqueo de Roma", "Vándalos atacan Roma", "Segundo gran saqueo de la capital imperial. Los vándalos de Genserico saquearon de forma metódica las riquezas de la ciudad durante catorce días.", "455 d.C.", 41.898198753958134, 12.492042293179464, "IV d.C."));
        listaBatallas.add(new Batallas("Caída de Ravena", "Fin del Imperio Romano de Occidente", "Odoacro depuso al joven emperador Rómulo Augústulo en Ravena. Este acontecimiento marca tradicionalmente el fin de la Edad Antigua y el comienzo de la Edad Media.", "476 d.C.", 44.418348335763646, 12.204113883362405, "IV d.C."));
        
    }

    // Getters y Setters
    public List<Batallas> getListaBatallas() {
        return listaBatallas;
    }

    public void setListaBatallas(List<Batallas> listaBatallas) {
        this.listaBatallas = listaBatallas;
    }

    public String getSigloSeleccionado() {
        return sigloSeleccionado;
    }

    public void setSigloSeleccionado(String sigloSeleccionado) {
        this.sigloSeleccionado = sigloSeleccionado;
    }

    public List<Batallas> getBatallasDelSigloSeleccionado() {

        List<Batallas> batallasDelSiglo = new ArrayList<>();

        if (sigloSeleccionado == null || sigloSeleccionado.isEmpty()) {

            return listaBatallas; // Prefiero que devuelva todas las batallas a que sea null y esté vacía la lista

        }

        for (Batallas b : listaBatallas) {

            if (b.getSiglo().equals(sigloSeleccionado)) {

                batallasDelSiglo.add(b);

            }

        }

        return batallasDelSiglo;

    }

}
