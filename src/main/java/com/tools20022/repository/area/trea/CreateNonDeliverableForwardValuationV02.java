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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CreateNonDeliverableForwardValuation message is sent by a participant to
 * a central system or to a counterparty to notify the valuation of a non
 * deliverable trade.<br>
 * <b>Usage</b><br>
 * The two trading parties will both send similar notifications to the central
 * settlement system and the central settlement system will send notifications
 * to both.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02#mmTradeInformation
 * CreateNonDeliverableForwardValuationV02.mmTradeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02#mmTradingSideIdentification
 * CreateNonDeliverableForwardValuationV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02#mmCounterpartySideIdentification
 * CreateNonDeliverableForwardValuationV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02#mmTradeAmounts
 * CreateNonDeliverableForwardValuationV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02#mmValuationInformation
 * CreateNonDeliverableForwardValuationV02.mmValuationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02#mmValuationRate
 * CreateNonDeliverableForwardValuationV02.mmValuationRate}</li>
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
 * xmlTag} = "CretNDFValtnV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} = {@linkplain com.tools20022.repository.area.TreasuryArchive
 * TreasuryArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code trea.004.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CreateNonDeliverableForwardValuationV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CreateNonDeliverableForwardValuation message is sent by a participant to a central system or to a counterparty to notify the valuation of a non deliverable trade.\r\nUsage\r\nThe two trading parties will both send similar notifications to the central settlement system and the central settlement system will send notifications to both."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CreateNonDeliverableForwardValuationV02", propOrder = {"tradeInformation", "tradingSideIdentification", "counterpartySideIdentification", "tradeAmounts", "valuationInformation", "valuationRate"})
