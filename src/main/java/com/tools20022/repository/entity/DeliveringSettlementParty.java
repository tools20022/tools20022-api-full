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
 * Party that is responsible for delivering securities as part of a chain of
 * settlement parties or as party that sells them.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="DeliveringSettlementParty"
 * src="doc-files/DeliveringSettlementParty.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#DeliveringSettlementParty
 * DeliveringSettlementParty.DeliveringSettlementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#NextParty
 * DeliveringSettlementParty.NextParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#DeliveringSettlementParty
 * DeliveringSettlementParty.DeliveringSettlementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#NextParty
 * DeliveringSettlementParty.NextParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4#OtherDeliveringSettlementParties
 * StandingSettlementInstruction4.OtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails3.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails4.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails2.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction7#OtherDeliveringSettlementParties
 * StandingSettlementInstruction7.OtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails5.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails6.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails7.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#DeliveringSettlementParties
 * SecuritiesOption3.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#DeliveringSettlementParties
 * SecuritiesOption8.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#DeliveringSettlementParties
 * SecuritiesOption18.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#DeliveringSettlementParties
 * SecuritiesOption20.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#DeliveringSettlementParties
 * SecuritiesOption26.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#DeliveringSettlementParties
 * SecuritiesOption31.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#DeliveringSettlementParties
 * SecuritiesOption35.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#DeliveringSettlementParties
 * SecuritiesOption36.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction3#OtherDeliveringSettlementParties
 * StandingSettlementInstruction3.OtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6#OtherDeliveringSettlementParties
 * StandingSettlementInstruction6.OtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails8.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails9.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails10.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails11.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails12.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails13.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order3#DeliveringSettlementParties
 * Order3.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction9#OtherDeliveringSettlementParties
 * StandingSettlementInstruction9.OtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#DeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails2.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#DeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails8.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction5#OtherDeliveringSettlementParties
 * StandingSettlementInstruction5.OtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#DeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails6.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#DeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails10.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#DeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails17.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#DeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails18.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction8#OtherDeliveringSettlementParties
 * StandingSettlementInstruction8.OtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties2Choice#DeliveringSettlementParties
 * SettlementParties2Choice.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade1#DeliveringParties
 * NonGuaranteedTrade1.DeliveringParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade2#DeliveringParties
 * NonGuaranteedTrade2.DeliveringParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order9#DeliveringSettlementParties
 * Order9.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#DeliveringSettlementParties
 * InstrumentLeg2.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#DeliveringSettlementParties
 * SingleQuote1.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MassQuote1#DeliveringSettlementParties
 * MassQuote1.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#DeliveringSettlementParties
 * InstrumentLeg3.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#DeliveringSettlementParties
 * IndicationOfInterest1.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#DeliveringSettlementParties
 * Order6.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order11#DeliveringSettlementParties
 * Order11.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#DeliveringSettlementParties
 * QuoteRequest1.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#DeliveringSettlementParties
 * RequestForQuote.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails16.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails14.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails15.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#DeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails21.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#DeliveringSettlementParties
 * SecuritiesOption42.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#DeliveringSettlementParties
 * SecuritiesOption48.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#DeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails22.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails17.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails18.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails19.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#DeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails24.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties3Choice#DeliveringSettlementParties
 * SettlementParties3Choice.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3#DeliveringParties
 * NonGuaranteedTrade3.DeliveringParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties4Choice#DeliveringSettlementParties
 * SettlementParties4Choice.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#DeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails25.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction11#OtherDeliveringSettlementParties
 * StandingSettlementInstruction11.OtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#DeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails26.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails21.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails22.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails20.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#DeliveringSettlementParties
 * SecuritiesOption50.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties5Choice#DeliveringSettlementParties
 * SettlementParties5Choice.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#DeliveringSettlementParties
 * SecuritiesOption55.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#DeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails33.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction12#OtherDeliveringSettlementParties
 * StandingSettlementInstruction12.OtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails23.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails25.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails24.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#DeliveringSettlementParties
 * SecuritiesOption60.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#DeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails35.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails27.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails28.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails26.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties7Choice#DeliveringSettlementParties
 * SettlementParties7Choice.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#DeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails36.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails30.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#DeliveringSettlementParties
 * SecuritiesOption63.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails29.DeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#DeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails31.DeliveringSettlementParties}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DeliveringDepositoryRole
 * DeliveringDepositoryRole}</li>
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
 * "DeliveringSettlementParty"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that is responsible for delivering securities as part of a chain of settlement parties or as party that sells them."
 * </li>
 * </ul>
 */
