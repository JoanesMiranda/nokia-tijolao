import styled from 'styled-components';
import base from '../../assets/base.png';
export const Container = styled.div`

  background: url(${base}) no-repeat;
  background-size:334px;
  width: 334px;
  height: 750px;

  .teclas {
    padding-top: 490px;
    padding-left: 45px;
    width: 334px;
    display: grid;
    grid-column-gap: 43px;
    grid-row-gap: 10px;
    grid-template-columns: repeat(3, 43px);

    button{
      width: 68px;
      background: none;
      color: inherit;
      border: none;
      padding: 0;
      font: inherit;
      cursor: pointer;
      outline: inherit;

      img{
        width: 68px;
      }

    }
  }  
`;