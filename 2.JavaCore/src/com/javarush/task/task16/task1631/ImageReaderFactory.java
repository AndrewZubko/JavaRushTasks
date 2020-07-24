package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

import java.io.Reader;

public class ImageReaderFactory {
    public static ImageReader getImageReader (ImageTypes i){
        if (i == null){
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        else{
            try{
                if (i.equals(ImageTypes.BMP)){
                    return new BmpReader();
                }
                else if (i.equals(ImageTypes.JPG)){
                    return new JpgReader();
                }
                else if (i.equals(ImageTypes.PNG)){
                    return new PngReader();
                }
            }
            catch (IllegalArgumentException e){
                System.out.println("Неизвестный тип картинки");
            }
        }
    return null;
    }
}
