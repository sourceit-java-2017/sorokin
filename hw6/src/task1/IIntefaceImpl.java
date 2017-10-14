package task1;

import exceptions.DBException;

import javax.xml.bind.DataBindingException;

public class IIntefaceImpl implements IInterface {
    @Override
    public void first() {
        try {
            throw new DBException("DB Exception");
        } catch (DBException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void second() {
        throw new RuntimeException("Runtime Exception");
    }
}
