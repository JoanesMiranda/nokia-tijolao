import React from 'react';
import {Container } from './styles';

import base from '../../assets/base.png';
import bt0 from '../../assets/bt0.png';
import bt1 from '../../assets/bt1.png';
import bt2 from '../../assets/bt2.png';
import bt3 from '../../assets/bt3.png';
import bt4 from '../../assets/bt4.png';
import bt5 from '../../assets/bt5.png';
import bt6 from '../../assets/bt6.png';
import bt7 from '../../assets/bt7.png';
import bt8 from '../../assets/bt8.png';
import bt9 from '../../assets/bt9.png';
import btAst from '../../assets/btAst.png';
import btHash from '../../assets/btHash.png';
import enter from '../../assets/enter.png';



const Nokia: React.FC = () => {

    return (
        <>
        <Container>
           <img src={base} alt="Github Explorer" />
           <button><img src={bt0}/> </button>
           <button><img src={bt1}/> </button>
           <button><img src={bt2}/> </button>
           <button><img src={bt3}/> </button>
           <button><img src={bt4}/> </button>
           <button><img src={bt5}/> </button>
           <button><img src={bt6}/> </button>
           <button><img src={bt7}/> </button>
           <button><img src={bt8}/> </button>
           <button><img src={bt9}/> </button>
           <button><img src={btAst}/> </button>
           <button><img src={btHash}/> </button>
           <button><img src={enter}/> </button>

        </Container>
        </>
    )
}

export default Nokia;