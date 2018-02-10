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

package com.tools20022.repository.area.fxtr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.ForeignExchangeTradeLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.FXPostTradeConfirmation;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ForeignExchageTradeConfirmationStatusAdvice message is sent from a
 * Central matching utility (CMU) to a market participant to advise the matching
 * status of the trade. <br>
 * <br>
 * <b>Usage</b><br>
 * The confirmation status advice is sent by the CMU to the market participants
 * after they received the confirmation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmHeader
 * ForeignExchangeTradeConfirmationStatusAdviceV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmAdviceIdentification
 * ForeignExchangeTradeConfirmationStatusAdviceV01.mmAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmTradingSideIdentification
 * ForeignExchangeTradeConfirmationStatusAdviceV01.mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmCounterpartySideIdentification
 * ForeignExchangeTradeConfirmationStatusAdviceV01.
 * mmCounterpartySideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmTradeDetail
 * ForeignExchangeTradeConfirmationStatusAdviceV01.mmTradeDetail}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmConfirmationInformation
 * ForeignExchangeTradeConfirmationStatusAdviceV01.mmConfirmationInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmReference
 * ForeignExchangeTradeConfirmationStatusAdviceV01.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01#mmSupplementaryData
 * ForeignExchangeTradeConfirmationStatusAdviceV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.FXPostTradeConfirmation
 * FXPostTradeConfirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FXTradConfStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
 * ForeignExchangeTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.037.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeConfirmationStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ForeignExchageTradeConfirmationStatusAdvice message is sent from a Central matching utility (CMU) to a market participant to advise the matching status of the trade. \r\n\r\nUsage\r\nThe confirmation status advice is sent by the CMU to the market participants after they received the confirmation request."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeTradeConfirmationStatusAdviceV01", propOrder = {"header", "adviceIdentification", "tradingSideIdentification", "counterpartySideIdentification", "tradeDetail", "confirmationInformation", "reference",
		"supplementaryData"})
public class ForeignExchangeTradeConfirmationStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Hdr", required = true)
	protected Header23 header;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Header23
	 * Header23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice message management information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Advice message management information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header23.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeConfirmationStatusAdviceV01.class.getMethod("getHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AdvcId")
	protected MessageIdentification1 adviceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the advice message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdviceIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdviceIdentification";
			definition = "Identifies the advice message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeConfirmationStatusAdviceV01.class.getMethod("getAdviceIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TradgSdId", required = true)
	protected TradePartyIdentification7 tradingSideIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7
	 * TradePartyIdentification7}</li>
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
	 * "Specifies the trading side of the treasury trade which is captured."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradingSideIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Specifies the trading side of the treasury trade which is captured.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeConfirmationStatusAdviceV01.class.getMethod("getTradingSideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CtrPtySdId", required = true)
	protected TradePartyIdentification7 counterpartySideIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TradePartyIdentification7
	 * TradePartyIdentification7}</li>
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
	 * "Specifies the counterparty side of the treasury trade which is captured."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCounterpartySideIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrPtySdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartySideIdentification";
			definition = "Specifies the counterparty side of the treasury trade which is captured.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeConfirmationStatusAdviceV01.class.getMethod("getCounterpartySideIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TradDtl", required = true)
	protected Trade2 tradeDetail;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Trade2 Trade2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the treasury trade confirmed."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeDetail = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradDtl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetail";
			definition = "Details of the treasury trade confirmed.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Trade2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeConfirmationStatusAdviceV01.class.getMethod("getTradeDetail", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "ConfInf", required = true)
	protected Confirmation1 confirmationInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Confirmation1
	 * Confirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the confirmation in the CMU."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmConfirmationInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "ConfInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationInformation";
			definition = "Details of the confirmation in the CMU.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Confirmation1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeConfirmationStatusAdviceV01.class.getMethod("getConfirmationInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Ref")
	protected AdditionalReferences reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReferences
	 * AdditionalReferences}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional reference of this message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Additional reference of this message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReferences.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeConfirmationStatusAdviceV01.class.getMethod("getReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeConfirmationStatusAdviceV01.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTradeConfirmationStatusAdviceV01";
				definition = "Scope\r\nThe ForeignExchageTradeConfirmationStatusAdvice message is sent from a Central matching utility (CMU) to a market participant to advise the matching status of the trade. \r\n\r\nUsage\r\nThe confirmation status advice is sent by the CMU to the market participants after they received the confirmation request.";
				messageSet_lazy = () -> Arrays.asList(FXPostTradeConfirmation.mmObject());
				rootElement = "Document";
				xmlTag = "FXTradConfStsAdvc";
				businessArea_lazy = () -> ForeignExchangeTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01.mmHeader,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01.mmAdviceIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01.mmTradingSideIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01.mmCounterpartySideIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01.mmTradeDetail, com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01.mmConfirmationInformation,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01.mmReference, com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationStatusAdviceV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "fxtr";
						messageFunctionality = "037";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTradeConfirmationStatusAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header23 getHeader() {
		return header;
	}

	public ForeignExchangeTradeConfirmationStatusAdviceV01 setHeader(Header23 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public Optional<MessageIdentification1> getAdviceIdentification() {
		return adviceIdentification == null ? Optional.empty() : Optional.of(adviceIdentification);
	}

	public ForeignExchangeTradeConfirmationStatusAdviceV01 setAdviceIdentification(MessageIdentification1 adviceIdentification) {
		this.adviceIdentification = adviceIdentification;
		return this;
	}

	public TradePartyIdentification7 getTradingSideIdentification() {
		return tradingSideIdentification;
	}

	public ForeignExchangeTradeConfirmationStatusAdviceV01 setTradingSideIdentification(TradePartyIdentification7 tradingSideIdentification) {
		this.tradingSideIdentification = Objects.requireNonNull(tradingSideIdentification);
		return this;
	}

	public TradePartyIdentification7 getCounterpartySideIdentification() {
		return counterpartySideIdentification;
	}

	public ForeignExchangeTradeConfirmationStatusAdviceV01 setCounterpartySideIdentification(TradePartyIdentification7 counterpartySideIdentification) {
		this.counterpartySideIdentification = Objects.requireNonNull(counterpartySideIdentification);
		return this;
	}

	public Trade2 getTradeDetail() {
		return tradeDetail;
	}

	public ForeignExchangeTradeConfirmationStatusAdviceV01 setTradeDetail(Trade2 tradeDetail) {
		this.tradeDetail = Objects.requireNonNull(tradeDetail);
		return this;
	}

	public Confirmation1 getConfirmationInformation() {
		return confirmationInformation;
	}

	public ForeignExchangeTradeConfirmationStatusAdviceV01 setConfirmationInformation(Confirmation1 confirmationInformation) {
		this.confirmationInformation = Objects.requireNonNull(confirmationInformation);
		return this;
	}

	public Optional<AdditionalReferences> getReference() {
		return reference == null ? Optional.empty() : Optional.of(reference);
	}

	public ForeignExchangeTradeConfirmationStatusAdviceV01 setReference(AdditionalReferences reference) {
		this.reference = reference;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ForeignExchangeTradeConfirmationStatusAdviceV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01")
	static public class Document {
		@XmlElement(name = "FXTradConfStsAdvc", required = true)
		public ForeignExchangeTradeConfirmationStatusAdviceV01 messageBody;
	}
}