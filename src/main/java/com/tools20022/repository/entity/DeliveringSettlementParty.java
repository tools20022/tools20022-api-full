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

import com.tools20022.metamodel.MMAggregation;
import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;

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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#mmDeliveringSettlementParty
 * DeliveringSettlementParty.mmDeliveringSettlementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#mmNextParty
 * DeliveringSettlementParty.mmNextParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#mmDeliveringSettlementParty
 * DeliveringSettlementParty.mmDeliveringSettlementParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#mmNextParty
 * DeliveringSettlementParty.mmNextParty}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction4#mmOtherDeliveringSettlementParties
 * StandingSettlementInstruction4.mmOtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails3#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails3.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails4#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails4.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails2#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails2.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction7#mmOtherDeliveringSettlementParties
 * StandingSettlementInstruction7.mmOtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails5#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails5.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails6.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails7#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails7.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption3#mmDeliveringSettlementParties
 * SecuritiesOption3.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption8#mmDeliveringSettlementParties
 * SecuritiesOption8.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption18#mmDeliveringSettlementParties
 * SecuritiesOption18.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption20#mmDeliveringSettlementParties
 * SecuritiesOption20.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption26#mmDeliveringSettlementParties
 * SecuritiesOption26.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption31#mmDeliveringSettlementParties
 * SecuritiesOption31.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption35#mmDeliveringSettlementParties
 * SecuritiesOption35.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption36#mmDeliveringSettlementParties
 * SecuritiesOption36.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction3#mmOtherDeliveringSettlementParties
 * StandingSettlementInstruction3.mmOtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction6#mmOtherDeliveringSettlementParties
 * StandingSettlementInstruction6.mmOtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails8#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails8.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails9#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails9.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails10#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails10.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails11#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails11.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails12#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails12.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails13#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails13.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order3#mmDeliveringSettlementParties
 * Order3.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction9#mmOtherDeliveringSettlementParties
 * StandingSettlementInstruction9.mmOtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails2#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails2.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails8.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction5#mmOtherDeliveringSettlementParties
 * StandingSettlementInstruction5.mmOtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails6#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails6.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails10#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails10.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails17#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails17.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails18#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails18.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction8#mmOtherDeliveringSettlementParties
 * StandingSettlementInstruction8.mmOtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties2Choice#mmDeliveringSettlementParties
 * SettlementParties2Choice.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade1#mmDeliveringParties
 * NonGuaranteedTrade1.mmDeliveringParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade2#mmDeliveringParties
 * NonGuaranteedTrade2.mmDeliveringParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order9#mmDeliveringSettlementParties
 * Order9.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg2#mmDeliveringSettlementParties
 * InstrumentLeg2.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleQuote1#mmDeliveringSettlementParties
 * SingleQuote1.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MassQuote1#mmDeliveringSettlementParties
 * MassQuote1.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InstrumentLeg3#mmDeliveringSettlementParties
 * InstrumentLeg3.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndicationOfInterest1#mmDeliveringSettlementParties
 * IndicationOfInterest1.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order6#mmDeliveringSettlementParties
 * Order6.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Order11#mmDeliveringSettlementParties
 * Order11.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.QuoteRequest1#mmDeliveringSettlementParties
 * QuoteRequest1.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RequestForQuote#mmDeliveringSettlementParties
 * RequestForQuote.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails16#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails16.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails14#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails14.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails15#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails15.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails21.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption42#mmDeliveringSettlementParties
 * SecuritiesOption42.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption48#mmDeliveringSettlementParties
 * SecuritiesOption48.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails22#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails22.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails17#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails17.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails18#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails18.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails19#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails19.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails24#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails24.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties3Choice#mmDeliveringSettlementParties
 * SettlementParties3Choice.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonGuaranteedTrade3#mmDeliveringParties
 * NonGuaranteedTrade3.mmDeliveringParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties4Choice#mmDeliveringSettlementParties
 * SettlementParties4Choice.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails25#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails25.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction11#mmOtherDeliveringSettlementParties
 * StandingSettlementInstruction11.mmOtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails26#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails26.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails21#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails21.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails22#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails22.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails20#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails20.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption50#mmDeliveringSettlementParties
 * SecuritiesOption50.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties5Choice#mmDeliveringSettlementParties
 * SettlementParties5Choice.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption55#mmDeliveringSettlementParties
 * SecuritiesOption55.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails33#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails33.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction12#mmOtherDeliveringSettlementParties
 * StandingSettlementInstruction12.mmOtherDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails23#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails23.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails25#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails25.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails24#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails24.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmDeliveringSettlementParties
 * SecuritiesOption60.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails35.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails27#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails27.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails28#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails28.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails26#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails26.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SettlementParties7Choice#mmDeliveringSettlementParties
 * SettlementParties7Choice.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails36#mmDeliveringSettlementParties
 * SecuritiesFinancingTransactionDetails36.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails30#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails30.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesOption63#mmDeliveringSettlementParties
 * SecuritiesOption63.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails29#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails29.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails31#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails31.mmDeliveringSettlementParties}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.DeliveringDepositoryRole
 * DeliveringDepositoryRole}</li>
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
 * "DeliveringSettlementParty"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Party that is responsible for delivering securities as part of a chain of settlement parties or as party that sells them."
 * </li>
 * </ul>
 */
