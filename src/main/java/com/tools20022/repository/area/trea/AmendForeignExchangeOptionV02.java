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
import com.tools20022.repository.msg.TradeAgreement2;
import com.tools20022.repository.msg.TradePartyIdentification4;
import com.tools20022.repository.msgset.ForexNotificationsISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The AmendForeignExchangeOption message is sent by a participant to a central
 * system or to a counterparty to notify the amendment of a foreign currency
 * option contract.<br>
 * <b>Usage</b><br>
 * The message contains a Related Reference to link it to the previously sent
 * notification and may contain an reason for amendment.<br>
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
 * {@linkplain com.tools20022.repository.area.trea.AmendForeignExchangeOptionV02#mmTradeInformation
 * AmendForeignExchangeOptionV02.mmTradeInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendForeignExchangeOptionV02#mmTradingSideIdentification
 * AmendForeignExchangeOptionV02.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendForeignExchangeOptionV02#mmCounterpartySideIdentification
 * AmendForeignExchangeOptionV02.mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendForeignExchangeOptionV02#mmOption
 * AmendForeignExchangeOptionV02.mmOption}</li>
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
 * xmlTag} = "AmdFXOptnV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} = {@linkplain com.tools20022.repository.area.TreasuryArchive
 * TreasuryArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code trea.010.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmendForeignExchangeOptionV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AmendForeignExchangeOption message is sent by a participant to a central system or to a counterparty to notify the amendment of a foreign currency option contract.\r\nUsage\r\nThe message contains a Related Reference to link it to the previously sent notification and may contain an reason for amendment.\r\nThis message is only suitable for Simple (i.e. not Barrier) Vanilla (i.e. not Binary, Digital, Notouch) Foreign Exchange Options."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmendForeignExchangeOptionV02", propOrder = {"tradeInformation", "tradingSideIdentification", "counterpartySideIdentification", "option"})
public class AmendForeignExchangeOptionV02 {

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
	 * "Provides reference and date of the foreign exchange option trade which is amended."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeInformation";
			definition = "Provides reference and date of the foreign exchange option trade which is amended.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeAgreement2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmendForeignExchangeOptionV02.class.getMethod("getTradeInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * "Specifies the trading side of the currency option trade which is amended."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradingSideIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Specifies the trading side of the currency option trade which is amended.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmendForeignExchangeOptionV02.class.getMethod("getTradingSideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * "Specifies the counterparty of the currency option trade which is amended."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCounterpartySideIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrPtySdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideIdentification";
			definition = "Specifies the counterparty of the currency option trade which is amended.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmendForeignExchangeOptionV02.class.getMethod("getCounterpartySideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * "Specifies the parameters of the currency option which is bought by the trading side."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOption = new MMMessageBuildingBlock() {
		{
			xmlTag = "Optn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			definition = "Specifies the parameters of the currency option which is bought by the trading side.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Option3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AmendForeignExchangeOptionV02.class.getMethod("getOption", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmendForeignExchangeOptionV02";
				definition = "Scope\r\nThe AmendForeignExchangeOption message is sent by a participant to a central system or to a counterparty to notify the amendment of a foreign currency option contract.\r\nUsage\r\nThe message contains a Related Reference to link it to the previously sent notification and may contain an reason for amendment.\r\nThis message is only suitable for Simple (i.e. not Barrier) Vanilla (i.e. not Binary, Digital, Notouch) Foreign Exchange Options.";
				messageSet_lazy = () -> Arrays.asList(ForexNotificationsISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AmdFXOptnV02";
				businessArea_lazy = () -> TreasuryArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.trea.AmendForeignExchangeOptionV02.mmTradeInformation,
						com.tools20022.repository.area.trea.AmendForeignExchangeOptionV02.mmTradingSideIdentification, com.tools20022.repository.area.trea.AmendForeignExchangeOptionV02.mmCounterpartySideIdentification,
						com.tools20022.repository.area.trea.AmendForeignExchangeOptionV02.mmOption);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "trea";
						messageFunctionality = "010";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AmendForeignExchangeOptionV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TradeAgreement2 getTradeInformation() {
		return tradeInformation;
	}

	public AmendForeignExchangeOptionV02 setTradeInformation(TradeAgreement2 tradeInformation) {
		this.tradeInformation = Objects.requireNonNull(tradeInformation);
		return this;
	}

	public TradePartyIdentification4 getTradingSideIdentification() {
		return tradingSideIdentification;
	}

	public AmendForeignExchangeOptionV02 setTradingSideIdentification(TradePartyIdentification4 tradingSideIdentification) {
		this.tradingSideIdentification = Objects.requireNonNull(tradingSideIdentification);
		return this;
	}

	public TradePartyIdentification4 getCounterpartySideIdentification() {
		return counterpartySideIdentification;
	}

	public AmendForeignExchangeOptionV02 setCounterpartySideIdentification(TradePartyIdentification4 counterpartySideIdentification) {
		this.counterpartySideIdentification = Objects.requireNonNull(counterpartySideIdentification);
		return this;
	}

	public Option3 getOption() {
		return option;
	}

	public AmendForeignExchangeOptionV02 setOption(Option3 option) {
		this.option = Objects.requireNonNull(option);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.010.001.02")
	static public class Document {
		@XmlElement(name = "AmdFXOptnV02", required = true)
		public AmendForeignExchangeOptionV02 messageBody;
	}
}