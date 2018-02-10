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

package com.tools20022.repository.area.trea;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TreasuryArchive;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ForexNotificationsISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CreateNonDeliverableForwardOpening message is sent by a participant to a
 * central system or to a counterparty to notify the opening of a non
 * deliverable trade.<br>
 * <b>Usage</b><br>
 * The trading parties will send similar messages to the central settlement
 * system and the central settlement system will send notifications to both
 * parties.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02#mmTradeInformation
 * CreateNonDeliverableForwardOpeningV02.mmTradeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02#mmTradingSideIdentification
 * CreateNonDeliverableForwardOpeningV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02#mmCounterpartySideIdentification
 * CreateNonDeliverableForwardOpeningV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02#mmTradeAmounts
 * CreateNonDeliverableForwardOpeningV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02#mmAgreedRate
 * CreateNonDeliverableForwardOpeningV02.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02#mmValuationConditions
 * CreateNonDeliverableForwardOpeningV02.mmValuationConditions}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ForexNotificationsISOArchive
 * ForexNotificationsISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CretNDFOpngV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} = {@linkplain com.tools20022.repository.area.TreasuryArchive
 * TreasuryArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code trea.001.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CreateNonDeliverableForwardOpeningV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CreateNonDeliverableForwardOpening message is sent by a participant to a central system or to a counterparty to notify the opening of a non deliverable trade.\r\nUsage\r\nThe trading parties will send similar messages to the central settlement system and the central settlement system will send notifications to both parties."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CreateNonDeliverableForwardOpeningV02", propOrder = {"tradeInformation", "tradingSideIdentification", "counterpartySideIdentification", "tradeAmounts", "agreedRate", "valuationConditions"})
public class CreateNonDeliverableForwardOpeningV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradInf", required = true)
	protected TradeAgreement1 tradeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeAgreement1
	 * TradeAgreement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides identification and date of the non deliverable trade which is created."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeInformation";
			definition = "Provides identification and date of the non deliverable trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeAgreement1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreateNonDeliverableForwardOpeningV02.class.getMethod("getTradeInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TradgSdId", required = true)
	protected TradePartyIdentification3 tradingSideIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3
	 * TradePartyIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trading side of the non deliverable trade which is created."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradingSideIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Specifies the trading side of the non deliverable trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreateNonDeliverableForwardOpeningV02.class.getMethod("getTradingSideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CtrPtySdId", required = true)
	protected TradePartyIdentification3 counterpartySideIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification3
	 * TradePartyIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtySdId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartySideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the counterparty of the non deliverable trade which is created."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCounterpartySideIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrPtySdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideIdentification";
			definition = "Specifies the counterparty of the non deliverable trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreateNonDeliverableForwardOpeningV02.class.getMethod("getCounterpartySideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TradAmts", required = true)
	protected AmountsAndValueDate1 tradeAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1
	 * AmountsAndValueDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amounts of the non deliverable trade which is created."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeAmounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmounts";
			definition = "Specifies the amounts of the non deliverable trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountsAndValueDate1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreateNonDeliverableForwardOpeningV02.class.getMethod("getTradeAmounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AgrdRate", required = true)
	protected AgreedRate1 agreedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.AgreedRate1
	 * AgreedRate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgrdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the rate agreed at the opening of a non deliverable trade."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAgreedRate = new MMMessageBuildingBlock() {
		{
			xmlTag = "AgrdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedRate";
			definition = "Specifies the rate agreed at the opening of a non deliverable trade.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AgreedRate1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreateNonDeliverableForwardOpeningV02.class.getMethod("getAgreedRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ValtnConds", required = true)
	protected NonDeliverableForwardValuationConditions2 valuationConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NonDeliverableForwardValuationConditions2
	 * NonDeliverableForwardValuationConditions2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnConds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the valuation conditions of the non deliverable trade which is created."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmValuationConditions = new MMMessageBuildingBlock() {
		{
			xmlTag = "ValtnConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationConditions";
			definition = "Specifies the valuation conditions of the non deliverable trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> NonDeliverableForwardValuationConditions2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreateNonDeliverableForwardOpeningV02.class.getMethod("getValuationConditions", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreateNonDeliverableForwardOpeningV02";
				definition = "Scope\r\nThe CreateNonDeliverableForwardOpening message is sent by a participant to a central system or to a counterparty to notify the opening of a non deliverable trade.\r\nUsage\r\nThe trading parties will send similar messages to the central settlement system and the central settlement system will send notifications to both parties.";
				messageSet_lazy = () -> Arrays.asList(ForexNotificationsISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CretNDFOpngV02";
				businessArea_lazy = () -> TreasuryArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02.mmTradeInformation,
						com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02.mmTradingSideIdentification, com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02.mmCounterpartySideIdentification,
						com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02.mmTradeAmounts, com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02.mmAgreedRate,
						com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02.mmValuationConditions);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "trea";
						messageFunctionality = "001";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CreateNonDeliverableForwardOpeningV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradeAgreement1 getTradeInformation() {
		return tradeInformation;
	}

	public CreateNonDeliverableForwardOpeningV02 setTradeInformation(TradeAgreement1 tradeInformation) {
		this.tradeInformation = Objects.requireNonNull(tradeInformation);
		return this;
	}

	public TradePartyIdentification3 getTradingSideIdentification() {
		return tradingSideIdentification;
	}

	public CreateNonDeliverableForwardOpeningV02 setTradingSideIdentification(TradePartyIdentification3 tradingSideIdentification) {
		this.tradingSideIdentification = Objects.requireNonNull(tradingSideIdentification);
		return this;
	}

	public TradePartyIdentification3 getCounterpartySideIdentification() {
		return counterpartySideIdentification;
	}

	public CreateNonDeliverableForwardOpeningV02 setCounterpartySideIdentification(TradePartyIdentification3 counterpartySideIdentification) {
		this.counterpartySideIdentification = Objects.requireNonNull(counterpartySideIdentification);
		return this;
	}

	public AmountsAndValueDate1 getTradeAmounts() {
		return tradeAmounts;
	}

	public CreateNonDeliverableForwardOpeningV02 setTradeAmounts(AmountsAndValueDate1 tradeAmounts) {
		this.tradeAmounts = Objects.requireNonNull(tradeAmounts);
		return this;
	}

	public AgreedRate1 getAgreedRate() {
		return agreedRate;
	}

	public CreateNonDeliverableForwardOpeningV02 setAgreedRate(AgreedRate1 agreedRate) {
		this.agreedRate = Objects.requireNonNull(agreedRate);
		return this;
	}

	public NonDeliverableForwardValuationConditions2 getValuationConditions() {
		return valuationConditions;
	}

	public CreateNonDeliverableForwardOpeningV02 setValuationConditions(NonDeliverableForwardValuationConditions2 valuationConditions) {
		this.valuationConditions = Objects.requireNonNull(valuationConditions);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.001.001.02")
	static public class Document {
		@XmlElement(name = "CretNDFOpngV02", required = true)
		public CreateNonDeliverableForwardOpeningV02 messageBody;
	}
}