class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder str = new StringBuilder(dnaStrand.length());

        for(int i=0; i< dnaStrand.length(); i++){
            switch(dnaStrand.charAt(i)){
                case 'G': str.append('C');
                    break;
                case 'C': str.append('G');
                    break;
                case 'T': str.append('A');
                    break;
                case 'A': str.append('U');
                    break;
                default: break;
            }
        }
        return str.toString();
}
}