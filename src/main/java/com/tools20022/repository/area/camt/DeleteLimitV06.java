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

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementLatestVersion;
import com.tools20022.repository.choice.LimitStructure1Choice;
import com.tools20022.repository.msg.MessageHeader1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The DeleteLimit message is sent by a member to the transaction administrator.<br>
 * It is used to request the deletion of one particular, several or all limits
 * set by the member and managed by the transaction administrator.<br>
 * The DeleteLimit message may delete several types of current limits (risk or
 * liquidity management limit), based on a multiple requests.<br>
 * <b>Usage</b><br>
 * The member will submit a DeleteLimit message identifying which limit(s) it
 * wants to delete (current limit risk/liquidity limit concepts have been
 * merged) based on following criteria:<br>
 * - type of limit(s) (current/default)<br>
 * - value of the limit(s) (default and/or current limit(s))<br>
 * - identification of the counterparty (bilateral limit)<br>
 * Based on the criteria received within the DeleteLimit message, the
 * transaction administrator will execute or reject the requested modifications.<br>
 * The transaction administrator may send a Receipt message as a reply to the
 * DeleteLimit request.<br>
 * To verify the outcome of the request, the member may submit a GetLimit
 * message with the appropriate search criteria.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DeleteLimitV06#mmMessageHeader
 * DeleteLimitV06.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DeleteLimitV06#mmLimitDetails
 * DeleteLimitV06.mmLimitDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.DeleteLimitV06#mmSupplementaryData
 * DeleteLimitV06.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance
 * _SR2018_MX_CashManagement_Maintenance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "DelLmt"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.012.001.06}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DeleteLimitV06"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe DeleteLimit message is sent by a member to the transaction administrator.\r\nIt is used to request the deletion of one particular, several or all limits set by the member and managed by the transaction administrator.\r\nThe DeleteLimit message may delete several types of current limits (risk or liquidity management limit), based on a multiple requests.\r\nUsage\r\nThe member will submit a DeleteLimit message identifying which limit(s) it wants to delete (current limit risk/liquidity limit concepts have been merged) based on following criteria:\r\n- type of limit(s) (current/default)\r\n- value of the limit(s) (default and/or current limit(s))\r\n- identification of the counterparty (bilateral limit)\r\nBased on the criteria received within the DeleteLimit message, the transaction administrator will execute or reject the requested modifications.\r\nThe transaction administrator may send a Receipt message as a reply to the DeleteLimit request.\r\nTo verify the outcome of the request, the member may submit a GetLimit message with the appropriate search criteria."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DeleteLimitV06", propOrder = {"messageHeader", "limitDetails", "supplementaryData"})
public class DeleteLimitV06 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgHdr", required = true)
	protected MessageHeader1 messageHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MessageHeader1
	 * MessageHeader1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Common business identification for the message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMessageHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "MsgHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageHeader";
			definition = "Common business identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageHeader1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DeleteLimitV06.class.getMethod("getMessageHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "LmtDtls", required = true)
	protected LimitStructure1Choice limitDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.LimitStructure1Choice
	 * LimitStructure1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies one particular limit set by the member and managed by the transaction administrator."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmLimitDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "LmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitDetails";
			definition = "Identifies one particular limit set by the member and managed by the transaction administrator.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> LimitStructure1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return DeleteLimitV06.class.getMethod("getLimitDetails", new Class[]{});
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
				return DeleteLimitV06.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DeleteLimitV06";
				definition = "Scope\r\nThe DeleteLimit message is sent by a member to the transaction administrator.\r\nIt is used to request the deletion of one particular, several or all limits set by the member and managed by the transaction administrator.\r\nThe DeleteLimit message may delete several types of current limits (risk or liquidity management limit), based on a multiple requests.\r\nUsage\r\nThe member will submit a DeleteLimit message identifying which limit(s) it wants to delete (current limit risk/liquidity limit concepts have been merged) based on following criteria:\r\n- type of limit(s) (current/default)\r\n- value of the limit(s) (default and/or current limit(s))\r\n- identification of the counterparty (bilateral limit)\r\nBased on the criteria received within the DeleteLimit message, the transaction administrator will execute or reject the requested modifications.\r\nThe transaction administrator may send a Receipt message as a reply to the DeleteLimit request.\r\nTo verify the outcome of the request, the member may submit a GetLimit message with the appropriate search criteria.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "DelLmt";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.DeleteLimitV06.mmMessageHeader, com.tools20022.repository.area.camt.DeleteLimitV06.mmLimitDetails,
						com.tools20022.repository.area.camt.DeleteLimitV06.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "012";
						version = "06";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return DeleteLimitV06.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader1 getMessageHeader() {
		return messageHeader;
	}

	public DeleteLimitV06 setMessageHeader(MessageHeader1 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public LimitStructure1Choice getLimitDetails() {
		return limitDetails;
	}

	public DeleteLimitV06 setLimitDetails(LimitStructure1Choice limitDetails) {
		this.limitDetails = Objects.requireNonNull(limitDetails);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public DeleteLimitV06 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.012.001.06")
	static public class Document {
		@XmlElement(name = "DelLmt", required = true)
		public DeleteLimitV06 messageBody;
	}
}