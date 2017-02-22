#include "NodeClass.h"
#include "Relation.h"

Nodes::Nodes(){}
Nodes::~Nodes()
{
	id = "";
	contactName="";
	friends.erase(friends.begin(),friends.end());
}
Nodes::Nodes(string ID, string Name)// crea un usuario
{
	id = ID;
	contactName = Name;
}
string Nodes::getName(){ return contactName; }

bool Nodes::sameId(string ID) // compara si el ID es el mismo
{
	if (id == ID)
		return true;
	else
		return false;
}
void Nodes::addFriendship(Nodes *c)
{
	Relation *newRelation = new Relation(this, c);
	friends.push_back(newRelation);
}
bool Nodes::existFriendship(Nodes *ID)
{
	for (int i = 0; i < friends.size(); i++)
	{
		 if (friends[i]->alreadyfriend(ID) == true)//es igual
			return true;
	}
	return false;
}

int Nodes::positionFriendship(Nodes *ID)
{
	for (int i = 0; i < friends.size(); i++)
	{
		if (friends[i]->alreadyfriend(ID) == true)//es igual
			return i;
	}
	return -1;
}
void Nodes::showFriends()
{
	for (int i = 0; i < friends.size(); i++)
	{
		printf(" %s, ", friends[i]->getContact()->getName().c_str());
	
	}
	cout << endl;
}
void Nodes::deleteFriendship(Nodes* contact)
{
	int posIdFriend=positionFriendship(contact);
	friends.erase(friends.begin() + posIdFriend);
}
void Nodes::deleteAllFriends()
{
	for (int i = 0; i < friends.size(); i++)
	{
		friends[i]->getContact()->deleteFriendship(this);
	}
}