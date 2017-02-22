#include "NodeClass.h"
#include "Relation.h"
Relation::Relation(){}
Relation::~Relation()
{
	user = 0;
	contact = 0;
}
Relation::Relation(Nodes *u, Nodes *c)
{
	setUser(u);
	setContact(c);
}
void Relation::setUser(Nodes *u)
{
	user = u;
}
void Relation::setContact(Nodes *c)
{
	contact = c;
}

bool Relation::alreadyfriend(Nodes* Id) // compara si el ID es el mismo
{
	if (contact == Id)
		return true;
	else
		return false;
}
Nodes* Relation::getContact()
{
	return contact;
}