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
import com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.Header23;
import com.tools20022.repository.msg.MessageIdentification1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TradePartyIdentification7;
import com.tools20022.repository.msgset.FXPostTradeConfirmation;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The ForeignExchangeTradeConfirmationRequestCancellationRequest message is
 * sent from a market participant to a Central matching utility (CMU) to amend
 * the ForeignExchangeTradeConfirmationRequest previously sent.<br>
 * <br>
 * <b>Usage</b><br>
 * The request is sent by the market participants to the CMU after the
 * confirmation is requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.036.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
 * ForeignExchangeTradeLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01#mmHeader
 * ForeignExchangeTradeConfirmationRequestCancellationRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01#mmCancellationRequestIdentification
 * ForeignExchangeTradeConfirmationRequestCancellationRequestV01.
 * mmCancellationRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01#mmTradingSideIdentification
 * ForeignExchangeTradeConfirmationRequestCancellationRequestV01.
 * mmTradingSideIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01#mmCounterpartyRoleIdentification
 * ForeignExchangeTradeConfirmationRequestCancellationRequestV01.
 * mmCounterpartyRoleIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01#mmTradeIdentification
 * ForeignExchangeTradeConfirmationRequestCancellationRequestV01.
 * mmTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01#mmUnderlyingProductType
 * ForeignExchangeTradeConfirmationRequestCancellationRequestV01.
 * mmUnderlyingProductType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01#mmSupplementaryData
 * ForeignExchangeTradeConfirmationRequestCancellationRequestV01.
 * mmSupplementaryData}</li>
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
 * xmlTag} = "FXTradConfReqCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeConfirmationRequestCancellationRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe ForeignExchangeTradeConfirmationRequestCancellationRequest message is sent from a market participant to a Central matching utility (CMU) to amend the ForeignExchangeTradeConfirmationRequest previously sent.\r\n\r\nUsage\r\nThe request is sent by the market participants to the CMU after the confirmation is requested."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ForeignExchangeTradeConfirmationRequestCancellationRequestV01", propOrder = {"header", "cancellationRequestIdentification", "tradingSideIdentification", "counterpartyRoleIdentification", "tradeIdentification",
		"underlyingProductType", "supplementaryData"})
public class ForeignExchangeTradeConfirmationRequestCancellationRequestV01 {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Header"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message management information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestCancellationRequestV01, Header23> mmHeader = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestCancellationRequestV01, Header23>() {
		{
			xmlTag = "Hdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Header";
			definition = "Message management information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Header23.mmObject();
		}

