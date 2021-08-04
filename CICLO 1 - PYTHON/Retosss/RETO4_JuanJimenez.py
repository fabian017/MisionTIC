def salarioBruto(horas, valorHora):
    if horas <= 40:
        #CALCULA EL SALARIO TOTAL
        sueldoBruto = horas*valorHora
    elif horas > 40:
        #CALCULA HORAS EXTRA
        horasExtra= horas-40
        #CALCULA EL SALARIO TOTAL
        sueldoBruto = 40*valorHora + horasExtra*valorHora*1.5
    print(f"El sueldo bruto es: {sueldoBruto}")
    return sueldoBruto

def descuentos(bruto):
    parafiscal = (9 *bruto)/100
    salud = (4*bruto)/100
    pension = (4*bruto)/100
    descuentoTotal = salud + parafiscal + pension
    salarioNeto = bruto - descuentoTotal
    print("\nDESCUENTOS")
    print(f"Descuento por parafiscales: {parafiscal}\nDescuento por salud: {salud}\nDescuento por pension: {pension}")
    print(f"Descuento Total: {descuentoTotal}\nSalario Neto: {salarioNeto}")

def provisiones(bruto):
    primaServicio = (8.33*bruto)/100
    cesantias = (8.33*bruto)/100
    interesCesantias = (1*bruto)/100
    vacaciones = (4.17*bruto)/100
    totalProvisiones = primaServicio + cesantias +interesCesantias +vacaciones
    print("\nPROVISIONES")
    print(f"Prima: {primaServicio}\nCesantias: {cesantias}\nIntereses cesantias: {interesCesantias}")
    print(f"Vacaciones: {vacaciones}\nTotal provisiones: {totalProvisiones} ")

def calculoSalario(i):
    nombreCompleto = input("Digite nombre completo: ").title()
    horas = int(input("Digite las horas trabajadas: "))
    valorHora = float(input("Digite el valor de la hora laboral: "))
    print("\n---------------------------------------------------------------")
    print(f"Nombre docente {i}: {nombreCompleto}")
    bruto= salarioBruto(horas, valorHora)
    descuentos(bruto)
    provisiones(bruto)
    print("--------------------------------------------------------------")

if __name__ == "__main__":
    repeticiones = int(input("Numero de docentes:"))
    for i in range(repeticiones):
        calculoSalario(i+1)
        print()




