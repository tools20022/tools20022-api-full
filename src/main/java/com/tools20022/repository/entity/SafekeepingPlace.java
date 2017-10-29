/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.SafekeepingPlaceCode;
import com.tools20022.repository.entity.SecuritiesPartyRole;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Organisation used as the safekeeping place for the securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SafekeepingPlace" src="doc-files/SafekeepingPlace.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#SafekeepingPlaceType
 * SafekeepingPlace.SafekeepingPlaceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SafekeepingPlace#Country
 * SafekeepingPlace.Country}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#RelatedSecuritiesAccount
 * SafekeepingPlace.RelatedSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#SecuritiesBalance
 * SafekeepingPlace.SecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#SecuritiesSettlement
 * SafekeepingPlace.SecuritiesSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#CountryForSafekeepingPlace
 * Country.CountryForSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SafekeepingPlace
 * SecuritiesAccount.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#RequestedSafekeepingPlace
 * SecuritiesSettlement.RequestedSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SafekeepingPlace
 * SecuritiesBalance.SafekeepingPlace}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#SafekeepingPlace
 * InvestmentAccount10.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#SafekeepingPlace
 * InvestmentAccount22.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice#Identification
 * SafekeepingPlaceFormat3Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice#TypeAndIdentification
 * SafekeepingPlaceFormat3Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount29#SafekeepingPlace
 * QuantityAndAccount29.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30#SafekeepingPlace
 * QuantityAndAccount30.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice#Identification
 * SafekeepingPlaceFormat4Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice#TypeAndIdentification
 * SafekeepingPlaceFormat4Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount32#SafekeepingPlace
 * QuantityAndAccount32.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33#SafekeepingPlace
 * QuantityAndAccount33.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice#Identification
 * SafekeepingPlaceFormat2Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice#TypeAndIdentification
 * SafekeepingPlaceFormat2Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice#Identification
 * SafekeepingPlaceFormat5Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice#TypeAndIdentification
 * SafekeepingPlaceFormat5Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance2#SafekeepingPlace
 * AccountAndBalance2.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance5#SafekeepingPlace
 * AccountAndBalance5.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance10#SafekeepingPlace
 * AccountAndBalance10.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance12#SafekeepingPlace
 * AccountAndBalance12.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance17#SafekeepingPlace
 * AccountAndBalance17.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance20#SafekeepingPlace
 * AccountAndBalance20.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#SafekeepingPlace
 * CorporateActionOption9.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#SafekeepingPlace
 * CorporateActionOption18.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#SafekeepingPlace
 * CorporateActionOption22.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#SafekeepingPlace
 * CorporateActionOption27.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#SafekeepingPlace
 * CorporateActionOption26.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#SafekeepingPlace
 * CorporateActionOption41.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#SafekeepingPlace
 * CorporateActionOption50.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification25#SafekeepingPlace
 * AccountIdentification25.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification29#SafekeepingPlace
 * AccountIdentification29.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#SafekeepingPlace
 * CorporateActionOption29.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance3#SafekeepingPlace
 * AccountAndBalance3.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#SafekeepingPlace
 * SecuritiesOption3.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance6#SafekeepingPlace
 * AccountAndBalance6.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#SafekeepingPlace
 * SecuritiesOption8.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance11#SafekeepingPlace
 * AccountAndBalance11.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#SafekeepingPlace
 * SecuritiesOption18.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance13#SafekeepingPlace
 * AccountAndBalance13.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#SafekeepingPlace
 * SecuritiesOption20.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance16#SafekeepingPlace
 * AccountAndBalance16.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#SafekeepingPlace
 * SecuritiesOption26.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance19#SafekeepingPlace
 * AccountAndBalance19.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#SafekeepingPlace
 * SecuritiesOption31.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance22#SafekeepingPlace
 * AccountAndBalance22.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#SafekeepingPlace
 * SecuritiesOption35.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance23#SafekeepingPlace
 * AccountAndBalance23.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#SafekeepingPlace
 * SecuritiesOption36.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance1#SafekeepingPlace
 * AccountAndBalance1.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#SafekeepingPlace
 * SecuritiesOption4.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance7#SafekeepingPlace
 * AccountAndBalance7.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#SafekeepingPlace
 * SecuritiesOption10.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance9#SafekeepingPlace
 * AccountAndBalance9.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#SafekeepingPlace
 * SecuritiesOption13.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance14#SafekeepingPlace
 * AccountAndBalance14.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#SafekeepingPlace
 * SecuritiesOption17.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance15#SafekeepingPlace
 * AccountAndBalance15.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#SafekeepingPlace
 * SecuritiesOption24.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance18#SafekeepingPlace
 * AccountAndBalance18.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#SafekeepingPlace
 * SecuritiesOption29.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance21#SafekeepingPlace
 * AccountAndBalance21.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#SafekeepingPlace
 * SecuritiesOption38.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance24#SafekeepingPlace
 * AccountAndBalance24.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#SafekeepingPlace
 * SecuritiesOption39.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails3#SafekeepingPlace
 * IntraPositionDetails3.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails6#SafekeepingPlace
 * IntraPositionDetails6.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails17#SafekeepingPlace
 * IntraPositionDetails17.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails18#SafekeepingPlace
 * IntraPositionDetails18.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails20#SafekeepingPlace
 * IntraPositionDetails20.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails24#SafekeepingPlace
 * IntraPositionDetails24.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails28#SafekeepingPlace
 * IntraPositionDetails28.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails30#SafekeepingPlace
 * IntraPositionDetails30.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace7.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#SafekeepingPlace
 * AggregateBalanceInformation8.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace10.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#SafekeepingPlace
 * AggregateBalanceInformation11.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice#Identification
 * SafekeepingPlaceFormatChoice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace2.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#SafekeepingPlace
 * AggregateBalanceInformation2.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace4.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#SafekeepingPlace
 * AggregateBalanceInformation3.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace12.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#SafekeepingPlace
 * AggregateBalanceInformation13.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace14.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#SafekeepingPlace
 * AggregateBalanceInformation15.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace16.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#SafekeepingPlace
 * AggregateBalanceInformation17.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace18.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#SafekeepingPlace
 * AggregateBalanceInformation19.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace21.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#SafekeepingPlace
 * AggregateBalanceInformation22.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace22.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#SafekeepingPlace
 * AggregateBalanceInformation23.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace8.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#SafekeepingPlace
 * AggregateBalanceInformation9.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace9.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#SafekeepingPlace
 * AggregateBalanceInformation10.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace1.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#SafekeepingPlace
 * AggregateBalanceInformation1.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace3.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#SafekeepingPlace
 * AggregateBalanceInformation4.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace11.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#SafekeepingPlace
 * AggregateBalanceInformation12.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace13.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#SafekeepingPlace
 * AggregateBalanceInformation14.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace15.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#SafekeepingPlace
 * AggregateBalanceInformation16.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace17.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#SafekeepingPlace
 * AggregateBalanceInformation18.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace20.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#SafekeepingPlace
 * AggregateBalanceInformation21.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace23.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#SafekeepingPlace
 * AggregateBalanceInformation24.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#SafekeepingPlace
 * QuantityAndAccount6.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#SafekeepingPlace
 * QuantityAndAccount11.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#SafekeepingPlace
 * QuantityAndAccount18.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#SafekeepingPlace
 * QuantityAndAccount19.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1#SafekeepingPlace
 * QuantityAndAccount1.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5#SafekeepingPlace
 * QuantityAndAccount5.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17#SafekeepingPlace
 * QuantityAndAccount17.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24#SafekeepingPlace
 * QuantityAndAccount24.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25#SafekeepingPlace
 * QuantityAndAccount25.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34#SafekeepingPlace
 * QuantityAndAccount34.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#SafekeepingPlace
 * QuantityAndAccount2.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#SafekeepingPlace
 * QuantityAndAccount12.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#SafekeepingPlace
 * QuantityAndAccount15.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#SafekeepingPlace
 * QuantityAndAccount20.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#SafekeepingPlace
 * QuantityAndAccount28.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#SafekeepingPlace
 * QuantityAndAccount37.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#SafekeepingPlace
 * TransactionDetails5.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#SafekeepingPlace
 * TransactionDetails9.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#SafekeepingPlace
 * TransactionDetails22.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#SafekeepingPlace
 * TransactionDetails23.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#SafekeepingPlace
 * TransactionDetails36.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#SafekeepingPlace
 * TransactionDetails47.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#SafekeepingPlace
 * TransactionDetails53.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#SafekeepingPlace
 * TransactionDetails58.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#SafekeepingPlace
 * TransactionDetails7.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#SafekeepingPlace
 * TransactionDetails8.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#SafekeepingPlace
 * TransactionDetails16.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#SafekeepingPlace
 * TransactionDetails17.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#SafekeepingPlace
 * TransactionDetails26.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#SafekeepingPlace
 * TransactionDetails25.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#SafekeepingPlace
 * TransactionDetails27.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#SafekeepingPlace
 * TransactionDetails33.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#SafekeepingPlace
 * TransactionDetails39.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#SafekeepingPlace
 * TransactionDetails50.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#SafekeepingPlace
 * TransactionDetails56.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#SafekeepingPlace
 * TransactionDetails59.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#SafekeepingPlace
 * TransactionDetails6.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails2#SafekeepingPlace
 * FinancialInstrumentDetails2.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#SafekeepingPlace
 * TransactionDetails18.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails3#SafekeepingPlace
 * FinancialInstrumentDetails3.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#SafekeepingPlace
 * TransactionDetails24.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails5#SafekeepingPlace
 * FinancialInstrumentDetails5.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#SafekeepingPlace
 * TransactionDetails34.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails8#SafekeepingPlace
 * FinancialInstrumentDetails8.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#SafekeepingPlace
 * TransactionDetails37.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails9#SafekeepingPlace
 * FinancialInstrumentDetails9.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#SafekeepingPlace
 * TransactionDetails48.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails11#SafekeepingPlace
 * FinancialInstrumentDetails11.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#SafekeepingPlace
 * TransactionDetails57.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails13#SafekeepingPlace
 * FinancialInstrumentDetails13.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#SafekeepingPlace
 * TransactionDetails60.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails16#SafekeepingPlace
 * FinancialInstrumentDetails16.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance2#SafekeepingPlace
 * HoldingBalance2.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance3#SafekeepingPlace
 * HoldingBalance3.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance6#SafekeepingPlace
 * HoldingBalance6.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance4#SafekeepingPlace
 * HoldingBalance4.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance5#SafekeepingPlace
 * HoldingBalance5.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDescription3#SafekeepingPlace
 * FinancialInstrumentDescription3.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount7#SafekeepingPlace
 * QuantityAndAccount7.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount16#SafekeepingPlace
 * QuantityAndAccount16.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#SafekeepingPlace
 * SecuritiesFinancingTransactionDetails2.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#SafekeepingPlace
 * SecuritiesFinancingTransactionDetails8.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#SafekeepingPlace
 * QuantityAndAccount3.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13#SafekeepingPlace
 * QuantityAndAccount13.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8#SafekeepingPlace
 * QuantityAndAccount8.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount14#SafekeepingPlace
 * QuantityAndAccount14.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount10#SafekeepingPlace
 * QuantityAndAccount10.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount21#SafekeepingPlace
 * QuantityAndAccount21.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#SafekeepingPlace
 * SecuritiesFinancingTransactionDetails6.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#SafekeepingPlace
 * SecuritiesFinancingTransactionDetails10.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#SafekeepingPlace
 * SecuritiesFinancingTransactionDetails17.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#SafekeepingPlace
 * SecuritiesFinancingTransactionDetails18.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#SafekeepingPlace
 * QuantityAndAccount4.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22#SafekeepingPlace
 * QuantityAndAccount22.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27#SafekeepingPlace
 * QuantityAndAccount27.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36#SafekeepingPlace
 * QuantityAndAccount36.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9#SafekeepingPlace
 * QuantityAndAccount9.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount23#SafekeepingPlace
 * QuantityAndAccount23.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount26#SafekeepingPlace
 * QuantityAndAccount26.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount35#SafekeepingPlace
 * QuantityAndAccount35.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails10#SafekeepingPlace
 * IntraPositionDetails10.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails14#SafekeepingPlace
 * IntraPositionDetails14.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#SafekeepingPlace
 * TransactionDetails51.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace19.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#SafekeepingPlace
 * AggregateBalanceInformation20.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8#SafekeepingPlace
 * CorporateActionOption8.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice#TypeAndIdentification
 * SafekeepingPlaceFormat1Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice#Type
 * SafekeepingPlaceFormat1Choice.Type}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace6.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#SafekeepingPlace
 * AggregateBalanceInformation6.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace5.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#SafekeepingPlace
 * AggregateBalanceInformation7.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#SafekeepingPlace
 * InvestmentAccount40.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#SafekeepingPlace
 * TransactionDetails61.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails17#SafekeepingPlace
 * FinancialInstrumentDetails17.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#SafekeepingPlace
 * SecuritiesFinancingTransactionDetails21.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#SafekeepingPlace
 * TransactionDetails62.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#SafekeepingPlace
 * TransactionDetails63.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance26#SafekeepingPlace
 * AccountAndBalance26.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#SafekeepingPlace
 * SecuritiesOption42.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance25#SafekeepingPlace
 * AccountAndBalance25.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#SafekeepingPlace
 * SecuritiesOption40.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance32#SafekeepingPlace
 * AccountAndBalance32.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance29#SafekeepingPlace
 * AccountAndBalance29.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#SafekeepingPlace
 * SecuritiesOption48.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#SafekeepingPlace
 * SecuritiesOption45.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails18#SafekeepingPlace
 * FinancialInstrumentDetails18.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#SafekeepingPlace
 * SecuritiesFinancingTransactionDetails22.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#SafekeepingPlace
 * TransactionDetails66.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#SafekeepingPlace
 * TransactionDetails67.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#SafekeepingPlace
 * TransactionDetails68.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#SafekeepingPlace
 * SecuritiesFinancingTransactionDetails24.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#SafekeepingPlace
 * TransactionDetails70.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#SafekeepingPlace
 * TransactionDetails69.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#SafekeepingPlace
 * AggregateBalanceInformation26.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#SafekeepingPlace
 * AggregateBalanceInformation25.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace24.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace25.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice#Identification
 * SafekeepingPlaceFormat7Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice#TypeAndIdentification
 * SafekeepingPlaceFormat7Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#SafekeepingPlace
 * SecuritiesCollateral2.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#SafekeepingPlace
 * OtherCollateral2.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#SafekeepingPlace
 * SecuritiesCollateral3.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#SafekeepingPlace
 * OtherCollateral3.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance8#SafekeepingPlace
 * HoldingBalance8.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance7#SafekeepingPlace
 * HoldingBalance7.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#SafekeepingPlace
 * OtherCollateral4.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#SafekeepingPlace
 * SecuritiesCollateral4.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#SafekeepingPlace
 * AggregateBalanceInformation28.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#SafekeepingPlace
 * TransactionDetails71.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#SafekeepingPlace
 * SecuritiesFinancingTransactionDetails25.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#SafekeepingPlace
 * AggregateBalanceInformation27.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace26.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace27.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#SafekeepingPlace
 * TransactionDetails72.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#SafekeepingPlace
 * QuantityAndAccount39.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#SafekeepingPlace
 * AggregateBalanceInformation30.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#SafekeepingPlace
 * QuantityAndAccount41.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails20#SafekeepingPlace
 * FinancialInstrumentDetails20.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#SafekeepingPlace
 * QuantityAndAccount40.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#SafekeepingPlace
 * QuantityAndAccount42.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount38#SafekeepingPlace
 * QuantityAndAccount38.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#SafekeepingPlace
 * SecuritiesFinancingTransactionDetails26.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#SafekeepingPlace
 * TransactionDetails79.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#SafekeepingPlace
 * AggregateBalanceInformation31.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace28.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#SafekeepingPlace
 * QuantityAndAccount43.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#SafekeepingPlace
 * TransactionDetails75.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace29.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#SafekeepingPlace
 * TransactionDetails78.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice#Identification
 * SafekeepingPlaceFormat8Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice#TypeAndIdentification
 * SafekeepingPlaceFormat8Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#Identification
 * SafekeepingPlaceFormat10Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#TypeAndIdentification
 * SafekeepingPlaceFormat10Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount45#SafekeepingPlace
 * QuantityAndAccount45.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails32#SafekeepingPlace
 * IntraPositionDetails32.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount44#SafekeepingPlace
 * QuantityAndAccount44.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance34#SafekeepingPlace
 * AccountAndBalance34.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance35#SafekeepingPlace
 * AccountAndBalance35.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification33#SafekeepingPlace
 * AccountIdentification33.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#SafekeepingPlace
 * CorporateActionOption116.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance33#SafekeepingPlace
 * AccountAndBalance33.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#SafekeepingPlace
 * SecuritiesOption49.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#SafekeepingPlace
 * SecuritiesOption50.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#SafekeepingPlace
 * InvestmentAccount54.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#SafekeepingPlace
 * InvestmentAccount56.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#SafekeepingPlace
 * InvestmentAccount57.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#SafekeepingPlace
 * OtherCollateral7.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#SafekeepingPlace
 * OtherCollateral6.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#SafekeepingPlace
 * SecuritiesCollateral6.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#SafekeepingPlace
 * SecuritiesCollateral5.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#SafekeepingPlace
 * OtherCollateral5.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#SafekeepingPlace
 * SecuritiesCollateral7.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#SafekeepingPlace
 * CorporateActionOption121.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance38#SafekeepingPlace
 * AccountAndBalance38.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification35#SafekeepingPlace
 * AccountIdentification35.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance37#SafekeepingPlace
 * AccountAndBalance37.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#SafekeepingPlace
 * SecuritiesOption55.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat11Choice#Identification
 * SafekeepingPlaceFormat11Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat11Choice#TypeAndIdentification
 * SafekeepingPlaceFormat11Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#SafekeepingPlace
 * SecuritiesOption57.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance39#SafekeepingPlace
 * AccountAndBalance39.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice#Identification
 * SafekeepingPlaceFormat17Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice#TypeAndIdentification
 * SafekeepingPlaceFormat17Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails23#SafekeepingPlace
 * FinancialInstrumentDetails23.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47#SafekeepingPlace
 * QuantityAndAccount47.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#SafekeepingPlace
 * SecuritiesFinancingTransactionDetails33.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#SafekeepingPlace
 * AggregateBalanceInformation32.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount48#SafekeepingPlace
 * QuantityAndAccount48.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#SafekeepingPlace
 * QuantityAndAccount46.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#SafekeepingPlace
 * AggregateBalanceInformation33.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#SafekeepingPlace
 * QuantityAndAccount51.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#SafekeepingPlace
 * TransactionDetails87.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount49#SafekeepingPlace
 * QuantityAndAccount49.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace31.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#SafekeepingPlace
 * TransactionDetails91.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount50#SafekeepingPlace
 * QuantityAndAccount50.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#SafekeepingPlace
 * TransactionDetails90.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#SafekeepingPlace
 * AggregateBalancePerSafekeepingPlace30.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55#SafekeepingPlace
 * QuantityAndAccount55.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount54#SafekeepingPlace
 * QuantityAndAccount54.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails37#SafekeepingPlace
 * IntraPositionDetails37.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice#Identification
 * SafekeepingPlaceFormat26Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice#TypeAndIdentification
 * SafekeepingPlaceFormat26Choice.TypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification40#SafekeepingPlace
 * AccountIdentification40.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#SafekeepingPlace
 * SecuritiesOption60.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#SafekeepingPlace
 * SecuritiesOption59.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25#SafekeepingPlace
 * FinancialInstrumentDetails25.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#SafekeepingPlace
 * TransactionDetails97.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#SafekeepingPlace
 * SecuritiesFinancingTransactionDetails35.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#SafekeepingPlace
 * TransactionDetails96.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails40#SafekeepingPlace
 * IntraPositionDetails40.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#SafekeepingPlace
 * TransactionDetails95.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#SafekeepingPlace
 * SecuritiesCollateral8.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails27#SafekeepingPlace
 * FinancialInstrumentDetails27.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification41#SafekeepingPlace
 * AccountIdentification41.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#SafekeepingPlace
 * SecuritiesFinancingTransactionDetails36.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#SafekeepingPlace
 * SecuritiesOption61.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails44#SafekeepingPlace
 * IntraPositionDetails44.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#SafekeepingPlace
 * SecuritiesOption63.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#SafekeepingPlace
 * TransactionDetails100.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#SafekeepingPlace
 * TransactionDetails99.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#SafekeepingPlace
 * TransactionDetails98.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#SafekeepingPlace
 * QuantityAndAccount57.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount58#SafekeepingPlace
 * QuantityAndAccount58.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56#SafekeepingPlace
 * QuantityAndAccount56.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount61#SafekeepingPlace
 * QuantityAndAccount61.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#SafekeepingPlace
 * QuantityAndAccount62.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount59#SafekeepingPlace
 * QuantityAndAccount59.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60#SafekeepingPlace
 * QuantityAndAccount60.SafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice#Identification
 * SafekeepingPlaceFormat27Choice.Identification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice#TypeAndIdentification
 * SafekeepingPlaceFormat27Choice.TypeAndIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
 * SecuritiesPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText3
 * SafekeepingPlaceTypeAndText3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1
 * SafekeepingPlaceTypeAndAnyBICIdentifier1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice
 * SafekeepingPlaceFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4
 * SafekeepingPlaceTypeAndText4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice
 * SafekeepingPlaceFormat4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2
 * SafekeepingPlaceTypeAndText2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice
 * SafekeepingPlaceFormat2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText5
 * SafekeepingPlaceTypeAndText5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice
 * SafekeepingPlaceFormat5Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceAsCodeAndPartyIdentification
 * SafekeepingPlaceAsCodeAndPartyIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice
 * SafekeepingPlaceFormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1
 * SafekeepingPlaceTypeAndText1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice
 * SafekeepingPlaceFormat1Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice
 * SafekeepingPlaceFormat7Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice
 * SafekeepingPlaceFormat8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText6
 * SafekeepingPlaceTypeAndText6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice
 * SafekeepingPlaceFormat10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText8
 * SafekeepingPlaceTypeAndText8}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat11Choice
 * SafekeepingPlaceFormat11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText9
 * SafekeepingPlaceTypeAndText9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText15
 * SafekeepingPlaceTypeAndText15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice
 * SafekeepingPlaceFormat17Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice
 * SafekeepingPlaceFormat26Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText25
 * SafekeepingPlaceTypeAndText25}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice
 * SafekeepingPlaceFormat27Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SafekeepingPlace"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organisation used as the safekeeping place for the securities."</li>
 * </ul>
 */
