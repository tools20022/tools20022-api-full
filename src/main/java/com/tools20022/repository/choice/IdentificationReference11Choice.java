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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "IdentificationReference11Choice", propOrder = {"instructingPartyTransactionIdentification", "executingPartyTransactionIdentification", "marketInfrastructureTransactionIdentification", "clientOrderLinkIdentification",
		"poolIdentification", "blockIdentification", "allocationIdentification", "individualAllocationIdentification", "secondaryAllocationIdentification", "indexIdentification", "commonIdentification", "complianceIdentification",
		"cancellationRequestIdentification", "collateralTransactionIdentification"})
public class IdentificationReference11Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text instructingPartyTransactionIdentification;
	/**
	 * Unambiguous identification of the confirmation transaction as known by
	 * the instructing party.
	 * <p>
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
	public static final MMMessageAttribute mmInstructingPartyTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "InstgPtyTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructingPartyTransactionIdentification";
			definition = "Unambiguous identification of the confirmation transaction as known by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text executingPartyTransactionIdentification;
	/**
	 * Unambiguous identification of the confirmation transaction as known by
	 * the executing party.
	 * <p>
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
	public static final MMMessageAttribute mmExecutingPartyTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "ExctgPtyTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutingPartyTransactionIdentification";
			definition = "Unambiguous identification of the confirmation transaction as known by the executing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text marketInfrastructureTransactionIdentification;
	/**
	 * Unambiguous identification of the confirmation transaction as known by
	 * the market infrastructure.
	 * <p>
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
	public static final MMMessageAttribute mmMarketInfrastructureTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmMarketInfrastructureTransactionIdentification;
			componentContext_lazy = () -> IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "MktInfrstrctrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Unambiguous identification of the confirmation transaction as known by the market infrastructure.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text clientOrderLinkIdentification;
	/**
	 * It permits order originators to tie together groups of orders in which
	 * trades resulting from orders are associated for a specific purpose, for
	 * example the calculation of average execution price for a customer.
	 * <p>
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
	public static final MMMessageAttribute mmClientOrderLinkIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "ClntOrdrLkId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderLinkIdentification";
			definition = "It permits order originators to tie together groups of orders in which trades resulting from orders are associated for a specific purpose, for example the calculation of average execution price for a customer.";
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
	public static final MMMessageAttribute mmPoolIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmPoolIdentification;
			componentContext_lazy = () -> IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "PoolId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolIdentification";
			definition = "Collective reference identifying a set of messages.";
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
	public static final MMMessageAttribute mmBlockIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmBlockIdentification;
			componentContext_lazy = () -> IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "BlckId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockIdentification";
			definition = "Reference of the linked message at the trade/block level which identifies a centrally matched transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text allocationIdentification;
	/**
	 * Reference of the linked message at the allocation level which identifies
	 * a centrally matched transaction.
	 * <p>
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
	public static final MMMessageAttribute mmAllocationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmAllocationIdentification;
			componentContext_lazy = () -> IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "AllcnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationIdentification";
			definition = "Reference of the linked message at the allocation level which identifies a centrally matched transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text individualAllocationIdentification;
	/**
	 * Reference of the linked message at the individual allocation level which
	 * identifies a centrally matched transaction.
	 * <p>
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
	public static final MMMessageAttribute mmIndividualAllocationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmAllocationIdentification;
			componentContext_lazy = () -> IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "IndvAllcnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividualAllocationIdentification";
			definition = "Reference of the linked message at the individual allocation level which identifies a centrally matched transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text secondaryAllocationIdentification;
	/**
	 * Reference that can be shared across a number of allocation instruction or
	 * allocation report messages, thereby making it possible to pass an
	 * identifier for an original allocation message on multiple messages (for
	 * example from one party to a second to a third, across cancel and replace
	 * messages etc).
	 * <p>
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
	public static final MMMessageAttribute mmSecondaryAllocationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmAllocationIdentification;
			componentContext_lazy = () -> IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "ScndryAllcnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryAllocationIdentification";
			definition = "Reference that can be shared across a number of allocation instruction or allocation report messages, thereby making it possible to pass an identifier for an original allocation message on multiple messages (for example from one party to a second to a third, across cancel and replace messages etc).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text indexIdentification;
	/**
	 * Reference identifying a index trade.
	 * <p>
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
	public static final MMMessageAttribute mmIndexIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Index.mmIdentification;
			componentContext_lazy = () -> IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "IndxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexIdentification";
			definition = "Reference identifying a index trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text commonIdentification;
	/**
	 * Unique reference agreed upon by the two trade counterparties to identify
	 * the trade.
	 * <p>
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
	public static final MMMessageAttribute mmCommonIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCommonIdentification;
			componentContext_lazy = () -> IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "CmonId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonIdentification";
			definition = "Unique reference agreed upon by the two trade counterparties to identify the trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text complianceIdentification;
	/**
	 * Identification used to represent this transaction for compliance
	 * purposes.
	 * <p>
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
	public static final MMMessageAttribute mmComplianceIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmComplianceIdentification;
			componentContext_lazy = () -> IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "CmplcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ComplianceIdentification";
			definition = "Identification used to represent this transaction for compliance purposes.";
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
	public static final MMMessageAttribute mmCancellationRequestIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmCancellationRequestIdentification;
			componentContext_lazy = () -> IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestIdentification";
			definition = "Unambiguous identification of the cancellation request as known by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text collateralTransactionIdentification;
	/**
	 * Unambiguous identification of a collateral transaction as assigned by the
	 * instructing party.
	 * <p>
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
	public static final MMMessageAttribute mmCollateralTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmCollateralTransactionIdentification;
			componentContext_lazy = () -> IdentificationReference11Choice.mmObject();
			isDerived = false;
			xmlTag = "CollTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralTransactionIdentification";
			definition = "Unambiguous identification of a collateral transaction as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IdentificationReference11Choice.mmInstructingPartyTransactionIdentification, IdentificationReference11Choice.mmExecutingPartyTransactionIdentification,
						IdentificationReference11Choice.mmMarketInfrastructureTransactionIdentification, IdentificationReference11Choice.mmClientOrderLinkIdentification, IdentificationReference11Choice.mmPoolIdentification,
						IdentificationReference11Choice.mmBlockIdentification, IdentificationReference11Choice.mmAllocationIdentification, IdentificationReference11Choice.mmIndividualAllocationIdentification,
						IdentificationReference11Choice.mmSecondaryAllocationIdentification, IdentificationReference11Choice.mmIndexIdentification, IdentificationReference11Choice.mmCommonIdentification,
						IdentificationReference11Choice.mmComplianceIdentification, IdentificationReference11Choice.mmCancellationRequestIdentification, IdentificationReference11Choice.mmCollateralTransactionIdentification);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IdentificationReference11Choice";
				definition = "Unique identifier of a document, message or transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "InstgPtyTxId", required = true)
	public Max35Text getInstructingPartyTransactionIdentification() {
		return instructingPartyTransactionIdentification;
	}

	public void setInstructingPartyTransactionIdentification(Max35Text instructingPartyTransactionIdentification) {
		this.instructingPartyTransactionIdentification = instructingPartyTransactionIdentification;
	}

	@XmlElement(name = "ExctgPtyTxId", required = true)
	public Max35Text getExecutingPartyTransactionIdentification() {
		return executingPartyTransactionIdentification;
	}

	public void setExecutingPartyTransactionIdentification(Max35Text executingPartyTransactionIdentification) {
		this.executingPartyTransactionIdentification = executingPartyTransactionIdentification;
	}

	@XmlElement(name = "MktInfrstrctrTxId", required = true)
	public Max35Text getMarketInfrastructureTransactionIdentification() {
		return marketInfrastructureTransactionIdentification;
	}

	public void setMarketInfrastructureTransactionIdentification(Max35Text marketInfrastructureTransactionIdentification) {
		this.marketInfrastructureTransactionIdentification = marketInfrastructureTransactionIdentification;
	}

	@XmlElement(name = "ClntOrdrLkId", required = true)
	public Max35Text getClientOrderLinkIdentification() {
		return clientOrderLinkIdentification;
	}

	public void setClientOrderLinkIdentification(Max35Text clientOrderLinkIdentification) {
		this.clientOrderLinkIdentification = clientOrderLinkIdentification;
	}

	@XmlElement(name = "PoolId", required = true)
	public Max35Text getPoolIdentification() {
		return poolIdentification;
	}

	public void setPoolIdentification(Max35Text poolIdentification) {
		this.poolIdentification = poolIdentification;
	}

	@XmlElement(name = "BlckId", required = true)
	public Max35Text getBlockIdentification() {
		return blockIdentification;
	}

	public void setBlockIdentification(Max35Text blockIdentification) {
		this.blockIdentification = blockIdentification;
	}

	@XmlElement(name = "AllcnId", required = true)
	public Max35Text getAllocationIdentification() {
		return allocationIdentification;
	}

	public void setAllocationIdentification(Max35Text allocationIdentification) {
		this.allocationIdentification = allocationIdentification;
	}

	@XmlElement(name = "IndvAllcnId", required = true)
	public Max35Text getIndividualAllocationIdentification() {
		return individualAllocationIdentification;
	}

	public void setIndividualAllocationIdentification(Max35Text individualAllocationIdentification) {
		this.individualAllocationIdentification = individualAllocationIdentification;
	}

	@XmlElement(name = "ScndryAllcnId", required = true)
	public Max35Text getSecondaryAllocationIdentification() {
		return secondaryAllocationIdentification;
	}

	public void setSecondaryAllocationIdentification(Max35Text secondaryAllocationIdentification) {
		this.secondaryAllocationIdentification = secondaryAllocationIdentification;
	}

	@XmlElement(name = "IndxId", required = true)
	public Max35Text getIndexIdentification() {
		return indexIdentification;
	}

	public void setIndexIdentification(Max35Text indexIdentification) {
		this.indexIdentification = indexIdentification;
	}

	@XmlElement(name = "CmonId", required = true)
	public Max35Text getCommonIdentification() {
		return commonIdentification;
	}

	public void setCommonIdentification(Max35Text commonIdentification) {
		this.commonIdentification = commonIdentification;
	}

	@XmlElement(name = "CmplcId", required = true)
	public Max35Text getComplianceIdentification() {
		return complianceIdentification;
	}

	public void setComplianceIdentification(Max35Text complianceIdentification) {
		this.complianceIdentification = complianceIdentification;
	}

	@XmlElement(name = "CxlReqId", required = true)
	public Max35Text getCancellationRequestIdentification() {
		return cancellationRequestIdentification;
	}

	public void setCancellationRequestIdentification(Max35Text cancellationRequestIdentification) {
		this.cancellationRequestIdentification = cancellationRequestIdentification;
	}

	@XmlElement(name = "CollTxId", required = true)
	public Max35Text getCollateralTransactionIdentification() {
		return collateralTransactionIdentification;
	}

	public void setCollateralTransactionIdentification(Max35Text collateralTransactionIdentification) {
		this.collateralTransactionIdentification = collateralTransactionIdentification;
	}
}