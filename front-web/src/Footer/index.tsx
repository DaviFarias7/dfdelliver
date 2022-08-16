import './styles.css';
import { ReactComponent as InstagramIcon } from './instagram.svg';
import { ReactComponent as LinkedinIcon } from './linkedin.svg';

function Footer() {
    return (
        <footer className='main-footer'>
            App desenvido por Davi Farias
            <div className='footer-icons'>
                <a href='https://www.instagram.com/davic.farias7/' target="_new">
                    <InstagramIcon />
                </a>
                <a href='https://www.linkedin.com/in/davi-farias-14560321b/' target="_new">
                    <LinkedinIcon />
                </a>
            </div>
        </footer>
    )
}
export default Footer;