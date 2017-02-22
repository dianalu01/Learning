#include "NodeClass.h"
class Graph
{
private:
	string NameGraph;
	vector<Nodes*> usuarios;
public:
	Graph(){}
	Graph(string name){ NameGraph = name; }

	void addContact(string id, string name)// agrega nodo o usuario
	{
		if ((exist(id)) == false)
		{
			Nodes *newUser = new Nodes(id, name);
			usuarios.push_back(newUser);
		}
		else
			cout << "El usuario ya existe!";

	}
	void deleteContact(string id)// agrega nodo o usuario
	{
		int pId = positionUsuarios(id);
		
		
		if ((pId != -1) )
		{
			usuarios[pId]->deleteAllFriends();
			usuarios.erase(usuarios.begin() + pId);
			cout << "Se elimino correctamente el usuario \n";
		}
		else
			cout << "El usuario no existe!";
	}

	void addFriendship(string id1, string id2)
	{
		int pId1 = positionUsuarios(id1);
		int pId2 = positionUsuarios(id2);
		if ((pId1 != -1) || (pId2 != -1))
		{
			if ((usuarios[pId1]->existFriendship(usuarios[pId2])))
			{
				cout << "La amistad ya existia\n";
			}
			else
			{
				usuarios[pId1]->addFriendship(usuarios[pId2]);
				usuarios[pId2]->addFriendship(usuarios[pId1]);
				cout << "Se creo correctamente la amistad\n";
			}
		}
		else
			cout << "Los usuarios no existen!";
	}
	void deleteFriendship(string id1, string id2)
	{
		int pId1 = positionUsuarios(id1);
		int pId2 = positionUsuarios(id2);
		if ((pId1 != -1) || (pId2 != -1))
		{
			if ((usuarios[pId1]->existFriendship(usuarios[pId2])))
			{

				usuarios[pId1]->deleteFriendship(usuarios[pId2]);
				usuarios[pId2]->deleteFriendship(usuarios[pId1]);
				cout << "Se elimino correctamente la amistad\n";
			}
			else
			{
				cout << "La amistad no existe\n";
			}
		}
		else
			cout << "Los usuarios no existen!";
	}
	void showGraph()
	{		
		printf("Grafo de %s \n\n", this->NameGraph.c_str());
		for (int i = 0; i < usuarios.size(); i++)
		{
			printf(" %s y sus amigos: ", usuarios[i]->getName().c_str());
			usuarios[i]->showFriends();

		}
	}
	int positionUsuarios(string id)
	{
		for (int i = 0; i < usuarios.size(); i++)
		{
			if (usuarios[i]->sameId(id) == true)//es igual
			{
				return i;
			}
		}
		return -1;
	}
	bool exist(string ID) //existe el usuario
	{
		for (int i = 0; i < usuarios.size(); i++)
		{
			if (usuarios[i]->sameId(ID) == true)//es igual
			{
				return true;
			}
		}
		return false;
	}
};
