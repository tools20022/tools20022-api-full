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

package com.tools20022.repository.area.secl;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesClearingLatestVersion;
import com.tools20022.repository.choice.PartyIdentification35Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.BuyIn2;
import com.tools20022.repository.msg.SettlementObligation7;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CentralCounterPartyCCPSecuritiesClearingISOLatestversion;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Buy In Confirmation message is sent by the central counterparty (CCP) to
 * the clearing member to confirm the details of the transaction resulting from
 * the buy in.<br>
 * <br>
 * The message definition is intended for use with the ISO 20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * The Buy In Confirmation message is sent by the central counterparty (CCP) to
 * confirm the details of the buy in transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesClearingLatestVersion
 * SecuritiesClearingLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CentralCounterPartyCCPSecuritiesClearingISOLatestversion
 * CentralCounterPartyCCPSecuritiesClearingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "BuyInConf"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInConfirmationV03#mmTransactionIdentification
 * BuyInConfirmationV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInConfirmationV03#mmClearingMember
 * BuyInConfirmationV03.mmClearingMember}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInConfirmationV03#mmBuyInDetails
 * BuyInConfirmationV03.mmBuyInDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInConfirmationV03#mmOriginalSettlementObligation
 * BuyInConfirmationV03.mmOriginalSettlementObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.secl.BuyInConfirmationV03#mmSupplementaryData
 * BuyInConfirmationV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code secl.009.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BuyInConfirmationV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Buy In Confirmation message is sent by the central counterparty (CCP) to the clearing member to confirm the details of the transaction resulting from the buy in.\r\n\r\nThe message definition is intended for use with the ISO 20022 Business Application Header.\r\n\r\nUsage\r\nThe Buy In Confirmation message is sent by the central counterparty (CCP) to confirm the details of the buy in transaction."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "BuyInConfirmationV03", propOrder = {"transactionIdentification", "clearingMember", "buyInDetails", "originalSettlementObligation", "supplementaryData"})
public class BuyInConfirmationV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected Max35Text transactionIdentification;
	/**
	 * Unambiguous identification of the transaction as known by the instructing
	 * party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the instructing party.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyInConfirmationV03.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification35Choice clearingMember;
	/**
	 * Provides the identification of the clearing member (individual clearing
	 * member or general clearing member).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification35Choice
	 * PartyIdentification35Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClrMmb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the identification of the clearing member (individual clearing member or general clearing member)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmClearingMember = new MMMessageBuildingBlock() {
		{
			xmlTag = "ClrMmb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingMember";
			definition = "Provides the identification of the clearing member (individual clearing member or general clearing member).";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification35Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyInConfirmationV03.class.getMethod("getClearingMember", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected BuyIn2 buyInDetails;
	/**
	 * Provides the buy-in details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.BuyIn2 BuyIn2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyInDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyInDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the buy-in details."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBuyInDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "BuyInDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyInDetails";
			definition = "Provides the buy-in details.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BuyIn2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyInConfirmationV03.class.getMethod("getBuyInDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected SettlementObligation7 originalSettlementObligation;
	/**
	 * Provides details about the original settlement obligation that did not
	 * settle and for which the buy in process will be launched.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SettlementObligation7
	 * SettlementObligation7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlSttlmOblgtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalSettlementObligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the original settlement obligation that did not settle and for which the buy in process will be launched."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOriginalSettlementObligation = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgnlSttlmOblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalSettlementObligation";
			definition = "Provides details about the original settlement obligation that did not settle and for which the buy in process will be launched.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementObligation7.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyInConfirmationV03.class.getMethod("getOriginalSettlementObligation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that can not be captured in the structured fields
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
	 * "Additional information that can not be captured in the structured fields and/or any other specific block. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block. ";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return BuyInConfirmationV03.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BuyInConfirmationV03";
				definition = "Scope\r\nThe Buy In Confirmation message is sent by the central counterparty (CCP) to the clearing member to confirm the details of the transaction resulting from the buy in.\r\n\r\nThe message definition is intended for use with the ISO 20022 Business Application Header.\r\n\r\nUsage\r\nThe Buy In Confirmation message is sent by the central counterparty (CCP) to confirm the details of the buy in transaction.";
				messageSet_lazy = () -> Arrays.asList(CentralCounterPartyCCPSecuritiesClearingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "BuyInConf";
				businessArea_lazy = () -> SecuritiesClearingLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.secl.BuyInConfirmationV03.mmTransactionIdentification, com.tools20022.repository.area.secl.BuyInConfirmationV03.mmClearingMember,
						com.tools20022.repository.area.secl.BuyInConfirmationV03.mmBuyInDetails, com.tools20022.repository.area.secl.BuyInConfirmationV03.mmOriginalSettlementObligation,
						com.tools20022.repository.area.secl.BuyInConfirmationV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "secl";
						messageFunctionality = "009";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return BuyInConfirmationV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxId")
	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "ClrMmb", required = true)
	public PartyIdentification35Choice getClearingMember() {
		return clearingMember;
	}

	public void setClearingMember(PartyIdentification35Choice clearingMember) {
		this.clearingMember = clearingMember;
	}

	@XmlElement(name = "BuyInDtls", required = true)
	public BuyIn2 getBuyInDetails() {
		return buyInDetails;
	}

	public void setBuyInDetails(BuyIn2 buyInDetails) {
		this.buyInDetails = buyInDetails;
	}

	@XmlElement(name = "OrgnlSttlmOblgtn")
	public SettlementObligation7 getOriginalSettlementObligation() {
		return originalSettlementObligation;
	}

	public void setOriginalSettlementObligation(SettlementObligation7 originalSettlementObligation) {
		this.originalSettlementObligation = originalSettlementObligation;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:secl.009.03.03")
	static public class Document {
		@XmlElement(name = "BuyInConf", required = true)
		public BuyInConfirmationV03 messageBody;
	}
}