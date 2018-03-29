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
import com.tools20022.repository.msg.MessageHeader9;
import com.tools20022.repository.msg.ReservationQuery2;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The GetReservation message is sent by a member to the transaction
 * administrator.<br>
 * It is used to request information on the details of one or more reservation
 * facilities set by the member and managed by the transaction administrator.<br>
 * <b>Usage</b><br>
 * The member can request reservations information based on the following
 * elements:<br>
 * - identification of the system;<br>
 * - identification of the account;<br>
 * - status of the reservation (default and/or current);<br>
 * - type of reservation.<br>
 * This message will be replied to by a ReturnReservation message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetReservationV04#mmMessageHeader
 * GetReservationV04.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetReservationV04#mmReservationQueryDefinition
 * GetReservationV04.mmReservationQueryDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.GetReservationV04#mmSupplementaryData
 * GetReservationV04.mmSupplementaryData}</li>
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
 * xmlTag} = "GetRsvatn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.046.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GetReservationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe GetReservation message is sent by a member to the transaction administrator.\r\nIt is used to request information on the details of one or more reservation facilities set by the member and managed by the transaction administrator.\r\nUsage\r\nThe member can request reservations information based on the following elements:\r\n- identification of the system;\r\n- identification of the account;\r\n- status of the reservation (default and/or current);\r\n- type of reservation.\r\nThis message will be replied to by a ReturnReservation message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GetReservationV04", propOrder = {"messageHeader", "reservationQueryDefinition", "supplementaryData"})
public class GetReservationV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgHdr", required = true)
	protected MessageHeader9 messageHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MessageHeader9
	 * MessageHeader9}</li>
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
	public static final MMMessageBuildingBlock<GetReservationV04, MessageHeader9> mmMessageHeader = new MMMessageBuildingBlock<GetReservationV04, MessageHeader9>() {
		{
			xmlTag = "MsgHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageHeader";
			definition = "Common business identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageHeader9.mmObject();
		}

		@Override
		public MessageHeader9 getValue(GetReservationV04 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(GetReservationV04 obj, MessageHeader9 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "RsvatnQryDef")
	protected ReservationQuery2 reservationQueryDefinition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ReservationQuery2
	 * ReservationQuery2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsvatnQryDef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReservationQueryDefinition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of the reservation query."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<GetReservationV04, Optional<ReservationQuery2>> mmReservationQueryDefinition = new MMMessageBuildingBlock<GetReservationV04, Optional<ReservationQuery2>>() {
		{
			xmlTag = "RsvatnQryDef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReservationQueryDefinition";
			definition = "Definition of the reservation query.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ReservationQuery2.mmObject();
		}

		@Override
		public Optional<ReservationQuery2> getValue(GetReservationV04 obj) {
			return obj.getReservationQueryDefinition();
		}

		@Override
		public void setValue(GetReservationV04 obj, Optional<ReservationQuery2> value) {
			obj.setReservationQueryDefinition(value.orElse(null));
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
	public static final MMMessageBuildingBlock<GetReservationV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<GetReservationV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(GetReservationV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(GetReservationV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "GetReservationV04";
				definition = "Scope\r\nThe GetReservation message is sent by a member to the transaction administrator.\r\nIt is used to request information on the details of one or more reservation facilities set by the member and managed by the transaction administrator.\r\nUsage\r\nThe member can request reservations information based on the following elements:\r\n- identification of the system;\r\n- identification of the account;\r\n- status of the reservation (default and/or current);\r\n- type of reservation.\r\nThis message will be replied to by a ReturnReservation message.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "GetRsvatn";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.GetReservationV04.mmMessageHeader, com.tools20022.repository.area.camt.GetReservationV04.mmReservationQueryDefinition,
						com.tools20022.repository.area.camt.GetReservationV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "046";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return GetReservationV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader9 getMessageHeader() {
		return messageHeader;
	}

	public GetReservationV04 setMessageHeader(MessageHeader9 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public Optional<ReservationQuery2> getReservationQueryDefinition() {
		return reservationQueryDefinition == null ? Optional.empty() : Optional.of(reservationQueryDefinition);
	}

	public GetReservationV04 setReservationQueryDefinition(ReservationQuery2 reservationQueryDefinition) {
		this.reservationQueryDefinition = reservationQueryDefinition;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public GetReservationV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.046.001.04")
	static public class Document {
		@XmlElement(name = "GetRsvatn", required = true)
		public GetReservationV04 messageBody;
	}
}