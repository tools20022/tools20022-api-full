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
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} = {@linkplain com.tools20022.repository.area.TreasuryArchive
 * TreasuryArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ForexNotificationsISOArchive
 * ForexNotificationsISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CretNDFValtnV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CreateNonDeliverableForwardValuationV02", propOrder = {"tradeInformation", "tradingSideIdentification", "counterpartySideIdentification", "tradeAmounts", "valuationInformation", "valuationRate"})
public class CreateNonDeliverableForwardValuationV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected TradeAgreement1 tradeInformation;
	/**
	 * Provides identification and date of the valuation of the non deliverable
	 * trade which is created.
	 * <p>
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
	public static final MMMessageBuildingBlock mmTradeInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeInformation";
			definition = "Provides identification and date of the valuation of the non deliverable trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeAgreement1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreateNonDeliverableForwardValuationV02.class.getMethod("getTradeInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradePartyIdentification3 tradingSideIdentification;
	/**
	 * Specifies the trading side of the valuation of the non deliverable trade
	 * which is created.
	 * <p>
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
	 * "Specifies the trading side of the valuation of the non deliverable trade which is created. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradingSideIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Specifies the trading side of the valuation of the non deliverable trade which is created. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreateNonDeliverableForwardValuationV02.class.getMethod("getTradingSideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TradePartyIdentification3 counterpartySideIdentification;
	/**
	 * Specifies the counterparty of the valuation of the non deliverable trade
	 * which is created.
	 * <p>
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
	 * "Specifies the counterparty of the valuation of the non deliverable trade which is created. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCounterpartySideIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrPtySdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideIdentification";
			definition = "Specifies the counterparty of the valuation of the non deliverable trade which is created. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreateNonDeliverableForwardValuationV02.class.getMethod("getCounterpartySideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AmountsAndValueDate1 tradeAmounts;
	/**
	 * Specifies the amounts of the valuation of the non deliverable trade which
	 * is created.
	 * <p>
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
	 * "Specifies the amounts of the valuation of the non deliverable trade which is created. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeAmounts = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmounts";
			definition = "Specifies the amounts of the valuation of the non deliverable trade which is created. ";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountsAndValueDate1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreateNonDeliverableForwardValuationV02.class.getMethod("getTradeAmounts", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ValuationData2 valuationInformation;
	/**
	 * Specifies the valuation information of the valuation of the non
	 * deliverable trade which is created.
	 * <p>
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
	public static final MMMessageBuildingBlock mmValuationInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "ValtnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationInformation";
			definition = "Specifies the valuation information of the valuation of the non deliverable trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ValuationData2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreateNonDeliverableForwardValuationV02.class.getMethod("getValuationInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AgreedRate1 valuationRate;
	/**
	 * Specifies the valuation rate of the valuation of the non deliverable
	 * trade which is created.
	 * <p>
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
	public static final MMMessageBuildingBlock mmValuationRate = new MMMessageBuildingBlock() {
		{
			xmlTag = "ValtnRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValuationRate";
			definition = "Specifies the valuation rate of the valuation of the non deliverable trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AgreedRate1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return CreateNonDeliverableForwardValuationV02.class.getMethod("getValuationRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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

	@XmlElement(name = "TradInf", required = true)
	public TradeAgreement1 getTradeInformation() {
		return tradeInformation;
	}

	public void setTradeInformation(TradeAgreement1 tradeInformation) {
		this.tradeInformation = tradeInformation;
	}

	@XmlElement(name = "TradgSdId", required = true)
	public TradePartyIdentification3 getTradingSideIdentification() {
		return tradingSideIdentification;
	}

	public void setTradingSideIdentification(TradePartyIdentification3 tradingSideIdentification) {
		this.tradingSideIdentification = tradingSideIdentification;
	}

	@XmlElement(name = "CtrPtySdId", required = true)
	public TradePartyIdentification3 getCounterpartySideIdentification() {
		return counterpartySideIdentification;
	}

	public void setCounterpartySideIdentification(TradePartyIdentification3 counterpartySideIdentification) {
		this.counterpartySideIdentification = counterpartySideIdentification;
	}

	@XmlElement(name = "TradAmts", required = true)
	public AmountsAndValueDate1 getTradeAmounts() {
		return tradeAmounts;
	}

	public void setTradeAmounts(AmountsAndValueDate1 tradeAmounts) {
		this.tradeAmounts = tradeAmounts;
	}

	@XmlElement(name = "ValtnInf", required = true)
	public ValuationData2 getValuationInformation() {
		return valuationInformation;
	}

	public void setValuationInformation(ValuationData2 valuationInformation) {
		this.valuationInformation = valuationInformation;
	}

	@XmlElement(name = "ValtnRate", required = true)
	public AgreedRate1 getValuationRate() {
		return valuationRate;
	}

	public void setValuationRate(AgreedRate1 valuationRate) {
		this.valuationRate = valuationRate;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:trea.004.02.02")
	static public class Document {
		@XmlElement(name = "CretNDFValtnV02", required = true)
		public CreateNonDeliverableForwardValuationV02 messageBody;
	}
}