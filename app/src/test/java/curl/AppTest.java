/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package curl;

import org.junit.Test;

import static org.junit.Assert.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class AppTest {
    public static void main(String[] args) {
        boolean isEnd = false;

        while (isEnd == false) {
            List<String> argList = getArgs();
            System.out.println(argList);
            isEnd = operationProcess(argList, isEnd);
        }
    }

    // コマンドを取得する関数
    public static List<String> getArgs() {
        // コマンドラインの引数オプションを格納するリスト
        List<String> argList = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("コマンドを入力してください:");
            String str = bufferedReader.readLine(); // 1行読み込む
            String[] array = str.split(" "); // スペースで文字列を分解し配列化
            // コマンドリストに要素を追加
            for (int i = 0; i < array.length; i++) {
                argList.add(array[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(argList);
        return argList;
    }

    public static boolean operationProcess(List<String> argList, boolean isEnd) {
        if (argList.get(0).equals("quit")) {
            System.out.println("終了");
            isEnd = true;
        }
        return isEnd;
    }
}