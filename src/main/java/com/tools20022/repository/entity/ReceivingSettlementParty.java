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
 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#ReceivingSettlementParty
 * ReceivingSettlementParty.ReceivingSettlementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#NextParty
 * ReceivingSettlementParty.NextParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#ReceivingSettlementParty
 * ReceivingSettlementParty.ReceivingSettlementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#NextParty
 * ReceivingSettlementParty.NextParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4#OtherReceivingSettlementParties
 * StandingSettlementInstruction4.OtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails3.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails4.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails2.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction7#OtherReceivingSettlementParties
 * StandingSettlementInstruction7.OtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails5.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails6.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails7.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#ReceivingSettlementParties
 * SecuritiesOption3.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#ReceivingSettlementParties
 * SecuritiesOption8.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#ReceivingSettlementParties
 * SecuritiesOption18.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#ReceivingSettlementParties
 * SecuritiesOption20.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#ReceivingSettlementParties
 * SecuritiesOption26.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#ReceivingSettlementParties
 * SecuritiesOption31.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#ReceivingSettlementParties
 * SecuritiesOption35.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#ReceivingSettlementParties
 * SecuritiesOption36.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction3#OtherReceivingSettlementParties
 * StandingSettlementInstruction3.OtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6#OtherReceivingSettlementParties
 * StandingSettlementInstruction6.OtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails8.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails9.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails10.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails11.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails12.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails13.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order3#ReceivingSettlementParties
 * Order3.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction9#OtherReceivingSettlementParties
 * StandingSettlementInstruction9.OtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#ReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails2.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#ReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails8.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction5#OtherReceivingSettlementParties
 * StandingSettlementInstruction5.OtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#ReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails6.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#ReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails10.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#ReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails17.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#ReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails18.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction8#OtherReceivingSettlementParties
 * StandingSettlementInstruction8.OtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties2Choice#ReceivingSettlementParties
 * SettlementParties2Choice.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade1#ReceivingParties
 * NonGuaranteedTrade1.ReceivingParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade2#ReceivingParties
 * NonGuaranteedTrade2.ReceivingParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order9#ReceivingSettlementParties
 * Order9.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#ReceivingSettlementParties
 * InstrumentLeg2.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#ReceivingSettlementParties
 * SingleQuote1.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MassQuote1#ReceivingSettlementParties
 * MassQuote1.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#ReceivingSettlementParties
 * InstrumentLeg3.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#ReceivingSettlementParties
 * IndicationOfInterest1.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#ReceivingSettlementParties
 * Order6.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order11#ReceivingSettlementParties
 * Order11.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#ReceivingSettlementParties
 * QuoteRequest1.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#ReceivingSettlementParties
 * RequestForQuote.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails16.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails14.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails15.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#ReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails21.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#ReceivingSettlementParties
 * SecuritiesOption42.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#ReceivingSettlementParties
 * SecuritiesOption48.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#ReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails22.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails17.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails18.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails19.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#ReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails24.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties3Choice#ReceivingSettlementParties
 * SettlementParties3Choice.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3#ReceivingParties
 * NonGuaranteedTrade3.ReceivingParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties4Choice#ReceivingSettlementParties
 * SettlementParties4Choice.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#ReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails25.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction11#OtherReceivingSettlementParties
 * StandingSettlementInstruction11.OtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#ReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails26.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails21.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails22.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails20.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#ReceivingSettlementParties
 * SecuritiesOption50.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties5Choice#ReceivingSettlementParties
 * SettlementParties5Choice.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#ReceivingSettlementParties
 * SecuritiesOption55.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#ReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails33.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction12#OtherReceivingSettlementParties
 * StandingSettlementInstruction12.OtherReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails23.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails25.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails24.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#ReceivingSettlementParties
 * SecuritiesOption60.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#ReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails35.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails27.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails28.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails26.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties7Choice#ReceivingSettlementParties
 * SettlementParties7Choice.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#ReceivingSettlementParties
 * SecuritiesFinancingTransactionDetails36.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails30.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#ReceivingSettlementParties
 * SecuritiesOption63.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails29.ReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#ReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails31.ReceivingSettlementParties}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ReceivingDepositoryRole
 * ReceivingDepositoryRole}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
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
 * "ReceivingSettlementParty"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that receives securities as part of a chain of settlement parties or as ultimate party."
 * </li>
 * </ul>
 */