		@Override
		public Header23 getValue(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 obj) {
			return obj.getHeader();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 obj, Header23 value) {
			obj.setHeader(value);
		}
	};
	@XmlElement(name = "CxlReqId")
	protected MessageIdentification1 cancellationRequestIdentification;
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
	 * xmlTag} = "CxlReqId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the cancellation request messge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestCancellationRequestV01, Optional<MessageIdentification1>> mmCancellationRequestIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestCancellationRequestV01, Optional<MessageIdentification1>>() {
		{
			xmlTag = "CxlReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestIdentification";
			definition = "Identifies the cancellation request messge.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public Optional<MessageIdentification1> getValue(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 obj) {
			return obj.getCancellationRequestIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 obj, Optional<MessageIdentification1> value) {
			obj.setCancellationRequestIdentification(value.orElse(null));
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the trading side of the treasury trade which is captured."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestCancellationRequestV01, TradePartyIdentification7> mmTradingSideIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestCancellationRequestV01, TradePartyIdentification7>() {
		{
			xmlTag = "TradgSdId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideIdentification";
			definition = "Specifies the trading side of the treasury trade which is captured.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification7.mmObject();
		}

		@Override
		public TradePartyIdentification7 getValue(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 obj) {
			return obj.getTradingSideIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 obj, TradePartyIdentification7 value) {
			obj.setTradingSideIdentification(value);
		}
	};
	@XmlElement(name = "CtrPtyRoleId", required = true)
	protected TradePartyIdentification7 counterpartyRoleIdentification;
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
	 * xmlTag} = "CtrPtyRoleId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyRoleIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the counterparty side of the treasury trade which is captured."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestCancellationRequestV01, TradePartyIdentification7> mmCounterpartyRoleIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestCancellationRequestV01, TradePartyIdentification7>() {
		{
			xmlTag = "CtrPtyRoleId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyRoleIdentification";
			definition = "Specifies the counterparty side of the treasury trade which is captured.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradePartyIdentification7.mmObject();
		}

		@Override
		public TradePartyIdentification7 getValue(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 obj) {
			return obj.getCounterpartyRoleIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 obj, TradePartyIdentification7 value) {
			obj.setCounterpartyRoleIdentification(value);
		}
	};
	@XmlElement(name = "TradId", required = true)
	protected Max35Text tradeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier of the trade that needs to be cancelled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestCancellationRequestV01, Max35Text> mmTradeIdentification = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestCancellationRequestV01, Max35Text>() {
		{
			xmlTag = "TradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeIdentification";
			definition = "Identifier of the trade that needs to be cancelled.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 obj) {
			return obj.getTradeIdentification();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 obj, Max35Text value) {
			obj.setTradeIdentification(value);
		}
	};
	@XmlElement(name = "UndrlygPdctTp", required = true)
	protected UnderlyingProductIdentifier1Code underlyingProductType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingProductIdentifier1Code
	 * UnderlyingProductIdentifier1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygPdctTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingProductType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the underlying product type."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestCancellationRequestV01, UnderlyingProductIdentifier1Code> mmUnderlyingProductType = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestCancellationRequestV01, UnderlyingProductIdentifier1Code>() {
		{
			xmlTag = "UndrlygPdctTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingProductType";
			definition = "Specifies the underlying product type.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UnderlyingProductIdentifier1Code.mmObject();
		}

		@Override
		public UnderlyingProductIdentifier1Code getValue(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 obj) {
			return obj.getUnderlyingProductType();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 obj, UnderlyingProductIdentifier1Code value) {
			obj.setUnderlyingProductType(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestCancellationRequestV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ForeignExchangeTradeConfirmationRequestCancellationRequestV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ForeignExchangeTradeConfirmationRequestCancellationRequestV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTradeConfirmationRequestCancellationRequestV01";
				definition = "Scope\r\nThe ForeignExchangeTradeConfirmationRequestCancellationRequest message is sent from a market participant to a Central matching utility (CMU) to amend the ForeignExchangeTradeConfirmationRequest previously sent.\r\n\r\nUsage\r\nThe request is sent by the market participants to the CMU after the confirmation is requested.";
				messageSet_lazy = () -> Arrays.asList(FXPostTradeConfirmation.mmObject());
				rootElement = "Document";
				xmlTag = "FXTradConfReqCxlReq";
				businessArea_lazy = () -> ForeignExchangeTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01.mmHeader,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01.mmCancellationRequestIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01.mmTradingSideIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01.mmCounterpartyRoleIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01.mmTradeIdentification,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01.mmUnderlyingProductType,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeConfirmationRequestCancellationRequestV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "fxtr";
						messageFunctionality = "036";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTradeConfirmationRequestCancellationRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Header23 getHeader() {
		return header;
	}

	public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 setHeader(Header23 header) {
		this.header = Objects.requireNonNull(header);
		return this;
	}

	public Optional<MessageIdentification1> getCancellationRequestIdentification() {
		return cancellationRequestIdentification == null ? Optional.empty() : Optional.of(cancellationRequestIdentification);
	}

	public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 setCancellationRequestIdentification(MessageIdentification1 cancellationRequestIdentification) {
		this.cancellationRequestIdentification = cancellationRequestIdentification;
		return this;
	}

	public TradePartyIdentification7 getTradingSideIdentification() {
		return tradingSideIdentification;
	}

	public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 setTradingSideIdentification(TradePartyIdentification7 tradingSideIdentification) {
		this.tradingSideIdentification = Objects.requireNonNull(tradingSideIdentification);
		return this;
	}

	public TradePartyIdentification7 getCounterpartyRoleIdentification() {
		return counterpartyRoleIdentification;
	}

	public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 setCounterpartyRoleIdentification(TradePartyIdentification7 counterpartyRoleIdentification) {
		this.counterpartyRoleIdentification = Objects.requireNonNull(counterpartyRoleIdentification);
		return this;
	}

	public Max35Text getTradeIdentification() {
		return tradeIdentification;
	}

	public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 setTradeIdentification(Max35Text tradeIdentification) {
		this.tradeIdentification = Objects.requireNonNull(tradeIdentification);
		return this;
	}

	public UnderlyingProductIdentifier1Code getUnderlyingProductType() {
		return underlyingProductType;
	}

	public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 setUnderlyingProductType(UnderlyingProductIdentifier1Code underlyingProductType) {
		this.underlyingProductType = Objects.requireNonNull(underlyingProductType);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01")
	static public class Document {
		@XmlElement(name = "FXTradConfReqCxlReq", required = true)
		public ForeignExchangeTradeConfirmationRequestCancellationRequestV01 messageBody;
	}
}