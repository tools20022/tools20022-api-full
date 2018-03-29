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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Index;
import com.tools20022.repository.entity.SecuritiesOrder;
import com.tools20022.repository.entity.SecuritiesTradeIdentification;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique identifier of a document, message or transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmInstructingPartyTransactionIdentification
 * IdentificationReference11Choice.mmInstructingPartyTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmExecutingPartyTransactionIdentification
 * IdentificationReference11Choice.mmExecutingPartyTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmMarketInfrastructureTransactionIdentification
 * IdentificationReference11Choice.
 * mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmClientOrderLinkIdentification
 * IdentificationReference11Choice.mmClientOrderLinkIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmPoolIdentification
 * IdentificationReference11Choice.mmPoolIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmBlockIdentification
 * IdentificationReference11Choice.mmBlockIdentification}</li>
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
 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmIndexIdentification
 * IdentificationReference11Choice.mmIndexIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmCommonIdentification
 * IdentificationReference11Choice.mmCommonIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmComplianceIdentification
 * IdentificationReference11Choice.mmComplianceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmCancellationRequestIdentification
 * IdentificationReference11Choice.mmCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice#mmCollateralTransactionIdentification
 * IdentificationReference11Choice.mmCollateralTransactionIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkedIdentificationGuideline#forIdentificationReference11Choice
 * ConstraintLinkedIdentificationGuideline.forIdentificationReference11Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IdentificationReference11Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unique identifier of a document, message or transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IdentificationReference11Choice", propOrder = {"instructingPartyTransactionIdentification", "executingPartyTransactionIdentification", "marketInfrastructureTransactionIdentification", "clientOrderLinkIdentification",
		"poolIdentification", "blockIdentification", "allocationIdentification", "individualAllocationIdentification", "secondaryAllocationIdentification", "indexIdentification", "commonIdentification", "complianceIdentification",
		"cancellationRequestIdentification", "collateralTransactionIdentification"})
