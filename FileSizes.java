class FileSizes {

    public static void main(String[] args) {

      String media = "WhiteFerrari.mp3 12b\nPyramids.aac 25b\nNights.flac 15b\nMona.Lisa.jpg 5b\nPicture.bmp 20b\nInception.mp4 10000b\nInterstellar.mkv 12000b\nNothing.zip 6969b";

      FileSizes myFileSizes = new FileSizes();
      myFileSizes.filesize(media);
    }


    public String filesize(String S) {
        // write your code in Java SE 8

        int musicTotal = 0;
        int imagesTotal = 0;
        int moviesTotal = 0;
        int otherTotal = 0;

        String[] lines = S.split("\\r?\\n");

        for (int i = 0;i<lines.length;i++){
            System.out.println("\nnew item");
            System.out.println(lines[i]);
            int spaceIndex = lines[i].indexOf(" ");
            System.out.println("space index: " + spaceIndex);
            String size = lines[i].substring(spaceIndex + 1, lines[i].length() - 1);
            int sizeInt = Integer.parseInt(size);
            System.out.println("size: " + size);
            int lastDot = lines[i].lastIndexOf(".");
            System.out.println("last . : " + lastDot);
            String ext = lines[i].substring(lastDot, spaceIndex);
            System.out.println("ext: " + ext);


            switch (ext) {
            case ".mp3":
            case ".aac":
            case ".flac":
                musicTotal += sizeInt;
                break;
            case ".jpg":
            case ".bmp":
            case ".gif":
                imagesTotal += sizeInt;
                break;
            case ".mp4":
            case ".avi":
            case ".mkv":
                moviesTotal += sizeInt;
                break;
            default:
                otherTotal += sizeInt;
}
        }
        String result = ("music " + musicTotal + "b" + "\n"
                + "images " + imagesTotal + "b" + "\n"
                + "movies " + moviesTotal + "b" + "\n"
                + "other " + otherTotal + "b" + "\n"
                );
        System.out.println(result);
        return result;

    }
}
