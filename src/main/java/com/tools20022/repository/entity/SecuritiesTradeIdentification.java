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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the different identifications associated with a securities
 * transaction.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesTradeIdentification"
 * src="doc-files/SecuritiesTradeIdentification.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmIdentifiedTrade
 * SecuritiesTradeIdentification.mmIdentifiedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmMarketInfrastructureTransactionIdentification
 * SecuritiesTradeIdentification.mmMarketInfrastructureTransactionIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmProcessorTransactionIdentification
 * SecuritiesTradeIdentification.mmProcessorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmPoolIdentification
 * SecuritiesTradeIdentification.mmPoolIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCollateralTransactionIdentification
 * SecuritiesTradeIdentification.mmCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmClientTripartyCollateralTransactionIdentification
 * SecuritiesTradeIdentification.
 * mmClientTripartyCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmTripartyAgentCollateralTransactionIdentification
 * SecuritiesTradeIdentification.
 * mmTripartyAgentCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmBasketIdentification
 * SecuritiesTradeIdentification.mmBasketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmProgramIdentification
 * SecuritiesTradeIdentification.mmProgramIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmBlockIdentification
 * SecuritiesTradeIdentification.mmBlockIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmAllocationIdentification
 * SecuritiesTradeIdentification.mmAllocationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmComplianceIdentification
 * SecuritiesTradeIdentification.mmComplianceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCSDTransactionIdentification
 * SecuritiesTradeIdentification.mmCSDTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCentralCounterpartyTransactionIdentification
 * SecuritiesTradeIdentification.mmCentralCounterpartyTransactionIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCancellationRequestIdentification
 * SecuritiesTradeIdentification.mmCancellationRequestIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Identification1#mmIdentification
 * Identification1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Identification4#mmIdentification
 * Identification4.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages1#mmReference
 * Linkages1.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages21#mmReference
 * Linkages21.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages4#mmReference
 * Linkages4.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages22#mmReference
 * Linkages22.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages9#mmReference
 * Linkages9.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages14#mmReference
 * Linkages14.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages17#mmReference
 * Linkages17.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages24#mmReference
 * Linkages24.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages3#mmReference
 * Linkages3.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages6#mmReference
 * Linkages6.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages10#mmReference
 * Linkages10.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages11#mmReference
 * Linkages11.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages16#mmReference
 * Linkages16.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages23#mmReference
 * Linkages23.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages7#mmReference
 * Linkages7.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages12#mmReference
 * Linkages12.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages15#mmReference
 * Linkages15.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages18#mmReference
 * Linkages18.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages2#mmReference
 * Linkages2.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages8#mmReference
 * Linkages8.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages5#mmReference
 * Linkages5.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages13#mmReference
 * Linkages13.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages19#mmReference
 * Linkages19.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages25#mmReference
 * Linkages25.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages26#mmReference
 * Linkages26.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Identification14#mmIdentification
 * Identification14.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7#mmReference
 * MessageAndBusinessReference7.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages36#mmReference
 * Linkages36.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages37#mmReference
 * Linkages37.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages38#mmReference
 * Linkages38.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages40#mmReference
 * Linkages40.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8#mmReference
 * MessageAndBusinessReference8.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages43#mmReference
 * Linkages43.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages42#mmReference
 * Linkages42.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Identification16#mmIdentification
 * Identification16.mmIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages49#mmReference
 * Linkages49.mmReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages48#mmReference
 * Linkages48.mmReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.TradeIdentification
 * TradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.References11 References11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification1
 * Identification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications3
 * TransactionIdentifications3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications10
 * TransactionIdentifications10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications15
 * TransactionIdentifications15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification4
 * Identification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications19
 * TransactionIdentifications19}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References1Choice
 * References1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages1 Linkages1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages21 Linkages21}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References12Choice
 * References12Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages4 Linkages4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References28Choice
 * References28Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages22 Linkages22}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References5Choice
 * References5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References11Choice
 * References11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References19Choice
 * References19Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References21Choice
 * References21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References27Choice
 * References27Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References33Choice
 * References33Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References14Choice
 * References14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages9 Linkages9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References16Choice
 * References16Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages14 Linkages14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References25Choice
 * References25Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages17 Linkages17}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References32Choice
 * References32Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages24 Linkages24}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References3Choice
 * References3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References9Choice
 * References9Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References18Choice
 * References18Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References20Choice
 * References20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References29Choice
 * References29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References37Choice
 * References37Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References38Choice
 * References38Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References1 References1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References6Choice
 * References6Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages3 Linkages3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References2 References2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References10Choice
 * References10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages6 Linkages6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References7 References7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References13Choice
 * References13Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages10 Linkages10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References8 References8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References15Choice
 * References15Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages11 Linkages11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References9 References9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References24Choice
 * References24Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages16 Linkages16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References13 References13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References31Choice
 * References31Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages23 Linkages23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages7 Linkages7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages12 Linkages12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications2
 * TransactionIdentifications2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications7
 * TransactionIdentifications7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications9
 * TransactionIdentifications9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications13
 * TransactionIdentifications13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications16
 * TransactionIdentifications16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications22
 * TransactionIdentifications22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification2
 * Identification2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice
 * IdentificationReference8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages15 Linkages15}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
 * IdentificationReference11Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages18 Linkages18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References3 References3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference5
 * MessageAndBusinessReference5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference2
 * MessageAndBusinessReference2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference4
 * MessageAndBusinessReference4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference1
 * MessageAndBusinessReference1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference6
 * MessageAndBusinessReference6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages2 Linkages2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages8 Linkages8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications1
 * TransactionIdentifications1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification7
 * Identification7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References4Choice
 * References4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications4
 * TransactionIdentifications4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References22Choice
 * References22Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications11
 * TransactionIdentifications11}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References2Choice
 * References2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification6
 * Identification6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications6
 * TransactionIdentifications6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentification2
 * TransactionIdentification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentification3
 * TransactionIdentification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications18
 * TransactionIdentifications18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications20
 * TransactionIdentifications20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification5
 * Identification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification8
 * Identification8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification11
 * Identification11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification13
 * Identification13}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References8Choice
 * References8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References17Choice
 * References17Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References7Choice
 * References7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications8
 * TransactionIdentifications8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References23Choice
 * References23Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications14
 * TransactionIdentifications14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications17
 * TransactionIdentifications17}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References30Choice
 * References30Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications23
 * TransactionIdentifications23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification9
 * Identification9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages5 Linkages5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages13 Linkages13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages19 Linkages19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages25 Linkages25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications5
 * TransactionIdentifications5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications12
 * TransactionIdentifications12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References34Choice
 * References34Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages26 Linkages26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References14 References14}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References36Choice
 * References36Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References35Choice
 * References35Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications24
 * TransactionIdentifications24}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification14
 * Identification14}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification3
 * Identification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References15 References15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference7
 * MessageAndBusinessReference7}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References39Choice
 * References39Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications25
 * TransactionIdentifications25}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References16 References16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications26
 * TransactionIdentifications26}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References17 References17}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages36 Linkages36}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References45Choice
 * References45Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentification6
 * TransactionIdentification6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications29
 * TransactionIdentifications29}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages37 Linkages37}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications31
 * TransactionIdentifications31}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications33
 * TransactionIdentifications33}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References43Choice
 * References43Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications30
 * TransactionIdentifications30}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications32
 * TransactionIdentifications32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages38 Linkages38}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References46Choice
 * References46Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification15
 * Identification15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References41Choice
 * References41Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References44Choice
 * References44Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages40 Linkages40}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References47Choice
 * References47Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References42Choice
 * References42Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References18 References18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References20 References20}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference8
 * MessageAndBusinessReference8}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References48Choice
 * References48Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages43 Linkages43}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications35
 * TransactionIdentifications35}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References60Choice
 * References60Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications39
 * TransactionIdentifications39}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentification7
 * TransactionIdentification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications37
 * TransactionIdentifications37}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References53Choice
 * References53Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages42 Linkages42}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification16
 * Identification16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications34
 * TransactionIdentifications34}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionIdentifications38
 * TransactionIdentifications38}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References58Choice
 * References58Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Identification24
 * Identification24}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References50Choice
 * References50Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References51Choice
 * References51Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.References21 References21}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages49 Linkages49}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Linkages48 Linkages48}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References59Choice
 * References59Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.References54Choice
 * References54Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MessageAndBusinessReference10
 * MessageAndBusinessReference10}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTradeIdentification"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the different identifications associated with a securities transaction."
 * </li>
 * </ul>
 */
