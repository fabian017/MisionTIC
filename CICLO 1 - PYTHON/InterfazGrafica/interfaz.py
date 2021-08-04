#IMPORTAR LIBRERIA TKINTER
from tkinter import *
from tkinter.ttk import *
from tkinter import scrolledtext
#from PIL import ImageTk, Image

#DECLARAR VARIABLE VENTANA
ventana=Tk()
#PARAMETROS
ventana.title('Programa libreria tkinter')
ventana.geometry('800x600')
'''#FRAME O MARCO
marco = Frame(ventana)
marco.config(bg="blue",width=800,height=600)
marco.pack()'''

'''#LABEL O ETIQUETA
texto="Nombre"
etiqueta = Label(ventana, text=texto)
etiqueta.config(bg="#ff0000", fg="white", font=("Calibri", 25))
etiqueta.pack()'''

'''#BUTTON O BOTON
def accion():
    print("REGISTRAR!!!!!")

boton = Button(ventana, text="Mostrar", command=accion)
boton.pack()'''

'''#ENTRY O ENTRADA DE TEXTO
texto = "Nombre"
etiqueta = Label(ventana, text=texto)
etiqueta.grid(column=0, row=0)
#etiqueta.pack()
entrada = Entry(ventana)
entrada.grid(column=1, row=0)
#entrada.pack() #grid no es compatible con pack()'''

'''#COMBOBOX
combo = Combobox(ventana)
combo["values"]=(1,2,3,4,5)
combo.current(0)
combo.grid(column=0, row=0)
'''

'''#CHECKBUTTON
def verificar():
    valor=checkeo.get()
    if valor == 1:
        print("Ciclismo seleccionado")
    else:
        print("Ciclismo no seleccionado")

checkeo = IntVar()
botoncheck = Checkbutton(ventana, text="Ciclismo", variable=checkeo, onvalue=1, offvalue=0, command=verificar)
botoncheck.pack()'''

'''#RADIOBUTTON
def seleccionar():
    valor=opcion.get()
    print('El dialecto seleccionado es '+ valor)
print("Seleccion dialecto: ")
opcion=StringVar()
radio1= Radiobutton(ventana, text="Santandereano", variable=opcion, value="Santandereano", command=seleccionar)
radio1.pack()
radio2 = Radiobutton(ventana, text="Costeño", variable=opcion, value="Costeño", command=seleccionar)
radio2.pack()'''

'''#SCROLLEDTEXT
textolargo = scrolledtext.ScrolledText(ventana, width=20, height=10)
textolargo.grid(column=0,row=0)'''

#SPINBOX
spin = Spinbox(ventana,from_=0, to=5, width=5)
spin.grid(column=0, row=0)
spin = Spinbox(ventana, from_=0, to=5, width=5)
spin.grid(column=1, row=0)
spin = Spinbox(ventana, from_=0, to=5, width=5)
spin.grid(column=2, row=0)

ventana.mainloop()
