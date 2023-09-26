/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.normalizetest;

import com.mycompany.normalizetest.Controller.NormalizeText;
import com.mycompany.normalizetest.Model.TextNormalizer;

public class Main {

    public static void main(String[] args) {
        TextNormalizer model = new TextNormalizer();
        
        new NormalizeText(model).run();
    }
    
}
