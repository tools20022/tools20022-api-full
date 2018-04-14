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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.CustomerHandlingInstructionChoice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * National Asociation Of Securities Dealers (NASD) regulatory requirement
 * (provides information about the time is order was received and executed).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup#mmTradeRegulatoryTimeStamp
 * TradeRegulatoryTimeStampGroup.mmTradeRegulatoryTimeStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup#mmTradeRegulatoryTimeStampType
 * TradeRegulatoryTimeStampGroup.mmTradeRegulatoryTimeStampType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup#mmTradeRegulatoryTimeStampOrigin
 * TradeRegulatoryTimeStampGroup.mmTradeRegulatoryTimeStampOrigin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup#mmDeskType
 * TradeRegulatoryTimeStampGroup.mmDeskType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup#mmDeskTypeSource
 * TradeRegulatoryTimeStampGroup.mmDeskTypeSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup#mmDeskOrderHandlingInstructions
 * TradeRegulatoryTimeStampGroup.mmDeskOrderHandlingInstructions}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeRegulatoryTimeStampGroup"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "National Asociation Of Securities Dealers (NASD) regulatory requirement (provides information about the time is order was received and executed)."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2018</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TradeRegulatoryTimeStampGroup", propOrder = {"tradeRegulatoryTimeStamp", "tradeRegulatoryTimeStampType", "tradeRegulatoryTimeStampOrigin", "deskType", "deskTypeSource", "deskOrderHandlingInstructions"})