public class SecuritiesTradeIdentification extends TradeIdentification {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SecuritiesTrade identifiedTrade;
	/**
	 * Trade for which one or more identifications are provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecuritiesTradeRelatedIdentifications
	 * SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentifiedTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which one or more identifications are provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIdentifiedTrade = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "IdentifiedTrade";
			definition = "Trade for which one or more identifications are provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	protected Max35Text marketInfrastructureTransactionIdentification;
	/**
	 * Identification of a transaction assigned by a market infrastructure other
	 * than a central securities depository, for example, Target2-Securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications3#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications3.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications10#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications10.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications15#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications15.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications19#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications19.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails41#mmMarketInfrastructureTransactionIdentification
	 * TransactionDetails41.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails43#mmMarketInfrastructureTransactionIdentification
	 * TransactionDetails43.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References5Choice#mmMarketInfrastructureTransactionIdentification
	 * References5Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References11Choice#mmMarketInfrastructureTransactionIdentification
	 * References11Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References19Choice#mmMarketInfrastructureTransactionIdentification
	 * References19Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References21Choice#mmMarketInfrastructureTransactionIdentification
	 * References21Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References27Choice#mmMarketInfrastructureTransactionIdentification
	 * References27Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References33Choice#mmMarketInfrastructureTransactionIdentification
	 * References33Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References14Choice#mmMarketInfrastructureTransactionIdentification
	 * References14Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References16Choice#mmMarketInfrastructureTransactionIdentification
	 * References16Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References25Choice#mmMarketInfrastructureTransactionIdentification
	 * References25Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References32Choice#mmMarketInfrastructureTransactionIdentification
	 * References32Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References1#mmMarketInfrastructureTransactionIdentification
	 * References1.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References6Choice#mmMarketInfrastructureTransactionIdentification
	 * References6Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References2#mmMarketInfrastructureTransactionIdentification
	 * References2.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References10Choice#mmMarketInfrastructureTransactionIdentification
	 * References10Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References7#mmMarketInfrastructureTransactionIdentification
	 * References7.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References13Choice#mmMarketInfrastructureTransactionIdentification
	 * References13Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References8#mmMarketInfrastructureTransactionIdentification
	 * References8.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References15Choice#mmMarketInfrastructureTransactionIdentification
	 * References15Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References9#mmMarketInfrastructureTransactionIdentification
	 * References9.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References24Choice#mmMarketInfrastructureTransactionIdentification
	 * References24Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References13#mmMarketInfrastructureTransactionIdentification
	 * References13.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References31Choice#mmMarketInfrastructureTransactionIdentification
	 * References31Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#mmMarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification1.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#mmMarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification8.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#mmMarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification9.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#mmMarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification11.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#mmMarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification15.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#mmMarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification17.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#mmMarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification10.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#mmMarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification12.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications2#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications2.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications7#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications7.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications9#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications9.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications13#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications13.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications16#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications16.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications22#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications22.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#mmMarketInfrastructureTransactionIdentification
	 * Transaction7.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#mmMarketInfrastructureTransactionIdentification
	 * Transaction8.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#mmMarketInfrastructureTransactionIdentification
	 * Transaction9.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#mmMarketInfrastructureTransactionIdentification
	 * Transaction10.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#mmMarketInfrastructureTransactionIdentification
	 * Transaction14.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#mmMarketInfrastructureTransactionIdentification
	 * Transaction12.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#mmMarketInfrastructureTransactionIdentification
	 * Transaction15.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#mmMarketInfrastructureTransactionIdentification
	 * Transaction16.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#mmMarketInfrastructureTransactionIdentification
	 * Transaction20.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#mmMarketInfrastructureTransactionIdentification
	 * Transaction19.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#mmMarketInfrastructureTransactionIdentification
	 * Transaction23.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#mmMarketInfrastructureTransactionIdentification
	 * Transaction22.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#mmMarketInfrastructureTransactionIdentification
	 * Transaction28.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#mmMarketInfrastructureTransactionIdentification
	 * Transaction27.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#mmMarketInfrastructureTransactionIdentification
	 * Transaction30.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#mmMarketInfrastructureTransactionIdentification
	 * Transaction31.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#mmMarketInfrastructureTransactionIdentification
	 * Transaction6.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#mmMarketInfrastructureTransactionIdentification
	 * Transaction11.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#mmMarketInfrastructureTransactionIdentification
	 * Transaction13.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#mmMarketInfrastructureTransactionIdentification
	 * Transaction17.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#mmMarketInfrastructureTransactionIdentification
	 * Transaction18.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#mmMarketInfrastructureTransactionIdentification
	 * Transaction21.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#mmMarketInfrastructureTransactionIdentification
	 * Transaction29.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#mmMarketInfrastructureTransactionIdentification
	 * Transaction32.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#mmMarketInfrastructureTransactionIdentification
	 * Identification2.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmMarketInfrastructureTransactionIdentification
	 * IdentificationReference8Choice.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmMarketInfrastructureTransactionIdentification
	 * IdentificationReference11Choice.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionReferences3#mmMarketInfrastructureTransactionIdentification
	 * TransactionReferences3.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails13#mmMarketInfrastructureTransactionIdentification
	 * TransactionDetails13.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails4.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails17.mmMarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#mmMarketInfrastructureTransactionIdentification
	 * Identification7.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications4#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications4.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications11#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications11.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails11#mmMarketInfrastructureTransactionIdentification
	 * TransactionDetails11.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#mmMarketInfrastructureTransactionIdentification
	 * Identification6.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails21#mmMarketInfrastructureTransactionIdentification
	 * TransactionDetails21.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails10.mmMarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails22.mmMarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails23.mmMarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails29.mmMarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification2#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentification2.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification3#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentification3.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications18#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications18.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications20#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications20.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#mmMarketInfrastructureTransactionIdentification
	 * Identification5.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#mmMarketInfrastructureTransactionIdentification
	 * Identification8.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#mmMarketInfrastructureTransactionIdentification
	 * Identification11.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#mmMarketInfrastructureTransactionIdentification
	 * Identification13.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails15#mmMarketInfrastructureTransactionIdentification
	 * TransactionDetails15.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications8#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications8.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications14#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications14.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications17#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications17.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications23#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications23.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#mmMarketInfrastructureTransactionIdentification
	 * Identification9.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications5#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications5.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications12#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications12.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References34Choice#mmMarketInfrastructureTransactionIdentification
	 * References34Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References14#mmMarketInfrastructureTransactionIdentification
	 * References14.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#mmMarketInfrastructureTransactionIdentification
	 * IntraBalanceMovement1.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#mmMarketInfrastructureTransactionIdentification
	 * Transaction25.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References36Choice#mmMarketInfrastructureTransactionIdentification
	 * References36Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#mmMarketInfrastructureTransactionIdentification
	 * References35Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications24#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications24.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#mmMarketInfrastructureTransactionIdentification
	 * Identification3.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#mmMarketInfrastructureTransactionIdentification
	 * Transaction34.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications25#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications25.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails64#mmMarketInfrastructureTransactionIdentification
	 * TransactionDetails64.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#mmMarketInfrastructureTransactionIdentification
	 * Transaction35.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#mmMarketInfrastructureTransactionIdentification
	 * Transaction36.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails35.mmMarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References16#mmMarketInfrastructureTransactionIdentification
	 * References16.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications26#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications26.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#mmMarketInfrastructureTransactionIdentification
	 * Transaction38.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails65#mmMarketInfrastructureTransactionIdentification
	 * TransactionDetails65.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails42.mmMarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References17#mmMarketInfrastructureTransactionIdentification
	 * References17.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#mmMarketInfrastructureTransactionIdentification
	 * Transaction39.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#mmMarketInfrastructureTransactionIdentification
	 * Transaction37.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#mmMarketInfrastructureTransactionIdentification
	 * Transaction41.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#mmMarketInfrastructureTransactionIdentification
	 * Transaction40.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#mmMarketInfrastructureTransactionIdentification
	 * Transaction43.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#mmMarketInfrastructureTransactionIdentification
	 * Transaction42.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails49.mmMarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#mmMarketInfrastructureTransactionIdentification
	 * Transaction47.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmMarketInfrastructureTransactionIdentification
	 * TransactionDetails76.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#mmMarketInfrastructureTransactionIdentification
	 * Transaction45.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#mmMarketInfrastructureTransactionIdentification
	 * Transaction46.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification6#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentification6.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications29#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications29.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmMarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification19.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications31.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications33#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications33.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications30#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications30.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmMarketInfrastructureTransactionIdentification
	 * References46Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmMarketInfrastructureTransactionIdentification
	 * Identification15.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#mmMarketInfrastructureTransactionIdentification
	 * References41Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References42Choice#mmMarketInfrastructureTransactionIdentification
	 * References42Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#mmMarketInfrastructureTransactionIdentification
	 * References18.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#mmMarketInfrastructureTransactionIdentification
	 * Transaction49.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications39#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications39.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails61.mmMarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification7#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentification7.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications37#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications37.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications34#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications34.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#mmMarketInfrastructureTransactionIdentification
	 * SettlementTypeAndIdentification24.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails85#mmMarketInfrastructureTransactionIdentification
	 * TransactionDetails85.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications38#mmMarketInfrastructureTransactionIdentification
	 * TransactionIdentifications38.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#mmMarketInfrastructureTransactionIdentification
	 * Identification24.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#mmMarketInfrastructureTransactionIdentification
	 * Transaction50.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References50Choice#mmMarketInfrastructureTransactionIdentification
	 * References50Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References51Choice#mmMarketInfrastructureTransactionIdentification
	 * References51Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#mmMarketInfrastructureTransactionIdentification
	 * Transaction48.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References21#mmMarketInfrastructureTransactionIdentification
	 * References21.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References54Choice#mmMarketInfrastructureTransactionIdentification
	 * References54Choice.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmMarketInfrastructureTransactionIdentification
	 * Transaction53.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails68.mmMarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmMarketInfrastructureTransactionIdentification
	 * Transaction54.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmMarketInfrastructureTransactionIdentification
	 * Transaction52.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeDetails69.mmMarketInfrastructureTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#mmMarketInfrastructureTransactionIdentification
	 * Transaction57.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#mmMarketInfrastructureTransactionIdentification
	 * Transaction56.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#mmMarketInfrastructureTransactionIdentification
	 * Transaction55.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails101#mmMarketInfrastructureTransactionIdentification
	 * TransactionDetails101.mmMarketInfrastructureTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructureTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmMarketInfrastructureTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionIdentifications3.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications10.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications15.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications19.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionDetails41.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails43.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References5Choice.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References11Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References19Choice.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References21Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References27Choice.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References33Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References14Choice.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References16Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References25Choice.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References32Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References1.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References6Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References2.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References10Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References7.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References13Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References8.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References15Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References9.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References24Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References13.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References31Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification1.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification8.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification9.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification11.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification15.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification17.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification10.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification12.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications2.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications7.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications9.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications13.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications16.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications22.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction7.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction8.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction9.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction10.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction14.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction12.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction15.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction16.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction20.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction19.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction23.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction22.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction28.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction27.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction30.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction31.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction6.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction11.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction13.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction17.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction18.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction21.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction29.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction32.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Identification2.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.IdentificationReference8Choice.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.IdentificationReference11Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionReferences3.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails13.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails4.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Identification7.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications4.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications11.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails11.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Identification6.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails21.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails10.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails22.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails23.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification2.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification3.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications18.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications20.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Identification5.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Identification8.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Identification11.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Identification13.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionDetails15.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications8.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications14.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications17.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications23.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Identification9.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications5.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications12.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References34Choice.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.References14.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.IntraBalanceMovement1.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction25.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References36Choice.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References35Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications24.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Identification3.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction34.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications25.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionDetails64.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction35.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction36.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References16.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications26.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction38.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails65.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails42.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.References17.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction39.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction37.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction41.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction40.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction43.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction42.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails49.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction47.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionDetails76.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction45.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction46.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification6.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications29.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification19.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications31.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications33.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications30.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References46Choice.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Identification15.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References41Choice.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References42Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.References18.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction49.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications39.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification7.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications37.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications34.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification24.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionDetails85.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications38.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Identification24.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction50.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References50Choice.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.choice.References51Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction48.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.References21.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.References54Choice.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction53.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails68.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction54.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction52.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction57.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.Transaction56.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.Transaction55.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails101.mmMarketInfrastructureTransactionIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text processorTransactionIdentification;
	/**
	 * Identification of the transaction assigned by the processor of the
	 * instruction other than the account owner the account servicer and the
	 * market infrastructure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications10#mmProcessorTransactionIdentification
	 * TransactionIdentifications10.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications15#mmProcessorTransactionIdentification
	 * TransactionIdentifications15.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications19#mmProcessorTransactionIdentification
	 * TransactionIdentifications19.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails41#mmProcessorTransactionIdentification
	 * TransactionDetails41.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails43#mmProcessorTransactionIdentification
	 * TransactionDetails43.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#mmProcessorTransactionIdentification
	 * AdditionalParameters8.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#mmProcessorTransactionIdentification
	 * AdditionalParameters9.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#mmProcessorTransactionIdentification
	 * AdditionalParameters10.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#mmProcessorTransactionIdentification
	 * AdditionalParameters11.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References19Choice#mmProcessorTransactionIdentification
	 * References19Choice.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References21Choice#mmProcessorTransactionIdentification
	 * References21Choice.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References27Choice#mmProcessorTransactionIdentification
	 * References27Choice.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References33Choice#mmProcessorTransactionIdentification
	 * References33Choice.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References7#mmProcessorTransactionIdentification
	 * References7.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References8#mmProcessorTransactionIdentification
	 * References8.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References9#mmProcessorTransactionIdentification
	 * References9.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References13#mmProcessorTransactionIdentification
	 * References13.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#mmProcessorTransactionIdentification
	 * SettlementTypeAndIdentification9.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#mmProcessorTransactionIdentification
	 * SettlementTypeAndIdentification11.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#mmProcessorTransactionIdentification
	 * SettlementTypeAndIdentification15.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#mmProcessorTransactionIdentification
	 * SettlementTypeAndIdentification17.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#mmProcessorTransactionIdentification
	 * SettlementTypeAndIdentification10.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#mmProcessorTransactionIdentification
	 * SettlementTypeAndIdentification12.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications9#mmProcessorTransactionIdentification
	 * TransactionIdentifications9.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications13#mmProcessorTransactionIdentification
	 * TransactionIdentifications13.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications16#mmProcessorTransactionIdentification
	 * TransactionIdentifications16.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications22#mmProcessorTransactionIdentification
	 * TransactionIdentifications22.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#mmProcessorTransactionIdentification
	 * Transaction14.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#mmProcessorTransactionIdentification
	 * Transaction12.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#mmProcessorTransactionIdentification
	 * Transaction15.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#mmProcessorTransactionIdentification
	 * Transaction16.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#mmProcessorTransactionIdentification
	 * Transaction20.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#mmProcessorTransactionIdentification
	 * Transaction19.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#mmProcessorTransactionIdentification
	 * Transaction23.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#mmProcessorTransactionIdentification
	 * Transaction22.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#mmProcessorTransactionIdentification
	 * Transaction28.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#mmProcessorTransactionIdentification
	 * Transaction27.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#mmProcessorTransactionIdentification
	 * Transaction30.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#mmProcessorTransactionIdentification
	 * Transaction31.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#mmProcessorTransactionIdentification
	 * Transaction13.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#mmProcessorTransactionIdentification
	 * Transaction17.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#mmProcessorTransactionIdentification
	 * Transaction18.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#mmProcessorTransactionIdentification
	 * Transaction21.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#mmProcessorTransactionIdentification
	 * Transaction29.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#mmProcessorTransactionIdentification
	 * Transaction32.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails18.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails17.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#mmProcessorTransactionIdentification
	 * Identification7.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications11#mmProcessorTransactionIdentification
	 * TransactionIdentifications11.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#mmProcessorTransactionIdentification
	 * Identification6.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails21.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails22.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails23.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails29.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification2#mmProcessorTransactionIdentification
	 * TransactionIdentification2.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification3#mmProcessorTransactionIdentification
	 * TransactionIdentification3.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications18#mmProcessorTransactionIdentification
	 * TransactionIdentifications18.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications20#mmProcessorTransactionIdentification
	 * TransactionIdentifications20.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#mmProcessorTransactionIdentification
	 * Identification8.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#mmProcessorTransactionIdentification
	 * Identification11.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#mmProcessorTransactionIdentification
	 * Identification13.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications14#mmProcessorTransactionIdentification
	 * TransactionIdentifications14.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications17#mmProcessorTransactionIdentification
	 * TransactionIdentifications17.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications23#mmProcessorTransactionIdentification
	 * TransactionIdentifications23.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#mmProcessorTransactionIdentification
	 * Identification9.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications12#mmProcessorTransactionIdentification
	 * TransactionIdentifications12.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References14#mmProcessorTransactionIdentification
	 * References14.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#mmProcessorTransactionIdentification
	 * Transaction25.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References36Choice#mmProcessorTransactionIdentification
	 * References36Choice.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#mmProcessorTransactionIdentification
	 * References35Choice.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications24#mmProcessorTransactionIdentification
	 * TransactionIdentifications24.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#mmProcessorTransactionIdentification
	 * AdditionalParameters16.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#mmProcessorTransactionIdentification
	 * Transaction34.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications25#mmProcessorTransactionIdentification
	 * TransactionIdentifications25.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails64#mmProcessorTransactionIdentification
	 * TransactionDetails64.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#mmProcessorTransactionIdentification
	 * Transaction35.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#mmProcessorTransactionIdentification
	 * Transaction36.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails35.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails36.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References16#mmProcessorTransactionIdentification
	 * References16.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications26#mmProcessorTransactionIdentification
	 * TransactionIdentifications26.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails41.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#mmProcessorTransactionIdentification
	 * Transaction38.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails65#mmProcessorTransactionIdentification
	 * TransactionDetails65.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails42.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References17#mmProcessorTransactionIdentification
	 * References17.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#mmProcessorTransactionIdentification
	 * Transaction39.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#mmProcessorTransactionIdentification
	 * Transaction37.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#mmProcessorTransactionIdentification
	 * Transaction41.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#mmProcessorTransactionIdentification
	 * Transaction40.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#mmProcessorTransactionIdentification
	 * Transaction43.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#mmProcessorTransactionIdentification
	 * Transaction42.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails49.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#mmProcessorTransactionIdentification
	 * Transaction47.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails76#mmProcessorTransactionIdentification
	 * TransactionDetails76.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#mmProcessorTransactionIdentification
	 * Transaction45.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#mmProcessorTransactionIdentification
	 * Transaction46.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification6#mmProcessorTransactionIdentification
	 * TransactionIdentification6.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications29#mmProcessorTransactionIdentification
	 * TransactionIdentifications29.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmProcessorTransactionIdentification
	 * SettlementTypeAndIdentification19.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31#mmProcessorTransactionIdentification
	 * TransactionIdentifications31.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications33#mmProcessorTransactionIdentification
	 * TransactionIdentifications33.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmProcessorTransactionIdentification
	 * AdditionalParameters21.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails54.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications30#mmProcessorTransactionIdentification
	 * TransactionIdentifications30.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmProcessorTransactionIdentification
	 * Identification15.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References42Choice#mmProcessorTransactionIdentification
	 * References42Choice.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#mmProcessorTransactionIdentification
	 * References18.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#mmProcessorTransactionIdentification
	 * Transaction49.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications39#mmProcessorTransactionIdentification
	 * TransactionIdentifications39.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails61.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentification7#mmProcessorTransactionIdentification
	 * TransactionIdentification7.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications37#mmProcessorTransactionIdentification
	 * TransactionIdentifications37.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#mmProcessorTransactionIdentification
	 * AdditionalParameters25.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications34#mmProcessorTransactionIdentification
	 * TransactionIdentifications34.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#mmProcessorTransactionIdentification
	 * SettlementTypeAndIdentification24.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails85#mmProcessorTransactionIdentification
	 * TransactionDetails85.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications38#mmProcessorTransactionIdentification
	 * TransactionIdentifications38.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails60.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#mmProcessorTransactionIdentification
	 * Identification24.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#mmProcessorTransactionIdentification
	 * Transaction50.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References51Choice#mmProcessorTransactionIdentification
	 * References51Choice.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#mmProcessorTransactionIdentification
	 * Transaction48.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References21#mmProcessorTransactionIdentification
	 * References21.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmProcessorTransactionIdentification
	 * Transaction53.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails68.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmProcessorTransactionIdentification
	 * Transaction54.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmProcessorTransactionIdentification
	 * Transaction52.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmProcessorTransactionIdentification
	 * SecuritiesTradeDetails69.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#mmProcessorTransactionIdentification
	 * Transaction57.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#mmProcessorTransactionIdentification
	 * Transaction56.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#mmProcessorTransactionIdentification
	 * Transaction55.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails101#mmProcessorTransactionIdentification
	 * TransactionDetails101.mmProcessorTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessorTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the processor of the instruction other than the account owner the account servicer and the market infrastructure."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProcessorTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TransactionIdentifications10.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications15.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications19.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails41.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionDetails43.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters8.mmProcessorTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters9.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters10.mmProcessorTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters11.mmProcessorTransactionIdentification,
					com.tools20022.repository.choice.References19Choice.mmProcessorTransactionIdentification, com.tools20022.repository.choice.References21Choice.mmProcessorTransactionIdentification,
					com.tools20022.repository.choice.References27Choice.mmProcessorTransactionIdentification, com.tools20022.repository.choice.References33Choice.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.References7.mmProcessorTransactionIdentification, com.tools20022.repository.msg.References8.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.References9.mmProcessorTransactionIdentification, com.tools20022.repository.msg.References13.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification9.mmProcessorTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification11.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification15.mmProcessorTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification17.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification10.mmProcessorTransactionIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification12.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications9.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications13.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications16.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications22.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction14.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction12.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction15.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction16.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction20.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction19.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction23.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction22.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction28.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction27.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction30.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction31.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction13.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction17.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction18.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction21.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction29.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction32.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails18.mmProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails17.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Identification7.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications11.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Identification6.mmProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails21.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails22.mmProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails23.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails29.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentification2.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification3.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications18.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications20.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Identification8.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Identification11.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Identification13.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications14.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications17.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications23.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Identification9.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications12.mmProcessorTransactionIdentification, com.tools20022.repository.msg.References14.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction25.mmProcessorTransactionIdentification, com.tools20022.repository.choice.References36Choice.mmProcessorTransactionIdentification,
					com.tools20022.repository.choice.References35Choice.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications24.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters16.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction34.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications25.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionDetails64.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction35.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction36.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.mmProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails36.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.References16.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications26.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails41.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction38.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails65.mmProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails42.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.References17.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction39.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction37.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction41.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction40.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction43.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction42.mmProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails49.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction47.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionDetails76.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction45.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction46.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification6.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications29.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification19.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications31.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications33.mmProcessorTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters21.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails54.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications30.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Identification15.mmProcessorTransactionIdentification, com.tools20022.repository.choice.References42Choice.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.References18.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction49.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications39.mmProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails61.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentification7.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications37.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters25.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionIdentifications34.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification24.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionDetails85.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.TransactionIdentifications38.mmProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails60.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Identification24.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction50.mmProcessorTransactionIdentification,
					com.tools20022.repository.choice.References51Choice.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction48.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.References21.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction53.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction54.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction52.mmProcessorTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails69.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction57.mmProcessorTransactionIdentification, com.tools20022.repository.msg.Transaction56.mmProcessorTransactionIdentification,
					com.tools20022.repository.msg.Transaction55.mmProcessorTransactionIdentification, com.tools20022.repository.msg.TransactionDetails101.mmProcessorTransactionIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProcessorTransactionIdentification";
			definition = "Identification of the transaction assigned by the processor of the instruction other than the account owner the account servicer and the market infrastructure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text poolIdentification;
	/**
	 * Collective reference identifying a set of messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References1Choice#mmPoolIdentification
	 * References1Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References12Choice#mmPoolIdentification
	 * References12Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References28Choice#mmPoolIdentification
	 * References28Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3#mmPoolIdentification
	 * AdditionalParameters3.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters7#mmPoolIdentification
	 * AdditionalParameters7.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#mmPoolIdentification
	 * AdditionalParameters8.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#mmPoolIdentification
	 * AdditionalParameters9.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#mmPoolIdentification
	 * AdditionalParameters10.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#mmPoolIdentification
	 * AdditionalParameters11.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References5Choice#mmPoolIdentification
	 * References5Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References11Choice#mmPoolIdentification
	 * References11Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References19Choice#mmPoolIdentification
	 * References19Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References21Choice#mmPoolIdentification
	 * References21Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References27Choice#mmPoolIdentification
	 * References27Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References33Choice#mmPoolIdentification
	 * References33Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters3.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters6.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References14Choice#mmPoolIdentification
	 * References14Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References16Choice#mmPoolIdentification
	 * References16Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References25Choice#mmPoolIdentification
	 * References25Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References32Choice#mmPoolIdentification
	 * References32Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References1#mmPoolIdentification
	 * References1.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References6Choice#mmPoolIdentification
	 * References6Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References2#mmPoolIdentification
	 * References2.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References10Choice#mmPoolIdentification
	 * References10Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References7#mmPoolIdentification
	 * References7.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References13Choice#mmPoolIdentification
	 * References13Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References8#mmPoolIdentification
	 * References8.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References15Choice#mmPoolIdentification
	 * References15Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References9#mmPoolIdentification
	 * References9.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References24Choice#mmPoolIdentification
	 * References24Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References13#mmPoolIdentification
	 * References13.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References31Choice#mmPoolIdentification
	 * References31Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification1#mmPoolIdentification
	 * SettlementTypeAndIdentification1.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification8#mmPoolIdentification
	 * SettlementTypeAndIdentification8.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification9#mmPoolIdentification
	 * SettlementTypeAndIdentification9.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification11#mmPoolIdentification
	 * SettlementTypeAndIdentification11.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification15#mmPoolIdentification
	 * SettlementTypeAndIdentification15.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification17#mmPoolIdentification
	 * SettlementTypeAndIdentification17.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification10#mmPoolIdentification
	 * SettlementTypeAndIdentification10.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification12#mmPoolIdentification
	 * SettlementTypeAndIdentification12.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmPoolIdentification
	 * TransactionDetails5.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmPoolIdentification
	 * TransactionDetails9.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmPoolIdentification
	 * TransactionDetails22.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmPoolIdentification
	 * TransactionDetails23.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmPoolIdentification
	 * TransactionDetails36.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmPoolIdentification
	 * TransactionDetails47.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmPoolIdentification
	 * TransactionDetails53.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmPoolIdentification
	 * TransactionDetails58.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#mmPoolIdentification
	 * Transaction7.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#mmPoolIdentification
	 * Transaction8.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#mmPoolIdentification
	 * Transaction9.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#mmPoolIdentification
	 * Transaction10.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#mmPoolIdentification
	 * Transaction14.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#mmPoolIdentification
	 * Transaction12.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#mmPoolIdentification
	 * Transaction15.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#mmPoolIdentification
	 * Transaction16.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#mmPoolIdentification
	 * Transaction20.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#mmPoolIdentification
	 * Transaction19.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#mmPoolIdentification
	 * Transaction23.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#mmPoolIdentification
	 * Transaction22.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#mmPoolIdentification
	 * Transaction28.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#mmPoolIdentification
	 * Transaction27.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#mmPoolIdentification
	 * Transaction30.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#mmPoolIdentification
	 * Transaction31.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#mmPoolIdentification
	 * Transaction6.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#mmPoolIdentification
	 * Transaction11.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#mmPoolIdentification
	 * Transaction13.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#mmPoolIdentification
	 * Transaction17.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#mmPoolIdentification
	 * Transaction18.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#mmPoolIdentification
	 * Transaction21.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#mmPoolIdentification
	 * Transaction29.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#mmPoolIdentification
	 * Transaction32.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#mmPoolIdentification
	 * Identification2.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmPoolIdentification
	 * IdentificationReference8Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmPoolIdentification
	 * IdentificationReference11Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters2.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters7.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails2.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails8.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmPoolIdentification
	 * SecuritiesTradeDetails4.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmPoolIdentification
	 * SecuritiesTradeDetails17.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#mmPoolIdentification
	 * Identification7.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#mmPoolIdentification
	 * Identification6.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters5.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters8.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails6.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails10.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails17.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails18.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmPoolIdentification
	 * SecuritiesTradeDetails10.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmPoolIdentification
	 * SecuritiesTradeDetails22.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmPoolIdentification
	 * SecuritiesTradeDetails23.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmPoolIdentification
	 * SecuritiesTradeDetails29.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#mmPoolIdentification
	 * Identification5.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#mmPoolIdentification
	 * Identification8.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#mmPoolIdentification
	 * Identification11.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#mmPoolIdentification
	 * Identification13.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#mmPoolIdentification
	 * Identification9.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References34Choice#mmPoolIdentification
	 * References34Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References14#mmPoolIdentification
	 * References14.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#mmPoolIdentification
	 * Transaction25.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References36Choice#mmPoolIdentification
	 * References36Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References35Choice#mmPoolIdentification
	 * References35Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#mmPoolIdentification
	 * Identification3.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#mmPoolIdentification
	 * AdditionalParameters16.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmPoolIdentification
	 * TransactionDetails61.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#mmPoolIdentification
	 * Transaction34.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails21.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#mmPoolIdentification
	 * Transaction35.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#mmPoolIdentification
	 * Transaction36.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmPoolIdentification
	 * SecuritiesTradeDetails35.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References16#mmPoolIdentification
	 * References16.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails22.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#mmPoolIdentification
	 * Transaction38.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmPoolIdentification
	 * TransactionDetails66.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmPoolIdentification
	 * SecuritiesTradeDetails42.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References17#mmPoolIdentification
	 * References17.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#mmPoolIdentification
	 * Transaction39.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#mmPoolIdentification
	 * Transaction37.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails24.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#mmPoolIdentification
	 * Transaction41.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmPoolIdentification
	 * TransactionDetails70.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#mmPoolIdentification
	 * Transaction40.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#mmPoolIdentification
	 * Transaction43.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmPoolIdentification
	 * TransactionDetails71.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails25.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#mmPoolIdentification
	 * Transaction42.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmPoolIdentification
	 * SecuritiesTradeDetails49.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#mmPoolIdentification
	 * Transaction47.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails26.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmPoolIdentification
	 * TransactionDetails79.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#mmPoolIdentification
	 * Transaction45.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#mmPoolIdentification
	 * Transaction46.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification19#mmPoolIdentification
	 * SettlementTypeAndIdentification19.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters10.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters11.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmPoolIdentification
	 * AdditionalParameters21.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References46Choice#mmPoolIdentification
	 * References46Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmPoolIdentification
	 * Identification15.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References41Choice#mmPoolIdentification
	 * References41Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References47Choice#mmPoolIdentification
	 * References47Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References42Choice#mmPoolIdentification
	 * References42Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References18#mmPoolIdentification
	 * References18.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails33.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#mmPoolIdentification
	 * Transaction49.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters14.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters12.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmPoolIdentification
	 * SecuritiesTradeDetails61.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#mmPoolIdentification
	 * AdditionalParameters25.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification24#mmPoolIdentification
	 * SettlementTypeAndIdentification24.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmPoolIdentification
	 * TransactionDetails87.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References58Choice#mmPoolIdentification
	 * References58Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#mmPoolIdentification
	 * Identification24.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#mmPoolIdentification
	 * Transaction50.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References50Choice#mmPoolIdentification
	 * References50Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References51Choice#mmPoolIdentification
	 * References51Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#mmPoolIdentification
	 * Transaction48.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.References21#mmPoolIdentification
	 * References21.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.References54Choice#mmPoolIdentification
	 * References54Choice.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmPoolIdentification
	 * Transaction53.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmPoolIdentification
	 * SecuritiesTradeDetails68.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmPoolIdentification
	 * TransactionDetails97.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters17.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters16.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails35.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmPoolIdentification
	 * Transaction54.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmPoolIdentification
	 * Transaction52.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters19.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmPoolIdentification
	 * SecuritiesTradeDetails69.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20#mmPoolIdentification
	 * TransactionTypeAndAdditionalParameters20.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#mmPoolIdentification
	 * Transaction57.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmPoolIdentification
	 * SecuritiesFinancingTransactionDetails36.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#mmPoolIdentification
	 * Transaction56.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmPoolIdentification
	 * TransactionDetails100.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#mmPoolIdentification
	 * Transaction55.mmPoolIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPoolIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.References1Choice.mmPoolIdentification, com.tools20022.repository.choice.References12Choice.mmPoolIdentification,
					com.tools20022.repository.choice.References28Choice.mmPoolIdentification, com.tools20022.repository.msg.AdditionalParameters3.mmPoolIdentification,
					com.tools20022.repository.msg.AdditionalParameters7.mmPoolIdentification, com.tools20022.repository.msg.AdditionalParameters8.mmPoolIdentification,
					com.tools20022.repository.msg.AdditionalParameters9.mmPoolIdentification, com.tools20022.repository.msg.AdditionalParameters10.mmPoolIdentification,
					com.tools20022.repository.msg.AdditionalParameters11.mmPoolIdentification, com.tools20022.repository.choice.References5Choice.mmPoolIdentification,
					com.tools20022.repository.choice.References11Choice.mmPoolIdentification, com.tools20022.repository.choice.References19Choice.mmPoolIdentification,
					com.tools20022.repository.choice.References21Choice.mmPoolIdentification, com.tools20022.repository.choice.References27Choice.mmPoolIdentification,
					com.tools20022.repository.choice.References33Choice.mmPoolIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters3.mmPoolIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters6.mmPoolIdentification, com.tools20022.repository.choice.References14Choice.mmPoolIdentification,
					com.tools20022.repository.choice.References16Choice.mmPoolIdentification, com.tools20022.repository.choice.References25Choice.mmPoolIdentification,
					com.tools20022.repository.choice.References32Choice.mmPoolIdentification, com.tools20022.repository.msg.References1.mmPoolIdentification, com.tools20022.repository.choice.References6Choice.mmPoolIdentification,
					com.tools20022.repository.msg.References2.mmPoolIdentification, com.tools20022.repository.choice.References10Choice.mmPoolIdentification, com.tools20022.repository.msg.References7.mmPoolIdentification,
					com.tools20022.repository.choice.References13Choice.mmPoolIdentification, com.tools20022.repository.msg.References8.mmPoolIdentification, com.tools20022.repository.choice.References15Choice.mmPoolIdentification,
					com.tools20022.repository.msg.References9.mmPoolIdentification, com.tools20022.repository.choice.References24Choice.mmPoolIdentification, com.tools20022.repository.msg.References13.mmPoolIdentification,
					com.tools20022.repository.choice.References31Choice.mmPoolIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification1.mmPoolIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification8.mmPoolIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification9.mmPoolIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification11.mmPoolIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification15.mmPoolIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification17.mmPoolIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification10.mmPoolIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification12.mmPoolIdentification, com.tools20022.repository.msg.TransactionDetails5.mmPoolIdentification,
					com.tools20022.repository.msg.TransactionDetails9.mmPoolIdentification, com.tools20022.repository.msg.TransactionDetails22.mmPoolIdentification, com.tools20022.repository.msg.TransactionDetails23.mmPoolIdentification,
					com.tools20022.repository.msg.TransactionDetails36.mmPoolIdentification, com.tools20022.repository.msg.TransactionDetails47.mmPoolIdentification, com.tools20022.repository.msg.TransactionDetails53.mmPoolIdentification,
					com.tools20022.repository.msg.TransactionDetails58.mmPoolIdentification, com.tools20022.repository.msg.Transaction7.mmPoolIdentification, com.tools20022.repository.msg.Transaction8.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction9.mmPoolIdentification, com.tools20022.repository.msg.Transaction10.mmPoolIdentification, com.tools20022.repository.msg.Transaction14.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction12.mmPoolIdentification, com.tools20022.repository.msg.Transaction15.mmPoolIdentification, com.tools20022.repository.msg.Transaction16.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction20.mmPoolIdentification, com.tools20022.repository.msg.Transaction19.mmPoolIdentification, com.tools20022.repository.msg.Transaction23.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction22.mmPoolIdentification, com.tools20022.repository.msg.Transaction28.mmPoolIdentification, com.tools20022.repository.msg.Transaction27.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction30.mmPoolIdentification, com.tools20022.repository.msg.Transaction31.mmPoolIdentification, com.tools20022.repository.msg.Transaction6.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction11.mmPoolIdentification, com.tools20022.repository.msg.Transaction13.mmPoolIdentification, com.tools20022.repository.msg.Transaction17.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction18.mmPoolIdentification, com.tools20022.repository.msg.Transaction21.mmPoolIdentification, com.tools20022.repository.msg.Transaction29.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction32.mmPoolIdentification, com.tools20022.repository.msg.Identification2.mmPoolIdentification, com.tools20022.repository.choice.IdentificationReference8Choice.mmPoolIdentification,
					com.tools20022.repository.choice.IdentificationReference11Choice.mmPoolIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters2.mmPoolIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters7.mmPoolIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmPoolIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails4.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails17.mmPoolIdentification, com.tools20022.repository.msg.Identification7.mmPoolIdentification, com.tools20022.repository.msg.Identification6.mmPoolIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters5.mmPoolIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters8.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmPoolIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmPoolIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.mmPoolIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails22.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.mmPoolIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails29.mmPoolIdentification,
					com.tools20022.repository.msg.Identification5.mmPoolIdentification, com.tools20022.repository.msg.Identification8.mmPoolIdentification, com.tools20022.repository.msg.Identification11.mmPoolIdentification,
					com.tools20022.repository.msg.Identification13.mmPoolIdentification, com.tools20022.repository.msg.Identification9.mmPoolIdentification, com.tools20022.repository.choice.References34Choice.mmPoolIdentification,
					com.tools20022.repository.msg.References14.mmPoolIdentification, com.tools20022.repository.msg.Transaction25.mmPoolIdentification, com.tools20022.repository.choice.References36Choice.mmPoolIdentification,
					com.tools20022.repository.choice.References35Choice.mmPoolIdentification, com.tools20022.repository.msg.Identification3.mmPoolIdentification, com.tools20022.repository.msg.AdditionalParameters16.mmPoolIdentification,
					com.tools20022.repository.msg.TransactionDetails61.mmPoolIdentification, com.tools20022.repository.msg.Transaction34.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmPoolIdentification, com.tools20022.repository.msg.Transaction35.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction36.mmPoolIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails35.mmPoolIdentification, com.tools20022.repository.msg.References16.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmPoolIdentification, com.tools20022.repository.msg.Transaction38.mmPoolIdentification,
					com.tools20022.repository.msg.TransactionDetails66.mmPoolIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails42.mmPoolIdentification, com.tools20022.repository.msg.References17.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction39.mmPoolIdentification, com.tools20022.repository.msg.Transaction37.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmPoolIdentification, com.tools20022.repository.msg.Transaction41.mmPoolIdentification,
					com.tools20022.repository.msg.TransactionDetails70.mmPoolIdentification, com.tools20022.repository.msg.Transaction40.mmPoolIdentification, com.tools20022.repository.msg.Transaction43.mmPoolIdentification,
					com.tools20022.repository.msg.TransactionDetails71.mmPoolIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction42.mmPoolIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails49.mmPoolIdentification, com.tools20022.repository.msg.Transaction47.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmPoolIdentification, com.tools20022.repository.msg.TransactionDetails79.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction45.mmPoolIdentification, com.tools20022.repository.msg.Transaction46.mmPoolIdentification, com.tools20022.repository.msg.SettlementTypeAndIdentification19.mmPoolIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters10.mmPoolIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters11.mmPoolIdentification,
					com.tools20022.repository.msg.AdditionalParameters21.mmPoolIdentification, com.tools20022.repository.choice.References46Choice.mmPoolIdentification, com.tools20022.repository.msg.Identification15.mmPoolIdentification,
					com.tools20022.repository.choice.References41Choice.mmPoolIdentification, com.tools20022.repository.choice.References47Choice.mmPoolIdentification,
					com.tools20022.repository.choice.References42Choice.mmPoolIdentification, com.tools20022.repository.msg.References18.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmPoolIdentification, com.tools20022.repository.msg.Transaction49.mmPoolIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters14.mmPoolIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters12.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails61.mmPoolIdentification, com.tools20022.repository.msg.AdditionalParameters25.mmPoolIdentification,
					com.tools20022.repository.msg.SettlementTypeAndIdentification24.mmPoolIdentification, com.tools20022.repository.msg.TransactionDetails87.mmPoolIdentification,
					com.tools20022.repository.choice.References58Choice.mmPoolIdentification, com.tools20022.repository.msg.Identification24.mmPoolIdentification, com.tools20022.repository.msg.Transaction50.mmPoolIdentification,
					com.tools20022.repository.choice.References50Choice.mmPoolIdentification, com.tools20022.repository.choice.References51Choice.mmPoolIdentification, com.tools20022.repository.msg.Transaction48.mmPoolIdentification,
					com.tools20022.repository.msg.References21.mmPoolIdentification, com.tools20022.repository.choice.References54Choice.mmPoolIdentification, com.tools20022.repository.msg.Transaction53.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.mmPoolIdentification, com.tools20022.repository.msg.TransactionDetails97.mmPoolIdentification,
					com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters17.mmPoolIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters16.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmPoolIdentification, com.tools20022.repository.msg.Transaction54.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction52.mmPoolIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters19.mmPoolIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.mmPoolIdentification, com.tools20022.repository.msg.TransactionTypeAndAdditionalParameters20.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction57.mmPoolIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmPoolIdentification,
					com.tools20022.repository.msg.Transaction56.mmPoolIdentification, com.tools20022.repository.msg.TransactionDetails100.mmPoolIdentification, com.tools20022.repository.msg.Transaction55.mmPoolIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PoolIdentification";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text collateralTransactionIdentification;
	/**
	 * Unambiguous identification of a collateral transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails25#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails25.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails26#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails26.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails27.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails28#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails28.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails2#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails2.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails16#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails16.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails1#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails1.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails15#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails15.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmClientCollateralInstructionIdentification
	 * TransactionDetails53.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmClientCollateralInstructionIdentification
	 * TransactionDetails58.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#mmClientCollateralInstructionIdentification
	 * Transaction28.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#mmClientCollateralInstructionIdentification
	 * Transaction27.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#mmClientCollateralInstructionIdentification
	 * Transaction30.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#mmClientCollateralInstructionIdentification
	 * Transaction31.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#mmClientCollateralInstructionIdentification
	 * Transaction29.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#mmClientCollateralInstructionIdentification
	 * Transaction32.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmCollateralTransactionIdentification
	 * IdentificationReference8Choice.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmCollateralTransactionIdentification
	 * IdentificationReference11Choice.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails8#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails8.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails18#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails18.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails4#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails4.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails17#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails17.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails9#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails9.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails21#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails21.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails10#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails10.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails22#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails22.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails23#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails23.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails29#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails29.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmClientCollateralInstructionIdentification
	 * TransactionDetails61.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#mmClientCollateralInstructionIdentification
	 * Transaction34.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#mmClientCollateralInstructionIdentification
	 * Transaction35.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#mmClientCollateralInstructionIdentification
	 * Transaction36.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails31#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails31.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails33#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails33.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails35#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails35.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails36#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails36.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails34#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails34.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails32#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails32.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails44#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails44.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails43#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails43.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails41#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails41.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#mmClientCollateralInstructionIdentification
	 * Transaction38.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmClientCollateralInstructionIdentification
	 * TransactionDetails66.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails42#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails42.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#mmClientCollateralInstructionIdentification
	 * Transaction39.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails46#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails46.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails47#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails47.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#mmClientCollateralInstructionIdentification
	 * Transaction37.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#mmClientCollateralInstructionIdentification
	 * Transaction41.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmClientCollateralInstructionIdentification
	 * TransactionDetails70.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#mmClientCollateralInstructionIdentification
	 * Transaction40.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#mmClientCollateralInstructionIdentification
	 * Transaction43.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmClientCollateralInstructionIdentification
	 * TransactionDetails71.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#mmClientCollateralInstructionIdentification
	 * Transaction42.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails49#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails49.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#mmClientCollateralInstructionIdentification
	 * Transaction47.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmClientCollateralInstructionIdentification
	 * TransactionDetails79.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#mmClientCollateralInstructionIdentification
	 * Transaction45.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#mmClientCollateralInstructionIdentification
	 * Transaction46.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails51.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails53.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails54.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails52.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails50.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#mmClientCollateralInstructionIdentification
	 * Transaction49.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails61#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails61.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails63#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails63.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails62#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails62.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmClientCollateralInstructionIdentification
	 * TransactionDetails87.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails60#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails60.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#mmClientCollateralInstructionIdentification
	 * Transaction50.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#mmClientCollateralInstructionIdentification
	 * Transaction48.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails65#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails65.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails66#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails66.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails67.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmClientCollateralInstructionIdentification
	 * Transaction53.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails68.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmClientCollateralInstructionIdentification
	 * TransactionDetails97.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmClientCollateralInstructionIdentification
	 * Transaction54.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmClientCollateralInstructionIdentification
	 * Transaction52.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails69#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails69.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#mmClientCollateralInstructionIdentification
	 * Transaction57.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails70#mmCollateralTransactionIdentification
	 * SecuritiesTradeDetails70.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#mmClientCollateralInstructionIdentification
	 * Transaction56.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmClientCollateralInstructionIdentification
	 * TransactionDetails100.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#mmClientCollateralInstructionIdentification
	 * Transaction55.mmClientCollateralInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unambiguous identification of a collateral transaction."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCollateralTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails25.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails26.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails27.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails28.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails2.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails16.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails1.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails15.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails53.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails58.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction28.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction27.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction30.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction31.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction29.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction32.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.choice.IdentificationReference8Choice.mmCollateralTransactionIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails8.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails18.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails4.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails17.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails9.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails21.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails10.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails22.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails23.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails29.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails61.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction34.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction35.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction36.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails31.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails33.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails35.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails36.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails34.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails32.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails44.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails43.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails41.mmCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction38.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails66.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails42.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction39.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails46.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails47.mmCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction37.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction41.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails70.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction40.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction43.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails71.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction42.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails49.mmCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction47.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails79.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction45.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction46.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails51.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails53.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails54.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails52.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails50.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction49.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails61.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails63.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails62.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails87.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails60.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction50.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction48.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails65.mmCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails66.mmCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails67.mmCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction53.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails68.mmCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails97.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction54.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction52.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails69.mmCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction57.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesTradeDetails70.mmCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction56.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails100.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction55.mmClientCollateralInstructionIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CollateralTransactionIdentification";
			definition = "Unambiguous identification of a collateral transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientTripartyCollateralTransactionIdentification;
	/**
	 * Unique reference identifying the triparty collateral management
	 * transaction from the client's point of view.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters3#mmMarketInfrastructureTransactionIdentification
	 * AdditionalParameters3.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters7#mmMarketInfrastructureTransactionIdentification
	 * AdditionalParameters7.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters8#mmMarketInfrastructureTransactionIdentification
	 * AdditionalParameters8.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters9#mmMarketInfrastructureTransactionIdentification
	 * AdditionalParameters9.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters10#mmMarketInfrastructureTransactionIdentification
	 * AdditionalParameters10.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters11#mmMarketInfrastructureTransactionIdentification
	 * AdditionalParameters11.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters2#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters2.mmClientTripartyCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters6#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters6.mmClientTripartyCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters12#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters12.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters13#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters13.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters17.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17#mmClientCollateralInstructionIdentification
	 * AdditionalParameters17.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters20.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20#mmClientCollateralInstructionIdentification
	 * AdditionalParameters20.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails5.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails9.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails22.mmClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails23.mmClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails36.mmClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails47.mmClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails53.mmClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails58.mmClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#mmClientTripartyCollateralTransactionIdentification
	 * Transaction7.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#mmClientTripartyCollateralTransactionIdentification
	 * Transaction8.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#mmClientTripartyCollateralTransactionIdentification
	 * Transaction9.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#mmClientTripartyCollateralTransactionIdentification
	 * Transaction10.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#mmClientTripartyCollateralTransactionIdentification
	 * Transaction14.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#mmClientTripartyCollateralTransactionIdentification
	 * Transaction12.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#mmClientTripartyCollateralTransactionIdentification
	 * Transaction15.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#mmClientTripartyCollateralTransactionIdentification
	 * Transaction16.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#mmClientTripartyCollateralTransactionIdentification
	 * Transaction20.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#mmClientTripartyCollateralTransactionIdentification
	 * Transaction19.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#mmClientTripartyCollateralTransactionIdentification
	 * Transaction23.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#mmClientTripartyCollateralTransactionIdentification
	 * Transaction22.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#mmClientTripartyCollateralTransactionIdentification
	 * Transaction28.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#mmClientTripartyCollateralTransactionIdentification
	 * Transaction27.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#mmClientTripartyCollateralTransactionIdentification
	 * Transaction30.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#mmClientTripartyCollateralTransactionIdentification
	 * Transaction31.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#mmClientTripartyCollateralTransactionIdentification
	 * Transaction6.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#mmClientTripartyCollateralTransactionIdentification
	 * Transaction11.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#mmClientTripartyCollateralTransactionIdentification
	 * Transaction13.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#mmClientTripartyCollateralTransactionIdentification
	 * Transaction17.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#mmClientTripartyCollateralTransactionIdentification
	 * Transaction18.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#mmClientTripartyCollateralTransactionIdentification
	 * Transaction21.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#mmClientTripartyCollateralTransactionIdentification
	 * Transaction29.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#mmClientTripartyCollateralTransactionIdentification
	 * Transaction32.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails2.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails8.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters4#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters4.mmClientTripartyCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails6.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails10.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails17.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails18.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters5#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters5.mmClientTripartyCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters14#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters14.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters15#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters15.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#mmClientTripartyCollateralTransactionIdentification
	 * Transaction25.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters16#mmMarketInfrastructureTransactionIdentification
	 * AdditionalParameters16.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails61.mmClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#mmClientTripartyCollateralTransactionIdentification
	 * Transaction34.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails21.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#mmClientTripartyCollateralTransactionIdentification
	 * Transaction35.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#mmClientTripartyCollateralTransactionIdentification
	 * Transaction36.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails22.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#mmClientTripartyCollateralTransactionIdentification
	 * Transaction38.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails66.mmClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#mmClientTripartyCollateralTransactionIdentification
	 * Transaction39.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#mmClientTripartyCollateralTransactionIdentification
	 * Transaction37.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails24.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#mmClientTripartyCollateralTransactionIdentification
	 * Transaction41.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails70.mmClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#mmClientTripartyCollateralTransactionIdentification
	 * Transaction40.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#mmClientTripartyCollateralTransactionIdentification
	 * Transaction43.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails71.mmClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails25.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#mmClientTripartyCollateralTransactionIdentification
	 * Transaction42.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#mmClientTripartyCollateralTransactionIdentification
	 * Transaction47.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails26.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails79.mmClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#mmClientTripartyCollateralTransactionIdentification
	 * Transaction45.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#mmClientTripartyCollateralTransactionIdentification
	 * Transaction46.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters23#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters23.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters22.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22#mmClientCollateralInstructionIdentification
	 * AdditionalParameters22.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters21#mmMarketInfrastructureTransactionIdentification
	 * AdditionalParameters21.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails33.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#mmClientTripartyCollateralTransactionIdentification
	 * Transaction49.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters25#mmMarketInfrastructureTransactionIdentification
	 * AdditionalParameters25.mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters28#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters28.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters27.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27#mmClientCollateralInstructionIdentification
	 * AdditionalParameters27.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails87.mmClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#mmClientTripartyCollateralTransactionIdentification
	 * Transaction50.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#mmClientTripartyCollateralTransactionIdentification
	 * Transaction48.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters29.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmClientCollateralInstructionIdentification
	 * AdditionalParameters29.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters30#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters30.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmClientTripartyCollateralTransactionIdentification
	 * Transaction53.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails97.mmClientTripartyCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails35.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmClientTripartyCollateralTransactionIdentification
	 * Transaction54.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmClientTripartyCollateralTransactionIdentification
	 * Transaction52.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters31.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31#mmClientCollateralInstructionIdentification
	 * AdditionalParameters31.mmClientCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#mmClientTripartyCollateralTransactionIdentification
	 * Transaction57.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails36.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters32#mmClientTripartyCollateralTransactionIdentification
	 * AdditionalParameters32.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#mmClientTripartyCollateralTransactionIdentification
	 * Transaction56.mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmClientTripartyCollateralTransactionIdentification
	 * TransactionDetails100.mmClientTripartyCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#mmClientTripartyCollateralTransactionIdentification
	 * Transaction55.mmClientTripartyCollateralTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientTripartyCollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identifying the triparty collateral management transaction from the client's point of view."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmClientTripartyCollateralTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalParameters3.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters7.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters8.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters9.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters10.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters11.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters2.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters6.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters12.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters13.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters17.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters17.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.AdditionalParameters20.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters20.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails5.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails9.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails22.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails23.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails36.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails47.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails53.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails58.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction7.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction8.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction9.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction10.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction14.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction12.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction15.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction16.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction20.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction19.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction23.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction22.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction28.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction27.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction30.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction31.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction6.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction11.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction13.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction17.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction18.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction21.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction29.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction32.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters4.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters5.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters14.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters15.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction25.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters16.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.TransactionDetails61.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction34.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction35.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction36.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction38.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails66.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction39.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction37.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction41.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails70.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction40.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction43.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails71.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction42.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction47.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails79.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction45.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction46.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters23.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters22.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters22.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.AdditionalParameters21.mmMarketInfrastructureTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction49.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters25.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters28.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters27.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters27.mmClientCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails87.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction50.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction48.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters29.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters29.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.AdditionalParameters30.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction53.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails97.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction54.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction52.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters31.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters31.mmClientCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction57.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters32.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction56.mmClientTripartyCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails100.mmClientTripartyCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction55.mmClientTripartyCollateralTransactionIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ClientTripartyCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the client's point of view.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text tripartyAgentCollateralTransactionIdentification;
	/**
	 * Unique reference identifying the triparty collateral management
	 * transaction from the triparty agent's point of view.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters2#mmTripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters2.mmTripartyAgentCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters6#mmTripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters6.mmTripartyAgentCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters12#mmTripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters12.mmTripartyAgentCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters13#mmTripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters13.mmTripartyAgentCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17#mmTripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters17.mmTripartyAgentCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters17#mmTripartyCollateralInstructionIdentification
	 * AdditionalParameters17.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20#mmTripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters20.mmTripartyAgentCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters20#mmTripartyCollateralInstructionIdentification
	 * AdditionalParameters20.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails5#mmTripartyAgentCollateralTransactionIdentification
	 * TransactionDetails5.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails9#mmTripartyAgentCollateralTransactionIdentification
	 * TransactionDetails9.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails22#mmTripartyAgentCollateralTransactionIdentification
	 * TransactionDetails22.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails23#mmTripartyAgentCollateralTransactionIdentification
	 * TransactionDetails23.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails36#mmTripartyAgentCollateralTransactionIdentification
	 * TransactionDetails36.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails47#mmTripartyAgentCollateralTransactionIdentification
	 * TransactionDetails47.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmTripartyAgentCollateralTransactionIdentification
	 * TransactionDetails53.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails53#mmTripartyCollateralInstructionIdentification
	 * TransactionDetails53.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmTripartyAgentCollateralTransactionIdentification
	 * TransactionDetails58.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails58#mmTripartyCollateralInstructionIdentification
	 * TransactionDetails58.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction7#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction7.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction8#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction8.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction9#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction9.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction10#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction10.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction14#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction14.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction12#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction12.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction15#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction15.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction16#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction16.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction20#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction20.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction19#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction19.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction23#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction23.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction22#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction22.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction28.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction28#mmTripartyCollateralInstructionIdentification
	 * Transaction28.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction27.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction27#mmTripartyCollateralInstructionIdentification
	 * Transaction27.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction30.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction30#mmTripartyCollateralInstructionIdentification
	 * Transaction30.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction31.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction31#mmTripartyCollateralInstructionIdentification
	 * Transaction31.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction6#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction6.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction11#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction11.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction13#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction13.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction17#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction17.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction18#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction18.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction21#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction21.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction29.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction29#mmTripartyCollateralInstructionIdentification
	 * Transaction29.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction32.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction32#mmTripartyCollateralInstructionIdentification
	 * Transaction32.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails2.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails8.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters4#mmTripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters4.mmTripartyAgentCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails6.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails10.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails17.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails18.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters5#mmTripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters5.mmTripartyAgentCollateralTransactionIdentification}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters14#mmTripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters14.mmTripartyAgentCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters15#mmTripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters15.mmTripartyAgentCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction25#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction25.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmTripartyAgentCollateralTransactionIdentification
	 * TransactionDetails61.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails61#mmTripartyCollateralInstructionIdentification
	 * TransactionDetails61.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction34.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction34#mmTripartyCollateralInstructionIdentification
	 * Transaction34.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails21.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction35.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction35#mmTripartyCollateralInstructionIdentification
	 * Transaction35.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction36.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction36#mmTripartyCollateralInstructionIdentification
	 * Transaction36.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails22.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction38.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction38#mmTripartyCollateralInstructionIdentification
	 * Transaction38.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmTripartyAgentCollateralTransactionIdentification
	 * TransactionDetails66.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails66#mmTripartyCollateralInstructionIdentification
	 * TransactionDetails66.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction39.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction39#mmTripartyCollateralInstructionIdentification
	 * Transaction39.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction37.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction37#mmTripartyCollateralInstructionIdentification
	 * Transaction37.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails24.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction41.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction41#mmTripartyCollateralInstructionIdentification
	 * Transaction41.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmTripartyAgentCollateralTransactionIdentification
	 * TransactionDetails70.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails70#mmTripartyCollateralInstructionIdentification
	 * TransactionDetails70.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction40.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction40#mmTripartyCollateralInstructionIdentification
	 * Transaction40.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction43.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction43#mmTripartyCollateralInstructionIdentification
	 * Transaction43.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmTripartyAgentCollateralTransactionIdentification
	 * TransactionDetails71.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails71#mmTripartyCollateralInstructionIdentification
	 * TransactionDetails71.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails25.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction42.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction42#mmTripartyCollateralInstructionIdentification
	 * Transaction42.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction47.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction47#mmTripartyCollateralInstructionIdentification
	 * Transaction47.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails26.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmTripartyAgentCollateralTransactionIdentification
	 * TransactionDetails79.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails79#mmTripartyCollateralInstructionIdentification
	 * TransactionDetails79.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction45.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction45#mmTripartyCollateralInstructionIdentification
	 * Transaction45.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction46.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction46#mmTripartyCollateralInstructionIdentification
	 * Transaction46.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters23#mmTripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters23.mmTripartyAgentCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22#mmTripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters22.mmTripartyAgentCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters22#mmTripartyCollateralInstructionIdentification
	 * AdditionalParameters22.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails33.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction49.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction49#mmTripartyCollateralInstructionIdentification
	 * Transaction49.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters28#mmTripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters28.mmTripartyAgentCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27#mmTripartyAgentCollateralTransactionIdentification
	 * AdditionalParameters27.mmTripartyAgentCollateralTransactionIdentification
	 * }</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters27#mmTripartyCollateralInstructionIdentification
	 * AdditionalParameters27.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmTripartyAgentCollateralTransactionIdentification
	 * TransactionDetails87.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87#mmTripartyCollateralInstructionIdentification
	 * TransactionDetails87.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction50.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction50#mmTripartyCollateralInstructionIdentification
	 * Transaction50.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#mmTripartyAgentCollateralTransactionIdentification
	 * Transaction48.mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction48#mmTripartyCollateralInstructionIdentification
	 * Transaction48.mmTripartyCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * AdditionalParameters29.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters29#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * AdditionalParameters29.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters30#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * AdditionalParameters30.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction53.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction53#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction53.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * TransactionDetails97.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * TransactionDetails97.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails35.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction54.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction54#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction54.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction52.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction52#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction52.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * AdditionalParameters31.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters31#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * AdditionalParameters31.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction57.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction57#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction57.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * SecuritiesFinancingTransactionDetails36.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalParameters32#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * AdditionalParameters32.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction56.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction56#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction56.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * TransactionDetails100.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails100#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * TransactionDetails100.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#mmTripartyAgentServiceProviderCollateralTransactionIdentification
	 * Transaction55.
	 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transaction55#mmTripartyAgentServiceProviderCollateralInstructionIdentification
	 * Transaction55.
	 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentCollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identifying the triparty collateral management transaction from the triparty agent's point of view."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTripartyAgentCollateralTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalParameters2.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters6.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters12.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters13.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters17.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters17.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.AdditionalParameters20.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters20.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails5.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails9.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails22.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails23.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails36.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails47.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails53.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails53.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails58.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails58.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction7.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction8.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction9.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction10.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction14.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction12.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction15.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction16.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction20.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction19.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction23.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction22.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction28.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction28.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction27.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction27.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction30.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction30.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction31.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction31.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction6.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction11.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction13.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction17.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction18.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction21.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction29.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction29.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction32.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction32.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters4.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters5.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters14.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters15.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction25.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails61.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails61.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction34.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction34.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction35.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction35.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction36.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction36.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction38.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction38.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails66.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails66.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction39.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction39.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction37.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction37.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction41.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction41.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails70.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails70.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction40.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction40.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.Transaction43.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction43.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.TransactionDetails71.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails71.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction42.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction42.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction47.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction47.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails79.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails79.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction45.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction45.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction46.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction46.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.AdditionalParameters23.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters22.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters22.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction49.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction49.mmTripartyCollateralInstructionIdentification, com.tools20022.repository.msg.AdditionalParameters28.mmTripartyAgentCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters27.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.AdditionalParameters27.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails87.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.TransactionDetails87.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction50.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction50.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction48.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.msg.Transaction48.mmTripartyCollateralInstructionIdentification,
					com.tools20022.repository.msg.AdditionalParameters29.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters29.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.AdditionalParameters30.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction53.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction53.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails97.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails97.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction54.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction54.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction52.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction52.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.AdditionalParameters31.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters31.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction57.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction57.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.AdditionalParameters32.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction56.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction56.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.TransactionDetails100.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.TransactionDetails100.mmTripartyAgentServiceProviderCollateralInstructionIdentification,
					com.tools20022.repository.msg.Transaction55.mmTripartyAgentServiceProviderCollateralTransactionIdentification,
					com.tools20022.repository.msg.Transaction55.mmTripartyAgentServiceProviderCollateralInstructionIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "TripartyAgentCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the triparty agent's point of view.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text basketIdentification;
	/**
	 * Identification of a basket trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#mmBasketIdentification
	 * Identification2.mmBasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#mmBasketIdentification
	 * Identification7.mmBasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#mmBasketIdentification
	 * Identification6.mmBasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#mmBasketIdentification
	 * Identification5.mmBasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#mmBasketIdentification
	 * Identification8.mmBasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#mmBasketIdentification
	 * Identification11.mmBasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#mmBasketIdentification
	 * Identification13.mmBasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#mmBasketIdentification
	 * Identification9.mmBasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#mmBasketIdentification
	 * Identification3.mmBasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmBasketIdentification
	 * Identification15.mmBasketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#mmBasketIdentification
	 * Identification24.mmBasketIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a basket trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBasketIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Identification2.mmBasketIdentification, com.tools20022.repository.msg.Identification7.mmBasketIdentification,
					com.tools20022.repository.msg.Identification6.mmBasketIdentification, com.tools20022.repository.msg.Identification5.mmBasketIdentification, com.tools20022.repository.msg.Identification8.mmBasketIdentification,
					com.tools20022.repository.msg.Identification11.mmBasketIdentification, com.tools20022.repository.msg.Identification13.mmBasketIdentification, com.tools20022.repository.msg.Identification9.mmBasketIdentification,
					com.tools20022.repository.msg.Identification3.mmBasketIdentification, com.tools20022.repository.msg.Identification15.mmBasketIdentification, com.tools20022.repository.msg.Identification24.mmBasketIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BasketIdentification";
			definition = "Identification of a basket trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text programIdentification;
	/**
	 * Program reference which identifies a program trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification2#mmProgramIdentification
	 * Identification2.mmProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification7#mmProgramIdentification
	 * Identification7.mmProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification6#mmProgramIdentification
	 * Identification6.mmProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification5#mmProgramIdentification
	 * Identification5.mmProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification8#mmProgramIdentification
	 * Identification8.mmProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification11#mmProgramIdentification
	 * Identification11.mmProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification13#mmProgramIdentification
	 * Identification13.mmProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification9#mmProgramIdentification
	 * Identification9.mmProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification3#mmProgramIdentification
	 * Identification3.mmProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification15#mmProgramIdentification
	 * Identification15.mmProgramIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Identification24#mmProgramIdentification
	 * Identification24.mmProgramIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgramIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Program reference which identifies a program trade."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmProgramIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Identification2.mmProgramIdentification, com.tools20022.repository.msg.Identification7.mmProgramIdentification,
					com.tools20022.repository.msg.Identification6.mmProgramIdentification, com.tools20022.repository.msg.Identification5.mmProgramIdentification, com.tools20022.repository.msg.Identification8.mmProgramIdentification,
					com.tools20022.repository.msg.Identification11.mmProgramIdentification, com.tools20022.repository.msg.Identification13.mmProgramIdentification, com.tools20022.repository.msg.Identification9.mmProgramIdentification,
					com.tools20022.repository.msg.Identification3.mmProgramIdentification, com.tools20022.repository.msg.Identification15.mmProgramIdentification, com.tools20022.repository.msg.Identification24.mmProgramIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ProgramIdentification";
			definition = "Program reference which identifies a program trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text blockIdentification;
	/**
	 * Reference of the linked message at the trade/block level which identifies
	 * a centrally matched transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmBlockIdentification
	 * IdentificationReference8Choice.mmBlockIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmBlockIdentification
	 * IdentificationReference11Choice.mmBlockIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the linked message at the trade/block level which identifies a centrally matched transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmBlockIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IdentificationReference8Choice.mmBlockIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.mmBlockIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockIdentification";
			definition = "Reference of the linked message at the trade/block level which identifies a centrally matched transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text allocationIdentification;
	/**
	 * Identification at the allocation level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmAllocationIdentification
	 * IdentificationReference8Choice.mmAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmIndividualAllocationIdentification
	 * IdentificationReference8Choice.mmIndividualAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmSecondaryAllocationIdentification
	 * IdentificationReference8Choice.mmSecondaryAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmAllocationIdentification
	 * IdentificationReference11Choice.mmAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmIndividualAllocationIdentification
	 * IdentificationReference11Choice.mmIndividualAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmSecondaryAllocationIdentification
	 * IdentificationReference11Choice.mmSecondaryAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg8#mmAllocationIdentification
	 * TradeLeg8.mmAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg10#mmAllocationIdentification
	 * TradeLeg10.mmAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TradeLeg9#mmAllocationIdentification
	 * TradeLeg9.mmAllocationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification at the allocation level."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmAllocationIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IdentificationReference8Choice.mmAllocationIdentification,
					com.tools20022.repository.choice.IdentificationReference8Choice.mmIndividualAllocationIdentification, com.tools20022.repository.choice.IdentificationReference8Choice.mmSecondaryAllocationIdentification,
					com.tools20022.repository.choice.IdentificationReference11Choice.mmAllocationIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.mmIndividualAllocationIdentification,
					com.tools20022.repository.choice.IdentificationReference11Choice.mmSecondaryAllocationIdentification, com.tools20022.repository.msg.TradeLeg8.mmAllocationIdentification,
					com.tools20022.repository.msg.TradeLeg10.mmAllocationIdentification, com.tools20022.repository.msg.TradeLeg9.mmAllocationIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "AllocationIdentification";
			definition = "Identification at the allocation level.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text complianceIdentification;
	/**
	 * Identification which represents this transaction for compliance purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference8Choice#mmComplianceIdentification
	 * IdentificationReference8Choice.mmComplianceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmComplianceIdentification
	 * IdentificationReference11Choice.mmComplianceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OrderParameters1#mmComplianceIdentification
	 * OrderParameters1.mmComplianceIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComplianceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification which represents this transaction for compliance purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmComplianceIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IdentificationReference8Choice.mmComplianceIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.mmComplianceIdentification,
					com.tools20022.repository.msg.OrderParameters1.mmComplianceIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ComplianceIdentification";
			definition = "Identification which represents this transaction for compliance purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text cSDTransactionIdentification;
	/**
	 * Identification given by the central securities depository to the
	 * transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification given by the central securities depository  to the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCSDTransactionIdentification = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CSDTransactionIdentification";
			definition = "Identification given by the central securities depository  to the transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text centralCounterpartyTransactionIdentification;
	/**
	 * Identification of the transaction assigned by the central counterparty.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation1#mmCentralCounterpartyTransactionIdentification
	 * SettlementObligation1.mmCentralCounterpartyTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation6#mmCentralCounterpartyTransactionIdentification
	 * SettlementObligation6.mmCentralCounterpartyTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7#mmCentralCounterpartyTransactionIdentification
	 * SettlementObligation7.mmCentralCounterpartyTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralCounterpartyTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the central counterparty."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCentralCounterpartyTransactionIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementObligation1.mmCentralCounterpartyTransactionIdentification,
					com.tools20022.repository.msg.SettlementObligation6.mmCentralCounterpartyTransactionIdentification, com.tools20022.repository.msg.SettlementObligation7.mmCentralCounterpartyTransactionIdentification);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CentralCounterpartyTransactionIdentification";
			definition = "Identification of the transaction assigned by the central counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text cancellationRequestIdentification;
	/**
	 * Unambiguous identification of the cancellation request as known by the
	 * instructing party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
	 * SecuritiesTradeIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmCancellationRequestIdentification
	 * IdentificationReference11Choice.mmCancellationRequestIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder5#mmCancellationReference
	 * InvestmentFundOrder5.mmCancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder2#mmCancellationReference
	 * InvestmentFundOrder2.mmCancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder6#mmCancellationReference
	 * InvestmentFundOrder6.mmCancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder11#mmCancellationReference
	 * InvestmentFundOrder11.mmCancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder9#mmCancellationReference
	 * InvestmentFundOrder9.mmCancellationReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrder8#mmCancellationReference
	 * InvestmentFundOrder8.mmCancellationReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the cancellation request as known by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCancellationRequestIdentification = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IdentificationReference11Choice.mmCancellationRequestIdentification, com.tools20022.repository.msg.InvestmentFundOrder5.mmCancellationReference,
					com.tools20022.repository.msg.InvestmentFundOrder2.mmCancellationReference, com.tools20022.repository.msg.InvestmentFundOrder6.mmCancellationReference,
					com.tools20022.repository.msg.InvestmentFundOrder11.mmCancellationReference, com.tools20022.repository.msg.InvestmentFundOrder9.mmCancellationReference,
					com.tools20022.repository.msg.InvestmentFundOrder8.mmCancellationReference);
			elementContext_lazy = () -> SecuritiesTradeIdentification.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CancellationRequestIdentification";
			definition = "Unambiguous identification of the cancellation request as known by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeIdentification";
				definition = "Specifies the different identifications associated with a securities transaction.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTrade.mmSecuritiesTradeRelatedIdentifications);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Identification1.mmIdentification, com.tools20022.repository.msg.Identification4.mmIdentification,
						com.tools20022.repository.msg.Linkages1.mmReference, com.tools20022.repository.msg.Linkages21.mmReference, com.tools20022.repository.msg.Linkages4.mmReference, com.tools20022.repository.msg.Linkages22.mmReference,
						com.tools20022.repository.msg.Linkages9.mmReference, com.tools20022.repository.msg.Linkages14.mmReference, com.tools20022.repository.msg.Linkages17.mmReference, com.tools20022.repository.msg.Linkages24.mmReference,
						com.tools20022.repository.msg.Linkages3.mmReference, com.tools20022.repository.msg.Linkages6.mmReference, com.tools20022.repository.msg.Linkages10.mmReference, com.tools20022.repository.msg.Linkages11.mmReference,
						com.tools20022.repository.msg.Linkages16.mmReference, com.tools20022.repository.msg.Linkages23.mmReference, com.tools20022.repository.msg.Linkages7.mmReference, com.tools20022.repository.msg.Linkages12.mmReference,
						com.tools20022.repository.msg.Linkages15.mmReference, com.tools20022.repository.msg.Linkages18.mmReference, com.tools20022.repository.msg.Linkages2.mmReference, com.tools20022.repository.msg.Linkages8.mmReference,
						com.tools20022.repository.msg.Linkages5.mmReference, com.tools20022.repository.msg.Linkages13.mmReference, com.tools20022.repository.msg.Linkages19.mmReference, com.tools20022.repository.msg.Linkages25.mmReference,
						com.tools20022.repository.msg.Linkages26.mmReference, com.tools20022.repository.msg.Identification14.mmIdentification, com.tools20022.repository.msg.MessageAndBusinessReference7.mmReference,
						com.tools20022.repository.msg.Linkages36.mmReference, com.tools20022.repository.msg.Linkages37.mmReference, com.tools20022.repository.msg.Linkages38.mmReference, com.tools20022.repository.msg.Linkages40.mmReference,
						com.tools20022.repository.msg.MessageAndBusinessReference8.mmReference, com.tools20022.repository.msg.Linkages43.mmReference, com.tools20022.repository.msg.Linkages42.mmReference,
						com.tools20022.repository.msg.Identification16.mmIdentification, com.tools20022.repository.msg.Linkages49.mmReference, com.tools20022.repository.msg.Linkages48.mmReference);
				superType_lazy = () -> TradeIdentification.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesTradeIdentification.mmIdentifiedTrade,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmProcessorTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmPoolIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmCollateralTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmClientTripartyCollateralTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmTripartyAgentCollateralTransactionIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmBasketIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmProgramIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmBlockIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmAllocationIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmComplianceIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmCSDTransactionIdentification, com.tools20022.repository.entity.SecuritiesTradeIdentification.mmCentralCounterpartyTransactionIdentification,
						com.tools20022.repository.entity.SecuritiesTradeIdentification.mmCancellationRequestIdentification);
				derivationComponent_lazy = () -> Arrays.asList(References11.mmObject(), Identification1.mmObject(), TransactionIdentifications3.mmObject(), TransactionIdentifications10.mmObject(), TransactionIdentifications15.mmObject(),
						Identification4.mmObject(), TransactionIdentifications19.mmObject(), References1Choice.mmObject(), Linkages1.mmObject(), Linkages21.mmObject(), References12Choice.mmObject(), Linkages4.mmObject(),
						References28Choice.mmObject(), Linkages22.mmObject(), References5Choice.mmObject(), References11Choice.mmObject(), References19Choice.mmObject(), References21Choice.mmObject(), References27Choice.mmObject(),
						References33Choice.mmObject(), References14Choice.mmObject(), Linkages9.mmObject(), References16Choice.mmObject(), Linkages14.mmObject(), References25Choice.mmObject(), Linkages17.mmObject(),
						References32Choice.mmObject(), Linkages24.mmObject(), References3Choice.mmObject(), References9Choice.mmObject(), References18Choice.mmObject(), References20Choice.mmObject(), References29Choice.mmObject(),
						References37Choice.mmObject(), References38Choice.mmObject(), References1.mmObject(), References6Choice.mmObject(), Linkages3.mmObject(), References2.mmObject(), References10Choice.mmObject(), Linkages6.mmObject(),
						References7.mmObject(), References13Choice.mmObject(), Linkages10.mmObject(), References8.mmObject(), References15Choice.mmObject(), Linkages11.mmObject(), References9.mmObject(), References24Choice.mmObject(),
						Linkages16.mmObject(), References13.mmObject(), References31Choice.mmObject(), Linkages23.mmObject(), Linkages7.mmObject(), Linkages12.mmObject(), TransactionIdentifications2.mmObject(),
						TransactionIdentifications7.mmObject(), TransactionIdentifications9.mmObject(), TransactionIdentifications13.mmObject(), TransactionIdentifications16.mmObject(), TransactionIdentifications22.mmObject(),
						Identification2.mmObject(), IdentificationReference8Choice.mmObject(), Linkages15.mmObject(), IdentificationReference11Choice.mmObject(), Linkages18.mmObject(), References3.mmObject(),
						MessageAndBusinessReference5.mmObject(), MessageAndBusinessReference2.mmObject(), MessageAndBusinessReference4.mmObject(), MessageAndBusinessReference1.mmObject(), MessageAndBusinessReference6.mmObject(),
						Linkages2.mmObject(), Linkages8.mmObject(), TransactionIdentifications1.mmObject(), Identification7.mmObject(), References4Choice.mmObject(), TransactionIdentifications4.mmObject(), References22Choice.mmObject(),
						TransactionIdentifications11.mmObject(), References2Choice.mmObject(), Identification6.mmObject(), TransactionIdentifications6.mmObject(), TransactionIdentification2.mmObject(),
						TransactionIdentification3.mmObject(), TransactionIdentifications18.mmObject(), TransactionIdentifications20.mmObject(), Identification5.mmObject(), Identification8.mmObject(), Identification11.mmObject(),
						Identification13.mmObject(), References8Choice.mmObject(), References17Choice.mmObject(), References7Choice.mmObject(), TransactionIdentifications8.mmObject(), References23Choice.mmObject(),
						TransactionIdentifications14.mmObject(), TransactionIdentifications17.mmObject(), References30Choice.mmObject(), TransactionIdentifications23.mmObject(), Identification9.mmObject(), Linkages5.mmObject(),
						Linkages13.mmObject(), Linkages19.mmObject(), Linkages25.mmObject(), TransactionIdentifications5.mmObject(), TransactionIdentifications12.mmObject(), References34Choice.mmObject(), Linkages26.mmObject(),
						References14.mmObject(), References36Choice.mmObject(), References35Choice.mmObject(), TransactionIdentifications24.mmObject(), Identification14.mmObject(), Identification3.mmObject(), References15.mmObject(),
						MessageAndBusinessReference7.mmObject(), References39Choice.mmObject(), TransactionIdentifications25.mmObject(), References16.mmObject(), TransactionIdentifications26.mmObject(), References17.mmObject(),
						Linkages36.mmObject(), References45Choice.mmObject(), TransactionIdentification6.mmObject(), TransactionIdentifications29.mmObject(), Linkages37.mmObject(), TransactionIdentifications31.mmObject(),
						TransactionIdentifications33.mmObject(), References43Choice.mmObject(), TransactionIdentifications30.mmObject(), TransactionIdentifications32.mmObject(), Linkages38.mmObject(), References46Choice.mmObject(),
						Identification15.mmObject(), References41Choice.mmObject(), References44Choice.mmObject(), Linkages40.mmObject(), References47Choice.mmObject(), References42Choice.mmObject(), References18.mmObject(),
						References20.mmObject(), MessageAndBusinessReference8.mmObject(), References48Choice.mmObject(), Linkages43.mmObject(), TransactionIdentifications35.mmObject(), References60Choice.mmObject(),
						TransactionIdentifications39.mmObject(), TransactionIdentification7.mmObject(), TransactionIdentifications37.mmObject(), References53Choice.mmObject(), Linkages42.mmObject(), Identification16.mmObject(),
						TransactionIdentifications34.mmObject(), TransactionIdentifications38.mmObject(), References58Choice.mmObject(), Identification24.mmObject(), References50Choice.mmObject(), References51Choice.mmObject(),
						References21.mmObject(), Linkages49.mmObject(), Linkages48.mmObject(), References59Choice.mmObject(), References54Choice.mmObject(), MessageAndBusinessReference10.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesTrade getIdentifiedTrade() {
		return identifiedTrade;
	}

	public void setIdentifiedTrade(com.tools20022.repository.entity.SecuritiesTrade identifiedTrade) {
		this.identifiedTrade = identifiedTrade;
	}

	public Max35Text getMarketInfrastructureTransactionIdentification() {
		return marketInfrastructureTransactionIdentification;
	}

	public void setMarketInfrastructureTransactionIdentification(Max35Text marketInfrastructureTransactionIdentification) {
		this.marketInfrastructureTransactionIdentification = marketInfrastructureTransactionIdentification;
	}

	public Max35Text getProcessorTransactionIdentification() {
		return processorTransactionIdentification;
	}

	public void setProcessorTransactionIdentification(Max35Text processorTransactionIdentification) {
		this.processorTransactionIdentification = processorTransactionIdentification;
	}

	public Max35Text getPoolIdentification() {
		return poolIdentification;
	}

	public void setPoolIdentification(Max35Text poolIdentification) {
		this.poolIdentification = poolIdentification;
	}

	public Max35Text getCollateralTransactionIdentification() {
		return collateralTransactionIdentification;
	}

	public void setCollateralTransactionIdentification(Max35Text collateralTransactionIdentification) {
		this.collateralTransactionIdentification = collateralTransactionIdentification;
	}

	public Max35Text getClientTripartyCollateralTransactionIdentification() {
		return clientTripartyCollateralTransactionIdentification;
	}

	public void setClientTripartyCollateralTransactionIdentification(Max35Text clientTripartyCollateralTransactionIdentification) {
		this.clientTripartyCollateralTransactionIdentification = clientTripartyCollateralTransactionIdentification;
	}

	public Max35Text getTripartyAgentCollateralTransactionIdentification() {
		return tripartyAgentCollateralTransactionIdentification;
	}

	public void setTripartyAgentCollateralTransactionIdentification(Max35Text tripartyAgentCollateralTransactionIdentification) {
		this.tripartyAgentCollateralTransactionIdentification = tripartyAgentCollateralTransactionIdentification;
	}

	public Max35Text getBasketIdentification() {
		return basketIdentification;
	}

	public void setBasketIdentification(Max35Text basketIdentification) {
		this.basketIdentification = basketIdentification;
	}

	public Max35Text getProgramIdentification() {
		return programIdentification;
	}

	public void setProgramIdentification(Max35Text programIdentification) {
		this.programIdentification = programIdentification;
	}

	public Max35Text getBlockIdentification() {
		return blockIdentification;
	}

	public void setBlockIdentification(Max35Text blockIdentification) {
		this.blockIdentification = blockIdentification;
	}

	public Max35Text getAllocationIdentification() {
		return allocationIdentification;
	}

	public void setAllocationIdentification(Max35Text allocationIdentification) {
		this.allocationIdentification = allocationIdentification;
	}

	public Max35Text getComplianceIdentification() {
		return complianceIdentification;
	}

	public void setComplianceIdentification(Max35Text complianceIdentification) {
		this.complianceIdentification = complianceIdentification;
	}

	public Max35Text getCSDTransactionIdentification() {
		return cSDTransactionIdentification;
	}

	public void setCSDTransactionIdentification(Max35Text cSDTransactionIdentification) {
		this.cSDTransactionIdentification = cSDTransactionIdentification;
	}

	public Max35Text getCentralCounterpartyTransactionIdentification() {
		return centralCounterpartyTransactionIdentification;
	}

	public void setCentralCounterpartyTransactionIdentification(Max35Text centralCounterpartyTransactionIdentification) {
		this.centralCounterpartyTransactionIdentification = centralCounterpartyTransactionIdentification;
	}

	public Max35Text getCancellationRequestIdentification() {
		return cancellationRequestIdentification;
	}

	public void setCancellationRequestIdentification(Max35Text cancellationRequestIdentification) {
		this.cancellationRequestIdentification = cancellationRequestIdentification;
	}
}