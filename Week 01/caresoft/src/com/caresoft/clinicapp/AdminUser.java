package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;

    public AdminUser(Integer id, String role) {
        this.id = id;
        this.role = role;
        this.securityIncidents = new ArrayList<>();
    }

    @Override
    public boolean assignPin(int pin) {
        if (String.valueOf(pin).length() >= 6) {
            this.pin = pin;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        if (!this.id.equals(confirmedAuthID)) {
            this.authIncident();
            return false;
        } else {
            return true;
        }
    }

    @Override
    public ArrayList<String> reportSecurityIncidents() {
        return this.securityIncidents;
    }

    public void newIncident(String notes) {
        String report = String.format("Datetime Submitted: %s \n, Reported By ID: %s\n Notes: %s \n",
                new Date(), this.id, notes);
        securityIncidents.add(report);
    }

    public void authIncident() {
        String report = String.format("Datetime Submitted: %s \n, ID: %s\n Notes: %s \n",
                new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER");
        securityIncidents.add(report);
    }

    // TO DO: Setters & Getters
}
