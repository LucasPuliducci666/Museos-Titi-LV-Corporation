import persistencia.reliquia;
import persistencia.taxidermia;

public class Museo {

    public static void main(String[] args) {
        taxidermia Unot = new taxidermia (
        1,
        "Rana toro africana",
        "02/09/25",
        "Arqueologa Perez",        
        136000.10,        
        'B',        
        "Anfibios",
        "Chanchus Sapus",        
        "Adulto",
        "Siglo 19",        
        "Pantano"        
        );
        taxidermia Dost = new taxidermia (
        1,
        "Fosil de Diplodocus",
        "02/09/25",
        "Arqueologa Perez",        
        136000.10,        
        'B',        
        "Diplodocidae",
        "Diplodocus Longus",        
        "Adulto",
        "Jurasico Superior",        
        "Bosque"        
        );
        taxidermia Trest = new taxidermia (
        1,
        "Fosil de Nigersaurus",
        "06/09/23",
        "Arqueologa Perez",        
        170000.10,        
        'B',        
        "Diplodocoidea",
        "Nigersaurus Taqueti",        
        "Joven",
        "Cretásico Inferior",        
        "Llanuras"        
        );
        reliquia Unor = new reliquia(
        1,
        "Espada Escocesa Antigua",
        "01/10/25",
        "Arqueologa Perez",
        240000.10,
        'A',
        "Rara Espada encontrada en terreno de disputa escocesa",
        "Highlands, Escocia",     
        "Siglo 18",
        "Reliquia"        
        );
        reliquia Dosr = new reliquia(
        2,
        "Mano Incorrupta de Santa Teresa de Jesus",
        "01/02/23",
        "Hermana Julieta",
        1000000.1,
        'A',
        "Guantelete antiguo con joyas perteneciente a la iglesia católca de españa",
        "Magala, España",     
        "Siglo 16",
        "Reliquia"        
        );
        reliquia Tresr = new reliquia(
        3,
        "Vasija policroma de Tikal",
        "18/05/11",
        "Arqueóloga Ana Ruiz",
        120000.1,
        'A',
        "Vasica cerámica policroma con iconografía maya tardía: Presenta inscripciones jeroglíficas parciales y restos de pigmento rojo.",
        "Petén, Guatemala",     
        "Periodo Clásico Maya, 600-900 d.C",
        "Reliquia"        
        );
        reliquia Cuatror = new reliquia(
        4,
        "Tablilla cuneiforme de Uruk",
        "12/01/19",        
        "01/Investigador Martín Hernandez",
        250000.1,
        'A',
        "Tablilla de arcilla con inscripción cuneiforme en acadio; Registra entregas de grano a templos.",
        "Magala, España",     
        "Siglo 16",
        "Reliquia"        
        );
        
    }
    
}
