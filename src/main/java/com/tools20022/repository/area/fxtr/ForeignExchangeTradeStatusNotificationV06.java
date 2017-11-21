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
import com.tools20022.repository.msg.RegulatoryReporting6;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TradeData15;
import com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion;
import com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017;
import com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * Scope <br>
 * The ForeignExchangeTradeStatusNotification message is sent by a central
 * system to the participant to notify the current status of a foreign exchange
 * trade in the system. <br>
 * Usage <br>
 * This ForeignExchangeTradeStatusNotification message will be sent at specific
 * times agreed upon by the central settlement system and a participant in a
 * central settlement system.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.ForeignExchangeTradeLatestVersion
 * ForeignExchangeTradeLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeISOLatestversion
 * PostTradeForeignExchangeISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017
 * PostTradeForeignExchangeMaintenance20162017}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.PostTradeForeignExchangeMaintenance20162017andSupplement
 * PostTradeForeignExchangeMaintenance20162017andSupplement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "FXTradStsNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusNotificationV06#mmTradeData
 * ForeignExchangeTradeStatusNotificationV06.mmTradeData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusNotificationV06#mmRegulatoryReporting
 * ForeignExchangeTradeStatusNotificationV06.mmRegulatoryReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusNotificationV06#mmSupplementaryData
 * ForeignExchangeTradeStatusNotificationV06.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code fxtr.008.001.06}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ForeignExchangeTradeStatusNotificationV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\r\nThe ForeignExchangeTradeStatusNotification message is sent by a central system to the participant to notify the current status of a foreign exchange trade in the system.\r\r\nUsage\r\r\nThis ForeignExchangeTradeStatusNotification message will be sent at specific times agreed upon by the central settlement system and a participant in a central settlement system."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ForeignExchangeTradeStatusNotificationV06", propOrder = {"tradeData", "regulatoryReporting", "supplementaryData"})
public class ForeignExchangeTradeStatusNotificationV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected TradeData15 tradeData;
	/**
	 * Provides information on the status of a trade in a system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.TradeData15
	 * TradeData15}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information on the status of a trade in a system."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTradeData = new MMMessageBuildingBlock() {
		{
			xmlTag = "TradData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeData";
			definition = "Provides information on the status of a trade in a system.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TradeData15.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeStatusNotificationV06.class.getMethod("getTradeData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected RegulatoryReporting6 regulatoryReporting;
	/**
	 * Information that is to be provided to trade repositories in the context
	 * of the regulatory standards around over-the-counter (OTC) derivatives,
	 * central counterparties and trade repositories.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryReporting6
	 * RegulatoryReporting6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RgltryRptg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulatoryReporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that is to be provided to trade repositories in the context of the regulatory standards around over-the-counter (OTC) derivatives, central counterparties and trade repositories."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRegulatoryReporting = new MMMessageBuildingBlock() {
		{
			xmlTag = "RgltryRptg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulatoryReporting";
			definition = "Information that is to be provided to trade repositories in the context of the regulatory standards around over-the-counter (OTC) derivatives, central counterparties and trade repositories.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegulatoryReporting6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ForeignExchangeTradeStatusNotificationV06.class.getMethod("getRegulatoryReporting", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
				return ForeignExchangeTradeStatusNotificationV06.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ForeignExchangeTradeStatusNotificationV06";
				definition = "Scope\r\r\nThe ForeignExchangeTradeStatusNotification message is sent by a central system to the participant to notify the current status of a foreign exchange trade in the system.\r\r\nUsage\r\r\nThis ForeignExchangeTradeStatusNotification message will be sent at specific times agreed upon by the central settlement system and a participant in a central settlement system.";
				messageSet_lazy = () -> Arrays.asList(PostTradeForeignExchangeISOLatestversion.mmObject(), PostTradeForeignExchangeMaintenance20162017.mmObject(), PostTradeForeignExchangeMaintenance20162017andSupplement.mmObject());
				rootElement = "Document";
				xmlTag = "FXTradStsNtfctn";
				businessArea_lazy = () -> ForeignExchangeTradeLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusNotificationV06.mmTradeData,
						com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusNotificationV06.mmRegulatoryReporting, com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusNotificationV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "fxtr";
						messageFunctionality = "008";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ForeignExchangeTradeStatusNotificationV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TradData", required = true)
	public TradeData15 getTradeData() {
		return tradeData;
	}

	public void setTradeData(TradeData15 tradeData) {
		this.tradeData = tradeData;
	}

	@XmlElement(name = "RgltryRptg")
	public RegulatoryReporting6 getRegulatoryReporting() {
		return regulatoryReporting;
	}

	public void setRegulatoryReporting(RegulatoryReporting6 regulatoryReporting) {
		this.regulatoryReporting = regulatoryReporting;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:fxtr.008.06.06")
	static public class Document {
		@XmlElement(name = "FXTradStsNtfctn", required = true)
		public ForeignExchangeTradeStatusNotificationV06 messageBody;
	}
}