public class CreateNonDeliverableForwardValuationV02 {

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
	 * "Provides identification and date of the valuation of the non deliverable trade which is created."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CreateNonDeliverableForwardValuationV02, TradeAgreement1> mmTradeInformation = new MMMessageBuildingBlock<CreateNonDeliverableForwardValuationV02, TradeAgreement1>() {
		{
			xmlTag = "TradInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeInformation";
			definition = "Provides identification and date of the valuation of the non deliverable trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeAgreement1.mmObject();
		}

		@Override
		public TradeAgreement1 getValue(CreateNonDeliverableForwardValuationV02 obj) {
			return obj.getTradeInformation();
		}

		@Override
		public void setValue(CreateNonDeliverableForwardValuationV02 obj, TradeAgreement1 value) {
			obj.setTradeInformation(value);
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
	 * "Specifies the trading side of the valuation of the non deliverable trade which is created."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CreateNonDeliverableForwardValuationV02, TradePartyIdentification3> mmTradingSideIdentification = new MMMessageBuildingBlock<CreateNonDeliverableForwardValuationV02, TradePartyIdentification3>() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Specifies the trading side of the valuation of the non deliverable trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification3.mmObject();
		}

		@Override
		public TradePartyIdentification3 getValue(CreateNonDeliverableForwardValuationV02 obj) {
			return obj.getTradingSideIdentification();
		}

		@Override
		public void setValue(CreateNonDeliverableForwardValuationV02 obj, TradePartyIdentification3 value) {
			obj.setTradingSideIdentification(value);
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
	 * "Specifies the counterparty of the valuation of the non deliverable trade which is created."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CreateNonDeliverableForwardValuationV02, TradePartyIdentification3> mmCounterpartySideIdentification = new MMMessageBuildingBlock<CreateNonDeliverableForwardValuationV02, TradePartyIdentification3>() {
		{
			xmlTag = "CtrPtySdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideIdentification";
			definition = "Specifies the counterparty of the valuation of the non deliverable trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification3.mmObject();
		}

		@Override
		public TradePartyIdentification3 getValue(CreateNonDeliverableForwardValuationV02 obj) {
			return obj.getCounterpartySideIdentification();
		}

		@Override
		public void setValue(CreateNonDeliverableForwardValuationV02 obj, TradePartyIdentification3 value) {
			obj.setCounterpartySideIdentification(value);
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
	 * "Specifies the amounts of the valuation of the non deliverable trade which is created."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CreateNonDeliverableForwardValuationV02, AmountsAndValueDate1> mmTradeAmounts = new MMMessageBuildingBlock<CreateNonDeliverableForwardValuationV02, AmountsAndValueDate1>() {
		{
			xmlTag = "TradAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmounts";
			definition = "Specifies the amounts of the valuation of the non deliverable trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountsAndValueDate1.mmObject();
		}

		@Override
		public AmountsAndValueDate1 getValue(CreateNonDeliverableForwardValuationV02 obj) {
			return obj.getTradeAmounts();
		}

		@Override
		public void setValue(CreateNonDeliverableForwardValuationV02 obj, AmountsAndValueDate1 value) {
			obj.setTradeAmounts(value);
		}
	};
	@XmlElement(name = "ValtnInf", required = true)
	protected ValuationData2 valuationInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ValuationData2
	 * ValuationData2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValtnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the valuation information of the valuation of the non deliverable trade which is created."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CreateNonDeliverableForwardValuationV02, ValuationData2> mmValuationInformation = new MMMessageBuildingBlock<CreateNonDeliverableForwardValuationV02, ValuationData2>() {
		{
			xmlTag = "ValtnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationInformation";
			definition = "Specifies the valuation information of the valuation of the non deliverable trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ValuationData2.mmObject();
		}

		@Override
		public ValuationData2 getValue(CreateNonDeliverableForwardValuationV02 obj) {
			return obj.getValuationInformation();
		}

		@Override
		public void setValue(CreateNonDeliverableForwardValuationV02 obj, ValuationData2 value) {
			obj.setValuationInformation(value);
		}
	};
	@XmlElement(name = "ValtnRate", required = true)
	protected AgreedRate1 valuationRate;
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
	 * xmlTag} = "ValtnRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the valuation rate of the valuation of the non deliverable trade which is created."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CreateNonDeliverableForwardValuationV02, AgreedRate1> mmValuationRate = new MMMessageBuildingBlock<CreateNonDeliverableForwardValuationV02, AgreedRate1>() {
		{
			xmlTag = "ValtnRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationRate";
			definition = "Specifies the valuation rate of the valuation of the non deliverable trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AgreedRate1.mmObject();
		}

		@Override
		public AgreedRate1 getValue(CreateNonDeliverableForwardValuationV02 obj) {
			return obj.getValuationRate();
		}

		@Override
		public void setValue(CreateNonDeliverableForwardValuationV02 obj, AgreedRate1 value) {
			obj.setValuationRate(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreateNonDeliverableForwardValuationV02";
				definition = "Scope\r\nThe CreateNonDeliverableForwardValuation message is sent by a participant to a central system or to a counterparty to notify the valuation of a non deliverable trade.\r\nUsage\r\nThe two trading parties will both send similar notifications to the central settlement system and the central settlement system will send notifications to both.";
				messageSet_lazy = () -> Arrays.asList(ForexNotificationsISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CretNDFValtnV02";
				businessArea_lazy = () -> TreasuryArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02.mmTradeInformation,
						com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02.mmTradingSideIdentification, com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02.mmCounterpartySideIdentification,
						com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02.mmTradeAmounts, com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02.mmValuationInformation,
						com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02.mmValuationRate);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "trea";
						messageFunctionality = "004";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CreateNonDeliverableForwardValuationV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradeAgreement1 getTradeInformation() {
		return tradeInformation;
	}

	public CreateNonDeliverableForwardValuationV02 setTradeInformation(TradeAgreement1 tradeInformation) {
		this.tradeInformation = Objects.requireNonNull(tradeInformation);
		return this;
	}

	public TradePartyIdentification3 getTradingSideIdentification() {
		return tradingSideIdentification;
	}

	public CreateNonDeliverableForwardValuationV02 setTradingSideIdentification(TradePartyIdentification3 tradingSideIdentification) {
		this.tradingSideIdentification = Objects.requireNonNull(tradingSideIdentification);
		return this;
	}

	public TradePartyIdentification3 getCounterpartySideIdentification() {
		return counterpartySideIdentification;
	}

	public CreateNonDeliverableForwardValuationV02 setCounterpartySideIdentification(TradePartyIdentification3 counterpartySideIdentification) {
		this.counterpartySideIdentification = Objects.requireNonNull(counterpartySideIdentification);
		return this;
	}

	public AmountsAndValueDate1 getTradeAmounts() {
		return tradeAmounts;
	}

	public CreateNonDeliverableForwardValuationV02 setTradeAmounts(AmountsAndValueDate1 tradeAmounts) {
		this.tradeAmounts = Objects.requireNonNull(tradeAmounts);
		return this;
	}

	public ValuationData2 getValuationInformation() {
		return valuationInformation;
	}

	public CreateNonDeliverableForwardValuationV02 setValuationInformation(ValuationData2 valuationInformation) {
		this.valuationInformation = Objects.requireNonNull(valuationInformation);
		return this;
	}

	public AgreedRate1 getValuationRate() {
		return valuationRate;
	}

	public CreateNonDeliverableForwardValuationV02 setValuationRate(AgreedRate1 valuationRate) {
		this.valuationRate = Objects.requireNonNull(valuationRate);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.004.001.02")
	static public class Document {
		@XmlElement(name = "CretNDFValtnV02", required = true)
		public CreateNonDeliverableForwardValuationV02 messageBody;
	}
}