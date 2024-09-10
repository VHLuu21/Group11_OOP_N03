//Ý 2
public class DiscreteSignal implements Signal {
    private double amplitude;
    private double frequency;
    private double period;
    private double wavelength;

    public DiscreteSignal(double amplitude, double frequency, double period, double wavelength) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.period = period;
        this.wavelength = wavelength;
    }

    @Override
    public double getAmplitude() {
        return amplitude;
    }

    @Override
    public double getFrequency() {
        return frequency;
    }

    @Override
    public double getPeriod() {
        return period;
    }

    @Override
    public double getWavelength() {
        return wavelength;
    }
}
