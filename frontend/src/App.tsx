import React from 'react';
import { BrowserRouter } from 'react-router-dom';

import GlobalStyle from './styles/global';

import Nokia from './pages/nokia';


const App: React.FC = () => (
    <>
        <BrowserRouter>
            <Nokia />
        </BrowserRouter>
        <GlobalStyle />
    </>
)

export default App;
