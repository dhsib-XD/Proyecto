/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

import java.util.Scanner;


/**
 *
 * @author CarlosXl
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String MC = "Ninguno";
        double max =0, gasto =0;
        int compras =0,ventas =0;
        int P1=0,P2=0,P3=0,P4=0;
        int eleccion;
        double suma = 0;
        double tlps = 0;
        double d1 = 0;
        String tipoc;
        double ventat = 0;
        int producto = 0;
        int pp = 0;
        double kg= 0;
        int dci = 0;
        double add = 0;
        double precio =0 ;
        double descuento = 0;
        int papel = 0;
        int elec =0;
        double fac =0;
        int a=0;
        int abrir =0;
        double c1=0,c2=0,c3=0,c4=0;
        double v =0;
     
        double ttrigo =0,tazucar =0,tmaiz=0,tavena=0;
        double kt =0, ka=0, km=0,kv=0;
        while(true){
            System.out.println("");
        System.out.println("***Bienvenido a la Tienda*** \n"
        +"1.Abrir Caja \n" 
        +"2.Ventas \n"
        +"3.Compras \n"
        +"4.Reportes \n"
        +"5.Cierre de Caja \n"
        +"6.Salir del Sistema");
            System.out.print("Su eleccion es:");
            
       
        
        if (scanner.hasNextInt()) {
    eleccion = scanner.nextInt();
    
} else {
    System.out.println("Opcion no valida. Debe ingresar un numero.");
    scanner.next(); // Limpiar el texto no numérico
    continue;
}
System.out.println("");
       
        
        
        if (eleccion == 6) {
            System.out.println("");
            System.out.println("Cerrando Systema.........");
            System.out.println("");
             break;
        }else  {
            
        }
        
        if (eleccion == 1) {
            
            
           while(true){
               if (a == 0) {
               
                a++;
                
            }
             
            if (abrir == 1) {
                System.out.println("**Abriendo Caja de nuevo***");
                abrir--;
                break;
            }
    System.out.println("Usted tiene en caja Lps:" + String.format("%.2f", tlps));
    System.out.print("Favor ingrese la cantidad de dinero deseado a ingresar:");
    d1 = scanner.nextDouble();

    if (d1 < 0) {
        System.out.println("Numero no aceptado....");
        System.out.println("Favor ingrese un numero positivo..........");
        System.out.println("Regresando al Menu principal.........");
        System.out.println(" ");
        a--;
        break;
    } else {
        
         
        
        System.out.println("Numero Aceptado");
        suma = tlps + d1;
        tlps = suma;
        System.out.println("La cantidad de lempiras en la caja es de:" + String.format("%.2f", tlps));
        
         
         break;
    }
        }
               
           }else if (eleccion == 2) {
    while (true) {
        boolean trigo = false,azucar = false,maiz = false,avena = false;
        if (a == 0) {
            System.out.println("**Favor abra la caja**");
            System.out.println("");
            break;
        }
        if (c1 == 0 && c2 == 0 && c3 == 0 && c4 == 0) {
        System.out.println("No hay producto disponible");
        break;
    }
        System.out.print("Favor ingrese el tipo de cliente entre A,B,C:");
        tipoc = scanner.next().toUpperCase();

        if (!tipoc.equals("A") && !tipoc.equals("B") && !tipoc.equals("C")) {
            System.out.println("Tipo de cliente no valido........");
            break;
        }
while(true){ 
    
        System.out.print("Codigo---Producto-----Precio-------Cantidad Disponible\n"
                + " 1/--------Azucar-----30.00 Lps/Kg-------"+c1+":Kg\n"
                + " 2/--------Avena------25.00 Lps/Kg-------"+c2+":Kg\n"
                + " 3/--------Trigo------32.00 Lps/Kg-------"+c3+":Kg\n"
                + " 4/--------Maiz-------20.00 Lps/Kg-------"+c4+":Kg\n"
                + " 5/-Volver al menu principal\n"
                + "Favor ingrese el codigo del producto:");
       
        producto = scanner.nextInt();
        if (producto == 5) {
        break;
        }
        if (producto != 1 && producto != 4 && producto != 3 && producto != 2 ) {
            System.out.println("Numero no valido favor ingrese un codigo valido");
            System.out.println("");
    }
        
        System.out.println("");
        if ( producto <= 0 || producto >= 6) {
            System.out.println("");
            System.out.println("Opcion no valida favor reingrese de nuevo el codigo del producto");
            continue;
        
    }
        
        

        if (tipoc.equals("B") && producto == 4) {
            System.out.println("No puede comprar este producto. ");
            System.out.println("Favor re ingrese otra opcion ");
            continue;
        } else if (tipoc.equals("C") && producto != 4) {
            System.out.println("No puede comprar este producto. ");
            System.out.println("Favor re ingrese otra opcion ");
            continue;
        }

        System.out.print("Favor ingrese la cantidad deseado en kilogramos:");
        kg = scanner.nextDouble();
        
        if (kg <= 0) {
            System.out.println("Cantidad no valida por favor ingrese una cantidad mayor que 0");
            System.out.println("");
            continue;
        
    }
        
        if (producto == 1) {
    if (c1 < kg) {
        System.out.println("No suficiente producto para vender");
        System.out.println("Favor compre mas producto para realizar la venta primero");
        continue;
    } else {
        tazucar=kg*30.00;
        azucar = true;
        precio = 30.00;
        ka =kg+ka;
        P1++;
    }
} else if (producto == 2) {
    if (c2 < kg) {
        System.out.println("No suficiente producto para vender");
        System.out.println("Favor compre mas producto para realizar la venta primero");
        continue;
    } else {
        tavena=kg*25.00;
        avena = true;
        precio = 25.00;
         kv =kg+kv;
        P2++;
    }
} else if (producto == 3) {
    if (c3 < kg) {
       System.out.println("No suficiente producto para vender");
        System.out.println("Favor compre mas producto para realizar la venta primero");
    } else {
        ttrigo=kg*32.00;
        trigo = true;
        precio = 32.00;
         kt =kg+kt;
        P3++;
    }
} else if (producto == 4) {
    if (c4 < kg) {
       System.out.println("No suficiente producto para vender");
        System.out.println("Favor compre mas producto para realizar la venta primero");
        continue;
    } else {
        tmaiz=kg*20.00;
        maiz = true;
        precio = 20.00;
        km =kg+km;
        P4++;
    }
}           

        System.out.println("Desea comprar otro producto\n"
                + "1 = Si\n"
                + "2 = No");
        System.out.print("Su eleccion es: ");
        dci = scanner.nextInt();
        add = (kg*precio)+add;
        if (dci == 1) {
            
           
            
            continue;
        } else if ( dci == 2) {
            ventas++;
            
            if (add >= 5000) {
                 descuento = 0.10;
                 papel = 10;
            }else if (add >= 1000) {
                descuento = 0.05;
                 papel = 5;
            }
            double ISV =0.07*add;
            double TD= descuento*add;
            System.out.println("");
            System.out.println("***Factura de Venta***");
                    System.out.println("Subtotal: "+add);
                    System.out.println(" Total por producto / Cantidad");
                    if (avena) {
                        System.out.println(" Avena:"+tavena+".Lps / Kg: "+kv);
            } if (azucar) {
                 System.out.println(" Azucar:"+tazucar+".Lps /Kg: "+ka);
                
            } if (trigo) {
                 System.out.println(" Trigo:"+ttrigo+".Lps /Kg: "+kt);
                
            } if (maiz) {
                 System.out.println(" Maiz:"+tmaiz+".Lps /Kg: "+km);
                
            }
                    System.out.println("******************");
                    System.out.println("Descuento de compra "+papel+ "%: "+TD+"Lps");
                            System.out.println("Impuesto sobre Compra del 7%: "+String.format("%.2f", ISV)+"Lps");
                                    
            double tt =(add-TD)+ISV;
           
            System.out.println("Su total a pagar es: "+String.format("%.2f", tt)+"Lps");
            System.out.println("********************* ");
            tlps = tt+tlps;
            System.out.println("La venta a sido un exito");
            System.out.println("La cantidad de la caja a subido ahora es de : " + String.format("%.2f", tlps)+"Lps");
            add = 0;
            System.out.println("");
            
            
            v = tt+v;
            if (max < tt) {
                max = tt;
            }
            switch (producto) {
                case 1:
                    c1 = c1 - kg;
                    break;
                case 2:
                    c2 = c2 - kg;
                    break;
                case 3:
                    c3 = c3 - kg;
                    break;
                case 4:
                    c4 = c4 - kg;
                    break;
                default: System.out.println("Opcion no valida");
                    break;
            }
            
            break; // salir del ciclo si no desea seguir comprando
        }else{
         System.out.println("Opcion no valida favor ingrese de nuevo");
            continue;
    }

    
}  
      break;  
    }

} else if (eleccion == 3) { 
   
    
       while (true) {
           String pro = "";
           if (a == 0) {
            System.out.println("**Favor abra la caja**");
            System.out.println("");
            break;}
            
            System.out.println("Tipo de Vendedor /  Provee");
            System.out.println("  A    /   Azucar y Maiz    \n"
                             + "  B    /   Trigo y Avena   \n"
                             + "  C    /   Avena");
            System.out.print("Favor ingrese el tipo de Vendedor: ");
            String Vdor = scanner.next().toUpperCase();
    
            if (!Vdor.equals("A") && !Vdor.equals("B") && !Vdor.equals("C")) {
                System.out.println("Opcion no Valida......Favor ingrese una letra");
                continue;
            }

            System.out.println("Vendedor ingresado: " + Vdor);
            if (Vdor.equals("A")) {
                System.out.println("Que desea comprar:\n"
                        + "1 /Azucar-----25.00 Lps/Kg \n"
                        + "2 /Maiz-----18.00 Lps/Kg");
                System.out.print("Que producto desea:");
                 elec = scanner.nextInt();
                 if (elec > 2 || elec < 1) {
                System.out.println("Numero no valido. Favor reingrese los datos");
                
                break;
           }
                 if (elec == 1) {
                    fac = 25.00;
                    pro = "Azucar";
                    
                }else if (elec == 2) {
                    fac = 18.00;
                     pro = "Maiz";
                     elec = 4;
                }  {
                    
                }
                 
                 
           }else if (Vdor.equals("B")) {
               System.out.println("Que desea comprar:\n"
                        + "1 /Trigo-----30.00 Lps/Kg \n"
                        + "2 /Avena-----20.00 Lps/Kg");
                System.out.print("Que producto desea:");
                 elec = scanner.nextInt();
                 if (elec > 2 || elec < 1) {
                System.out.println("Numero no valido. Favor reingrese los datos");
                
                break;
           }
                 if (elec == 1) {
                    fac = 30.00;
                    elec++;
                    elec = 3;
                     pro = "Trigo";
                }else if (elec == 2) {
                    fac = 20.00;
                     pro = "Avena";
                    
                }
           }else if (Vdor.equals("C")) {
               
                System.out.println("");
                System.out.println("La avena cuesta 22.00 Lps/Kg");
                System.out.println("");
               fac = 22.00;
               elec =2;
                 pro = "Avena";
        
           }
            
             System.out.print("Cuanto Kilogramos desea:");
             kg = scanner.nextDouble();
             System.out.println("");
            double TV = kg * fac;
            if (tlps < TV) {
                 System.out.println("No puede hacer esta compra no tiene suficiente dinero");
                 System.out.println("");
                 break;
                
           }
            System.out.println("******* Factura de compra *********");
            System.out.println("Producto: "+pro);
            System.out.println("Vendedor: "+Vdor);
            System.out.println("Cantidad comprada: "+kg);
            System.out.println("Su total es a pagar es:"+ String.format("%.2f", TV)+"Lps");
            System.out.println("**********************************");
            
                System.out.println("");
                System.out.println("La compra ha sido excitosa");
                tlps =  tlps - TV;
                System.out.println("El total de la caja se a actualizado ahora tiene: "+String.format("%.2f", tlps)+"Lps restantes en caja");
                
            
            
            if (gasto < TV) {
                gasto = TV;
               
           }
            
            System.out.println("");
             compras++;
           switch (elec) {
               case 1:{
                   c1 = kg+c1;
                   break;
               }
                   
               case 2:{
                   c2 = kg+c2;
                   break;
               }
                   
               case 3:{
                   c3 = kg+c3;
                           break;
               }
                   
               case 4:{
                   c4 = kg+c4;
                   break;
               }
                   
               default:
                   break;
           }
           
           elec=0;
            
            break;
        
        
       
       
    }   
            

    // Lógica de "Compras"
    
} else if (eleccion == 4) {
    while(true){
        if (a == 0) {
            System.out.println("**Favor abra la caja**");
            System.out.println("");
            break;
        }
        
        System.out.println("--- Reportes ---");
        System.out.println("Saldo actual en caja: " + String.format("%.2f", tlps) + " Lps");
        System.out.println("Compras realizadas: " + compras + " transacciones"); 
        System.out.println("Ventas realizadas: " + ventas + " transacciones");

        // Cálculo del promedio por compra (MODIFICADO)
        if (compras > 0) {
            double promedioCompra = gasto / compras;  // gasto total / número de compras
            System.out.println("Promedio por compra: " + String.format("%.2f", promedioCompra) + " Lps");
            System.out.println("Mayor gasto en compra: " + String.format("%.2f", gasto) + " Lps"); 
        } else {
            System.out.println("Promedio por compra: No aplicable (0 compras)");
        }

        if (ventas > 0) {
            System.out.println("Promedio por venta: " + String.format("%.2f", v/ventas) + " Lps");
            System.out.println("Mayor ganancia en venta: " + String.format("%.2f", max) + " Lps");
        } else {
            System.out.println("Promedio por venta: No aplicable (0 ventas)");
        }

        
        if (P1>P2 && P1>P3 && P1>P4) {
            MC = "Azucar";
        } else if (P2>P1 && P2>P3 && P2>P4) {
            MC = "Avena";
        } else if (P3>P1 && P3>P2 && P3>P4) {
            MC = "Trigo";
        } else if (P4>P1 && P4>P2 && P4>P3) {
            MC = "Maiz";
        }
        System.out.println("Producto estrella: " + MC);
        System.out.println("");
        break;
    }

          
    // Lógica de "Reportes"
    
} else if (eleccion == 5) {
    while(true){
             if (a == 0) {
            System.out.println("**Favor abra la caja**");
            System.out.println("");
            break;
        }
        
        System.out.println("No puede depositar mas del 60% del dinero en la caja:");
        System.out.print("Cantidad de dinero a depositar: Lps:");
        
        double depo= scanner.nextDouble();
        double d = tlps*0.60;
        
        if (depo > tlps) {
            System.out.println("No tiene suficiente dinero");
            System.out.println("");
            break;
            
        }else if (depo > d) {
            System.out.println("La cantidad de dinero ingresado supera el 60%");
            System.out.println("");
            continue;
        }
        System.out.println("El dinero a sido depositado");
        
        MC = "Ninguno";
          
         max =0;
         gasto =0;
         compras =0;
         ventas =0;
         P1=0;
         P2=0;
         P3=0;
         P4=0;
         eleccion =0;
        suma = 0;
        
         d1 = 0;
         tipoc ="";
         ventat = 0;
         producto = 0;
         pp = 0;
         kg= 0;
         dci = 0;
         add = 0;
         precio =0 ;
         descuento = 0;
         papel = 0;
         elec =0;
         fac =0;
         a=0;
         abrir =0;
         c1=0;
         c2=0;
         c3=0;
         c4=0;
         v =0;
     
         ttrigo =0;
         tazucar =0;
         tmaiz=0;
         tavena=0;
         kt =0;
         ka=0;
         km=0;
         kv=0;
    abrir++;
    break;
    } 
    // Lógica de "Cierre de Caja"
    
} else {
    System.out.println("Ingreso un numero no valido.......");
    System.out.println("Regresando al menu Principal...............");
}
        
        
        
        
    
       
        
    }
    
}}

