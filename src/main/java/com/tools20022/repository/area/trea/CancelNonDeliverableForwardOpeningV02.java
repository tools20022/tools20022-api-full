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
import java.util.Optional;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CancelNonDeliverableForwardOpening message is sent by a participant to a
 * central system or to a counterparty to notify the cancellation of the opening
 * of a non deliverable trade previously confirmed by the sender.<br>
 * <b>Usage</b><br>
 * The message will contain a Related Reference to link it to the previously
 * sent notification. It may contain a reason for cancellation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02#mmTradeInformation
 * CancelNonDeliverableForwardOpeningV02.mmTradeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02#mmTradingSideIdentification
 * CancelNonDeliverableForwardOpeningV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02#mmCounterpartySideIdentification
 * CancelNonDeliverableForwardOpeningV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02#mmTradeAmounts
 * CancelNonDeliverableForwardOpeningV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02#mmAgreedRate
 * CancelNonDeliverableForwardOpeningV02.mmAgreedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02#mmValuationConditions
 * CancelNonDeliverableForwardOpeningV02.mmValuationConditions}</li>
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
 * xmlTag} = "CclNDFOpngV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} = {@linkplain com.tools20022.repository.area.TreasuryArchive
 * TreasuryArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code trea.003.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancelNonDeliverableForwardOpeningV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CancelNonDeliverableForwardOpening message is sent by a participant to a central system or to a counterparty to notify the cancellation of the opening of a non deliverable trade previously confirmed by the sender.\r\nUsage\r\nThe message will contain a Related Reference to link it to the previously sent notification. It may contain a reason for cancellation."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CancelNonDeliverableForwardOpeningV02", propOrder = {"tradeInformation", "tradingSideIdentification", "counterpartySideIdentification", "tradeAmounts", "agreedRate", "valuationConditions"})
