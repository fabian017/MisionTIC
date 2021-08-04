
#IMPORTACION LA LIBRERIA TKINTER
from tkinter import *
from tkinter.ttk import *
from tkinter import messagebox as mb
from datetime import datetime
from datetime import timedelta

# JOSE FABIAN JIMENEZ OVALLE G-27

#DECLARAR LA CLASE
class Empleado:
    #METODO INIT
    def __init__(self, ventana):
        #ATRIBUTOS
        self.nombre = StringVar()
        self.apellido = StringVar()
        self.sexo = StringVar()
        self.fechaNac = StringVar()
        self.fechaIng = StringVar()
        self.salario = IntVar()
        #ATRIBUTO VENTANA
        self.ventana = ventana
        self.ventana.title('Programa Empleado')
        self.ventana.geometry('335x220')
        #FRAME O MARCO
        marco=LabelFrame(self.ventana, text="Registrar empleado")
        marco.grid(column=0, row=0, columnspan=3, pady=20)
        #LABEL ENTRY NOMBRE
        self.lblnombre=Label(marco, text="Nombre: ").grid(column=0,row=1)
        self.entnombre = Entry(marco, textvariable=self.nombre)
        self.entnombre.grid(column=1, row=1)
        #LABEL ENTRY APELLIDO
        self.lblapellido = Label(marco, text="Apellido: ").grid(column=0, row=2)
        self.entapellido = Entry(marco, textvariable=self.apellido)
        self.entapellido.grid(column=1, row=2)
        #COMBOBOX SEXO
        self.lblsexo = Label(marco, text="Sexo: ").grid(column=0, row=3)
        valores=("Masculino", "Femenino")
        self.cmbsexo =Combobox(marco, width=17, textvariable=self.sexo, values=valores)
        self.cmbsexo.grid(column=1,row=3)
        #LABEL ENTRY FECHA DE NACIMINETO
        self.lblfechaNac = Label(marco, text="Fecha de Nacimiento: ").grid(column=0, row=4)
        self.entfechaNac = Entry(marco, textvariable=self.fechaNac)
        self.entfechaNac.grid(column=1, row=4)
        #LABEL ENTRY FECHA DE INGRESO
        self.lblfechaIng = Label(marco, text="Fecha de Ingreso: ").grid(column=0, row=5)
        self.entfechaIng = Entry(marco, textvariable=self.fechaIng)
        self.entfechaIng.grid(column=1, row=5)
        #LABEL ENTRY SALARIO
        self.lblsalario = Label(marco, text="Salario: ").grid(column=0, row=6)
        self.entsalario = Entry(marco, textvariable=self.salario)
        self.entsalario.grid(column=1, row=6)
        #BUTTON REGISTRAR EMPLEADO
        self.btnregistarEmp = Button(ventana, text="Registrar Empleado", command=self.registrarEmpleado)
        self.btnregistarEmp.grid(column=0,row=7)
        #BUTTON CALCULAR PRESTACIONES
        self.btncalcularPrest = Button(ventana, text="Calcular Prestaciones", command=self.calcularPrestaciones)
        self.btncalcularPrest.grid(column=1, row=7)
        #BUTTON MODIFICAR SALARIO
        self.btnmodificarSal = Button(ventana, text="Modificar salario", command=self.modificarSalario)
        self.btnmodificarSal.grid(column=2, row=7)
    #DECLARAR LAS FUNCIONES
    def modificarSalario(self):
        self.lblsalario = Label(ventana, text="nuevo Salario: ").grid(column=0, row=8)
        self.entsalario = Entry(ventana, textvariable=self.salario)
        self.entsalario.grid(column=1, row=8)
        self.ventana.geometry('357x240')
        #BUTTON ACTUALIZAR REGISTRO
        self.btnmodificarSal = Button(ventana, text="Actualizar empleado", command=self.actualizar)
        self.btnmodificarSal.grid(column=2, row=7)
    def actualizar(self): #REGISTRA EL NUEVO SALARIO
        mensaje = self.nombre.get().title()+' ' + self.apellido.get().title()
        sexo = f"Sexo: {self.sexo.get()}"
        nac = f"Fecha de Nacimiento: {self.fechaNac.get()}"
        ing = f"Fecha de ingreso: {self.fechaIng.get()}"
        salario = f"Nuevo Salario: {self.salario.get()} COP"
        mb.showinfo(title="Actualizacion Empleado", message=f"Has sido ACTUALIZADO {mensaje}\n{sexo}\n{nac}\n{ing}\n{salario}")
    def calcularPrestaciones(self):
        nombreCom = self.nombre.get().title() + ' ' + self.apellido.get().title()
        fechaActual = datetime.now()
        fechaIngreso = datetime.strptime(self.fechaIng.get(), '%d/%m/%Y')
        antiguedad = fechaActual -fechaIngreso
        meses = round(antiguedad.days / 30, 0) #CONVIERTE EL TIMEDELTA EN DIAS Y LUEGO HACE CONVERSION EN MESES
        prestaciones = (meses * self.salario.get())/12 #TRABAJA CON LA ANTIGUEDAD EN MESES
        mensaje = f"{nombreCom}, Sus prestaciones son:\n          $  {prestaciones:.0f} COP"
        mb.showinfo(title="Calculo Prestaciones", message=mensaje)
        pass
    def registrarEmpleado(self):
        mensaje = self.nombre.get().title()+' ' + self.apellido.get().title()
        sexo = f"Sexo: {self.sexo.get()}"
        nac = f"Fecha de Nacimiento: {self.fechaNac.get()}"
        ing = f"Fecha de ingreso: {self.fechaIng.get()}"
        salario = f"Salario: {self.salario.get()} COP"
        mb.showinfo(title="Registro Empleado", message=f"Has sido registrado {mensaje}\n{sexo}\n{nac}\n{ing}\n{salario}")

if __name__ == '__main__':
    ventana = Tk()
    aplicacion = Empleado(ventana)
    ventana.mainloop()
