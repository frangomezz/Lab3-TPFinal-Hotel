package com.company.Personal;

import com.company.Habitacion;
import com.company.Hotel;

public class Administrador extends Recepcionista{

    public Administrador(String nombre, String apellido,double sueldo,String turno, long dni) {
        super(nombre, apellido, dni,sueldo,turno);

    }

    public void actualizarHabitacionesDisponibles(Habitacion habitacionNoDisponible)
    {

    }
    public void crearUnNuevoResepcionista(String nombre,String apellido,long dni,int sueldo,String turno)
    {
        Hotel.cantidadEmpleados++;
        Hotel.listaEmpleados.add(new Recepcionista(nombre,apellido,dni,sueldo,turno));
    }
    public void crearUnNuevoAdministrador(String nombre,String apellido,long dni,int sueldo,String turno)
    {
        Hotel.cantidadEmpleados++;
        Hotel.listaEmpleados.add(new Administrador(nombre,apellido,sueldo,turno,dni));

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
