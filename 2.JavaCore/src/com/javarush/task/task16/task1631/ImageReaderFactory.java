package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes s){
        if (s == ImageTypes.JPG){
            return new JpgReader();
        }
        if (s == ImageTypes.BMP){
            return new BmpReader();
        }
        if (s == ImageTypes.PNG){
            return new PngReader();
        }
        else throw new IllegalArgumentException("Неверный тип картинки");
    }
}
