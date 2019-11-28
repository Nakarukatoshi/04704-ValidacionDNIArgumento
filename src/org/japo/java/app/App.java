/*
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public final class App {

    //Constantes globales
    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static final int DNI_NUM = 12345678;
    public static final char DNI_CTR = 'X';

    public final void launchApp() {
        //Cabecera
        System.out.println("VALIDACIÓN DE DNI");
        System.out.println("=================");

        //Muestra DNI
        System.out.printf("DNI .......: %d%c%n", DNI_NUM, DNI_CTR);

        //Separador
        System.out.println("---");

        //Análisis
        boolean dniOk = validar(DNI_NUM, DNI_CTR);

        //Resultados
        System.out.printf("Validez ...: %s%n",
                dniOk ? "Correcto" : "Incorrecto");
    }

    //Número DNI > Control DNI
    public static final char calcular(int num) {
        return LETRAS.charAt(num % 23);
    }

    //Validar Número DNI + Control DNI
    public final boolean validar(int num, char ctr) {
        return ctr == calcular(num);
    }
}
