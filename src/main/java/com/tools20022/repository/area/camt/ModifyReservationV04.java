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
import com.tools20022.repository.choice.CurrentOrDefaultReservation1Choice;
import com.tools20022.repository.msg.MessageHeader1;
import com.tools20022.repository.msg.Reservation4;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset._SR2018_MX_CashManagement_Maintenance;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * Scope The ModifyReservation message is used to request modifications in the
 * details of one particular reservation set by the member and managed by the
 * transaction administrator. Usage After the receipt of a ModifyReservation
 * message the transaction administrator checks whether the amount of liquidity
 * on the member account is sufficient to set the reservation. If there is
 * enough liquidity available, the requested amount will be reserved. In case
 * the requested amount exceeds the available liquidity, only the available
 * liquidity will be reserved. The difference will not be blocked at a later
 * point, even if the account balance of the member reaches the level of the
 * initial reservation request. The reservation can be effected directly by the
 * member, who has the possibility to: - reset the reserved liquidity to zero -
 * change the reservation amount during the day with immediate effect - input a
 * default reservation amount for the following day(s); valid until a new
 * reservation amount is requested After the receipt of a ModifyReservation
 * message the transaction administrator checks whether the amount of liquidity
 * on the member account is sufficient to set the reservation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyReservationV04#mmMessageHeader
 * ModifyReservationV04.mmMessageHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyReservationV04#mmReservationIdentification
 * ModifyReservationV04.mmReservationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyReservationV04#mmNewReservationValueSet
 * ModifyReservationV04.mmNewReservationValueSet}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ModifyReservationV04#mmSupplementaryData
 * ModifyReservationV04.mmSupplementaryData}</li>
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
 * xmlTag} = "ModfyRsvatn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementLatestVersion
 * CashManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.048.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ModifyReservationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nThe ModifyReservation message is used to request modifications in the details of one particular reservation set by the member and managed by the transaction administrator.\nUsage\nAfter the receipt of a ModifyReservation message the transaction administrator checks whether the amount of liquidity on the member account is sufficient to set the reservation.\nIf there is enough liquidity available, the requested amount will be reserved. In case the requested amount exceeds the available liquidity, only the available liquidity will be reserved. The difference will not be blocked at a later point, even if the account balance of the member reaches the level of the initial reservation request.\nThe reservation can be effected directly by the member, who has the possibility to: \n- reset the reserved liquidity to zero\n- change the reservation amount during the day with immediate effect\n- input a default reservation amount for the following day(s); valid until a new reservation amount is requested\nAfter the receipt of a ModifyReservation message the transaction administrator checks whether the amount of liquidity on the member account is sufficient to set the reservation."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ModifyReservationV04", propOrder = {"messageHeader", "reservationIdentification", "newReservationValueSet", "supplementaryData"})
public class ModifyReservationV04 {

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
	public static final MMMessageBuildingBlock<ModifyReservationV04, MessageHeader1> mmMessageHeader = new MMMessageBuildingBlock<ModifyReservationV04, MessageHeader1>() {
		{
			xmlTag = "MsgHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageHeader";
			definition = "Common business identification for the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageHeader1.mmObject();
		}

		@Override
		public MessageHeader1 getValue(ModifyReservationV04 obj) {
			return obj.getMessageHeader();
		}

		@Override
		public void setValue(ModifyReservationV04 obj, MessageHeader1 value) {
			obj.setMessageHeader(value);
		}
	};
	@XmlElement(name = "RsvatnId", required = true)
	protected CurrentOrDefaultReservation1Choice reservationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CurrentOrDefaultReservation1Choice
	 * CurrentOrDefaultReservation1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsvatnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReservationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the default reservation."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ModifyReservationV04, CurrentOrDefaultReservation1Choice> mmReservationIdentification = new MMMessageBuildingBlock<ModifyReservationV04, CurrentOrDefaultReservation1Choice>() {
		{
			xmlTag = "RsvatnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReservationIdentification";
			definition = "Identification of the default reservation.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CurrentOrDefaultReservation1Choice.mmObject();
		}

