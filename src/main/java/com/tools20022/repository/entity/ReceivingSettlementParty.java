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
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Party that receives securities as part of a chain of settlement parties or as
 * ultimate party.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ReceivingSettlementParty"
 * src="doc-files/ReceivingSettlementParty.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#mmReceivingSettlementParty
 * ReceivingSettlementParty.mmReceivingSettlementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#mmNextParty
 * ReceivingSettlementParty.mmNextParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ReceivingDepositoryRole
 * ReceivingDepositoryRole}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#mmReceivingSettlementParty
 * ReceivingSettlementParty.mmReceivingSettlementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#mmNextParty
 * ReceivingSettlementParty.mmNextParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4#mmOtherReceivingSettlementParties
 * StandingSettlementInstruction4.mmOtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails3.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails4.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails2.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction7#mmOtherReceivingSettlementParties
 * StandingSettlementInstruction7.mmOtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails5.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails6.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails7.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#mmReceivingSettlementParties
 * SecuritiesOption3.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#mmReceivingSettlementParties
 * SecuritiesOption8.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#mmReceivingSettlementParties
 * SecuritiesOption18.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#mmReceivingSettlementParties
 * SecuritiesOption20.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#mmReceivingSettlementParties
 * SecuritiesOption26.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#mmReceivingSettlementParties
 * SecuritiesOption31.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#mmReceivingSettlementParties
 * SecuritiesOption35.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#mmReceivingSettlementParties
 * SecuritiesOption36.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction3#mmOtherReceivingSettlementParties
 * StandingSettlementInstruction3.mmOtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6#mmOtherReceivingSettlementParties
 * StandingSettlementInstruction6.mmOtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails8.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails9.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails10.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails11.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails12.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails13.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order3#mmReceivingSettlementParties
 * Order3.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction9#mmOtherReceivingSettlementParties
 * StandingSettlementInstruction9.mmOtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails2.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails8.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction5#mmOtherReceivingSettlementParties
 * StandingSettlementInstruction5.mmOtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails6.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails10.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails17.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails18.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction8#mmOtherReceivingSettlementParties
 * StandingSettlementInstruction8.mmOtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties2Choice#mmReceivingSettlementParties
 * SettlementParties2Choice.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade1#mmReceivingParties
 * NonGuaranteedTrade1.mmReceivingParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade2#mmReceivingParties
 * NonGuaranteedTrade2.mmReceivingParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order9#mmReceivingSettlementParties
 * Order9.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmReceivingSettlementParties
 * InstrumentLeg2.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#mmReceivingSettlementParties
 * SingleQuote1.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MassQuote1#mmReceivingSettlementParties
 * MassQuote1.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmReceivingSettlementParties
 * InstrumentLeg3.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmReceivingSettlementParties
 * IndicationOfInterest1.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmReceivingSettlementParties
 * Order6.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order11#mmReceivingSettlementParties
 * Order11.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmReceivingSettlementParties
 * QuoteRequest1.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#mmReceivingSettlementParties
 * RequestForQuote.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails16.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails14.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails15.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails21.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#mmReceivingSettlementParties
 * SecuritiesOption42.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#mmReceivingSettlementParties
 * SecuritiesOption48.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails22.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails17.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails18.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails19.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails24.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties3Choice#mmReceivingSettlementParties
 * SettlementParties3Choice.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3#mmReceivingParties
 * NonGuaranteedTrade3.mmReceivingParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties4Choice#mmReceivingSettlementParties
 * SettlementParties4Choice.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails25.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction11#mmOtherReceivingSettlementParties
 * StandingSettlementInstruction11.mmOtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails26.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails21.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails22.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails20.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#mmReceivingSettlementParties
 * SecuritiesOption50.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties5Choice#mmReceivingSettlementParties
 * SettlementParties5Choice.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#mmReceivingSettlementParties
 * SecuritiesOption55.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails33.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction12#mmOtherReceivingSettlementParties
 * StandingSettlementInstruction12.mmOtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails23.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails25.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails24.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmReceivingSettlementParties
 * SecuritiesOption60.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails35.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails27.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails28.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails26.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties7Choice#mmReceivingSettlementParties
 * SettlementParties7Choice.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails36.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails30.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#mmReceivingSettlementParties
 * SecuritiesOption63.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails29.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails31.mmReceivingSettlementParties}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
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
 * "ReceivingSettlementParty"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that receives securities as part of a chain of settlement parties or as ultimate party."
 * </li>
 * </ul>
 */