public class DeliveringSettlementParty extends SecuritiesSettlementPartyRole {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected DeliveringSettlementParty deliveringSettlementParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#mmNextParty
	 * DeliveringSettlementParty.mmNextParty}</li>
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
	public static final MMBusinessAssociationEnd mmDeliveringSettlementParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeliveringSettlementParty";
			definition = "Specifies the settlement party which is followed by another party.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmNextParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DeliveringSettlementParty> nextParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty#mmDeliveringSettlementParty
	 * DeliveringSettlementParty.mmDeliveringSettlementParty}</li>
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
	public static final MMBusinessAssociationEnd mmNextParty = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NextParty";
			definition = "Next party in the delivering side of the settlement the transaction chain.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmDeliveringSettlementParty;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DeliveringSettlementParty.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeliveringSettlementParty";
				definition = "Party that is responsible for delivering securities as part of a chain of settlement parties or as party that sells them.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DeliveringSettlementParty.mmDeliveringSettlementParty, com.tools20022.repository.entity.DeliveringSettlementParty.mmNextParty);
				derivationElement_lazy = () -> Arrays.asList(StandingSettlementInstruction4.mmOtherDeliveringSettlementParties, SecuritiesSettlementTransactionDetails3.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionDetails4.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails2.mmDeliveringSettlementParties, StandingSettlementInstruction7.mmOtherDeliveringSettlementParties,
						SecuritiesSettlementTransactionDetails5.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails6.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails7.mmDeliveringSettlementParties,
						SecuritiesOption3.mmDeliveringSettlementParties, SecuritiesOption8.mmDeliveringSettlementParties, SecuritiesOption18.mmDeliveringSettlementParties, SecuritiesOption20.mmDeliveringSettlementParties,
						SecuritiesOption26.mmDeliveringSettlementParties, SecuritiesOption31.mmDeliveringSettlementParties, SecuritiesOption35.mmDeliveringSettlementParties, SecuritiesOption36.mmDeliveringSettlementParties,
						StandingSettlementInstruction3.mmOtherDeliveringSettlementParties, StandingSettlementInstruction6.mmOtherDeliveringSettlementParties, SecuritiesSettlementTransactionDetails8.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionDetails9.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails10.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails11.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionDetails12.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails13.mmDeliveringSettlementParties, Order3.mmDeliveringSettlementParties,
						StandingSettlementInstruction9.mmOtherDeliveringSettlementParties, SecuritiesFinancingTransactionDetails2.mmDeliveringSettlementParties, SecuritiesFinancingTransactionDetails8.mmDeliveringSettlementParties,
						StandingSettlementInstruction5.mmOtherDeliveringSettlementParties, SecuritiesFinancingTransactionDetails6.mmDeliveringSettlementParties, SecuritiesFinancingTransactionDetails10.mmDeliveringSettlementParties,
						SecuritiesFinancingTransactionDetails17.mmDeliveringSettlementParties, SecuritiesFinancingTransactionDetails18.mmDeliveringSettlementParties, StandingSettlementInstruction8.mmOtherDeliveringSettlementParties,
						SettlementParties2Choice.mmDeliveringSettlementParties, NonGuaranteedTrade1.mmDeliveringParties, NonGuaranteedTrade2.mmDeliveringParties, Order9.mmDeliveringSettlementParties,
						InstrumentLeg2.mmDeliveringSettlementParties, SingleQuote1.mmDeliveringSettlementParties, MassQuote1.mmDeliveringSettlementParties, InstrumentLeg3.mmDeliveringSettlementParties,
						IndicationOfInterest1.mmDeliveringSettlementParties, Order6.mmDeliveringSettlementParties, Order11.mmDeliveringSettlementParties, QuoteRequest1.mmDeliveringSettlementParties,
						RequestForQuote.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails16.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails14.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionDetails15.mmDeliveringSettlementParties, SecuritiesFinancingTransactionDetails21.mmDeliveringSettlementParties, SecuritiesOption42.mmDeliveringSettlementParties,
						SecuritiesOption48.mmDeliveringSettlementParties, SecuritiesFinancingTransactionDetails22.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails17.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionDetails18.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails19.mmDeliveringSettlementParties, SecuritiesFinancingTransactionDetails24.mmDeliveringSettlementParties,
						SettlementParties3Choice.mmDeliveringSettlementParties, NonGuaranteedTrade3.mmDeliveringParties, SettlementParties4Choice.mmDeliveringSettlementParties,
						SecuritiesFinancingTransactionDetails25.mmDeliveringSettlementParties, StandingSettlementInstruction11.mmOtherDeliveringSettlementParties, SecuritiesFinancingTransactionDetails26.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionDetails21.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails22.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails20.mmDeliveringSettlementParties,
						SecuritiesOption50.mmDeliveringSettlementParties, SettlementParties5Choice.mmDeliveringSettlementParties, SecuritiesOption55.mmDeliveringSettlementParties,
						SecuritiesFinancingTransactionDetails33.mmDeliveringSettlementParties, StandingSettlementInstruction12.mmOtherDeliveringSettlementParties, SecuritiesSettlementTransactionDetails23.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionDetails25.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails24.mmDeliveringSettlementParties, SecuritiesOption60.mmDeliveringSettlementParties,
						SecuritiesFinancingTransactionDetails35.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails27.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails28.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionDetails26.mmDeliveringSettlementParties, SettlementParties7Choice.mmDeliveringSettlementParties, SecuritiesFinancingTransactionDetails36.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionDetails30.mmDeliveringSettlementParties, SecuritiesOption63.mmDeliveringSettlementParties, SecuritiesSettlementTransactionDetails29.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionDetails31.mmDeliveringSettlementParties);
				subType_lazy = () -> Arrays.asList(DeliveringDepositoryRole.mmObject());
				superType_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.DeliveringSettlementParty.mmDeliveringSettlementParty, com.tools20022.repository.entity.DeliveringSettlementParty.mmNextParty);
			}

			@Override
			public Class<?> getInstanceClass() {
				return DeliveringSettlementParty.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DeliveringSettlementParty getDeliveringSettlementParty() {
		return deliveringSettlementParty;
	}

	public DeliveringSettlementParty setDeliveringSettlementParty(com.tools20022.repository.entity.DeliveringSettlementParty deliveringSettlementParty) {
		this.deliveringSettlementParty = Objects.requireNonNull(deliveringSettlementParty);
		return this;
	}

	public List<DeliveringSettlementParty> getNextParty() {
		return nextParty == null ? nextParty = new ArrayList<>() : nextParty;
	}

	public DeliveringSettlementParty setNextParty(List<com.tools20022.repository.entity.DeliveringSettlementParty> nextParty) {
		this.nextParty = Objects.requireNonNull(nextParty);
		return this;
	}
}