public class ReceivingSettlementParty extends SecuritiesSettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the settlement party which is followed by another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#NextParty
	 * ReceivingSettlementParty.NextParty}</li>
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
	public static final MMBusinessAssociationEnd ReceivingSettlementParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReceivingSettlementParty";
			definition = "Specifies the settlement party which is followed by another party.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.NextParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Next party in the receiving side of the settlement transaction chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty#ReceivingSettlementParty
	 * ReceivingSettlementParty.ReceivingSettlementParty}</li>
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
	public static final MMBusinessAssociationEnd NextParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextParty";
			definition = "Next party in the receiving side of the settlement transaction chain.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ReceivingSettlementParty.ReceivingSettlementParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReceivingSettlementParty";
				definition = "Party that receives securities as part of a chain of settlement parties or as ultimate party.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReceivingSettlementParty.ReceivingSettlementParty, com.tools20022.repository.entity.ReceivingSettlementParty.NextParty);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingSettlementInstruction4.OtherReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.ReceivingSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction7.OtherReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption3.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption8.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption18.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption20.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption26.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption31.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption35.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption36.ReceivingSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction3.OtherReceivingSettlementParties,
						com.tools20022.repository.msg.StandingSettlementInstruction6.OtherReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.ReceivingSettlementParties, com.tools20022.repository.msg.Order3.ReceivingSettlementParties,
						com.tools20022.repository.msg.StandingSettlementInstruction9.OtherReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.ReceivingSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction5.OtherReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.ReceivingSettlementParties,
						com.tools20022.repository.msg.StandingSettlementInstruction8.OtherReceivingSettlementParties, com.tools20022.repository.choice.SettlementParties2Choice.ReceivingSettlementParties,
						com.tools20022.repository.msg.NonGuaranteedTrade1.ReceivingParties, com.tools20022.repository.msg.NonGuaranteedTrade2.ReceivingParties, com.tools20022.repository.msg.Order9.ReceivingSettlementParties,
						com.tools20022.repository.msg.InstrumentLeg2.ReceivingSettlementParties, com.tools20022.repository.msg.SingleQuote1.ReceivingSettlementParties, com.tools20022.repository.msg.MassQuote1.ReceivingSettlementParties,
						com.tools20022.repository.msg.InstrumentLeg3.ReceivingSettlementParties, com.tools20022.repository.msg.IndicationOfInterest1.ReceivingSettlementParties,
						com.tools20022.repository.msg.Order6.ReceivingSettlementParties, com.tools20022.repository.msg.Order11.ReceivingSettlementParties, com.tools20022.repository.msg.QuoteRequest1.ReceivingSettlementParties,
						com.tools20022.repository.msg.RequestForQuote.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption42.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption48.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.ReceivingSettlementParties,
						com.tools20022.repository.choice.SettlementParties3Choice.ReceivingSettlementParties, com.tools20022.repository.msg.NonGuaranteedTrade3.ReceivingParties,
						com.tools20022.repository.choice.SettlementParties4Choice.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.ReceivingSettlementParties,
						com.tools20022.repository.msg.StandingSettlementInstruction11.OtherReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption50.ReceivingSettlementParties,
						com.tools20022.repository.choice.SettlementParties5Choice.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption55.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.ReceivingSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction12.OtherReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption60.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.ReceivingSettlementParties,
						com.tools20022.repository.choice.SettlementParties7Choice.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesOption63.ReceivingSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.ReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.ReceivingSettlementParties);
				subType_lazy = () -> Arrays.asList(ReceivingDepositoryRole.mmObject());
				superType_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReceivingSettlementParty.ReceivingSettlementParty, com.tools20022.repository.entity.ReceivingSettlementParty.NextParty);
			}
		});
		return mmObject_lazy.get();
	}
}