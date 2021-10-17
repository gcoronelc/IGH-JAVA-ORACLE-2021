/*
GRUPO: 
INTEGRANTES:
- 
- 
- 
- 
*/

#include <iostream>
#include <sstream> 
using namespace std;

int main(){
	
	// Configuracion
	setlocale(LC_CTYPE,"Spanish");
	
	// Variables
	int opMenu, cantidad;
	char categoria;
	double precioUnitario, porcComision, importeVenta, comision;
	stringstream listado;
	// Contdores
	int contVentas=0, contVentaCateA=0, contVentaCateB=0, contVentaCateC=0;
	int sumaAutos=0, sumaAutosCateA=0, sumaAutosCateB=0, sumaAutosCateC=0;
	double sumaImporte=0.0, sumaImporteCateA=0.0, sumaImporteCateB=0.0, sumaImporteCateC=0.0;
	double sumaComision=0.0, sumaComisionCateA=0.0, sumaComisionCateB=0.0, sumaComisionCatebC=0.0;
	
	// Control del menú de opciones
	do{
		// EL MENU
		system("cls");
		cout << "======================================" << endl;
		cout << "VENTAS DE CAMIONETAS" << endl;
		cout << "Menú de Opciones" << endl;
		cout << "======================================" << endl;
		cout << "1.- Procesar venta" << endl;
		cout << "2.- Listado de ventas" << endl;
		cout << "3.- Resumen de ventas" << endl;
		cout << "4.- Salir" << endl;
		cout << "======================================" << endl;
		// Leer opción
		cout << endl;
		do{
			cout << "Opcion: "; cin >> opMenu;
			if(opMenu<1 || opMenu>4){
				cout << "ERROR: Opción incorrecta, intentalo nuevamente." << endl;
			}
		}while(opMenu<1 || opMenu>4);
		
		// Procesar opción del menú
		system("cls");
		switch(opMenu){
			
			// Opción 1: Procesar venta
			case 1:
				
				contVentas++;
				cout << "VENTA NRO. " << contVentas << endl;
				cout << endl;
				cout << "LECTURA DE DATOS" << endl;
				cout << "======================================" << endl;
				
				// Leer categoría
				cout << endl;
				do{
					cout << "Categoría del curso (A/B/C): "; cin >> categoria;
					categoria = toupper(categoria);
					if(categoria!='A' && categoria!='B' && categoria!='C'){
						cout << "Opción incorrecta, intentalo nuevamente." << endl;
					}
				}while(categoria!='A' && categoria!='B' && categoria!='C');
				
				// Leer cantidad
				cout << endl;
				do{
					cout << "Cantidad de camionetas: "; cin >> cantidad;
					if(cantidad<=0){
						cout << "Valor incorrecto, intentalo nuevamente." << endl;
					}					
				}while(cantidad<=0);
				
				// Obtener precio y porcentaje de comisión
				switch(categoria){
					case 'A':
						precioUnitario = 55500.0;
						porcComision = (cantidad<=10)?0.04:0.06;
						break;
					case 'B':
						precioUnitario = 75000.0;
						porcComision = (cantidad<=10)?0.06:0.10;
						break;
					case 'C':
						precioUnitario = 93000.0;
						porcComision = (cantidad<=10)?0.10:0.15;
						break;												
				}
				
				// Calculos de la venta
				importeVenta = cantidad * precioUnitario;
				comision = importeVenta * porcComision;
				
				// Reporte
				cout << endl;
				cout << fixed;
				cout << "RESULTADO DE LA VENTA" << endl;
				cout << "======================================" << endl;
				cout << "Precio por camioneta:   " << precioUnitario << endl;
				cout << "Importe de la venta:    " << importeVenta << endl;
				cout << "Porcentaje de comisión: " << porcComision * 100 << "%" << endl;
				cout << "Importe de comisión:    " << comision << endl;
				cout << endl;
				
				// Preparando el listado
				listado << fixed;
				listado << contVentas << "\t";
				listado << categoria << "\t";
				listado << precioUnitario << "\t";
				listado << cantidad << "\t";
				listado << importeVenta << "\t";
				listado << comision << endl;
				
				// Contadores
				contVentaCateA += (categoria=='A')?1:0;
				contVentaCateB += (categoria=='B')?1:0;
				contVentaCateC += (categoria=='C')?1:0;
				
				// Acumuladores
				sumaAutos += cantidad;
				sumaAutosCateA += (categoria=='A')?cantidad:0;
				sumaAutosCateB += (categoria=='B')?cantidad:0;
				sumaAutosCateC += (categoria=='C')?cantidad:0;
				
				
				break;
				
				
			// Opción 2: Listado de ventas
			case 2:
				
				cout << fixed;
				cout << endl;
				cout << "LISTADO DE VENTAS" << endl;
				cout << "======================================" << endl;
				cout << endl;
				cout << listado.str() << endl;
				break;	
				
				
			// Opción 3: Resumen de Ventas
			case 3:
				cout << fixed;
				cout << endl;
				cout << "RESUMEN DE VENTAS" << endl;
				cout << "======================================" << endl;
				cout << endl;
				cout << endl;
				cout << endl;
				cout << endl;
				cout << "-------------------------------------------------------------------------" << endl;
				cout << "   A\t" << contVentaCateA << "\t" << sumaAutosCateA << endl;
				cout << "   B\t" << contVentaCateB << "\t" << sumaAutosCateB << endl;
				cout << "   C\t" << contVentaCateC << "\t" << sumaAutosCateC << endl;
				cout << "-------------------------------------------------------------------------" << endl;
				cout << "TOTALES\t" << contVentas << "\t" << sumaAutos << endl;
				break;	
								

			// Opción 4: Salir
			case 4:
				cout << "FIN DEL PROGRAMA" << endl;
				cout << "======================================" << endl;
				cout << "Nos vemos en la siguiente venta." << endl;
				break;
		}
		
		system("pause");
	} while(opMenu<4);
	
	// Fin
	return 0;
}
