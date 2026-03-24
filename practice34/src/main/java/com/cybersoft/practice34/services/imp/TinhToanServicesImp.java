package com.cybersoft.practice34.services.imp;

import com.cybersoft.practice34.services.TinhToanServices;
import org.springframework.stereotype.Service;

@Service
public class TinhToanServicesImp implements TinhToanServices {

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int subtract(int x, int y) {
        return x - y;
    }

    @Override
    public int multiply(int x, int y) {
        return x * y;
    }

    @Override
    public double divide(int x, int y) {
        return x * 1.0 / y;
    }
}
