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
import com.tools20022.repository.msg.Option3;
import com.tools20022.repository.msg.TradeAgreement1;
import com.tools20022.repository.msg.TradePartyIdentification4;
import com.tools20022.repository.msgset.ForexNotificationsISOArchive;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The CreateForeignExchangeOption message is sent by a participant to a central
 * system or to a counterparty to confirm a foreign currency option contract.<br>
 * <b>Usage</b><br>
 * Both trading parties will send a notification to the central settlement
 * system. The central settlement system will then send a
 * ForeignExchangeOptionNotification to both.<br>
 * This message is only suitable for Simple (i.e. not Barrier) Vanilla (i.e. not
 * Binary, Digital, Notouch) Foreign Exchange Options.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateForeignExchangeOptionV02#mmTradeInformation
 * CreateForeignExchangeOptionV02.mmTradeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateForeignExchangeOptionV02#mmTradingSideIdentification
 * CreateForeignExchangeOptionV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateForeignExchangeOptionV02#mmCounterpartySideIdentification
 * CreateForeignExchangeOptionV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateForeignExchangeOptionV02#mmOption
 * CreateForeignExchangeOptionV02.mmOption}</li>
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
 * xmlTag} = "CretFXOptnV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} = {@linkplain com.tools20022.repository.area.TreasuryArchive
 * TreasuryArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code trea.009.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CreateForeignExchangeOptionV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe CreateForeignExchangeOption message is sent by a participant to a central system or to a counterparty to confirm a foreign currency option contract.\r\nUsage\r\nBoth trading parties will send a notification to the central settlement system. The central settlement system will then send a ForeignExchangeOptionNotification to both.\r\nThis message is only suitable for Simple (i.e. not Barrier) Vanilla (i.e. not Binary, Digital, Notouch) Foreign Exchange Options."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CreateForeignExchangeOptionV02", propOrder = {"tradeInformation", "tradingSideIdentification", "counterpartySideIdentification", "option"})
public class CreateForeignExchangeOptionV02 {

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
	 * "Provides identification and date of the foreign exchange option trade which is created."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CreateForeignExchangeOptionV02, TradeAgreement1> mmTradeInformation = new MMMessageBuildingBlock<CreateForeignExchangeOptionV02, TradeAgreement1>() {
		{
			xmlTag = "TradInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeInformation";
			definition = "Provides identification and date of the foreign exchange option trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeAgreement1.mmObject();
		}

		@Override
		public TradeAgreement1 getValue(CreateForeignExchangeOptionV02 obj) {
			return obj.getTradeInformation();
		}

		@Override
		public void setValue(CreateForeignExchangeOptionV02 obj, TradeAgreement1 value) {
			obj.setTradeInformation(value);
		}
	};
	@XmlElement(name = "TradgSdId", required = true)
	protected TradePartyIdentification4 tradingSideIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4
	 * TradePartyIdentification4}</li>
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
	 * "Specifies the trading side of the currency option trade which is created."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CreateForeignExchangeOptionV02, TradePartyIdentification4> mmTradingSideIdentification = new MMMessageBuildingBlock<CreateForeignExchangeOptionV02, TradePartyIdentification4>() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Specifies the trading side of the currency option trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification4.mmObject();
		}

		@Override
		public TradePartyIdentification4 getValue(CreateForeignExchangeOptionV02 obj) {
			return obj.getTradingSideIdentification();
		}

		@Override
		public void setValue(CreateForeignExchangeOptionV02 obj, TradePartyIdentification4 value) {
			obj.setTradingSideIdentification(value);
		}
	};
	@XmlElement(name = "CtrPtySdId", required = true)
	protected TradePartyIdentification4 counterpartySideIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification4
	 * TradePartyIdentification4}</li>
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
	 * "Specifies the counterparty of the currency option trade which is created."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CreateForeignExchangeOptionV02, TradePartyIdentification4> mmCounterpartySideIdentification = new MMMessageBuildingBlock<CreateForeignExchangeOptionV02, TradePartyIdentification4>() {
		{
			xmlTag = "CtrPtySdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideIdentification";
			definition = "Specifies the counterparty of the currency option trade which is created.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification4.mmObject();
		}

		@Override
		public TradePartyIdentification4 getValue(CreateForeignExchangeOptionV02 obj) {
			return obj.getCounterpartySideIdentification();
		}

		@Override
		public void setValue(CreateForeignExchangeOptionV02 obj, TradePartyIdentification4 value) {
			obj.setCounterpartySideIdentification(value);
		}
	};
	@XmlElement(name = "Optn", required = true)
	protected Option3 option;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Option3 Option3}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Optn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the parameters of the currency option which is sold by the trading side."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CreateForeignExchangeOptionV02, Option3> mmOption = new MMMessageBuildingBlock<CreateForeignExchangeOptionV02, Option3>() {
		{
			xmlTag = "Optn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			definition = "Specifies the parameters of the currency option which is sold by the trading side.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Option3.mmObject();
		}

		@Override
		public Option3 getValue(CreateForeignExchangeOptionV02 obj) {
			return obj.getOption();
		}

		@Override
		public void setValue(CreateForeignExchangeOptionV02 obj, Option3 value) {
			obj.setOption(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CreateForeignExchangeOptionV02";
				definition = "Scope\r\nThe CreateForeignExchangeOption message is sent by a participant to a central system or to a counterparty to confirm a foreign currency option contract.\r\nUsage\r\nBoth trading parties will send a notification to the central settlement system. The central settlement system will then send a ForeignExchangeOptionNotification to both.\r\nThis message is only suitable for Simple (i.e. not Barrier) Vanilla (i.e. not Binary, Digital, Notouch) Foreign Exchange Options.";
				messageSet_lazy = () -> Arrays.asList(ForexNotificationsISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "CretFXOptnV02";
				businessArea_lazy = () -> TreasuryArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.trea.CreateForeignExchangeOptionV02.mmTradeInformation,
						com.tools20022.repository.area.trea.CreateForeignExchangeOptionV02.mmTradingSideIdentification, com.tools20022.repository.area.trea.CreateForeignExchangeOptionV02.mmCounterpartySideIdentification,
						com.tools20022.repository.area.trea.CreateForeignExchangeOptionV02.mmOption);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "trea";
						messageFunctionality = "009";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CreateForeignExchangeOptionV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradeAgreement1 getTradeInformation() {
		return tradeInformation;
	}

	public CreateForeignExchangeOptionV02 setTradeInformation(TradeAgreement1 tradeInformation) {
		this.tradeInformation = Objects.requireNonNull(tradeInformation);
		return this;
	}

	public TradePartyIdentification4 getTradingSideIdentification() {
		return tradingSideIdentification;
	}

	public CreateForeignExchangeOptionV02 setTradingSideIdentification(TradePartyIdentification4 tradingSideIdentification) {
		this.tradingSideIdentification = Objects.requireNonNull(tradingSideIdentification);
		return this;
	}

	public TradePartyIdentification4 getCounterpartySideIdentification() {
		return counterpartySideIdentification;
	}

	public CreateForeignExchangeOptionV02 setCounterpartySideIdentification(TradePartyIdentification4 counterpartySideIdentification) {
		this.counterpartySideIdentification = Objects.requireNonNull(counterpartySideIdentification);
		return this;
	}

	public Option3 getOption() {
		return option;
	}

	public CreateForeignExchangeOptionV02 setOption(Option3 option) {
		this.option = Objects.requireNonNull(option);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.009.001.02")
	static public class Document {
		@XmlElement(name = "CretFXOptnV02", required = true)
		public CreateForeignExchangeOptionV02 messageBody;
	}
}