		@Override
		public CurrentOrDefaultReservation1Choice getValue(ModifyReservationV04 obj) {
			return obj.getReservationIdentification();
		}

		@Override
		public void setValue(ModifyReservationV04 obj, CurrentOrDefaultReservation1Choice value) {
			obj.setReservationIdentification(value);
		}
	};
	@XmlElement(name = "NewRsvatnValSet", required = true)
	protected Reservation4 newReservationValueSet;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Reservation4
	 * Reservation4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewRsvatnValSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewReservationValueSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New reservation values."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ModifyReservationV04, Reservation4> mmNewReservationValueSet = new MMMessageBuildingBlock<ModifyReservationV04, Reservation4>() {
		{
			xmlTag = "NewRsvatnValSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewReservationValueSet";
			definition = "New reservation values.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Reservation4.mmObject();
		}

		@Override
		public Reservation4 getValue(ModifyReservationV04 obj) {
			return obj.getNewReservationValueSet();
		}

		@Override
		public void setValue(ModifyReservationV04 obj, Reservation4 value) {
			obj.setNewReservationValueSet(value);
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
	public static final MMMessageBuildingBlock<ModifyReservationV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ModifyReservationV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ModifyReservationV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ModifyReservationV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ModifyReservationV04";
				definition = "Scope\nThe ModifyReservation message is used to request modifications in the details of one particular reservation set by the member and managed by the transaction administrator.\nUsage\nAfter the receipt of a ModifyReservation message the transaction administrator checks whether the amount of liquidity on the member account is sufficient to set the reservation.\nIf there is enough liquidity available, the requested amount will be reserved. In case the requested amount exceeds the available liquidity, only the available liquidity will be reserved. The difference will not be blocked at a later point, even if the account balance of the member reaches the level of the initial reservation request.\nThe reservation can be effected directly by the member, who has the possibility to: \n- reset the reserved liquidity to zero\n- change the reservation amount during the day with immediate effect\n- input a default reservation amount for the following day(s); valid until a new reservation amount is requested\nAfter the receipt of a ModifyReservation message the transaction administrator checks whether the amount of liquidity on the member account is sufficient to set the reservation.";
				messageSet_lazy = () -> Arrays.asList(_SR2018_MX_CashManagement_Maintenance.mmObject());
				rootElement = "Document";
				xmlTag = "ModfyRsvatn";
				businessArea_lazy = () -> CashManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ModifyReservationV04.mmMessageHeader, com.tools20022.repository.area.camt.ModifyReservationV04.mmReservationIdentification,
						com.tools20022.repository.area.camt.ModifyReservationV04.mmNewReservationValueSet, com.tools20022.repository.area.camt.ModifyReservationV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "048";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ModifyReservationV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageHeader1 getMessageHeader() {
		return messageHeader;
	}

	public ModifyReservationV04 setMessageHeader(MessageHeader1 messageHeader) {
		this.messageHeader = Objects.requireNonNull(messageHeader);
		return this;
	}

	public CurrentOrDefaultReservation1Choice getReservationIdentification() {
		return reservationIdentification;
	}

	public ModifyReservationV04 setReservationIdentification(CurrentOrDefaultReservation1Choice reservationIdentification) {
		this.reservationIdentification = Objects.requireNonNull(reservationIdentification);
		return this;
	}

	public Reservation4 getNewReservationValueSet() {
		return newReservationValueSet;
	}

	public ModifyReservationV04 setNewReservationValueSet(Reservation4 newReservationValueSet) {
		this.newReservationValueSet = Objects.requireNonNull(newReservationValueSet);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ModifyReservationV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.048.001.04")
	static public class Document {
		@XmlElement(name = "ModfyRsvatn", required = true)
		public ModifyReservationV04 messageBody;
	}
}