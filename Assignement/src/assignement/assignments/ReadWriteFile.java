/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement.assignments;

import java.io.*;

/**
 *
 * @author shari
 */
public class ReadWriteFile {

    public void readWriteFile() {
        String fileName = "C:\\Users\\shari\\Desktop\\Everting-About-Java\\Assignement\\src\\assignement\\assignments\\input-output.txt";
        String fileNameOfOuput = "C:\\Users\\shari\\Desktop\\Everting-About-Java\\Assignement\\src\\assignement\\assignments\\output.txt";
        int a = 0;
        int vowelCount = 0;
        FileInputStream fis;
        String s;

        try {
            fis = new FileInputStream(fileName);
            while ((a = fis.read()) != -1) {
                char ch = (char) a;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowelCount++;
                }
            }

            BufferedReader br = new BufferedReader(new FileReader(fileName));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileNameOfOuput));
            String str = "Total Number Of Vowels in The File: " + vowelCount;
            while ((s = br.readLine()) != null) {
                bw.write(s);
                bw.append('\n');
            }
            bw.write(str);
            bw.append('\n');
            bw.close();
            br.close();

            br = new BufferedReader(new FileReader(fileNameOfOuput));
            bw = new BufferedWriter(new FileWriter(fileName));
            while ((s = br.readLine()) != null) {
                bw.write(s);
                bw.append('\n');
            }

            bw.close();
            br.close();
            fis.close();

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
