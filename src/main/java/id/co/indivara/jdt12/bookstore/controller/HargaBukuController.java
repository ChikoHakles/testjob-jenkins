package id.co.indivara.jdt12.bookstore.controller;

import id.co.indivara.jdt12.bookstore.entities.HargaBuku;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HargaBukuController {
    public static ArrayList<HargaBuku> listHarga = new ArrayList<>();
    @GetMapping("/all")
    public ArrayList<HargaBuku> findAllBook() {
        listHarga.add(new HargaBuku("111", "Ara iri", "Amir", 2000));
        listHarga.add(new HargaBuku("112", "Bara biri", "Budi", 3000));
        listHarga.add(new HargaBuku("113", "Cara ciri", "Coki", 4000));
        return listHarga;
    }

    @PostMapping("/termahal")
    public HargaBuku findBukuTermahal(@RequestBody ArrayList<HargaBuku> list) {
        HargaBuku result = list.get(0);
        for (HargaBuku hb : list) {
            if(result.getHarga() < hb.getHarga()) {
                result = hb;
            }
        }
        return result;
    }

    @PostMapping("/termurah")
    public HargaBuku findBukuTermurah(@RequestBody ArrayList<HargaBuku> list) {
        HargaBuku result = list.get(0);
        for (HargaBuku hb : list) {
            if(result.getHarga() > hb.getHarga()) {
                result = hb;
            }
        }
        return result;
    }
}