public class DeliveringSettlementParty extends SecuritiesSettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the settlement party which is followed by another party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#NextParty
	 * DeliveringSettlementParty.NextParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the settlement party which is followed by another party."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd DeliveringSettlementParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "DeliveringSettlementParty";
			definition = "Specifies the settlement party which is followed by another party.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.NextParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Next party in the delivering side of the settlement the transaction
	 * chain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#DeliveringSettlementParty
	 * DeliveringSettlementParty.DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NextParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Next party in the delivering side of the settlement the transaction chain."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd NextParty = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "NextParty";
			definition = "Next party in the delivering side of the settlement the transaction chain.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.DeliveringSettlementParty;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DeliveringSettlementParty";
				definition = "Party that is responsible for delivering securities as part of a chain of settlement parties or as party that sells them.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DeliveringSettlementParty.DeliveringSettlementParty, com.tools20022.repository.entity.DeliveringSettlementParty.NextParty);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StandingSettlementInstruction4.OtherDeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2.DeliveringSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction7.OtherDeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesOption3.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption8.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesOption18.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption20.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesOption26.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption31.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesOption35.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption36.DeliveringSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction3.OtherDeliveringSettlementParties,
						com.tools20022.repository.msg.StandingSettlementInstruction6.OtherDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13.DeliveringSettlementParties, com.tools20022.repository.msg.Order3.DeliveringSettlementParties,
						com.tools20022.repository.msg.StandingSettlementInstruction9.OtherDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8.DeliveringSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction5.OtherDeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18.DeliveringSettlementParties,
						com.tools20022.repository.msg.StandingSettlementInstruction8.OtherDeliveringSettlementParties, com.tools20022.repository.choice.SettlementParties2Choice.DeliveringSettlementParties,
						com.tools20022.repository.msg.NonGuaranteedTrade1.DeliveringParties, com.tools20022.repository.msg.NonGuaranteedTrade2.DeliveringParties, com.tools20022.repository.msg.Order9.DeliveringSettlementParties,
						com.tools20022.repository.msg.InstrumentLeg2.DeliveringSettlementParties, com.tools20022.repository.msg.SingleQuote1.DeliveringSettlementParties, com.tools20022.repository.msg.MassQuote1.DeliveringSettlementParties,
						com.tools20022.repository.msg.InstrumentLeg3.DeliveringSettlementParties, com.tools20022.repository.msg.IndicationOfInterest1.DeliveringSettlementParties,
						com.tools20022.repository.msg.Order6.DeliveringSettlementParties, com.tools20022.repository.msg.Order11.DeliveringSettlementParties, com.tools20022.repository.msg.QuoteRequest1.DeliveringSettlementParties,
						com.tools20022.repository.msg.RequestForQuote.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesOption42.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesOption48.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24.DeliveringSettlementParties,
						com.tools20022.repository.choice.SettlementParties3Choice.DeliveringSettlementParties, com.tools20022.repository.msg.NonGuaranteedTrade3.DeliveringParties,
						com.tools20022.repository.choice.SettlementParties4Choice.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25.DeliveringSettlementParties,
						com.tools20022.repository.msg.StandingSettlementInstruction11.OtherDeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesOption50.DeliveringSettlementParties,
						com.tools20022.repository.choice.SettlementParties5Choice.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesOption55.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33.DeliveringSettlementParties, com.tools20022.repository.msg.StandingSettlementInstruction12.OtherDeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesOption60.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26.DeliveringSettlementParties,
						com.tools20022.repository.choice.SettlementParties7Choice.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesOption63.DeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29.DeliveringSettlementParties, com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31.DeliveringSettlementParties);
				subType_lazy = () -> Arrays.asList(DeliveringDepositoryRole.mmObject());
				superType_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DeliveringSettlementParty.DeliveringSettlementParty, com.tools20022.repository.entity.DeliveringSettlementParty.NextParty);
			}
		});
		return mmObject_lazy.get();
	}
}