public class IdentificationReference11Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InstgPtyTxId", required = true)
	protected Max35Text instructingPartyTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstgPtyTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructingPartyTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the confirmation transaction as known by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationReference11Choice, Max35Text> mmInstructingPartyTransactionIdentification = new MMMessageAttribute<IdentificationReference11Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "InstgPtyTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingPartyTransactionIdentification";
			definition = "Unambiguous identification of the confirmation transaction as known by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationReference11Choice obj) {
			return obj.getInstructingPartyTransactionIdentification();
		}

		@Override
		public void setValue(IdentificationReference11Choice obj, Max35Text value) {
			obj.setInstructingPartyTransactionIdentification(value);
		}
	};
	@XmlElement(name = "ExctgPtyTxId", required = true)
	protected Max35Text executingPartyTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ExctgPtyTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutingPartyTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the confirmation transaction as known by the executing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationReference11Choice, Max35Text> mmExecutingPartyTransactionIdentification = new MMMessageAttribute<IdentificationReference11Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "ExctgPtyTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingPartyTransactionIdentification";
			definition = "Unambiguous identification of the confirmation transaction as known by the executing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationReference11Choice obj) {
			return obj.getExecutingPartyTransactionIdentification();
		}

		@Override
		public void setValue(IdentificationReference11Choice obj, Max35Text value) {
			obj.setExecutingPartyTransactionIdentification(value);
		}
	};
	@XmlElement(name = "MktInfrstrctrTxId", required = true)
	protected Max35Text marketInfrastructureTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktInfrstrctrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructureTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the confirmation transaction as known by the market infrastructure."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationReference11Choice, Max35Text> mmMarketInfrastructureTransactionIdentification = new MMMessageAttribute<IdentificationReference11Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmMarketInfrastructureTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "MktInfrstrctrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Unambiguous identification of the confirmation transaction as known by the market infrastructure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationReference11Choice obj) {
			return obj.getMarketInfrastructureTransactionIdentification();
		}

		@Override
		public void setValue(IdentificationReference11Choice obj, Max35Text value) {
			obj.setMarketInfrastructureTransactionIdentification(value);
		}
	};
	@XmlElement(name = "ClntOrdrLkId", required = true)
	protected Max35Text clientOrderLinkIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntOrdrLkId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::MAST</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderLinkIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It permits order originators to tie together groups of orders in which trades resulting from orders are associated for a specific purpose, for example the calculation of average execution price for a customer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationReference11Choice, Max35Text> mmClientOrderLinkIdentification = new MMMessageAttribute<IdentificationReference11Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "ClntOrdrLkId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::MAST"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderLinkIdentification";
			definition = "It permits order originators to tie together groups of orders in which trades resulting from orders are associated for a specific purpose, for example the calculation of average execution price for a customer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationReference11Choice obj) {
			return obj.getClientOrderLinkIdentification();
		}

		@Override
		public void setValue(IdentificationReference11Choice obj, Max35Text value) {
			obj.setClientOrderLinkIdentification(value);
		}
	};
	@XmlElement(name = "PoolId", required = true)
	protected Max35Text poolIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmPoolIdentification
	 * SecuritiesTradeIdentification.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::POOL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationReference11Choice, Max35Text> mmPoolIdentification = new MMMessageAttribute<IdentificationReference11Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmPoolIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "PoolId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::POOL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolIdentification";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationReference11Choice obj) {
			return obj.getPoolIdentification();
		}

		@Override
		public void setValue(IdentificationReference11Choice obj, Max35Text value) {
			obj.setPoolIdentification(value);
		}
	};
	@XmlElement(name = "BlckId", required = true)
	protected Max35Text blockIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmBlockIdentification
	 * SecuritiesTradeIdentification.mmBlockIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BlckId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the linked message at the trade/block level which identifies a centrally matched transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationReference11Choice, Max35Text> mmBlockIdentification = new MMMessageAttribute<IdentificationReference11Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmBlockIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "BlckId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockIdentification";
			definition = "Reference of the linked message at the trade/block level which identifies a centrally matched transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationReference11Choice obj) {
			return obj.getBlockIdentification();
		}

		@Override
		public void setValue(IdentificationReference11Choice obj, Max35Text value) {
			obj.setBlockIdentification(value);
		}
	};
	@XmlElement(name = "AllcnId", required = true)
	protected Max35Text allocationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmAllocationIdentification
	 * SecuritiesTradeIdentification.mmAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllcnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 376</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the linked message at the allocation level which identifies a centrally matched transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationReference11Choice, Max35Text> mmAllocationIdentification = new MMMessageAttribute<IdentificationReference11Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmAllocationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "AllcnId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "376"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationIdentification";
			definition = "Reference of the linked message at the allocation level which identifies a centrally matched transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationReference11Choice obj) {
			return obj.getAllocationIdentification();
		}

		@Override
		public void setValue(IdentificationReference11Choice obj, Max35Text value) {
			obj.setAllocationIdentification(value);
		}
	};
	@XmlElement(name = "IndvAllcnId", required = true)
	protected Max35Text individualAllocationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmAllocationIdentification
	 * SecuritiesTradeIdentification.mmAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndvAllcnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividualAllocationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the linked message at the individual allocation level which identifies a centrally matched transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationReference11Choice, Max35Text> mmIndividualAllocationIdentification = new MMMessageAttribute<IdentificationReference11Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmAllocationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "IndvAllcnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualAllocationIdentification";
			definition = "Reference of the linked message at the individual allocation level which identifies a centrally matched transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationReference11Choice obj) {
			return obj.getIndividualAllocationIdentification();
		}

		@Override
		public void setValue(IdentificationReference11Choice obj, Max35Text value) {
			obj.setIndividualAllocationIdentification(value);
		}
	};
	@XmlElement(name = "ScndryAllcnId", required = true)
	protected Max35Text secondaryAllocationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmAllocationIdentification
	 * SecuritiesTradeIdentification.mmAllocationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryAllcnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 376</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryAllocationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that can be shared across a number of allocation instruction or allocation report messages, thereby making it possible to pass an identifier for an original allocation message on multiple messages (for example from one party to a second to a third, across cancel and replace messages etc)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationReference11Choice, Max35Text> mmSecondaryAllocationIdentification = new MMMessageAttribute<IdentificationReference11Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmAllocationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "ScndryAllcnId";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "376"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryAllocationIdentification";
			definition = "Reference that can be shared across a number of allocation instruction or allocation report messages, thereby making it possible to pass an identifier for an original allocation message on multiple messages (for example from one party to a second to a third, across cancel and replace messages etc).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationReference11Choice obj) {
			return obj.getSecondaryAllocationIdentification();
		}

		@Override
		public void setValue(IdentificationReference11Choice obj, Max35Text value) {
			obj.setSecondaryAllocationIdentification(value);
		}
	};
	@XmlElement(name = "IndxId", required = true)
	protected Max35Text indexIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIdentification
	 * Index.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::INDX</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference identifying a index trade."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationReference11Choice, Max35Text> mmIndexIdentification = new MMMessageAttribute<IdentificationReference11Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Index.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "IndxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::INDX"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexIdentification";
			definition = "Reference identifying a index trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationReference11Choice obj) {
			return obj.getIndexIdentification();
		}

		@Override
		public void setValue(IdentificationReference11Choice obj, Max35Text value) {
			obj.setIndexIdentification(value);
		}
	};
	@XmlElement(name = "CmonId", required = true)
	protected Max35Text commonIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
	 * TradeIdentification.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::COMM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference agreed upon by the two trade counterparties to identify the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationReference11Choice, Max35Text> mmCommonIdentification = new MMMessageAttribute<IdentificationReference11Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCommonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "CmonId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::COMM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonIdentification";
			definition = "Unique reference agreed upon by the two trade counterparties to identify the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationReference11Choice obj) {
			return obj.getCommonIdentification();
		}

		@Override
		public void setValue(IdentificationReference11Choice obj, Max35Text value) {
			obj.setCommonIdentification(value);
		}
	};
	@XmlElement(name = "CmplcId", required = true)
	protected Max35Text complianceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmComplianceIdentification
	 * SecuritiesTradeIdentification.mmComplianceIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmplcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::COMM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ComplianceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification used to represent this transaction for compliance purposes."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationReference11Choice, Max35Text> mmComplianceIdentification = new MMMessageAttribute<IdentificationReference11Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmComplianceIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "CmplcId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::COMM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComplianceIdentification";
			definition = "Identification used to represent this transaction for compliance purposes.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationReference11Choice obj) {
			return obj.getComplianceIdentification();
		}

		@Override
		public void setValue(IdentificationReference11Choice obj, Max35Text value) {
			obj.setComplianceIdentification(value);
		}
	};
	@XmlElement(name = "CxlReqId", required = true)
	protected Max35Text cancellationRequestIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCancellationRequestIdentification
	 * SecuritiesTradeIdentification.mmCancellationRequestIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlReqId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::COMM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the cancellation request as known by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationReference11Choice, Max35Text> mmCancellationRequestIdentification = new MMMessageAttribute<IdentificationReference11Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmCancellationRequestIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlReqId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::COMM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestIdentification";
			definition = "Unambiguous identification of the cancellation request as known by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationReference11Choice obj) {
			return obj.getCancellationRequestIdentification();
		}

		@Override
		public void setValue(IdentificationReference11Choice obj, Max35Text value) {
			obj.setCancellationRequestIdentification(value);
		}
	};
	@XmlElement(name = "CollTxId", required = true)
	protected Max35Text collateralTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IdentificationReference11Choice
	 * IdentificationReference11Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::COLR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of a collateral transaction as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IdentificationReference11Choice, Max35Text> mmCollateralTransactionIdentification = new MMMessageAttribute<IdentificationReference11Choice, Max35Text>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmCollateralTransactionIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "CollTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::COLR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralTransactionIdentification";
			definition = "Unambiguous identification of a collateral transaction as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IdentificationReference11Choice obj) {
			return obj.getCollateralTransactionIdentification();
		}

		@Override
		public void setValue(IdentificationReference11Choice obj, Max35Text value) {
			obj.setCollateralTransactionIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IdentificationReference11Choice.mmInstructingPartyTransactionIdentification,
						com.tools20022.repository.choice.IdentificationReference11Choice.mmExecutingPartyTransactionIdentification,
						com.tools20022.repository.choice.IdentificationReference11Choice.mmMarketInfrastructureTransactionIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.mmClientOrderLinkIdentification,
						com.tools20022.repository.choice.IdentificationReference11Choice.mmPoolIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.mmBlockIdentification,
						com.tools20022.repository.choice.IdentificationReference11Choice.mmAllocationIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.mmIndividualAllocationIdentification,
						com.tools20022.repository.choice.IdentificationReference11Choice.mmSecondaryAllocationIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.mmIndexIdentification,
						com.tools20022.repository.choice.IdentificationReference11Choice.mmCommonIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.mmComplianceIdentification,
						com.tools20022.repository.choice.IdentificationReference11Choice.mmCancellationRequestIdentification, com.tools20022.repository.choice.IdentificationReference11Choice.mmCollateralTransactionIdentification);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLinkedIdentificationGuideline.forIdentificationReference11Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IdentificationReference11Choice";
				definition = "Unique identifier of a document, message or transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getInstructingPartyTransactionIdentification() {
		return instructingPartyTransactionIdentification;
	}

	public IdentificationReference11Choice setInstructingPartyTransactionIdentification(Max35Text instructingPartyTransactionIdentification) {
		this.instructingPartyTransactionIdentification = Objects.requireNonNull(instructingPartyTransactionIdentification);
		return this;
	}

	public Max35Text getExecutingPartyTransactionIdentification() {
		return executingPartyTransactionIdentification;
	}

	public IdentificationReference11Choice setExecutingPartyTransactionIdentification(Max35Text executingPartyTransactionIdentification) {
		this.executingPartyTransactionIdentification = Objects.requireNonNull(executingPartyTransactionIdentification);
		return this;
	}

	public Max35Text getMarketInfrastructureTransactionIdentification() {
		return marketInfrastructureTransactionIdentification;
	}

	public IdentificationReference11Choice setMarketInfrastructureTransactionIdentification(Max35Text marketInfrastructureTransactionIdentification) {
		this.marketInfrastructureTransactionIdentification = Objects.requireNonNull(marketInfrastructureTransactionIdentification);
		return this;
	}

	public Max35Text getClientOrderLinkIdentification() {
		return clientOrderLinkIdentification;
	}

	public IdentificationReference11Choice setClientOrderLinkIdentification(Max35Text clientOrderLinkIdentification) {
		this.clientOrderLinkIdentification = Objects.requireNonNull(clientOrderLinkIdentification);
		return this;
	}

	public Max35Text getPoolIdentification() {
		return poolIdentification;
	}

	public IdentificationReference11Choice setPoolIdentification(Max35Text poolIdentification) {
		this.poolIdentification = Objects.requireNonNull(poolIdentification);
		return this;
	}

	public Max35Text getBlockIdentification() {
		return blockIdentification;
	}

	public IdentificationReference11Choice setBlockIdentification(Max35Text blockIdentification) {
		this.blockIdentification = Objects.requireNonNull(blockIdentification);
		return this;
	}

	public Max35Text getAllocationIdentification() {
		return allocationIdentification;
	}

	public IdentificationReference11Choice setAllocationIdentification(Max35Text allocationIdentification) {
		this.allocationIdentification = Objects.requireNonNull(allocationIdentification);
		return this;
	}

	public Max35Text getIndividualAllocationIdentification() {
		return individualAllocationIdentification;
	}

	public IdentificationReference11Choice setIndividualAllocationIdentification(Max35Text individualAllocationIdentification) {
		this.individualAllocationIdentification = Objects.requireNonNull(individualAllocationIdentification);
		return this;
	}

	public Max35Text getSecondaryAllocationIdentification() {
		return secondaryAllocationIdentification;
	}

	public IdentificationReference11Choice setSecondaryAllocationIdentification(Max35Text secondaryAllocationIdentification) {
		this.secondaryAllocationIdentification = Objects.requireNonNull(secondaryAllocationIdentification);
		return this;
	}

	public Max35Text getIndexIdentification() {
		return indexIdentification;
	}

	public IdentificationReference11Choice setIndexIdentification(Max35Text indexIdentification) {
		this.indexIdentification = Objects.requireNonNull(indexIdentification);
		return this;
	}

	public Max35Text getCommonIdentification() {
		return commonIdentification;
	}

	public IdentificationReference11Choice setCommonIdentification(Max35Text commonIdentification) {
		this.commonIdentification = Objects.requireNonNull(commonIdentification);
		return this;
	}

	public Max35Text getComplianceIdentification() {
		return complianceIdentification;
	}

	public IdentificationReference11Choice setComplianceIdentification(Max35Text complianceIdentification) {
		this.complianceIdentification = Objects.requireNonNull(complianceIdentification);
		return this;
	}

	public Max35Text getCancellationRequestIdentification() {
		return cancellationRequestIdentification;
	}

	public IdentificationReference11Choice setCancellationRequestIdentification(Max35Text cancellationRequestIdentification) {
		this.cancellationRequestIdentification = Objects.requireNonNull(cancellationRequestIdentification);
		return this;
	}

	public Max35Text getCollateralTransactionIdentification() {
		return collateralTransactionIdentification;
	}

	public IdentificationReference11Choice setCollateralTransactionIdentification(Max35Text collateralTransactionIdentification) {
		this.collateralTransactionIdentification = Objects.requireNonNull(collateralTransactionIdentification);
		return this;
	}
}