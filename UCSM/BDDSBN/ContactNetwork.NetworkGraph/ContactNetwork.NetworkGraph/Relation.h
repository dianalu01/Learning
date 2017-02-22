class Nodes;
class Relation
{
private:
	Nodes *user;
	Nodes *contact;
public:
	Relation();
	~Relation();
	Relation(Nodes *u, Nodes *c);
	void setUser(Nodes *u);
	void setContact(Nodes *c);
	bool alreadyfriend(Nodes* Id); // compara si el ID es el mismo
	Nodes* getContact();
};
