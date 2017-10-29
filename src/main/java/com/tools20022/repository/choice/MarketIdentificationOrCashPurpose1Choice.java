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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.ExternalMarketArea1Code;
import com.tools20022.repository.msg.MarketIdentification87;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Choice of cash purpose or a securities market identifier.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarketIdentificationOrCashPurpose1Choice#SettlementInstructionMarketIdentification
 * MarketIdentificationOrCashPurpose1Choice.
 * SettlementInstructionMarketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MarketIdentificationOrCashPurpose1Choice#CashSSIPurpose
 * MarketIdentificationOrCashPurpose1Choice.CashSSIPurpose}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionV01#MarketIdentification
 * StandingSettlementInstructionV01.MarketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionCancellationV01#MarketIdentification
 * StandingSettlementInstructionCancellationV01.MarketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01#MarketIdentification
 * StandingSettlementInstructionStatusAdviceV01.MarketIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01#MarketIdentification
 * StandingSettlementInstructionDeletionV01.MarketIdentification}</li>
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
 * "MarketIdentificationOrCashPurpose1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of cash purpose or a securities market identifier."</li>
 * </ul>
 */
public class MarketIdentificationOrCashPurpose1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the market for the settlement. This consists of the country
	 * code and the asset class. For example, if the SSI is for equities in the
	 * DTCC, the country code is ‘US’ and the classification type is ‘equity’.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketIdentification87
	 * MarketIdentification87}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MarketIdentificationOrCashPurpose1Choice
	 * MarketIdentificationOrCashPurpose1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmInstrMktId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstructionMarketIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the market for the settlement. This consists of the country code and the asset class. For example, if the SSI is for equities in the DTCC, the country code is ‘US’ and the classification type is ‘equity’."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd SettlementInstructionMarketIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> MarketIdentificationOrCashPurpose1Choice.mmObject();
			isDerived = false;
			xmlTag = "SttlmInstrMktId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstructionMarketIdentification";
			definition = "Identifies the market for the settlement. This consists of the country code and the asset class. For example, if the SSI is for equities in the DTCC, the country code is ‘US’ and the classification type is ‘equity’.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> MarketIdentification87.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Underlying reason for the payment SSI instruction, expressed as a code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalMarketArea1Code
	 * ExternalMarketArea1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MarketIdentificationOrCashPurpose1Choice
	 * MarketIdentificationOrCashPurpose1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSSIPurp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSSIPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying reason for the payment SSI instruction, expressed as a code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CashSSIPurpose = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MarketIdentificationOrCashPurpose1Choice.mmObject();
			isDerived = false;
			xmlTag = "CshSSIPurp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSSIPurpose";
			definition = "Underlying reason for the payment SSI instruction, expressed as a code.";
			minOccurs = 1;
			simpleType_lazy = () -> ExternalMarketArea1Code.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MarketIdentificationOrCashPurpose1Choice.SettlementInstructionMarketIdentification,
						com.tools20022.repository.choice.MarketIdentificationOrCashPurpose1Choice.CashSSIPurpose);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.reda.StandingSettlementInstructionV01.MarketIdentification,
						com.tools20022.repository.area.reda.StandingSettlementInstructionCancellationV01.MarketIdentification, com.tools20022.repository.area.reda.StandingSettlementInstructionStatusAdviceV01.MarketIdentification,
						com.tools20022.repository.area.reda.StandingSettlementInstructionDeletionV01.MarketIdentification);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MarketIdentificationOrCashPurpose1Choice";
				definition = "Choice of cash purpose or a securities market identifier.";
			}
		});
		return mmObject_lazy.get();
	}
}