public class TradeRegulatoryTimeStampGroup {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradRgltryTmStmp")
	protected ISODateTime tradeRegulatoryTimeStamp;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup
	 * TradeRegulatoryTimeStampGroup}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradRgltryTmStmp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulatoryTimeStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Traded / Regulatory timestamp value. Used to store time information required by government regulators or self regulatory organizations (such as an exchange or clearing house)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 769</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeRegulatoryTimeStampGroup, Optional<ISODateTime>> mmTradeRegulatoryTimeStamp = new MMMessageAttribute<TradeRegulatoryTimeStampGroup, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmObject();
			isDerived = false;
			xmlTag = "TradRgltryTmStmp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "769"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulatoryTimeStamp";
			definition = "Traded / Regulatory timestamp value. Used to store time information required by government regulators or self regulatory organizations (such as an exchange or clearing house).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(TradeRegulatoryTimeStampGroup obj) {
			return obj.getTradeRegulatoryTimeStamp();
		}

		@Override
		public void setValue(TradeRegulatoryTimeStampGroup obj, Optional<ISODateTime> value) {
			obj.setTradeRegulatoryTimeStamp(value.orElse(null));
		}
	};
	@XmlElement(name = "TradRgltryTmStmpTp")
	protected Max35Text tradeRegulatoryTimeStampType;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup
	 * TradeRegulatoryTimeStampGroup}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradRgltryTmStmpTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulatoryTimeStampType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Traded / Regulatory timestamp type (eg, ExecutionTime, Time In, Time Out, BrokerReceipt, BrokerExecution, Desk receipt)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 770</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeRegulatoryTimeStampGroup, Optional<Max35Text>> mmTradeRegulatoryTimeStampType = new MMMessageAttribute<TradeRegulatoryTimeStampGroup, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmObject();
			isDerived = false;
			xmlTag = "TradRgltryTmStmpTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "770"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulatoryTimeStampType";
			definition = "Traded / Regulatory timestamp type (eg, ExecutionTime, Time In, Time Out, BrokerReceipt, BrokerExecution, Desk receipt).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeRegulatoryTimeStampGroup obj) {
			return obj.getTradeRegulatoryTimeStampType();
		}

		@Override
		public void setValue(TradeRegulatoryTimeStampGroup obj, Optional<Max35Text> value) {
			obj.setTradeRegulatoryTimeStampType(value.orElse(null));
		}
	};
	@XmlElement(name = "TradRgltryTmStmpOrgn", required = true)
	protected Max35Text tradeRegulatoryTimeStampOrigin;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup
	 * TradeRegulatoryTimeStampGroup}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradRgltryTmStmpOrgn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulatoryTimeStampOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the origin of the timestamp."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeRegulatoryTimeStampGroup, Max35Text> mmTradeRegulatoryTimeStampOrigin = new MMMessageAttribute<TradeRegulatoryTimeStampGroup, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmObject();
			isDerived = false;
			xmlTag = "TradRgltryTmStmpOrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulatoryTimeStampOrigin";
			definition = "Provides the origin of the timestamp.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(TradeRegulatoryTimeStampGroup obj) {
			return obj.getTradeRegulatoryTimeStampOrigin();
		}

		@Override
		public void setValue(TradeRegulatoryTimeStampGroup obj, Max35Text value) {
			obj.setTradeRegulatoryTimeStampOrigin(value);
		}
	};
	@XmlElement(name = "DskTp")
	protected Max35Text deskType;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup
	 * TradeRegulatoryTimeStampGroup}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DskTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeskType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of trading desk (eg, Agency, Arbitrage, Derivatives, International, Institutional, Preferred Trading.). Note of applicability: values are required in US futures markets by the Commodity Futures Trading Commission (CFTC) to support computerized trade reconstruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1033</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeRegulatoryTimeStampGroup, Optional<Max35Text>> mmDeskType = new MMMessageAttribute<TradeRegulatoryTimeStampGroup, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmObject();
			isDerived = false;
			xmlTag = "DskTp";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1033"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeskType";
			definition = "Type of trading desk (eg, Agency, Arbitrage, Derivatives, International, Institutional, Preferred Trading.). Note of applicability: values are required in US futures markets by the Commodity Futures Trading Commission (CFTC) to support computerized trade reconstruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeRegulatoryTimeStampGroup obj) {
			return obj.getDeskType();
		}

		@Override
		public void setValue(TradeRegulatoryTimeStampGroup obj, Optional<Max35Text> value) {
			obj.setDeskType(value.orElse(null));
		}
	};
	@XmlElement(name = "DskTpSrc")
	protected Max35Text deskTypeSource;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup
	 * TradeRegulatoryTimeStampGroup}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DskTpSrc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeskTypeSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the desk type source, valid value is NASD OATS."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1034</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeRegulatoryTimeStampGroup, Optional<Max35Text>> mmDeskTypeSource = new MMMessageAttribute<TradeRegulatoryTimeStampGroup, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmObject();
			isDerived = false;
			xmlTag = "DskTpSrc";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1034"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeskTypeSource";
			definition = "Provides the desk type source, valid value is NASD OATS.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(TradeRegulatoryTimeStampGroup obj) {
			return obj.getDeskTypeSource();
		}

		@Override
		public void setValue(TradeRegulatoryTimeStampGroup obj, Optional<Max35Text> value) {
			obj.setDeskTypeSource(value.orElse(null));
		}
	};
	@XmlElement(name = "DskOrdrHdlgInstrs")
	protected CustomerHandlingInstructionChoice deskOrderHandlingInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CustomerHandlingInstructionChoice
	 * CustomerHandlingInstructionChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup
	 * TradeRegulatoryTimeStampGroup}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DskOrdrHdlgInstrs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeskOrderHandlingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Firms that are taking in orders manually but routing for execution electronically and for reporting to the Order Audit Trail System must capture the client's handling instructions.This is intended for compliance reporting only (OATS Phase III regulatory requirement)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 1035</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TradeRegulatoryTimeStampGroup, Optional<CustomerHandlingInstructionChoice>> mmDeskOrderHandlingInstructions = new MMMessageAttribute<TradeRegulatoryTimeStampGroup, Optional<CustomerHandlingInstructionChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmObject();
			isDerived = false;
			xmlTag = "DskOrdrHdlgInstrs";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "1035"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeskOrderHandlingInstructions";
			definition = "Firms that are taking in orders manually but routing for execution electronically and for reporting to the Order Audit Trail System must capture the client's handling instructions.This is intended for compliance reporting only (OATS Phase III regulatory requirement).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CustomerHandlingInstructionChoice.mmObject();
		}

		@Override
		public Optional<CustomerHandlingInstructionChoice> getValue(TradeRegulatoryTimeStampGroup obj) {
			return obj.getDeskOrderHandlingInstructions();
		}

		@Override
		public void setValue(TradeRegulatoryTimeStampGroup obj, Optional<CustomerHandlingInstructionChoice> value) {
			obj.setDeskOrderHandlingInstructions(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmTradeRegulatoryTimeStamp, com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmTradeRegulatoryTimeStampType,
						com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmTradeRegulatoryTimeStampOrigin, com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmDeskType,
						com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmDeskTypeSource, com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmDeskOrderHandlingInstructions);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2018");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TradeRegulatoryTimeStampGroup";
				definition = "National Asociation Of Securities Dealers (NASD) regulatory requirement (provides information about the time is order was received and executed).";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISODateTime> getTradeRegulatoryTimeStamp() {
		return tradeRegulatoryTimeStamp == null ? Optional.empty() : Optional.of(tradeRegulatoryTimeStamp);
	}

	public TradeRegulatoryTimeStampGroup setTradeRegulatoryTimeStamp(ISODateTime tradeRegulatoryTimeStamp) {
		this.tradeRegulatoryTimeStamp = tradeRegulatoryTimeStamp;
		return this;
	}

	public Optional<Max35Text> getTradeRegulatoryTimeStampType() {
		return tradeRegulatoryTimeStampType == null ? Optional.empty() : Optional.of(tradeRegulatoryTimeStampType);
	}

	public TradeRegulatoryTimeStampGroup setTradeRegulatoryTimeStampType(Max35Text tradeRegulatoryTimeStampType) {
		this.tradeRegulatoryTimeStampType = tradeRegulatoryTimeStampType;
		return this;
	}

	public Max35Text getTradeRegulatoryTimeStampOrigin() {
		return tradeRegulatoryTimeStampOrigin;
	}

	public TradeRegulatoryTimeStampGroup setTradeRegulatoryTimeStampOrigin(Max35Text tradeRegulatoryTimeStampOrigin) {
		this.tradeRegulatoryTimeStampOrigin = Objects.requireNonNull(tradeRegulatoryTimeStampOrigin);
		return this;
	}

	public Optional<Max35Text> getDeskType() {
		return deskType == null ? Optional.empty() : Optional.of(deskType);
	}

	public TradeRegulatoryTimeStampGroup setDeskType(Max35Text deskType) {
		this.deskType = deskType;
		return this;
	}

	public Optional<Max35Text> getDeskTypeSource() {
		return deskTypeSource == null ? Optional.empty() : Optional.of(deskTypeSource);
	}

	public TradeRegulatoryTimeStampGroup setDeskTypeSource(Max35Text deskTypeSource) {
		this.deskTypeSource = deskTypeSource;
		return this;
	}

	public Optional<CustomerHandlingInstructionChoice> getDeskOrderHandlingInstructions() {
		return deskOrderHandlingInstructions == null ? Optional.empty() : Optional.of(deskOrderHandlingInstructions);
	}

	public TradeRegulatoryTimeStampGroup setDeskOrderHandlingInstructions(CustomerHandlingInstructionChoice deskOrderHandlingInstructions) {
		this.deskOrderHandlingInstructions = deskOrderHandlingInstructions;
		return this;
	}
}