public class ReceivingSettlementParty extends SecuritiesSettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected ReceivingSettlementParty receivingSettlementParty;
	/**
	 * Specifies the settlement party which is followed by another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#mmNextParty
	 * ReceivingSettlementParty.mmNextParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement party which is followed by another party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReceivingSettlementParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReceivingSettlementParty";
			definition = "Specifies the settlement party which is followed by another party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmNextParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.ReceivingSettlementParty> nextParty;
	/**
	 * Next party in the receiving side of the settlement transaction chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#mmReceivingSettlementParty
	 * ReceivingSettlementParty.mmReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next party in the receiving side of the settlement transaction chain."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNextParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextParty";
			definition = "Next party in the receiving side of the settlement transaction chain.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmReceivingSettlementParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReceivingSettlementParty";
				definition = "Party that receives securities as part of a chain of settlement parties or as ultimate party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReceivingSettlementParty.mmReceivingSettlementParty, com.tools20022.repository.entity.ReceivingSettlementParty.mmNextParty);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingSettlementInstruction4.mmOtherReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.mmReceivingSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction7.mmOtherReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption3.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption8.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption18.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption20.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption26.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption31.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption35.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption36.mmReceivingSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction3.mmOtherReceivingSettlementParties,
						com.tools20022.repository.msg.StandingSettlementInstruction6.mmOtherReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.mmReceivingSettlementParties, com.tools20022.repository.msg.Order3.mmReceivingSettlementParties,
						com.tools20022.repository.msg.StandingSettlementInstruction9.mmOtherReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.mmReceivingSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction5.mmOtherReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.mmReceivingSettlementParties,
						com.tools20022.repository.msg.StandingSettlementInstruction8.mmOtherReceivingSettlementParties, com.tools20022.repository.choice.SettlementParties2Choice.mmReceivingSettlementParties,
						com.tools20022.repository.msg.NonGuaranteedTrade1.mmReceivingParties, com.tools20022.repository.msg.NonGuaranteedTrade2.mmReceivingParties, com.tools20022.repository.msg.Order9.mmReceivingSettlementParties,
						com.tools20022.repository.msg.InstrumentLeg2.mmReceivingSettlementParties, com.tools20022.repository.msg.SingleQuote1.mmReceivingSettlementParties,
						com.tools20022.repository.msg.MassQuote1.mmReceivingSettlementParties, com.tools20022.repository.msg.InstrumentLeg3.mmReceivingSettlementParties,
						com.tools20022.repository.msg.IndicationOfInterest1.mmReceivingSettlementParties, com.tools20022.repository.msg.Order6.mmReceivingSettlementParties,
						com.tools20022.repository.msg.Order11.mmReceivingSettlementParties, com.tools20022.repository.msg.QuoteRequest1.mmReceivingSettlementParties,
						com.tools20022.repository.msg.RequestForQuote.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption42.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption48.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.mmReceivingSettlementParties,
						com.tools20022.repository.choice.SettlementParties3Choice.mmReceivingSettlementParties, com.tools20022.repository.msg.NonGuaranteedTrade3.mmReceivingParties,
						com.tools20022.repository.choice.SettlementParties4Choice.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.mmReceivingSettlementParties,
						com.tools20022.repository.msg.StandingSettlementInstruction11.mmOtherReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption50.mmReceivingSettlementParties,
						com.tools20022.repository.choice.SettlementParties5Choice.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption55.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.mmReceivingSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction12.mmOtherReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption60.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.mmReceivingSettlementParties,
						com.tools20022.repository.choice.SettlementParties7Choice.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption63.mmReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.mmReceivingSettlementParties);
				subType_lazy = () -> Arrays.asList(ReceivingDepositoryRole.mmObject());
				superType_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReceivingSettlementParty.mmReceivingSettlementParty, com.tools20022.repository.entity.ReceivingSettlementParty.mmNextParty);
			}
		});
		return mmObject_lazy.get();
	}

	public ReceivingSettlementParty getReceivingSettlementParty() {
		return receivingSettlementParty;
	}

	public void setReceivingSettlementParty(com.tools20022.repository.entity.ReceivingSettlementParty receivingSettlementParty) {
		this.receivingSettlementParty = receivingSettlementParty;
	}

	public List<ReceivingSettlementParty> getNextParty() {
		return nextParty;
	}

	public void setNextParty(List<com.tools20022.repository.entity.ReceivingSettlementParty> nextParty) {
		this.nextParty = nextParty;
	}
}