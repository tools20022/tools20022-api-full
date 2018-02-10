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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.SafekeepingPlaceCode;
import com.tools20022.repository.entity.SecuritiesPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Organisation used as the safekeeping place for the securities.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SafekeepingPlace" src="doc-files/SafekeepingPlace.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPartyRole
 * SecuritiesPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSafekeepingPlaceType
 * SafekeepingPlace.mmSafekeepingPlaceType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmCountry
 * SafekeepingPlace.mmCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmRelatedSecuritiesAccount
 * SafekeepingPlace.mmRelatedSecuritiesAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesBalance
 * SafekeepingPlace.mmSecuritiesBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SafekeepingPlace#mmSecuritiesSettlement
 * SafekeepingPlace.mmSecuritiesSettlement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Country#mmCountryForSafekeepingPlace
 * Country.mmCountryForSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSafekeepingPlace
 * SecuritiesAccount.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRequestedSafekeepingPlace
 * SecuritiesSettlement.mmRequestedSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSafekeepingPlace
 * SecuritiesBalance.mmSafekeepingPlace}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount10#mmSafekeepingPlace
 * InvestmentAccount10.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount22#mmSafekeepingPlace
 * InvestmentAccount22.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice#mmIdentification
 * SafekeepingPlaceFormat3Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat3Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount29#mmSafekeepingPlace
 * QuantityAndAccount29.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount30#mmSafekeepingPlace
 * QuantityAndAccount30.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice#mmIdentification
 * SafekeepingPlaceFormat4Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat4Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount32#mmSafekeepingPlace
 * QuantityAndAccount32.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount33#mmSafekeepingPlace
 * QuantityAndAccount33.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice#mmIdentification
 * SafekeepingPlaceFormat2Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat2Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice#mmIdentification
 * SafekeepingPlaceFormat5Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat5Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance2#mmSafekeepingPlace
 * AccountAndBalance2.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance5#mmSafekeepingPlace
 * AccountAndBalance5.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance10#mmSafekeepingPlace
 * AccountAndBalance10.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance12#mmSafekeepingPlace
 * AccountAndBalance12.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance17#mmSafekeepingPlace
 * AccountAndBalance17.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance20#mmSafekeepingPlace
 * AccountAndBalance20.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption9#mmSafekeepingPlace
 * CorporateActionOption9.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption18#mmSafekeepingPlace
 * CorporateActionOption18.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption22#mmSafekeepingPlace
 * CorporateActionOption22.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption27#mmSafekeepingPlace
 * CorporateActionOption27.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption26#mmSafekeepingPlace
 * CorporateActionOption26.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption41#mmSafekeepingPlace
 * CorporateActionOption41.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption50#mmSafekeepingPlace
 * CorporateActionOption50.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification25#mmSafekeepingPlace
 * AccountIdentification25.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification29#mmSafekeepingPlace
 * AccountIdentification29.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption29#mmSafekeepingPlace
 * CorporateActionOption29.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance3#mmSafekeepingPlace
 * AccountAndBalance3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#mmSafekeepingPlace
 * SecuritiesOption3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance6#mmSafekeepingPlace
 * AccountAndBalance6.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#mmSafekeepingPlace
 * SecuritiesOption8.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance11#mmSafekeepingPlace
 * AccountAndBalance11.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#mmSafekeepingPlace
 * SecuritiesOption18.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance13#mmSafekeepingPlace
 * AccountAndBalance13.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#mmSafekeepingPlace
 * SecuritiesOption20.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance16#mmSafekeepingPlace
 * AccountAndBalance16.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#mmSafekeepingPlace
 * SecuritiesOption26.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance19#mmSafekeepingPlace
 * AccountAndBalance19.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#mmSafekeepingPlace
 * SecuritiesOption31.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance22#mmSafekeepingPlace
 * AccountAndBalance22.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#mmSafekeepingPlace
 * SecuritiesOption35.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance23#mmSafekeepingPlace
 * AccountAndBalance23.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#mmSafekeepingPlace
 * SecuritiesOption36.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance1#mmSafekeepingPlace
 * AccountAndBalance1.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption4#mmSafekeepingPlace
 * SecuritiesOption4.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance7#mmSafekeepingPlace
 * AccountAndBalance7.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption10#mmSafekeepingPlace
 * SecuritiesOption10.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance9#mmSafekeepingPlace
 * AccountAndBalance9.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption13#mmSafekeepingPlace
 * SecuritiesOption13.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance14#mmSafekeepingPlace
 * AccountAndBalance14.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption17#mmSafekeepingPlace
 * SecuritiesOption17.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance15#mmSafekeepingPlace
 * AccountAndBalance15.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption24#mmSafekeepingPlace
 * SecuritiesOption24.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance18#mmSafekeepingPlace
 * AccountAndBalance18.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption29#mmSafekeepingPlace
 * SecuritiesOption29.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance21#mmSafekeepingPlace
 * AccountAndBalance21.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption38#mmSafekeepingPlace
 * SecuritiesOption38.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance24#mmSafekeepingPlace
 * AccountAndBalance24.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption39#mmSafekeepingPlace
 * SecuritiesOption39.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails3#mmSafekeepingPlace
 * IntraPositionDetails3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails6#mmSafekeepingPlace
 * IntraPositionDetails6.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails17#mmSafekeepingPlace
 * IntraPositionDetails17.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails18#mmSafekeepingPlace
 * IntraPositionDetails18.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails20#mmSafekeepingPlace
 * IntraPositionDetails20.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails24#mmSafekeepingPlace
 * IntraPositionDetails24.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails28#mmSafekeepingPlace
 * IntraPositionDetails28.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails30#mmSafekeepingPlace
 * IntraPositionDetails30.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace7#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace7.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation8#mmSafekeepingPlace
 * AggregateBalanceInformation8.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace10#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace10.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation11#mmSafekeepingPlace
 * AggregateBalanceInformation11.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormatChoice#mmIdentification
 * SafekeepingPlaceFormatChoice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace2#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace2.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation2#mmSafekeepingPlace
 * AggregateBalanceInformation2.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace4#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace4.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation3#mmSafekeepingPlace
 * AggregateBalanceInformation3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace12#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace12.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation13#mmSafekeepingPlace
 * AggregateBalanceInformation13.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace14#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace14.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation15#mmSafekeepingPlace
 * AggregateBalanceInformation15.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace16#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace16.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation17#mmSafekeepingPlace
 * AggregateBalanceInformation17.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace18#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace18.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation19#mmSafekeepingPlace
 * AggregateBalanceInformation19.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace21#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace21.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation22#mmSafekeepingPlace
 * AggregateBalanceInformation22.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace22#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace22.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation23#mmSafekeepingPlace
 * AggregateBalanceInformation23.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace8#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace8.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation9#mmSafekeepingPlace
 * AggregateBalanceInformation9.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace9#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace9.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation10#mmSafekeepingPlace
 * AggregateBalanceInformation10.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace1#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace1.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation1#mmSafekeepingPlace
 * AggregateBalanceInformation1.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace3#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation4#mmSafekeepingPlace
 * AggregateBalanceInformation4.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace11#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace11.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation12#mmSafekeepingPlace
 * AggregateBalanceInformation12.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace13#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace13.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation14#mmSafekeepingPlace
 * AggregateBalanceInformation14.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace15#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace15.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation16#mmSafekeepingPlace
 * AggregateBalanceInformation16.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace17#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace17.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation18#mmSafekeepingPlace
 * AggregateBalanceInformation18.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace20#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace20.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation21#mmSafekeepingPlace
 * AggregateBalanceInformation21.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace23#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace23.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation24#mmSafekeepingPlace
 * AggregateBalanceInformation24.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount6#mmSafekeepingPlace
 * QuantityAndAccount6.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount11#mmSafekeepingPlace
 * QuantityAndAccount11.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount18#mmSafekeepingPlace
 * QuantityAndAccount18.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount19#mmSafekeepingPlace
 * QuantityAndAccount19.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount1#mmSafekeepingPlace
 * QuantityAndAccount1.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount5#mmSafekeepingPlace
 * QuantityAndAccount5.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount17#mmSafekeepingPlace
 * QuantityAndAccount17.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount24#mmSafekeepingPlace
 * QuantityAndAccount24.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount25#mmSafekeepingPlace
 * QuantityAndAccount25.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount34#mmSafekeepingPlace
 * QuantityAndAccount34.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount2#mmSafekeepingPlace
 * QuantityAndAccount2.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount12#mmSafekeepingPlace
 * QuantityAndAccount12.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount15#mmSafekeepingPlace
 * QuantityAndAccount15.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount20#mmSafekeepingPlace
 * QuantityAndAccount20.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount28#mmSafekeepingPlace
 * QuantityAndAccount28.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount37#mmSafekeepingPlace
 * QuantityAndAccount37.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmSafekeepingPlace
 * TransactionDetails5.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmSafekeepingPlace
 * TransactionDetails9.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmSafekeepingPlace
 * TransactionDetails22.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmSafekeepingPlace
 * TransactionDetails23.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmSafekeepingPlace
 * TransactionDetails36.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmSafekeepingPlace
 * TransactionDetails47.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmSafekeepingPlace
 * TransactionDetails53.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmSafekeepingPlace
 * TransactionDetails58.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails7#mmSafekeepingPlace
 * TransactionDetails7.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails8#mmSafekeepingPlace
 * TransactionDetails8.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails16#mmSafekeepingPlace
 * TransactionDetails16.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails17#mmSafekeepingPlace
 * TransactionDetails17.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails26#mmSafekeepingPlace
 * TransactionDetails26.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails25#mmSafekeepingPlace
 * TransactionDetails25.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails27#mmSafekeepingPlace
 * TransactionDetails27.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails33#mmSafekeepingPlace
 * TransactionDetails33.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails39#mmSafekeepingPlace
 * TransactionDetails39.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails50#mmSafekeepingPlace
 * TransactionDetails50.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails56#mmSafekeepingPlace
 * TransactionDetails56.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails59#mmSafekeepingPlace
 * TransactionDetails59.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails6#mmSafekeepingPlace
 * TransactionDetails6.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails2#mmSafekeepingPlace
 * FinancialInstrumentDetails2.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails18#mmSafekeepingPlace
 * TransactionDetails18.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails3#mmSafekeepingPlace
 * FinancialInstrumentDetails3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails24#mmSafekeepingPlace
 * TransactionDetails24.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails5#mmSafekeepingPlace
 * FinancialInstrumentDetails5.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails34#mmSafekeepingPlace
 * TransactionDetails34.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails8#mmSafekeepingPlace
 * FinancialInstrumentDetails8.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails37#mmSafekeepingPlace
 * TransactionDetails37.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails9#mmSafekeepingPlace
 * FinancialInstrumentDetails9.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails48#mmSafekeepingPlace
 * TransactionDetails48.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails11#mmSafekeepingPlace
 * FinancialInstrumentDetails11.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails57#mmSafekeepingPlace
 * TransactionDetails57.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails13#mmSafekeepingPlace
 * FinancialInstrumentDetails13.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails60#mmSafekeepingPlace
 * TransactionDetails60.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails16#mmSafekeepingPlace
 * FinancialInstrumentDetails16.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance2#mmSafekeepingPlace
 * HoldingBalance2.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance3#mmSafekeepingPlace
 * HoldingBalance3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance6#mmSafekeepingPlace
 * HoldingBalance6.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance4#mmSafekeepingPlace
 * HoldingBalance4.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance5#mmSafekeepingPlace
 * HoldingBalance5.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDescription3#mmSafekeepingPlace
 * FinancialInstrumentDescription3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount7#mmSafekeepingPlace
 * QuantityAndAccount7.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount16#mmSafekeepingPlace
 * QuantityAndAccount16.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails2.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails8.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount3#mmSafekeepingPlace
 * QuantityAndAccount3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount13#mmSafekeepingPlace
 * QuantityAndAccount13.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount8#mmSafekeepingPlace
 * QuantityAndAccount8.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount14#mmSafekeepingPlace
 * QuantityAndAccount14.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount10#mmSafekeepingPlace
 * QuantityAndAccount10.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount21#mmSafekeepingPlace
 * QuantityAndAccount21.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails6.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails10.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails17.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails18.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount4#mmSafekeepingPlace
 * QuantityAndAccount4.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount22#mmSafekeepingPlace
 * QuantityAndAccount22.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount27#mmSafekeepingPlace
 * QuantityAndAccount27.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount36#mmSafekeepingPlace
 * QuantityAndAccount36.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount9#mmSafekeepingPlace
 * QuantityAndAccount9.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount23#mmSafekeepingPlace
 * QuantityAndAccount23.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount26#mmSafekeepingPlace
 * QuantityAndAccount26.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount35#mmSafekeepingPlace
 * QuantityAndAccount35.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails10#mmSafekeepingPlace
 * IntraPositionDetails10.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails14#mmSafekeepingPlace
 * IntraPositionDetails14.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails51#mmSafekeepingPlace
 * TransactionDetails51.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace19#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace19.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation20#mmSafekeepingPlace
 * AggregateBalanceInformation20.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption8#mmSafekeepingPlace
 * CorporateActionOption8.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat1Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice#mmType
 * SafekeepingPlaceFormat1Choice.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace6#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace6.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation6#mmSafekeepingPlace
 * AggregateBalanceInformation6.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace5#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace5.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation7#mmSafekeepingPlace
 * AggregateBalanceInformation7.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount40#mmSafekeepingPlace
 * InvestmentAccount40.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmSafekeepingPlace
 * TransactionDetails61.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails17#mmSafekeepingPlace
 * FinancialInstrumentDetails17.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails21.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails62#mmSafekeepingPlace
 * TransactionDetails62.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails63#mmSafekeepingPlace
 * TransactionDetails63.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance26#mmSafekeepingPlace
 * AccountAndBalance26.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#mmSafekeepingPlace
 * SecuritiesOption42.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance25#mmSafekeepingPlace
 * AccountAndBalance25.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption40#mmSafekeepingPlace
 * SecuritiesOption40.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance32#mmSafekeepingPlace
 * AccountAndBalance32.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance29#mmSafekeepingPlace
 * AccountAndBalance29.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#mmSafekeepingPlace
 * SecuritiesOption48.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption45#mmSafekeepingPlace
 * SecuritiesOption45.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails18#mmSafekeepingPlace
 * FinancialInstrumentDetails18.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails22.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmSafekeepingPlace
 * TransactionDetails66.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails67#mmSafekeepingPlace
 * TransactionDetails67.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails68#mmSafekeepingPlace
 * TransactionDetails68.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails24.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmSafekeepingPlace
 * TransactionDetails70.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails69#mmSafekeepingPlace
 * TransactionDetails69.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation26#mmSafekeepingPlace
 * AggregateBalanceInformation26.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation25#mmSafekeepingPlace
 * AggregateBalanceInformation25.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace24#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace24.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace25#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace25.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice#mmIdentification
 * SafekeepingPlaceFormat7Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat7Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral2#mmSafekeepingPlace
 * SecuritiesCollateral2.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral2#mmSafekeepingPlace
 * OtherCollateral2.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral3#mmSafekeepingPlace
 * SecuritiesCollateral3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral3#mmSafekeepingPlace
 * OtherCollateral3.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance8#mmSafekeepingPlace
 * HoldingBalance8.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.HoldingBalance7#mmSafekeepingPlace
 * HoldingBalance7.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral4#mmSafekeepingPlace
 * OtherCollateral4.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral4#mmSafekeepingPlace
 * SecuritiesCollateral4.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation28#mmSafekeepingPlace
 * AggregateBalanceInformation28.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmSafekeepingPlace
 * TransactionDetails71.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails25.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation27#mmSafekeepingPlace
 * AggregateBalanceInformation27.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace26#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace26.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace27#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace27.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails72#mmSafekeepingPlace
 * TransactionDetails72.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount39#mmSafekeepingPlace
 * QuantityAndAccount39.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation30#mmSafekeepingPlace
 * AggregateBalanceInformation30.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount41#mmSafekeepingPlace
 * QuantityAndAccount41.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails20#mmSafekeepingPlace
 * FinancialInstrumentDetails20.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount40#mmSafekeepingPlace
 * QuantityAndAccount40.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount42#mmSafekeepingPlace
 * QuantityAndAccount42.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount38#mmSafekeepingPlace
 * QuantityAndAccount38.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails26.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmSafekeepingPlace
 * TransactionDetails79.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation31#mmSafekeepingPlace
 * AggregateBalanceInformation31.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace28#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace28.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount43#mmSafekeepingPlace
 * QuantityAndAccount43.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails75#mmSafekeepingPlace
 * TransactionDetails75.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace29#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace29.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails78#mmSafekeepingPlace
 * TransactionDetails78.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice#mmIdentification
 * SafekeepingPlaceFormat8Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat8Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#mmIdentification
 * SafekeepingPlaceFormat10Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat10Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount45#mmSafekeepingPlace
 * QuantityAndAccount45.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails32#mmSafekeepingPlace
 * IntraPositionDetails32.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount44#mmSafekeepingPlace
 * QuantityAndAccount44.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance34#mmSafekeepingPlace
 * AccountAndBalance34.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance35#mmSafekeepingPlace
 * AccountAndBalance35.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification33#mmSafekeepingPlace
 * AccountIdentification33.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption116#mmSafekeepingPlace
 * CorporateActionOption116.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance33#mmSafekeepingPlace
 * AccountAndBalance33.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption49#mmSafekeepingPlace
 * SecuritiesOption49.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#mmSafekeepingPlace
 * SecuritiesOption50.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount54#mmSafekeepingPlace
 * InvestmentAccount54.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount56#mmSafekeepingPlace
 * InvestmentAccount56.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentAccount57#mmSafekeepingPlace
 * InvestmentAccount57.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral7#mmSafekeepingPlace
 * OtherCollateral7.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral6#mmSafekeepingPlace
 * OtherCollateral6.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral6#mmSafekeepingPlace
 * SecuritiesCollateral6.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral5#mmSafekeepingPlace
 * SecuritiesCollateral5.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OtherCollateral5#mmSafekeepingPlace
 * OtherCollateral5.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7#mmSafekeepingPlace
 * SecuritiesCollateral7.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionOption121#mmSafekeepingPlace
 * CorporateActionOption121.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance38#mmSafekeepingPlace
 * AccountAndBalance38.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification35#mmSafekeepingPlace
 * AccountIdentification35.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance37#mmSafekeepingPlace
 * AccountAndBalance37.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#mmSafekeepingPlace
 * SecuritiesOption55.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat11Choice#mmIdentification
 * SafekeepingPlaceFormat11Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat11Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat11Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption57#mmSafekeepingPlace
 * SecuritiesOption57.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountAndBalance39#mmSafekeepingPlace
 * AccountAndBalance39.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice#mmIdentification
 * SafekeepingPlaceFormat17Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat17Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails23#mmSafekeepingPlace
 * FinancialInstrumentDetails23.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount47#mmSafekeepingPlace
 * QuantityAndAccount47.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails33.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation32#mmSafekeepingPlace
 * AggregateBalanceInformation32.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount48#mmSafekeepingPlace
 * QuantityAndAccount48.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount46#mmSafekeepingPlace
 * QuantityAndAccount46.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalanceInformation33#mmSafekeepingPlace
 * AggregateBalanceInformation33.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount51#mmSafekeepingPlace
 * QuantityAndAccount51.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmSafekeepingPlace
 * TransactionDetails87.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount49#mmSafekeepingPlace
 * QuantityAndAccount49.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace31#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace31.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails91#mmSafekeepingPlace
 * TransactionDetails91.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount50#mmSafekeepingPlace
 * QuantityAndAccount50.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails90#mmSafekeepingPlace
 * TransactionDetails90.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AggregateBalancePerSafekeepingPlace30#mmSafekeepingPlace
 * AggregateBalancePerSafekeepingPlace30.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount55#mmSafekeepingPlace
 * QuantityAndAccount55.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount54#mmSafekeepingPlace
 * QuantityAndAccount54.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails37#mmSafekeepingPlace
 * IntraPositionDetails37.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice#mmIdentification
 * SafekeepingPlaceFormat26Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat26Choice.mmTypeAndIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification40#mmSafekeepingPlace
 * AccountIdentification40.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmSafekeepingPlace
 * SecuritiesOption60.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmSafekeepingPlace
 * SecuritiesOption59.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails25#mmSafekeepingPlace
 * FinancialInstrumentDetails25.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmSafekeepingPlace
 * TransactionDetails97.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails35.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails96#mmSafekeepingPlace
 * TransactionDetails96.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails40#mmSafekeepingPlace
 * IntraPositionDetails40.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails95#mmSafekeepingPlace
 * TransactionDetails95.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesCollateral8#mmSafekeepingPlace
 * SecuritiesCollateral8.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentDetails27#mmSafekeepingPlace
 * FinancialInstrumentDetails27.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountIdentification41#mmSafekeepingPlace
 * AccountIdentification41.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmSafekeepingPlace
 * SecuritiesFinancingTransactionDetails36.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption61#mmSafekeepingPlace
 * SecuritiesOption61.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionDetails44#mmSafekeepingPlace
 * IntraPositionDetails44.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#mmSafekeepingPlace
 * SecuritiesOption63.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmSafekeepingPlace
 * TransactionDetails100.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails99#mmSafekeepingPlace
 * TransactionDetails99.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionDetails98#mmSafekeepingPlace
 * TransactionDetails98.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount57#mmSafekeepingPlace
 * QuantityAndAccount57.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount58#mmSafekeepingPlace
 * QuantityAndAccount58.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount56#mmSafekeepingPlace
 * QuantityAndAccount56.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount61#mmSafekeepingPlace
 * QuantityAndAccount61.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount62#mmSafekeepingPlace
 * QuantityAndAccount62.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount59#mmSafekeepingPlace
 * QuantityAndAccount59.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuantityAndAccount60#mmSafekeepingPlace
 * QuantityAndAccount60.mmSafekeepingPlace}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice#mmIdentification
 * SafekeepingPlaceFormat27Choice.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice#mmTypeAndIdentification
 * SafekeepingPlaceFormat27Choice.mmTypeAndIdentification}</li>
 * </ul>
 * </li>
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
	protected SafekeepingPlaceCode safekeepingPlaceType;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText3#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText3.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndAnyBICIdentifier1#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndAnyBICIdentifier1.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText4#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText4.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText2#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText2.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText5#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText5.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText1#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText1.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText6#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText6.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText8#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText8.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText9#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText9.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText15#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText15.mmSafekeepingPlaceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SafekeepingPlaceTypeAndText25#mmSafekeepingPlaceType
	 * SafekeepingPlaceTypeAndText25.mmSafekeepingPlaceType}</li>
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
	public static final MMBusinessAttribute mmSafekeepingPlaceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SafekeepingPlaceTypeAndText3.mmSafekeepingPlaceType, SafekeepingPlaceTypeAndAnyBICIdentifier1.mmSafekeepingPlaceType, SafekeepingPlaceTypeAndText4.mmSafekeepingPlaceType,
					SafekeepingPlaceTypeAndText2.mmSafekeepingPlaceType, SafekeepingPlaceTypeAndText5.mmSafekeepingPlaceType, SafekeepingPlaceTypeAndText1.mmSafekeepingPlaceType, SafekeepingPlaceTypeAndText6.mmSafekeepingPlaceType,
					SafekeepingPlaceTypeAndText8.mmSafekeepingPlaceType, SafekeepingPlaceTypeAndText9.mmSafekeepingPlaceType, SafekeepingPlaceTypeAndText15.mmSafekeepingPlaceType, SafekeepingPlaceTypeAndText25.mmSafekeepingPlaceType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SafekeepingPlaceType";
			definition = "Place of safekeeping.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SafekeepingPlaceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SafekeepingPlace.class.getMethod("getSafekeepingPlaceType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Country country;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Country#mmCountryForSafekeepingPlace
	 * Country.mmCountryForSafekeepingPlace}</li>
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
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat3Choice#mmCountry
	 * SafekeepingPlaceFormat3Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat4Choice#mmCountry
	 * SafekeepingPlaceFormat4Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat2Choice#mmCountry
	 * SafekeepingPlaceFormat2Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat5Choice#mmCountry
	 * SafekeepingPlaceFormat5Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat1Choice#mmCountry
	 * SafekeepingPlaceFormat1Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat7Choice#mmCountry
	 * SafekeepingPlaceFormat7Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat8Choice#mmCountry
	 * SafekeepingPlaceFormat8Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat10Choice#mmCountry
	 * SafekeepingPlaceFormat10Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat11Choice#mmCountry
	 * SafekeepingPlaceFormat11Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat17Choice#mmCountry
	 * SafekeepingPlaceFormat17Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat26Choice#mmCountry
	 * SafekeepingPlaceFormat26Choice.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SafekeepingPlaceFormat27Choice#mmCountry
	 * SafekeepingPlaceFormat27Choice.mmCountry}</li>
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
	public static final MMBusinessAssociationEnd mmCountry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SafekeepingPlaceFormat3Choice.mmCountry, SafekeepingPlaceFormat4Choice.mmCountry, SafekeepingPlaceFormat2Choice.mmCountry, SafekeepingPlaceFormat5Choice.mmCountry,
					SafekeepingPlaceFormat1Choice.mmCountry, SafekeepingPlaceFormat7Choice.mmCountry, SafekeepingPlaceFormat8Choice.mmCountry, SafekeepingPlaceFormat10Choice.mmCountry, SafekeepingPlaceFormat11Choice.mmCountry,
					SafekeepingPlaceFormat17Choice.mmCountry, SafekeepingPlaceFormat26Choice.mmCountry, SafekeepingPlaceFormat27Choice.mmCountry);
			isDerived = true;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Country";
			definition = "Country where the financial instruments are/will be safekept.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Country.mmCountryForSafekeepingPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Country.mmObject();
		}
	};
	protected SecuritiesAccount relatedSecuritiesAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesAccount#mmSafekeepingPlace
	 * SecuritiesAccount.mmSafekeepingPlace}</li>
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
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesAccount";
			definition = "Account at the safekeeping place where financial instruments are safekept.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmSafekeepingPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesAccount.mmObject();
		}
	};
	protected SecuritiesBalance securitiesBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesBalance#mmSafekeepingPlace
	 * SecuritiesBalance.mmSafekeepingPlace}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesBalance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBalance";
			definition = "Balance which is held at a safekeeping place.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmSafekeepingPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesBalance.mmObject();
		}
	};
	protected SecuritiesSettlement securitiesSettlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmRequestedSafekeepingPlace
	 * SecuritiesSettlement.mmRequestedSafekeepingPlace}</li>
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
	public static final MMBusinessAssociationEnd mmSecuritiesSettlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SafekeepingPlace.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesSettlement";
			definition = "Specifies the settlement operation which uses the safekeeping place.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmRequestedSafekeepingPlace;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesSettlement.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SafekeepingPlace";
				definition = "Organisation used as the safekeeping place for the securities.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Country.mmCountryForSafekeepingPlace, com.tools20022.repository.entity.SecuritiesAccount.mmSafekeepingPlace,
						com.tools20022.repository.entity.SecuritiesSettlement.mmRequestedSafekeepingPlace, com.tools20022.repository.entity.SecuritiesBalance.mmSafekeepingPlace);
				derivationElement_lazy = () -> Arrays.asList(InvestmentAccount10.mmSafekeepingPlace, InvestmentAccount22.mmSafekeepingPlace, SafekeepingPlaceFormat3Choice.mmIdentification,
						SafekeepingPlaceFormat3Choice.mmTypeAndIdentification, QuantityAndAccount29.mmSafekeepingPlace, QuantityAndAccount30.mmSafekeepingPlace, SafekeepingPlaceFormat4Choice.mmIdentification,
						SafekeepingPlaceFormat4Choice.mmTypeAndIdentification, QuantityAndAccount32.mmSafekeepingPlace, QuantityAndAccount33.mmSafekeepingPlace, SafekeepingPlaceFormat2Choice.mmIdentification,
						SafekeepingPlaceFormat2Choice.mmTypeAndIdentification, SafekeepingPlaceFormat5Choice.mmIdentification, SafekeepingPlaceFormat5Choice.mmTypeAndIdentification, AccountAndBalance2.mmSafekeepingPlace,
						AccountAndBalance5.mmSafekeepingPlace, AccountAndBalance10.mmSafekeepingPlace, AccountAndBalance12.mmSafekeepingPlace, AccountAndBalance17.mmSafekeepingPlace, AccountAndBalance20.mmSafekeepingPlace,
						CorporateActionOption9.mmSafekeepingPlace, CorporateActionOption18.mmSafekeepingPlace, CorporateActionOption22.mmSafekeepingPlace, CorporateActionOption27.mmSafekeepingPlace,
						CorporateActionOption26.mmSafekeepingPlace, CorporateActionOption41.mmSafekeepingPlace, CorporateActionOption50.mmSafekeepingPlace, AccountIdentification25.mmSafekeepingPlace,
						AccountIdentification29.mmSafekeepingPlace, CorporateActionOption29.mmSafekeepingPlace, AccountAndBalance3.mmSafekeepingPlace, SecuritiesOption3.mmSafekeepingPlace, AccountAndBalance6.mmSafekeepingPlace,
						SecuritiesOption8.mmSafekeepingPlace, AccountAndBalance11.mmSafekeepingPlace, SecuritiesOption18.mmSafekeepingPlace, AccountAndBalance13.mmSafekeepingPlace, SecuritiesOption20.mmSafekeepingPlace,
						AccountAndBalance16.mmSafekeepingPlace, SecuritiesOption26.mmSafekeepingPlace, AccountAndBalance19.mmSafekeepingPlace, SecuritiesOption31.mmSafekeepingPlace, AccountAndBalance22.mmSafekeepingPlace,
						SecuritiesOption35.mmSafekeepingPlace, AccountAndBalance23.mmSafekeepingPlace, SecuritiesOption36.mmSafekeepingPlace, AccountAndBalance1.mmSafekeepingPlace, SecuritiesOption4.mmSafekeepingPlace,
						AccountAndBalance7.mmSafekeepingPlace, SecuritiesOption10.mmSafekeepingPlace, AccountAndBalance9.mmSafekeepingPlace, SecuritiesOption13.mmSafekeepingPlace, AccountAndBalance14.mmSafekeepingPlace,
						SecuritiesOption17.mmSafekeepingPlace, AccountAndBalance15.mmSafekeepingPlace, SecuritiesOption24.mmSafekeepingPlace, AccountAndBalance18.mmSafekeepingPlace, SecuritiesOption29.mmSafekeepingPlace,
						AccountAndBalance21.mmSafekeepingPlace, SecuritiesOption38.mmSafekeepingPlace, AccountAndBalance24.mmSafekeepingPlace, SecuritiesOption39.mmSafekeepingPlace, IntraPositionDetails3.mmSafekeepingPlace,
						IntraPositionDetails6.mmSafekeepingPlace, IntraPositionDetails17.mmSafekeepingPlace, IntraPositionDetails18.mmSafekeepingPlace, IntraPositionDetails20.mmSafekeepingPlace, IntraPositionDetails24.mmSafekeepingPlace,
						IntraPositionDetails28.mmSafekeepingPlace, IntraPositionDetails30.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace7.mmSafekeepingPlace, AggregateBalanceInformation8.mmSafekeepingPlace,
						AggregateBalancePerSafekeepingPlace10.mmSafekeepingPlace, AggregateBalanceInformation11.mmSafekeepingPlace, SafekeepingPlaceFormatChoice.mmIdentification, AggregateBalancePerSafekeepingPlace2.mmSafekeepingPlace,
						AggregateBalanceInformation2.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace4.mmSafekeepingPlace, AggregateBalanceInformation3.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace12.mmSafekeepingPlace,
						AggregateBalanceInformation13.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace14.mmSafekeepingPlace, AggregateBalanceInformation15.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace16.mmSafekeepingPlace,
						AggregateBalanceInformation17.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace18.mmSafekeepingPlace, AggregateBalanceInformation19.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace21.mmSafekeepingPlace,
						AggregateBalanceInformation22.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace22.mmSafekeepingPlace, AggregateBalanceInformation23.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace8.mmSafekeepingPlace,
						AggregateBalanceInformation9.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace9.mmSafekeepingPlace, AggregateBalanceInformation10.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace1.mmSafekeepingPlace,
						AggregateBalanceInformation1.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace3.mmSafekeepingPlace, AggregateBalanceInformation4.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace11.mmSafekeepingPlace,
						AggregateBalanceInformation12.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace13.mmSafekeepingPlace, AggregateBalanceInformation14.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace15.mmSafekeepingPlace,
						AggregateBalanceInformation16.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace17.mmSafekeepingPlace, AggregateBalanceInformation18.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace20.mmSafekeepingPlace,
						AggregateBalanceInformation21.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace23.mmSafekeepingPlace, AggregateBalanceInformation24.mmSafekeepingPlace, QuantityAndAccount6.mmSafekeepingPlace,
						QuantityAndAccount11.mmSafekeepingPlace, QuantityAndAccount18.mmSafekeepingPlace, QuantityAndAccount19.mmSafekeepingPlace, QuantityAndAccount1.mmSafekeepingPlace, QuantityAndAccount5.mmSafekeepingPlace,
						QuantityAndAccount17.mmSafekeepingPlace, QuantityAndAccount24.mmSafekeepingPlace, QuantityAndAccount25.mmSafekeepingPlace, QuantityAndAccount34.mmSafekeepingPlace, QuantityAndAccount2.mmSafekeepingPlace,
						QuantityAndAccount12.mmSafekeepingPlace, QuantityAndAccount15.mmSafekeepingPlace, QuantityAndAccount20.mmSafekeepingPlace, QuantityAndAccount28.mmSafekeepingPlace, QuantityAndAccount37.mmSafekeepingPlace,
						TransactionDetails5.mmSafekeepingPlace, TransactionDetails9.mmSafekeepingPlace, TransactionDetails22.mmSafekeepingPlace, TransactionDetails23.mmSafekeepingPlace, TransactionDetails36.mmSafekeepingPlace,
						TransactionDetails47.mmSafekeepingPlace, TransactionDetails53.mmSafekeepingPlace, TransactionDetails58.mmSafekeepingPlace, TransactionDetails7.mmSafekeepingPlace, TransactionDetails8.mmSafekeepingPlace,
						TransactionDetails16.mmSafekeepingPlace, TransactionDetails17.mmSafekeepingPlace, TransactionDetails26.mmSafekeepingPlace, TransactionDetails25.mmSafekeepingPlace, TransactionDetails27.mmSafekeepingPlace,
						TransactionDetails33.mmSafekeepingPlace, TransactionDetails39.mmSafekeepingPlace, TransactionDetails50.mmSafekeepingPlace, TransactionDetails56.mmSafekeepingPlace, TransactionDetails59.mmSafekeepingPlace,
						TransactionDetails6.mmSafekeepingPlace, FinancialInstrumentDetails2.mmSafekeepingPlace, TransactionDetails18.mmSafekeepingPlace, FinancialInstrumentDetails3.mmSafekeepingPlace,
						TransactionDetails24.mmSafekeepingPlace, FinancialInstrumentDetails5.mmSafekeepingPlace, TransactionDetails34.mmSafekeepingPlace, FinancialInstrumentDetails8.mmSafekeepingPlace,
						TransactionDetails37.mmSafekeepingPlace, FinancialInstrumentDetails9.mmSafekeepingPlace, TransactionDetails48.mmSafekeepingPlace, FinancialInstrumentDetails11.mmSafekeepingPlace,
						TransactionDetails57.mmSafekeepingPlace, FinancialInstrumentDetails13.mmSafekeepingPlace, TransactionDetails60.mmSafekeepingPlace, FinancialInstrumentDetails16.mmSafekeepingPlace, HoldingBalance2.mmSafekeepingPlace,
						HoldingBalance3.mmSafekeepingPlace, HoldingBalance6.mmSafekeepingPlace, HoldingBalance4.mmSafekeepingPlace, HoldingBalance5.mmSafekeepingPlace, FinancialInstrumentDescription3.mmSafekeepingPlace,
						QuantityAndAccount7.mmSafekeepingPlace, QuantityAndAccount16.mmSafekeepingPlace, SecuritiesFinancingTransactionDetails2.mmSafekeepingPlace, SecuritiesFinancingTransactionDetails8.mmSafekeepingPlace,
						QuantityAndAccount3.mmSafekeepingPlace, QuantityAndAccount13.mmSafekeepingPlace, QuantityAndAccount8.mmSafekeepingPlace, QuantityAndAccount14.mmSafekeepingPlace, QuantityAndAccount10.mmSafekeepingPlace,
						QuantityAndAccount21.mmSafekeepingPlace, SecuritiesFinancingTransactionDetails6.mmSafekeepingPlace, SecuritiesFinancingTransactionDetails10.mmSafekeepingPlace,
						SecuritiesFinancingTransactionDetails17.mmSafekeepingPlace, SecuritiesFinancingTransactionDetails18.mmSafekeepingPlace, QuantityAndAccount4.mmSafekeepingPlace, QuantityAndAccount22.mmSafekeepingPlace,
						QuantityAndAccount27.mmSafekeepingPlace, QuantityAndAccount36.mmSafekeepingPlace, QuantityAndAccount9.mmSafekeepingPlace, QuantityAndAccount23.mmSafekeepingPlace, QuantityAndAccount26.mmSafekeepingPlace,
						QuantityAndAccount35.mmSafekeepingPlace, IntraPositionDetails10.mmSafekeepingPlace, IntraPositionDetails14.mmSafekeepingPlace, TransactionDetails51.mmSafekeepingPlace,
						AggregateBalancePerSafekeepingPlace19.mmSafekeepingPlace, AggregateBalanceInformation20.mmSafekeepingPlace, CorporateActionOption8.mmSafekeepingPlace, SafekeepingPlaceFormat1Choice.mmTypeAndIdentification,
						SafekeepingPlaceFormat1Choice.mmType, AggregateBalancePerSafekeepingPlace6.mmSafekeepingPlace, AggregateBalanceInformation6.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace5.mmSafekeepingPlace,
						AggregateBalanceInformation7.mmSafekeepingPlace, InvestmentAccount40.mmSafekeepingPlace, TransactionDetails61.mmSafekeepingPlace, FinancialInstrumentDetails17.mmSafekeepingPlace,
						SecuritiesFinancingTransactionDetails21.mmSafekeepingPlace, TransactionDetails62.mmSafekeepingPlace, TransactionDetails63.mmSafekeepingPlace, AccountAndBalance26.mmSafekeepingPlace,
						SecuritiesOption42.mmSafekeepingPlace, AccountAndBalance25.mmSafekeepingPlace, SecuritiesOption40.mmSafekeepingPlace, AccountAndBalance32.mmSafekeepingPlace, AccountAndBalance29.mmSafekeepingPlace,
						SecuritiesOption48.mmSafekeepingPlace, SecuritiesOption45.mmSafekeepingPlace, FinancialInstrumentDetails18.mmSafekeepingPlace, SecuritiesFinancingTransactionDetails22.mmSafekeepingPlace,
						TransactionDetails66.mmSafekeepingPlace, TransactionDetails67.mmSafekeepingPlace, TransactionDetails68.mmSafekeepingPlace, SecuritiesFinancingTransactionDetails24.mmSafekeepingPlace,
						TransactionDetails70.mmSafekeepingPlace, TransactionDetails69.mmSafekeepingPlace, AggregateBalanceInformation26.mmSafekeepingPlace, AggregateBalanceInformation25.mmSafekeepingPlace,
						AggregateBalancePerSafekeepingPlace24.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace25.mmSafekeepingPlace, SafekeepingPlaceFormat7Choice.mmIdentification,
						SafekeepingPlaceFormat7Choice.mmTypeAndIdentification, SecuritiesCollateral2.mmSafekeepingPlace, OtherCollateral2.mmSafekeepingPlace, SecuritiesCollateral3.mmSafekeepingPlace, OtherCollateral3.mmSafekeepingPlace,
						HoldingBalance8.mmSafekeepingPlace, HoldingBalance7.mmSafekeepingPlace, OtherCollateral4.mmSafekeepingPlace, SecuritiesCollateral4.mmSafekeepingPlace, AggregateBalanceInformation28.mmSafekeepingPlace,
						TransactionDetails71.mmSafekeepingPlace, SecuritiesFinancingTransactionDetails25.mmSafekeepingPlace, AggregateBalanceInformation27.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace26.mmSafekeepingPlace,
						AggregateBalancePerSafekeepingPlace27.mmSafekeepingPlace, TransactionDetails72.mmSafekeepingPlace, QuantityAndAccount39.mmSafekeepingPlace, AggregateBalanceInformation30.mmSafekeepingPlace,
						QuantityAndAccount41.mmSafekeepingPlace, FinancialInstrumentDetails20.mmSafekeepingPlace, QuantityAndAccount40.mmSafekeepingPlace, QuantityAndAccount42.mmSafekeepingPlace, QuantityAndAccount38.mmSafekeepingPlace,
						SecuritiesFinancingTransactionDetails26.mmSafekeepingPlace, TransactionDetails79.mmSafekeepingPlace, AggregateBalanceInformation31.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace28.mmSafekeepingPlace,
						QuantityAndAccount43.mmSafekeepingPlace, TransactionDetails75.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace29.mmSafekeepingPlace, TransactionDetails78.mmSafekeepingPlace,
						SafekeepingPlaceFormat8Choice.mmIdentification, SafekeepingPlaceFormat8Choice.mmTypeAndIdentification, SafekeepingPlaceFormat10Choice.mmIdentification, SafekeepingPlaceFormat10Choice.mmTypeAndIdentification,
						QuantityAndAccount45.mmSafekeepingPlace, IntraPositionDetails32.mmSafekeepingPlace, QuantityAndAccount44.mmSafekeepingPlace, AccountAndBalance34.mmSafekeepingPlace, AccountAndBalance35.mmSafekeepingPlace,
						AccountIdentification33.mmSafekeepingPlace, CorporateActionOption116.mmSafekeepingPlace, AccountAndBalance33.mmSafekeepingPlace, SecuritiesOption49.mmSafekeepingPlace, SecuritiesOption50.mmSafekeepingPlace,
						InvestmentAccount54.mmSafekeepingPlace, InvestmentAccount56.mmSafekeepingPlace, InvestmentAccount57.mmSafekeepingPlace, OtherCollateral7.mmSafekeepingPlace, OtherCollateral6.mmSafekeepingPlace,
						SecuritiesCollateral6.mmSafekeepingPlace, SecuritiesCollateral5.mmSafekeepingPlace, OtherCollateral5.mmSafekeepingPlace, SecuritiesCollateral7.mmSafekeepingPlace, CorporateActionOption121.mmSafekeepingPlace,
						AccountAndBalance38.mmSafekeepingPlace, AccountIdentification35.mmSafekeepingPlace, AccountAndBalance37.mmSafekeepingPlace, SecuritiesOption55.mmSafekeepingPlace, SafekeepingPlaceFormat11Choice.mmIdentification,
						SafekeepingPlaceFormat11Choice.mmTypeAndIdentification, SecuritiesOption57.mmSafekeepingPlace, AccountAndBalance39.mmSafekeepingPlace, SafekeepingPlaceFormat17Choice.mmIdentification,
						SafekeepingPlaceFormat17Choice.mmTypeAndIdentification, FinancialInstrumentDetails23.mmSafekeepingPlace, QuantityAndAccount47.mmSafekeepingPlace, SecuritiesFinancingTransactionDetails33.mmSafekeepingPlace,
						AggregateBalanceInformation32.mmSafekeepingPlace, QuantityAndAccount48.mmSafekeepingPlace, QuantityAndAccount46.mmSafekeepingPlace, AggregateBalanceInformation33.mmSafekeepingPlace,
						QuantityAndAccount51.mmSafekeepingPlace, TransactionDetails87.mmSafekeepingPlace, QuantityAndAccount49.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace31.mmSafekeepingPlace,
						TransactionDetails91.mmSafekeepingPlace, QuantityAndAccount50.mmSafekeepingPlace, TransactionDetails90.mmSafekeepingPlace, AggregateBalancePerSafekeepingPlace30.mmSafekeepingPlace,
						QuantityAndAccount55.mmSafekeepingPlace, QuantityAndAccount54.mmSafekeepingPlace, IntraPositionDetails37.mmSafekeepingPlace, SafekeepingPlaceFormat26Choice.mmIdentification,
						SafekeepingPlaceFormat26Choice.mmTypeAndIdentification, AccountIdentification40.mmSafekeepingPlace, SecuritiesOption60.mmSafekeepingPlace, SecuritiesOption59.mmSafekeepingPlace,
						FinancialInstrumentDetails25.mmSafekeepingPlace, TransactionDetails97.mmSafekeepingPlace, SecuritiesFinancingTransactionDetails35.mmSafekeepingPlace, TransactionDetails96.mmSafekeepingPlace,
						IntraPositionDetails40.mmSafekeepingPlace, TransactionDetails95.mmSafekeepingPlace, SecuritiesCollateral8.mmSafekeepingPlace, FinancialInstrumentDetails27.mmSafekeepingPlace,
						AccountIdentification41.mmSafekeepingPlace, SecuritiesFinancingTransactionDetails36.mmSafekeepingPlace, SecuritiesOption61.mmSafekeepingPlace, IntraPositionDetails44.mmSafekeepingPlace,
						SecuritiesOption63.mmSafekeepingPlace, TransactionDetails100.mmSafekeepingPlace, TransactionDetails99.mmSafekeepingPlace, TransactionDetails98.mmSafekeepingPlace, QuantityAndAccount57.mmSafekeepingPlace,
						QuantityAndAccount58.mmSafekeepingPlace, QuantityAndAccount56.mmSafekeepingPlace, QuantityAndAccount61.mmSafekeepingPlace, QuantityAndAccount62.mmSafekeepingPlace, QuantityAndAccount59.mmSafekeepingPlace,
						QuantityAndAccount60.mmSafekeepingPlace, SafekeepingPlaceFormat27Choice.mmIdentification, SafekeepingPlaceFormat27Choice.mmTypeAndIdentification);
				superType_lazy = () -> SecuritiesPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SafekeepingPlace.mmSafekeepingPlaceType, com.tools20022.repository.entity.SafekeepingPlace.mmCountry,
						com.tools20022.repository.entity.SafekeepingPlace.mmRelatedSecuritiesAccount, com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesBalance,
						com.tools20022.repository.entity.SafekeepingPlace.mmSecuritiesSettlement);
				derivationComponent_lazy = () -> Arrays.asList(SafekeepingPlaceTypeAndText3.mmObject(), SafekeepingPlaceTypeAndAnyBICIdentifier1.mmObject(), SafekeepingPlaceFormat3Choice.mmObject(), SafekeepingPlaceTypeAndText4.mmObject(),
						SafekeepingPlaceFormat4Choice.mmObject(), SafekeepingPlaceTypeAndText2.mmObject(), SafekeepingPlaceFormat2Choice.mmObject(), SafekeepingPlaceTypeAndText5.mmObject(), SafekeepingPlaceFormat5Choice.mmObject(),
						SafekeepingPlaceAsCodeAndPartyIdentification.mmObject(), SafekeepingPlaceFormatChoice.mmObject(), SafekeepingPlaceTypeAndText1.mmObject(), SafekeepingPlaceFormat1Choice.mmObject(),
						SafekeepingPlaceFormat7Choice.mmObject(), SafekeepingPlaceFormat8Choice.mmObject(), SafekeepingPlaceTypeAndText6.mmObject(), SafekeepingPlaceFormat10Choice.mmObject(), SafekeepingPlaceTypeAndText8.mmObject(),
						SafekeepingPlaceFormat11Choice.mmObject(), SafekeepingPlaceTypeAndText9.mmObject(), SafekeepingPlaceTypeAndText15.mmObject(), SafekeepingPlaceFormat17Choice.mmObject(), SafekeepingPlaceFormat26Choice.mmObject(),
						SafekeepingPlaceTypeAndText25.mmObject(), SafekeepingPlaceFormat27Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SafekeepingPlace.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SafekeepingPlaceCode getSafekeepingPlaceType() {
		return safekeepingPlaceType;
	}

	public SafekeepingPlace setSafekeepingPlaceType(SafekeepingPlaceCode safekeepingPlaceType) {
		this.safekeepingPlaceType = Objects.requireNonNull(safekeepingPlaceType);
		return this;
	}

	public Country getCountry() {
		return country;
	}

	public SafekeepingPlace setCountry(com.tools20022.repository.entity.Country country) {
		this.country = Objects.requireNonNull(country);
		return this;
	}

	public SecuritiesAccount getRelatedSecuritiesAccount() {
		return relatedSecuritiesAccount;
	}

	public SafekeepingPlace setRelatedSecuritiesAccount(com.tools20022.repository.entity.SecuritiesAccount relatedSecuritiesAccount) {
		this.relatedSecuritiesAccount = Objects.requireNonNull(relatedSecuritiesAccount);
		return this;
	}

	public Optional<SecuritiesBalance> getSecuritiesBalance() {
		return securitiesBalance == null ? Optional.empty() : Optional.of(securitiesBalance);
	}

	public SafekeepingPlace setSecuritiesBalance(com.tools20022.repository.entity.SecuritiesBalance securitiesBalance) {
		this.securitiesBalance = securitiesBalance;
		return this;
	}

	public SecuritiesSettlement getSecuritiesSettlement() {
		return securitiesSettlement;
	}

	public SafekeepingPlace setSecuritiesSettlement(com.tools20022.repository.entity.SecuritiesSettlement securitiesSettlement) {
		this.securitiesSettlement = Objects.requireNonNull(securitiesSettlement);
		return this;
	}
}