public class SafekeepingPlace extends SecuritiesPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Place of safekeeping.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SafekeepingPlaceCode
	 * SafekeepingPlaceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText3#SafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText3.SafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1#SafekeepingPlaceType
	 * SafekeepingPlaceTypeAndAnyBICIdentifier1.SafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4#SafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText4.SafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2#SafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText2.SafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText5#SafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText5.SafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1#SafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText1.SafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText6#SafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText6.SafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText8#SafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText8.SafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText9#SafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText9.SafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText15#SafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText15.SafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText25#SafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText25.SafekeepingPlaceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingPlaceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place of safekeeping."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute SafekeepingPlaceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SafekeepingPlaceTypeAndText3.SafekeepingPlaceType, com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1.SafekeepingPlaceType,
					com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4.SafekeepingPlaceType, com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2.SafekeepingPlaceType,
					com.tools20022.repository.msg.SafekeepingPlaceTypeAndText5.SafekeepingPlaceType, com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1.SafekeepingPlaceType,
					com.tools20022.repository.msg.SafekeepingPlaceTypeAndText6.SafekeepingPlaceType, com.tools20022.repository.msg.SafekeepingPlaceTypeAndText8.SafekeepingPlaceType,
					com.tools20022.repository.msg.SafekeepingPlaceTypeAndText9.SafekeepingPlaceType, com.tools20022.repository.msg.SafekeepingPlaceTypeAndText15.SafekeepingPlaceType,
					com.tools20022.repository.msg.SafekeepingPlaceTypeAndText25.SafekeepingPlaceType);
			elementContext_lazy = () -> SafekeepingPlace.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlaceType";
			definition = "Place of safekeeping.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> SafekeepingPlaceCode.mmObject();
		}
	};
	/**
	 * Country where the financial instruments are/will be safekept.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#CountryForSafekeepingPlace
	 * Country.CountryForSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Country Country}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice#Country
	 * SafekeepingPlaceFormat3Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice#Country
	 * SafekeepingPlaceFormat4Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice#Country
	 * SafekeepingPlaceFormat2Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice#Country
	 * SafekeepingPlaceFormat5Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice#Country
	 * SafekeepingPlaceFormat1Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice#Country
	 * SafekeepingPlaceFormat7Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice#Country
	 * SafekeepingPlaceFormat8Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#Country
	 * SafekeepingPlaceFormat10Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat11Choice#Country
	 * SafekeepingPlaceFormat11Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice#Country
	 * SafekeepingPlaceFormat17Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice#Country
	 * SafekeepingPlaceFormat26Choice.Country}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice#Country
	 * SafekeepingPlaceFormat27Choice.Country}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Country"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country where the financial instruments are/will be safekept."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Country = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice.Country, com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice.Country,
					com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice.Country, com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice.Country, com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice.Country,
					com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice.Country, com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice.Country, com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice.Country,
					com.tools20022.repository.choice.SafekeepingPlaceFormat11Choice.Country, com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice.Country, com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice.Country,
					com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice.Country);
			elementContext_lazy = () -> SafekeepingPlace.mmObject();
			isDerived = true;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country where the financial instruments are/will be safekept.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Country.CountryForSafekeepingPlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Account at the safekeeping place where financial instruments are
	 * safekept.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#SafekeepingPlace
	 * SecuritiesAccount.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesAccount
	 * SecuritiesAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account at the safekeeping place where financial instruments are safekept."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedSecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SafekeepingPlace.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesAccount";
			definition = "Account at the safekeeping place where financial instruments are safekept.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.SafekeepingPlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Balance which is held at a safekeeping place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#SafekeepingPlace
	 * SecuritiesBalance.SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesBalance
	 * SecuritiesBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance which is held at a safekeeping place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SafekeepingPlace.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Balance which is held at a safekeeping place.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.SafekeepingPlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the settlement operation which uses the safekeeping place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#RequestedSafekeepingPlace
	 * SecuritiesSettlement.RequestedSafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace
	 * SafekeepingPlace}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement operation which uses the safekeeping place."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd SecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SafekeepingPlace.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Specifies the settlement operation which uses the safekeeping place.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.RequestedSafekeepingPlace;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlace";
				definition = "Organisation used as the safekeeping place for the securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.CountryForSafekeepingPlace, com.tools20022.repository.entity.SecuritiesAccount.SafekeepingPlace,
						com.tools20022.repository.entity.SecuritiesSettlement.RequestedSafekeepingPlace, com.tools20022.repository.entity.SecuritiesBalance.SafekeepingPlace);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentAccount10.SafekeepingPlace, com.tools20022.repository.msg.InvestmentAccount22.SafekeepingPlace,
						com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice.Identification, com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice.TypeAndIdentification,
						com.tools20022.repository.msg.QuantityAndAccount29.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount30.SafekeepingPlace,
						com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice.Identification, com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice.TypeAndIdentification,
						com.tools20022.repository.msg.QuantityAndAccount32.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount33.SafekeepingPlace,
						com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice.Identification, com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice.TypeAndIdentification,
						com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice.Identification, com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice.TypeAndIdentification,
						com.tools20022.repository.msg.AccountAndBalance2.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance5.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance10.SafekeepingPlace,
						com.tools20022.repository.msg.AccountAndBalance12.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance17.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance20.SafekeepingPlace,
						com.tools20022.repository.msg.CorporateActionOption9.SafekeepingPlace, com.tools20022.repository.msg.CorporateActionOption18.SafekeepingPlace, com.tools20022.repository.msg.CorporateActionOption22.SafekeepingPlace,
						com.tools20022.repository.msg.CorporateActionOption27.SafekeepingPlace, com.tools20022.repository.msg.CorporateActionOption26.SafekeepingPlace, com.tools20022.repository.msg.CorporateActionOption41.SafekeepingPlace,
						com.tools20022.repository.msg.CorporateActionOption50.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification25.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification29.SafekeepingPlace,
						com.tools20022.repository.msg.CorporateActionOption29.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance3.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption3.SafekeepingPlace,
						com.tools20022.repository.msg.AccountAndBalance6.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption8.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance11.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesOption18.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance13.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption20.SafekeepingPlace,
						com.tools20022.repository.msg.AccountAndBalance16.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption26.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance19.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesOption31.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance22.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption35.SafekeepingPlace,
						com.tools20022.repository.msg.AccountAndBalance23.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption36.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance1.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesOption4.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance7.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption10.SafekeepingPlace,
						com.tools20022.repository.msg.AccountAndBalance9.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption13.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance14.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesOption17.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance15.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption24.SafekeepingPlace,
						com.tools20022.repository.msg.AccountAndBalance18.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption29.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance21.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesOption38.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance24.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption39.SafekeepingPlace,
						com.tools20022.repository.msg.IntraPositionDetails3.SafekeepingPlace, com.tools20022.repository.msg.IntraPositionDetails6.SafekeepingPlace, com.tools20022.repository.msg.IntraPositionDetails17.SafekeepingPlace,
						com.tools20022.repository.msg.IntraPositionDetails18.SafekeepingPlace, com.tools20022.repository.msg.IntraPositionDetails20.SafekeepingPlace, com.tools20022.repository.msg.IntraPositionDetails24.SafekeepingPlace,
						com.tools20022.repository.msg.IntraPositionDetails28.SafekeepingPlace, com.tools20022.repository.msg.IntraPositionDetails30.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalanceInformation8.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalanceInformation11.SafekeepingPlace,
						com.tools20022.repository.choice.SafekeepingPlaceFormatChoice.Identification, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation2.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation3.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation13.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation15.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation17.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation19.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation22.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation23.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation9.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation10.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation1.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation4.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation12.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation14.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation16.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation18.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation21.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation24.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount6.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount11.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount18.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount19.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount1.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount5.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount17.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount24.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount25.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount34.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount2.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount12.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount15.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount20.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount28.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount37.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails5.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails9.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails22.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails23.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails36.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails47.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails53.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails58.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails7.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails8.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails16.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails17.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails26.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails25.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails27.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails33.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails39.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails50.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails56.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails59.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails6.SafekeepingPlace, com.tools20022.repository.msg.FinancialInstrumentDetails2.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails18.SafekeepingPlace, com.tools20022.repository.msg.FinancialInstrumentDetails3.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails24.SafekeepingPlace,
						com.tools20022.repository.msg.FinancialInstrumentDetails5.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails34.SafekeepingPlace,
						com.tools20022.repository.msg.FinancialInstrumentDetails8.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails37.SafekeepingPlace,
						com.tools20022.repository.msg.FinancialInstrumentDetails9.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails48.SafekeepingPlace,
						com.tools20022.repository.msg.FinancialInstrumentDetails11.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails57.SafekeepingPlace,
						com.tools20022.repository.msg.FinancialInstrumentDetails13.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails60.SafekeepingPlace,
						com.tools20022.repository.msg.FinancialInstrumentDetails16.SafekeepingPlace, com.tools20022.repository.msg.HoldingBalance2.SafekeepingPlace, com.tools20022.repository.msg.HoldingBalance3.SafekeepingPlace,
						com.tools20022.repository.msg.HoldingBalance6.SafekeepingPlace, com.tools20022.repository.msg.HoldingBalance4.SafekeepingPlace, com.tools20022.repository.msg.HoldingBalance5.SafekeepingPlace,
						com.tools20022.repository.msg.FinancialInstrumentDescription3.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount7.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount16.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount3.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount13.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount8.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount14.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount10.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount21.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount4.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount22.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount27.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount36.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount9.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount23.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount26.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount35.SafekeepingPlace, com.tools20022.repository.msg.IntraPositionDetails10.SafekeepingPlace,
						com.tools20022.repository.msg.IntraPositionDetails14.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails51.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalanceInformation20.SafekeepingPlace,
						com.tools20022.repository.msg.CorporateActionOption8.SafekeepingPlace, com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice.TypeAndIdentification,
						com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice.Type, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation6.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation7.SafekeepingPlace, com.tools20022.repository.msg.InvestmentAccount40.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails61.SafekeepingPlace,
						com.tools20022.repository.msg.FinancialInstrumentDetails17.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails62.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails63.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance26.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesOption42.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance25.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption40.SafekeepingPlace,
						com.tools20022.repository.msg.AccountAndBalance32.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance29.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption48.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesOption45.SafekeepingPlace, com.tools20022.repository.msg.FinancialInstrumentDetails18.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails66.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails67.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails68.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails70.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails69.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalanceInformation26.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation25.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25.SafekeepingPlace, com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice.Identification,
						com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice.TypeAndIdentification, com.tools20022.repository.msg.SecuritiesCollateral2.SafekeepingPlace,
						com.tools20022.repository.msg.OtherCollateral2.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesCollateral3.SafekeepingPlace, com.tools20022.repository.msg.OtherCollateral3.SafekeepingPlace,
						com.tools20022.repository.msg.HoldingBalance8.SafekeepingPlace, com.tools20022.repository.msg.HoldingBalance7.SafekeepingPlace, com.tools20022.repository.msg.OtherCollateral4.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesCollateral4.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalanceInformation28.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails71.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation27.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails72.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount39.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalanceInformation30.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount41.SafekeepingPlace,
						com.tools20022.repository.msg.FinancialInstrumentDetails20.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount40.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount42.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount38.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails79.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalanceInformation31.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount43.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails75.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails78.SafekeepingPlace, com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice.Identification,
						com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice.TypeAndIdentification, com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice.Identification,
						com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice.TypeAndIdentification, com.tools20022.repository.msg.QuantityAndAccount45.SafekeepingPlace,
						com.tools20022.repository.msg.IntraPositionDetails32.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount44.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance34.SafekeepingPlace,
						com.tools20022.repository.msg.AccountAndBalance35.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification33.SafekeepingPlace, com.tools20022.repository.msg.CorporateActionOption116.SafekeepingPlace,
						com.tools20022.repository.msg.AccountAndBalance33.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption49.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption50.SafekeepingPlace,
						com.tools20022.repository.msg.InvestmentAccount54.SafekeepingPlace, com.tools20022.repository.msg.InvestmentAccount56.SafekeepingPlace, com.tools20022.repository.msg.InvestmentAccount57.SafekeepingPlace,
						com.tools20022.repository.msg.OtherCollateral7.SafekeepingPlace, com.tools20022.repository.msg.OtherCollateral6.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesCollateral6.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesCollateral5.SafekeepingPlace, com.tools20022.repository.msg.OtherCollateral5.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesCollateral7.SafekeepingPlace,
						com.tools20022.repository.msg.CorporateActionOption121.SafekeepingPlace, com.tools20022.repository.msg.AccountAndBalance38.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification35.SafekeepingPlace,
						com.tools20022.repository.msg.AccountAndBalance37.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption55.SafekeepingPlace, com.tools20022.repository.choice.SafekeepingPlaceFormat11Choice.Identification,
						com.tools20022.repository.choice.SafekeepingPlaceFormat11Choice.TypeAndIdentification, com.tools20022.repository.msg.SecuritiesOption57.SafekeepingPlace,
						com.tools20022.repository.msg.AccountAndBalance39.SafekeepingPlace, com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice.Identification,
						com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice.TypeAndIdentification, com.tools20022.repository.msg.FinancialInstrumentDetails23.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount47.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation32.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount48.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount46.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalanceInformation33.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount51.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails87.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount49.SafekeepingPlace, com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails91.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount50.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails90.SafekeepingPlace,
						com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount55.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount54.SafekeepingPlace, com.tools20022.repository.msg.IntraPositionDetails37.SafekeepingPlace,
						com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice.Identification, com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice.TypeAndIdentification,
						com.tools20022.repository.msg.AccountIdentification40.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption60.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption59.SafekeepingPlace,
						com.tools20022.repository.msg.FinancialInstrumentDetails25.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails97.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails96.SafekeepingPlace,
						com.tools20022.repository.msg.IntraPositionDetails40.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails95.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesCollateral8.SafekeepingPlace,
						com.tools20022.repository.msg.FinancialInstrumentDetails27.SafekeepingPlace, com.tools20022.repository.msg.AccountIdentification41.SafekeepingPlace,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption61.SafekeepingPlace,
						com.tools20022.repository.msg.IntraPositionDetails44.SafekeepingPlace, com.tools20022.repository.msg.SecuritiesOption63.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails100.SafekeepingPlace,
						com.tools20022.repository.msg.TransactionDetails99.SafekeepingPlace, com.tools20022.repository.msg.TransactionDetails98.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount57.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount58.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount56.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount61.SafekeepingPlace,
						com.tools20022.repository.msg.QuantityAndAccount62.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount59.SafekeepingPlace, com.tools20022.repository.msg.QuantityAndAccount60.SafekeepingPlace,
						com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice.Identification, com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice.TypeAndIdentification);
				superType_lazy = () -> SecuritiesPartyRole.mmObject();
				element_lazy = () -> Arrays
						.asList(com.tools20022.repository.entity.SafekeepingPlace.SafekeepingPlaceType, com.tools20022.repository.entity.SafekeepingPlace.Country, com.tools20022.repository.entity.SafekeepingPlace.RelatedSecuritiesAccount,
								com.tools20022.repository.entity.SafekeepingPlace.SecuritiesBalance, com.tools20022.repository.entity.SafekeepingPlace.SecuritiesSettlement);
				derivationComponent_lazy = () -> Arrays.asList(SafekeepingPlaceTypeAndText3.mmObject(), SafekeepingPlaceTypeAndAnyBICIdentifier1.mmObject(), SafekeepingPlaceFormat3Choice.mmObject(), SafekeepingPlaceTypeAndText4.mmObject(),
						SafekeepingPlaceFormat4Choice.mmObject(), SafekeepingPlaceTypeAndText2.mmObject(), SafekeepingPlaceFormat2Choice.mmObject(), SafekeepingPlaceTypeAndText5.mmObject(), SafekeepingPlaceFormat5Choice.mmObject(),
						SafekeepingPlaceAsCodeAndPartyIdentification.mmObject(), SafekeepingPlaceFormatChoice.mmObject(), SafekeepingPlaceTypeAndText1.mmObject(), SafekeepingPlaceFormat1Choice.mmObject(),
						SafekeepingPlaceFormat7Choice.mmObject(), SafekeepingPlaceFormat8Choice.mmObject(), SafekeepingPlaceTypeAndText6.mmObject(), SafekeepingPlaceFormat10Choice.mmObject(), SafekeepingPlaceTypeAndText8.mmObject(),
						SafekeepingPlaceFormat11Choice.mmObject(), SafekeepingPlaceTypeAndText9.mmObject(), SafekeepingPlaceTypeAndText15.mmObject(), SafekeepingPlaceFormat17Choice.mmObject(), SafekeepingPlaceFormat26Choice.mmObject(),
						SafekeepingPlaceTypeAndText25.mmObject(), SafekeepingPlaceFormat27Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}