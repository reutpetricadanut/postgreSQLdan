// tabel dantabel
        CREATE TABLE dantable
        (
        userid bigserial NOT NULL,
        username character(25),
        parola character(25),
        varsta integer,
        oras character(25),
        blocat boolean,
        CONSTRAINT iduser PRIMARY KEY (userid)
        )
        WITH (
        OIDS=FALSE
        );
        ALTER TABLE dantable
        OWNER TO fasttrackit_dev;

        // inserare dantable
        INSERT INTO dantable (username,parola,varsta,oras,blocat) VALUES
        ('dan','234456','45','bucuresti','TRUE'),
        ('raluca','123456','22','suceava','FALSE'),
        ('ionut','654321','24','cluj-napoca','TRUE'),
        ('gheorghe','567890','55','brasov','FALSE'),
        ('stela','678923','45','oradea','TRUE'),
        ('stefan','2345678','32','cluj-napoca'),
        ('iulian','4451155','27','sibiu'),
        ('andreea','453166103','21','piatra-neamt'),
        ('vlad','41266887','56','botosani'),
        ('robert','54411815515','26','suceava'),
        ('iulian','123456','28','craiova'),
        ('petrica','567890','26','salaj')

        // tabel postare
        CREATE TABLE postare
        (
        idpostare bigserial NOT NULL,
        mesaj text,
        datapostarii character(25),
        fkuser character(15),
        CONSTRAINT idpostare PRIMARY KEY (idpostare)
        )
        WITH (
        OIDS=FALSE
        );
        ALTER TABLE postare
        OWNER TO fasttrackit_dev;

        //inserare postare
        NSERT INTO post (mesaj,datapostarii, fkuser) VALUES
        ('like','12.03.2007','2'),
        ('dislike','23.12.2016','1'),
        ('comment','04.08.2005','1'),
        ('share','05.09.2016','2'),
        ('like','23.04.2006','1'),
        ('share','14.02.2015','2'),
        ('block','01.01.2017','2'),
        ('comment','02.12.2017','2'),
        ('dislike','23.07.2001','1'),
        ('like','23.04.2000','1'),
        ('good','23.05.1999','1'),
        ('delete','14.09.2017','2')




// selectare username blocat
                SELECT
                username
                FROM
                dantable
                where blocat=true

//selectare username
                SELECT
                usernmae
                FROM
                dantable

//selectare varsta intre 30 si 50
                SELECT
                varsta
                FROM dantable
                WHERE varsta BETWEEN 20AND 40

//sortare username dupa varsta
                SELECT*
                FROM dantable
                ORDER BY varsta

//afisare mesaj ale userilor blocati din costarnta cu varsta peste 20 de ani
                SELECT postare.mesaj
                FROM postare
                INNER JOIN dantable
                ON dantable.userid=idpostare
                WHERE dantable.oras='bucuresti'AND dantable.blocat=TRUE AND dantable.varsta>20;