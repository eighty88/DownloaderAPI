package com.github.eighty88.api.downloader;

import java.io.File;

public class DownloaderAPI {
    public static void main(String[] args) {
        try {
            if (args.length > 0) {
                Downloader downloader = new Downloader(args[0]);

                File NewFile = new File("result");

                if (NewFile.mkdir()) {
                    downloader.DownloadTo("." + File.separator + "result");
                } else if (NewFile.exists()) {
                    downloader.DownloadTo("." + File.separator + "result");
                }
            }
        } catch (Exception e) {
            System.out.println();
            e.printStackTrace();
        }
    }
}
