from model.ListaReserva_pb2 import ListaReserva
from model.Reserva_pb2 import Reserva
from util.api import Api
from datetime import datetime as dt

class ServiceReserva:
    def __init__(self):
        pass

    """

        CLIENTE

    """
    def ListarReservas(self,id_usuario):
        reservas = ListaReserva()
        for x in Api().selectAllReservasUser(id_usuario):
            (ident, id_sala, id_usuario, data, horario) = x
            if(dt.strptime(data, "%d/%m/%Y") >= dt.today()):
                r =reservas.reservas.add()
                r.id = ident
                r.id_sala = id_sala
                r.id_usuario = id_usuario
                r.data = data
                r.horario = horario
        return reservas
    
    def ListarPedidoReservas(self,id_usuario):
        reservas = ListaReserva()
        for x in Api().selectAllPedidoReservaUser(id_usuario):
            (ident, id_usuario, id_sala, data, horario) = x
            r =reservas.reservas.add()
            r.id = ident
            r.id_sala = id_sala
            r.id_usuario = id_usuario
            r.data = data
            r.horario = horario
        return reservas
    
    def AdicionarPedidoReserva(self,reserva):
        id_sala = reserva.id_sala
        id_usuario = reserva.id_usuario
        data = reserva.data
        horario = reserva.horario
        sala =Api().selectOneSala(id_sala)
        # print("sala - ",sala)
        if(sala==None):
            return 1
        if(Api().insertPedidoReservaUser(id_sala,id_usuario,data,horario)):
            return 2
        else:
            return 3
    
    def VerPedidoReserva(self,reserva):
        return Api().selectOnePedidoReservaUser(reserva.id)
    
    def CancelarReserva(self,reserva):
        # print(reserva.id)
        return Api().cancelarReservaUser(reserva.id,reserva.id_usuario)

    def ListarHistorico(self,id_usuario):
        reservas = ListaReserva()
        for x in Api().selectAllReservasUser(id_usuario):
            (ident, id_sala, id_usuario, data, horario) = x
            if(dt.strptime(data, "%d/%m/%Y") < dt.today()):
                r =reservas.reservas.add()
                r.id = ident
                r.id_sala = id_sala
                r.id_usuario = id_usuario
                r.data = data
                r.horario = horario
        return reservas