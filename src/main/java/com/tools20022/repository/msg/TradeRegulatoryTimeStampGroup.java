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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.choice.CustomerHandlingInstructionChoice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2018</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeRegulatoryTimeStampGroup"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "National Asociation Of Securities Dealers (NASD) regulatory requirement (provides information about the time is order was received and executed)."
 * </li>
 * </ul>
 */
public class TradeRegulatoryTimeStampGroup {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime tradeRegulatoryTimeStamp;
	/**
	 * Traded / Regulatory timestamp value. Used to store time information
	 * required by government regulators or self regulatory organizations (such
	 * as an exchange or clearing house).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulatoryTimeStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Traded / Regulatory timestamp value. Used to store time information required by government regulators or self regulatory organizations (such as an exchange or clearing house)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeRegulatoryTimeStamp = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeRegulatoryTimeStampGroup.mmObject();
			isDerived = false;
			xmlTag = "TradRgltryTmStmp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulatoryTimeStamp";
			definition = "Traded / Regulatory timestamp value. Used to store time information required by government regulators or self regulatory organizations (such as an exchange or clearing house).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max35Text tradeRegulatoryTimeStampType;
	/**
	 * Traded / Regulatory timestamp type (eg, ExecutionTime, Time In, Time Out,
	 * BrokerReceipt, BrokerExecution, Desk receipt).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulatoryTimeStampType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Traded / Regulatory timestamp type (eg, ExecutionTime, Time In, Time Out, BrokerReceipt, BrokerExecution, Desk receipt)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeRegulatoryTimeStampType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeRegulatoryTimeStampGroup.mmObject();
			isDerived = false;
			xmlTag = "TradRgltryTmStmpTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulatoryTimeStampType";
			definition = "Traded / Regulatory timestamp type (eg, ExecutionTime, Time In, Time Out, BrokerReceipt, BrokerExecution, Desk receipt).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text tradeRegulatoryTimeStampOrigin;
	/**
	 * Provides the origin of the timestamp.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeRegulatoryTimeStampOrigin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the origin of the timestamp."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeRegulatoryTimeStampOrigin = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeRegulatoryTimeStampGroup.mmObject();
			isDerived = false;
			xmlTag = "TradRgltryTmStmpOrgn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeRegulatoryTimeStampOrigin";
			definition = "Provides the origin of the timestamp.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text deskType;
	/**
	 * Type of trading desk (eg, Agency, Arbitrage, Derivatives, International,
	 * Institutional, Preferred Trading,...). Note of applicability: values are
	 * required in US futures markets by the Commodity Futures Trading
	 * Commission (CFTC) to support computerized trade reconstruction.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeskType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of trading desk (eg, Agency, Arbitrage, Derivatives, International, Institutional, Preferred Trading,...). Note of applicability: values are required in US futures markets by the Commodity Futures Trading Commission (CFTC) to support computerized trade reconstruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeskType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeRegulatoryTimeStampGroup.mmObject();
			isDerived = false;
			xmlTag = "DskTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeskType";
			definition = "Type of trading desk (eg, Agency, Arbitrage, Derivatives, International, Institutional, Preferred Trading,...). Note of applicability: values are required in US futures markets by the Commodity Futures Trading Commission (CFTC) to support computerized trade reconstruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text deskTypeSource;
	/**
	 * Provides the desk type source, valid value is NASD OATS.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeskTypeSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the desk type source, valid value is NASD OATS."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeskTypeSource = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeRegulatoryTimeStampGroup.mmObject();
			isDerived = false;
			xmlTag = "DskTpSrc";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeskTypeSource";
			definition = "Provides the desk type source, valid value is NASD OATS.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CustomerHandlingInstructionChoice deskOrderHandlingInstructions;
	/**
	 * Firms that are taking in orders manually but routing for execution
	 * electronically and for reporting to the Order Audit Trail System must
	 * capture the client's handling instructions.This is intended for
	 * compliance reporting only (OATS Phase III regulatory requirement).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeskOrderHandlingInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Firms that are taking in orders manually but routing for execution electronically and for reporting to the Order Audit Trail System must capture the client's handling instructions.This is intended for compliance reporting only (OATS Phase III regulatory requirement)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeskOrderHandlingInstructions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradeRegulatoryTimeStampGroup.mmObject();
			isDerived = false;
			xmlTag = "DskOrdrHdlgInstrs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeskOrderHandlingInstructions";
			definition = "Firms that are taking in orders manually but routing for execution electronically and for reporting to the Order Audit Trail System must capture the client's handling instructions.This is intended for compliance reporting only (OATS Phase III regulatory requirement).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CustomerHandlingInstructionChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmTradeRegulatoryTimeStamp, com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmTradeRegulatoryTimeStampType,
						com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmTradeRegulatoryTimeStampOrigin, com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmDeskType,
						com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmDeskTypeSource, com.tools20022.repository.msg.TradeRegulatoryTimeStampGroup.mmDeskOrderHandlingInstructions);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
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

	public ISODateTime getTradeRegulatoryTimeStamp() {
		return tradeRegulatoryTimeStamp;
	}

	public void setTradeRegulatoryTimeStamp(ISODateTime tradeRegulatoryTimeStamp) {
		this.tradeRegulatoryTimeStamp = tradeRegulatoryTimeStamp;
	}

	public Max35Text getTradeRegulatoryTimeStampType() {
		return tradeRegulatoryTimeStampType;
	}

	public void setTradeRegulatoryTimeStampType(Max35Text tradeRegulatoryTimeStampType) {
		this.tradeRegulatoryTimeStampType = tradeRegulatoryTimeStampType;
	}

	public Max35Text getTradeRegulatoryTimeStampOrigin() {
		return tradeRegulatoryTimeStampOrigin;
	}

	public void setTradeRegulatoryTimeStampOrigin(Max35Text tradeRegulatoryTimeStampOrigin) {
		this.tradeRegulatoryTimeStampOrigin = tradeRegulatoryTimeStampOrigin;
	}

	public Max35Text getDeskType() {
		return deskType;
	}

	public void setDeskType(Max35Text deskType) {
		this.deskType = deskType;
	}

	public Max35Text getDeskTypeSource() {
		return deskTypeSource;
	}

	public void setDeskTypeSource(Max35Text deskTypeSource) {
		this.deskTypeSource = deskTypeSource;
	}

	public CustomerHandlingInstructionChoice getDeskOrderHandlingInstructions() {
		return deskOrderHandlingInstructions;
	}

	public void setDeskOrderHandlingInstructions(CustomerHandlingInstructionChoice deskOrderHandlingInstructions) {
		this.deskOrderHandlingInstructions = deskOrderHandlingInstructions;
	}
}