public class CancelNonDeliverableForwardOpeningV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradInf", required = true)
	protected TradeAgreement2 tradeInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeAgreement2
	 * TradeAgreement2}</li>
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
	 * "Provides references and date of the non deliverable trade which is cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CancelNonDeliverableForwardOpeningV02, TradeAgreement2> mmTradeInformation = new MMMessageBuildingBlock<CancelNonDeliverableForwardOpeningV02, TradeAgreement2>() {
		{
			xmlTag = "TradInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeInformation";
			definition = "Provides references and date of the non deliverable trade which is cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeAgreement2.mmObject();
		}

		@Override
		public TradeAgreement2 getValue(CancelNonDeliverableForwardOpeningV02 obj) {
			return obj.getTradeInformation();
		}

		@Override
		public void setValue(CancelNonDeliverableForwardOpeningV02 obj, TradeAgreement2 value) {
			obj.setTradeInformation(value);
		}
	};
	@XmlElement(name = "TradgSdId")
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
	 * "Specifies the trading side of the non deliverable trade which is cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CancelNonDeliverableForwardOpeningV02, Optional<TradePartyIdentification3>> mmTradingSideIdentification = new MMMessageBuildingBlock<CancelNonDeliverableForwardOpeningV02, Optional<TradePartyIdentification3>>() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Specifies the trading side of the non deliverable trade which is cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradePartyIdentification3.mmObject();
		}

		@Override
		public Optional<TradePartyIdentification3> getValue(CancelNonDeliverableForwardOpeningV02 obj) {
			return obj.getTradingSideIdentification();
		}

		@Override
		public void setValue(CancelNonDeliverableForwardOpeningV02 obj, Optional<TradePartyIdentification3> value) {
			obj.setTradingSideIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrPtySdId")
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
	 * "Specifies the counterparty of the non deliverable trade which is cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CancelNonDeliverableForwardOpeningV02, Optional<TradePartyIdentification3>> mmCounterpartySideIdentification = new MMMessageBuildingBlock<CancelNonDeliverableForwardOpeningV02, Optional<TradePartyIdentification3>>() {
		{
			xmlTag = "CtrPtySdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideIdentification";
			definition = "Specifies the counterparty of the non deliverable trade which is cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TradePartyIdentification3.mmObject();
		}

		@Override
		public Optional<TradePartyIdentification3> getValue(CancelNonDeliverableForwardOpeningV02 obj) {
			return obj.getCounterpartySideIdentification();
		}

		@Override
		public void setValue(CancelNonDeliverableForwardOpeningV02 obj, Optional<TradePartyIdentification3> value) {
			obj.setCounterpartySideIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "TradAmts")
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
	 * "Specifies the amounts of the non deliverable trade which is cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CancelNonDeliverableForwardOpeningV02, Optional<AmountsAndValueDate1>> mmTradeAmounts = new MMMessageBuildingBlock<CancelNonDeliverableForwardOpeningV02, Optional<AmountsAndValueDate1>>() {
		{
			xmlTag = "TradAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmounts";
			definition = "Specifies the amounts of the non deliverable trade which is cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountsAndValueDate1.mmObject();
		}

		@Override
		public Optional<AmountsAndValueDate1> getValue(CancelNonDeliverableForwardOpeningV02 obj) {
			return obj.getTradeAmounts();
		}

		@Override
		public void setValue(CancelNonDeliverableForwardOpeningV02 obj, Optional<AmountsAndValueDate1> value) {
			obj.setTradeAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "AgrdRate")
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
	 * "Specifies the rate of the non deliverable trade which is cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CancelNonDeliverableForwardOpeningV02, Optional<AgreedRate1>> mmAgreedRate = new MMMessageBuildingBlock<CancelNonDeliverableForwardOpeningV02, Optional<AgreedRate1>>() {
		{
			xmlTag = "AgrdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreedRate";
			definition = "Specifies the rate of the non deliverable trade which is cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AgreedRate1.mmObject();
		}

		@Override
		public Optional<AgreedRate1> getValue(CancelNonDeliverableForwardOpeningV02 obj) {
			return obj.getAgreedRate();
		}

		@Override
		public void setValue(CancelNonDeliverableForwardOpeningV02 obj, Optional<AgreedRate1> value) {
			obj.setAgreedRate(value.orElse(null));
		}
	};
	@XmlElement(name = "ValtnConds")
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
	 * "Specifies the valuation conditions of the non deliverable trade which is cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CancelNonDeliverableForwardOpeningV02, Optional<NonDeliverableForwardValuationConditions2>> mmValuationConditions = new MMMessageBuildingBlock<CancelNonDeliverableForwardOpeningV02, Optional<NonDeliverableForwardValuationConditions2>>() {
		{
			xmlTag = "ValtnConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationConditions";
			definition = "Specifies the valuation conditions of the non deliverable trade which is cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NonDeliverableForwardValuationConditions2.mmObject();
		}

		@Override
		public Optional<NonDeliverableForwardValuationConditions2> getValue(CancelNonDeliverableForwardOpeningV02 obj) {
			return obj.getValuationConditions();
		}

		@Override
		public void setValue(CancelNonDeliverableForwardOpeningV02 obj, Optional<NonDeliverableForwardValuationConditions2> value) {
			obj.setValuationConditions(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancelNonDeliverableForwardOpeningV02";
				definition = "Scope\r\nThe CancelNonDeliverableForwardOpening message is sent by a participant to a central system or to a counterparty to notify the cancellation of the opening of a non deliverable trade previously confirmed by the sender.\r\nUsage\r\nThe message will contain a Related Reference to link it to the previously sent notification. It may contain a reason for cancellation.";
				messageSet_lazy = () -> Arrays.asList(ForexNotificationsISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CclNDFOpngV02";
				businessArea_lazy = () -> TreasuryArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02.mmTradeInformation,
						com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02.mmTradingSideIdentification, com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02.mmCounterpartySideIdentification,
						com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02.mmTradeAmounts, com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02.mmAgreedRate,
						com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02.mmValuationConditions);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "trea";
						messageFunctionality = "003";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CancelNonDeliverableForwardOpeningV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradeAgreement2 getTradeInformation() {
		return tradeInformation;
	}

	public CancelNonDeliverableForwardOpeningV02 setTradeInformation(TradeAgreement2 tradeInformation) {
		this.tradeInformation = Objects.requireNonNull(tradeInformation);
		return this;
	}

	public Optional<TradePartyIdentification3> getTradingSideIdentification() {
		return tradingSideIdentification == null ? Optional.empty() : Optional.of(tradingSideIdentification);
	}

	public CancelNonDeliverableForwardOpeningV02 setTradingSideIdentification(TradePartyIdentification3 tradingSideIdentification) {
		this.tradingSideIdentification = tradingSideIdentification;
		return this;
	}

	public Optional<TradePartyIdentification3> getCounterpartySideIdentification() {
		return counterpartySideIdentification == null ? Optional.empty() : Optional.of(counterpartySideIdentification);
	}

	public CancelNonDeliverableForwardOpeningV02 setCounterpartySideIdentification(TradePartyIdentification3 counterpartySideIdentification) {
		this.counterpartySideIdentification = counterpartySideIdentification;
		return this;
	}

	public Optional<AmountsAndValueDate1> getTradeAmounts() {
		return tradeAmounts == null ? Optional.empty() : Optional.of(tradeAmounts);
	}

	public CancelNonDeliverableForwardOpeningV02 setTradeAmounts(AmountsAndValueDate1 tradeAmounts) {
		this.tradeAmounts = tradeAmounts;
		return this;
	}

	public Optional<AgreedRate1> getAgreedRate() {
		return agreedRate == null ? Optional.empty() : Optional.of(agreedRate);
	}

	public CancelNonDeliverableForwardOpeningV02 setAgreedRate(AgreedRate1 agreedRate) {
		this.agreedRate = agreedRate;
		return this;
	}

	public Optional<NonDeliverableForwardValuationConditions2> getValuationConditions() {
		return valuationConditions == null ? Optional.empty() : Optional.of(valuationConditions);
	}

	public CancelNonDeliverableForwardOpeningV02 setValuationConditions(NonDeliverableForwardValuationConditions2 valuationConditions) {
		this.valuationConditions = valuationConditions;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.003.001.02")
	static public class Document {
		@XmlElement(name = "CclNDFOpngV02", required = true)
		public CancelNonDeliverableForwardOpeningV02 messageBody;
	}
}